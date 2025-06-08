package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzm;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzj;

public final class s5 implements zzdlg {
    public final Context a;
    public final zzdtp b;
    public final zzfcd c;
    public final zzcfo d;
    public final zzfbl e;
    public final zzcga f;
    public final zzcli g;
    public final zzbop h;
    public final boolean i;

    public s5(Context context0, zzdtp zzdtp0, zzfcd zzfcd0, zzcfo zzcfo0, zzfbl zzfbl0, zzcga zzcga0, zzcli zzcli0, zzbop zzbop0, boolean z) {
        this.a = context0;
        this.b = zzdtp0;
        this.c = zzfcd0;
        this.d = zzcfo0;
        this.e = zzfbl0;
        this.f = zzcga0;
        this.g = zzcli0;
        this.h = zzbop0;
        this.i = z;
    }

    @Override  // com.google.android.gms.internal.ads.zzdlg
    public final void zza(boolean z, Context context0, zzdcg zzdcg0) {
        zzbop zzbop0;
        zzfbl zzfbl0;
        boolean z2;
        zzfcd zzfcd0;
        Context context1;
        zzcli zzcli0 = this.g;
        zzdsu zzdsu0 = (zzdsu)zzfvc.zzq(this.f);
        try {
            boolean z1 = zzcli0.zzaD();
            context1 = this.a;
            zzfcd0 = this.c;
            z2 = this.i;
            zzfbl0 = this.e;
            zzbop0 = this.h;
            if(z1 && ((Boolean)zzay.zzc().zzb(zzbhz.zzaG)).booleanValue()) {
                zzcli0 = this.b.zza(zzfcd0.zze, null, null);
                zzbpc.zzb(zzcli0, zzdsu0.zzg());
                zzdtt zzdtt0 = new zzdtt();
                zzdtt0.zza(context1, ((View)zzcli0));
                zzdsu0.zzl().zzi(zzcli0, true, (z2 ? zzbop0 : null));
                zzcli0.zzP().zzz(new zzejl(zzdtt0, zzcli0));
                zzcli0.zzP().zzF(new zzejm(zzcli0));
                zzcli0.zzad(zzfbl0.zzt.zzb, zzfbl0.zzt.zza, null);
            }
        }
        catch(zzclt zzclt0) {
            zzcfi.zzh("", zzclt0);
            return;
        }
        zzcli0.zzap(true);
        zzj zzj0 = new zzj((z2 ? zzbop0.zze(false) : false), zzs.zzE(context1), (z2 ? zzbop0.zzd() : false), (z2 ? zzbop0.zza() : 0.0f), -1, z, zzfbl0.zzP, zzfbl0.zzQ);
        if(zzdcg0 != null) {
            zzdcg0.zzf();
        }
        zzm.zza(context0, new AdOverlayInfoParcel(null, zzdsu0.zzj(), null, zzcli0, zzfbl0.zzR, this.d, zzfbl0.zzC, zzj0, zzfbl0.zzt.zzb, zzfbl0.zzt.zza, zzfcd0.zzf, zzdcg0), true);
    }
}

