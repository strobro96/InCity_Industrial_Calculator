package ru.incity.incitycalculator1_0.service.tonstometers;

import ru.incity.incitycalculator1_0.model.tonstometers.TonsToMetersConverter;

import java.util.List;
import java.util.Map;

public interface TonsToMetersConverterService {

    void saveTonsToMetersConverter(TonsToMetersConverter tonsToMetersConverter);

    TonsToMetersConverter getTonsToMetersConverterById (int id);

    void deleteTonsToMetersConverter(int id);

    List<TonsToMetersConverter> getAllTonsToMetersConverters();

    Map<String, Double> sumOfAllTonsToMetersConverters ();

    double getOnlySumOfAllTonsToMetersConverters();

}
