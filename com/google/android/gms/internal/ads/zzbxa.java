package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.MediaContent;
import com.google.android.gms.ads.MuteThisAdListener;
import com.google.android.gms.ads.MuteThisAdReason;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.internal.client.zzcr;
import com.google.android.gms.ads.internal.client.zzct;
import com.google.android.gms.ads.internal.client.zzcu;
import com.google.android.gms.ads.internal.client.zzcv;
import com.google.android.gms.ads.internal.client.zzej;
import com.google.android.gms.ads.internal.client.zzey;
import com.google.android.gms.ads.nativead.NativeAd.AdChoicesInfo;
import com.google.android.gms.ads.nativead.NativeAd.Image;
import com.google.android.gms.ads.nativead.NativeAd.UnconfirmedClickListener;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class zzbxa extends NativeAd {
    public final zzbmy a;
    public final ArrayList b;
    public final zzbwz c;
    public final zzbwx d;
    public final ArrayList e;

    public zzbxa(zzbmy zzbmy0) {
        zzbwz zzbwz1;
        this.b = new ArrayList();
        this.e = new ArrayList();
        this.a = zzbmy0;
        zzbwx zzbwx0 = null;
        try {
            List list0 = zzbmy0.zzu();
            if(list0 != null) {
                Iterator iterator0 = list0.iterator();
                while(true) {
                    if(!iterator0.hasNext()) {
                        break;
                    }
                    Object object0 = iterator0.next();
                    zzblb zzblb0 = object0 instanceof IBinder ? zzbla.zzg(((IBinder)object0)) : null;
                    if(zzblb0 != null) {
                        zzbwz zzbwz0 = new zzbwz(zzblb0);
                        this.b.add(zzbwz0);
                    }
                }
            }
            goto label_18;
        }
        catch(RemoteException remoteException0) {
        }
        zzcfi.zzh("", remoteException0);
        try {
        label_18:
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
                        this.e.add(zzcv0);
                    }
                }
            }
            goto label_31;
        }
        catch(RemoteException remoteException1) {
        }
        zzcfi.zzh("", remoteException1);
        try {
        label_31:
            zzblb zzblb1 = this.a.zzk();
            if(zzblb1 == null) {
                goto label_39;
            }
            else {
                zzbwz1 = new zzbwz(zzblb1);
            }
        }
        catch(RemoteException remoteException2) {
            zzcfi.zzh("", remoteException2);
            zzbwz1 = null;
        }
        goto label_40;
    label_39:
        zzbwz1 = null;
        try {
        label_40:
            this.c = zzbwz1;
            if(this.a.zzi() != null) {
                zzbwx0 = new zzbwx(this.a.zzi());
            }
        }
        catch(RemoteException remoteException3) {
            zzcfi.zzh("", remoteException3);
        }
        this.d = zzbwx0;
    }

    @Override  // com.google.android.gms.ads.nativead.NativeAd
    public final IObjectWrapper a() {
        try {
            return this.a.zzm();
        }
        catch(RemoteException remoteException0) {
            zzcfi.zzh("", remoteException0);
            return null;
        }
    }

    @Override  // com.google.android.gms.ads.nativead.NativeAd
    public final void cancelUnconfirmedClick() {
        try {
            this.a.zzw();
        }
        catch(RemoteException remoteException0) {
            zzcfi.zzh("Failed to cancelUnconfirmedClick", remoteException0);
        }
    }

    @Override  // com.google.android.gms.ads.nativead.NativeAd
    public final void destroy() {
        try {
            this.a.zzx();
        }
        catch(RemoteException remoteException0) {
            zzcfi.zzh("", remoteException0);
        }
    }

    @Override  // com.google.android.gms.ads.nativead.NativeAd
    public final void enableCustomClickGesture() {
        try {
            this.a.zzC();
        }
        catch(RemoteException remoteException0) {
            zzcfi.zzh("", remoteException0);
        }
    }

    @Override  // com.google.android.gms.ads.nativead.NativeAd
    public final AdChoicesInfo getAdChoicesInfo() {
        return this.d;
    }

    @Override  // com.google.android.gms.ads.nativead.NativeAd
    public final String getAdvertiser() {
        try {
            return this.a.zzn();
        }
        catch(RemoteException remoteException0) {
            zzcfi.zzh("", remoteException0);
            return null;
        }
    }

    @Override  // com.google.android.gms.ads.nativead.NativeAd
    public final String getBody() {
        try {
            return this.a.zzo();
        }
        catch(RemoteException remoteException0) {
            zzcfi.zzh("", remoteException0);
            return null;
        }
    }

    @Override  // com.google.android.gms.ads.nativead.NativeAd
    public final String getCallToAction() {
        try {
            return this.a.zzp();
        }
        catch(RemoteException remoteException0) {
            zzcfi.zzh("", remoteException0);
            return null;
        }
    }

    @Override  // com.google.android.gms.ads.nativead.NativeAd
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

    @Override  // com.google.android.gms.ads.nativead.NativeAd
    public final String getHeadline() {
        try {
            return this.a.zzq();
        }
        catch(RemoteException remoteException0) {
            zzcfi.zzh("", remoteException0);
            return null;
        }
    }

    @Override  // com.google.android.gms.ads.nativead.NativeAd
    public final Image getIcon() {
        return this.c;
    }

    @Override  // com.google.android.gms.ads.nativead.NativeAd
    public final List getImages() {
        return this.b;
    }

    @Override  // com.google.android.gms.ads.nativead.NativeAd
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

    @Override  // com.google.android.gms.ads.nativead.NativeAd
    public final List getMuteThisAdReasons() {
        return this.e;
    }

    @Override  // com.google.android.gms.ads.nativead.NativeAd
    public final String getPrice() {
        try {
            return this.a.zzs();
        }
        catch(RemoteException remoteException0) {
            zzcfi.zzh("", remoteException0);
            return null;
        }
    }

    @Override  // com.google.android.gms.ads.nativead.NativeAd
    public final ResponseInfo getResponseInfo() {
        try {
            return ResponseInfo.zza(this.a.zzg());
        }
        catch(RemoteException remoteException0) {
            zzcfi.zzh("", remoteException0);
            return ResponseInfo.zza(null);
        }
    }

    @Override  // com.google.android.gms.ads.nativead.NativeAd
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

    @Override  // com.google.android.gms.ads.nativead.NativeAd
    public final String getStore() {
        try {
            return this.a.zzt();
        }
        catch(RemoteException remoteException0) {
            zzcfi.zzh("", remoteException0);
            return null;
        }
    }

    @Override  // com.google.android.gms.ads.nativead.NativeAd
    public final boolean isCustomClickGestureEnabled() {
        try {
            return this.a.zzG();
        }
        catch(RemoteException remoteException0) {
            zzcfi.zzh("", remoteException0);
            return false;
        }
    }

    @Override  // com.google.android.gms.ads.nativead.NativeAd
    public final boolean isCustomMuteThisAdEnabled() {
        try {
            return this.a.zzH();
        }
        catch(RemoteException remoteException0) {
            zzcfi.zzh("", remoteException0);
            return false;
        }
    }

    @Override  // com.google.android.gms.ads.nativead.NativeAd
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

    @Override  // com.google.android.gms.ads.nativead.NativeAd
    public final void performClick(Bundle bundle0) {
        try {
            this.a.zzz(bundle0);
        }
        catch(RemoteException remoteException0) {
            zzcfi.zzh("", remoteException0);
        }
    }

    @Override  // com.google.android.gms.ads.nativead.NativeAd
    public final void recordCustomClickGesture() {
        try {
            this.a.zzA();
        }
        catch(RemoteException remoteException0) {
            zzcfi.zzh("", remoteException0);
        }
    }

    @Override  // com.google.android.gms.ads.nativead.NativeAd
    public final boolean recordImpression(Bundle bundle0) {
        try {
            return this.a.zzI(bundle0);
        }
        catch(RemoteException remoteException0) {
            zzcfi.zzh("", remoteException0);
            return false;
        }
    }

    @Override  // com.google.android.gms.ads.nativead.NativeAd
    public final void reportTouchEvent(Bundle bundle0) {
        try {
            this.a.zzB(bundle0);
        }
        catch(RemoteException remoteException0) {
            zzcfi.zzh("", remoteException0);
        }
    }

    @Override  // com.google.android.gms.ads.nativead.NativeAd
    public final void setMuteThisAdListener(MuteThisAdListener muteThisAdListener0) {
        try {
            zzcr zzcr0 = new zzcr(muteThisAdListener0);
            this.a.zzD(zzcr0);
        }
        catch(RemoteException remoteException0) {
            zzcfi.zzh("", remoteException0);
        }
    }

    @Override  // com.google.android.gms.ads.nativead.NativeAd
    public final void setOnPaidEventListener(OnPaidEventListener onPaidEventListener0) {
        try {
            zzey zzey0 = new zzey(onPaidEventListener0);
            this.a.zzE(zzey0);
        }
        catch(RemoteException remoteException0) {
            zzcfi.zzh("Failed to setOnPaidEventListener", remoteException0);
        }
    }

    @Override  // com.google.android.gms.ads.nativead.NativeAd
    public final void setUnconfirmedClickListener(UnconfirmedClickListener nativeAd$UnconfirmedClickListener0) {
        try {
            zzbxi zzbxi0 = new zzbxi(nativeAd$UnconfirmedClickListener0);
            this.a.zzF(zzbxi0);
        }
        catch(RemoteException remoteException0) {
            zzcfi.zzh("Failed to setUnconfirmedClickListener", remoteException0);
        }
    }
}

