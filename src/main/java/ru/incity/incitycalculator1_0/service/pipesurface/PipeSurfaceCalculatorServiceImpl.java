package ru.incity.incitycalculator1_0.service.pipesurface;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.incity.incitycalculator1_0.dao.pipesurface.PipeSurfaceCalculatorDao;
import ru.incity.incitycalculator1_0.model.pipesurface.PipeSurfaceCalculator;

import java.util.List;

@Service
public class PipeSurfaceCalculatorServiceImpl implements PipeSurfaceCalculatorService {

    private final PipeSurfaceCalculatorDao pipeSurfaceCalculatorDao;

    @Autowired
    public PipeSurfaceCalculatorServiceImpl(PipeSurfaceCalculatorDao pipeSurfaceCalculatorDao) {
        this.pipeSurfaceCalculatorDao = pipeSurfaceCalculatorDao;
    }

    @Override
    public void savePipeSurfaceCalculator(PipeSurfaceCalculator pipeSurfaceCalculator) {
        pipeSurfaceCalculatorDao.savePipeSurfaceCalculator(pipeSurfaceCalculator);
    }

    @Override
    public PipeSurfaceCalculator getPipeSurfaceCalculatorById(int id) {
        return pipeSurfaceCalculatorDao.getPipeSurfaceCalculatorById(id);
    }

    @Override
    public void deletePipeSurfaceCalculator(int id) {
        pipeSurfaceCalculatorDao.deletePipeSurfaceCalculator(id);
    }

    @Override
    public List<PipeSurfaceCalculator> getAllPipeSurfaceCalculators() {
        return pipeSurfaceCalculatorDao.getAllPipeSurfaceCalculators();
    }

    @Override
    public double sumOfAllPipeSurfaceCalculators() {
        return pipeSurfaceCalculatorDao.sumOfAllPipeSurfaceCalculators();
    }
}
