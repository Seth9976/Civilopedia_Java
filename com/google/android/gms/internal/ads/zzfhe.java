package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zze;

public final class zzfhe implements zzdcj, zzdiq, zzdiu {
    public final zzfhs i;
    public final zzfhh j;

    public zzfhe(Context context0, zzfhs zzfhs0) {
        this.i = zzfhs0;
        this.j = zzfhg.zza(context0, 13);
    }

    @Override  // com.google.android.gms.internal.ads.zzdiu
    public final void zza() {
    }

    @Override  // com.google.android.gms.internal.ads.zzdiu
    public final void zzb() {
        if(((Boolean)zzbji.zzd.zze()).booleanValue()) {
            this.j.zze(true);
            this.i.zza(this.j);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzdiq
    public final void zze() {
    }

    @Override  // com.google.android.gms.internal.ads.zzdiq
    public final void zzf() {
        if(((Boolean)zzbji.zzd.zze()).booleanValue()) {
            this.j.zzf();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzdcj
    public final void zzk(zze zze0) {
        if(((Boolean)zzbji.zzd.zze()).booleanValue()) {
            this.j.zze(false);
            this.i.zza(this.j);
        }
    }
}

