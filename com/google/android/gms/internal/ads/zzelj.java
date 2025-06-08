package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.client.zzbc;
import com.google.android.gms.ads.internal.client.zzbf;
import com.google.android.gms.ads.internal.client.zzbi;
import com.google.android.gms.ads.internal.client.zzbr;
import com.google.android.gms.ads.internal.client.zzbw;
import com.google.android.gms.ads.internal.client.zzbz;
import com.google.android.gms.ads.internal.client.zzcd;
import com.google.android.gms.ads.internal.client.zzcg;
import com.google.android.gms.ads.internal.client.zzde;
import com.google.android.gms.ads.internal.client.zzdh;
import com.google.android.gms.ads.internal.client.zzdk;
import com.google.android.gms.ads.internal.client.zzdo;
import com.google.android.gms.ads.internal.client.zzff;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.client.zzw;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Collections;
import java.util.List;

public final class zzelj extends zzbr {
    public final Context i;
    public final zzbf j;
    public final zzfcd k;
    public final zzcvv l;
    public final FrameLayout m;

    public zzelj(Context context0, zzbf zzbf0, zzfcd zzfcd0, zzcvv zzcvv0) {
        this.i = context0;
        this.j = zzbf0;
        this.k = zzfcd0;
        this.l = zzcvv0;
        FrameLayout frameLayout0 = new FrameLayout(context0);
        frameLayout0.removeAllViews();
        frameLayout0.addView(zzcvv0.zzc(), zzs.zzn());
        frameLayout0.setMinimumHeight(this.zzg().zzc);
        frameLayout0.setMinimumWidth(this.zzg().zzf);
        this.m = frameLayout0;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final void zzA() throws RemoteException {
        this.l.zzg();
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final void zzB() throws RemoteException {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        this.l.zzm().zzc(null);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final void zzC(zzbc zzbc0) throws RemoteException {
        zzcfi.zzi("setAdClickListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final void zzD(zzbf zzbf0) throws RemoteException {
        zzcfi.zzi("setAdListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final void zzE(zzbw zzbw0) throws RemoteException {
        zzcfi.zzi("setAdMetadataListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final void zzF(zzq zzq0) throws RemoteException {
        Preconditions.checkMainThread("setAdSize must be called on the main UI thread.");
        zzcvv zzcvv0 = this.l;
        if(zzcvv0 != null) {
            zzcvv0.zzh(this.m, zzq0);
        }
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final void zzG(zzbz zzbz0) throws RemoteException {
        zzemh zzemh0 = this.k.zzc;
        if(zzemh0 != null) {
            zzemh0.zzi(zzbz0);
        }
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final void zzH(zzbcj zzbcj0) throws RemoteException {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final void zzI(zzw zzw0) throws RemoteException {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final void zzJ(zzcg zzcg0) {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final void zzK(zzdo zzdo0) throws RemoteException {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final void zzL(boolean z) throws RemoteException {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final void zzM(zzbye zzbye0) throws RemoteException {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final void zzN(boolean z) throws RemoteException {
        zzcfi.zzi("setManualImpressionsEnabled is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final void zzO(zzbiu zzbiu0) throws RemoteException {
        zzcfi.zzi("setOnCustomRenderedAdLoadedListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final void zzP(zzde zzde0) {
        zzcfi.zzi("setOnPaidEventListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final void zzQ(zzbyh zzbyh0, String s) throws RemoteException {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final void zzR(String s) throws RemoteException {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final void zzS(zzcar zzcar0) throws RemoteException {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final void zzT(String s) throws RemoteException {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final void zzU(zzff zzff0) throws RemoteException {
        zzcfi.zzi("setVideoOptions is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final void zzW(IObjectWrapper iObjectWrapper0) {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final void zzX() throws RemoteException {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final boolean zzY() throws RemoteException {
        return false;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final boolean zzZ() throws RemoteException {
        return false;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final boolean zzaa(zzl zzl0) throws RemoteException {
        zzcfi.zzi("loadAd is not supported for an Ad Manager AdView returned from AdLoader.");
        return false;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final void zzab(zzcd zzcd0) throws RemoteException {
        zzcfi.zzi("setCorrelationIdProvider is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final Bundle zzd() throws RemoteException {
        zzcfi.zzi("getAdMetadata is not supported in Ad Manager AdView returned by AdLoader.");
        return new Bundle();
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final zzq zzg() {
        Preconditions.checkMainThread("getAdSize must be called on the main UI thread.");
        List list0 = Collections.singletonList(this.l.zze());
        return zzfch.zza(this.i, list0);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final zzbf zzi() throws RemoteException {
        return this.j;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final zzbz zzj() throws RemoteException {
        return this.k.zzn;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final zzdh zzk() {
        return this.l.zzl();
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final zzdk zzl() throws RemoteException {
        return this.l.zzd();
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final IObjectWrapper zzn() throws RemoteException {
        return ObjectWrapper.wrap(this.m);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final String zzr() throws RemoteException {
        return this.k.zzf;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final String zzs() throws RemoteException {
        return this.l.zzl() == null ? null : this.l.zzl().zzg();
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final String zzt() throws RemoteException {
        return this.l.zzl() == null ? null : this.l.zzl().zzg();
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final void zzx() throws RemoteException {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        this.l.zzV();
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final void zzy(zzl zzl0, zzbi zzbi0) {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final void zzz() throws RemoteException {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        this.l.zzm().zzb(null);
    }
}

