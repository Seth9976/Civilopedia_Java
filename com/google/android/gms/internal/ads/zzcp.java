package com.google.android.gms.internal.ads;

public class zzcp {
    public final boolean zzA;
    public final zzfrm zzB;
    public final zzfro zzC;
    public static final zzcp zza;
    @Deprecated
    public static final zzcp zzb;
    @Deprecated
    public static final zzl zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final int zzi;
    public final int zzj;
    public final int zzk;
    public final int zzl;
    public final int zzm;
    public final boolean zzn;
    public final zzfrj zzo;
    public final int zzp;
    public final zzfrj zzq;
    public final int zzr;
    public final int zzs;
    public final int zzt;
    public final zzfrj zzu;
    public final zzfrj zzv;
    public final int zzw;
    public final int zzx;
    public final boolean zzy;
    public final boolean zzz;

    static {
        zzcp zzcp0 = new zzcp(new zzco());
        zzcp.zza = zzcp0;
        zzcp.zzb = zzcp0;
        zzcp.zzc = zzcn.zza;
    }

    public zzcp(zzco zzco0) {
        this.zzd = 0x7FFFFFFF;
        this.zze = 0x7FFFFFFF;
        this.zzf = 0x7FFFFFFF;
        this.zzg = 0x7FFFFFFF;
        this.zzh = 0;
        this.zzi = 0;
        this.zzj = 0;
        this.zzk = 0;
        this.zzl = zzco0.a;
        this.zzm = zzco0.b;
        this.zzn = zzco0.c;
        this.zzo = zzco0.d;
        this.zzp = 0;
        this.zzq = zzco0.e;
        this.zzr = 0;
        this.zzs = 0x7FFFFFFF;
        this.zzt = 0x7FFFFFFF;
        this.zzu = zzco0.f;
        this.zzv = zzco0.g;
        this.zzw = zzco0.h;
        this.zzx = 0;
        this.zzy = false;
        this.zzz = false;
        this.zzA = false;
        this.zzB = zzfrm.zzc(zzco0.i);
        this.zzC = zzfro.zzl(zzco0.j);
    }

    // 去混淆评级： 中等(70)
    @Override
    public boolean equals(Object object0) {
        return this == object0 ? true : object0 != null && this.getClass() == object0.getClass() && this.zzn == ((zzcp)object0).zzn && this.zzl == ((zzcp)object0).zzl && this.zzm == ((zzcp)object0).zzm && this.zzo.equals(((zzcp)object0).zzo) && this.zzq.equals(((zzcp)object0).zzq) && this.zzu.equals(((zzcp)object0).zzu) && this.zzv.equals(((zzcp)object0).zzv) && this.zzw == ((zzcp)object0).zzw && this.zzB.equals(((zzcp)object0).zzB) && this.zzC.equals(((zzcp)object0).zzC);
    }

    @Override
    public int hashCode() {
        return this.zzC.hashCode() + (this.zzB.hashCode() + ((this.zzv.hashCode() + (this.zzu.hashCode() + (((this.zzq.hashCode() + (this.zzo.hashCode() + (((this.zzn - 1048002209) * 0x1F + this.zzl) * 0x1F + this.zzm) * 0x1F) * 961) * 961 + 0x7FFFFFFF) * 0x1F + 0x7FFFFFFF) * 0x1F) * 0x1F) * 0x1F + this.zzw) * 0x1B4D89F) * 0x1F;
    }
}

