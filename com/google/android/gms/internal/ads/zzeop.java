package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzw;

public final class zzeop implements zzetf {
    public final zzw a;
    public final zzcfo b;
    public final boolean c;

    public zzeop(zzw zzw0, zzcfo zzcfo0, boolean z) {
        this.a = zzw0;
        this.b = zzcfo0;
        this.c = z;
    }

    @Override  // com.google.android.gms.internal.ads.zzetf
    public final void zzf(Object object0) {
        int v = (int)(((Integer)zzay.zzc().zzb(zzbhz.zzek)));
        if(this.b.zzc >= v) {
            ((Bundle)object0).putString("app_open_version", "2");
        }
        if(((Boolean)zzay.zzc().zzb(zzbhz.zzel)).booleanValue()) {
            ((Bundle)object0).putBoolean("app_switched", this.c);
        }
        zzw zzw0 = this.a;
        if(zzw0 != null) {
            int v1 = zzw0.zza;
            if(v1 == 1) {
                ((Bundle)object0).putString("avo", "p");
                return;
            }
            if(v1 == 2) {
                ((Bundle)object0).putString("avo", "l");
            }
        }
    }
}

