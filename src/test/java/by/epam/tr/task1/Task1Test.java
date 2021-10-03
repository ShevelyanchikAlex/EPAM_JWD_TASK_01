package by.epam.tr.task1;

import org.junit.Assert;
import org.junit.Test;

public class Task1Test {

    @Test
    public void calculatePerimeterValid() {
        double a = 4;
        double b = 3;
        double expectedPerimeter = 12;
        double realPerimeter = Task1.calculatePerimeter(a, b);

        Assert.assertEquals(expectedPerimeter, realPerimeter, 0);
    }

    @Test
    public void calculateSquareValid() {
        double a = 3;
        double b = 4;
        double expectedSquare = 6;
        double realSquare = Task1.calculateSquare(a, b);

        Assert.assertEquals(expectedSquare, realSquare, 0);
    }

    @Test
    public void calculatePerimeterInvalid() {
        double a = 6;
        double b = 10;
        double expectedPerimeter = 24;
        double realPerimeter = Task1.calculatePerimeter(a, b);

        Assert.assertNotEquals(expectedPerimeter, realPerimeter);
    }

    @Test
    public void calculateSquareInvalid() {
        double a = 6;
        double b = 10;
        double expectedSquare = 24;
        double realSquare = Task1.calculateSquare(a, b);

        Assert.assertNotEquals(expectedSquare, realSquare);
    }

}
