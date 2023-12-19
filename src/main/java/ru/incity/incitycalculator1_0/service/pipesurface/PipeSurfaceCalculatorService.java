package ru.incity.incitycalculator1_0.service.pipesurface;

import ru.incity.incitycalculator1_0.model.pipesurface.PipeSurfaceCalculator;

import java.util.List;

public interface PipeSurfaceCalculatorService {

    void savePipeSurfaceCalculator(PipeSurfaceCalculator pipeSurfaceCalculator);

    PipeSurfaceCalculator getPipeSurfaceCalculatorById(int id);

    void deletePipeSurfaceCalculator(int id);

    List<PipeSurfaceCalculator> getAllPipeSurfaceCalculators();

    double sumOfAllPipeSurfaceCalculators ();
}
