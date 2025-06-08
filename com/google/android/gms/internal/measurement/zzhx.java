package com.google.android.gms.internal.measurement;

import android.net.Uri;

public final class zzhx {
    public final Uri a;
    public final String b;
    public final String c;
    public final boolean d;
    public final boolean e;

    public zzhx(Uri uri0) {
        this(uri0, false, false);
    }

    public zzhx(Uri uri0, boolean z, boolean z1) {
        this.a = uri0;
        this.b = "";
        this.c = "";
        this.d = z;
        this.e = z1;
    }

    public final zzhx zza() {
        return new zzhx(this.a, this.d, true);
    }

    public final zzhx zzb() {
        if(!this.b.isEmpty()) {
            throw new IllegalStateException("Cannot set GServices prefix and skip GServices");
        }
        return new zzhx(this.a, true, this.e);
    }

    public final zzia zzc(String s, double f) {
        return new E(this, "measurement.test.double_flag", -3.0, 2);
    }

    public final zzia zzd(String s, long v) {
        return new E(this, s, v, 0);
    }

    public final zzia zze(String s, String s1) {
        return new E(this, s, s1, 3);
    }

    public final zzia zzf(String s, boolean z) {
        return new E(this, s, Boolean.valueOf(z), 1);
    }
}

