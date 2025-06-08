package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import org.json.JSONObject;

public final class zzcro implements Runnable {
    public final zzcrp zza;
    public final Runnable zzb;

    public zzcro(zzcrp zzcrp0, Runnable runnable0) {
        this.zza = zzcrp0;
        this.zzb = runnable0;
    }

    @Override
    public final void run() {
        zzcrp zzcrp0 = this.zza;
        Runnable runnable0 = this.zzb;
        zzcrp0.getClass();
        Preconditions.checkMainThread("Adapters must be initialized on the main thread.");
        Map map0 = zzt.zzo().zzh().zzh().zze();
        if(!map0.isEmpty()) {
            if(runnable0 != null) {
                try {
                    runnable0.run();
                }
                catch(Throwable throwable0) {
                    zzcfi.zzk("Could not initialize rewarded ads.", throwable0);
                    return;
                }
            }
            if(zzcrp0.k.zzd()) {
                HashMap hashMap0 = new HashMap();
                for(Object object0: map0.values()) {
                    for(Object object1: ((zzbtv)object0).zza) {
                        String s = ((zzbtu)object1).zzk;
                        for(Object object2: ((zzbtu)object1).zzc) {
                            String s1 = (String)object2;
                            if(!hashMap0.containsKey(s1)) {
                                hashMap0.put(s1, new ArrayList());
                            }
                            if(s != null) {
                                ((Collection)hashMap0.get(s1)).add(s);
                            }
                        }
                    }
                    if(false) {
                        break;
                    }
                }
                JSONObject jSONObject0 = new JSONObject();
                for(Object object3: hashMap0.entrySet()) {
                    Map.Entry map$Entry0 = (Map.Entry)object3;
                    String s2 = (String)map$Entry0.getKey();
                    try {
                        zzefg zzefg0 = zzcrp0.l.zza(s2, jSONObject0);
                        if(zzefg0 == null) {
                            continue;
                        }
                        zzfcy zzfcy0 = (zzfcy)zzefg0.zzb;
                        if(zzfcy0.zzA() || !zzfcy0.zzz()) {
                            continue;
                        }
                        List list0 = (List)map$Entry0.getValue();
                        zzfcy0.zzj(zzcrp0.i, ((zzeha)zzefg0.zzc), list0);
                        zzcfi.zze(("Initialized rewarded video mediation adapter " + s2));
                    }
                    catch(zzfci zzfci0) {
                        zzcfi.zzk(("Failed to initialize rewarded video mediation adapter \"" + s2 + "\""), zzfci0);
                    }
                }
            }
        }
    }
}

