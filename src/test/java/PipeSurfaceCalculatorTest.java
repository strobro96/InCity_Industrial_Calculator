import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.incity.incitycalculator1_0.model.PipeDiameterEnum;
import ru.incity.incitycalculator1_0.model.PipeSurfaceCalculator;

public class PipeSurfaceCalculatorTest {

    @Test
    public void surfaceShouldBeOneHundredFortyPointFive() {

        PipeSurfaceCalculator calc = new PipeSurfaceCalculator(PipeDiameterEnum.FIFTY_TIMES_THREE_POINT_FIVE, 785 );
        Assertions.assertEquals(140.5, calc.calculatePipeSurface());
    }

    @Test
    public void surfaceShouldBeTwoPointThirtyThree() {

        PipeSurfaceCalculator calc = new PipeSurfaceCalculator(PipeDiameterEnum.FIFTEEN_TIMES_TWO_POINT_EIGHT, 36);
        Assertions.assertEquals(2.33, calc.calculatePipeSurface());
    }

    @Test
    public void surfaceShouldBeOnePointFortyFive() {

        PipeSurfaceCalculator calc = new PipeSurfaceCalculator(PipeDiameterEnum.THIRTY_TWO_TIMES_THREE_POINT_TWO,12);
        Assertions.assertEquals(1.45, calc.calculatePipeSurface());
    }

    @Test
    public void surfaceShouldBeFourteenPointThirtyTwo() {

        PipeSurfaceCalculator calc = new PipeSurfaceCalculator(PipeDiameterEnum.FOURTEEN_TIMES_THREE_POINT_FIVE,97);
        Assertions.assertEquals(14.32, calc.calculatePipeSurface());
    }

    @Test
    public void surfaceShouldBeSixteenPointSixtyTwo() {

        PipeSurfaceCalculator calc = new PipeSurfaceCalculator(PipeDiameterEnum.ONE_HUNDRED_TIMES_FOUR_POINT_ZERO,49);
        Assertions.assertEquals(16.62, calc.calculatePipeSurface());
    }

}
