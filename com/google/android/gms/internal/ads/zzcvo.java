package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;

public final class zzcvo extends zzcxx {
    public final zzcli i;
    public final int j;
    public final Context k;
    public final zzcuw l;
    public final zzdlg m;
    public final zzdip n;
    public final zzdcg o;
    public final boolean p;
    public boolean q;

    public zzcvo(zzcxw zzcxw0, Context context0, zzcli zzcli0, int v, zzcuw zzcuw0, zzdlg zzdlg0, zzdip zzdip0, zzdcg zzdcg0) {
        super(zzcxw0);
        this.q = false;
        this.i = zzcli0;
        this.k = context0;
        this.j = v;
        this.l = zzcuw0;
        this.m = zzdlg0;
        this.n = zzdip0;
        this.o = zzdcg0;
        this.p = ((Boolean)zzay.zzc().zzb(zzbhz.zzen)).booleanValue();
    }

    @Override  // com.google.android.gms.internal.ads.zzcxx
    public final void zzV() {
        super.zzV();
        zzcli zzcli0 = this.i;
        if(zzcli0 != null) {
            zzcli0.destroy();
        }
    }

    public final int zza() {
        return this.j;
    }

    public final void zzc(zzbca zzbca0) {
        zzcli zzcli0 = this.i;
        if(zzcli0 != null) {
            zzcli0.zzaj(zzbca0);
        }
    }

    public final void zzd(Activity activity0, zzbcn zzbcn0, boolean z) throws RemoteException {
        if(activity0 == null) {
            activity0 = this.k;
        }
        zzdip zzdip0 = this.n;
        boolean z1 = this.p;
        if(z1) {
            zzdip0.zzb();
        }
        boolean z2 = ((Boolean)zzay.zzc().zzb(zzbhz.zzay)).booleanValue();
        zzdcg zzdcg0 = this.o;
        if(!z2 || !zzs.zzC(activity0)) {
            if(this.q) {
                zzcfi.zzj("App open interstitial ad is already visible.");
                zzdcg0.zza(zzfdc.zzd(10, null, null));
            }
            if(!this.q) {
                try {
                    this.m.zza(z, activity0, zzdcg0);
                    if(z1) {
                        zzdip0.zza();
                    }
                    this.q = true;
                }
                catch(zzdlf zzdlf0) {
                    zzdcg0.zze(zzdlf0);
                }
            }
        }
        else {
            zzcfi.zzj("Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit  https://googlemobileadssdk.page.link/admob-interstitial-policies");
            zzdcg0.zzb();
            if(((Boolean)zzay.zzc().zzb(zzbhz.zzaz)).booleanValue()) {
                new zzflf(activity0.getApplicationContext(), zzt.zzt().zzb()).zza(this.a.zzb.zzb.zzb);
            }
        }
    }

    public final void zze(long v, int v1) {
        this.l.zza(v, v1);
    }
}

