package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

public final class zzffw {
    public final Object a;
    public final String b;
    public final zzfvl c;
    public final List d;
    public final zzfvl e;
    public final zzffx f;

    public zzffw(zzffx zzffx0, Object object0, String s, zzfvl zzfvl0, List list0, zzfvl zzfvl1) {
        this.f = zzffx0;
        this.a = object0;
        this.b = s;
        this.c = zzfvl0;
        this.d = list0;
        this.e = zzfvl1;
    }

    public final zzffk zza() {
        String s = this.b == null ? this.f.a(this.a) : this.b;
        zzffk zzffk0 = new zzffk(this.a, s, this.e);
        this.f.c.zza(zzffk0);
        zzffq zzffq0 = new zzffq(this, zzffk0);
        this.c.zzc(zzffq0, zzcfv.zzf);
        zzfvc.zzr(zzffk0, new Q(this, zzffk0, 13, false), zzcfv.zzf);
        return zzffk0;
    }

    public final zzffw zzb(Object object0) {
        zzffk zzffk0 = this.zza();
        return this.f.zzb(object0, zzffk0);
    }

    public final zzffw zzc(Class class0, zzfuj zzfuj0) {
        zzfvl zzfvl0 = zzfvc.zzg(this.e, class0, zzfuj0, this.f.a);
        return new zzffw(this.f, this.a, this.b, this.c, this.d, zzfvl0);
    }

    public final zzffw zzd(zzfvl zzfvl0) {
        return this.zzg(new zzffr(zzfvl0), zzcfv.zzf);
    }

    public final zzffw zze(zzffi zzffi0) {
        return this.zzf(new zzfft(zzffi0));
    }

    public final zzffw zzf(zzfuj zzfuj0) {
        return this.zzg(zzfuj0, this.f.a);
    }

    public final zzffw zzg(zzfuj zzfuj0, Executor executor0) {
        zzfvl zzfvl0 = zzfvc.zzn(this.e, zzfuj0, executor0);
        return new zzffw(this.f, this.a, this.b, this.c, this.d, zzfvl0);
    }

    public final zzffw zzh(String s) {
        return new zzffw(this.f, this.a, s, this.c, this.d, this.e);
    }

    public final zzffw zzi(long v, TimeUnit timeUnit0) {
        zzfvl zzfvl0 = zzfvc.zzo(this.e, v, timeUnit0, this.f.b);
        return new zzffw(this.f, this.a, this.b, this.c, this.d, zzfvl0);
    }
}

