package com.google.android.gms.common.moduleinstall;

import com.google.android.gms.common.api.OptionalModuleApi;
import com.google.android.gms.common.internal.Preconditions;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

public final class ModuleInstallRequest {
    public static class Builder {
        public final ArrayList a;
        public InstallStatusListener b;
        public Executor c;

        public Builder() {
            this.a = new ArrayList();
        }

        @CanIgnoreReturnValue
        public Builder addApi(OptionalModuleApi optionalModuleApi0) {
            this.a.add(optionalModuleApi0);
            return this;
        }

        public ModuleInstallRequest build() {
            return new ModuleInstallRequest(this.a, this.b, this.c);
        }

        @CanIgnoreReturnValue
        public Builder setListener(InstallStatusListener installStatusListener0) {
            return this.setListener(installStatusListener0, null);
        }

        @CanIgnoreReturnValue
        public Builder setListener(InstallStatusListener installStatusListener0, Executor executor0) {
            this.b = installStatusListener0;
            this.c = executor0;
            return this;
        }
    }

    public final ArrayList a;
    public final InstallStatusListener b;
    public final Executor c;

    public ModuleInstallRequest(ArrayList arrayList0, InstallStatusListener installStatusListener0, Executor executor0) {
        Preconditions.checkNotNull(arrayList0, "APIs must not be null.");
        Preconditions.checkArgument(!arrayList0.isEmpty(), "APIs must not be empty.");
        if(executor0 != null) {
            Preconditions.checkNotNull(installStatusListener0, "Listener must not be null when listener executor is set.");
        }
        this.a = arrayList0;
        this.b = installStatusListener0;
        this.c = executor0;
    }

    public List getApis() {
        return this.a;
    }

    public InstallStatusListener getListener() {
        return this.b;
    }

    public Executor getListenerExecutor() {
        return this.c;
    }

    public static Builder newBuilder() {
        return new Builder();
    }
}

