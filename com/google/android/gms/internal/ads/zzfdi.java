package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zze;
import java.util.HashSet;

public final class zzfdi implements zzdbw {
    public final HashSet i;
    public final Context j;
    public final zzcev k;

    public zzfdi(Context context0, zzcev zzcev0) {
        this.i = new HashSet();
        this.j = context0;
        this.k = zzcev0;
    }

    @Override  // com.google.android.gms.internal.ads.zzdbw
    public final void zza(zze zze0) {
        synchronized(this) {
            if(zze0.zza != 3) {
                this.k.zzi(this.i);
            }
        }
    }

    public final Bundle zzb() {
        return this.k.zzk(this.j, this);
    }

    public final void zzc(HashSet hashSet0) {
        synchronized(this) {
            this.i.clear();
            this.i.addAll(hashSet0);
        }
    }
}

