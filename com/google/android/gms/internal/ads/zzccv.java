package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzt;

public final class zzccv implements zzban {
    public final Context i;
    public final Object j;
    public final String k;
    public boolean l;

    public zzccv(Context context0, String s) {
        if(context0.getApplicationContext() != null) {
            context0 = context0.getApplicationContext();
        }
        this.i = context0;
        this.k = s;
        this.l = false;
        this.j = new Object();
    }

    public final String zza() {
        return this.k;
    }

    public final void zzb(boolean z) {
        if(!zzt.zzn().zzu(this.i)) {
            return;
        }
        synchronized(this.j) {
            if(this.l == z) {
                return;
            }
            this.l = z;
            if(TextUtils.isEmpty(this.k)) {
                return;
            }
            if(this.l) {
                zzt.zzn().zzh(this.i, this.k);
            }
            else {
                zzt.zzn().zzi(this.i, this.k);
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzban
    public final void zzc(zzbam zzbam0) {
        this.zzb(zzbam0.zzj);
    }
}

