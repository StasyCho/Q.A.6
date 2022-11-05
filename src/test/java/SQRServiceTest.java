import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import ru.netology.sqr.SQRService;

public class SQRServiceTest {

    @CsvFileSource(files = "src/test/resources/number.csv")
    @ParameterizedTest
    public void shouldCalcRoot(int expected, int lowerLimit, int upperLimit) {
        SQRService Service = new SQRService();

        //int expected = 3;
        int actual = SQRService.calcSQR(lowerLimit, upperLimit);

        Assertions.assertEquals(expected, actual);
    }
}
