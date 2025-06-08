package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.ConnectionResult;

public final class zzebe extends zzeay {
    public String o;
    public int p;

    @Override  // com.google.android.gms.common.internal.BaseGmsClient$BaseConnectionCallbacks
    public final void onConnected(Bundle bundle0) {
        synchronized(this.j) {
            if(!this.l) {
                this.l = true;
                goto label_4;
            }
            return;
        }
        try {
        label_4:
            switch(this.p) {
                case 2: {
                    this.n.zzp().zze(this.m, new zzeax(this));
                    return;
                }
                case 3: {
                    this.n.zzp().zzh(this.o, new zzeax(this));
                    return;
                }
                default: {
                    zzebn zzebn0 = new zzebn(1);
                    this.i.zze(zzebn0);
                    return;
                }
            }
        }
        catch(RemoteException | IllegalArgumentException unused_ex) {
        }
        catch(Throwable throwable1) {
            goto label_17;
        }
        zzebn zzebn1 = new zzebn(1);
        this.i.zze(zzebn1);
        return;
    label_17:
        zzt.zzo().zzt(throwable1, "RemoteUrlAndCacheKeyClientTask.onConnected");
        zzebn zzebn2 = new zzebn(1);
        this.i.zze(zzebn2);
    }

    @Override  // com.google.android.gms.internal.ads.zzeay
    public final void onConnectionFailed(ConnectionResult connectionResult0) {
        zzcfi.zze("Cannot connect to remote service, fallback to local instance.");
        zzebn zzebn0 = new zzebn(1);
        this.i.zze(zzebn0);
    }

    public final zzfvl zzb(zzbzv zzbzv0) {
        synchronized(this.j) {
            if(this.p != 1 && this.p != 2) {
                return zzfvc.zzh(new zzebn(2));
            }
            if(this.k) {
                return this.i;
            }
            this.p = 2;
            this.k = true;
            this.m = zzbzv0;
            this.n.checkAvailabilityAndConnect();
            zzebd zzebd0 = new zzebd(this);
            this.i.zzc(zzebd0, zzcfv.zzf);
            return this.i;
        }
    }

    public final zzfvl zzc(String s) {
        synchronized(this.j) {
            if(this.p != 1 && this.p != 3) {
                return zzfvc.zzh(new zzebn(2));
            }
            if(this.k) {
                return this.i;
            }
            this.p = 3;
            this.k = true;
            this.o = s;
            this.n.checkAvailabilityAndConnect();
            zzebc zzebc0 = new zzebc(this);
            this.i.zzc(zzebc0, zzcfv.zzf);
            return this.i;
        }
    }
}

