package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zzs;
import java.lang.ref.WeakReference;

public final class zzdst extends zzcxx {
    public final Context i;
    public final WeakReference j;
    public final zzdlg k;
    public final zzdip l;
    public final zzdcg m;
    public final zzddn n;
    public final zzcyr o;
    public final zzcbv p;
    public final zzflf q;
    public boolean r;

    public zzdst(zzcxw zzcxw0, Context context0, zzcli zzcli0, zzdlg zzdlg0, zzdip zzdip0, zzdcg zzdcg0, zzddn zzddn0, zzcyr zzcyr0, zzfbl zzfbl0, zzflf zzflf0) {
        super(zzcxw0);
        this.r = false;
        this.i = context0;
        this.k = zzdlg0;
        this.j = new WeakReference(zzcli0);
        this.l = zzdip0;
        this.m = zzdcg0;
        this.n = zzddn0;
        this.o = zzcyr0;
        this.q = zzflf0;
        this.p = new zzcbv((zzfbl0.zzm == null ? "" : zzfbl0.zzm.zza), (zzfbl0.zzm == null ? 1 : zzfbl0.zzm.zzb));
    }

    @Override
    public final void finalize() throws Throwable {
        try {
            zzcli zzcli0 = (zzcli)this.j.get();
            if(!((Boolean)zzay.zzc().zzb(zzbhz.zzfI)).booleanValue()) {
                if(zzcli0 != null) {
                    zzcli0.destroy();
                }
            }
            else if(!this.r && zzcli0 != null) {
                zzdss zzdss0 = new zzdss(zzcli0);
                zzcfv.zze.execute(zzdss0);
            }
        }
        finally {
            super.finalize();
        }
    }

    public final Bundle zza() {
        return this.n.zzb();
    }

    public final zzcbb zzc() {
        return this.p;
    }

    public final boolean zzd() {
        return this.o.zzg();
    }

    public final boolean zze() {
        return this.r;
    }

    public final boolean zzf() {
        zzcli zzcli0 = (zzcli)this.j.get();
        return zzcli0 != null && !zzcli0.zzaD();
    }

    public final boolean zzg(boolean z, Activity activity0) {
        boolean z1 = ((Boolean)zzay.zzc().zzb(zzbhz.zzay)).booleanValue();
        Context context0 = this.i;
        zzdcg zzdcg0 = this.m;
        if(z1 && zzs.zzC(context0)) {
            zzcfi.zzj("Rewarded ads that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit https://googlemobileadssdk.page.link/admob-interstitial-policies");
            zzdcg0.zzb();
            if(((Boolean)zzay.zzc().zzb(zzbhz.zzaz)).booleanValue()) {
                this.q.zza(this.a.zzb.zzb.zzb);
            }
            return false;
        }
        if(this.r) {
            zzcfi.zzj("The rewarded ad have been showed.");
            zzdcg0.zza(zzfdc.zzd(10, null, null));
            return false;
        }
        this.r = true;
        zzdip zzdip0 = this.l;
        zzdip0.zzb();
        if(activity0 == null) {
            activity0 = context0;
        }
        try {
            this.k.zza(z, activity0, zzdcg0);
            zzdip0.zza();
            return true;
        }
        catch(zzdlf zzdlf0) {
            zzdcg0.zze(zzdlf0);
            return false;
        }
    }
}

