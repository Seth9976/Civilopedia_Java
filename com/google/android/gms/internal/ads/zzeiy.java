package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

public final class zzeiy implements zzefl {
    public final Context a;
    public final Executor b;
    public final zzdsy c;

    public zzeiy(Context context0, Executor executor0, zzdsy zzdsy0) {
        this.a = context0;
        this.b = executor0;
        this.c = zzdsy0;
    }

    @Override  // com.google.android.gms.internal.ads.zzefl
    public final Object zza(zzfbx zzfbx0, zzfbl zzfbl0, zzefg zzefg0) throws zzfci, zzeit {
        zzcym zzcym0 = new zzcym(zzfbx0, zzfbl0, zzefg0.zza);
        zzdsv zzdsv0 = new zzdsv(new zzeix(zzefg0));
        zzdsu zzdsu0 = this.c.zze(zzcym0, zzdsv0);
        zzdsu0.zzd().zzj(new zzctj(((zzfcy)zzefg0.zzb)), this.b);
        zzeje zzeje0 = zzdsu0.zzm();
        ((zzegz)zzefg0.zzc).zzc(zzeje0);
        return zzdsu0.zzk();
    }

    @Override  // com.google.android.gms.internal.ads.zzefl
    public final void zzb(zzfbx zzfbx0, zzfbl zzfbl0, zzefg zzefg0) throws zzfci {
        try {
            zzfcd zzfcd0 = zzfbx0.zza.zza;
            Context context0 = this.a;
            if(zzfcd0.zzo.zza == 3) {
                ((zzfcy)zzefg0.zzb).zzq(context0, zzfcd0.zzd, zzfbl0.zzw.toString(), ((zzbug)zzefg0.zzc));
                return;
            }
            ((zzfcy)zzefg0.zzb).zzp(context0, zzfcd0.zzd, zzfbl0.zzw.toString(), ((zzbug)zzefg0.zzc));
            return;
        }
        catch(Exception exception0) {
        }
        zzcfi.zzk(("Fail to load ad from adapter " + zzefg0.zza), exception0);
    }
}

