package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.util.zzas;
import java.util.concurrent.Executor;

public final class zzefy implements zzfuj {
    public final zzege zza;
    public final zzfbx zzb;
    public final zzfbl zzc;

    public zzefy(zzege zzege0, zzfbx zzfbx0, zzfbl zzfbl0) {
        this.zza = zzege0;
        this.zzb = zzfbx0;
        this.zzc = zzfbl0;
    }

    @Override  // com.google.android.gms.internal.ads.zzfuj
    public final zzfvl zza(Object object0) {
        zzege zzege0 = this.zza;
        zzfbx zzfbx0 = this.zzb;
        zzfbl zzfbl0 = this.zzc;
        zzege0.getClass();
        Context context0 = zzege0.b;
        zzq zzq0 = zzfch.zza(context0, zzfbl0.zzv);
        zzcli zzcli0 = zzege0.c.zza(zzq0, zzfbl0, zzfbx0.zzb.zzb);
        zzcli0.zzab(zzfbl0.zzX);
        zzdts zzdts0 = !((Boolean)zzay.zzc().zzb(zzbhz.zzgB)).booleanValue() || !zzfbl0.zzai ? new zzdts(context0, ((View)zzcli0), ((zzas)zzege0.f.apply(zzfbl0))) : zzcxj.zza(context0, ((View)zzcli0), zzfbl0);
        zzcym zzcym0 = new zzcym(zzfbx0, zzfbl0, null);
        zzcwc zzcwc0 = new zzcwc(zzdts0, zzcli0, new zzefz(zzcli0), zzfch.zzc(zzq0));
        zzcvw zzcvw0 = zzege0.a.zza(zzcym0, zzcwc0);
        zzcvw0.zzj().zzi(zzcli0, false, null);
        zzdcl zzdcl0 = zzcvw0.zzc();
        zzega zzega0 = new zzega(zzcli0);
        zzfvm zzfvm0 = zzcfv.zzf;
        zzdcl0.zzj(zzega0, zzfvm0);
        zzcvw0.zzj();
        zzfvl zzfvl0 = zzdto.zzj(zzcli0, zzfbl0.zzt.zzb, zzfbl0.zzt.zza);
        Executor executor0 = zzege0.e;
        if(zzfbl0.zzN) {
            zzfvl0.zzc(new zzegb(zzcli0), executor0);
        }
        zzfvl0.zzc(new zzegc(zzege0, zzcli0), executor0);
        return zzfvc.zzm(zzfvl0, new zzegd(zzcvw0), zzfvm0);
    }
}

