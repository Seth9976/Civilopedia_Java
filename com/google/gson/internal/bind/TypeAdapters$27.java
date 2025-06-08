package com.google.gson.internal.bind;

import Y1.a;
import Y1.b;
import com.google.gson.n;
import java.util.Calendar;
import java.util.GregorianCalendar;

class TypeAdapters.27 extends n {
    @Override  // com.google.gson.n
    public final Object b(a a0) {
        if(a0.v() == 9) {
            a0.r();
            return null;
        }
        a0.b();
        int v = 0;
        int v1 = 0;
        int v2 = 0;
        int v3 = 0;
        int v4 = 0;
        int v5 = 0;
        while(a0.v() != 4) {
            String s = a0.p();
            int v6 = a0.n();
            if("year".equals(s)) {
                v = v6;
            }
            else if("month".equals(s)) {
                v1 = v6;
            }
            else if("dayOfMonth".equals(s)) {
                v2 = v6;
            }
            else if("hourOfDay".equals(s)) {
                v3 = v6;
            }
            else if("minute".equals(s)) {
                v4 = v6;
            }
            else if("second".equals(s)) {
                v5 = v6;
            }
        }
        a0.f();
        return new GregorianCalendar(v, v1, v2, v3, v4, v5);
    }

    @Override  // com.google.gson.n
    public final void c(b b0, Object object0) {
        if(((Calendar)object0) == null) {
            b0.j();
            return;
        }
        b0.c();
        b0.g("year");
        b0.m(((long)((Calendar)object0).get(1)));
        b0.g("month");
        b0.m(((long)((Calendar)object0).get(2)));
        b0.g("dayOfMonth");
        b0.m(((long)((Calendar)object0).get(5)));
        b0.g("hourOfDay");
        b0.m(((long)((Calendar)object0).get(11)));
        b0.g("minute");
        b0.m(((long)((Calendar)object0).get(12)));
        b0.g("second");
        b0.m(((long)((Calendar)object0).get(13)));
        b0.f();
    }
}

