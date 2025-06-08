package com.google.android.gms.common;

import K0.d;
import K0.g;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.AndroidUtilsLight;
import com.google.android.gms.common.util.Hex;
import java.security.MessageDigest;
import java.util.concurrent.Callable;

public final class zze implements Callable {
    public final boolean zza;
    public final String zzb;
    public final d zzc;

    public zze(boolean z, String s, d d0) {
        this.zza = z;
        this.zzb = s;
        this.zzc = d0;
    }

    @Override
    public final Object call() {
        String s = this.zza || !g.b(this.zzb, this.zzc, true, false).a ? "not allowed" : "debug cert rejected";
        MessageDigest messageDigest0 = AndroidUtilsLight.zza("SHA-256");
        Preconditions.checkNotNull(messageDigest0);
        return s + ": pkg=" + this.zzb + ", sha256=" + Hex.bytesToStringLowercase(messageDigest0.digest(this.zzc.c())) + ", atk=" + this.zza + ", ver=12451000.false";
    }
}

