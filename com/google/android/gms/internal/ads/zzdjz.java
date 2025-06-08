package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zzs;
import java.lang.ref.WeakReference;
import javax.annotation.Nullable;

public final class zzdjz extends zzcxx {
    public final Context i;
    public final WeakReference j;
    public final zzdip k;
    public final zzdlg l;
    public final zzcyr m;
    public final zzflf n;
    public final zzdcg o;
    public boolean p;

    public zzdjz(zzcxw zzcxw0, Context context0, zzcli zzcli0, zzdip zzdip0, zzdlg zzdlg0, zzcyr zzcyr0, zzflf zzflf0, zzdcg zzdcg0) {
        super(zzcxw0);
        this.p = false;
        this.i = context0;
        this.j = new WeakReference(zzcli0);
        this.k = zzdip0;
        this.l = zzdlg0;
        this.m = zzcyr0;
        this.n = zzflf0;
        this.o = zzdcg0;
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
            else if(!this.p && zzcli0 != null) {
                zzdjy zzdjy0 = new zzdjy(zzcli0);
                zzcfv.zze.execute(zzdjy0);
            }
        }
        finally {
            super.finalize();
        }
    }

    public final boolean zza() {
        return this.m.zzg();
    }

    public final boolean zzc(boolean z, @Nullable Activity activity0) {
        zzdip zzdip0 = this.k;
        zzdip0.zzb();
        boolean z1 = ((Boolean)zzay.zzc().zzb(zzbhz.zzay)).booleanValue();
        Context context0 = this.i;
        zzdcg zzdcg0 = this.o;
        if(!z1 || !zzs.zzC(context0)) {
            if(this.p) {
                zzcfi.zzj("The interstitial ad has been showed.");
                zzdcg0.zza(zzfdc.zzd(10, null, null));
            }
            if(!this.p) {
                if(activity0 == null) {
                    activity0 = context0;
                }
                try {
                    this.l.zza(z, activity0, zzdcg0);
                    zzdip0.zza();
                    this.p = true;
                    return true;
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
                this.n.zza(this.a.zzb.zzb.zzb);
                return false;
            }
        }
        return false;
    }
}

