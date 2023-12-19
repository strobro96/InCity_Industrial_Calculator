import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.incity.incitycalculator1_0.common.WeightOfOneMeterEnum;
import ru.incity.incitycalculator1_0.model.tonstometers.TonsToMetersConverter;

public class TonsToMetersConverterTest {

    @Test
    public void tonsShouldBeThirtyOneThousandTwenty() {

        TonsToMetersConverter conv = new TonsToMetersConverter(144, WeightOfOneMeterEnum.FIFTY_SEVEN);
        Assertions.assertEquals(31020.0, conv.calculateWeightInMeters());
    }

    @Test
    public void tonsShouldBeThreeThousandThirteenPointSixHundredThirtyEight() {

        TonsToMetersConverter conv = new TonsToMetersConverter(34, WeightOfOneMeterEnum.ONE_HUNDRED_EIGHT);
        Assertions.assertEquals(3313.638, conv.calculateWeightInMeters());
    }


}
