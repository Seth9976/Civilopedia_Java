package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzay;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONObject;

public final class zzeof implements Callable {
    public final zzeog zza;

    public zzeof(zzeog zzeog0) {
        this.zza = zzeog0;
    }

    @Override
    public final Object call() {
        zzeog zzeog0 = this.zza;
        zzeog0.getClass();
        List list0 = Arrays.asList(((String)zzay.zzc().zzb(zzbhz.zzbk)).split(";"));
        Bundle bundle0 = new Bundle();
        for(Object object0: list0) {
            String s = (String)object0;
            try {
                JSONObject jSONObject0 = new JSONObject();
                zzfcy zzfcy0 = zzeog0.b.zzc(s, jSONObject0);
                zzfcy0.zzA();
                Bundle bundle1 = new Bundle();
                try {
                    zzbwg zzbwg0 = zzfcy0.zzf();
                    if(zzbwg0 != null) {
                        bundle1.putString("sdk_version", zzbwg0.toString());
                    }
                }
                catch(zzfci unused_ex) {
                }
                try {
                    zzbwg zzbwg1 = zzfcy0.zze();
                    if(zzbwg1 != null) {
                        bundle1.putString("adapter_version", zzbwg1.toString());
                    }
                }
                catch(zzfci unused_ex) {
                }
                bundle0.putBundle(s, bundle1);
            }
            catch(zzfci unused_ex) {
            }
        }
        return new zzeoi(bundle0);
    }
}

