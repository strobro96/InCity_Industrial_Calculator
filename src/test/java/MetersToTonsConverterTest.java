import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.incity.incitycalculator1_0.model.meterstotons.MetersToTonsConverter;
import ru.incity.incitycalculator1_0.common.WeightOfOneMeterEnum;

public class MetersToTonsConverterTest {

    @Test
    public void tonsShouldBeZeroPointSixty() {

        MetersToTonsConverter conv = new MetersToTonsConverter(130, WeightOfOneMeterEnum.FIFTY_SEVEN);
        Assertions.assertEquals(0.603, conv.calculateLengthInTons());
    }

    @Test
    public void tonsShouldBeFourPointSeventyNine() {

        MetersToTonsConverter conv = new MetersToTonsConverter(467, WeightOfOneMeterEnum.ONE_HUNDRED_EIGHT);
        Assertions.assertEquals(4.792, conv.calculateLengthInTons());
    }

}
