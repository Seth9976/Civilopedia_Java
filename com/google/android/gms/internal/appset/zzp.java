package com.google.android.gms.internal.appset;

import a1.b;
import android.content.Context;
import com.google.android.gms.appset.AppSetIdClient;
import com.google.android.gms.appset.zze;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.Api.ApiOptions;
import com.google.android.gms.common.api.Api.ClientKey;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.GoogleApi.Settings;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;

public final class zzp extends GoogleApi implements AppSetIdClient {
    public final Context k;
    public final GoogleApiAvailabilityLight l;
    public static final Api m;

    static {
        ClientKey api$ClientKey0 = new ClientKey();
        zzp.m = new Api("AppSet.API", new b(), api$ClientKey0);  // 初始化器: Lcom/google/android/gms/common/api/Api$AbstractClientBuilder;-><init>()V
    }

    public zzp(Context context0, GoogleApiAvailabilityLight googleApiAvailabilityLight0) {
        super(context0, zzp.m, ApiOptions.NO_OPTIONS, Settings.DEFAULT_SETTINGS);
        this.k = context0;
        this.l = googleApiAvailabilityLight0;
    }

    @Override  // com.google.android.gms.appset.AppSetIdClient
    public final Task getAppSetIdInfo() {
        return this.l.isGooglePlayServicesAvailable(this.k, 212800000) == 0 ? this.doRead(TaskApiCall.builder().setFeatures(new Feature[]{zze.zza}).run(new zzm(this)).setAutoResolveMissingFeatures(false).setMethodKey(27601).build()) : Tasks.forException(new ApiException(new Status(17)));
    }
}

