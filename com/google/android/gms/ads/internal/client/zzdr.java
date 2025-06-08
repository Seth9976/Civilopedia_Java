package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.ads.query.AdInfo;
import com.google.android.gms.ads.search.SearchAdRequest;
import com.google.android.gms.internal.ads.zzcfb;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class zzdr {
    public final Date a;
    public final String b;
    public final ArrayList c;
    public final int d;
    public final Set e;
    public final Bundle f;
    public final Map g;
    public final String h;
    public final String i;
    public final SearchAdRequest j;
    public final int k;
    public final Set l;
    public final Bundle m;
    public final Set n;
    public final boolean o;
    public final AdInfo p;
    public final String q;
    public final int r;

    public zzdr(zzdq zzdq0, SearchAdRequest searchAdRequest0) {
        this.a = zzdq0.g;
        this.b = zzdq0.h;
        this.c = zzdq0.i;
        this.d = zzdq0.j;
        this.e = Collections.unmodifiableSet(zzdq0.a);
        this.f = zzdq0.b;
        this.g = Collections.unmodifiableMap(zzdq0.c);
        this.h = zzdq0.k;
        this.i = zzdq0.l;
        this.j = searchAdRequest0;
        this.k = zzdq0.m;
        this.l = Collections.unmodifiableSet(zzdq0.d);
        this.m = zzdq0.e;
        this.n = Collections.unmodifiableSet(zzdq0.f);
        this.o = zzdq0.n;
        this.p = zzdq0.o;
        this.q = zzdq0.p;
        this.r = zzdq0.q;
    }

    @Deprecated
    public final int zza() {
        return this.d;
    }

    public final int zzb() {
        return this.r;
    }

    public final int zzc() {
        return this.k;
    }

    public final Bundle zzd(Class class0) {
        Bundle bundle0 = this.f.getBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter");
        return bundle0 == null ? null : bundle0.getBundle(class0.getName());
    }

    public final Bundle zze() {
        return this.m;
    }

    public final Bundle zzf(Class class0) {
        return this.f.getBundle(class0.getName());
    }

    public final Bundle zzg() {
        return this.f;
    }

    @Deprecated
    public final NetworkExtras zzh(Class class0) {
        return (NetworkExtras)this.g.get(class0);
    }

    public final AdInfo zzi() {
        return this.p;
    }

    public final SearchAdRequest zzj() {
        return this.j;
    }

    public final String zzk() {
        return this.q;
    }

    public final String zzl() {
        return this.b;
    }

    public final String zzm() {
        return this.h;
    }

    public final String zzn() {
        return this.i;
    }

    @Deprecated
    public final Date zzo() {
        return this.a;
    }

    public final List zzp() {
        return new ArrayList(this.c);
    }

    public final Set zzq() {
        return this.n;
    }

    public final Set zzr() {
        return this.e;
    }

    @Deprecated
    public final boolean zzs() {
        return this.o;
    }

    public final boolean zzt(Context context0) {
        RequestConfiguration requestConfiguration0 = zzed.zzf().zzc();
        String s = zzcfb.zzx(context0);
        return this.l.contains(s) || requestConfiguration0.getTestDeviceIds().contains(s);
    }
}

