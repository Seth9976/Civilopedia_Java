package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import jeb.synthetic.FIN;

public final class zzbcu {
    public final A0 a;
    public final Object b;
    public zzbcx c;
    public Context d;
    public zzbda e;

    public zzbcu() {
        this.a = new A0(this, 5);
        this.b = new Object();
    }

    public final zzbcx a(C1 c10, D1 d10) {
        synchronized(this) {
            return new zzbcx(this.d, zzt.zzt().zzb(), c10, d10);
        }
    }

    public static void b(zzbcu zzbcu0) {
        synchronized(zzbcu0.b) {
            zzbcx zzbcx0 = zzbcu0.c;
            if(zzbcx0 == null) {
                return;
            }
            if(zzbcx0.isConnected() || zzbcu0.c.isConnecting()) {
                zzbcu0.c.disconnect();
            }
            zzbcu0.c = null;
            zzbcu0.e = null;
            Binder.flushPendingCommands();
        }
    }

    public final void c() {
        synchronized(this.b) {
            if(this.d != null && this.c == null) {
                zzbcx zzbcx0 = this.a(new C1(this), new D1(this));
                this.c = zzbcx0;
                zzbcx0.checkAvailabilityAndConnect();
            }
        }
    }

    public final long zza(zzbcy zzbcy0) {
        synchronized(this.b) {
            if(this.e == null) {
                return -2L;
            }
            if(this.c.zzp()) {
                try {
                    return this.e.zze(zzbcy0);
                }
                catch(RemoteException remoteException0) {
                    zzcfi.zzh("Unable to call into cache service.", remoteException0);
                }
            }
            return -2L;
        }
    }

    public final zzbcv zzb(zzbcy zzbcy0) {
        Object object0 = this.b;
        __monitor_enter(object0);
        int v = FIN.finallyOpen$NT();
        if(this.e == null) {
            zzbcv zzbcv0 = new zzbcv();
            FIN.finallyCodeBegin$NT(v);
            __monitor_exit(object0);
            FIN.finallyCodeEnd$NT(v);
            return zzbcv0;
        }
        try {
            if(this.c.zzp()) {
                zzbcv zzbcv1 = this.e.zzg(zzbcy0);
                FIN.finallyExec$NT(v);
                return zzbcv1;
            }
            zzbcv zzbcv2 = this.e.zzf(zzbcy0);
            FIN.finallyExec$NT(v);
            return zzbcv2;
        }
        catch(RemoteException remoteException0) {
            zzcfi.zzh("Unable to call into cache service.", remoteException0);
            FIN.finallyExec$NT(v);
            return new zzbcv();
        }
    }

    public final void zzi(Context context0) {
        if(context0 == null) {
            return;
        }
        synchronized(this.b) {
            if(this.d != null) {
                return;
            }
            this.d = context0.getApplicationContext();
            if(((Boolean)zzay.zzc().zzb(zzbhz.zzdl)).booleanValue()) {
                this.c();
            }
            else if(((Boolean)zzay.zzc().zzb(zzbhz.zzdk)).booleanValue()) {
                zzt.zzb().zzc(new B1(this));
            }
        }
    }

    public final void zzj() {
        if(((Boolean)zzay.zzc().zzb(zzbhz.zzdm)).booleanValue()) {
            synchronized(this.b) {
                this.c();
                zzs.zza.removeCallbacks(this.a);
                long v1 = (long)(((Long)zzay.zzc().zzb(zzbhz.zzdn)));
                zzs.zza.postDelayed(this.a, v1);
            }
        }
    }
}

