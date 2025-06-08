package com.google.android.gms.internal.play_billing;

import java.io.Serializable;
import javax.annotation.CheckForNull;

public final class zzdh extends q implements Serializable {
    public final f i;
    public final f j;
    public static final zzdh k;
    public static final int zzc;

    static {
        zzdh.k = new zzdh(e.k, e.j);
    }

    public zzdh(f f0, f f1) {
        this.i = f0;
        this.j = f1;
        if(f0.a(f1) <= 0 && f0 != e.j && f1 != e.k) {
            return;
        }
        StringBuilder stringBuilder0 = new StringBuilder(16);
        f0.b(stringBuilder0);
        stringBuilder0.append("..");
        f1.c(stringBuilder0);
        throw new IllegalArgumentException("Invalid range: " + stringBuilder0.toString());
    }

    // 去混淆评级： 低(30)
    @Override
    public final boolean equals(@CheckForNull Object object0) {
        return object0 instanceof zzdh && this.i.equals(((zzdh)object0).i) && this.j.equals(((zzdh)object0).j);
    }

    @Override
    public final int hashCode() {
        return this.j.hashCode() + this.i.hashCode() * 0x1F;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder(16);
        this.i.b(stringBuilder0);
        stringBuilder0.append("..");
        this.j.c(stringBuilder0);
        return stringBuilder0.toString();
    }

    public static zzdh zza() {
        return zzdh.k;
    }

    public final zzdh zzb(zzdh zzdh0) {
        f f0 = this.i;
        int v = f0.a(zzdh0.i);
        f f1 = this.j;
        f f2 = zzdh0.j;
        int v1 = f1.a(f2);
        if(v >= 0 && v1 <= 0) {
            return this;
        }
        if(v <= 0 && v1 >= 0) {
            return zzdh0;
        }
        if(v < 0) {
            f0 = zzdh0.i;
        }
        if(v1 > 0) {
            f1 = f2;
        }
        zzbe.zzd(f0.a(f1) <= 0, "intersection is undefined for disconnected ranges %s and %s", this, zzdh0);
        return new zzdh(f0, f1);
    }

    public final zzdh zzc(zzdh zzdh0) {
        f f0 = this.i;
        int v = f0.a(zzdh0.i);
        int v1 = this.j.a(zzdh0.j);
        if(v <= 0 && v1 >= 0) {
            return this;
        }
        if(v >= 0 && v1 <= 0) {
            return zzdh0;
        }
        if(v > 0) {
            f0 = zzdh0.i;
        }
        if(v1 >= 0) {
            zzdh0 = this;
        }
        return new zzdh(f0, zzdh0.j);
    }

    public final boolean zzd() {
        return this.i.equals(this.j);
    }
}

