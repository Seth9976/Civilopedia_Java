package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import java.util.ArrayList;
import org.json.JSONObject;

public final class zzfkf implements zzfjk {
    public final ArrayList a;
    public final zzfjm b;
    public final zzfjy c;
    public final zzfjz d;
    public long e;
    public static final zzfkf f;
    public static final Handler g;
    public static Handler h;
    public static final x0 i;
    public static final x0 j;

    static {
        zzfkf.f = new zzfkf();
        zzfkf.g = new Handler(Looper.getMainLooper());
        zzfkf.h = null;
        zzfkf.i = new x0(8);
        zzfkf.j = new x0(9);
    }

    public zzfkf() {
        this.a = new ArrayList();
        this.c = new zzfjy();
        this.b = new zzfjm();
        this.d = new zzfjz(new zzfki());
    }

    @Override  // com.google.android.gms.internal.ads.zzfjk
    public final void zza(View view0, zzfjl zzfjl0, JSONObject jSONObject0) {
        if(zzfjw.zzb(view0) == null) {
            zzfjy zzfjy0 = this.c;
            int v = zzfjy0.zzj(view0);
            if(v == 3) {
                return;
            }
            JSONObject jSONObject1 = zzfjl0.zza(view0);
            zzfjt.zzc(jSONObject0, jSONObject1);
            String s = zzfjy0.zzd(view0);
            if(s != null) {
                zzfjt.zzb(jSONObject1, s);
                zzfjy0.zzh();
                return;
            }
            zzfjx zzfjx0 = zzfjy0.zzb(view0);
            if(zzfjx0 != null) {
                zzfjt.zzd(jSONObject1, zzfjx0);
            }
            zzfjl0.zzb(view0, jSONObject1, this, v == 1);
        }
    }

    public static zzfkf zzd() {
        return zzfkf.f;
    }

    public final void zzh() {
        Handler handler0 = zzfkf.h;
        if(handler0 != null) {
            handler0.removeCallbacks(zzfkf.j);
            zzfkf.h = null;
        }
    }

    public final void zzi() {
        if(zzfkf.h == null) {
            Handler handler0 = new Handler(Looper.getMainLooper());
            zzfkf.h = handler0;
            handler0.post(zzfkf.i);
            zzfkf.h.postDelayed(zzfkf.j, 200L);
        }
    }

    public final void zzj() {
        Handler handler0 = zzfkf.h;
        if(handler0 != null) {
            handler0.removeCallbacks(zzfkf.j);
            zzfkf.h = null;
        }
        this.a.clear();
        A0 a00 = new A0(this, 11);
        zzfkf.g.post(a00);
    }
}

