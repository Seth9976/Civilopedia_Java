package com.google.android.gms.internal.ads;

import android.util.Pair;

public abstract class zzgc extends zzci {
    public final int a;
    public final zztt b;

    public zzgc(boolean z, zztt zztt0, byte[] arr_b) {
        this.b = zztt0;
        this.a = zztt0.zzc();
    }

    public abstract int a(Object arg1);

    public abstract int b(int arg1);

    public abstract int c(int arg1);

    public abstract int d(int arg1);

    public abstract int e(int arg1);

    public abstract zzci f(int arg1);

    public abstract Object g(int arg1);

    public final int h(int v, boolean z) {
        if(z) {
            return this.b.zzd(v);
        }
        return v < this.a - 1 ? v + 1 : -1;
    }

    @Override  // com.google.android.gms.internal.ads.zzci
    public final int zza(Object object0) {
        if(object0 instanceof Pair) {
            Object object1 = ((Pair)object0).first;
            Object object2 = ((Pair)object0).second;
            int v = this.a(object1);
            if(v == -1) {
                return -1;
            }
            int v1 = this.f(v).zza(object2);
            return v1 == -1 ? -1 : this.d(v) + v1;
        }
        return -1;
    }

    @Override  // com.google.android.gms.internal.ads.zzci
    public final zzcf zzd(int v, zzcf zzcf0, boolean z) {
        int v1 = this.b(v);
        int v2 = this.e(v1);
        int v3 = this.d(v1);
        this.f(v1).zzd(v - v3, zzcf0, z);
        zzcf0.zzd += v2;
        if(z) {
            Object object0 = this.g(v1);
            Object object1 = zzcf0.zzc;
            object1.getClass();
            zzcf0.zzc = Pair.create(object0, object1);
        }
        return zzcf0;
    }

    @Override  // com.google.android.gms.internal.ads.zzci
    public final zzch zze(int v, zzch zzch0, long v1) {
        int v2 = this.c(v);
        int v3 = this.e(v2);
        int v4 = this.d(v2);
        this.f(v2).zze(v - v3, zzch0, v1);
        Pair pair0 = this.g(v2);
        if(!zzch.zza.equals(zzch0.zzc)) {
            pair0 = Pair.create(pair0, zzch0.zzc);
        }
        zzch0.zzc = pair0;
        zzch0.zzo += v4;
        zzch0.zzp += v4;
        return zzch0;
    }

    @Override  // com.google.android.gms.internal.ads.zzci
    public final Object zzf(int v) {
        int v1 = this.b(v);
        int v2 = this.d(v1);
        Object object0 = this.f(v1).zzf(v - v2);
        return Pair.create(this.g(v1), object0);
    }

    @Override  // com.google.android.gms.internal.ads.zzci
    public final int zzg(boolean z) {
        if(this.a == 0) {
            return -1;
        }
        int v = z ? this.b.zza() : 0;
        while(this.f(v).zzo()) {
            v = this.h(v, z);
            if(v == -1) {
                return -1;
            }
            if(false) {
                break;
            }
        }
        int v1 = this.e(v);
        return this.f(v).zzg(z) + v1;
    }

    @Override  // com.google.android.gms.internal.ads.zzci
    public final int zzh(boolean z) {
        int v = this.a;
        if(v == 0) {
            return -1;
        }
        zztt zztt0 = this.b;
        int v1 = z ? zztt0.zzb() : v - 1;
        while(this.f(v1).zzo()) {
            if(z) {
                v1 = zztt0.zze(v1);
            }
            else {
                v1 = v1 > 0 ? v1 - 1 : -1;
            }
            if(v1 == -1) {
                return -1;
            }
            if(false) {
                break;
            }
        }
        int v2 = this.e(v1);
        return this.f(v1).zzh(z) + v2;
    }

    @Override  // com.google.android.gms.internal.ads.zzci
    public final int zzj(int v, int v1, boolean z) {
        int v2 = this.c(v);
        int v3 = this.e(v2);
        int v4 = this.f(v2).zzj(v - v3, (v1 == 2 ? 0 : v1), z);
        if(v4 != -1) {
            return v3 + v4;
        }
        int v5;
        for(v5 = this.h(v2, z); v5 != -1 && this.f(v5).zzo(); v5 = this.h(v5, z)) {
        }
        if(v5 != -1) {
            int v6 = this.e(v5);
            return this.f(v5).zzg(z) + v6;
        }
        return v1 == 2 ? this.zzg(z) : -1;
    }

    @Override  // com.google.android.gms.internal.ads.zzci
    public final int zzk(int v, int v1, boolean z) {
        int v5;
        int v2 = this.c(v);
        int v3 = this.e(v2);
        int v4 = this.f(v2).zzk(v - v3, 0, false);
        if(v4 != -1) {
            return v3 + v4;
        }
        if(v2 > 0) {
            v5 = v2 - 1;
            goto label_9;
        }
        while(true) {
            v5 = -1;
        label_9:
            if(v5 == -1 || !this.f(v5).zzo()) {
                break;
            }
            if(v5 <= 0) {
                continue;
            }
            --v5;
            goto label_9;
        }
        if(v5 != -1) {
            int v6 = this.e(v5);
            return this.f(v5).zzh(false) + v6;
        }
        return -1;
    }

    @Override  // com.google.android.gms.internal.ads.zzci
    public final zzcf zzn(Object object0, zzcf zzcf0) {
        Object object1 = ((Pair)object0).first;
        Object object2 = ((Pair)object0).second;
        int v = this.a(object1);
        int v1 = this.e(v);
        this.f(v).zzn(object2, zzcf0);
        zzcf0.zzd += v1;
        zzcf0.zzc = object0;
        return zzcf0;
    }
}

