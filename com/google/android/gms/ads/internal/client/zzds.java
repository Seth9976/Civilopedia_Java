package com.google.android.gms.ads.internal.client;

import android.view.View;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

public final class zzds implements Runnable {
    public final zzdu zza;
    public final IObjectWrapper zzb;

    public zzds(zzdu zzdu0, IObjectWrapper iObjectWrapper0) {
        this.zza = zzdu0;
        this.zzb = iObjectWrapper0;
    }

    @Override
    public final void run() {
        this.zza.getClass();
        View view0 = (View)ObjectWrapper.unwrap(this.zzb);
        this.zza.m.addView(view0);
    }
}

