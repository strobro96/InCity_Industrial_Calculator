package ru.incity.incitycalculator1_0.model.pipesurface;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import ru.incity.incitycalculator1_0.common.PipeDiameterEnum;

@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class PipeSurfaceCalculator {

    private double length;
    private PipeDiameterEnum pipeDiameterEnum;
    private static final double pi = 3.14;

    public double calculatePipeSurface() {
        double result = pipeDiameterEnum.getDiameterWithTwoWalls() * pi * length;
        return Math.round(result * 100.0) / 100.0;
    }

}
