package ru.incity.incitycalculator1_0.dao.pipesurface;

import org.springframework.stereotype.Repository;
import ru.incity.incitycalculator1_0.model.pipesurface.PipeSurfaceCalculator;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PipeSurfaceCalculatorDaoImpl implements PipeSurfaceCalculatorDao {

    private final List<PipeSurfaceCalculator> list = new ArrayList<>();

    private double sum;

    @Override
    public void savePipeSurfaceCalculator(PipeSurfaceCalculator pipeSurfaceCalculator) {
        double result = pipeSurfaceCalculator.calculatePipeSurface();
        sum += Math.round(result*100.0)/100.0;
        list.add(pipeSurfaceCalculator);
    }

    @Override
    public PipeSurfaceCalculator getPipeSurfaceCalculatorById(int id) {
        return list.get(id);
    }

    @Override
    public void deletePipeSurfaceCalculator(int id) {

        double result = list.get(id).calculatePipeSurface();
        sum = sum - Math.round(result*100.0)/100.0;

        list.remove(id);
    }

    @Override
    public List<PipeSurfaceCalculator> getAllPipeSurfaceCalculators() {
        return list;
    }

    @Override
    public double sumOfAllPipeSurfaceCalculators() {
        return Math.round(sum*100.0)/100.0;
    }
}
