package com.google.android.gms.ads.internal.client;

import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import com.google.android.gms.ads.MediaContent;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbky;
import com.google.android.gms.internal.ads.zzcfi;

public final class zzej implements MediaContent {
    public final zzbky a;
    public final VideoController b;

    public zzej(zzbky zzbky0) {
        this.b = new VideoController();
        this.a = zzbky0;
    }

    @Override  // com.google.android.gms.ads.MediaContent
    public final float getAspectRatio() {
        try {
            return this.a.zze();
        }
        catch(RemoteException remoteException0) {
            zzcfi.zzh("", remoteException0);
            return 0.0f;
        }
    }

    @Override  // com.google.android.gms.ads.MediaContent
    public final float getCurrentTime() {
        try {
            return this.a.zzf();
        }
        catch(RemoteException remoteException0) {
            zzcfi.zzh("", remoteException0);
            return 0.0f;
        }
    }

    @Override  // com.google.android.gms.ads.MediaContent
    public final float getDuration() {
        try {
            return this.a.zzg();
        }
        catch(RemoteException remoteException0) {
            zzcfi.zzh("", remoteException0);
            return 0.0f;
        }
    }

    @Override  // com.google.android.gms.ads.MediaContent
    public final Drawable getMainImage() {
        try {
            IObjectWrapper iObjectWrapper0 = this.a.zzi();
            if(iObjectWrapper0 != null) {
                return (Drawable)ObjectWrapper.unwrap(iObjectWrapper0);
            }
        }
        catch(RemoteException remoteException0) {
            zzcfi.zzh("", remoteException0);
        }
        return null;
    }

    @Override  // com.google.android.gms.ads.MediaContent
    public final VideoController getVideoController() {
        VideoController videoController0;
        try {
            videoController0 = this.b;
            zzbky zzbky0 = this.a;
            if(zzbky0.zzh() != null) {
                videoController0.zzb(zzbky0.zzh());
                return videoController0;
            }
        }
        catch(RemoteException remoteException0) {
            zzcfi.zzh("Exception occurred while getting video controller", remoteException0);
        }
        return videoController0;
    }

    @Override  // com.google.android.gms.ads.MediaContent
    public final boolean hasVideoContent() {
        try {
            return this.a.zzk();
        }
        catch(RemoteException remoteException0) {
            zzcfi.zzh("", remoteException0);
            return false;
        }
    }

    @Override  // com.google.android.gms.ads.MediaContent
    public final void setMainImage(Drawable drawable0) {
        try {
            IObjectWrapper iObjectWrapper0 = ObjectWrapper.wrap(drawable0);
            this.a.zzj(iObjectWrapper0);
        }
        catch(RemoteException remoteException0) {
            zzcfi.zzh("", remoteException0);
        }
    }

    public final zzbky zza() {
        return this.a;
    }
}

