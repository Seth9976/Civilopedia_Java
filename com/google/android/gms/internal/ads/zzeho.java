package com.google.android.gms.internal.ads;

import R.a;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

public final class zzeho implements zzefl {
    public final Context a;
    public final zzdky b;

    public zzeho(Context context0, zzdky zzdky0) {
        this.a = context0;
        this.b = zzdky0;
    }

    @Override  // com.google.android.gms.internal.ads.zzefl
    public final Object zza(zzfbx zzfbx0, zzfbl zzfbl0, zzefg zzefg0) throws zzfci, zzeit {
        a a0 = new a(zzfbl0, ((zzbvt)zzefg0.zzb), false);
        zzcym zzcym0 = new zzcym(zzfbx0, zzfbl0, zzefg0.zza);
        zzdkd zzdkd0 = new zzdkd(a0, null);
        zzdka zzdka0 = this.b.zze(zzcym0, zzdkd0);
        a0.d = zzdka0.zzc();
        zzejz zzejz0 = zzdka0.zzh();
        ((zzegz)zzefg0.zzc).zzc(zzejz0);
        return zzdka0.zzg();
    }

    @Override  // com.google.android.gms.internal.ads.zzefl
    public final void zzb(zzfbx zzfbx0, zzfbl zzfbl0, zzefg zzefg0) throws zzfci {
        try {
            ((zzbvt)zzefg0.zzb).zzp(zzfbl0.zzaa);
            IObjectWrapper iObjectWrapper0 = ObjectWrapper.wrap(this.a);
            o5 o50 = new o5(zzefg0);
            ((zzbvt)zzefg0.zzb).zzk(zzfbl0.zzV, zzfbl0.zzw.toString(), zzfbx0.zza.zza.zzd, iObjectWrapper0, o50, ((zzbug)zzefg0.zzc));
        }
        catch(RemoteException remoteException0) {
            throw new zzfci(remoteException0);
        }
    }
}

