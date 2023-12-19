package ru.incity.incitycalculator1_0.model.tonstometers;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import ru.incity.incitycalculator1_0.common.WeightOfOneMeterEnum;

@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class TonsToMetersConverter {

    private double weight;

    private WeightOfOneMeterEnum weightOfOneMeterEnum;

    public double calculateWeightInMeters() {
        double result = weight / weightOfOneMeterEnum.getWeightOfOneMeter();
        return Math.round(result * 1000.0) / 1000.0;
    }

}
