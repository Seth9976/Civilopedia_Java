package com.google.android.gms.ads.nativead;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbll;
import com.google.android.gms.internal.ads.zzcfi;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

public final class NativeAdViewHolder {
    public final zzbll a;
    public final WeakReference b;
    public static WeakHashMap zza;

    static {
        NativeAdViewHolder.zza = new WeakHashMap();
    }

    public NativeAdViewHolder(View view0, Map map0, Map map1) {
        Preconditions.checkNotNull(view0, "ContainerView must not be null");
        if(view0 instanceof NativeAdView) {
            zzcfi.zzg("The provided containerView is of type of NativeAdView, which cannot be usedwith NativeAdViewHolder.");
            return;
        }
        if(NativeAdViewHolder.zza.get(view0) != null) {
            zzcfi.zzg("The provided containerView is already in use with another NativeAdViewHolder.");
            return;
        }
        NativeAdViewHolder.zza.put(view0, this);
        this.b = new WeakReference(view0);
        this.a = zzaw.zza().zzh(view0, (map0 == null ? new HashMap() : new HashMap(map0)), (map1 == null ? new HashMap() : new HashMap(map1)));
    }

    public final void setClickConfirmingView(View view0) {
        try {
            IObjectWrapper iObjectWrapper0 = ObjectWrapper.wrap(view0);
            this.a.zzb(iObjectWrapper0);
        }
        catch(RemoteException remoteException0) {
            zzcfi.zzh("Unable to call setClickConfirmingView on delegate", remoteException0);
        }
    }

    public void setNativeAd(NativeAd nativeAd0) {
        IObjectWrapper iObjectWrapper0 = nativeAd0.a();
        View view0 = this.b == null ? null : ((View)this.b.get());
        if(view0 == null) {
            zzcfi.zzj("NativeAdViewHolder.setNativeAd containerView doesn\'t exist, returning");
            return;
        }
        if(!NativeAdViewHolder.zza.containsKey(view0)) {
            NativeAdViewHolder.zza.put(view0, this);
        }
        zzbll zzbll0 = this.a;
        if(zzbll0 != null) {
            try {
                zzbll0.zzc(iObjectWrapper0);
            }
            catch(RemoteException remoteException0) {
                zzcfi.zzh("Unable to call setNativeAd on delegate", remoteException0);
            }
        }
    }

    public void unregisterNativeAd() {
        zzbll zzbll0 = this.a;
        if(zzbll0 != null) {
            try {
                zzbll0.zzd();
            }
            catch(RemoteException remoteException0) {
                zzcfi.zzh("Unable to call unregisterNativeAd on delegate", remoteException0);
            }
        }
        View view0 = this.b == null ? null : ((View)this.b.get());
        if(view0 != null) {
            NativeAdViewHolder.zza.remove(view0);
        }
    }
}

