package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;

public final class zzers implements zzetf, zzetg {
    public final ApplicationInfo a;
    public final PackageInfo b;

    public zzers(ApplicationInfo applicationInfo0, PackageInfo packageInfo0) {
        this.a = applicationInfo0;
        this.b = packageInfo0;
    }

    @Override  // com.google.android.gms.internal.ads.zzetg
    public final int zza() {
        return 29;
    }

    @Override  // com.google.android.gms.internal.ads.zzetg
    public final zzfvl zzb() {
        return zzfvc.zzi(this);
    }

    @Override  // com.google.android.gms.internal.ads.zzetf
    public final void zzf(Object object0) {
        String s = null;
        PackageInfo packageInfo0 = this.b;
        Integer integer0 = packageInfo0 == null ? null : packageInfo0.versionCode;
        ((Bundle)object0).putString("pn", this.a.packageName);
        if(integer0 != null) {
            ((Bundle)object0).putInt("vc", ((int)integer0));
        }
        if(packageInfo0 != null) {
            s = packageInfo0.versionName;
        }
        if(s != null) {
            ((Bundle)object0).putString("vnm", s);
        }
    }
}

