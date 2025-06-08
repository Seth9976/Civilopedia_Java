package com.google.android.gms.ads.internal.client;

import D0.j;
import D0.q;
import D0.r;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdInspectorError;
import com.google.android.gms.ads.OnAdInspectorClosedListener;
import com.google.android.gms.ads.RequestConfiguration.Builder;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.initialization.AdapterStatus.State;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbhz;
import com.google.android.gms.internal.ads.zzbjn;
import com.google.android.gms.internal.ads.zzbqg;
import com.google.android.gms.internal.ads.zzbqo;
import com.google.android.gms.internal.ads.zzbqp;
import com.google.android.gms.internal.ads.zzbtt;
import com.google.android.gms.internal.ads.zzbtx;
import com.google.android.gms.internal.ads.zzcex;
import com.google.android.gms.internal.ads.zzcfi;
import com.google.android.gms.internal.ads.zzfpi;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.annotation.Nullable;

public final class zzed {
    public final Object a;
    public final ArrayList b;
    public boolean c;
    public boolean d;
    public final Object e;
    public zzcm f;
    public OnAdInspectorClosedListener g;
    public RequestConfiguration h;
    public static zzed i;

    public zzed() {
        this.a = new Object();
        this.c = false;
        this.d = false;
        this.e = new Object();
        this.g = null;
        this.h = new Builder().build();
        this.b = new ArrayList();
    }

    public static zzbqp a(List list0) {
        HashMap hashMap0 = new HashMap();
        for(Object object0: list0) {
            hashMap0.put(((zzbqg)object0).zza, new zzbqo((((zzbqg)object0).zzb ? State.READY : State.NOT_READY), ((zzbqg)object0).zzd, ((zzbqg)object0).zzc));
        }
        return new zzbqp(hashMap0);
    }

    public final void b(Context context0) {
        try {
            zzbtt.zza().zzb(context0, null);
            this.f.zzj();
            this.f.zzk(null, ObjectWrapper.wrap(null));
        }
        catch(RemoteException remoteException0) {
            zzcfi.zzk("MobileAdsSettingManager initialization failed", remoteException0);
        }
    }

    public final void c(Context context0) {
        if(this.f == null) {
            this.f = (zzcm)new j(zzaw.zza(), context0).d(context0, false);
        }
    }

    public final float zza() {
        synchronized(this.e) {
            zzcm zzcm0 = this.f;
            float f = 1.0f;
            if(zzcm0 == null) {
                return 1.0f;
            }
            try {
                f = zzcm0.zze();
            }
            catch(RemoteException remoteException0) {
                zzcfi.zzh("Unable to get app volume.", remoteException0);
            }
            return f;
        }
    }

    public final RequestConfiguration zzc() {
        return this.h;
    }

    public final InitializationStatus zze() {
        synchronized(this.e) {
            Preconditions.checkState(this.f != null, "MobileAds.initialize() must be called prior to getting initialization status.");
            try {
                return zzed.a(this.f.zzg());
            }
            catch(RemoteException unused_ex) {
                zzcfi.zzg("Unable to get Initialization status.");
                return new zzdv(this);
            }
        }
    }

    public static zzed zzf() {
        synchronized(zzed.class) {
            if(zzed.i == null) {
                zzed.i = new zzed();
            }
            return zzed.i;
        }
    }

    @Deprecated
    public final String zzh() {
        synchronized(this.e) {
            Preconditions.checkState(this.f != null, "MobileAds.initialize() must be called prior to getting version string.");
            try {
                return zzfpi.zzc(this.f.zzf());
            }
            catch(RemoteException remoteException0) {
                zzcfi.zzh("Unable to get version string.", remoteException0);
                return "";
            }
        }
    }

    public final void zzl(Context context0) {
        synchronized(this.e) {
            this.c(context0);
            try {
                this.f.zzi();
            }
            catch(RemoteException unused_ex) {
                zzcfi.zzg("Unable to disable mediation adapter initialization.");
            }
        }
    }

