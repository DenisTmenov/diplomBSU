package com.denis.diplom;


import com.denis.diplom.company.Airline;
import com.denis.diplom.comparators.aircraft.AircraftEnum;
import com.denis.diplom.factory.DataManager;
import com.denis.diplom.queries.AircraftQuery;
import com.denis.diplom.utils.*;

public class Main {
    //        10) Авиакомпания (Airline).
//        Определить иерархию самолетов.
//        Создать авиакомпанию.
//        Посчитать общую вместимость и грузоподъемность.
//        Провести сортировку самолетов компании по дальности полета.
//        Найти самолет в компании, соответствующий заданному диапазону параметров.
    private static DataManager dm = new DataManager();

    public static void main(String[] args) {

        Airline bestCompany = new Airline("Best Company");
        _fillCompanyAircrafts(bestCompany);

        Printer.showAircraftsAirline(bestCompany);

        Printer.showFullPassengersCountAirline(bestCompany);

        Printer.showFullCargoAirline(bestCompany);

        Printer.showEachAircraftMaxFlightRange(bestCompany);
        bestCompany.sortAircrafrs(AircraftEnum.MAX_FLIGHT_RANGE);
        Printer.showEachAircraftMaxFlightRange(bestCompany);

        AircraftQuery query = new AircraftQuery();
        query.setCruiseSpeed(800);
        query.setCargoCapacity(20);
        query.setMaxFlightRange(10000);

        AircraftList aircrafts = Searcher.searchAircrafts(query, bestCompany);

        Printer.showAircrafts(aircrafts);

        IOWorker.writeAircraftsToFile(aircrafts, "test.txt");

        Printer.showAircrafts(IOWorker.readAircraftsFromFile("test.txt"));

    }

    private static void _fillCompanyAircrafts(Airline company) {
        for (int i = 0; i < 10; i++) {
            switch (1 + Utils.getRand().nextInt(2)) {
                case 1:
                    company.addAircraft(dm.createRandomCargoAircraft());
                    break;
                case 2:
                    company.addAircraft(dm.createRandomPassengerAircraft());
                    break;
            }
        }
    }


}
