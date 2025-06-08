package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzw;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzm;
import com.google.android.gms.ads.internal.zzj;

public final class k5 implements zzdlg {
    public final zzcfo a;
    public final zzcga b;
    public final zzfbl c;
    public final zzcli d;
    public final zzfcd e;
    public final zzbop f;
    public final boolean g;

    public k5(zzcfo zzcfo0, zzcga zzcga0, zzfbl zzfbl0, zzcli zzcli0, zzfcd zzfcd0, boolean z, zzbop zzbop0) {
        this.a = zzcfo0;
        this.b = zzcga0;
        this.c = zzfbl0;
        this.d = zzcli0;
        this.e = zzfcd0;
        this.g = z;
        this.f = zzbop0;
    }

    @Override  // com.google.android.gms.internal.ads.zzdlg
    public final void zza(boolean z, Context context0, zzdcg zzdcg0) {
        int v2;
        zzcvg zzcvg0 = (zzcvg)zzfvc.zzq(this.b);
        zzcli zzcli0 = this.d;
        zzcli0.zzap(true);
        boolean z1 = this.g ? this.f.zze(true) : true;
        boolean z2 = this.g ? this.f.zzd() : false;
        float f = this.g ? this.f.zza() : 0.0f;
        zzfbl zzfbl0 = this.c;
        zzj zzj0 = new zzj(z1, true, z2, f, -1, z, zzfbl0.zzP, false);
        if(zzdcg0 != null) {
            zzdcg0.zzf();
        }
        zzdkv zzdkv0 = zzcvg0.zzg();
        int v = zzfbl0.zzR;
        zzfcd zzfcd0 = this.e;
        if(v == -1) {
            zzw zzw0 = zzfcd0.zzj;
            if(zzw0 == null) {
                zzcfi.zze("Error setting app open orientation; no targeting orientation available.");
                v2 = zzfbl0.zzR;
            }
            else {
                int v1 = zzw0.zza;
                if(v1 == 1) {
                    v2 = 7;
                }
                else if(v1 == 2) {
                    v2 = 6;
                }
                else {
                    zzcfi.zze("Error setting app open orientation; no targeting orientation available.");
                    v2 = zzfbl0.zzR;
                }
            }
        }
        else {
            v2 = v;
        }
        new AdOverlayInfoParcel(null, zzdkv0, null, zzcli0, v2, this.a, zzfbl0.zzC, zzj0, zzfbl0.zzt.zzb, zzfbl0.zzt.zza, zzfcd0.zzf, zzdcg0);
        zzm.zza(context0, null, true);
    }
}

