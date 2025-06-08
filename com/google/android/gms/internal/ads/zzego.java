package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.ExecutionException;

public final class zzego implements zzefl {
    public final Context a;
    public final zzcws b;
    public View c;
    public zzbuj d;

    public zzego(Context context0, zzcws zzcws0) {
        this.a = context0;
        this.b = zzcws0;
    }

    @Override  // com.google.android.gms.internal.ads.zzefl
    public final Object zza(zzfbx zzfbx0, zzfbl zzfbl0, zzefg zzefg0) throws zzfci, zzeit {
        View view0;
        if(!((Boolean)zzay.zzc().zzb(zzbhz.zzgB)).booleanValue() || !zzfbl0.zzai) {
            view0 = this.c;
        }
        else {
            try {
                view0 = (View)ObjectWrapper.unwrap(this.d.zze());
                boolean z = this.d.zzf();
            }
            catch(RemoteException remoteException0) {
                throw new zzfci(remoteException0);
            }
            if(view0 == null) {
                throw new zzfci(new Exception("BannerRtbAdapterWrapper interscrollerView should not be null"));
            }
            if(z) {
                zzfvl zzfvl0 = zzfvc.zzn(zzfvc.zzi(null), new zzegk(this, view0, zzfbl0), zzcfv.zze);
                try {
                    view0 = (View)zzfvl0.get();
                    goto label_15;
                }
                catch(InterruptedException | ExecutionException interruptedException0) {
                    throw new zzfci(interruptedException0);
                }
                throw new zzfci(new Exception("BannerRtbAdapterWrapper interscrollerView should not be null"));
            }
        }
    label_15:
        zzcym zzcym0 = new zzcym(zzfbx0, zzfbl0, zzefg0.zza);
        zzcwc zzcwc0 = new zzcwc(view0, null, new zzegl(zzefg0), ((zzfbm)zzfbl0.zzv.get(0)));
        zzcvw zzcvw0 = this.b.zza(zzcym0, zzcwc0);
        zzcvw0.zzg().zza(view0);
        zzejz zzejz0 = zzcvw0.zzh();
        ((zzegz)zzefg0.zzc).zzc(zzejz0);
        return zzcvw0.zza();
    }

    @Override  // com.google.android.gms.internal.ads.zzefl
    public final void zzb(zzfbx zzfbx0, zzfbl zzfbl0, zzefg zzefg0) throws zzfci {
        try {
            ((zzbvt)zzefg0.zzb).zzp(zzfbl0.zzaa);
            boolean z = ((Boolean)zzay.zzc().zzb(zzbhz.zzgB)).booleanValue();
            Context context0 = this.a;
            if(z && zzfbl0.zzai) {
                IObjectWrapper iObjectWrapper0 = ObjectWrapper.wrap(context0);
                m5 m50 = new m5(this, zzefg0);
                ((zzbvt)zzefg0.zzb).zzj(zzfbl0.zzV, zzfbl0.zzw.toString(), zzfbx0.zza.zza.zzd, iObjectWrapper0, m50, ((zzbug)zzefg0.zzc), zzfbx0.zza.zza.zze);
                return;
            }
            IObjectWrapper iObjectWrapper1 = ObjectWrapper.wrap(context0);
            m5 m51 = new m5(this, zzefg0);
            ((zzbvt)zzefg0.zzb).zzi(zzfbl0.zzV, zzfbl0.zzw.toString(), zzfbx0.zza.zza.zzd, iObjectWrapper1, m51, ((zzbug)zzefg0.zzc), zzfbx0.zza.zza.zze);
            return;
        }
        catch(RemoteException remoteException0) {
        }
        throw new zzfci(remoteException0);
    }
}

