package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzt;
import java.util.Map;

public final class zzfcj implements zzbom {
    public final zzfii zza;
    public final zzees zzb;

    public zzfcj(zzfii zzfii0, zzees zzees0) {
        this.zza = zzfii0;
        this.zzb = zzees0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbom
    public final void zza(Object object0, Map map0) {
        zzfii zzfii0 = this.zza;
        zzees zzees0 = this.zzb;
        Object object1 = map0.get("u");
        if(((String)object1) == null) {
            zzcfi.zzj("URL missing from httpTrack GMSG.");
            return;
        }
        if(!((zzckz)object0).zzF().zzak) {
            zzfii0.zzc(((String)object1), null);
            return;
        }
        zzees0.zzd(new zzeeu(zzt.zzA().currentTimeMillis(), ((zzcmf)(((zzckz)object0))).zzR().zzb, ((String)object1), 2));
    }
}

