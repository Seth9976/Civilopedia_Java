package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.Map;

public final class zzca extends zzbm implements zzcc {
    @Override  // com.google.android.gms.internal.measurement.zzcc
    public final void beginAdUnitExposure(String s, long v) throws RemoteException {
        Parcel parcel0 = this.a();
        parcel0.writeString(s);
        parcel0.writeLong(v);
        this.c(parcel0, 23);
    }

    @Override  // com.google.android.gms.internal.measurement.zzcc
    public final void clearConditionalUserProperty(String s, String s1, Bundle bundle0) throws RemoteException {
        Parcel parcel0 = this.a();
        parcel0.writeString(s);
        parcel0.writeString(s1);
        zzbo.zze(parcel0, bundle0);
        this.c(parcel0, 9);
    }

    @Override  // com.google.android.gms.internal.measurement.zzcc
    public final void clearMeasurementEnabled(long v) throws RemoteException {
        Parcel parcel0 = this.a();
        parcel0.writeLong(v);
        this.c(parcel0, 43);
    }

    @Override  // com.google.android.gms.internal.measurement.zzcc
    public final void endAdUnitExposure(String s, long v) throws RemoteException {
        Parcel parcel0 = this.a();
        parcel0.writeString(s);
        parcel0.writeLong(v);
        this.c(parcel0, 24);
    }

    @Override  // com.google.android.gms.internal.measurement.zzcc
    public final void generateEventId(zzcf zzcf0) throws RemoteException {
        Parcel parcel0 = this.a();
        zzbo.zzf(parcel0, zzcf0);
        this.c(parcel0, 22);
    }

    @Override  // com.google.android.gms.internal.measurement.zzcc
    public final void getAppInstanceId(zzcf zzcf0) throws RemoteException {
        Parcel parcel0 = this.a();
        zzbo.zzf(parcel0, zzcf0);
        this.c(parcel0, 20);
    }

    @Override  // com.google.android.gms.internal.measurement.zzcc
    public final void getCachedAppInstanceId(zzcf zzcf0) throws RemoteException {
        Parcel parcel0 = this.a();
        zzbo.zzf(parcel0, zzcf0);
        this.c(parcel0, 19);
    }

    @Override  // com.google.android.gms.internal.measurement.zzcc
    public final void getConditionalUserProperties(String s, String s1, zzcf zzcf0) throws RemoteException {
        Parcel parcel0 = this.a();
        parcel0.writeString(s);
        parcel0.writeString(s1);
        zzbo.zzf(parcel0, zzcf0);
        this.c(parcel0, 10);
    }

    @Override  // com.google.android.gms.internal.measurement.zzcc
    public final void getCurrentScreenClass(zzcf zzcf0) throws RemoteException {
        Parcel parcel0 = this.a();
        zzbo.zzf(parcel0, zzcf0);
        this.c(parcel0, 17);
    }

    @Override  // com.google.android.gms.internal.measurement.zzcc
    public final void getCurrentScreenName(zzcf zzcf0) throws RemoteException {
        Parcel parcel0 = this.a();
        zzbo.zzf(parcel0, zzcf0);
        this.c(parcel0, 16);
    }

    @Override  // com.google.android.gms.internal.measurement.zzcc
    public final void getGmpAppId(zzcf zzcf0) throws RemoteException {
        Parcel parcel0 = this.a();
        zzbo.zzf(parcel0, zzcf0);
        this.c(parcel0, 21);
    }

    @Override  // com.google.android.gms.internal.measurement.zzcc
    public final void getMaxUserProperties(String s, zzcf zzcf0) throws RemoteException {
        Parcel parcel0 = this.a();
        parcel0.writeString(s);
        zzbo.zzf(parcel0, zzcf0);
        this.c(parcel0, 6);
    }

    @Override  // com.google.android.gms.internal.measurement.zzcc
    public final void getTestFlag(zzcf zzcf0, int v) throws RemoteException {
        Parcel parcel0 = this.a();
        zzbo.zzf(parcel0, zzcf0);
        parcel0.writeInt(v);
        this.c(parcel0, 38);
    }

    @Override  // com.google.android.gms.internal.measurement.zzcc
    public final void getUserProperties(String s, String s1, boolean z, zzcf zzcf0) throws RemoteException {
        Parcel parcel0 = this.a();
        parcel0.writeString(s);
        parcel0.writeString(s1);
        zzbo.zzd(parcel0, z);
        zzbo.zzf(parcel0, zzcf0);
        this.c(parcel0, 5);
    }

    @Override  // com.google.android.gms.internal.measurement.zzcc
    public final void initForTests(Map map0) throws RemoteException {
        throw null;
    }

