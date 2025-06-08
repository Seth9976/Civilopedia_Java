package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import java.util.concurrent.Callable;

public final class zzfli implements Callable {
    public final zzfln zza;

    public zzfli(zzfln zzfln0) {
        this.zza = zzfln0;
    }

    @Override
    public final Object call() {
        PackageInfo packageInfo0 = this.zza.a.getPackageManager().getPackageInfo("com.spears.civilopedia", 0);
        return zzflc.zza(this.zza.a, "com.spears.civilopedia", Integer.toString(packageInfo0.versionCode));
    }
}

