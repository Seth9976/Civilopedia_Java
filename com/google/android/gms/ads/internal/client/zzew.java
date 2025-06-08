package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzcbb;
import com.google.android.gms.internal.ads.zzcbd;
import com.google.android.gms.internal.ads.zzcbh;
import com.google.android.gms.internal.ads.zzcbl;
import com.google.android.gms.internal.ads.zzcbm;
import com.google.android.gms.internal.ads.zzcbs;
import com.google.android.gms.internal.ads.zzcfb;
import com.google.android.gms.internal.ads.zzcfi;

public final class zzew extends zzcbd {
    @Override  // com.google.android.gms.internal.ads.zzcbe
    public final Bundle zzb() throws RemoteException {
        return new Bundle();
    }

    @Override  // com.google.android.gms.internal.ads.zzcbe
    public final zzdh zzc() {
        return null;
    }

    @Override  // com.google.android.gms.internal.ads.zzcbe
    public final zzcbb zzd() {
        return null;
    }

    @Override  // com.google.android.gms.internal.ads.zzcbe
    public final String zze() throws RemoteException {
        return "";
    }

    @Override  // com.google.android.gms.internal.ads.zzcbe
    public final void zzf(zzl zzl0, zzcbl zzcbl0) throws RemoteException {
        zzcfi.zzg("This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date.");
        zzev zzev0 = new zzev(zzcbl0);
        zzcfb.zza.post(zzev0);
    }

    @Override  // com.google.android.gms.internal.ads.zzcbe
    public final void zzg(zzl zzl0, zzcbl zzcbl0) throws RemoteException {
        zzcfi.zzg("This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date.");
        zzev zzev0 = new zzev(zzcbl0);
        zzcfb.zza.post(zzev0);
    }

    @Override  // com.google.android.gms.internal.ads.zzcbe
    public final void zzh(boolean z) {
    }

    @Override  // com.google.android.gms.internal.ads.zzcbe
    public final void zzi(zzdb zzdb0) throws RemoteException {
    }

    @Override  // com.google.android.gms.internal.ads.zzcbe
    public final void zzj(zzde zzde0) {
    }

    @Override  // com.google.android.gms.internal.ads.zzcbe
    public final void zzk(zzcbh zzcbh0) throws RemoteException {
    }

    @Override  // com.google.android.gms.internal.ads.zzcbe
    public final void zzl(zzcbs zzcbs0) {
    }

    @Override  // com.google.android.gms.internal.ads.zzcbe
    public final void zzm(IObjectWrapper iObjectWrapper0) throws RemoteException {
    }

    @Override  // com.google.android.gms.internal.ads.zzcbe
    public final void zzn(IObjectWrapper iObjectWrapper0, boolean z) {
    }

    @Override  // com.google.android.gms.internal.ads.zzcbe
    public final boolean zzo() throws RemoteException {
        return false;
    }

    @Override  // com.google.android.gms.internal.ads.zzcbe
    public final void zzp(zzcbm zzcbm0) throws RemoteException {
    }
}

