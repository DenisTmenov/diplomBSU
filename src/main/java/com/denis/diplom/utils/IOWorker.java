package com.denis.diplom.utils;

import com.denis.diplom.aircraft.*;
import com.denis.diplom.exceptions.EmptyObjectException;
import com.denis.diplom.exceptions.IOReadException;
import com.denis.diplom.exceptions.IOWriteException;
import com.denis.diplom.exceptions.ReadFileException;

import java.io.*;

public class IOWorker {
    public static void writeToBinary(Object object, String fileName) throws IOWriteException {
        try (ObjectOutputStream stream = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(fileName)))) {
            stream.writeObject(object);
        } catch (IOException e) {
            throw new IOWriteException("Writable error", e);
        }
    }


    public static <E extends Aircraft> void writeAircraftToFile(E aircraft, String fileName) throws IOWriteException {
        try (BufferedWriter stream = new BufferedWriter(new FileWriter(fileName))) {
            if (aircraft != null) {
                if (!fileName.isEmpty()) {
                    _writeAircraft(aircraft, stream);
                } else {
                    throw new EmptyObjectException("File name is empty");
                }
            } else {
                throw new EmptyObjectException("Aircraft is empty");
            }

        } catch (IOException e) {
            throw new IOWriteException("Writable error", e);
        }
    }

    public static void writeAircraftsToFile(AircraftList aircrafts, String fileName) throws IOWriteException {
        if (aircrafts != null && aircrafts.size() > 0) {
            if (!fileName.isEmpty()) {
                try (BufferedWriter stream = new BufferedWriter(new FileWriter(fileName))) {
                    aircrafts.forEach(aircraft -> {
                        try {
                            _writeAircraft(aircraft, stream);
                        } catch (IOException e) {
                            throw new IOWriteException("Writable error", e);
                        }
                    });
                } catch (IOException e) {
                    throw new IOWriteException("Writable error", e);
                }
            } else {
                throw new EmptyObjectException("File name is empty");
            }
        } else {
            throw new EmptyObjectException("Aircrafts is empty");
        }
    }

    public static Object readFromBinary(String fileName) throws IOReadException {
        try (ObjectInputStream stream = new ObjectInputStream(new BufferedInputStream(new FileInputStream(fileName)))) {
            return stream.readObject();
        } catch (ClassNotFoundException e) {
            throw new ReadFileException("File " + fileName + " not found", e);
        } catch (IOException e) {
            throw new IOReadException("Readable error", e);
        }
    }

    public static Aircraft readAircraftFromFile(String fileName) throws IOReadException {
        Aircraft inner = null;
        try (BufferedReader stream = new BufferedReader(new FileReader(fileName))) {
            if (!fileName.isEmpty()) {
                inner = _readAircraft(stream);
            }
        } catch (FileNotFoundException e) {
            throw new ReadFileException("File " + fileName + " not found", e);
        } catch (IOException e) {
            throw new IOReadException("Readable error", e);
        }
        return inner;
    }

    public static AircraftList readAircraftsFromFile(String fileName) throws IOReadException {
        AircraftList result = new AircraftList();
        try (BufferedReader stream = new BufferedReader(new FileReader(fileName))) {

            if (!fileName.isEmpty()) {
                Aircraft inner;
                do {
                    inner = _readAircraft(stream);
                    if (inner != null) {
                        result.add(inner);
                    }
                } while (inner != null);
            }
        } catch (FileNotFoundException e) {
            throw new ReadFileException("File " + fileName + " not found", e);
        } catch (IOException e) {
            throw new IOReadException("Readable error", e);
        }
        return result;
    }

    private static Aircraft _readAircraft(BufferedReader stream) throws IOException {
        Aircraft inner = null;
        String type;
        do {
            type = stream.readLine();
        } while (type == null);
        if (type.equals("PassengerAircraft")) {
            inner = new PassengerAircraft();
            ((PassengerAircraft) inner).setBaggage(Integer.parseInt(stream.readLine()));
        }
        if (type.equals("CargoAircraft")) {
            inner = new CargoAircraft();
            ((CargoAircraft) inner).setCargo(Integer.parseInt(stream.readLine()));
        }
        if (inner != null) {
            inner.setModelName(stream.readLine());
            inner.setCargoCapacity(Integer.parseInt(stream.readLine()));
            inner.setMaxFlightRange(Integer.parseInt(stream.readLine()));
            inner.setPassengersCount(Integer.parseInt(stream.readLine()));
            inner.setCruiseSpeed(Integer.parseInt(stream.readLine()));
            inner.setMaxFuelCapacity(Integer.parseInt(stream.readLine()));
            inner.setMaxTakeoffWeight(Integer.parseInt(stream.readLine()));
            stream.readLine();
            Carcas carcas = new Carcas();
            inner.setDimensions(carcas);
            carcas.setFullLength(Double.parseDouble(stream.readLine()));
            carcas.setInternalWidthSalon(Double.parseDouble(stream.readLine()));
            carcas.setTailHeight(Double.parseDouble(stream.readLine()));
            carcas.setWingSpan(Double.parseDouble(stream.readLine()));
            stream.readLine();
            Engine engine = new Engine();
            inner.setEngine(engine);
            engine.setModelName(stream.readLine());
            engine.setMaxEngineThrust(Integer.parseInt(stream.readLine()));
            stream.readLine();
        }
        return inner;
    }

    private static <E extends Aircraft> boolean _writeAircraft(E aircraft, BufferedWriter stream) throws IOException {
        boolean flag = false;
        Aircraft inner = null;
        if (aircraft instanceof PassengerAircraft) {
            inner = aircraft;
            stream.write("PassengerAircraft");
            stream.newLine();
            stream.write(((PassengerAircraft) inner).getBaggage().toString());
            stream.newLine();
        }
        if (aircraft instanceof CargoAircraft) {
            inner = aircraft;
            stream.write("CargoAircraft");
            stream.newLine();
            stream.write(((CargoAircraft) inner).getCargo().toString());
            stream.newLine();
        }
        if (inner != null) {
            stream.write(inner.getModelName());
            stream.newLine();
            stream.write(inner.getCargoCapacity().toString());
            stream.newLine();
            stream.write(inner.getMaxFlightRange().toString());
            stream.newLine();
            stream.write(inner.getPassengersCount().toString());
            stream.newLine();
            stream.write(inner.getCruiseSpeed().toString());
            stream.newLine();
            stream.write(inner.getMaxFuelCapacity().toString());
            stream.newLine();
            stream.write(inner.getMaxTakeoffWeight().toString());
            stream.newLine();
            stream.write("Dimensions");
            stream.newLine();
            stream.write(inner.getDimensions().getFullLength().toString());
            stream.newLine();
            stream.write(inner.getDimensions().getInternalWidthSalon().toString());
            stream.newLine();
            stream.write(inner.getDimensions().getTailHeight().toString());
            stream.newLine();
            stream.write(inner.getDimensions().getWingSpan().toString());
            stream.newLine();
            stream.write("Engine");
            stream.newLine();
            stream.write(inner.getEngine().getModelName());
            stream.newLine();
            stream.write(inner.getEngine().getMaxEngineThrust().toString());
            stream.newLine();
            stream.newLine();
            flag = true;
        }
        return flag;
    }
}