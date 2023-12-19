package ru.incity.incitycalculator1_0.service.tonstometers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.incity.incitycalculator1_0.dao.tonstometers.TonsToMetersConverterDao;
import ru.incity.incitycalculator1_0.model.tonstometers.TonsToMetersConverter;

import java.util.List;
import java.util.Map;

@Service
public class TonsToMetersConverterServiceImpl implements TonsToMetersConverterService {

    private final TonsToMetersConverterDao tonsToMetersConverterDao;

    @Autowired
    public TonsToMetersConverterServiceImpl(TonsToMetersConverterDao tonsToMetersConverterDao) {
        this.tonsToMetersConverterDao = tonsToMetersConverterDao;
    }

    @Override
    public void saveTonsToMetersConverter(TonsToMetersConverter tonsToMetersConverter) {
        tonsToMetersConverterDao.saveTonsToMetersConverter(tonsToMetersConverter);
    }

    @Override
    public TonsToMetersConverter getTonsToMetersConverterById(int id) {
        return tonsToMetersConverterDao.getTonsToMetersConverterById(id);
    }

    @Override
    public void deleteTonsToMetersConverter(int id) {
        tonsToMetersConverterDao.deleteTonsToMetersConverter(id);
    }

    @Override
    public List<TonsToMetersConverter> getAllTonsToMetersConverters() {
        return tonsToMetersConverterDao.getAllTonsToMetersConverters();
    }

    @Override
    public Map<String, Double> sumOfAllTonsToMetersConverters() {
        return tonsToMetersConverterDao.sumOfAllTonsToMetersConverters();
    }

    @Override
    public double getOnlySumOfAllTonsToMetersConverters() {
        return tonsToMetersConverterDao.getOnlySumOfAllTonsToMetersConverters();
    }
}
