package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import i3.e;

public final class zzev {
    public final String zza;
    public final String zzb;
    public final long zzc;
    public final Bundle zzd;

    public zzev(String s, String s1, Bundle bundle0, long v) {
        this.zza = s;
        this.zzb = s1;
        this.zzd = bundle0;
        this.zzc = v;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = e.j("origin=", this.zzb, ",name=", this.zza, ",params=");
        stringBuilder0.append(this.zzd.toString());
        return stringBuilder0.toString();
    }

    public final zzaw zza() {
        zzau zzau0 = new zzau(new Bundle(this.zzd));
        return new zzaw(this.zza, zzau0, this.zzb, this.zzc);
    }

    public static zzev zzb(zzaw zzaw0) {
        Bundle bundle0 = zzaw0.zzb.zzc();
        return new zzev(zzaw0.zza, zzaw0.zzc, bundle0, zzaw0.zzd);
    }
}

