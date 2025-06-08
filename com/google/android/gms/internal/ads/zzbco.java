package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.appopen.AppOpenAd.AppOpenAdLoadCallback;
import com.google.android.gms.ads.appopen.AppOpenAd.AppOpenAdOrientation;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzbs;
import com.google.android.gms.ads.internal.client.zzdr;
import com.google.android.gms.ads.internal.client.zzp;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.client.zzw;

public final class zzbco {
    public zzbs a;
    public final Context b;
    public final String c;
    public final zzdr d;
    public final int e;
    public final AppOpenAdLoadCallback f;
    public final zzbtx g;
    public final zzp h;

    public zzbco(Context context0, String s, zzdr zzdr0, @AppOpenAdOrientation int v, AppOpenAdLoadCallback appOpenAd$AppOpenAdLoadCallback0) {
        this.g = new zzbtx();
        this.b = context0;
        this.c = s;
        this.d = zzdr0;
        this.e = v;
        this.f = appOpenAd$AppOpenAdLoadCallback0;
        this.h = zzp.zza;
    }

    public final void zza() {
        try {
            String s = this.c;
            Context context0 = this.b;
            this.a = zzaw.zza().zzd(context0, zzq.zzb(), s, this.g);
            zzw zzw0 = new zzw(this.e);
            zzbs zzbs0 = this.a;
            if(zzbs0 != null) {
                zzbs0.zzI(zzw0);
                this.a.zzH(new zzbcb(this.f, s));
                this.a.zzaa(this.h.zza(context0, this.d));
            }
        }
        catch(RemoteException remoteException0) {
            zzcfi.zzl("#007 Could not call remote method.", remoteException0);
        }
    }
}

