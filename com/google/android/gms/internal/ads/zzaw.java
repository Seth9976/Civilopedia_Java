package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.List;

public class zzaw {
    public final Uri zza;
    public final String zzb;
    public final zzaq zzc;
    public final zzag zzd;
    public final List zze;
    public final String zzf;
    public final zzfrj zzg;
    @Deprecated
    public final List zzh;
    public final Object zzi;

    public zzaw(Uri uri0, List list0, zzfrj zzfrj0) {
        this.zza = uri0;
        this.zzb = null;
        this.zzc = null;
        this.zzd = null;
        this.zze = list0;
        this.zzf = null;
        this.zzg = zzfrj0;
        zzfrg zzfrg0 = zzfrj.zzi();
        if(zzfrj0.size() <= 0) {
            this.zzh = zzfrg0.zzg();
            this.zzi = null;
            return;
        }
        zzaz zzaz0 = (zzaz)zzfrj0.get(0);
        throw null;
    }

    // 去混淆评级： 低(30)
    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof zzaw ? this.zza.equals(((zzaw)object0).zza) && zzeg.zzS(null, null) && zzeg.zzS(null, null) && zzeg.zzS(null, null) && this.zze.equals(((zzaw)object0).zze) && zzeg.zzS(null, null) && this.zzg.equals(((zzaw)object0).zzg) && zzeg.zzS(null, null) : false;
    }

    @Override
    public final int hashCode() {
        return (this.zzg.hashCode() + (this.zze.hashCode() + this.zza.hashCode() * 0xE1781) * 961) * 0x1F;
    }
}

