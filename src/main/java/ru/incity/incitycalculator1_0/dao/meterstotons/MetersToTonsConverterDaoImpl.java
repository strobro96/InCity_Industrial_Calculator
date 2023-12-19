package ru.incity.incitycalculator1_0.dao.meterstotons;

import org.springframework.stereotype.Repository;
import ru.incity.incitycalculator1_0.model.meterstotons.MetersToTonsConverter;

import java.util.*;
import java.util.stream.Collectors;

@Repository
public class MetersToTonsConverterDaoImpl implements MetersToTonsConverterDao {

    private final List<MetersToTonsConverter> list = new ArrayList<>();

    private final Map<String,Double> sumMap = new HashMap<>();

    @Override
    public void saveMetersToTonsConverter(MetersToTonsConverter metersToTonsConverter) {
        String key = metersToTonsConverter.getWeightOfOneMeterEnum().getDisplayName();
        double result = Math.round(metersToTonsConverter.calculateLengthInTons()*1000.0)/1000.0;
        if (sumMap.containsKey(key)) {
            sumMap.put(key, Math.round((sumMap.get(key)+result)*1000.0)/1000.0);
        }
        else {
        sumMap.put(key, result);}
        list.add(metersToTonsConverter);
    }

    @Override
    public MetersToTonsConverter getMetersToTonsConverterById(int id) {
        return list.get(id);
    }

    @Override
    public void deleteMetersToTonsConverter(int id) {
        String key = list.get(id).getWeightOfOneMeterEnum().getDisplayName();
        double result = Math.round(list.get(id).calculateLengthInTons()*1000.0)/1000.0;
        sumMap.put(key, Math.round((sumMap.get(key) - result)*1000.0)/1000.0);
        list.remove(id);
    }

    @Override
    public List<MetersToTonsConverter> getAllMetersToTonsConverters() {
        return list;
    }



    @Override
    public Map<String, Double> sumOfAllMetersToTonsConverters() {
        return sumMap.entrySet().stream()
                .filter(entry -> entry.getValue() != 0.0)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (oldValue, newValue) -> oldValue, TreeMap::new));
    }

    @Override
    public double getOnlySumOfAllMetersToTonsConverters() {
        double sum = sumMap.values().stream().mapToDouble(Double::doubleValue).sum();
        return Math.round(sum * 1000.0) / 1000.0;
    }
}
