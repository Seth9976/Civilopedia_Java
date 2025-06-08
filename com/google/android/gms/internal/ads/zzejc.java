package com.google.android.gms.internal.ads;

import R.a;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

public final class zzejc implements zzefl {
    public final Context a;
    public final zzdsy b;

    public zzejc(Context context0, zzdsy zzdsy0) {
        this.a = context0;
        this.b = zzdsy0;
    }

    @Override  // com.google.android.gms.internal.ads.zzefl
    public final Object zza(zzfbx zzfbx0, zzfbl zzfbl0, zzefg zzefg0) throws zzfci, zzeit {
        a a0 = new a(zzfbl0, ((zzbvt)zzefg0.zzb), true);
        zzcym zzcym0 = new zzcym(zzfbx0, zzfbl0, zzefg0.zza);
        zzdsv zzdsv0 = new zzdsv(a0);
        zzdsu zzdsu0 = this.b.zze(zzcym0, zzdsv0);
        a0.d = zzdsu0.zzc();
        zzejy zzejy0 = zzdsu0.zzn();
        ((zzegz)zzefg0.zzc).zzc(zzejy0);
        return zzdsu0.zzk();
    }

    @Override  // com.google.android.gms.internal.ads.zzefl
    public final void zzb(zzfbx zzfbx0, zzfbl zzfbl0, zzefg zzefg0) throws zzfci {
        try {
            ((zzbvt)zzefg0.zzb).zzp(zzfbl0.zzaa);
            Context context0 = this.a;
            if(zzfbx0.zza.zza.zzo.zza == 3) {
                IObjectWrapper iObjectWrapper0 = ObjectWrapper.wrap(context0);
                r5 r50 = new r5(zzefg0);
                ((zzbvt)zzefg0.zzb).zzn(zzfbl0.zzV, zzfbl0.zzw.toString(), zzfbx0.zza.zza.zzd, iObjectWrapper0, r50, ((zzbug)zzefg0.zzc));
                return;
            }
            IObjectWrapper iObjectWrapper1 = ObjectWrapper.wrap(context0);
            r5 r51 = new r5(zzefg0);
            ((zzbvt)zzefg0.zzb).zzo(zzfbl0.zzV, zzfbl0.zzw.toString(), zzfbx0.zza.zza.zzd, iObjectWrapper1, r51, ((zzbug)zzefg0.zzc));
            return;
        }
        catch(RemoteException remoteException0) {
        }
        zze.zzb("Remote exception loading a rewarded RTB ad", remoteException0);
    }
}