    public final void zzm(Context context0, @Nullable String s, @Nullable OnInitializationCompleteListener onInitializationCompleteListener0) {
        synchronized(this.a) {
            if(this.c) {
                if(onInitializationCompleteListener0 != null) {
                    this.b.add(onInitializationCompleteListener0);
                }
                return;
            }
            if(this.d) {
                if(onInitializationCompleteListener0 != null) {
                    onInitializationCompleteListener0.onInitializationComplete(this.zze());
                }
                return;
            }
            this.c = true;
            if(onInitializationCompleteListener0 != null) {
                this.b.add(onInitializationCompleteListener0);
            }
        }
        if(context0 == null) {
            throw new IllegalArgumentException("Context cannot be null.");
        }
        synchronized(this.e) {
            try {
                this.c(context0);
                this.f.zzr(new r(this, 0));
                this.f.zzn(new zzbtx());
                if(this.h.getTagForChildDirectedTreatment() != -1 || this.h.getTagForUnderAgeOfConsent() != -1) {
                    goto label_27;
                }
                goto label_34;
            }
            catch(RemoteException remoteException0) {
                goto label_33;
            }
        }
        try {
        label_27:
            this.f.zzs(new zzez(this.h));
            goto label_34;
        }
        catch(RemoteException remoteException1) {
            try {
                zzcfi.zzh("Unable to set request configuration parcel.", remoteException1);
                goto label_34;
            }
            catch(RemoteException remoteException0) {
            }
        }
    label_33:
        zzcfi.zzk("MobileAdsSettingManager initialization failed", remoteException0);
    label_34:
        zzbhz.zzc(context0);
        if(((Boolean)zzbjn.zza.zze()).booleanValue() && ((Boolean)zzay.zzc().zzb(zzbhz.zziu)).booleanValue()) {
            zzcfi.zze("Initializing on bg thread");
            zzdw zzdw0 = new zzdw(this, context0, null, onInitializationCompleteListener0);
            zzcex.zza.execute(zzdw0);
        }
        else if(!((Boolean)zzbjn.zzb.zze()).booleanValue() || !((Boolean)zzay.zzc().zzb(zzbhz.zziu)).booleanValue()) {
            zzcfi.zze("Initializing on calling thread");
            this.b(context0);
        }
        else {
            zzdx zzdx0 = new zzdx(this, context0, null, onInitializationCompleteListener0);
            zzcex.zzb.execute(zzdx0);
        }
    }

    public final void zzp(Context context0, OnAdInspectorClosedListener onAdInspectorClosedListener0) {
        synchronized(this.e) {
            this.c(context0);
            this.g = onAdInspectorClosedListener0;
            try {
                this.f.zzl(new q(0));
            }
            catch(RemoteException unused_ex) {
                zzcfi.zzg("Unable to open the ad inspector.");
                if(onAdInspectorClosedListener0 != null) {
                    onAdInspectorClosedListener0.onAdInspectorClosed(new AdInspectorError(0, "Ad inspector had an internal error.", "com.google.android.gms.ads"));
                }
            }
        }
    }

    public final void zzq(Context context0, String s) {
        synchronized(this.e) {
            Preconditions.checkState(this.f != null, "MobileAds.initialize() must be called prior to opening debug menu.");
            try {
                this.f.zzm(ObjectWrapper.wrap(context0), s);
            }
            catch(RemoteException remoteException0) {
                zzcfi.zzh("Unable to open debug menu.", remoteException0);
            }
        }
    }

    public final void zzr(Class class0) {
        synchronized(this.e) {
            try {
                this.f.zzh(class0.getCanonicalName());
            }
            catch(RemoteException remoteException0) {
                zzcfi.zzh("Unable to register RtbAdapter", remoteException0);
            }
        }
    }

    public final void zzs(boolean z) {
        synchronized(this.e) {
            Preconditions.checkState(this.f != null, "MobileAds.initialize() must be called prior to setting app muted state.");
            try {
                this.f.zzo(z);
            }
            catch(RemoteException remoteException0) {
                zzcfi.zzh("Unable to set app mute state.", remoteException0);
            }
        }
    }

    public final void zzt(float f) {
        boolean z = true;
        Preconditions.checkArgument(f >= 0.0f && f <= 1.0f, "The app volume must be a value between 0 and 1 inclusive.");
        synchronized(this.e) {
            if(this.f == null) {
                z = false;
            }
            Preconditions.checkState(z, "MobileAds.initialize() must be called prior to setting the app volume.");
            try {
                this.f.zzp(f);
            }
            catch(RemoteException remoteException0) {
                zzcfi.zzh("Unable to set app volume.", remoteException0);
            }
        }
    }

    public final void zzu(RequestConfiguration requestConfiguration0) {
        Preconditions.checkArgument(requestConfiguration0 != null, "Null passed to setRequestConfiguration.");
        synchronized(this.e) {
            RequestConfiguration requestConfiguration1 = this.h;
            this.h = requestConfiguration0;
            if(this.f == null) {
                return;
            }
            if(requestConfiguration1.getTagForChildDirectedTreatment() != requestConfiguration0.getTagForChildDirectedTreatment() || requestConfiguration1.getTagForUnderAgeOfConsent() != requestConfiguration0.getTagForUnderAgeOfConsent()) {
                try {
                    this.f.zzs(new zzez(requestConfiguration0));
                }
                catch(RemoteException remoteException0) {
                    zzcfi.zzh("Unable to set request configuration parcel.", remoteException0);
                }
            }
        }
    }

    public final boolean zzv() {
        synchronized(this.e) {
            zzcm zzcm0 = this.f;
            boolean z = false;
            if(zzcm0 == null) {
                return false;
            }
            try {
                z = zzcm0.zzt();
            }
            catch(RemoteException remoteException0) {
                zzcfi.zzh("Unable to get app mute state.", remoteException0);
            }
            return z;
        }
    }
}

