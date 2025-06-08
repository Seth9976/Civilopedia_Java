package com.google.android.gms.common.internal.service;

import R0.a;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api.ClientKey;
import com.google.android.gms.common.api.Api;

public final class Common {
    @KeepForSdk
    public static final Api API;
    @KeepForSdk
    public static final ClientKey CLIENT_KEY;
    public static final zae zaa;

    static {
        ClientKey api$ClientKey0 = new ClientKey();
        Common.CLIENT_KEY = api$ClientKey0;
        Common.API = new Api("Common.API", new a(), api$ClientKey0);  // 初始化器: Lcom/google/android/gms/common/api/Api$AbstractClientBuilder;-><init>()V
        Common.zaa = new zae();
    }
}

