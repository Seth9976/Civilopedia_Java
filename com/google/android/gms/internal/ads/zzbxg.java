package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.internal.client.zzdk;
import com.google.android.gms.ads.nativead.MediaView;
import com.google.android.gms.ads.nativead.NativeAd.Image;
import com.google.android.gms.ads.nativead.NativeCustomFormatAd.DisplayOpenMeasurement;
import com.google.android.gms.ads.nativead.NativeCustomFormatAd;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.List;

public final class zzbxg implements NativeCustomFormatAd {
    public final zzblv a;
    public final MediaView b;
    public final VideoController c;
    public zzbwy d;

    @VisibleForTesting
    public zzbxg(zzblv zzblv0) {
        Context context0;
        this.c = new VideoController();
        this.a = zzblv0;
        MediaView mediaView0 = null;
        try {
            context0 = (Context)ObjectWrapper.unwrap(zzblv0.zzg());
        }
        catch(NullPointerException | RemoteException nullPointerException0) {
            zzcfi.zzh("", nullPointerException0);
            context0 = null;
        }
        if(context0 != null) {
            MediaView mediaView1 = new MediaView(context0);
            try {
                IObjectWrapper iObjectWrapper0 = ObjectWrapper.wrap(mediaView1);
                if(this.a.zzq(iObjectWrapper0)) {
                    mediaView0 = mediaView1;
                }
            }
            catch(RemoteException remoteException0) {
                zzcfi.zzh("", remoteException0);
            }
        }
        this.b = mediaView0;
    }

    @Override  // com.google.android.gms.ads.nativead.NativeCustomFormatAd
    public final void destroy() {
        try {
            this.a.zzk();
        }
        catch(RemoteException remoteException0) {
            zzcfi.zzh("", remoteException0);
        }
    }

    @Override  // com.google.android.gms.ads.nativead.NativeCustomFormatAd
    public final List getAvailableAssetNames() {
        try {
            return this.a.zzj();
        }
        catch(RemoteException remoteException0) {
            zzcfi.zzh("", remoteException0);
            return null;
        }
    }

    @Override  // com.google.android.gms.ads.nativead.NativeCustomFormatAd
    public final String getCustomFormatId() {
        try {
            return this.a.zzh();
        }
        catch(RemoteException remoteException0) {
            zzcfi.zzh("", remoteException0);
            return null;
        }
    }

    @Override  // com.google.android.gms.ads.nativead.NativeCustomFormatAd
    public final DisplayOpenMeasurement getDisplayOpenMeasurement() {
        try {
            zzblv zzblv0 = this.a;
            if(this.d == null && zzblv0.zzp()) {
                this.d = new zzbwy(zzblv0);
                return this.d;
            }
        }
        catch(RemoteException remoteException0) {
            zzcfi.zzh("", remoteException0);
        }
        return this.d;
    }

    @Override  // com.google.android.gms.ads.nativead.NativeCustomFormatAd
    public final Image getImage(String s) {
        try {
            zzblb zzblb0 = this.a.zzf(s);
            if(zzblb0 != null) {
                return new zzbwz(zzblb0);
            }
        }
        catch(RemoteException remoteException0) {
            zzcfi.zzh("", remoteException0);
        }
        return null;
    }

    @Override  // com.google.android.gms.ads.nativead.NativeCustomFormatAd
    public final CharSequence getText(String s) {
        try {
            return this.a.zzi(s);
        }
        catch(RemoteException remoteException0) {
            zzcfi.zzh("", remoteException0);
            return null;
        }
    }

    @Override  // com.google.android.gms.ads.nativead.NativeCustomFormatAd
    public final VideoController getVideoController() {
        VideoController videoController0;
        try {
            videoController0 = this.c;
            zzdk zzdk0 = this.a.zze();
            if(zzdk0 != null) {
                videoController0.zzb(zzdk0);
                return videoController0;
            }
        }
        catch(RemoteException remoteException0) {
            zzcfi.zzh("Exception occurred while getting video controller", remoteException0);
        }
        return videoController0;
    }

    @Override  // com.google.android.gms.ads.nativead.NativeCustomFormatAd
    public final MediaView getVideoMediaView() {
        return this.b;
    }

    @Override  // com.google.android.gms.ads.nativead.NativeCustomFormatAd
    public final void performClick(String s) {
        try {
            this.a.zzm(s);
        }
        catch(RemoteException remoteException0) {
            zzcfi.zzh("", remoteException0);
        }
    }

    @Override  // com.google.android.gms.ads.nativead.NativeCustomFormatAd
    public final void recordImpression() {
        try {
            this.a.zzn();
        }
        catch(RemoteException remoteException0) {
            zzcfi.zzh("", remoteException0);
        }
    }
}

