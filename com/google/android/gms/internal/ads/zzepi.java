package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.content.IntentFilter;
import java.util.concurrent.Callable;

public final class zzepi implements Callable {
    public final zzepj zza;

    public zzepi(zzepj zzepj0) {
        this.zza = zzepj0;
    }

    @Override
    public final Object call() {
        this.zza.getClass();
        IntentFilter intentFilter0 = new IntentFilter("android.intent.action.BATTERY_CHANGED");
        Intent intent0 = this.zza.b.registerReceiver(null, intentFilter0);
        if(intent0 != null) {
            int v = intent0.getIntExtra("status", -1);
            double f = ((double)intent0.getIntExtra("level", -1)) / ((double)intent0.getIntExtra("scale", -1));
            return v != 2 && v != 5 ? new zzepk(f, false) : new zzepk(f, true);
        }
        return new zzepk(-1.0, false);
    }
}

