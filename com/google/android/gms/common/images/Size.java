package com.google.android.gms.common.images;

import i3.e;

public final class Size {
    public final int a;
    public final int b;

    public Size(int v, int v1) {
        this.a = v;
        this.b = v1;
    }

    @Override
    public boolean equals(Object object0) {
        if(object0 == null) {
            return false;
        }
        return this == object0 ? true : object0 instanceof Size && this.a == ((Size)object0).a && this.b == ((Size)object0).b;
    }

    public int getHeight() {
        return this.b;
    }

    public int getWidth() {
        return this.a;
    }

    @Override
    public int hashCode() {
        return (this.a >>> 16 | this.a << 16) ^ this.b;
    }

    public static Size parseSize(String s) throws NumberFormatException {
        if(s == null) {
            throw new IllegalArgumentException("string must not be null");
        }
        int v = s.indexOf(42);
        if(v < 0) {
            v = s.indexOf(120);
        }
        if(v >= 0) {
            try {
                return new Size(Integer.parseInt(s.substring(0, v)), Integer.parseInt(s.substring(v + 1)));
            }
            catch(NumberFormatException unused_ex) {
                throw new NumberFormatException(e.f("Invalid Size: \"", s, "\""));
            }
        }
        throw new NumberFormatException(e.f("Invalid Size: \"", s, "\""));
    }

    @Override
    public String toString() {
        return this.a + "x" + this.b;
    }
}

