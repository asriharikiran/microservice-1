package com.example.microservice1.controlleradviceexample;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.server.ResponseStatusException;

public class ExceptionThrowingAndHandlingControllerWithResponseStatusException {

    @GetMapping(value = "/exception3")
    public String getStringValue() {
        try {
            String[] values = {"One","Two","Three","Four"};
            return values[4];
        }
        catch (ArrayIndexOutOfBoundsException exc) {
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND, "Handler With ResponseStatusException", exc);
        }
    }
}
