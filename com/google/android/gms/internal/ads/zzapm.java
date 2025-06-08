package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzay;

public final class zzapm extends zzaqn {
    public final Activity h;
    public final View i;

    public zzapm(zzapc zzapc0, String s, String s1, zzali zzali0, int v, int v1, View view0, Activity activity0) {
        super(zzapc0, "bJ19ecmml/ZL+PAjNo6P4un4UIg2zol83OavxH1sy4lr9vgJAAspRAybhuIko55U", "vAwaartPSmuJV+jFjOXlfyM3UPFY8tl7jDP13kq4YYw=", zzali0, v, 62);
        this.i = view0;
        this.h = activity0;
    }

    @Override  // com.google.android.gms.internal.ads.zzaqn
    public final void a() {
        if(this.i == null) {
            return;
        }
        Boolean boolean0 = (Boolean)zzay.zzc().zzb(zzbhz.zzce);
        Object[] arr_object = (Object[])this.e.invoke(null, this.i, this.h, boolean0);
        synchronized(this.d) {
            this.d.zzc(((long)(((Long)arr_object[0]))));
            this.d.zze(((long)(((Long)arr_object[1]))));
            if(boolean0.booleanValue()) {
                this.d.zzd(((String)arr_object[2]));
            }
        }
    }
}

