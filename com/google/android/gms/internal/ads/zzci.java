package com.google.android.gms.internal.ads;

import android.util.Pair;

public abstract class zzci {
    public static final zzci zza;
    public static final zzl zzb;

    static {
        zzci.zza = new u2();  // 初始化器: Ljava/lang/Object;-><init>()V
        zzci.zzb = zzcc.zza;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof zzci)) {
            return false;
        }
        if(((zzci)object0).zzc() == this.zzc() && ((zzci)object0).zzb() == this.zzb()) {
            zzch zzch0 = new zzch();
            zzcf zzcf0 = new zzcf();
            zzch zzch1 = new zzch();
            zzcf zzcf1 = new zzcf();
            for(int v = 0; v < this.zzc(); ++v) {
                if(!this.zze(v, zzch0, 0L).equals(((zzci)object0).zze(v, zzch1, 0L))) {
                    return false;
                }
            }
            for(int v1 = 0; v1 < this.zzb(); ++v1) {
                if(!this.zzd(v1, zzcf0, true).equals(((zzci)object0).zzd(v1, zzcf1, true))) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    @Override
    public final int hashCode() {
        zzch zzch0 = new zzch();
        zzcf zzcf0 = new zzcf();
        int v = this.zzc() + 0xD9;
        for(int v2 = 0; v2 < this.zzc(); ++v2) {
            v = v * 0x1F + this.zze(v2, zzch0, 0L).hashCode();
        }
        int v3 = this.zzb() + v * 0x1F;
        for(int v1 = 0; v1 < this.zzb(); ++v1) {
            v3 = v3 * 0x1F + this.zzd(v1, zzcf0, true).hashCode();
        }
        return v3;
    }

    public abstract int zza(Object arg1);

    public abstract int zzb();

    public abstract int zzc();

    public abstract zzcf zzd(int arg1, zzcf arg2, boolean arg3);

    public abstract zzch zze(int arg1, zzch arg2, long arg3);

    public abstract Object zzf(int arg1);

    // 去混淆评级： 低(20)
    public int zzg(boolean z) {
        return this.zzo() ? -1 : 0;
    }

    // 去混淆评级： 低(20)
    public int zzh(boolean z) {
        return this.zzo() ? -1 : this.zzc() - 1;
    }

    public final int zzi(int v, zzcf zzcf0, zzch zzch0, int v1, boolean z) {
        int v2 = this.zzd(v, zzcf0, false).zzd;
        if(this.zze(v2, zzch0, 0L).zzp == v) {
            int v3 = this.zzj(v2, v1, z);
            return v3 == -1 ? -1 : this.zze(v3, zzch0, 0L).zzo;
        }
        return v + 1;
    }

    public int zzj(int v, int v1, boolean z) {
        switch(v1) {
            case 0: {
                return v == this.zzh(z) ? -1 : v + 1;
            }
            case 1: {
                return v;
            }
            default: {
                if(v1 != 2) {
                    throw new IllegalStateException();
                }
                return v == this.zzh(z) ? this.zzg(z) : v + 1;
            }
        }
    }

    public int zzk(int v, int v1, boolean z) {
        return v == this.zzg(false) ? -1 : v - 1;
    }

    public final Pair zzl(zzch zzch0, zzcf zzcf0, int v, long v1) {
        Pair pair0 = this.zzm(zzch0, zzcf0, v, v1, 0L);
        pair0.getClass();
        return pair0;
    }

    public final Pair zzm(zzch zzch0, zzcf zzcf0, int v, long v1, long v2) {
        zzcw.zza(v, 0, this.zzc());
        this.zze(v, zzch0, v2);
        if(v1 == 0x8000000000000001L) {
            v1 = 0L;
        }
        int v3 = zzch0.zzo;
        this.zzd(v3, zzcf0, false);
        while(v3 < zzch0.zzp) {
            int v4 = Long.compare(v1, 0L);
            if(v4 == 0) {
                break;
            }
            this.zzd(v3 + 1, zzcf0, false);
            if(v4 < 0) {
                break;
            }
            ++v3;
        }
        this.zzd(v3, zzcf0, true);
        long v5 = zzcf0.zze;
        if(v5 != 0x8000000000000001L) {
            v1 = Math.min(v1, v5 - 1L);
        }
        Object object0 = zzcf0.zzc;
        object0.getClass();
        return Pair.create(object0, Math.max(0L, v1));
    }

    public zzcf zzn(Object object0, zzcf zzcf0) {
        return this.zzd(this.zza(object0), zzcf0, true);
    }

    public final boolean zzo() {
        return this.zzc() == 0;
    }
}

