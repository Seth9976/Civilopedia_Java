package com.google.android.gms.measurement.internal;

import B.a;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.fragment.app.B;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.N2;
import com.google.android.gms.internal.ads.u9;
import com.google.android.gms.internal.measurement.zzcb;
import com.google.android.gms.internal.measurement.zzcf;
import com.google.android.gms.internal.measurement.zzci;
import com.google.android.gms.internal.measurement.zzck;
import com.google.android.gms.internal.measurement.zzcl;
import i0.n;
import i1.E;
import i1.I;
import i1.L;
import i1.i0;
import java.util.Map;
import p.b;

@DynamiteApi
public class AppMeasurementDynamiteService extends zzcb {
    public zzge i;
    public final b j;

    public AppMeasurementDynamiteService() {
        this.i = null;
        this.j = new b();  // 初始化器: Lp/k;-><init>()V
    }

    @Override  // com.google.android.gms.internal.measurement.zzcc
    public void beginAdUnitExposure(String s, long v) throws RemoteException {
        this.zzb();
        this.i.zzd().zzd(s, v);
    }

    @Override  // com.google.android.gms.internal.measurement.zzcc
    public void clearConditionalUserProperty(String s, String s1, Bundle bundle0) throws RemoteException {
        this.zzb();
        this.i.zzq().zzA(s, s1, bundle0);
    }

    @Override  // com.google.android.gms.internal.measurement.zzcc
    public void clearMeasurementEnabled(long v) throws RemoteException {
        this.zzb();
        this.i.zzq().zzU(null);
    }

    @Override  // com.google.android.gms.internal.measurement.zzcc
    public void endAdUnitExposure(String s, long v) throws RemoteException {
        this.zzb();
        this.i.zzd().zze(s, v);
    }

    @Override  // com.google.android.gms.internal.measurement.zzcc
    public void generateEventId(zzcf zzcf0) throws RemoteException {
        this.zzb();
        long v = this.i.zzv().zzq();
        this.zzb();
        this.i.zzv().zzU(zzcf0, v);
    }

    @Override  // com.google.android.gms.internal.measurement.zzcc
    public void getAppInstanceId(zzcf zzcf0) throws RemoteException {
        this.zzb();
        this.i.zzaz().zzp(new I(this, zzcf0, 0));
    }

    @Override  // com.google.android.gms.internal.measurement.zzcc
    public void getCachedAppInstanceId(zzcf zzcf0) throws RemoteException {
        this.zzb();
        String s = this.i.zzq().zzo();
        this.zzb();
        this.i.zzv().zzV(zzcf0, s);
    }

    @Override  // com.google.android.gms.internal.measurement.zzcc
    public void getConditionalUserProperties(String s, String s1, zzcf zzcf0) throws RemoteException {
        this.zzb();
        this.i.zzaz().zzp(new n(this, zzcf0, s, s1, 4));
    }

    @Override  // com.google.android.gms.internal.measurement.zzcc
    public void getCurrentScreenClass(zzcf zzcf0) throws RemoteException {
        this.zzb();
        String s = this.i.zzq().zzp();
        this.zzb();
        this.i.zzv().zzV(zzcf0, s);
    }

    @Override  // com.google.android.gms.internal.measurement.zzcc
    public void getCurrentScreenName(zzcf zzcf0) throws RemoteException {
        this.zzb();
        String s = this.i.zzq().zzq();
        this.zzb();
        this.i.zzv().zzV(zzcf0, s);
    }

    @Override  // com.google.android.gms.internal.measurement.zzcc
    public void getGmpAppId(zzcf zzcf0) throws RemoteException {
        String s;
        this.zzb();
        zzij zzij0 = this.i.zzq();
        zzge zzge0 = zzij0.a;
        if(zzij0.a.zzw() == null) {
            try {
                s = zzip.zzc(zzge0.zzau(), "google_app_id", zzge0.zzz());
            }
            catch(IllegalStateException illegalStateException0) {
                zzge0.zzay().zzd().zzb("getGoogleAppId failed with exception", illegalStateException0);
                s = null;
            }
        }
        else {
            s = zzge0.zzw();
        }
        this.zzb();
        this.i.zzv().zzV(zzcf0, s);
    }

    @Override  // com.google.android.gms.internal.measurement.zzcc
    public void getMaxUserProperties(String s, zzcf zzcf0) throws RemoteException {
        this.zzb();
        this.i.zzq().zzh(s);
        this.zzb();
        this.i.zzv().zzT(zzcf0, 25);
    }

