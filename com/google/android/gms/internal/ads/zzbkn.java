package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

public final class zzbkn extends zzbla {
    public final Drawable i;
    public final Uri j;
    public final double k;
    public final int l;
    public final int m;

    public zzbkn(Drawable drawable0, Uri uri0, double f, int v, int v1) {
        this.i = drawable0;
        this.j = uri0;
        this.k = f;
        this.l = v;
        this.m = v1;
    }

    @Override  // com.google.android.gms.internal.ads.zzblb
    public final double zzb() {
        return this.k;
    }

    @Override  // com.google.android.gms.internal.ads.zzblb
    public final int zzc() {
        return this.m;
    }

    @Override  // com.google.android.gms.internal.ads.zzblb
    public final int zzd() {
        return this.l;
    }

    @Override  // com.google.android.gms.internal.ads.zzblb
    public final Uri zze() throws RemoteException {
        return this.j;
    }

    @Override  // com.google.android.gms.internal.ads.zzblb
    public final IObjectWrapper zzf() throws RemoteException {
        return ObjectWrapper.wrap(this.i);
    }
}

