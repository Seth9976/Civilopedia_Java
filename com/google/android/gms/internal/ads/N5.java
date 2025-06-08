package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzm;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzj;

public final class n5 implements zzdlg {
    public final Context a;
    public final zzcfo b;
    public final zzcga c;
    public final zzfbl d;
    public final zzcli e;
    public final zzfcd f;
    public final zzbop g;
    public final boolean h;

    public n5(Context context0, zzcfo zzcfo0, zzcga zzcga0, zzfbl zzfbl0, zzcli zzcli0, zzfcd zzfcd0, boolean z, zzbop zzbop0) {
        this.a = context0;
        this.b = zzcfo0;
        this.c = zzcga0;
        this.d = zzfbl0;
        this.e = zzcli0;
        this.f = zzfcd0;
        this.g = zzbop0;
        this.h = z;
    }

    @Override  // com.google.android.gms.internal.ads.zzdlg
    public final void zza(boolean z, Context context0, zzdcg zzdcg0) {
        zzdka zzdka0 = (zzdka)zzfvc.zzq(this.c);
        zzcli zzcli0 = this.e;
        zzcli0.zzap(true);
        boolean z1 = this.h ? this.g.zze(false) : false;
        boolean z2 = zzs.zzE(this.a);
        boolean z3 = this.h ? this.g.zzd() : false;
        float f = this.h ? this.g.zza() : 0.0f;
        zzfbl zzfbl0 = this.d;
        zzj zzj0 = new zzj(z1, z2, z3, f, -1, z, zzfbl0.zzP, false);
        if(zzdcg0 != null) {
            zzdcg0.zzf();
        }
        zzm.zza(context0, new AdOverlayInfoParcel(null, zzdka0.zzj(), null, zzcli0, zzfbl0.zzR, this.b, zzfbl0.zzC, zzj0, zzfbl0.zzt.zzb, zzfbl0.zzt.zza, this.f.zzf, zzdcg0), true);
    }
}

