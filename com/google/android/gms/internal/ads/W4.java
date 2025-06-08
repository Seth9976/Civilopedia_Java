package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.gms.ads.internal.client.zzay;
import java.util.Map;

public final class w4 implements zzban {
    public final String i;
    public final zzdnc j;

    public w4(zzdnc zzdnc0, String s) {
        this.j = zzdnc0;
        this.i = s;
    }

    @Override  // com.google.android.gms.internal.ads.zzban
    public final void zzc(zzbam zzbam0) {
        if(((Boolean)zzay.zzc().zzb(zzbhz.zzbv)).booleanValue()) {
            synchronized(this) {
                if(zzbam0.zzj) {
                    zzdnc zzdnc0 = this.j;
                    if(zzdnc0.t != null) {
                        zzdnc0.D.put(this.i, Boolean.TRUE);
                        View view0 = this.j.t.zzf();
                        Map map0 = this.j.t.zzl();
                        Map map1 = this.j.t.zzm();
                        this.j.zzv(view0, map0, map1, true);
                        return;
                    }
                    return;
                }
            }
            return;
        }
        if(zzbam0.zzj) {
            this.j.D.put(this.i, Boolean.TRUE);
            View view1 = this.j.t.zzf();
            Map map2 = this.j.t.zzl();
            Map map3 = this.j.t.zzm();
            this.j.zzv(view1, map2, map3, true);
        }
    }
}

