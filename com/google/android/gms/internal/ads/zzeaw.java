package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.ConnectionResult;

public final class zzeaw extends zzeay {
    public zzeaw(Context context0) {
        this.n = new zzbzg(context0, zzt.zzt().zzb(), this, this);
    }

    @Override  // com.google.android.gms.common.internal.BaseGmsClient$BaseConnectionCallbacks
    public final void onConnected(Bundle bundle0) {
        synchronized(this.j) {
            try {
                if(!this.l) {
                    try {
                        this.l = true;
                        this.n.zzp().zzg(this.m, new zzeax(this));
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
        zzt.zzo().zzt(throwable0, "RemoteAdRequestClientTask.onConnected");
        zzebn zzebn1 = new zzebn(1);
        this.i.zze(zzebn1);
    }

    @Override  // com.google.android.gms.internal.ads.zzeay
    public final void onConnectionFailed(ConnectionResult connectionResult0) {
        zzcfi.zze("Cannot connect to remote service, fallback to local instance.");
        zzebn zzebn0 = new zzebn(1);
        this.i.zze(zzebn0);
    }
}

