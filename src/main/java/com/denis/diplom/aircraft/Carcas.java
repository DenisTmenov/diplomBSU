package com.denis.diplom.aircraft;

import com.denis.diplom.utils.Utils;

import java.io.Serializable;
import java.util.Objects;

public class Carcas implements Serializable, Comparable<Carcas> {
    private static final long serialVersionUID = 146522059781657552L;

    private Double wingSpan; // размах крыла (м)
    private Double fullLength; // полная длина (м)
    private Double tailHeight; // высота хвостовой части (м)
    private Double internalWidthSalon; // внутренняя ширина салона (м)

    public Carcas() {
        wingSpan = 20.0 + Utils.getRand().nextDouble() * 20;
        fullLength = 20.0 + Utils.getRand().nextDouble() * 20;
        tailHeight = 20.0 + Utils.getRand().nextDouble() * 20;
        internalWidthSalon = 20.0 + Utils.getRand().nextDouble() * 20;
    }

    public Carcas(Double wingSpan, Double fullLength, Double tailHeight, Double internalWidthSalon) {
        this.wingSpan = wingSpan;
        this.fullLength = fullLength;
        this.tailHeight = tailHeight;
        this.internalWidthSalon = internalWidthSalon;
    }

    //<editor-fold desc="get & set">
    public Double getWingSpan() {
        return wingSpan;
    }

    public void setWingSpan(Double wingSpan) {
        this.wingSpan = wingSpan;
    }

    public Double getFullLength() {
        return fullLength;
    }

    public void setFullLength(Double fullLength) {
        this.fullLength = fullLength;
    }

    public Double getTailHeight() {
        return tailHeight;
    }

    public void setTailHeight(Double tailHeight) {
        this.tailHeight = tailHeight;
    }

    public Double getInternalWidthSalon() {
        return internalWidthSalon;
    }

    public void setInternalWidthSalon(Double internalWidthSalon) {
        this.internalWidthSalon = internalWidthSalon;
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
        Carcas carcas = (Carcas) o;
        return Objects.equals(wingSpan, carcas.wingSpan)
                && Objects.equals(fullLength, carcas.fullLength)
                && Objects.equals(tailHeight, carcas.tailHeight)
                && Objects.equals(internalWidthSalon, carcas.internalWidthSalon);
    }

    @Override
    public int hashCode() {
        return Objects.hash(wingSpan, fullLength, tailHeight, internalWidthSalon);
    }

    @Override
    public String toString() {
        return "Carcas{" +
                "wingSpan=" + wingSpan +
                ", fullLength=" + fullLength +
                ", tailHeight=" + tailHeight +
                ", internalWidthSalon=" + internalWidthSalon +
                '}';
    }

    @Override
    public int compareTo(Carcas o) {
        double entity = wingSpan + fullLength + tailHeight + internalWidthSalon;
        double object = o.wingSpan + o.fullLength + o.tailHeight + o.internalWidthSalon;
        return entity > object ? 1 : entity == object ? 0 : 1;
    }
}
