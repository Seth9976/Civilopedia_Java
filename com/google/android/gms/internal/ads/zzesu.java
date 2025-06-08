package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.dynamite.DynamiteModule;
import java.util.concurrent.Callable;

public final class zzesu implements Callable {
    public final zzesv zza;

    public zzesu(zzesv zzesv0) {
        this.zza = zzesv0;
    }

    @Override
    public final Object call() {
        Context context0 = this.zza.b;
        boolean z = Wrappers.packageManager(context0).isCallerInstantApp();
        boolean z1 = zzs.zzA(context0);
        String s = this.zza.c.zza;
        boolean z2 = zzs.zzB();
        return context0.getApplicationInfo() == null ? new zzesw(z, z1, s, z2, 0, DynamiteModule.getRemoteVersion(context0, "com.google.android.gms.ads.dynamite"), DynamiteModule.getLocalVersion(context0, "com.google.android.gms.ads.dynamite")) : new zzesw(z, z1, s, z2, 35, DynamiteModule.getRemoteVersion(context0, "com.google.android.gms.ads.dynamite"), DynamiteModule.getLocalVersion(context0, "com.google.android.gms.ads.dynamite"));
    }
}

