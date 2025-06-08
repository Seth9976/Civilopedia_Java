package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.admanager.AdManagerAdView;
import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.ads.formats.OnAdManagerAdViewLoadedListener;
import com.google.android.gms.ads.internal.client.zzbs;
import com.google.android.gms.ads.internal.client.zzg;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

public final class zzbni extends zzbml {
    public final OnAdManagerAdViewLoadedListener i;

    public zzbni(OnAdManagerAdViewLoadedListener onAdManagerAdViewLoadedListener0) {
        this.i = onAdManagerAdViewLoadedListener0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbmm
    public final void zze(zzbs zzbs0, IObjectWrapper iObjectWrapper0) {
        if(zzbs0 != null && iObjectWrapper0 != null) {
            AdManagerAdView adManagerAdView0 = new AdManagerAdView(((Context)ObjectWrapper.unwrap(iObjectWrapper0)));
            AppEventListener appEventListener0 = null;
            try {
                if(zzbs0.zzi() instanceof zzg) {
                    zzg zzg0 = (zzg)zzbs0.zzi();
                    adManagerAdView0.setAdListener((zzg0 == null ? null : zzg0.zzb()));
                }
                goto label_9;
            }
            catch(RemoteException remoteException0) {
            }
            zzcfi.zzh("", remoteException0);
            try {
            label_9:
                if(zzbs0.zzj() instanceof zzbbb) {
                    zzbbb zzbbb0 = (zzbbb)zzbs0.zzj();
                    if(zzbbb0 != null) {
                        appEventListener0 = zzbbb0.zzb();
                    }
                    adManagerAdView0.setAppEventListener(appEventListener0);
                }
            }
            catch(RemoteException remoteException1) {
                zzcfi.zzh("", remoteException1);
            }
            o0 o00 = new o0(this, adManagerAdView0, zzbs0, 1);
            zzcfb.zza.post(o00);
        }
    }
}

