package com.google.android.gms.measurement;

import J.a;
import android.content.BroadcastReceiver.PendingResult;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.measurement.internal.zzfn.zza;
import com.google.android.gms.measurement.internal.zzfn;

public final class AppMeasurementReceiver extends a implements zzfn.zza {
    public zzfn k;

    public BroadcastReceiver.PendingResult doGoAsync() {
        return this.goAsync();
    }

    @Override  // com.google.android.gms.measurement.internal.zzfn$zza
    public void doStartService(Context context0, Intent intent0) {
        a.startWakefulService(context0, intent0);
    }

    @Override  // android.content.BroadcastReceiver
    public void onReceive(Context context0, Intent intent0) {
        if(this.k == null) {
            this.k = new zzfn(this);
        }
        this.k.zza(context0, intent0);
    }
}

