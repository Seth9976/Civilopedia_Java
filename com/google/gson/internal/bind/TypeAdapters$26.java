package com.google.gson.internal.bind;

import X1.a;
import com.google.gson.h;
import com.google.gson.n;
import com.google.gson.o;
import java.sql.Timestamp;
import java.util.Date;

class TypeAdapters.26 implements o {
    @Override  // com.google.gson.o
    public final n a(h h0, a a0) {
        if(a0.a != Timestamp.class) {
            return null;
        }
        h0.getClass();
        return new TypeAdapters.26.1(h0.c(new a(Date.class)));
    }
}

