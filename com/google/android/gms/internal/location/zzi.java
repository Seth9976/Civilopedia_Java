package com.google.android.gms.internal.location;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClient;
import com.google.android.gms.location.zzu;
import e1.r;

public class zzi extends GmsClient {
    public final String O;
    public final r P;

    public zzi(Context context0, Looper looper0, ConnectionCallbacks googleApiClient$ConnectionCallbacks0, OnConnectionFailedListener googleApiClient$OnConnectionFailedListener0, String s, ClientSettings clientSettings0) {
        super(context0, looper0, 23, clientSettings0, googleApiClient$ConnectionCallbacks0, googleApiClient$OnConnectionFailedListener0);
        this.P = new r(this);
        this.O = s;
    }

    @Override  // com.google.android.gms.common.internal.BaseGmsClient
    public final Bundle b() {
        Bundle bundle0 = new Bundle();
        bundle0.putString("client_name", this.O);
        return bundle0;
    }

    @Override  // com.google.android.gms.common.internal.BaseGmsClient
    public final IInterface createServiceInterface(IBinder iBinder0) {
        if(iBinder0 == null) {
            return null;
        }
        IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        return iInterface0 instanceof zzam ? ((zzam)iInterface0) : new zzal(iBinder0, "com.google.android.gms.location.internal.IGoogleLocationManagerService");  // 初始化器: Lcom/google/android/gms/internal/location/zza;-><init>(Landroid/os/IBinder;Ljava/lang/String;)V
    }

    @Override  // com.google.android.gms.common.internal.BaseGmsClient
    public final String d() {
        return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
    }

    @Override  // com.google.android.gms.common.internal.BaseGmsClient
    public final Feature[] getApiFeatures() {
        return zzu.zzf;
    }

    @Override  // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api$Client
    public final int getMinApkVersion() {
        return 11717000;
    }

    @Override  // com.google.android.gms.common.internal.BaseGmsClient
    public final String getStartServiceAction() {
        return "com.google.android.location.internal.GoogleLocationManagerService.START";
    }
}

