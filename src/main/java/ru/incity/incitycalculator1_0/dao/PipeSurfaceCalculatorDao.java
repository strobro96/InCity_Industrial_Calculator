package ru.incity.incitycalculator1_0.dao;

import ru.incity.incitycalculator1_0.model.PipeSurfaceCalculator;

import java.util.List;

public interface PipeSurfaceCalculatorDao {

    public void savePipeSurfaceCalculator(PipeSurfaceCalculator pipeSurfaceCalculator);

    //Метод для получения трубы по индексу
    public PipeSurfaceCalculator getPipeSurfaceCalculatorById (int id);

    //Метод для удаления трубы
    public void deletePipeSurfaceCalculator(int id);

    //Метод для получения списка всех труб
    public List<PipeSurfaceCalculator> getAllPipeSurfaceCalculators();

    //Возвращает сумму
    public double sumOfAllPipeSurfaceCalculators ();

}
