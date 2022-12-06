import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CafeStarTest {
    @Test
    void shouldCheckForPositiveValueOfQuantity()
    {
        CafeStar cafeStar=new CafeStar();
        cafeStar.setQuantity(10);
        int actualValue=cafeStar.getQuantity();
        int expectedValue=10;
        assertEquals(expectedValue,actualValue);
    }
    @Test
    void shouldCheckForPositiveValueOfAmount()
    {
        CafeStar cafeStar=new CafeStar();
        cafeStar.setAmount(200.12);
        double actualValue=cafeStar.getAmount();
        double expectedValue=200.12;
        assertEquals(expectedValue,actualValue);
    }


    @Test
    void shouldThrowIllegalArgumentExceptionWhenInvalidQuantityIsGiven() throws IllegalArgumentException
    {
        CafeStar cafeStar=new CafeStar();
        IllegalArgumentException ex= Assertions.assertThrows(IllegalArgumentException.class,()-> cafeStar.setQuantity(-3));
        String actualValue=ex.getMessage();
        String expectedValue="Invalid Quantity";
        assertEquals(expectedValue,actualValue);
    }

    @Test
    void shouldThrowIllegalArgumentExceptionWhenInvalidAmountIsGiven() throws IllegalArgumentException
    {
        CafeStar cafeStar=new CafeStar();
        IllegalArgumentException ex= Assertions.assertThrows(IllegalArgumentException.class,()-> cafeStar.setAmount(-300));
        String actualValue=ex.getMessage();
        String expectedValue="Invalid Amount";
        assertEquals(expectedValue,actualValue);
    }



}
