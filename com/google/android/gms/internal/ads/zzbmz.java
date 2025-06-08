package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.MediaContent;
import com.google.android.gms.ads.MuteThisAdListener;
import com.google.android.gms.ads.MuteThisAdReason;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.formats.NativeAd.AdChoicesInfo;
import com.google.android.gms.ads.formats.NativeAd.Image;
import com.google.android.gms.ads.formats.UnifiedNativeAd.UnconfirmedClickListener;
import com.google.android.gms.ads.formats.UnifiedNativeAd;
import com.google.android.gms.ads.internal.client.zzcr;
import com.google.android.gms.ads.internal.client.zzct;
import com.google.android.gms.ads.internal.client.zzcu;
import com.google.android.gms.ads.internal.client.zzcv;
import com.google.android.gms.ads.internal.client.zzej;
import com.google.android.gms.ads.internal.client.zzey;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class zzbmz extends UnifiedNativeAd {
    public final zzbmy a;
    public final ArrayList b;
    public final zzblc c;
    public final VideoController d;
    public final zzbku e;
    public final ArrayList f;

    public zzbmz(zzbmy zzbmy0) {
        zzblc zzblc1;
        zzblb zzblb0;
        this.b = new ArrayList();
        this.d = new VideoController();
        this.f = new ArrayList();
        this.a = zzbmy0;
        zzbku zzbku0 = null;
        try {
            List list0 = zzbmy0.zzu();
            if(list0 != null) {
                Iterator iterator0 = list0.iterator();
                while(true) {
                    if(!iterator0.hasNext()) {
                        break;
                    }
                    Object object0 = iterator0.next();
                    if(object0 instanceof IBinder && ((IBinder)object0) != null) {
                        IInterface iInterface0 = ((IBinder)object0).queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
                        zzblb0 = iInterface0 instanceof zzblb ? ((zzblb)iInterface0) : new zzbkz(((IBinder)object0));
                    }
                    else {
                        zzblb0 = null;
                    }
                    if(zzblb0 != null) {
                        zzblc zzblc0 = new zzblc(zzblb0);
                        this.b.add(zzblc0);
                    }
                }
            }
            goto label_26;
        }
        catch(RemoteException remoteException0) {
        }
        zzcfi.zzh("", remoteException0);
        try {
        label_26:
            List list1 = this.a.zzv();
            if(list1 != null) {
                Iterator iterator1 = list1.iterator();
                while(true) {
                    if(!iterator1.hasNext()) {
                        break;
                    }
                    Object object1 = iterator1.next();
                    zzcu zzcu0 = object1 instanceof IBinder ? zzct.zzb(((IBinder)object1)) : null;
                    if(zzcu0 != null) {
                        zzcv zzcv0 = new zzcv(zzcu0);
                        this.f.add(zzcv0);
                    }
                }
            }
            goto label_39;
        }
        catch(RemoteException remoteException1) {
        }
        zzcfi.zzh("", remoteException1);
        try {
        label_39:
            zzblb zzblb1 = this.a.zzk();
            if(zzblb1 == null) {
                goto label_47;
            }
            else {
                zzblc1 = new zzblc(zzblb1);
            }
        }
        catch(RemoteException remoteException2) {
            zzcfi.zzh("", remoteException2);
            zzblc1 = null;
        }
        goto label_48;
    label_47:
        zzblc1 = null;
        try {
        label_48:
            this.c = zzblc1;
            if(this.a.zzi() != null) {
                zzbku0 = new zzbku(this.a.zzi());
            }
        }
        catch(RemoteException remoteException3) {
            zzcfi.zzh("", remoteException3);
        }
        this.e = zzbku0;
    }

    @Override  // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final void cancelUnconfirmedClick() {
        try {
            this.a.zzw();
        }
        catch(RemoteException remoteException0) {
            zzcfi.zzh("Failed to cancelUnconfirmedClick", remoteException0);
        }
    }

    @Override  // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final void destroy() {
        try {
            this.a.zzx();
        }
        catch(RemoteException remoteException0) {
            zzcfi.zzh("", remoteException0);
        }
    }

    @Override  // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final void enableCustomClickGesture() {
        try {
            this.a.zzC();
        }
        catch(RemoteException remoteException0) {
            zzcfi.zzh("", remoteException0);
        }
    }

    @Override  // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final AdChoicesInfo getAdChoicesInfo() {
        return this.e;
    }

    @Override  // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final String getAdvertiser() {
        try {
            return this.a.zzn();
        }
        catch(RemoteException remoteException0) {
            zzcfi.zzh("", remoteException0);
            return null;
        }
    }

    @Override  // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final String getBody() {
        try {
            return this.a.zzo();
        }
        catch(RemoteException remoteException0) {
            zzcfi.zzh("", remoteException0);
            return null;
        }
    }

    @Override  // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final String getCallToAction() {
        try {
            return this.a.zzp();
        }
        catch(RemoteException remoteException0) {
            zzcfi.zzh("", remoteException0);
            return null;
        }
    }

    @Override  // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final Bundle getExtras() {
        try {
            Bundle bundle0 = this.a.zzf();
            if(bundle0 != null) {
                return bundle0;
            }
        }
        catch(RemoteException remoteException0) {
            zzcfi.zzh("", remoteException0);
        }
        return new Bundle();
    }

    @Override  // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final String getHeadline() {
        try {
            return this.a.zzq();
        }
        catch(RemoteException remoteException0) {
            zzcfi.zzh("", remoteException0);
            return null;
        }
    }

    @Override  // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final Image getIcon() {
        return this.c;
    }

    @Override  // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final List getImages() {
        return this.b;
    }

    @Override  // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final MediaContent getMediaContent() {
        try {
            zzbmy zzbmy0 = this.a;
            if(zzbmy0.zzj() != null) {
                return new zzej(zzbmy0.zzj());
            }
        }
        catch(RemoteException remoteException0) {
            zzcfi.zzh("", remoteException0);
        }
        return null;
    }

    @Override  // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final String getMediationAdapterClassName() {
        try {
            return this.a.zzr();
        }
        catch(RemoteException remoteException0) {
            zzcfi.zzh("", remoteException0);
            return null;
        }
    }

    @Override  // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final List getMuteThisAdReasons() {
        return this.f;
    }

    @Override  // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final String getPrice() {
        try {
            return this.a.zzs();
        }
        catch(RemoteException remoteException0) {
            zzcfi.zzh("", remoteException0);
            return null;
        }
    }

    @Override  // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final ResponseInfo getResponseInfo() {
        try {
            return ResponseInfo.zza(this.a.zzg());
        }
        catch(RemoteException remoteException0) {
            zzcfi.zzh("", remoteException0);
            return ResponseInfo.zza(null);
        }
    }

    @Override  // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final Double getStarRating() {
        try {
            double f = this.a.zze();
            return f == -1.0 ? null : f;
        }
        catch(RemoteException remoteException0) {
            zzcfi.zzh("", remoteException0);
            return null;
        }
    }

    @Override  // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final String getStore() {
        try {
            return this.a.zzt();
        }
        catch(RemoteException remoteException0) {
            zzcfi.zzh("", remoteException0);
            return null;
        }
    }

    @Override  // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final VideoController getVideoController() {
        VideoController videoController0;
        try {
            videoController0 = this.d;
            zzbmy zzbmy0 = this.a;
            if(zzbmy0.zzh() != null) {
                videoController0.zzb(zzbmy0.zzh());
                return videoController0;
            }
        }
        catch(RemoteException remoteException0) {
            zzcfi.zzh("Exception occurred while getting video controller", remoteException0);
        }
        return videoController0;
    }

    @Override  // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final boolean isCustomClickGestureEnabled() {
        try {
            return this.a.zzG();
        }
        catch(RemoteException remoteException0) {
            zzcfi.zzh("", remoteException0);
            return false;
        }
    }

    @Override  // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final boolean isCustomMuteThisAdEnabled() {
        try {
            return this.a.zzH();
        }
        catch(RemoteException remoteException0) {
            zzcfi.zzh("", remoteException0);
            return false;
        }
    }

    @Override  // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final void muteThisAd(MuteThisAdReason muteThisAdReason0) {
        zzbmy zzbmy0;
        try {
            zzbmy0 = this.a;
            if(zzbmy0.zzH()) {
                goto label_6;
            }
            goto label_14;
        }
        catch(RemoteException remoteException0) {
            try {
                zzcfi.zzh("", remoteException0);
                goto label_14;
            label_6:
                if(muteThisAdReason0 == null) {
                    zzbmy0.zzy(null);
                    return;
                }
                if(muteThisAdReason0 instanceof zzcv) {
                    zzbmy0.zzy(((zzcv)muteThisAdReason0).zza());
                    return;
                }
                zzcfi.zzg("Use mute reason from UnifiedNativeAd.getMuteThisAdReasons() or null");
                return;
            label_14:
                zzcfi.zzg("Ad is not custom mute enabled");
                return;
            }
            catch(RemoteException remoteException1) {
            }
        }
        zzcfi.zzh("", remoteException1);
    }

    @Override  // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final void performClick(Bundle bundle0) {
        try {
            this.a.zzz(bundle0);
        }
        catch(RemoteException remoteException0) {
            zzcfi.zzh("", remoteException0);
        }
    }

    @Override  // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final void recordCustomClickGesture() {
        try {
            this.a.zzA();
        }
        catch(RemoteException remoteException0) {
            zzcfi.zzh("", remoteException0);
        }
    }

    @Override  // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final boolean recordImpression(Bundle bundle0) {
        try {
            return this.a.zzI(bundle0);
        }
        catch(RemoteException remoteException0) {
            zzcfi.zzh("", remoteException0);
            return false;
        }
    }

    @Override  // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final void reportTouchEvent(Bundle bundle0) {
        try {
            this.a.zzB(bundle0);
        }
        catch(RemoteException remoteException0) {
            zzcfi.zzh("", remoteException0);
        }
    }

    @Override  // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final void setMuteThisAdListener(MuteThisAdListener muteThisAdListener0) {
        try {
            zzcr zzcr0 = new zzcr(muteThisAdListener0);
            this.a.zzD(zzcr0);
        }
        catch(RemoteException remoteException0) {
            zzcfi.zzh("", remoteException0);
        }
    }

    @Override  // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final void setOnPaidEventListener(OnPaidEventListener onPaidEventListener0) {
        try {
            zzey zzey0 = new zzey(onPaidEventListener0);
            this.a.zzE(zzey0);
        }
        catch(RemoteException remoteException0) {
            zzcfi.zzh("Failed to setOnPaidEventListener", remoteException0);
        }
    }

    @Override  // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final void setUnconfirmedClickListener(UnconfirmedClickListener unifiedNativeAd$UnconfirmedClickListener0) {
        try {
            zzbnk zzbnk0 = new zzbnk(unifiedNativeAd$UnconfirmedClickListener0);
            this.a.zzF(zzbnk0);
        }
        catch(RemoteException remoteException0) {
            zzcfi.zzh("Failed to setUnconfirmedClickListener", remoteException0);
        }
    }

    @Override  // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final Object zza() {
        try {
            IObjectWrapper iObjectWrapper0 = this.a.zzl();
            if(iObjectWrapper0 != null) {
                return ObjectWrapper.unwrap(iObjectWrapper0);
            }
        }
        catch(RemoteException remoteException0) {
            zzcfi.zzh("", remoteException0);
        }
        return null;
    }
}

