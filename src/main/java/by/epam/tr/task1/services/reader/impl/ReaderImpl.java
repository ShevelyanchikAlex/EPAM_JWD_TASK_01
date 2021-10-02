package by.epam.tr.task1.services.reader.impl;

import by.epam.tr.task1.services.reader.interfaces.Reader;
import by.epam.tr.task1.services.validator.impl.ValidatorImpl;
import by.epam.tr.task1.services.validator.interfaces.Validator;
import by.epam.tr.task1.services.writer.impl.WriterImpl;
import by.epam.tr.task1.services.writer.interfaces.Writer;

import java.util.Scanner;

public class ReaderImpl implements Reader {
    private final Scanner scanner;
    private final Validator validator;
    private final Writer writer;

    public ReaderImpl() {
        this.scanner = new Scanner(System.in);
        this.validator = new ValidatorImpl();
        this.writer = new WriterImpl();
    }

    @Override
    public int readInt() {
        boolean isValid = false;
        String inputVal = "";

        while (!isValid) {
            writer.writeLn("Input int value: ");
            inputVal = scanner.nextLine();
            isValid = validator.isValidDoubleSide(inputVal);
        }
        return Integer.parseInt(inputVal);
    }

    @Override
    public double readDouble() {
        boolean isValid = false;
        String inputVal = "";

        while (!isValid) {
            writer.writeLn("Input double value: ");
            inputVal = scanner.nextLine();
            isValid = validator.isValidDoubleSide(inputVal);
        }
        return Double.parseDouble(inputVal);
    }

}
