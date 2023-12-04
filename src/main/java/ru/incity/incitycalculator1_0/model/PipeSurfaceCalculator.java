package ru.incity.incitycalculator1_0.model;

public class PipeSurfaceCalculator {

    private double length;
    private PipeDiameterEnum pipeDiameterEnum;
    private static final double pi = 3.14;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public PipeDiameterEnum getPipeDiameterEnum() {
        return pipeDiameterEnum;
    }

    public void setPipeDiameterEnum(PipeDiameterEnum pipeDiameterEnum) {
        this.pipeDiameterEnum = pipeDiameterEnum;
    }

    public PipeSurfaceCalculator(PipeDiameterEnum pipeDiameterEnum) {
        this.pipeDiameterEnum = pipeDiameterEnum;
    }

    public PipeSurfaceCalculator() {
    }

    public PipeSurfaceCalculator (PipeDiameterEnum pipeDiameterEnum, double length) {
        this.length = length;
        this.pipeDiameterEnum = pipeDiameterEnum;
    }

    public double calculatePipeSurface () {
        double result = pipeDiameterEnum.getDiameterWithTwoWalls()*pi*length;
        return Math.round(result*100.0)/100.0;
    }

}
