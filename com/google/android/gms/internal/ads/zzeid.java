package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

public final class zzeid implements zzefl {
    public final Context a;
    public final zzdlu b;
    public zzbup c;
    public final zzcfo d;

    public zzeid(Context context0, zzdlu zzdlu0, zzcfo zzcfo0) {
        this.a = context0;
        this.b = zzdlu0;
        this.d = zzcfo0;
    }

    @Override  // com.google.android.gms.internal.ads.zzefl
    public final Object zza(zzfbx zzfbx0, zzfbl zzfbl0, zzefg zzefg0) throws zzfci, zzeit {
        if(!zzfbx0.zza.zza.zzg.contains("6")) {
            throw new zzeit(2, "Unified must be used for RTB.");
        }
        zzdnh zzdnh0 = zzdnh.zzs(this.c);
        String s = Integer.toString(zzdnh0.zzc());
        if(!zzfbx0.zza.zza.zzg.contains(s)) {
            throw new zzeit(1, "No corresponding native ad listener");
        }
        zzcym zzcym0 = new zzcym(zzfbx0, zzfbl0, zzefg0.zza);
        zzdnt zzdnt0 = new zzdnt(zzdnh0);
        zzdph zzdph0 = new zzdph(null, null, this.c, null);
        zzdnj zzdnj0 = this.b.zze(zzcym0, zzdnt0, zzdph0);
        zzejz zzejz0 = zzdnj0.zzh();
        ((zzegz)zzefg0.zzc).zzc(zzejz0);
        return zzdnj0.zza();
    }

    @Override  // com.google.android.gms.internal.ads.zzefl
    public final void zzb(zzfbx zzfbx0, zzfbl zzfbl0, zzefg zzefg0) throws zzfci {
        try {
            ((zzbvt)zzefg0.zzb).zzp(zzfbl0.zzaa);
            int v = this.d.zzc;
            int v1 = (int)(((Integer)zzay.zzc().zzb(zzbhz.zzbt)));
            Context context0 = this.a;
            if(v < v1) {
                IObjectWrapper iObjectWrapper0 = ObjectWrapper.wrap(context0);
                p5 p50 = new p5(this, zzefg0);
                ((zzbvt)zzefg0.zzb).zzl(zzfbl0.zzV, zzfbl0.zzw.toString(), zzfbx0.zza.zza.zzd, iObjectWrapper0, p50, ((zzbug)zzefg0.zzc));
                return;
            }
            IObjectWrapper iObjectWrapper1 = ObjectWrapper.wrap(context0);
            p5 p51 = new p5(this, zzefg0);
            ((zzbvt)zzefg0.zzb).zzm(zzfbl0.zzV, zzfbl0.zzw.toString(), zzfbx0.zza.zza.zzd, iObjectWrapper1, p51, ((zzbug)zzefg0.zzc), zzfbx0.zza.zza.zzi);
            return;
        }
        catch(RemoteException remoteException0) {
        }
        throw new zzfci(remoteException0);
    }
}

