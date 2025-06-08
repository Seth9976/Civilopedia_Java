package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.view.ViewGroup;
import android.view.Window;
import com.google.android.gms.ads.internal.client.zzay;
import java.util.Set;
import java.util.concurrent.Callable;

public final class zzeqp implements Callable {
    public final zzeqq zza;

    public zzeqp(zzeqq zzeqq0) {
        this.zza = zzeqq0;
    }

    @Override
    public final Object call() {
        zzeqq zzeqq0 = this.zza;
        zzeqq0.getClass();
        boolean z = ((Boolean)zzay.zzc().zzb(zzbhz.zzeR)).booleanValue();
        Set set0 = zzeqq0.d;
        if(z) {
            ViewGroup viewGroup0 = zzeqq0.b;
            if(viewGroup0 != null && set0.contains("banner")) {
                return new zzeqr(Boolean.valueOf(viewGroup0.isHardwareAccelerated()));
            }
        }
        Boolean boolean0 = null;
        if(((Boolean)zzay.zzc().zzb(zzbhz.zzeS)).booleanValue() && set0.contains("native")) {
            Context context0 = zzeqq0.c;
            if(context0 instanceof Activity) {
                boolean z1 = false;
                Activity activity0 = (Activity)context0;
                Window window0 = activity0.getWindow();
                if(window0 != null && (window0.getAttributes().flags & 0x1000000) != 0) {
                    return new zzeqr(Boolean.TRUE);
                }
                try {
                    if((activity0.getPackageManager().getActivityInfo(activity0.getComponentName(), 0).flags & 0x200) != 0) {
                        z1 = true;
                    }
                    boolean0 = Boolean.valueOf(z1);
                }
                catch(PackageManager.NameNotFoundException unused_ex) {
                }
                return new zzeqr(boolean0);
            }
        }
        return new zzeqr(null);
    }
}

