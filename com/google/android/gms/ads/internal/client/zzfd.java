package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import com.google.android.gms.ads.formats.ShouldDelayBannerRenderingListener;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbmr;

public final class zzfd extends zzbmr {
    public final ShouldDelayBannerRenderingListener i;

    public zzfd(ShouldDelayBannerRenderingListener shouldDelayBannerRenderingListener0) {
        this.i = shouldDelayBannerRenderingListener0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbms
    public final boolean zzb(IObjectWrapper iObjectWrapper0) throws RemoteException {
        Runnable runnable0 = (Runnable)ObjectWrapper.unwrap(iObjectWrapper0);
        return this.i.shouldDelayBannerRendering(runnable0);
    }
}

