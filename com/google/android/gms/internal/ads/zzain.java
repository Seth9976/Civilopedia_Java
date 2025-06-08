package com.google.android.gms.internal.ads;

import android.os.Process;
import f0.g;
import java.util.concurrent.BlockingQueue;

public final class zzain extends Thread {
    public final BlockingQueue i;
    public final BlockingQueue j;
    public final zzail k;
    public volatile boolean l;
    public final g m;
    public final zzais n;
    public static final boolean o;

    static {
        zzain.o = zzajn.zzb;
    }

    public zzain(BlockingQueue blockingQueue0, BlockingQueue blockingQueue1, zzail zzail0, zzais zzais0, byte[] arr_b) {
        this.l = false;
        this.i = blockingQueue0;
        this.j = blockingQueue1;
        this.k = zzail0;
        this.n = zzais0;
        this.m = new g(this, blockingQueue1, zzais0);
    }

    public final void a() {
        zzail zzail0 = this.k;
        zzajb zzajb0 = (zzajb)this.i.take();
        zzajb0.zzm("cache-queue-take");
        zzajb0.f();
        try {
            zzaik zzaik0 = zzail0.zza(zzajb0.zzj());
            BlockingQueue blockingQueue0 = this.j;
            g g0 = this.m;
            if(zzaik0 == null) {
                zzajb0.zzm("cache-miss");
                if(!g0.v(zzajb0)) {
                    blockingQueue0.put(zzajb0);
                }
                return;
            }
            long v1 = System.currentTimeMillis();
            if(zzaik0.zze < v1) {
                zzajb0.zzm("cache-hit-expired");
                zzajb0.zze(zzaik0);
                if(!g0.v(zzajb0)) {
                    blockingQueue0.put(zzajb0);
                }
                return;
            }
            zzajb0.zzm("cache-hit");
            zzajh zzajh0 = zzajb0.a(new zzaix(zzaik0.zza, zzaik0.zzg));
            zzajb0.zzm("cache-hit-parsed");
            if(!zzajh0.zzc()) {
                zzajb0.zzm("cache-parsing-failed");
                zzail0.zzc(zzajb0.zzj(), true);
                zzajb0.zze(null);
                if(!g0.v(zzajb0)) {
                    blockingQueue0.put(zzajb0);
                }
                return;
            }
            zzais zzais0 = this.n;
            if(zzaik0.zzf < v1) {
                zzajb0.zzm("cache-hit-refresh-needed");
                zzajb0.zze(zzaik0);
                zzajh0.zzd = true;
                if(g0.v(zzajb0)) {
                    zzais0.zzb(zzajb0, zzajh0, null);
                }
                else {
                    zzais0.zzb(zzajb0, zzajh0, new m0(0, this, zzajb0));
                }
            }
            else {
                zzais0.zzb(zzajb0, zzajh0, null);
            }
        }
        finally {
            zzajb0.f();
        }
    }

    @Override
    public final void run() {
        if(zzain.o) {
            zzajn.zzd("start new dispatcher", new Object[0]);
        }
        Process.setThreadPriority(10);
        this.k.zzb();
        while(true) {
            try {
            label_4:
                this.a();
                goto label_4;
            }
            catch(InterruptedException unused_ex) {
            }
            if(this.l) {
                break;
            }
            zzajn.zzb("Ignoring spurious interrupt of CacheDispatcher thread; use quit() to terminate it", new Object[0]);
        }
        Thread.currentThread().interrupt();
    }

    public final void zzb() {
        this.l = true;
        this.interrupt();
    }
}

