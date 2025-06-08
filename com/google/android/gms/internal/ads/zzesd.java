package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONObject;

public final class zzesd implements Callable {
    public final List zza;

    public zzesd(List list0) {
        this.zza = list0;
    }

    @Override
    public final Object call() {
        JSONArray jSONArray0 = new JSONArray();
        for(Object object0: this.zza) {
            zzfvl zzfvl0 = (zzfvl)object0;
            if(((JSONObject)zzfvl0.get()) != null) {
                jSONArray0.put(zzfvl0.get());
            }
        }
        return jSONArray0.length() == 0 ? null : new zzesh(jSONArray0.toString());
    }
}