    @Override  // com.google.android.gms.internal.measurement.zzcc
    public final void initialize(IObjectWrapper iObjectWrapper0, zzcl zzcl0, long v) throws RemoteException {
        Parcel parcel0 = this.a();
        zzbo.zzf(parcel0, iObjectWrapper0);
        zzbo.zze(parcel0, zzcl0);
        parcel0.writeLong(v);
        this.c(parcel0, 1);
    }

    @Override  // com.google.android.gms.internal.measurement.zzcc
    public final void isDataCollectionEnabled(zzcf zzcf0) throws RemoteException {
        throw null;
    }

    @Override  // com.google.android.gms.internal.measurement.zzcc
    public final void logEvent(String s, String s1, Bundle bundle0, boolean z, boolean z1, long v) throws RemoteException {
        Parcel parcel0 = this.a();
        parcel0.writeString(s);
        parcel0.writeString(s1);
        zzbo.zze(parcel0, bundle0);
        zzbo.zzd(parcel0, z);
        zzbo.zzd(parcel0, z1);
        parcel0.writeLong(v);
        this.c(parcel0, 2);
    }

    @Override  // com.google.android.gms.internal.measurement.zzcc
    public final void logEventAndBundle(String s, String s1, Bundle bundle0, zzcf zzcf0, long v) throws RemoteException {
        throw null;
    }

    @Override  // com.google.android.gms.internal.measurement.zzcc
    public final void logHealthData(int v, String s, IObjectWrapper iObjectWrapper0, IObjectWrapper iObjectWrapper1, IObjectWrapper iObjectWrapper2) throws RemoteException {
        Parcel parcel0 = this.a();
        parcel0.writeInt(5);
        parcel0.writeString(s);
        zzbo.zzf(parcel0, iObjectWrapper0);
        zzbo.zzf(parcel0, iObjectWrapper1);
        zzbo.zzf(parcel0, iObjectWrapper2);
        this.c(parcel0, 33);
    }

    @Override  // com.google.android.gms.internal.measurement.zzcc
    public final void onActivityCreated(IObjectWrapper iObjectWrapper0, Bundle bundle0, long v) throws RemoteException {
        Parcel parcel0 = this.a();
        zzbo.zzf(parcel0, iObjectWrapper0);
        zzbo.zze(parcel0, bundle0);
        parcel0.writeLong(v);
        this.c(parcel0, 27);
    }

    @Override  // com.google.android.gms.internal.measurement.zzcc
    public final void onActivityDestroyed(IObjectWrapper iObjectWrapper0, long v) throws RemoteException {
        Parcel parcel0 = this.a();
        zzbo.zzf(parcel0, iObjectWrapper0);
        parcel0.writeLong(v);
        this.c(parcel0, 28);
    }

    @Override  // com.google.android.gms.internal.measurement.zzcc
    public final void onActivityPaused(IObjectWrapper iObjectWrapper0, long v) throws RemoteException {
        Parcel parcel0 = this.a();
        zzbo.zzf(parcel0, iObjectWrapper0);
        parcel0.writeLong(v);
        this.c(parcel0, 29);
    }

    @Override  // com.google.android.gms.internal.measurement.zzcc
    public final void onActivityResumed(IObjectWrapper iObjectWrapper0, long v) throws RemoteException {
        Parcel parcel0 = this.a();
        zzbo.zzf(parcel0, iObjectWrapper0);
        parcel0.writeLong(v);
        this.c(parcel0, 30);
    }

    @Override  // com.google.android.gms.internal.measurement.zzcc
    public final void onActivitySaveInstanceState(IObjectWrapper iObjectWrapper0, zzcf zzcf0, long v) throws RemoteException {
        Parcel parcel0 = this.a();
        zzbo.zzf(parcel0, iObjectWrapper0);
        zzbo.zzf(parcel0, zzcf0);
        parcel0.writeLong(v);
        this.c(parcel0, 0x1F);
    }

    @Override  // com.google.android.gms.internal.measurement.zzcc
    public final void onActivityStarted(IObjectWrapper iObjectWrapper0, long v) throws RemoteException {
        Parcel parcel0 = this.a();
        zzbo.zzf(parcel0, iObjectWrapper0);
        parcel0.writeLong(v);
        this.c(parcel0, 25);
    }

    @Override  // com.google.android.gms.internal.measurement.zzcc
    public final void onActivityStopped(IObjectWrapper iObjectWrapper0, long v) throws RemoteException {
        Parcel parcel0 = this.a();
        zzbo.zzf(parcel0, iObjectWrapper0);
        parcel0.writeLong(v);
        this.c(parcel0, 26);
    }

    @Override  // com.google.android.gms.internal.measurement.zzcc
    public final void performAction(Bundle bundle0, zzcf zzcf0, long v) throws RemoteException {
        Parcel parcel0 = this.a();
        zzbo.zze(parcel0, bundle0);
        zzbo.zzf(parcel0, zzcf0);
        parcel0.writeLong(v);
        this.c(parcel0, 0x20);
    }

