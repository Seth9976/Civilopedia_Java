package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.VideoController.VideoLifecycleCallbacks;
import com.google.android.gms.ads.internal.client.zzdk;
import com.google.android.gms.ads.internal.client.zzdn;

public final class zzdso extends VideoLifecycleCallbacks {
    public final zzdnh a;

    public zzdso(zzdnh zzdnh0) {
        this.a = zzdnh0;
    }

    @Override  // com.google.android.gms.ads.VideoController$VideoLifecycleCallbacks
    public final void onVideoEnd() {
        zzdk zzdk0 = this.a.zzj();
        zzdn zzdn0 = null;
        if(zzdk0 != null) {
            try {
                zzdn0 = zzdk0.zzi();
            }
            catch(RemoteException unused_ex) {
            }
        }
        if(zzdn0 == null) {
            return;
        }
        try {
            zzdn0.zze();
        }
        catch(RemoteException remoteException0) {
            zzcfi.zzk("Unable to call onVideoEnd()", remoteException0);
        }
    }

    @Override  // com.google.android.gms.ads.VideoController$VideoLifecycleCallbacks
    public final void onVideoPause() {
        zzdk zzdk0 = this.a.zzj();
        zzdn zzdn0 = null;
        if(zzdk0 != null) {
            try {
                zzdn0 = zzdk0.zzi();
            }
            catch(RemoteException unused_ex) {
            }
        }
        if(zzdn0 == null) {
            return;
        }
        try {
            zzdn0.zzg();
        }
        catch(RemoteException remoteException0) {
            zzcfi.zzk("Unable to call onVideoEnd()", remoteException0);
        }
    }

    @Override  // com.google.android.gms.ads.VideoController$VideoLifecycleCallbacks
    public final void onVideoStart() {
        zzdk zzdk0 = this.a.zzj();
        zzdn zzdn0 = null;
        if(zzdk0 != null) {
            try {
                zzdn0 = zzdk0.zzi();
            }
            catch(RemoteException unused_ex) {
            }
        }
        if(zzdn0 == null) {
            return;
        }
        try {
            zzdn0.zzi();
        }
        catch(RemoteException remoteException0) {
            zzcfi.zzk("Unable to call onVideoEnd()", remoteException0);
        }
    }
}

