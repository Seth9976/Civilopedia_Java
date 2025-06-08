package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.zzt;

public final class zzeba extends zzeay {
    @Override  // com.google.android.gms.common.internal.BaseGmsClient$BaseConnectionCallbacks
    public final void onConnected(Bundle bundle0) {
        synchronized(this.j) {
            try {
                if(!this.l) {
                    try {
                        this.l = true;
                        this.n.zzp().zzf(this.m, new zzeax(this));
                        return;
                    }
                    catch(RemoteException | IllegalArgumentException unused_ex) {
                    }
                    goto label_7;
                }
                return;
            }
            catch(Throwable throwable0) {
                goto label_11;
            }
        }
    label_7:
        zzebn zzebn0 = new zzebn(1);
        this.i.zze(zzebn0);
        return;
    label_11:
        zzt.zzo().zzt(throwable0, "RemoteSignalsClientTask.onConnected");
        zzebn zzebn1 = new zzebn(1);
        this.i.zze(zzebn1);
    }
}

