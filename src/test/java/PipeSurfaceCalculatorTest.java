import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.incity.incitycalculator1_0.common.PipeDiameterEnum;
import ru.incity.incitycalculator1_0.model.pipesurface.PipeSurfaceCalculator;

public class PipeSurfaceCalculatorTest {

    @Test
    public void surfaceShouldBeOneHundredFortyPointFive() {

        PipeSurfaceCalculator calc = new PipeSurfaceCalculator(785, PipeDiameterEnum.FIFTY_TIMES_THREE_POINT_FIVE);
        Assertions.assertEquals(140.5, calc.calculatePipeSurface());
    }

    @Test
    public void surfaceShouldBeTwoPointThirtyThree() {

        PipeSurfaceCalculator calc = new PipeSurfaceCalculator(36, PipeDiameterEnum.FIFTEEN_TIMES_TWO_POINT_EIGHT);
        Assertions.assertEquals(2.33, calc.calculatePipeSurface());
    }

    @Test
    public void surfaceShouldBeOnePointFortyFive() {

        PipeSurfaceCalculator calc = new PipeSurfaceCalculator(12, PipeDiameterEnum.THIRTY_TWO_TIMES_THREE_POINT_TWO);
        Assertions.assertEquals(1.45, calc.calculatePipeSurface());
    }

    @Test
    public void surfaceShouldBeFourteenPointThirtyTwo() {

        PipeSurfaceCalculator calc = new PipeSurfaceCalculator(97, PipeDiameterEnum.FORTY_TIMES_THREE_POINT_FIVE);
        Assertions.assertEquals(14.32, calc.calculatePipeSurface());
    }

    @Test
    public void surfaceShouldBeSixteenPointSixtyTwo() {

        PipeSurfaceCalculator calc = new PipeSurfaceCalculator(49, PipeDiameterEnum.ONE_HUNDRED_TIMES_FOUR_POINT_ZERO);
        Assertions.assertEquals(16.62, calc.calculatePipeSurface());
    }

}
