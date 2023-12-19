package ru.incity.incitycalculator1_0.dao.tonstometers;

import ru.incity.incitycalculator1_0.model.meterstotons.MetersToTonsConverter;
import ru.incity.incitycalculator1_0.model.tonstometers.TonsToMetersConverter;

import java.util.List;
import java.util.Map;

public interface TonsToMetersConverterDao {

    void saveTonsToMetersConverter(TonsToMetersConverter tonsToMetersConverter);

    TonsToMetersConverter getTonsToMetersConverterById (int id);

    void deleteTonsToMetersConverter(int id);

    List<TonsToMetersConverter> getAllTonsToMetersConverters();

    Map<String, Double> sumOfAllTonsToMetersConverters ();

    double getOnlySumOfAllTonsToMetersConverters();

}
