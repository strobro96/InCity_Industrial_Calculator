package ru.incity.incitycalculator1_0.dao.pipesurface;

import ru.incity.incitycalculator1_0.model.pipesurface.PipeSurfaceCalculator;

import java.util.List;

public interface PipeSurfaceCalculatorDao {

    void savePipeSurfaceCalculator(PipeSurfaceCalculator pipeSurfaceCalculator);

    //Метод для получения трубы по индексу
    PipeSurfaceCalculator getPipeSurfaceCalculatorById (int id);

    //Метод для удаления трубы
    void deletePipeSurfaceCalculator(int id);

    //Метод для получения списка всех труб
    List<PipeSurfaceCalculator> getAllPipeSurfaceCalculators();

    //Возвращает сумму
    double sumOfAllPipeSurfaceCalculators ();

}
