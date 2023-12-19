package ru.incity.incitycalculator1_0.dao.tonstometers;

import org.springframework.stereotype.Repository;
import ru.incity.incitycalculator1_0.model.tonstometers.TonsToMetersConverter;

import java.util.*;
import java.util.stream.Collectors;

@Repository
public class TonsToMetersConverterDaoImpl implements TonsToMetersConverterDao {

    private final List<TonsToMetersConverter> list = new ArrayList<>();

    private final Map<String, Double> sumMap = new HashMap<>();

    @Override
    public void saveTonsToMetersConverter(TonsToMetersConverter tonsToMetersConverter) {
        String key = tonsToMetersConverter.getWeightOfOneMeterEnum().getDisplayName();
        double result = Math.round(tonsToMetersConverter.calculateWeightInMeters() * 1000.0) / 1000.0;
        if (sumMap.containsKey(key)) {
            sumMap.put(key, Math.round((sumMap.get(key) + result) * 1000.0) / 1000.0);
        } else {
            sumMap.put(key, result);
        }
        list.add(tonsToMetersConverter);
    }

    @Override
    public TonsToMetersConverter getTonsToMetersConverterById(int id) {
        return list.get(id);
    }

    @Override
    public void deleteTonsToMetersConverter(int id) {
        String key = list.get(id).getWeightOfOneMeterEnum().getDisplayName();
        double result = Math.round(list.get(id).calculateWeightInMeters() * 1000.0) / 1000.0;
        sumMap.put(key, Math.round((sumMap.get(key) - result) * 1000.0) / 1000.0);
        list.remove(id);
    }

    @Override
    public List<TonsToMetersConverter> getAllTonsToMetersConverters() {
        return list;
    }

    @Override
    public Map<String, Double> sumOfAllTonsToMetersConverters() {
        return sumMap.entrySet().stream()
                .filter(entry -> entry.getValue() != 0.0)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (oldValue, newValue) -> oldValue, TreeMap::new));
    }

    @Override
    public double getOnlySumOfAllTonsToMetersConverters() {
        double sum = sumMap.values().stream().mapToDouble(Double::doubleValue).sum();
        return Math.round(sum * 1000.0) / 1000.0;
    }
}
