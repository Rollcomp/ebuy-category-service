package org.ebuy.exception;

/**
 * Created by Burak Köken on 2.5.2020.
 */
public class NotFoundException extends ApiException {

    public NotFoundException(String message) {
        super(message);
    }

}