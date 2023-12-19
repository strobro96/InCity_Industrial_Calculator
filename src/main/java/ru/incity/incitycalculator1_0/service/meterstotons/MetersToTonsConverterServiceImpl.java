package ru.incity.incitycalculator1_0.service.meterstotons;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.incity.incitycalculator1_0.dao.meterstotons.MetersToTonsConverterDao;
import ru.incity.incitycalculator1_0.model.meterstotons.MetersToTonsConverter;

import java.util.List;
import java.util.Map;

@Service
public class MetersToTonsConverterServiceImpl implements MetersToTonsConverterService {

    private final MetersToTonsConverterDao metersToTonsConverterDao;

    @Autowired
    public MetersToTonsConverterServiceImpl(MetersToTonsConverterDao metersToTonsConverterDao) {
        this.metersToTonsConverterDao = metersToTonsConverterDao;
    }

    @Override
    public void saveMetersToTonsConverter(MetersToTonsConverter metersToTonsConverter) {
        metersToTonsConverterDao.saveMetersToTonsConverter(metersToTonsConverter);
    }

    @Override
    public MetersToTonsConverter getMetersToTonsConverterById(int id) {
        return metersToTonsConverterDao.getMetersToTonsConverterById(id);
    }

    @Override
    public void deleteMetersToTonsConverter(int id) {
metersToTonsConverterDao.deleteMetersToTonsConverter(id);
    }

    @Override
    public List<MetersToTonsConverter> getAllMetersToTonsConverters() {
        return metersToTonsConverterDao.getAllMetersToTonsConverters();
    }

    @Override
    public Map<String, Double> sumOfAllMetersToTonsConverters() {
        return metersToTonsConverterDao.sumOfAllMetersToTonsConverters();
    }

    @Override
    public double getOnlySumOfAllMetersToTonsConverters() {
        return metersToTonsConverterDao.getOnlySumOfAllMetersToTonsConverters();
    }
}
