package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zzbb;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.common.internal.Preconditions;

public final class zzbsl extends zzcgh {
    public final Object c;
    public final zzbb d;
    public boolean e;
    public int f;

    public zzbsl(zzbb zzbb0) {
        this.c = new Object();
        this.d = zzbb0;
        this.e = false;
        this.f = 0;
    }

    public final void a() {
        synchronized(this.c) {
            Preconditions.checkState(this.f >= 0);
            if(!this.e || this.f != 0) {
                zze.zza("There are still references to the engine. Not destroying.");
            }
            else {
                zze.zza("No reference is left (including root). Cleaning up engine.");
                this.zzi(new a2(), new zzcgd());  // 初始化器: Ljava/lang/Object;-><init>()V
            }
        }
    }

    public final void b() {
        synchronized(this.c) {
            Preconditions.checkState(this.f > 0);
            zze.zza("Releasing 1 reference for JS Engine");
            --this.f;
            this.a();
        }
    }

    public final zzbsg zza() {
        zzbsg zzbsg0 = new zzbsg(this);
        synchronized(this.c) {
            this.zzi(new Z1(zzbsg0, 2), new Z1(zzbsg0, 3));
            Preconditions.checkState(this.f >= 0);
            ++this.f;
            return zzbsg0;
        }
    }

    public final void zzb() {
        synchronized(this.c) {
            Preconditions.checkState(this.f >= 0);
            zze.zza("Releasing root reference. JS Engine will be destroyed once other references are released.");
            this.e = true;
            this.a();
        }
    }
}

