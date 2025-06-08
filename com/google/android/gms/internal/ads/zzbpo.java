package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.ads.h5.OnH5AdsEventListener;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.common.internal.Preconditions;

public final class zzbpo {
    public final Context a;
    public final OnH5AdsEventListener b;
    public zzbpk c;

    public zzbpo(Context context0, OnH5AdsEventListener onH5AdsEventListener0) {
        Preconditions.checkState(true, "Android version must be Lollipop or higher");
        Preconditions.checkNotNull(context0);
        Preconditions.checkNotNull(onH5AdsEventListener0);
        this.a = context0;
        this.b = onH5AdsEventListener0;
        zzbhz.zzc(context0);
    }

    public final void zza() {
        if(!((Boolean)zzay.zzc().zzb(zzbhz.zzhS)).booleanValue()) {
            return;
        }
        if(this.c == null) {
            zzbtx zzbtx0 = new zzbtx();
            this.c = zzaw.zza().zzk(this.a, zzbtx0, this.b);
        }
        zzbpk zzbpk0 = this.c;
        if(zzbpk0 != null) {
            try {
                zzbpk0.zze();
            }
            catch(RemoteException remoteException0) {
                zzcfi.zzl("#007 Could not call remote method.", remoteException0);
            }
        }
    }

    public final boolean zzb(String s) {
        if(!zzbpo.zzc(s)) {
            return false;
        }
        if(this.c == null) {
            zzbtx zzbtx0 = new zzbtx();
            this.c = zzaw.zza().zzk(this.a, zzbtx0, this.b);
        }
        zzbpk zzbpk0 = this.c;
        if(zzbpk0 != null) {
            try {
                zzbpk0.zzf(s);
            }
            catch(RemoteException remoteException0) {
                zzcfi.zzl("#007 Could not call remote method.", remoteException0);
            }
            return true;
        }
        return false;
    }

    public static final boolean zzc(String s) {
        if(!((Boolean)zzay.zzc().zzb(zzbhz.zzhS)).booleanValue()) {
            return false;
        }
        Preconditions.checkNotNull(s);
        if(s.length() > ((int)(((Integer)zzay.zzc().zzb(zzbhz.zzhU))))) {
            zzcfi.zze("H5 GMSG exceeds max length");
            return false;
        }
        Uri uri0 = Uri.parse(s);
        return "gmsg".equals(uri0.getScheme()) && "mobileads.google.com".equals(uri0.getHost()) && "/h5ads".equals(uri0.getPath());
    }
}

