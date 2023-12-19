package ru.incity.incitycalculator1_0.service.meterstotons;

import ru.incity.incitycalculator1_0.model.meterstotons.MetersToTonsConverter;

import java.util.List;
import java.util.Map;

public interface MetersToTonsConverterService {

    void saveMetersToTonsConverter(MetersToTonsConverter metersToTonsConverter);

    MetersToTonsConverter getMetersToTonsConverterById (int id);

    void deleteMetersToTonsConverter(int id);

    List<MetersToTonsConverter> getAllMetersToTonsConverters();

    Map<String, Double> sumOfAllMetersToTonsConverters ();

    double getOnlySumOfAllMetersToTonsConverters();
}