    @Override  // com.google.android.gms.internal.measurement.zzcc
    public void getTestFlag(zzcf zzcf0, int v) throws RemoteException {
        this.zzb();
        switch(v) {
            case 0: {
                this.i.zzv().zzV(zzcf0, this.i.zzq().zzr());
                return;
            }
            case 1: {
                this.i.zzv().zzU(zzcf0, ((long)this.i.zzq().zzm()));
                return;
            }
            case 2: {
                zzln zzln0 = this.i.zzv();
                double f = (double)this.i.zzq().zzj();
                Bundle bundle0 = new Bundle();
                bundle0.putDouble("r", f);
                try {
                    zzcf0.zzd(bundle0);
                }
                catch(RemoteException remoteException0) {
                    zzln0.a.zzay().zzk().zzb("Error returning double value to wrapper", remoteException0);
                }
                return;
            }
            case 3: {
                this.i.zzv().zzT(zzcf0, ((int)this.i.zzq().zzl()));
                return;
            }
            case 4: {
                this.i.zzv().zzP(zzcf0, this.i.zzq().zzi().booleanValue());
            }
        }
    }

    @Override  // com.google.android.gms.internal.measurement.zzcc
    public void getUserProperties(String s, String s1, boolean z, zzcf zzcf0) throws RemoteException {
        this.zzb();
        this.i.zzaz().zzp(new B(this, zzcf0, s, s1, z, 3));
    }

    @Override  // com.google.android.gms.internal.measurement.zzcc
    public void initForTests(Map map0) throws RemoteException {
        this.zzb();
    }

    @Override  // com.google.android.gms.internal.measurement.zzcc
    public void initialize(IObjectWrapper iObjectWrapper0, zzcl zzcl0, long v) throws RemoteException {
        zzge zzge0 = this.i;
        if(zzge0 == null) {
            this.i = zzge.zzp(((Context)Preconditions.checkNotNull(((Context)ObjectWrapper.unwrap(iObjectWrapper0)))), zzcl0, v);
            return;
        }
        zzge0.zzay().zzk().zza("Attempting to initialize multiple times");
    }

    @Override  // com.google.android.gms.internal.measurement.zzcc
    public void isDataCollectionEnabled(zzcf zzcf0) throws RemoteException {
        this.zzb();
        this.i.zzaz().zzp(new I(this, zzcf0, 1));
    }

    @Override  // com.google.android.gms.internal.measurement.zzcc
    public void logEvent(String s, String s1, Bundle bundle0, boolean z, boolean z1, long v) throws RemoteException {
        this.zzb();
        this.i.zzq().zzE(s, s1, bundle0, z, z1, v);
    }

    @Override  // com.google.android.gms.internal.measurement.zzcc
    public void logEventAndBundle(String s, String s1, Bundle bundle0, zzcf zzcf0, long v) throws RemoteException {
        this.zzb();
        Preconditions.checkNotEmpty(s1);
        (bundle0 == null ? new Bundle() : new Bundle(bundle0)).putString("_o", "app");
        zzaw zzaw0 = new zzaw(s1, new zzau(bundle0), "app", v);
        this.i.zzaz().zzp(new n(this, zzcf0, zzaw0, s, 2));
    }

    @Override  // com.google.android.gms.internal.measurement.zzcc
    public void logHealthData(int v, String s, IObjectWrapper iObjectWrapper0, IObjectWrapper iObjectWrapper1, IObjectWrapper iObjectWrapper2) throws RemoteException {
        this.zzb();
        Object object0 = null;
        Object object1 = iObjectWrapper0 == null ? null : ObjectWrapper.unwrap(iObjectWrapper0);
        Object object2 = iObjectWrapper1 == null ? null : ObjectWrapper.unwrap(iObjectWrapper1);
        if(iObjectWrapper2 != null) {
            object0 = ObjectWrapper.unwrap(iObjectWrapper2);
        }
        this.i.zzay().g(v, true, false, s, object1, object2, object0);
    }

    @Override  // com.google.android.gms.internal.measurement.zzcc
    public void onActivityCreated(IObjectWrapper iObjectWrapper0, Bundle bundle0, long v) throws RemoteException {
        this.zzb();
        L l0 = this.i.zzq().c;
        if(l0 != null) {
            this.i.zzq().zzB();
            l0.onActivityCreated(((Activity)ObjectWrapper.unwrap(iObjectWrapper0)), bundle0);
        }
    }

