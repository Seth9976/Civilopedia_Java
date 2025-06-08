package com.google.android.gms.internal.ads;

import android.net.Uri;

public final class zzch {
    public static final zzbb a;
    public static final Object zza;
    public static final zzl zzb;
    public Object zzc;
    public zzbb zzd;
    public long zze;
    public long zzf;
    public long zzg;
    public boolean zzh;
    public boolean zzi;
    @Deprecated
    public boolean zzj;
    public zzau zzk;
    public boolean zzl;
    public long zzm;
    public long zzn;
    public int zzo;
    public int zzp;

    static {
        zzch.zza = new Object();
        zzah zzah0 = new zzah();
        zzah0.zza("androidx.media3.common.Timeline");
        zzah0.zzb(Uri.EMPTY);
        zzch.a = zzah0.zzc();
        zzch.zzb = zzcg.zza;
    }

    public zzch() {
        this.zzc = zzch.zza;
        this.zzd = zzch.a;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            return zzch.class.equals(class0) && zzeg.zzS(this.zzc, ((zzch)object0).zzc) && zzeg.zzS(this.zzd, ((zzch)object0).zzd) && zzeg.zzS(null, null) && zzeg.zzS(this.zzk, ((zzch)object0).zzk) && this.zze == ((zzch)object0).zze && this.zzf == ((zzch)object0).zzf && this.zzg == ((zzch)object0).zzg && this.zzh == ((zzch)object0).zzh && this.zzi == ((zzch)object0).zzi && this.zzl == ((zzch)object0).zzl && this.zzn == ((zzch)object0).zzn && this.zzo == ((zzch)object0).zzo && this.zzp == ((zzch)object0).zzp;
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int v = this.zzc.hashCode();
        int v1 = this.zzd.hashCode();
        return this.zzk == null ? ((((((((((v1 + (v + 0xD9) * 0x1F) * 0x745F + ((int)(this.zze ^ this.zze >>> 0x20))) * 0x1F + ((int)(this.zzf >>> 0x20 ^ this.zzf))) * 0x1F + ((int)(this.zzg >>> 0x20 ^ this.zzg))) * 0x1F + this.zzh) * 0x1F + this.zzi) * 0x1F + this.zzl) * 961 + ((int)(this.zzn >>> 0x20 ^ this.zzn))) * 0x1F + this.zzo) * 0x1F + this.zzp) * 0x1F : ((((((((((v * 0x745F + v1 * 961 + 0x70713408) * 0x1F + ((int)(this.zze ^ this.zze >>> 0x20))) * 0x1F + ((int)(this.zzf >>> 0x20 ^ this.zzf))) * 0x1F + ((int)(this.zzg >>> 0x20 ^ this.zzg))) * 0x1F + this.zzh) * 0x1F + this.zzi) * 0x1F + this.zzl) * 961 + ((int)(this.zzn >>> 0x20 ^ this.zzn))) * 0x1F + this.zzo) * 0x1F + this.zzp) * 0x1F;
    }

    public final zzch zza(Object object0, zzbb zzbb0, Object object1, long v, long v1, long v2, boolean z, boolean z1, zzau zzau0, long v3, long v4, int v5, int v6, long v7) {
        this.zzc = object0;
        this.zzd = zzbb0 == null ? zzch.a : zzbb0;
        this.zze = 0x8000000000000001L;
        this.zzf = 0x8000000000000001L;
        this.zzg = 0x8000000000000001L;
        this.zzh = z;
        this.zzi = z1;
        this.zzj = zzau0 != null;
        this.zzk = zzau0;
        this.zzm = 0L;
        this.zzn = v4;
        this.zzo = 0;
        this.zzp = 0;
        this.zzl = false;
        return this;
    }

    public final boolean zzb() {
        zzcw.zzf(this.zzj == (this.zzk != null));
        return this.zzk != null;
    }
}

