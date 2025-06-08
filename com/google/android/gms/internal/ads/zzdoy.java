package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager.LayoutParams;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zzbx;
import java.util.Map;

public final class zzdoy implements zzbom {
    public final zzdpa zza;
    public final View zzb;
    public final WindowManager zzc;

    public zzdoy(zzdpa zzdpa0, View view0, WindowManager windowManager0) {
        this.zza = zzdpa0;
        this.zzb = view0;
        this.zzc = windowManager0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbom
    public final void zza(Object object0, Map map0) {
        zzdpa zzdpa0 = this.zza;
        View view0 = this.zzb;
        WindowManager windowManager0 = this.zzc;
        zzcli zzcli0 = (zzcli)object0;
        zzdpa0.getClass();
        zzcli0.zzP().zzz(new zzdou(zzdpa0, map0));
        if(map0 != null) {
            Context context0 = view0.getContext();
            String s = (String)map0.get("validator_width");
            int v = zzdpa.a(context0, ((int)(((Integer)zzay.zzc().zzb(zzbhz.zzgL)))), s);
            String s1 = (String)map0.get("validator_height");
            int v1 = zzdpa.a(context0, ((int)(((Integer)zzay.zzc().zzb(zzbhz.zzgM)))), s1);
            int v2 = zzdpa.a(context0, 0, ((String)map0.get("validator_x")));
            int v3 = zzdpa.a(context0, 0, ((String)map0.get("validator_y")));
            zzcli0.zzai(zzcmx.zzb(v, v1));
            try {
                zzcli0.zzI().getSettings().setUseWideViewPort(((Boolean)zzay.zzc().zzb(zzbhz.zzgN)).booleanValue());
                zzcli0.zzI().getSettings().setLoadWithOverviewMode(((Boolean)zzay.zzc().zzb(zzbhz.zzgO)).booleanValue());
            }
            catch(NullPointerException unused_ex) {
            }
            WindowManager.LayoutParams windowManager$LayoutParams0 = zzbx.zzb();
            windowManager$LayoutParams0.x = v2;
            windowManager$LayoutParams0.y = v3;
            windowManager0.updateViewLayout(zzcli0.zzH(), windowManager$LayoutParams0);
            Object object1 = map0.get("orientation");
            Rect rect0 = new Rect();
            if(view0.getGlobalVisibleRect(rect0)) {
                zzdpa0.c = new zzdov(view0, zzcli0, ((String)object1), windowManager$LayoutParams0, ("1".equals(((String)object1)) || "2".equals(((String)object1)) ? rect0.bottom : rect0.top) - v3, windowManager0);
                ViewTreeObserver viewTreeObserver0 = view0.getViewTreeObserver();
                if(viewTreeObserver0 != null && viewTreeObserver0.isAlive()) {
                    viewTreeObserver0.addOnScrollChangedListener(zzdpa0.c);
                }
            }
            String s2 = (String)map0.get("overlay_url");
            if(!TextUtils.isEmpty(s2)) {
                zzcli0.loadUrl(s2);
            }
        }
    }
}

