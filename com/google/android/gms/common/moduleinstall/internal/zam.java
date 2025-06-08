package com.google.android.gms.common.moduleinstall.internal;

import S0.g;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.tasks.TaskCompletionSource;

public final class zam implements RemoteCall {
    public final zay zaa;
    public final ApiFeatureRequest zab;

    public zam(zay zay0, ApiFeatureRequest apiFeatureRequest0) {
        this.zaa = zay0;
        this.zab = apiFeatureRequest0;
    }

    @Override  // com.google.android.gms.common.api.internal.RemoteCall
    public final void accept(Object object0, Object object1) {
        g g0 = new g(((TaskCompletionSource)object1));
        ((zaf)((zaz)object0).getService()).zah(g0, this.zab);
    }
}

