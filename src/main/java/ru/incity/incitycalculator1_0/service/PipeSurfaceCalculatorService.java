package ru.incity.incitycalculator1_0.service;

import ru.incity.incitycalculator1_0.model.PipeSurfaceCalculator;

import java.util.List;

public interface PipeSurfaceCalculatorService {

    public void savePipeSurfaceCalculator(PipeSurfaceCalculator pipeSurfaceCalculator);

    public PipeSurfaceCalculator getPipeSurfaceCalculatorById(int id);

    public void deletePipeSurfaceCalculator(int id);

    public List<PipeSurfaceCalculator> getAllPipeSurfaceCalculators();

    public double sumOfAllPipeSurfaceCalculators ();
}
