package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.zzbu;
import java.util.concurrent.Executor;

public final class zzehz implements zzefl {
    public final Context a;
    public final zzdlu b;
    public final Executor c;

    public zzehz(Context context0, zzdlu zzdlu0, Executor executor0) {
        this.a = context0;
        this.b = zzdlu0;
        this.c = executor0;
    }

    public static final boolean a(zzfbx zzfbx0, int v) {
        return zzfbx0.zza.zza.zzg.contains(Integer.toString(v));
    }

    @Override  // com.google.android.gms.internal.ads.zzefl
    public final Object zza(zzfbx zzfbx0, zzfbl zzfbl0, zzefg zzefg0) throws zzfci, zzeit {
        zzdnh zzdnh0;
        zzbul zzbul0 = ((zzfcy)zzefg0.zzb).zzB();
        zzbum zzbum0 = ((zzfcy)zzefg0.zzb).zzC();
        zzbup zzbup0 = ((zzfcy)zzefg0.zzb).zzd();
        if(zzbup0 != null && zzehz.a(zzfbx0, 6)) {
            zzdnh0 = zzdnh.zzs(zzbup0);
        }
        else {
            if(zzbul0 != null && zzehz.a(zzfbx0, 6)) {
                zzdnh0 = zzdnh.zzad(zzbul0);
                goto label_17;
            }
            if(zzbul0 != null && zzehz.a(zzfbx0, 2)) {
                zzdnh0 = zzdnh.zzab(zzbul0);
                goto label_17;
            }
            if(zzbum0 != null && zzehz.a(zzfbx0, 6)) {
                zzdnh0 = zzdnh.zzae(zzbum0);
            }
            else if(zzbum0 != null && zzehz.a(zzfbx0, 1)) {
                zzdnh0 = zzdnh.zzac(zzbum0);
            }
            else {
                throw new zzeit(1, "No native ad mappers");
            }
        }
    label_17:
        String s = Integer.toString(zzdnh0.zzc());
        if(!zzfbx0.zza.zza.zzg.contains(s)) {
            throw new zzeit(1, "No corresponding native ad listener");
        }
        zzcym zzcym0 = new zzcym(zzfbx0, zzfbl0, zzefg0.zza);
        zzdnt zzdnt0 = new zzdnt(zzdnh0);
        zzdph zzdph0 = new zzdph(zzbum0, zzbul0, zzbup0, null);
        zzdnj zzdnj0 = this.b.zze(zzcym0, zzdnt0, zzdph0);
        zzekf zzekf0 = zzdnj0.zzi();
        ((zzegz)zzefg0.zzc).zzc(zzekf0);
        zzdnj0.zzd().zzj(new zzctj(((zzfcy)zzefg0.zzb)), this.c);
        return zzdnj0.zza();
    }

    @Override  // com.google.android.gms.internal.ads.zzefl
    public final void zzb(zzfbx zzfbx0, zzfbl zzfbl0, zzefg zzefg0) throws zzfci {
        String s = zzbu.zzl(zzfbl0.zzt);
        ((zzfcy)zzefg0.zzb).zzo(this.a, zzfbx0.zza.zza.zzd, zzfbl0.zzw.toString(), s, ((zzbug)zzefg0.zzc), zzfbx0.zza.zza.zzi, zzfbx0.zza.zza.zzg);
    }
}