    @Override  // com.google.android.gms.internal.measurement.zzcc
    public void onActivityDestroyed(IObjectWrapper iObjectWrapper0, long v) throws RemoteException {
        this.zzb();
        L l0 = this.i.zzq().c;
        if(l0 != null) {
            this.i.zzq().zzB();
            l0.onActivityDestroyed(((Activity)ObjectWrapper.unwrap(iObjectWrapper0)));
        }
    }

    @Override  // com.google.android.gms.internal.measurement.zzcc
    public void onActivityPaused(IObjectWrapper iObjectWrapper0, long v) throws RemoteException {
        this.zzb();
        L l0 = this.i.zzq().c;
        if(l0 != null) {
            this.i.zzq().zzB();
            l0.onActivityPaused(((Activity)ObjectWrapper.unwrap(iObjectWrapper0)));
        }
    }

    @Override  // com.google.android.gms.internal.measurement.zzcc
    public void onActivityResumed(IObjectWrapper iObjectWrapper0, long v) throws RemoteException {
        this.zzb();
        L l0 = this.i.zzq().c;
        if(l0 != null) {
            this.i.zzq().zzB();
            l0.onActivityResumed(((Activity)ObjectWrapper.unwrap(iObjectWrapper0)));
        }
    }

    @Override  // com.google.android.gms.internal.measurement.zzcc
    public void onActivitySaveInstanceState(IObjectWrapper iObjectWrapper0, zzcf zzcf0, long v) throws RemoteException {
        this.zzb();
        L l0 = this.i.zzq().c;
        Bundle bundle0 = new Bundle();
        if(l0 != null) {
            this.i.zzq().zzB();
            l0.onActivitySaveInstanceState(((Activity)ObjectWrapper.unwrap(iObjectWrapper0)), bundle0);
        }
        try {
            zzcf0.zzd(bundle0);
        }
        catch(RemoteException remoteException0) {
            this.i.zzay().zzk().zzb("Error returning bundle value to wrapper", remoteException0);
        }
    }

    @Override  // com.google.android.gms.internal.measurement.zzcc
    public void onActivityStarted(IObjectWrapper iObjectWrapper0, long v) throws RemoteException {
        this.zzb();
        if(this.i.zzq().c != null) {
            this.i.zzq().zzB();
            Activity activity0 = (Activity)ObjectWrapper.unwrap(iObjectWrapper0);
        }
    }

    @Override  // com.google.android.gms.internal.measurement.zzcc
    public void onActivityStopped(IObjectWrapper iObjectWrapper0, long v) throws RemoteException {
        this.zzb();
        if(this.i.zzq().c != null) {
            this.i.zzq().zzB();
            Activity activity0 = (Activity)ObjectWrapper.unwrap(iObjectWrapper0);
        }
    }

    @Override  // com.google.android.gms.internal.measurement.zzcc
    public void performAction(Bundle bundle0, zzcf zzcf0, long v) throws RemoteException {
        this.zzb();
        zzcf0.zzd(null);
    }

    @Override  // com.google.android.gms.internal.measurement.zzcc
    public void registerOnMeasurementEventListener(zzci zzci0) throws RemoteException {
        zzhf zzhf0;
        this.zzb();
        synchronized(this.j) {
            Integer integer0 = zzci0.zzd();
            zzhf0 = (zzhf)this.j.getOrDefault(integer0, null);
            if(zzhf0 == null) {
                zzhf0 = new i0(this, zzci0);
                Integer integer1 = zzci0.zzd();
                this.j.put(integer1, zzhf0);
            }
        }
        this.i.zzq().zzJ(zzhf0);
    }

    @Override  // com.google.android.gms.internal.measurement.zzcc
    public void resetAnalyticsData(long v) throws RemoteException {
        this.zzb();
        this.i.zzq().zzK(v);
    }

    @Override  // com.google.android.gms.internal.measurement.zzcc
    public void setConditionalUserProperty(Bundle bundle0, long v) throws RemoteException {
        this.zzb();
        if(bundle0 == null) {
            u9.o(this.i, "Conditional user property must not be null");
            return;
        }
        this.i.zzq().zzQ(bundle0, v);
    }

