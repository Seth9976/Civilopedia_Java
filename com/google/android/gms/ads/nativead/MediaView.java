package com.google.android.gms.ads.nativead;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView.ScaleType;
import com.google.android.gms.ads.MediaContent;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzblf;
import com.google.android.gms.internal.ads.zzcfi;

public class MediaView extends FrameLayout {
    public MediaContent i;
    public boolean j;
    public ImageView.ScaleType k;
    public boolean l;
    public zzb m;
    public zzc n;

    public MediaView(Context context0) {
        super(context0);
    }

    public MediaView(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
    }

    public MediaView(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
    }

    @TargetApi(21)
    public MediaView(Context context0, AttributeSet attributeSet0, int v, int v1) {
        super(context0, attributeSet0, v, v1);
    }

    public final void a(zzc zzc0) {
        synchronized(this) {
            this.n = zzc0;
            if(this.l) {
                ImageView.ScaleType imageView$ScaleType0 = this.k;
                zzblf zzblf0 = zzc0.zza.j;
                if(zzblf0 != null && imageView$ScaleType0 != null) {
                    try {
                        zzblf0.zzbz(ObjectWrapper.wrap(imageView$ScaleType0));
                    }
                    catch(RemoteException remoteException0) {
                        zzcfi.zzh("Unable to call setMediaViewImageScaleType on delegate", remoteException0);
                    }
                }
            }
        }
    }

    public void setImageScaleType(ImageView.ScaleType imageView$ScaleType0) {
        this.l = true;
        this.k = imageView$ScaleType0;
        zzc zzc0 = this.n;
        if(zzc0 != null) {
            zzblf zzblf0 = zzc0.zza.j;
            if(zzblf0 != null && imageView$ScaleType0 != null) {
                try {
                    zzblf0.zzbz(ObjectWrapper.wrap(imageView$ScaleType0));
                }
                catch(RemoteException remoteException0) {
                    zzcfi.zzh("Unable to call setMediaViewImageScaleType on delegate", remoteException0);
                }
            }
        }
    }

    public void setMediaContent(MediaContent mediaContent0) {
        this.j = true;
        this.i = mediaContent0;
        zzb zzb0 = this.m;
        if(zzb0 != null) {
            zzb0.zza.b(mediaContent0);
        }
    }
}

