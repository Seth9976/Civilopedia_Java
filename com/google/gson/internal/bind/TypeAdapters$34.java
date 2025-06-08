package com.google.gson.internal.bind;

import X1.a;
import com.google.gson.h;
import com.google.gson.n;
import com.google.gson.o;
import java.util.Calendar;
import java.util.GregorianCalendar;

class TypeAdapters.34 implements o {
    public final n i;

    public TypeAdapters.34(n n0) {
        this.i = n0;
    }

    @Override  // com.google.gson.o
    public final n a(h h0, a a0) {
        return a0.a == Calendar.class || a0.a == GregorianCalendar.class ? this.i : null;
    }

    @Override
    public final String toString() {
        return "Factory[type=" + Calendar.class.getName() + "+" + GregorianCalendar.class.getName() + ",adapter=" + this.i + "]";
    }
}