    @Override  // com.google.android.gms.internal.measurement.zzcc
    public void setConsent(Bundle bundle0, long v) throws RemoteException {
        this.zzb();
        zzij zzij0 = this.i.zzq();
        zzij0.a.zzaz().zzq(new zzhi(zzij0, bundle0, v));
    }

    @Override  // com.google.android.gms.internal.measurement.zzcc
    public void setConsentThirdParty(Bundle bundle0, long v) throws RemoteException {
        this.zzb();
        this.i.zzq().zzR(bundle0, -20, v);
    }

    @Override  // com.google.android.gms.internal.measurement.zzcc
    public void setCurrentScreen(IObjectWrapper iObjectWrapper0, String s, String s1, long v) throws RemoteException {
        this.zzb();
        this.i.zzs().zzw(((Activity)ObjectWrapper.unwrap(iObjectWrapper0)), s, s1);
    }

    @Override  // com.google.android.gms.internal.measurement.zzcc
    public void setDataCollectionEnabled(boolean z) throws RemoteException {
        this.zzb();
        zzij zzij0 = this.i.zzq();
        zzij0.zza();
        zzij0.a.zzaz().zzp(new N2(zzij0, z, 2));
    }

    @Override  // com.google.android.gms.internal.measurement.zzcc
    public void setDefaultEventParameters(Bundle bundle0) {
        this.zzb();
        zzij zzij0 = this.i.zzq();
        Bundle bundle1 = bundle0 == null ? null : new Bundle(bundle0);
        zzij0.a.zzaz().zzp(new zzhj(zzij0, bundle1));
    }

    @Override  // com.google.android.gms.internal.measurement.zzcc
    public void setEventInterceptor(zzci zzci0) throws RemoteException {
        this.zzb();
        g1.n n0 = new g1.n(13, this, zzci0);
        if(this.i.zzaz().zzs()) {
            this.i.zzq().zzT(n0);
            return;
        }
        this.i.zzaz().zzp(new a(this, n0, 17, false));
    }

    @Override  // com.google.android.gms.internal.measurement.zzcc
    public void setInstanceIdProvider(zzck zzck0) throws RemoteException {
        this.zzb();
    }

    @Override  // com.google.android.gms.internal.measurement.zzcc
    public void setMeasurementEnabled(boolean z, long v) throws RemoteException {
        this.zzb();
        this.i.zzq().zzU(Boolean.valueOf(z));
    }

    @Override  // com.google.android.gms.internal.measurement.zzcc
    public void setMinimumSessionDuration(long v) throws RemoteException {
        this.zzb();
    }

    @Override  // com.google.android.gms.internal.measurement.zzcc
    public void setSessionTimeoutDuration(long v) throws RemoteException {
        this.zzb();
        zzij zzij0 = this.i.zzq();
        zzij0.a.zzaz().zzp(new E(zzij0, v, 0));
    }

    @Override  // com.google.android.gms.internal.measurement.zzcc
    public void setUserId(String s, long v) throws RemoteException {
        this.zzb();
        zzij zzij0 = this.i.zzq();
        if(s != null && TextUtils.isEmpty(s)) {
            zzij0.a.zzay().zzk().zza("User ID must be non-empty or null");
            return;
        }
        zzij0.a.zzaz().zzp(new zzhk(zzij0, s));
        zzij0.zzX(null, "_id", s, true, v);
    }

    @Override  // com.google.android.gms.internal.measurement.zzcc
    public void setUserProperty(String s, String s1, IObjectWrapper iObjectWrapper0, boolean z, long v) throws RemoteException {
        this.zzb();
        Object object0 = ObjectWrapper.unwrap(iObjectWrapper0);
        this.i.zzq().zzX(s, s1, object0, z, v);
    }

    @Override  // com.google.android.gms.internal.measurement.zzcc
    public void unregisterOnMeasurementEventListener(zzci zzci0) throws RemoteException {
        zzhf zzhf0;
        this.zzb();
        synchronized(this.j) {
            Integer integer0 = zzci0.zzd();
            zzhf0 = (zzhf)this.j.remove(integer0);
        }
        if(zzhf0 == null) {
            zzhf0 = new i0(this, zzci0);
        }
        this.i.zzq().zzZ(zzhf0);
    }

    public final void zzb() {
        if(this.i == null) {
            throw new IllegalStateException("Attempting to perform action before initialize.");
        }
    }
}

