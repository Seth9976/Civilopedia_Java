package com.google.android.gms.internal.consent_sdk;

import java.util.concurrent.Executor;

public final class zzh {
    public final Executor a;

    public zzh(Executor executor0) {
        this.a = executor0;
    }

    public final Executor zza() {
        return this.a;
    }

    public final void zzb(String s, String s1, zzg[] arr_zzg) {
        zze zze0 = new zze(s, s1, arr_zzg);
        this.a.execute(zze0);
    }
}

