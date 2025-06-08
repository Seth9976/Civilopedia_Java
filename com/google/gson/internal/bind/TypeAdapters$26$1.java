package com.google.gson.internal.bind;

import Y1.a;
import Y1.b;
import com.google.gson.n;
import java.sql.Timestamp;
import java.util.Date;

class TypeAdapters.26.1 extends n {
    public final n a;

    public TypeAdapters.26.1(n n0) {
        this.a = n0;
    }

    @Override  // com.google.gson.n
    public final Object b(a a0) {
        Date date0 = (Date)this.a.b(a0);
        return date0 != null ? new Timestamp(date0.getTime()) : null;
    }

    @Override  // com.google.gson.n
    public final void c(b b0, Object object0) {
        this.a.c(b0, ((Timestamp)object0));
    }
}

