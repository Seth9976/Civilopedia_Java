package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.NativeAd.Image;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

public final class zzblc extends Image {
    public final zzblb a;
    public final Drawable b;
    public final Uri c;
    public final double d;
    public final int e;
    public final int f;

    public zzblc(zzblb zzblb0) {
        int v1;
        int v;
        double f;
        Drawable drawable0;
        this.a = zzblb0;
        Uri uri0 = null;
        try {
            IObjectWrapper iObjectWrapper0 = zzblb0.zzf();
            if(iObjectWrapper0 == null) {
                goto label_11;
            }
            else {
                drawable0 = (Drawable)ObjectWrapper.unwrap(iObjectWrapper0);
            }
        }
        catch(RemoteException remoteException0) {
            zzcfi.zzh("", remoteException0);
            drawable0 = null;
        }
        goto label_12;
    label_11:
        drawable0 = null;
        try {
        label_12:
            this.b = drawable0;
            uri0 = this.a.zze();
        }
        catch(RemoteException remoteException1) {
            zzcfi.zzh("", remoteException1);
        }
        try {
            this.c = uri0;
            f = this.a.zzb();
        }
        catch(RemoteException remoteException2) {
            zzcfi.zzh("", remoteException2);
            f = 1.0;
        }
        try {
            this.d = f;
            v = -1;
            v1 = this.a.zzd();
        }
        catch(RemoteException remoteException3) {
            zzcfi.zzh("", remoteException3);
            v1 = -1;
        }
        try {
            this.e = v1;
            v = this.a.zzc();
        }
        catch(RemoteException remoteException4) {
            zzcfi.zzh("", remoteException4);
        }
        this.f = v;
    }

    @Override  // com.google.android.gms.ads.formats.NativeAd$Image
    public final Drawable getDrawable() {
        return this.b;
    }

    @Override  // com.google.android.gms.ads.formats.NativeAd$Image
    public final double getScale() {
        return this.d;
    }

    @Override  // com.google.android.gms.ads.formats.NativeAd$Image
    public final Uri getUri() {
        return this.c;
    }

    @Override  // com.google.android.gms.ads.formats.NativeAd$Image
    public final int zza() {
        return this.f;
    }

    @Override  // com.google.android.gms.ads.formats.NativeAd$Image
    public final int zzb() {
        return this.e;
    }
}

