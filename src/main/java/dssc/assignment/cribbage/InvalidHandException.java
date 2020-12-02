package dssc.assignment.cribbage;

import java.security.InvalidParameterException;

public class InvalidHandException extends InvalidParameterException {
    InvalidHandException(String msg) {
        super(msg);
    }
}
