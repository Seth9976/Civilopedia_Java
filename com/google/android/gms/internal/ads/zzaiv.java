package com.google.android.gms.internal.ads;

import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import java.util.concurrent.BlockingQueue;

public final class zzaiv extends Thread {
    public final BlockingQueue i;
    public final zzaiu j;
    public final zzail k;
    public volatile boolean l;
    public final zzais m;

    public zzaiv(BlockingQueue blockingQueue0, zzaiu zzaiu0, zzail zzail0, zzais zzais0, byte[] arr_b) {
        this.l = false;
        this.i = blockingQueue0;
        this.j = zzaiu0;
        this.k = zzail0;
        this.m = zzais0;
    }

    public final void a() {
        zzais zzais0 = this.m;
        zzajb zzajb0 = (zzajb)this.i.take();
        SystemClock.elapsedRealtime();
        zzajb0.f();
        try {
            zzajb0.zzm("network-queue-take");
            TrafficStats.setThreadStatsTag(zzajb0.zzc());
            zzaix zzaix0 = this.j.zza(zzajb0);
            zzajb0.zzm("network-http-complete");
            if(!zzaix0.zze || !zzajb0.zzv()) {
                zzajh zzajh0 = zzajb0.a(zzaix0);
                zzajb0.zzm("network-parse-complete");
                if(zzajh0.zzb != null) {
                    String s = zzajb0.zzj();
                    this.k.zzd(s, zzajh0.zzb);
                    zzajb0.zzm("network-cache-written");
                }
                zzajb0.zzq();
                zzais0.zzb(zzajb0, zzajh0, null);
                zzajb0.e(zzajh0);
                return;
            }
            zzajb0.c("not-modified");
            zzajb0.d();
        }
        catch(zzajk zzajk0) {
            SystemClock.elapsedRealtime();
            zzais0.zza(zzajb0, zzajk0);
            zzajb0.d();
        }
        catch(Exception exception0) {
            zzajn.zzc(exception0, "Unhandled exception %s", new Object[]{exception0.toString()});
            zzajk zzajk1 = new zzajk(exception0);
            SystemClock.elapsedRealtime();
            zzais0.zza(zzajb0, zzajk1);
            zzajb0.d();
        }
        finally {
            zzajb0.f();
        }
    }

    @Override
    public final void run() {
        Process.setThreadPriority(10);
        while(true) {
            try {
            label_1:
                this.a();
                goto label_1;
            }
            catch(InterruptedException unused_ex) {
            }
            if(this.l) {
                break;
            }
            zzajn.zzb("Ignoring spurious interrupt of NetworkDispatcher thread; use quit() to terminate it", new Object[0]);
        }
        Thread.currentThread().interrupt();
    }

    public final void zza() {
        this.l = true;
        this.interrupt();
    }
}

