package by.epam.tr.task1;

import by.epam.tr.task1.services.reader.impl.ReaderImpl;
import by.epam.tr.task1.services.reader.interfaces.Reader;
import by.epam.tr.task1.services.writer.impl.WriterImpl;
import by.epam.tr.task1.services.writer.interfaces.Writer;

public class Task1 {

    public static void main(String[] args) {
        Reader reader = new ReaderImpl();
        Writer writer = new WriterImpl();

        double a = reader.readDouble();
        double b = reader.readDouble();

        outputResults(writer, calculatePerimeter(a, b), calculateSquare(a, b));
    }

    public static double calculatePerimeter(double a, double b) {
        return a + b + Math.sqrt(a * a + b * b);
    }

    public static double calculateSquare(double a, double b) {
        return 0.5 * a * b;
    }

    public static void outputResults(Writer writer, double perimeter, double square) {
        writer.writeLn("Perimeter = " + perimeter + ", square = " + square);
    }

}
