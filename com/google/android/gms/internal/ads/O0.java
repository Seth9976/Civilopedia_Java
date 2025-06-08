package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.admanager.AdManagerAdView;
import com.google.android.gms.ads.internal.client.zzbs;
import com.google.android.gms.ads.internal.util.zze;
import jeb.synthetic.FIN;

public final class o0 implements Runnable {
    public final int i;
    public final Object j;
    public final Object k;
    public final Object l;

    public o0(zzajb zzajb0, zzajh zzajh0, Runnable runnable0) {
        this.i = 0;
        super();
        this.j = zzajb0;
        this.k = zzajh0;
        this.l = runnable0;
    }

    public o0(Object object0, Object object1, Object object2, int v) {
        this.i = v;
        this.l = object0;
        this.j = object1;
        this.k = object2;
        super();
    }

    @Override
    public final void run() {
        switch(this.i) {
            case 0: {
                zzajb zzajb0 = (zzajb)this.j;
                zzajh zzajh0 = (zzajh)this.k;
                if(zzajh0.zzc()) {
                    zzajb0.b(zzajh0.zza);
                }
                else {
                    zzajb0.zzn(zzajh0.zzc);
                }
                if(zzajh0.zzd) {
                    zzajb0.zzm("intermediate-response");
                }
                else {
                    zzajb0.c("done");
                }
                Runnable runnable0 = (Runnable)this.l;
                if(runnable0 != null) {
                    runnable0.run();
                }
                return;
            }
            case 1: {
                AdManagerAdView adManagerAdView0 = (AdManagerAdView)this.j;
                if(adManagerAdView0.zzb(((zzbs)this.k))) {
                    ((zzbni)this.l).i.onAdManagerAdViewLoaded(adManagerAdView0);
                    return;
                }
                zzcfi.zzj("Could not bind.");
                return;
            }
            case 2: {
                Object object0 = ((zzbsm)this.l).a;
                __monitor_enter(object0);
                int v = FIN.finallyOpen$NT();
                switch(((zzbsl)this.j).zze()) {
                    case -1: 
                    case 1: {
                        FIN.finallyCodeBegin$NT(v);
                        __monitor_exit(object0);
                        FIN.finallyCodeEnd$NT(v);
                        return;
                    }
                    default: {
                        ((zzbsl)this.j).zzg();
                        zzbrz zzbrz0 = new zzbrz(((zzbrp)this.k));
                        zzcfv.zze.execute(zzbrz0);
                        zze.zza("Could not receive loaded message in a timely manner. Rejecting.");
                        FIN.finallyExec$NT(v);
                        return;
                    }
                }
            }
            default: {
                zzcgw zzcgw0 = ((zzcgv)this.l).x;
                if(zzcgw0 != null) {
                    zzcgw0.zzb(((String)this.j), ((String)this.k));
                }
            }
        }
    }
}

