package com.google.android.gms.internal.ads;

import android.os.Binder;
import com.google.android.gms.ads.internal.util.zzs;
import java.util.concurrent.ExecutionException;

public final class zzdzp {
    public final zzfvm a;
    public final zzfvm b;
    public final zzeaw c;
    public final zzgqo d;

    public zzdzp(zzfvm zzfvm0, zzfvm zzfvm1, zzeaw zzeaw0, zzgqo zzgqo0) {
        this.a = zzfvm0;
        this.b = zzfvm1;
        this.c = zzeaw0;
        this.d = zzgqo0;
    }

    public final zzfvl zzb(zzbzv zzbzv0) {
        zzfvl zzfvl0;
        boolean z = zzs.zzy(zzbzv0.zzd);
        zzfvm zzfvm0 = this.b;
        if(z) {
            zzfvl0 = zzfvc.zzh(new zzebn(1));
        }
        else {
            zzdzm zzdzm0 = new zzdzm(this, zzbzv0);
            zzfvl0 = zzfvc.zzg(this.a.zzb(zzdzm0), ExecutionException.class, zzdzn.zza, zzfvm0);
        }
        zzdzo zzdzo0 = new zzdzo(this, zzbzv0, Binder.getCallingUid());
        return zzfvc.zzg(zzfvl0, zzebn.class, zzdzo0, zzfvm0);
    }
}

