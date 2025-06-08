package com.google.android.gms.common.moduleinstall.internal;

import S0.b;
import S0.f;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.tasks.TaskCompletionSource;

public final class zaj implements RemoteCall {
    public final zay zaa;
    public final b zab;

    public zaj(zay zay0, b b0) {
        this.zaa = zay0;
        this.zab = b0;
    }

    @Override  // com.google.android.gms.common.api.internal.RemoteCall
    public final void accept(Object object0, Object object1) {
        f f0 = new f(((TaskCompletionSource)object1));
        ((zaf)((zaz)object0).getService()).zai(f0, this.zab);
    }
}

