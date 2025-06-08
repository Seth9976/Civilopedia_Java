package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

public final class zzaje {
    public final AtomicInteger a;
    public final HashSet b;
    public final PriorityBlockingQueue c;
    public final PriorityBlockingQueue d;
    public final zzail e;
    public final zzaiu f;
    public final zzaiv[] g;
    public zzain h;
    public final ArrayList i;
    public final ArrayList j;
    public final zzais k;

    public zzaje(zzail zzail0, zzaiu zzaiu0, int v) {
        zzais zzais0 = new zzais(new Handler(Looper.getMainLooper()));
        super();
        this.a = new AtomicInteger();
        this.b = new HashSet();
        this.c = new PriorityBlockingQueue();
        this.d = new PriorityBlockingQueue();
        this.i = new ArrayList();
        this.j = new ArrayList();
        this.e = zzail0;
        this.f = zzaiu0;
        this.g = new zzaiv[4];
        this.k = zzais0;
    }

    public final void a() {
        synchronized(this.j) {
            for(Object object0: this.j) {
                ((zzajc)object0).zza();
            }
        }
    }

    public final zzajb zza(zzajb zzajb0) {
        zzajb0.zzf(this);
        synchronized(this.b) {
            this.b.add(zzajb0);
        }
        zzajb0.zzg(this.a.incrementAndGet());
        zzajb0.zzm("add-to-queue");
        this.a();
        this.c.add(zzajb0);
        return zzajb0;
    }

    public final void zzd() {
        zzaiv[] arr_zzaiv;
        zzain zzain0 = this.h;
        if(zzain0 != null) {
            zzain0.zzb();
        }
        for(int v1 = 0; true; ++v1) {
            arr_zzaiv = this.g;
            if(v1 >= 4) {
                break;
            }
            zzaiv zzaiv0 = arr_zzaiv[v1];
            if(zzaiv0 != null) {
                zzaiv0.zza();
            }
        }
        PriorityBlockingQueue priorityBlockingQueue0 = this.d;
        zzain zzain1 = new zzain(this.c, priorityBlockingQueue0, this.e, this.k, null);
        this.h = zzain1;
        zzain1.start();
        for(int v = 0; v < 4; ++v) {
            zzaiv zzaiv1 = new zzaiv(priorityBlockingQueue0, this.f, this.e, this.k, null);
            arr_zzaiv[v] = zzaiv1;
            zzaiv1.start();
        }
    }
}

