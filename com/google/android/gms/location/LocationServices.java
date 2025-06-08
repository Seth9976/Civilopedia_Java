package com.google.android.gms.location;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.api.Api.ClientKey;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.location.zzaf;
import com.google.android.gms.internal.location.zzaz;
import com.google.android.gms.internal.location.zzbi;
import com.google.android.gms.internal.location.zzz;
import g1.l;

public class LocationServices {
    public static final Api API;
    @Deprecated
    public static final FusedLocationProviderApi FusedLocationApi;
    @Deprecated
    public static final GeofencingApi GeofencingApi;
    @Deprecated
    public static final SettingsApi SettingsApi;
    public static final ClientKey a;

    static {
        ClientKey api$ClientKey0 = new ClientKey();
        LocationServices.a = api$ClientKey0;
        LocationServices.API = new Api("LocationServices.API", new l(), api$ClientKey0);  // 初始化器: Lcom/google/android/gms/common/api/Api$AbstractClientBuilder;-><init>()V
        LocationServices.FusedLocationApi = new zzz();
        LocationServices.GeofencingApi = new zzaf();
        LocationServices.SettingsApi = new zzbi();
    }

    public static FusedLocationProviderClient getFusedLocationProviderClient(Activity activity0) {
        return new FusedLocationProviderClient(activity0);
    }

    public static FusedLocationProviderClient getFusedLocationProviderClient(Context context0) {
        return new FusedLocationProviderClient(context0);
    }

    public static GeofencingClient getGeofencingClient(Activity activity0) {
        return new GeofencingClient(activity0);
    }

    public static GeofencingClient getGeofencingClient(Context context0) {
        return new GeofencingClient(context0);
    }

    public static SettingsClient getSettingsClient(Activity activity0) {
        return new SettingsClient(activity0);
    }

    public static SettingsClient getSettingsClient(Context context0) {
        return new SettingsClient(context0);
    }

    public static zzaz zza(GoogleApiClient googleApiClient0) {
        boolean z = false;
        Preconditions.checkArgument(googleApiClient0 != null, "GoogleApiClient parameter is required.");
        zzaz zzaz0 = (zzaz)googleApiClient0.getClient(LocationServices.a);
        if(zzaz0 != null) {
            z = true;
        }
        Preconditions.checkState(z, "GoogleApiClient is not configured to use the LocationServices.API Api. Pass thisinto GoogleApiClient.Builder#addApi() to use this feature.");
        return zzaz0;
    }
}

