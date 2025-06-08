package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class zzese implements zzfui {
    public final zzesg zza;
    public final String zzb;
    public final List zzc;
    public final Bundle zzd;
    public final boolean zze;
    public final boolean zzf;

    public zzese(zzesg zzesg0, String s, List list0, Bundle bundle0, boolean z, boolean z1) {
        this.zza = zzesg0;
        this.zzb = s;
        this.zzc = list0;
        this.zzd = bundle0;
        this.zze = z;
        this.zzf = z1;
    }

    @Override  // com.google.android.gms.internal.ads.zzfui
    public final zzfvl zza() {
        zzbvt zzbvt0;
        zzesg zzesg0 = this.zza;
        String s = this.zzb;
        List list0 = this.zzc;
        Bundle bundle0 = this.zzd;
        boolean z = this.zze;
        zzesg0.getClass();
        zzfvl zzfvl0 = new zzcga();
        if(this.zzf) {
            zzesg0.f.zzb(s);
            zzbvt0 = zzesg0.f.zza(s);
        }
        else {
            try {
                zzbvt0 = zzesg0.g.zzb(s);
            }
            catch(RemoteException remoteException0) {
                zzcfi.zzh("Couldn\'t create RTB adapter : ", remoteException0);
                zzbvt0 = null;
            }
        }
        if(zzbvt0 == null) {
            if(!((Boolean)zzay.zzc().zzb(zzbhz.zzbn)).booleanValue()) {
                throw null;
            }
            zzelh.zzb(s, ((zzcga)zzfvl0));
            return zzfvl0;
        }
        zzelh zzelh0 = new zzelh(s, zzbvt0, ((zzcga)zzfvl0));
        if(((Boolean)zzay.zzc().zzb(zzbhz.zzbs)).booleanValue()) {
            zzesc zzesc0 = new zzesc(zzelh0);
            long v = (long)(((Long)zzay.zzc().zzb(zzbhz.zzbl)));
            zzesg0.b.schedule(zzesc0, v, TimeUnit.MILLISECONDS);
        }
        if(z) {
            IObjectWrapper iObjectWrapper0 = ObjectWrapper.wrap(zzesg0.d);
            Object object0 = list0.get(0);
            zzbvt0.zzh(iObjectWrapper0, zzesg0.h, bundle0, ((Bundle)object0), zzesg0.e.zze, zzelh0);
            return zzfvl0;
        }
        zzelh0.zzd();
        return zzfvl0;
    }
}

