package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.concurrent.CopyOnWriteArraySet;

public final class zzdm {
    public final zzcx a;
    public final zzdg b;
    public final zzdk c;
    public final CopyOnWriteArraySet d;
    public final ArrayDeque e;
    public final ArrayDeque f;
    public boolean g;

    public zzdm(Looper looper0, zzcx zzcx0, zzdk zzdk0) {
        this(new CopyOnWriteArraySet(), looper0, zzcx0, zzdk0);
    }

    public zzdm(CopyOnWriteArraySet copyOnWriteArraySet0, Looper looper0, zzcx zzcx0, zzdk zzdk0) {
        this.a = zzcx0;
        this.d = copyOnWriteArraySet0;
        this.c = zzdk0;
        this.e = new ArrayDeque();
        this.f = new ArrayDeque();
        this.b = zzcx0.zzb(looper0, new zzdh(this));
    }

    public final zzdm zza(Looper looper0, zzdk zzdk0) {
        return new zzdm(this.d, looper0, this.a, zzdk0);
    }

    public final void zzb(Object object0) {
        if(this.g) {
            return;
        }
        p4 p40 = new p4(object0);
        this.d.add(p40);
    }

    public final void zzc() {
        ArrayDeque arrayDeque0 = this.f;
        if(arrayDeque0.isEmpty()) {
            return;
        }
        zzdg zzdg0 = this.b;
        if(!zzdg0.zzf(0)) {
            zzdg0.zzj(zzdg0.zza(0));
        }
        ArrayDeque arrayDeque1 = this.e;
        arrayDeque1.addAll(arrayDeque0);
        arrayDeque0.clear();
        if(arrayDeque1.isEmpty()) {
            while(!arrayDeque1.isEmpty()) {
                ((Runnable)arrayDeque1.peekFirst()).run();
                arrayDeque1.removeFirst();
            }
        }
    }

    public final void zzd(int v, zzdj zzdj0) {
        zzdi zzdi0 = new zzdi(new CopyOnWriteArraySet(this.d), v, zzdj0);
        this.f.add(zzdi0);
    }

    public final void zze() {
        CopyOnWriteArraySet copyOnWriteArraySet0 = this.d;
        for(Object object0: copyOnWriteArraySet0) {
            p4 p40 = (p4)object0;
            p40.d = true;
            if(p40.c) {
                zzy zzy0 = p40.b.zzb();
                this.c.zza(p40.a, zzy0);
            }
        }
        copyOnWriteArraySet0.clear();
        this.g = true;
    }

    public final void zzf(Object object0) {
        CopyOnWriteArraySet copyOnWriteArraySet0 = this.d;
        for(Object object1: copyOnWriteArraySet0) {
            p4 p40 = (p4)object1;
            if(p40.a.equals(object0)) {
                p40.d = true;
                if(p40.c) {
                    zzy zzy0 = p40.b.zzb();
                    this.c.zza(p40.a, zzy0);
                }
                copyOnWriteArraySet0.remove(p40);
            }
        }
    }

    public static boolean zzg(zzdm zzdm0, Message message0) {
        for(Object object0: zzdm0.d) {
            p4 p40 = (p4)object0;
            if(!p40.d && p40.c) {
                zzy zzy0 = p40.b.zzb();
                p40.b = new zzw();
                p40.c = false;
                zzdm0.c.zza(p40.a, zzy0);
            }
            if(zzdm0.b.zzf(0)) {
                break;
            }
        }
        return true;
    }
}

