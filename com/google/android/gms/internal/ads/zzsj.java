package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.io.IOException;
import java.util.concurrent.CopyOnWriteArrayList;

public final class zzsj {
    public final CopyOnWriteArrayList a;
    public final int zza;
    public final zzsa zzb;

    public zzsj() {
        this(new CopyOnWriteArrayList(), 0, null);
    }

    public zzsj(CopyOnWriteArrayList copyOnWriteArrayList0, int v, zzsa zzsa0) {
        this.a = copyOnWriteArrayList0;
        this.zza = v;
        this.zzb = zzsa0;
    }

    public static final long a(long v) {
        long v1 = zzeg.zzz(v);
        return v1 == 0x8000000000000001L ? 0x8000000000000001L : v1;
    }

    public final zzsj zza(int v, zzsa zzsa0, long v1) {
        return new zzsj(this.a, v, zzsa0);
    }

    public final void zzb(Handler handler0, zzsk zzsk0) {
        zzsk0.getClass();
        ob ob0 = new ob(handler0, zzsk0);
        this.a.add(ob0);
    }

    public final void zzc(zzrw zzrw0) {
        for(Object object0: this.a) {
            zzsd zzsd0 = new zzsd(this, ((ob)object0).b, zzrw0);
            zzeg.zzX(((ob)object0).a, zzsd0);
        }
    }

    public final void zzd(int v, zzad zzad0, int v1, Object object0, long v2) {
        this.zzc(new zzrw(1, v, zzad0, 0, null, zzsj.a(v2), 0x8000000000000001L));
    }

    public final void zze(zzrr zzrr0, zzrw zzrw0) {
        for(Object object0: this.a) {
            zzse zzse0 = new zzse(this, ((ob)object0).b, zzrr0, zzrw0);
            zzeg.zzX(((ob)object0).a, zzse0);
        }
    }

    public final void zzf(zzrr zzrr0, int v, int v1, zzad zzad0, int v2, Object object0, long v3, long v4) {
        this.zze(zzrr0, new zzrw(1, -1, null, 0, null, zzsj.a(v3), zzsj.a(v4)));
    }

    public final void zzg(zzrr zzrr0, zzrw zzrw0) {
        for(Object object0: this.a) {
            zzsh zzsh0 = new zzsh(this, ((ob)object0).b, zzrr0, zzrw0);
            zzeg.zzX(((ob)object0).a, zzsh0);
        }
    }

    public final void zzh(zzrr zzrr0, int v, int v1, zzad zzad0, int v2, Object object0, long v3, long v4) {
        this.zzg(zzrr0, new zzrw(1, -1, null, 0, null, zzsj.a(v3), zzsj.a(v4)));
    }

    public final void zzi(zzrr zzrr0, zzrw zzrw0, IOException iOException0, boolean z) {
        for(Object object0: this.a) {
            zzsf zzsf0 = new zzsf(this, ((ob)object0).b, zzrr0, zzrw0, iOException0, z);
            zzeg.zzX(((ob)object0).a, zzsf0);
        }
    }

    public final void zzj(zzrr zzrr0, int v, int v1, zzad zzad0, int v2, Object object0, long v3, long v4, IOException iOException0, boolean z) {
        this.zzi(zzrr0, new zzrw(1, -1, null, 0, null, zzsj.a(v3), zzsj.a(v4)), iOException0, z);
    }

    public final void zzk(zzrr zzrr0, zzrw zzrw0) {
        for(Object object0: this.a) {
            zzsg zzsg0 = new zzsg(this, ((ob)object0).b, zzrr0, zzrw0);
            zzeg.zzX(((ob)object0).a, zzsg0);
        }
    }

    public final void zzl(zzrr zzrr0, int v, int v1, zzad zzad0, int v2, Object object0, long v3, long v4) {
        this.zzk(zzrr0, new zzrw(1, -1, null, 0, null, zzsj.a(v3), zzsj.a(v4)));
    }

    public final void zzm(zzsk zzsk0) {
        CopyOnWriteArrayList copyOnWriteArrayList0 = this.a;
        for(Object object0: copyOnWriteArrayList0) {
            ob ob0 = (ob)object0;
            if(ob0.b == zzsk0) {
                copyOnWriteArrayList0.remove(ob0);
            }
        }
    }
}

