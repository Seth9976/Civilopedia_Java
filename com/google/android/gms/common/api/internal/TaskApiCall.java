package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.Feature;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api.Client;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.BiConsumer;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.errorprone.annotations.CanIgnoreReturnValue;

@KeepForSdk
public abstract class TaskApiCall {
    @KeepForSdk
    public static class Builder {
        public RemoteCall a;
        public boolean b;
        public Feature[] c;
        public int d;

        @KeepForSdk
        public TaskApiCall build() {
            Preconditions.checkArgument(this.a != null, "execute parameter required");
            return new f(this, this.c, this.b, this.d);
        }

        @KeepForSdk
        @CanIgnoreReturnValue
        @Deprecated
        public Builder execute(BiConsumer biConsumer0) {
            this.a = new zacu(biConsumer0);
            return this;
        }

        @KeepForSdk
        @CanIgnoreReturnValue
        public Builder run(RemoteCall remoteCall0) {
            this.a = remoteCall0;
            return this;
        }

        @KeepForSdk
        @CanIgnoreReturnValue
        public Builder setAutoResolveMissingFeatures(boolean z) {
            this.b = z;
            return this;
        }

        @KeepForSdk
        @CanIgnoreReturnValue
        public Builder setFeatures(Feature[] arr_feature) {
            this.c = arr_feature;
            return this;
        }

        @KeepForSdk
        @CanIgnoreReturnValue
        public Builder setMethodKey(int v) {
            this.d = v;
            return this;
        }
    }

    public final Feature[] a;
    public final boolean b;
    public final int c;

    @KeepForSdk
    @Deprecated
    public TaskApiCall() {
        this.a = null;
        this.b = false;
        this.c = 0;
    }

    public TaskApiCall(Feature[] arr_feature, boolean z, int v) {
        this.a = arr_feature;
        this.b = arr_feature != null && z;
        this.c = v;
    }

    public abstract void a(Client arg1, TaskCompletionSource arg2);

    @KeepForSdk
    public static Builder builder() {
        Builder taskApiCall$Builder0 = new Builder();  // 初始化器: Ljava/lang/Object;-><init>()V
        taskApiCall$Builder0.b = true;
        taskApiCall$Builder0.d = 0;
        return taskApiCall$Builder0;
    }

    @KeepForSdk
    public boolean shouldAutoResolveMissingFeatures() {
        return this.b;
    }

    public final int zaa() {
        return this.c;
    }

    public final Feature[] zab() {
        return this.a;
    }
}

