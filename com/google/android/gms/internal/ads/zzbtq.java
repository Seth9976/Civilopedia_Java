package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import java.util.Map;

public final class zzbtq extends zzcmy {
    public final AppMeasurementSdk i;

    public zzbtq(AppMeasurementSdk appMeasurementSdk0) {
        this.i = appMeasurementSdk0;
    }

    @Override  // com.google.android.gms.internal.ads.zzcmz
    public final int zzb(String s) throws RemoteException {
        return this.i.getMaxUserProperties(s);
    }

    @Override  // com.google.android.gms.internal.ads.zzcmz
    public final long zzc() throws RemoteException {
        return this.i.generateEventId();
    }

    @Override  // com.google.android.gms.internal.ads.zzcmz
    public final Bundle zzd(Bundle bundle0) throws RemoteException {
        return this.i.performActionWithResponse(bundle0);
    }

    @Override  // com.google.android.gms.internal.ads.zzcmz
    public final String zze() throws RemoteException {
        return this.i.getAppIdOrigin();
    }

    @Override  // com.google.android.gms.internal.ads.zzcmz
    public final String zzf() throws RemoteException {
        return this.i.getAppInstanceId();
    }

    @Override  // com.google.android.gms.internal.ads.zzcmz
    public final String zzg() throws RemoteException {
        return this.i.getCurrentScreenClass();
    }

    @Override  // com.google.android.gms.internal.ads.zzcmz
    public final String zzh() throws RemoteException {
        return this.i.getCurrentScreenName();
    }

    @Override  // com.google.android.gms.internal.ads.zzcmz
    public final String zzi() throws RemoteException {
        return this.i.getGmpAppId();
    }

    @Override  // com.google.android.gms.internal.ads.zzcmz
    public final List zzj(String s, String s1) throws RemoteException {
        return this.i.getConditionalUserProperties(s, s1);
    }

    @Override  // com.google.android.gms.internal.ads.zzcmz
    public final Map zzk(String s, String s1, boolean z) throws RemoteException {
        return this.i.getUserProperties(s, s1, z);
    }

    @Override  // com.google.android.gms.internal.ads.zzcmz
    public final void zzl(String s) throws RemoteException {
        this.i.beginAdUnitExposure(s);
    }

    @Override  // com.google.android.gms.internal.ads.zzcmz
    public final void zzm(String s, String s1, Bundle bundle0) throws RemoteException {
        this.i.clearConditionalUserProperty(s, s1, bundle0);
    }

    @Override  // com.google.android.gms.internal.ads.zzcmz
    public final void zzn(String s) throws RemoteException {
        this.i.endAdUnitExposure(s);
    }

    @Override  // com.google.android.gms.internal.ads.zzcmz
    public final void zzo(String s, String s1, Bundle bundle0) throws RemoteException {
        this.i.logEvent(s, s1, bundle0);
    }

    @Override  // com.google.android.gms.internal.ads.zzcmz
    public final void zzp(Bundle bundle0) throws RemoteException {
        this.i.performAction(bundle0);
    }

    @Override  // com.google.android.gms.internal.ads.zzcmz
    public final void zzq(Bundle bundle0) throws RemoteException {
        this.i.setConditionalUserProperty(bundle0);
    }

    @Override  // com.google.android.gms.internal.ads.zzcmz
    public final void zzr(Bundle bundle0) throws RemoteException {
        this.i.setConsent(bundle0);
    }

    @Override  // com.google.android.gms.internal.ads.zzcmz
    public final void zzs(IObjectWrapper iObjectWrapper0, String s, String s1) throws RemoteException {
        Activity activity0 = iObjectWrapper0 == null ? null : ((Activity)ObjectWrapper.unwrap(iObjectWrapper0));
        this.i.setCurrentScreen(activity0, s, s1);
    }

    @Override  // com.google.android.gms.internal.ads.zzcmz
    public final void zzt(String s, String s1, IObjectWrapper iObjectWrapper0) throws RemoteException {
        Object object0 = iObjectWrapper0 == null ? null : ObjectWrapper.unwrap(iObjectWrapper0);
        this.i.setUserProperty(s, s1, object0);
    }
}

