package com.google.firebase;

import M1.g;
import M1.h;
import T1.a;
import T1.b;
import android.content.Context;
import android.os.Build;
import com.google.android.gms.internal.ads.h1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import o1.f;
import s1.e;
import s1.j;
import z1.a0;

public class FirebaseCommonRegistrar implements e {
    public static String a(String s) {
        return s.replace(' ', '_').replace('/', '_');
    }

    @Override  // s1.e
    public final List getComponents() {
        List list0 = new ArrayList();
        HashSet hashSet0 = new HashSet();
        HashSet hashSet1 = new HashSet();
        HashSet hashSet2 = new HashSet();
        Class class0 = b.class;
        hashSet0.add(class0);
        Collections.addAll(hashSet0, new Class[0]);
        j j0 = new j(a.class, 2, 0);
        if(hashSet0.contains(j0.a)) {
            throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
        }
        hashSet1.add(j0);
        A1.a a0 = new A1.a(7);
        ((ArrayList)list0).add(new s1.a(new HashSet(hashSet0), new HashSet(hashSet1), 0, 0, a0, hashSet2));
        h1 h10 = new h1(M1.e.class, new Class[]{g.class, h.class});
        h10.a(new j(Context.class, 1, 0));
        h10.a(new j(f.class, 1, 0));
        h10.a(new j(M1.f.class, 2, 0));
        h10.a(new j(class0, 1, 1));
        h10.e = new A1.a(5);
        ((ArrayList)list0).add(h10.b());
        ((ArrayList)list0).add(a0.l("fire-android", "33"));
        ((ArrayList)list0).add(a0.l("fire-core", "20.1.1"));
        ((ArrayList)list0).add(a0.l("device-name", FirebaseCommonRegistrar.a(Build.PRODUCT)));
        ((ArrayList)list0).add(a0.l("device-model", FirebaseCommonRegistrar.a(Build.DEVICE)));
        ((ArrayList)list0).add(a0.l("device-brand", FirebaseCommonRegistrar.a(Build.BRAND)));
        ((ArrayList)list0).add(a0.t("android-target-sdk", new A1.a(8)));
        ((ArrayList)list0).add(a0.t("android-min-sdk", new A1.a(9)));
        ((ArrayList)list0).add(a0.t("android-platform", new A1.a(10)));
        ((ArrayList)list0).add(a0.t("android-installer", new A1.a(11)));
        ((ArrayList)list0).add(a0.l("kotlin", "1.9.22"));
        return list0;
    }
}

