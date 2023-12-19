package ru.incity.incitycalculator1_0.model.meterstotons;


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
public class MetersToTonsConverter {

    private double length;
    private WeightOfOneMeterEnum weightOfOneMeterEnum;

    public double calculateLengthInTons() {
        double result = weightOfOneMeterEnum.getWeightOfOneMeter() * length;
        return Math.round(result * 1000.0) / 1000.0;
    }

}
