package com.google.android.gms.internal.ads;

public final class zzgqn {
    public static final zzgqn zza;
    public static final zzgqn zzb;
    public static final zzgqn zzc;
    public static final zzgqn zzd;
    public final double zze;
    public final double zzf;
    public final double zzg;
    public final double zzh;
    public final double zzi;
    public final double zzj;
    public final double zzk;
    public final double zzl;
    public final double zzm;

    static {
        zzgqn.zza = new zzgqn(1.0, 0.0, 0.0, 1.0, 0.0, 0.0, 1.0, 0.0, 0.0);
        zzgqn.zzb = new zzgqn(0.0, 1.0, -1.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0);
        zzgqn.zzc = new zzgqn(-1.0, 0.0, 0.0, -1.0, 0.0, 0.0, 1.0, 0.0, 0.0);
        zzgqn.zzd = new zzgqn(0.0, -1.0, 1.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0);
    }

    public zzgqn(double f, double f1, double f2, double f3, double f4, double f5, double f6, double f7, double f8) {
        this.zze = f4;
        this.zzf = f5;
        this.zzg = f6;
        this.zzh = f;
        this.zzi = f1;
        this.zzj = f2;
        this.zzk = f3;
        this.zzl = f7;
        this.zzm = f8;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            if(zzgqn.class != class0 || Double.compare(((zzgqn)object0).zzh, this.zzh) != 0) {
                return false;
            }
            if(Double.compare(((zzgqn)object0).zzi, this.zzi) != 0) {
                return false;
            }
            if(Double.compare(((zzgqn)object0).zzj, this.zzj) != 0) {
                return false;
            }
            if(Double.compare(((zzgqn)object0).zzk, this.zzk) != 0) {
                return false;
            }
            if(Double.compare(((zzgqn)object0).zzl, this.zzl) != 0) {
                return false;
            }
            if(Double.compare(((zzgqn)object0).zzm, this.zzm) != 0) {
                return false;
            }
            if(Double.compare(((zzgqn)object0).zze, this.zze) != 0) {
                return false;
            }
            return Double.compare(((zzgqn)object0).zzf, this.zzf) == 0 ? Double.compare(((zzgqn)object0).zzg, this.zzg) == 0 : false;
        }
        return false;
    }

    @Override
    public final int hashCode() {
        long v = Double.doubleToLongBits(this.zze);
        long v1 = Double.doubleToLongBits(this.zzf);
        long v2 = Double.doubleToLongBits(this.zzg);
        long v3 = Double.doubleToLongBits(this.zzh);
        long v4 = Double.doubleToLongBits(this.zzi);
        long v5 = Double.doubleToLongBits(this.zzj);
        long v6 = Double.doubleToLongBits(this.zzk);
        long v7 = Double.doubleToLongBits(this.zzl);
        long v8 = Double.doubleToLongBits(this.zzm);
        return (((((((((int)(v ^ v >>> 0x20)) * 0x1F + ((int)(v1 ^ v1 >>> 0x20))) * 0x1F + ((int)(v2 >>> 0x20 ^ v2))) * 0x1F + ((int)(v3 >>> 0x20 ^ v3))) * 0x1F + ((int)(v4 >>> 0x20 ^ v4))) * 0x1F + ((int)(v5 >>> 0x20 ^ v5))) * 0x1F + ((int)(v6 >>> 0x20 ^ v6))) * 0x1F + ((int)(v7 ^ v7 >>> 0x20))) * 0x1F + ((int)(v8 >>> 0x20 ^ v8));
    }

    @Override
    public final String toString() {
        if(this.equals(zzgqn.zza)) {
            return "Rotate 0°";
        }
        if(this.equals(zzgqn.zzb)) {
            return "Rotate 90°";
        }
        if(this.equals(zzgqn.zzc)) {
            return "Rotate 180°";
        }
        return this.equals(zzgqn.zzd) ? "Rotate 270°" : "Matrix{u=" + this.zze + ", v=" + this.zzf + ", w=" + this.zzg + ", a=" + this.zzh + ", b=" + this.zzi + ", c=" + this.zzj + ", d=" + this.zzk + ", tx=" + this.zzl + ", ty=" + this.zzm + "}";
    }
}