    @Override  // com.google.android.gms.internal.measurement.zzcc
    public final void registerOnMeasurementEventListener(zzci zzci0) throws RemoteException {
        Parcel parcel0 = this.a();
        zzbo.zzf(parcel0, zzci0);
        this.c(parcel0, 35);
    }

    @Override  // com.google.android.gms.internal.measurement.zzcc
    public final void resetAnalyticsData(long v) throws RemoteException {
        Parcel parcel0 = this.a();
        parcel0.writeLong(v);
        this.c(parcel0, 12);
    }

    @Override  // com.google.android.gms.internal.measurement.zzcc
    public final void setConditionalUserProperty(Bundle bundle0, long v) throws RemoteException {
        Parcel parcel0 = this.a();
        zzbo.zze(parcel0, bundle0);
        parcel0.writeLong(v);
        this.c(parcel0, 8);
    }

    @Override  // com.google.android.gms.internal.measurement.zzcc
    public final void setConsent(Bundle bundle0, long v) throws RemoteException {
        Parcel parcel0 = this.a();
        zzbo.zze(parcel0, bundle0);
        parcel0.writeLong(v);
        this.c(parcel0, 44);
    }

    @Override  // com.google.android.gms.internal.measurement.zzcc
    public final void setConsentThirdParty(Bundle bundle0, long v) throws RemoteException {
        Parcel parcel0 = this.a();
        zzbo.zze(parcel0, bundle0);
        parcel0.writeLong(v);
        this.c(parcel0, 45);
    }

    @Override  // com.google.android.gms.internal.measurement.zzcc
    public final void setCurrentScreen(IObjectWrapper iObjectWrapper0, String s, String s1, long v) throws RemoteException {
        Parcel parcel0 = this.a();
        zzbo.zzf(parcel0, iObjectWrapper0);
        parcel0.writeString(s);
        parcel0.writeString(s1);
        parcel0.writeLong(v);
        this.c(parcel0, 15);
    }

    @Override  // com.google.android.gms.internal.measurement.zzcc
    public final void setDataCollectionEnabled(boolean z) throws RemoteException {
        Parcel parcel0 = this.a();
        zzbo.zzd(parcel0, z);
        this.c(parcel0, 39);
    }

    @Override  // com.google.android.gms.internal.measurement.zzcc
    public final void setDefaultEventParameters(Bundle bundle0) throws RemoteException {
        Parcel parcel0 = this.a();
        zzbo.zze(parcel0, bundle0);
        this.c(parcel0, 42);
    }

    @Override  // com.google.android.gms.internal.measurement.zzcc
    public final void setEventInterceptor(zzci zzci0) throws RemoteException {
        Parcel parcel0 = this.a();
        zzbo.zzf(parcel0, zzci0);
        this.c(parcel0, 34);
    }

    @Override  // com.google.android.gms.internal.measurement.zzcc
    public final void setInstanceIdProvider(zzck zzck0) throws RemoteException {
        throw null;
    }

    @Override  // com.google.android.gms.internal.measurement.zzcc
    public final void setMeasurementEnabled(boolean z, long v) throws RemoteException {
        Parcel parcel0 = this.a();
        zzbo.zzd(parcel0, z);
        parcel0.writeLong(v);
        this.c(parcel0, 11);
    }

    @Override  // com.google.android.gms.internal.measurement.zzcc
    public final void setMinimumSessionDuration(long v) throws RemoteException {
        throw null;
    }

    @Override  // com.google.android.gms.internal.measurement.zzcc
    public final void setSessionTimeoutDuration(long v) throws RemoteException {
        Parcel parcel0 = this.a();
        parcel0.writeLong(v);
        this.c(parcel0, 14);
    }

    @Override  // com.google.android.gms.internal.measurement.zzcc
    public final void setUserId(String s, long v) throws RemoteException {
        Parcel parcel0 = this.a();
        parcel0.writeString(s);
        parcel0.writeLong(v);
        this.c(parcel0, 7);
    }

    @Override  // com.google.android.gms.internal.measurement.zzcc
    public final void setUserProperty(String s, String s1, IObjectWrapper iObjectWrapper0, boolean z, long v) throws RemoteException {
        Parcel parcel0 = this.a();
        parcel0.writeString(s);
        parcel0.writeString(s1);
        zzbo.zzf(parcel0, iObjectWrapper0);
        zzbo.zzd(parcel0, z);
        parcel0.writeLong(v);
        this.c(parcel0, 4);
    }

    @Override  // com.google.android.gms.internal.measurement.zzcc
    public final void unregisterOnMeasurementEventListener(zzci zzci0) throws RemoteException {
        Parcel parcel0 = this.a();
        zzbo.zzf(parcel0, zzci0);
        this.c(parcel0, 36);
    }
}

