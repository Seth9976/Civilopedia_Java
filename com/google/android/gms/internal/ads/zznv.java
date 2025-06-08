package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public abstract class zznv implements zzmy {
    public zzmw a;
    public zzmw b;
    public zzmw c;
    public zzmw d;
    public ByteBuffer e;
    public ByteBuffer f;
    public boolean g;

    public zznv() {
        this.e = zzmy.zza;
        this.f = zzmy.zza;
        this.c = zzmw.zza;
        this.d = zzmw.zza;
        this.a = zzmw.zza;
        this.b = zzmw.zza;
    }

    public final ByteBuffer a(int v) {
        if(this.e.capacity() < v) {
            this.e = ByteBuffer.allocateDirect(v).order(ByteOrder.nativeOrder());
        }
        else {
            this.e.clear();
        }
        this.f = this.e;
        return this.e;
    }

    public void b() {
    }

    public void c() {
    }

    public void d() {
    }

    @Override  // com.google.android.gms.internal.ads.zzmy
    public final zzmw zza(zzmw zzmw0) throws zzmx {
        this.c = zzmw0;
        this.d = this.zzi(zzmw0);
        return this.zzg() ? this.d : zzmw.zza;
    }

    @Override  // com.google.android.gms.internal.ads.zzmy
    public ByteBuffer zzb() {
        ByteBuffer byteBuffer0 = this.f;
        this.f = zzmy.zza;
        return byteBuffer0;
    }

    @Override  // com.google.android.gms.internal.ads.zzmy
    public final void zzc() {
        this.f = zzmy.zza;
        this.g = false;
        this.a = this.c;
        this.b = this.d;
        this.b();
    }

    @Override  // com.google.android.gms.internal.ads.zzmy
    public final void zzd() {
        this.g = true;
        this.c();
    }

    @Override  // com.google.android.gms.internal.ads.zzmy
    public final void zzf() {
        this.zzc();
        this.e = zzmy.zza;
        this.c = zzmw.zza;
        this.d = zzmw.zza;
        this.a = zzmw.zza;
        this.b = zzmw.zza;
        this.d();
    }

    @Override  // com.google.android.gms.internal.ads.zzmy
    public boolean zzg() {
        return this.d != zzmw.zza;
    }

    @Override  // com.google.android.gms.internal.ads.zzmy
    public boolean zzh() {
        return this.g && this.f == zzmy.zza;
    }

    public zzmw zzi(zzmw zzmw0) {
        throw null;
    }
}

