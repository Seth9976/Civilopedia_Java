package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Api.Client;
import com.google.android.gms.tasks.TaskCompletionSource;

public final class e extends UnregisterListenerMethod {
    public final Builder b;

    public e(Builder registrationMethods$Builder0, ListenerKey listenerHolder$ListenerKey0) {
        this.b = registrationMethods$Builder0;
        super(listenerHolder$ListenerKey0);
    }

    @Override  // com.google.android.gms.common.api.internal.UnregisterListenerMethod
    public final void a(Client api$Client0, TaskCompletionSource taskCompletionSource0) {
        this.b.b.accept(api$Client0, taskCompletionSource0);
    }
}

