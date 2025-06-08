package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzay;

public final class zzeog implements zzetg {
    public final zzfvm a;
    public final zzduc b;
    public final zzdyj c;
    public final zzeoj d;

    public zzeog(zzfvm zzfvm0, zzduc zzduc0, zzdyj zzdyj0, zzeoj zzeoj0) {
        this.a = zzfvm0;
        this.b = zzduc0;
        this.c = zzdyj0;
        this.d = zzeoj0;
    }

    @Override  // com.google.android.gms.internal.ads.zzetg
    public final int zza() {
        return 1;
    }

    @Override  // com.google.android.gms.internal.ads.zzetg
    public final zzfvl zzb() {
        if(!zzfpi.zzd(((String)zzay.zzc().zzb(zzbhz.zzbk)))) {
            zzeoj zzeoj0 = this.d;
            if(!zzeoj0.zzb() && this.c.zzt()) {
                zzeoj0.zza(true);
                zzeof zzeof0 = new zzeof(this);
                return this.a.zzb(zzeof0);
            }
        }
        return zzfvc.zzi(new zzeoi(new Bundle()));
    }
}

