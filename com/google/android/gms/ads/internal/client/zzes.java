package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzbqn;
import com.google.android.gms.internal.ads.zzbua;
import com.google.android.gms.internal.ads.zzcfb;
import com.google.android.gms.internal.ads.zzcfi;
import java.util.Collections;
import java.util.List;

public final class zzes extends zzcl {
    public zzbqn i;

    @Override  // com.google.android.gms.ads.internal.client.zzcm
    public final float zze() throws RemoteException {
        return 1.0f;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzcm
    public final String zzf() {
        return "";
    }

    @Override  // com.google.android.gms.ads.internal.client.zzcm
    public final List zzg() throws RemoteException {
        return Collections.emptyList();
    }

    @Override  // com.google.android.gms.ads.internal.client.zzcm
    public final void zzh(String s) throws RemoteException {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzcm
    public final void zzi() {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzcm
    public final void zzj() throws RemoteException {
        zzcfi.zzg("The initialization is not processed because MobileAdsSettingsManager is not created successfully.");
        zzer zzer0 = new zzer(this);
        zzcfb.zza.post(zzer0);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzcm
    public final void zzk(String s, IObjectWrapper iObjectWrapper0) throws RemoteException {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzcm
    public final void zzl(zzcy zzcy0) {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzcm
    public final void zzm(IObjectWrapper iObjectWrapper0, String s) throws RemoteException {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzcm
    public final void zzn(zzbua zzbua0) throws RemoteException {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzcm
    public final void zzo(boolean z) throws RemoteException {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzcm
    public final void zzp(float f) throws RemoteException {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzcm
    public final void zzq(String s) throws RemoteException {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzcm
    public final void zzr(zzbqn zzbqn0) throws RemoteException {
        this.i = zzbqn0;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzcm
    public final void zzs(zzez zzez0) throws RemoteException {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzcm
    public final boolean zzt() throws RemoteException {
        return false;
    }
}

