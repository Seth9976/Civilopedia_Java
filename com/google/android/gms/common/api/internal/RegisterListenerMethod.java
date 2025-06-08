package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.Feature;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.tasks.TaskCompletionSource;

@KeepForSdk
public abstract class RegisterListenerMethod {
    public final ListenerHolder a;
    public final Feature[] b;
    public final boolean c;
    public final int d;

    public RegisterListenerMethod(ListenerHolder listenerHolder0, Feature[] arr_feature, boolean z, int v) {
        this.a = listenerHolder0;
        this.b = arr_feature;
        this.c = z;
        this.d = v;
    }

    public abstract void a(AnyClient arg1, TaskCompletionSource arg2);

    @KeepForSdk
    public void clearListener() {
        this.a.clear();
    }

    @KeepForSdk
    public ListenerKey getListenerKey() {
        return this.a.getListenerKey();
    }

    @KeepForSdk
    public Feature[] getRequiredFeatures() {
        return this.b;
    }

    public final int zaa() {
        return this.d;
    }

    public final boolean zab() {
        return this.c;
    }
}

