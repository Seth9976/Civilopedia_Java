package com.google.gson.internal.bind;

import Y1.a;
import Y1.b;
import com.google.gson.n;
import java.util.Locale;
import java.util.StringTokenizer;

class TypeAdapters.28 extends n {
    @Override  // com.google.gson.n
    public final Object b(a a0) {
        String s = null;
        if(a0.v() == 9) {
            a0.r();
            return null;
        }
        StringTokenizer stringTokenizer0 = new StringTokenizer(a0.t(), "_");
        String s1 = stringTokenizer0.hasMoreElements() ? stringTokenizer0.nextToken() : null;
        String s2 = stringTokenizer0.hasMoreElements() ? stringTokenizer0.nextToken() : null;
        if(stringTokenizer0.hasMoreElements()) {
            s = stringTokenizer0.nextToken();
        }
        if(s2 == null && s == null) {
            return new Locale(s1);
        }
        return s == null ? new Locale(s1, s2) : new Locale(s1, s2, s);
    }

    @Override  // com.google.gson.n
    public final void c(b b0, Object object0) {
        b0.o((((Locale)object0) == null ? null : ((Locale)object0).toString()));
    }
}

