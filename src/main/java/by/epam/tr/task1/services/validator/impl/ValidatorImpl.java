package by.epam.tr.task1.services.validator.impl;

import by.epam.tr.task1.services.exception.PositiveValueException;
import by.epam.tr.task1.services.validator.interfaces.Validator;
import by.epam.tr.task1.services.writer.impl.WriterImpl;
import by.epam.tr.task1.services.writer.interfaces.Writer;

public class ValidatorImpl implements Validator {
    private final Writer writer;

    public ValidatorImpl() {
        this.writer = new WriterImpl();
    }

    @Override
    public boolean isValidDoubleSide(String inputValue) {
        boolean isValid = false;

        try {
            if (Double.parseDouble(inputValue) > 0) {
                isValid = true;
            } else {
                throw new PositiveValueException("Side value must be positive!\nTry again to input value.");
            }
        } catch (NumberFormatException e) {
            writer.writeLn("Error: Invalid input format!\nTry again to input value.");
        } catch (PositiveValueException e) {
            writer.writeLn(e.getMessage());
        }

        return isValid;
    }

    @Override
    public boolean isValidIntSide(String inputValue) {
        boolean isValid = false;

        try {
            if (Integer.parseInt(inputValue) > 0) {
                isValid = true;
            } else {
                throw new PositiveValueException("Side value must be positive!\nTry again to input value.");
            }
        } catch (NumberFormatException e) {
            writer.writeLn("Error: Invalid input format!\nTry again to input value.");
        } catch (PositiveValueException e) {
            writer.writeLn(e.getMessage());
        }

        return isValid;
    }

}
