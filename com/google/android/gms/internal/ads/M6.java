package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzay;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

public final class m6 implements zzfgp {
    public final zzfgp a;
    public final LinkedBlockingQueue b;
    public final int c;
    public final AtomicBoolean d;

    public m6(zzfgp zzfgp0, ScheduledExecutorService scheduledExecutorService0) {
        this.a = zzfgp0;
        this.b = new LinkedBlockingQueue();
        this.c = (int)(((Integer)zzay.zzc().zzb(zzbhz.zzhm)));
        this.d = new AtomicBoolean(false);
        int v = (int)(((Integer)zzay.zzc().zzb(zzbhz.zzhl)));
        scheduledExecutorService0.scheduleAtFixedRate(new zzfgr(this), ((long)v), ((long)v), TimeUnit.MILLISECONDS);
    }

    @Override  // com.google.android.gms.internal.ads.zzfgp
    public final String zza(zzfgo zzfgo0) {
        return this.a.zza(zzfgo0);
    }

    @Override  // com.google.android.gms.internal.ads.zzfgp
    public final void zzb(zzfgo zzfgo0) {
        LinkedBlockingQueue linkedBlockingQueue0 = this.b;
        if(linkedBlockingQueue0.size() >= this.c) {
            if(!this.d.getAndSet(true)) {
                zzfgo zzfgo1 = zzfgo.zzb("dropped_event");
                Map map0 = zzfgo0.zzj();
                if(map0.containsKey("action")) {
                    zzfgo1.zza("dropped_action", ((String)map0.get("action")));
                }
                linkedBlockingQueue0.offer(zzfgo1);
            }
            return;
        }
        linkedBlockingQueue0.offer(zzfgo0);
    }
}

