package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.internal.Preconditions;

public final class zzfn {
    public final zzfn.zza a;

    public zzfn(zzfn.zza zzfn$zza0) {
        Preconditions.checkNotNull(zzfn$zza0);
        this.a = zzfn$zza0;
    }

    public final void zza(Context context0, Intent intent0) {
        zzeu zzeu0 = zzge.zzp(context0, null, null).zzay();
        if(intent0 == null) {
            zzeu0.zzk().zza("Receiver called with null intent");
            return;
        }
        String s = intent0.getAction();
        zzeu0.zzj().zzb("Local receiver got", s);
        if("com.google.android.gms.measurement.UPLOAD".equals(s)) {
            Intent intent1 = new Intent().setClassName(context0, "com.google.android.gms.measurement.AppMeasurementService");
            intent1.setAction("com.google.android.gms.measurement.UPLOAD");
            zzeu0.zzj().zza("Starting wakeful intent.");
            this.a.doStartService(context0, intent1);
            return;
        }
        if("com.android.vending.INSTALL_REFERRER".equals(s)) {
            zzeu0.zzk().zza("Install Referrer Broadcasts are deprecated");
        }
    }
}

