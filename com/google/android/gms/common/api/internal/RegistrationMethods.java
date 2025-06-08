package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.Feature;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.errorprone.annotations.CanIgnoreReturnValue;

@KeepForSdk
public class RegistrationMethods {
    @KeepForSdk
    public static class Builder {
        public RemoteCall a;
        public RemoteCall b;
        public Runnable c;
        public ListenerHolder d;
        public Feature[] e;
        public boolean f;
        public int g;

        @KeepForSdk
        public RegistrationMethods build() {
            boolean z = false;
            Preconditions.checkArgument(this.a != null, "Must set register function");
            Preconditions.checkArgument(this.b != null, "Must set unregister function");
            if(this.d != null) {
                z = true;
            }
            Preconditions.checkArgument(z, "Must set holder");
            ListenerKey listenerHolder$ListenerKey0 = (ListenerKey)Preconditions.checkNotNull(this.d.getListenerKey(), "Key must not be null");
            return new RegistrationMethods(new d(this, this.d, this.e, this.f, this.g), new e(this, listenerHolder$ListenerKey0), this.c);
        }

        @KeepForSdk
        @CanIgnoreReturnValue
        public Builder onConnectionSuspended(Runnable runnable0) {
            this.c = runnable0;
            return this;
        }

        @KeepForSdk
        @CanIgnoreReturnValue
        public Builder register(RemoteCall remoteCall0) {
            this.a = remoteCall0;
            return this;
        }

        @KeepForSdk
        @CanIgnoreReturnValue
        public Builder setAutoResolveMissingFeatures(boolean z) {
            this.f = z;
            return this;
        }

        @KeepForSdk
        @CanIgnoreReturnValue
        public Builder setFeatures(Feature[] arr_feature) {
            this.e = arr_feature;
            return this;
        }

        @KeepForSdk
        @CanIgnoreReturnValue
        public Builder setMethodKey(int v) {
            this.g = v;
            return this;
        }

        @KeepForSdk
        @CanIgnoreReturnValue
        public Builder unregister(RemoteCall remoteCall0) {
            this.b = remoteCall0;
            return this;
        }

        @KeepForSdk
        @CanIgnoreReturnValue
        public Builder withHolder(ListenerHolder listenerHolder0) {
            this.d = listenerHolder0;
            return this;
        }
    }

    @KeepForSdk
    public final RegisterListenerMethod register;
    public final UnregisterListenerMethod zaa;
    public final Runnable zab;

    public RegistrationMethods(d d0, e e0, Runnable runnable0) {
        this.register = d0;
        this.zaa = e0;
        this.zab = runnable0;
    }

    @KeepForSdk
    public static Builder builder() {
        Builder registrationMethods$Builder0 = new Builder();  // 初始化器: Ljava/lang/Object;-><init>()V
        registrationMethods$Builder0.c = zacj.zaa;
        registrationMethods$Builder0.f = true;
        return registrationMethods$Builder0;
    }
}

