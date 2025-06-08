package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.client.zzq;
import java.lang.ref.WeakReference;

public final class zzdpa {
    public final zzdtp a;
    public final zzdse b;
    public zzdov c;

    public zzdpa(zzdtp zzdtp0, zzdse zzdse0) {
        this.a = zzdtp0;
        this.b = zzdse0;
        this.c = null;
    }

    public static final int a(Context context0, int v, String s) {
        try {
            v = Integer.parseInt(s);
        }
        catch(NumberFormatException unused_ex) {
        }
        return zzcfb.zzw(context0, v);
    }

    public final View zza(View view0, WindowManager windowManager0) throws zzclt {
        zzq zzq0 = zzq.zzc();
        zzcli zzcli0 = this.a.zza(zzq0, null, null);
        ((View)zzcli0).setVisibility(4);
        ((View)zzcli0).setContentDescription("policy_validator");
        zzcli0.zzaf("/sendMessageToSdk", new zzdow(this));
        zzcli0.zzaf("/hideValidatorOverlay", new zzdox(this, windowManager0, view0));
        zzcli0.zzaf("/open", new zzbox(null, null, null, null, null));
        WeakReference weakReference0 = new WeakReference(zzcli0);
        zzdoy zzdoy0 = new zzdoy(this, view0, windowManager0);
        this.b.zzj(weakReference0, "/loadNativeAdPolicyViolations", zzdoy0);
        WeakReference weakReference1 = new WeakReference(zzcli0);
        this.b.zzj(weakReference1, "/showValidatorOverlay", zzdoz.zza);
        return (View)zzcli0;
    }
}

