package by.epam.tr.task1;

import org.junit.Assert;
import org.junit.Test;

public class Task1Test1 {

    @Test
    public void calculatePerimeter() {
        double a = 4;
        double b = 3;
        double realPerimeter;
        double expectedPerimeter = 12.00000000;

        realPerimeter = Task1.calculatePerimeter(a, b);
        Assert.assertEquals(expectedPerimeter, realPerimeter, 0.00000001);
    }

    @Test
    public void calculateSquare() {
        double a = 3;
        double b = 4;
        double realSquare;
        double expectedSquare = 6.00000000;

        realSquare = Task1.calculateSquare(a, b);
        Assert.assertEquals(expectedSquare, realSquare, 0.00000001);
    }

}
