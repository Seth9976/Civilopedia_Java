package com.google.firebase.crashlytics;

import O1.d;
import com.google.android.gms.internal.ads.h1;
import f2.J;
import java.util.Arrays;
import java.util.List;
import o1.f;
import q1.a;
import s1.e;
import s1.j;
import t1.c;
import u1.b;
import z1.a0;

public class CrashlyticsRegistrar implements e {
    @Override  // s1.e
    public final List getComponents() {
        h1 h10 = new h1(c.class, new Class[0]);
        h10.a(new j(f.class, 1, 0));
        h10.a(new j(d.class, 1, 0));
        h10.a(new j(b.class, 0, 2));
        h10.a(new j(a.class, 0, 2));
        h10.e = new J(this, 4);
        if(h10.a != 0) {
            throw new IllegalStateException("Instantiation type has already been set.");
        }
        h10.a = 2;
        return Arrays.asList(new s1.a[]{h10.b(), a0.l("fire-cls", "18.2.12")});
    }
}

