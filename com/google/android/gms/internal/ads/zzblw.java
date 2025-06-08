package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.formats.MediaView;
import com.google.android.gms.ads.formats.NativeAd.Image;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd.DisplayOpenMeasurement;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
import com.google.android.gms.ads.internal.client.zzdk;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.List;

public final class zzblw implements NativeCustomTemplateAd {
    public final zzblv a;
    public final MediaView b;
    public final VideoController c;
    public zzbkv d;

    @VisibleForTesting
    public zzblw(zzblv zzblv0) {
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

    @Override  // com.google.android.gms.ads.formats.NativeCustomTemplateAd
    public final void destroy() {
        try {
            this.a.zzk();
        }
        catch(RemoteException remoteException0) {
            zzcfi.zzh("", remoteException0);
        }
    }

    @Override  // com.google.android.gms.ads.formats.NativeCustomTemplateAd
    public final List getAvailableAssetNames() {
        try {
            return this.a.zzj();
        }
        catch(RemoteException remoteException0) {
            zzcfi.zzh("", remoteException0);
            return null;
        }
    }

    @Override  // com.google.android.gms.ads.formats.NativeCustomTemplateAd
    public final String getCustomTemplateId() {
        try {
            return this.a.zzh();
        }
        catch(RemoteException remoteException0) {
            zzcfi.zzh("", remoteException0);
            return null;
        }
    }

    @Override  // com.google.android.gms.ads.formats.NativeCustomTemplateAd
    public final DisplayOpenMeasurement getDisplayOpenMeasurement() {
        try {
            zzblv zzblv0 = this.a;
            if(this.d == null && zzblv0.zzp()) {
                this.d = new zzbkv(zzblv0);
                return this.d;
            }
        }
        catch(RemoteException remoteException0) {
            zzcfi.zzh("", remoteException0);
        }
        return this.d;
    }

    @Override  // com.google.android.gms.ads.formats.NativeCustomTemplateAd
    public final Image getImage(String s) {
        try {
            zzblb zzblb0 = this.a.zzf(s);
            if(zzblb0 != null) {
                return new zzblc(zzblb0);
            }
        }
        catch(RemoteException remoteException0) {
            zzcfi.zzh("", remoteException0);
        }
        return null;
    }

    @Override  // com.google.android.gms.ads.formats.NativeCustomTemplateAd
    public final CharSequence getText(String s) {
        try {
            return this.a.zzi(s);
        }
        catch(RemoteException remoteException0) {
            zzcfi.zzh("", remoteException0);
            return null;
        }
    }

    @Override  // com.google.android.gms.ads.formats.NativeCustomTemplateAd
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

    @Override  // com.google.android.gms.ads.formats.NativeCustomTemplateAd
    public final MediaView getVideoMediaView() {
        return this.b;
    }

    @Override  // com.google.android.gms.ads.formats.NativeCustomTemplateAd
    public final void performClick(String s) {
        try {
            this.a.zzm(s);
        }
        catch(RemoteException remoteException0) {
            zzcfi.zzh("", remoteException0);
        }
    }

    @Override  // com.google.android.gms.ads.formats.NativeCustomTemplateAd
    public final void recordImpression() {
        try {
            this.a.zzn();
        }
        catch(RemoteException remoteException0) {
            zzcfi.zzh("", remoteException0);
        }
    }

    public final zzblv zza() {
        return this.a;
    }
}

