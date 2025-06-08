package com.google.gson;

import Y1.b;
import java.io.IOException;
import java.io.StringWriter;

public abstract class j {
    @Override
    public final String toString() {
        try {
            StringWriter stringWriter0 = new StringWriter();
            b b0 = new b(stringWriter0);
            b0.m = true;
            com.google.gson.internal.bind.b.A.c(b0, this);
            return stringWriter0.toString();
        }
        catch(IOException iOException0) {
            throw new AssertionError(iOException0);
        }
    }
}

