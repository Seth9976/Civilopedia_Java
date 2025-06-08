package com.google.android.gms.internal.ads;

public final class zzbb {
    public static final zzbb zza;
    public static final zzl zzb;
    public final String zzc;
    public final zzaw zzd;
    @Deprecated
    public final zzay zze;
    public final zzau zzf;
    public final zzbh zzg;
    public final zzal zzh;
    @Deprecated
    public final zzan zzi;

    static {
        zzbb.zza = new zzah().zzc();
        zzbb.zzb = zzaf.zza;
    }

    public zzbb(String s, zzan zzan0, zzay zzay0, zzau zzau0, zzbh zzbh0) {
        this.zzc = s;
        this.zzd = zzay0;
        this.zze = zzay0;
        this.zzf = zzau0;
        this.zzg = zzbh0;
        this.zzh = zzan0;
        this.zzi = zzan0;
    }

    // 去混淆评级： 低(20)
    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof zzbb ? zzeg.zzS(this.zzc, ((zzbb)object0).zzc) && this.zzh.equals(((zzbb)object0).zzh) && zzeg.zzS(this.zzd, ((zzbb)object0).zzd) && zzeg.zzS(this.zzf, ((zzbb)object0).zzf) && zzeg.zzS(this.zzg, ((zzbb)object0).zzg) : false;
    }

    // 去混淆评级： 低(20)
    @Override
    public final int hashCode() {
        int v = this.zzc.hashCode();
        return this.zzd == null ? 648590145 + 0xE1781 * v + this.zzg.hashCode() : 648590145 + 0xE1781 * v + this.zzg.hashCode() + 0x745F * this.zzd.hashCode();
    }
}

