package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;

public final class zzhi implements Runnable {
    public final zzij zza;
    public final Bundle zzb;
    public final long zzc;

    public zzhi(zzij zzij0, Bundle bundle0, long v) {
        this.zza = zzij0;
        this.zzb = bundle0;
        this.zzc = v;
    }

    @Override
    public final void run() {
        zzij zzij0 = this.zza;
        Bundle bundle0 = this.zzb;
        long v = this.zzc;
        if(TextUtils.isEmpty(zzij0.a.zzh().zzm())) {
            zzij0.zzR(bundle0, 0, v);
            return;
        }
        zzij0.a.zzay().zzl().zza("Using developer consent only; google app id found");
    }
}

