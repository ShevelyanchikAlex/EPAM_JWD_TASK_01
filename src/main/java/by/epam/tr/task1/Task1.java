package by.epam.tr.task1;

import by.epam.tr.task1.services.reader.impl.ReaderImpl;
import by.epam.tr.task1.services.reader.interfaces.Reader;
import by.epam.tr.task1.services.writer.impl.WriterImpl;
import by.epam.tr.task1.services.writer.interfaces.Writer;

public class Task1 {

    public static void main(String[] args) {
        Writer writer = new WriterImpl();
        Reader reader = new ReaderImpl();

        double a = reader.readDouble();
        double b = reader.readDouble();

        double perimeter = calculatePerimeter(a, b);
        double square = calculateSquare(a, b);

        writer.writeLn("Perimeter = " + perimeter + ", Square = " + square);
    }

    public static double calculatePerimeter(double a, double b) {
        return a + b + Math.sqrt(a * a + b * b);
    }

    public static double calculateSquare(double a, double b) {
        return 0.5 * a * b;
    }
}
