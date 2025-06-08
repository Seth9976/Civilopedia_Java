package com.google.android.gms.location;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.api.Api.ClientKey;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.internal.location.zzg;
import g1.a;

public class ActivityRecognition {
    public static final Api API = null;
    @Deprecated
    public static final ActivityRecognitionApi ActivityRecognitionApi = null;
    public static final String CLIENT_NAME = "activity_recognition";

    static {
        ClientKey api$ClientKey0 = new ClientKey();
        ActivityRecognition.API = new Api("ActivityRecognition.API", new a(), api$ClientKey0);  // 初始化器: Lcom/google/android/gms/common/api/Api$AbstractClientBuilder;-><init>()V
        ActivityRecognition.ActivityRecognitionApi = new zzg();
    }

    public static ActivityRecognitionClient getClient(Activity activity0) {
        return new ActivityRecognitionClient(activity0);
    }

    public static ActivityRecognitionClient getClient(Context context0) {
        return new ActivityRecognitionClient(context0);
    }
}

