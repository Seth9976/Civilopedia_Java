package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import com.google.android.gms.ads.internal.util.zzg;
import java.util.ArrayList;

public final class zzerj implements zzetg {
    public final zzfvm a;
    public final zzfcd b;
    public final PackageInfo c;
    public final zzg d;

    public zzerj(zzfvm zzfvm0, zzfcd zzfcd0, PackageInfo packageInfo0, zzg zzg0) {
        this.a = zzfvm0;
        this.b = zzfcd0;
        this.c = packageInfo0;
        this.d = zzg0;
    }

    @Override  // com.google.android.gms.internal.ads.zzetg
    public final int zza() {
        return 26;
    }

    @Override  // com.google.android.gms.internal.ads.zzetg
    public final zzfvl zzb() {
        zzeri zzeri0 = () -> {
            ArrayList arrayList0 = this.b.zzg;
            if(arrayList0 == null) {
                return zzerf.zza;
            }
            return arrayList0.isEmpty() ? zzerg.zza : new zzerh(this, arrayList0);
        };
        return this.a.zzb(zzeri0);
    }
}

