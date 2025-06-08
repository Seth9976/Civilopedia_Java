package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import com.google.android.gms.common.wrappers.Wrappers;

public final class zzeac implements zzgqu {
    public final zzgrh a;
    public final zzgrh b;

    public zzeac(zzgrh zzgrh0, zzgrh zzgrh1) {
        this.a = zzgrh0;
        this.b = zzgrh1;
    }

    @Override  // com.google.android.gms.internal.ads.zzgrh
    public final Object zzb() {
        Context context0 = (Context)this.a.zzb();
        ApplicationInfo applicationInfo0 = ((zzdzx)this.b).zza();
        try {
            return Wrappers.packageManager(context0).getPackageInfo(applicationInfo0.packageName, 0);
        }
        catch(PackageManager.NameNotFoundException unused_ex) {
            return null;
        }
    }
}

