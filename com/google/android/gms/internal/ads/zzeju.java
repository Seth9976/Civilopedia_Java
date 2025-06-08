package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

public final class zzeju implements zzefl {
    public final Context a;
    public final Executor b;
    public final zzdsy c;

    public zzeju(Context context0, Executor executor0, zzdsy zzdsy0) {
        this.a = context0;
        this.b = executor0;
        this.c = zzdsy0;
    }

    public static final void a(zzfbx zzfbx0, zzfbl zzfbl0, zzefg zzefg0) {
        try {
            ((zzfcy)zzefg0.zzb).zzk(zzfbx0.zza.zza.zzd, zzfbl0.zzw.toString());
        }
        catch(Exception exception0) {
            zzcfi.zzk(("Fail to load ad from adapter " + zzefg0.zza), exception0);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzefl
    public final Object zza(zzfbx zzfbx0, zzfbl zzfbl0, zzefg zzefg0) throws zzfci, zzeit {
        zzcym zzcym0 = new zzcym(zzfbx0, zzfbl0, zzefg0.zza);
        zzdsv zzdsv0 = new zzdsv(new zzejq(zzefg0));
        zzdsu zzdsu0 = this.c.zze(zzcym0, zzdsv0);
        zzdsu0.zzd().zzj(new zzctj(((zzfcy)zzefg0.zzb)), this.b);
        zzdda zzdda0 = zzdsu0.zze();
        zzdbr zzdbr0 = zzdsu0.zzb();
        u5 u50 = new u5(zzdsu0.zza(), zzdbr0, zzdda0, zzdsu0.zzg());
        ((zzeha)zzefg0.zzc).zzc(u50);
        return zzdsu0.zzk();
    }

    @Override  // com.google.android.gms.internal.ads.zzefl
    public final void zzb(zzfbx zzfbx0, zzfbl zzfbl0, zzefg zzefg0) throws zzfci {
        if(!((zzfcy)zzefg0.zzb).zzA()) {
            t5 t50 = new t5(this, zzfbx0, zzfbl0, zzefg0);
            ((zzeha)zzefg0.zzc).zzd(t50);
            ((zzfcy)zzefg0.zzb).zzh(this.a, zzfbx0.zza.zza.zzd, null, ((zzcaw)zzefg0.zzc), zzfbl0.zzw.toString());
            return;
        }
        zzeju.a(zzfbx0, zzfbl0, zzefg0);
    }
}

