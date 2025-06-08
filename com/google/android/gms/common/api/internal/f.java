package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Api.Client;
import com.google.android.gms.tasks.TaskCompletionSource;

public final class f extends TaskApiCall {
    public final Builder d;

    public f(Builder taskApiCall$Builder0, Feature[] arr_feature, boolean z, int v) {
        this.d = taskApiCall$Builder0;
        super(arr_feature, z, v);
    }

    @Override  // com.google.android.gms.common.api.internal.TaskApiCall
    public final void a(Client api$Client0, TaskCompletionSource taskCompletionSource0) {
        this.d.a.accept(api$Client0, taskCompletionSource0);
    }
}

