package com.google.android.gms.common.internal;

import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
public final class RootTelemetryConfigManager {
    public RootTelemetryConfiguration a;
    public static RootTelemetryConfigManager b;
    public static final RootTelemetryConfiguration c;

    static {
        RootTelemetryConfigManager.c = new RootTelemetryConfiguration(0, false, false, 0, 0);
    }

    @KeepForSdk
    public RootTelemetryConfiguration getConfig() {
        return this.a;
    }

    @KeepForSdk
    public static RootTelemetryConfigManager getInstance() {
        synchronized(RootTelemetryConfigManager.class) {
            if(RootTelemetryConfigManager.b == null) {
                RootTelemetryConfigManager.b = new RootTelemetryConfigManager();  // 初始化器: Ljava/lang/Object;-><init>()V
            }
            return RootTelemetryConfigManager.b;
        }
    }

    public final void zza(RootTelemetryConfiguration rootTelemetryConfiguration0) {
        synchronized(this) {
            if(rootTelemetryConfiguration0 == null) {
                this.a = RootTelemetryConfigManager.c;
                return;
            }
            if(this.a != null && this.a.getVersion() >= rootTelemetryConfiguration0.getVersion()) {
                return;
            }
            this.a = rootTelemetryConfiguration0;
        }
    }
}

