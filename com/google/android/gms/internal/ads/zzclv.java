package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

public final class zzclv implements Runnable {
    public final IObjectWrapper zza;

    public zzclv(IObjectWrapper iObjectWrapper0) {
        this.zza = iObjectWrapper0;
    }

    @Override
    public final void run() {
        IObjectWrapper iObjectWrapper0 = this.zza;
        if(((Boolean)zzay.zzc().zzb(zzbhz.zzeb)).booleanValue() && false) {
            Object object0 = ObjectWrapper.unwrap(iObjectWrapper0);
            if(object0 instanceof zzfin) {
                ((zzfin)object0).zzc();
            }
        }
    }
}

