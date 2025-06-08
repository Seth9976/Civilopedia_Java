package com.google.firebase.installations;

import A1.a;
import M1.g;
import O1.c;
import O1.d;
import androidx.annotation.Keep;
import com.google.android.gms.internal.ads.h1;
import f2.J;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import o1.f;
import s1.b;
import s1.e;
import s1.j;
import z1.a0;

@Keep
public class FirebaseInstallationsRegistrar implements e {
    @Override  // s1.e
    public List getComponents() {
        h1 h10 = new h1(d.class, new Class[0]);
        h10.a(new j(f.class, 1, 0));
        h10.a(new j(g.class, 0, 1));
        h10.e = new a(6);
        s1.a a0 = h10.b();
        M1.f f0 = new M1.f(0);
        HashSet hashSet0 = new HashSet();
        HashSet hashSet1 = new HashSet();
        HashSet hashSet2 = new HashSet();
        hashSet0.add(M1.f.class);
        Collections.addAll(hashSet0, new Class[0]);
        J j0 = new J(f0, 3);
        return Arrays.asList(new s1.a[]{a0, new s1.a(new HashSet(hashSet0), new HashSet(hashSet1), 0, 1, j0, hashSet2), a0.l("fire-installations", "17.0.1")});
    }

    private static d lambda$getComponents$0(b b0) {
        return new c(((f)b0.a(f.class)), b0.c(g.class));
    }
}

