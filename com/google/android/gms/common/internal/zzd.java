package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Message;
import android.util.Log;

public final class zzd extends zzac {
    public BaseGmsClient i;
    public final int j;

    public zzd(BaseGmsClient baseGmsClient0, int v) {
        this.i = baseGmsClient0;
        this.j = v;
    }

    @Override  // com.google.android.gms.common.internal.IGmsCallbacks
    public final void onPostInitComplete(int v, IBinder iBinder0, Bundle bundle0) {
        Preconditions.checkNotNull(this.i, "onPostInitComplete can be called only once per call to getRemoteService");
        BaseGmsClient baseGmsClient0 = this.i;
        baseGmsClient0.getClass();
        zzf zzf0 = new zzf(baseGmsClient0, v, iBinder0, bundle0);
        Message message0 = baseGmsClient0.t.obtainMessage(1, this.j, -1, zzf0);
        baseGmsClient0.t.sendMessage(message0);
        this.i = null;
    }

    @Override  // com.google.android.gms.common.internal.IGmsCallbacks
    public final void zzb(int v, Bundle bundle0) {
        Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
    }

    @Override  // com.google.android.gms.common.internal.IGmsCallbacks
    public final void zzc(int v, IBinder iBinder0, zzk zzk0) {
        BaseGmsClient baseGmsClient0 = this.i;
        Preconditions.checkNotNull(baseGmsClient0, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
        Preconditions.checkNotNull(zzk0);
        baseGmsClient0.J = zzk0;
        if(baseGmsClient0.usesClientTelemetry()) {
            ConnectionTelemetryConfiguration connectionTelemetryConfiguration0 = zzk0.l;
            RootTelemetryConfigManager.getInstance().zza((connectionTelemetryConfiguration0 == null ? null : connectionTelemetryConfiguration0.zza()));
        }
        this.onPostInitComplete(v, iBinder0, zzk0.i);
    }
}

