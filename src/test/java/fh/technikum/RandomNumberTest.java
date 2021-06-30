package fh.technikum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RandomNumberTest {
    @Test
    public void testRandomNumber(){
        //Arrange
        RandomNumber rctest = new RandomNumber();
        String erwarten = "testFall";
        String wert;
        //Act
        wert = rctest.createRandomNumber();
        //Assert
        Assertions.assertEquals(erwarten, wert);
    }
}
