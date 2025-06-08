package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzay;
import java.util.Set;
import java.util.WeakHashMap;

public final class zzdjb extends zzdhc implements zzban {
    public final WeakHashMap j;
    public final Context k;
    public final zzfbl l;

    public zzdjb(Context context0, Set set0, zzfbl zzfbl0) {
        super(set0);
        this.j = new WeakHashMap(1);
        this.k = context0;
        this.l = zzfbl0;
    }

    public final void zza(View view0) {
        synchronized(this) {
            zzbao zzbao0 = (zzbao)this.j.get(view0);
            if(zzbao0 == null) {
                zzbao0 = new zzbao(this.k, view0);
                zzbao0.zzc(this);
                this.j.put(view0, zzbao0);
            }
            if(this.l.zzY && ((Boolean)zzay.zzc().zzb(zzbhz.zzbh)).booleanValue()) {
                zzbao0.zzg(((long)(((Long)zzay.zzc().zzb(zzbhz.zzbg)))));
                return;
            }
            zzbao0.zzf();
        }
    }

    public final void zzb(View view0) {
        synchronized(this) {
            if(this.j.containsKey(view0)) {
                ((zzbao)this.j.get(view0)).zze(this);
                this.j.remove(view0);
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzban
    public final void zzc(zzbam zzbam0) {
        synchronized(this) {
            this.a(new zzdja(zzbam0));
        }
    }
}

