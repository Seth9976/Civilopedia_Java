package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.ads.query.AdInfo;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzcfi;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public final class zzdq {
    public final HashSet a;
    public final Bundle b;
    public final HashMap c;
    public final HashSet d;
    public final Bundle e;
    public final HashSet f;
    public Date g;
    public String h;
    public final ArrayList i;
    public int j;
    public String k;
    public String l;
    public int m;
    public boolean n;
    public AdInfo o;
    public String p;
    public int q;

    public zzdq() {
        this.a = new HashSet();
        this.b = new Bundle();
        this.c = new HashMap();
        this.d = new HashSet();
        this.e = new Bundle();
        this.f = new HashSet();
        this.i = new ArrayList();
        this.j = -1;
        this.m = -1;
        this.q = 60000;
    }

    @Deprecated
    public final void zzA(Date date0) {
        this.g = date0;
    }

    public final void zzB(String s) {
        this.h = s;
    }

    @Deprecated
    public final void zzC(int v) {
        this.j = v;
    }

    public final void zzD(int v) {
        this.q = v;
    }

    @Deprecated
    public final void zzE(boolean z) {
        this.n = z;
    }

    public final void zzF(List list0) {
        ArrayList arrayList0 = this.i;
        arrayList0.clear();
        for(Object object0: list0) {
            String s = (String)object0;
            if(TextUtils.isEmpty(s)) {
                zzcfi.zzj("neighboring content URL should not be null or empty");
            }
            else {
                arrayList0.add(s);
            }
        }
    }

    public final void zzG(String s) {
        this.k = s;
    }

    public final void zzH(String s) {
        this.l = s;
    }

    @Deprecated
    public final void zzI(boolean z) {
        this.m = z;
    }

    public final void zzq(String s) {
        this.f.add(s);
    }

    public final void zzr(Class class0, Bundle bundle0) {
        Bundle bundle1 = this.b;
        if(bundle1.getBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter") == null) {
            bundle1.putBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter", new Bundle());
        }
        Bundle bundle2 = bundle1.getBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter");
        Preconditions.checkNotNull(bundle2);
        bundle2.putBundle(class0.getName(), bundle0);
    }

    public final void zzs(String s, String s1) {
        this.e.putString(s, s1);
    }

    public final void zzt(String s) {
        this.a.add(s);
    }

    public final void zzu(Class class0, Bundle bundle0) {
        this.b.putBundle(class0.getName(), bundle0);
    }

    @Deprecated
    public final void zzv(NetworkExtras networkExtras0) {
        Class class0 = networkExtras0.getClass();
        this.c.put(class0, networkExtras0);
    }

    public final void zzw(String s) {
        this.d.add(s);
    }

    public final void zzx(String s) {
        this.d.remove("B3EEABB8EE11C2BE770B684D95219ECB");
    }

    public final void zzy(AdInfo adInfo0) {
        this.o = adInfo0;
    }

    public final void zzz(String s) {
        this.p = s;
    }
}

