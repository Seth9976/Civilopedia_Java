package com.google.gson.internal;

import java.math.BigDecimal;

public final class f extends Number {
    public final String i;

    public f(String s) {
        this.i = s;
    }

    @Override
    public final double doubleValue() {
        return Double.parseDouble(this.i);
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 instanceof f) {
            String s = ((f)object0).i;
            return this.i == s || this.i.equals(s);
        }
        return false;
    }

    @Override
    public final float floatValue() {
        return Float.parseFloat(this.i);
    }

    @Override
    public final int hashCode() {
        return this.i.hashCode();
    }

    @Override
    public final int intValue() {
        String s;
        try {
            s = this.i;
            return Integer.parseInt(s);
        }
        catch(NumberFormatException unused_ex) {
            try {
                return (int)Long.parseLong(s);
            }
            catch(NumberFormatException unused_ex) {
                return new BigDecimal(s).intValue();
            }
        }
    }

    @Override
    public final long longValue() {
        String s;
        try {
            s = this.i;
            return Long.parseLong(s);
        }
        catch(NumberFormatException unused_ex) {
            return new BigDecimal(s).longValue();
        }
    }

    @Override
    public final String toString() {
        return this.i;
    }
}

