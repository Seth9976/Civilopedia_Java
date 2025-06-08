package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.net.Uri;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public abstract class zzia {
    public final zzhx a;
    public final String b;
    public final Object c;
    public volatile int d;
    public volatile Object e;
    public static final Object f;
    public static volatile B g;
    public static final AtomicInteger h;
    public static final int zzc;

    static {
        zzia.f = new Object();
        new AtomicReference();
        zzia.h = new AtomicInteger();
    }

    public zzia(zzhx zzhx0, String s, Object object0) {
        this.d = -1;
        if(zzhx0.a == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        }
        this.a = zzhx0;
        this.b = s;
        this.c = object0;
    }

    public abstract Object a(Object arg1);

    public final Object zzb() {
        Object object1;
        zzib zzib0;
        int v = zzia.h.get();
        if(this.d < v) {
            synchronized(this) {
                if(this.d < v) {
                    B b0 = zzia.g;
                    if(b0 == null) {
                        throw new IllegalStateException("Must call PhenotypeFlag.init() first");
                    }
                    Uri uri0 = this.a.a;
                    if(uri0 == null) {
                        zzib0 = zzib.a();
                    }
                    else if(zzho.zza(b0.a, uri0)) {
                        zzib0 = zzhe.zza(b0.a.getContentResolver(), this.a.a, zzhq.zza);
                    }
                    else {
                        zzib0 = null;
                    }
                    if(zzib0 == null) {
                        object1 = null;
                    }
                    else {
                        Object object0 = zzib0.zzb(this.zzc());
                        object1 = object0 == null ? null : this.a(object0);
                    }
                    if(object1 == null) {
                        if(this.a.d) {
                            object1 = null;
                        }
                        else {
                            String s = D.a(b0.a).b((this.a.d ? null : this.b));
                            object1 = s == null ? null : this.a(s);
                        }
                        if(object1 == null) {
                            object1 = this.c;
                        }
                    }
                    zzif zzif0 = (zzif)b0.b.zza();
                    if(zzif0.zzb()) {
                        String s1 = ((zzhg)zzif0.zza()).zza(this.a.a, null, this.a.c, this.b);
                        object1 = s1 == null ? this.c : this.a(s1);
                    }
                    this.e = object1;
                    this.d = v;
                }
            }
        }
        return this.e;
    }

    public final String zzc() {
        return this.b;
    }

    public static void zzd() {
        zzia.h.incrementAndGet();
    }

    public static void zze(Context context0) {
        if(zzia.g == null) {
            Object object0 = zzia.f;
            synchronized(object0) {
                if(zzia.g == null) {
                    synchronized(object0) {
                        B b0 = zzia.g;
                        Context context1 = context0.getApplicationContext();
                        if(context1 != null) {
                            context0 = context1;
                        }
                        if(b0 == null || b0.a != context0) {
                            zzhe.a();
                            zzib.b();
                            D.c();
                            zzia.g = new B(context0, zzil.zza(new zzhr(context0)));
                            zzia.h.incrementAndGet();
                        }
                    }
                }
            }
        }
    }
}

