package ru.incity.incitycalculator1_0.dao.meterstotons;

import ru.incity.incitycalculator1_0.model.meterstotons.MetersToTonsConverter;

import java.util.List;
import java.util.Map;

public interface MetersToTonsConverterDao {

    void saveMetersToTonsConverter(MetersToTonsConverter metersToTonsConverter);

    MetersToTonsConverter getMetersToTonsConverterById (int id);

    void deleteMetersToTonsConverter(int id);

    List<MetersToTonsConverter> getAllMetersToTonsConverters();

    Map<String, Double> sumOfAllMetersToTonsConverters ();

    double getOnlySumOfAllMetersToTonsConverters();

}
