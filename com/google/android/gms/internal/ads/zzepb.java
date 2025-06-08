package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzay;

public final class zzepb implements zzetf {
    public final zzepc zza;
    public final Bundle zzb;

    public zzepb(zzepc zzepc0, Bundle bundle0) {
        this.zza = zzepc0;
        this.zzb = bundle0;
    }

    @Override  // com.google.android.gms.internal.ads.zzetf
    public final void zzf(Object object0) {
        zzepc zzepc0 = this.zza;
        Bundle bundle0 = this.zzb;
        zzepc0.getClass();
        if(((Boolean)zzay.zzc().zzb(zzbhz.zzeB)).booleanValue()) {
            ((Bundle)object0).putBundle("quality_signals", bundle0);
        }
        else if(((Boolean)zzay.zzc().zzb(zzbhz.zzeA)).booleanValue()) {
            synchronized(zzepc.h) {
                zzepc0.c.zzg(zzepc0.e.zzd);
                ((Bundle)object0).putBundle("quality_signals", zzepc0.d.zzb());
            }
        }
        else {
            zzepc0.c.zzg(zzepc0.e.zzd);
            ((Bundle)object0).putBundle("quality_signals", zzepc0.d.zzb());
        }
        ((Bundle)object0).putString("seq_num", zzepc0.a);
        if(!zzepc0.f.zzP()) {
            ((Bundle)object0).putString("session_id", zzepc0.b);
        }
    }
}

