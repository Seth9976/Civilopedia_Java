package com.google.android.gms.internal.ads;

import android.media.AudioAttributes.Builder;
import android.media.AudioAttributes;

public final class zzi {
    public AudioAttributes a;
    public static final zzi zza;
    public static final zzl zzb;
    public final int zzc;

    static {
        zzi.zza = new zzi();
        zzi.zzb = zze.zza;
    }

    public zzi() {
        this.zzc = 1;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            if(zzi.class == class0) {
                zzi zzi0 = (zzi)object0;
                return true;
            }
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return 0x1D02666F;
    }

    public final AudioAttributes zza() {
        if(this.a == null) {
            AudioAttributes.Builder audioAttributes$Builder0 = new AudioAttributes.Builder().setContentType(0).setFlags(0).setUsage(1);
            int v = zzeg.zza;
            if(v >= 29) {
                P5.a(audioAttributes$Builder0, 1);
            }
            if(v >= 0x20) {
                Q8.a(audioAttributes$Builder0, 0);
            }
            this.a = audioAttributes$Builder0.build();
        }
        return this.a;
    }
}

