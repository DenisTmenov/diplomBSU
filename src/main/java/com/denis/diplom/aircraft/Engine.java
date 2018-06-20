package com.denis.diplom.aircraft;

import com.denis.diplom.utils.Utils;

import java.io.Serializable;
import java.util.Objects;

public class Engine implements Serializable, Comparable<Engine> {

    private static final long serialVersionUID = 8203265214968527756L;
    private String modelName;
    private Integer maxEngineThrust; // тяга двигателя

    public Engine() {
        modelName = "CFM" + Utils.getRand().nextInt(1000) + "-"
                + Utils.getRand().nextInt(1000);
        maxEngineThrust = 10000 + Utils.getRand().nextInt(90000);
    }

    public Engine(String modelName, Integer maxEngineThrust) {
        this.modelName = modelName;
        this.maxEngineThrust = maxEngineThrust;
    }

    //<editor-fold desc="get & set">
    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public Integer getMaxEngineThrust() {
        return maxEngineThrust;
    }

    public void setMaxEngineThrust(Integer maxEngineThrust) throws IllegalArgumentException {
        if (maxEngineThrust > 0) {
            this.maxEngineThrust = maxEngineThrust;
        } else {
            throw new IllegalArgumentException(
                    "maxEngineThrust can\'t be less than zero.");
        }

    }
    //</editor-fold>


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Engine engine = (Engine) o;
        return maxEngineThrust.equals(engine.maxEngineThrust)
                && Objects.equals(modelName, engine.modelName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(modelName, maxEngineThrust);
    }

    @Override
    public String toString() {
        return "Engine{" +
                "modelName='" + modelName + '\'' +
                ", maxEngineThrust=" + maxEngineThrust +
                '}';
    }

    @Override
    public int compareTo(Engine o) {
        return maxEngineThrust > o.maxEngineThrust ? 1 : maxEngineThrust.equals(o.maxEngineThrust) ? 0 : 1;
    }
}
