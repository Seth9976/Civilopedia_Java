package com.google.android.gms.measurement.internal;

import B.a;
import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.internal.measurement.zzbq;
import com.google.android.gms.internal.measurement.zzbr;

public final class zzfl implements ServiceConnection {
    public final String i;
    public final zzfm j;

    public zzfl(zzfm zzfm0, String s) {
        this.j = zzfm0;
        this.i = s;
    }

    @Override  // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName0, IBinder iBinder0) {
        zzge zzge0 = this.j.a;
        if(iBinder0 != null) {
            try {
                zzbr zzbr0 = zzbq.zzb(iBinder0);
                if(zzbr0 == null) {
                    zzge0.zzay().zzk().zza("Install Referrer Service implementation was not found");
                    return;
                }
                zzge0.zzay().zzj().zza("Install Referrer Service connected");
                zzge0.zzaz().zzp(new a(this, zzbr0, this));
                return;
            }
            catch(RuntimeException runtimeException0) {
            }
            zzge0.zzay().zzk().zzb("Exception occurred while calling Install Referrer API", runtimeException0);
            return;
        }
        zzge0.zzay().zzk().zza("Install Referrer connection returned with null binder");
    }

    @Override  // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName0) {
        this.j.a.zzay().zzj().zza("Install Referrer Service disconnected");
    }
}

