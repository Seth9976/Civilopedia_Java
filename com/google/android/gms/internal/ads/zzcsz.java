package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.zzt;
import java.util.Map.Entry;
import java.util.Map;

public final class zzcsz implements zzcsp {
    public final Context a;
    public final zzg b;

    public zzcsz(Context context0) {
        this.b = zzt.zzo().zzh();
        this.a = context0;
    }

    @Override  // com.google.android.gms.internal.ads.zzcsp
    public final void zza(Map map0) {
        if(map0.isEmpty()) {
            return;
        }
        String s = (String)map0.get("gad_idless");
        if(s != null) {
            boolean z = Boolean.parseBoolean(s);
            map0.remove("gad_idless");
            if(((Boolean)zzay.zzc().zzb(zzbhz.zzar)).booleanValue()) {
                this.b.zzH(z);
                if(((Boolean)zzay.zzc().zzb(zzbhz.zzfg)).booleanValue() && z) {
                    this.a.deleteDatabase("OfflineUpload.db");
                }
            }
        }
        Bundle bundle0 = new Bundle();
        for(Object object0: map0.entrySet()) {
            bundle0.putString(((String)((Map.Entry)object0).getKey()), ((String)((Map.Entry)object0).getValue()));
        }
        if(((Boolean)zzay.zzc().zzb(zzbhz.zzam)).booleanValue()) {
            zzt.zzn().zzr(bundle0);
        }
    }
}

