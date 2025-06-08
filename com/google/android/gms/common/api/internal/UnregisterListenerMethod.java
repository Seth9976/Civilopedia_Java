package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api.Client;
import com.google.android.gms.tasks.TaskCompletionSource;

@KeepForSdk
public abstract class UnregisterListenerMethod {
    public final ListenerKey a;

    public UnregisterListenerMethod(ListenerKey listenerHolder$ListenerKey0) {
        this.a = listenerHolder$ListenerKey0;
    }

    public abstract void a(Client arg1, TaskCompletionSource arg2);

    @KeepForSdk
    public ListenerKey getListenerKey() {
        return this.a;
    }
}

