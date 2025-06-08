package com.google.android.gms.internal.ads;

import android.util.JsonWriter;
import com.google.android.gms.common.util.Base64Utils;
import java.util.Map;

public final class zzcfe implements F2 {
    public final String zza;
    public final String zzb;
    public final Map zzc;
    public final byte[] zzd;

    public zzcfe(String s, String s1, Map map0, byte[] arr_b) {
        this.zza = s;
        this.zzb = s1;
        this.zzc = map0;
        this.zzd = arr_b;
    }

    @Override  // com.google.android.gms.internal.ads.F2
    public final void zza(JsonWriter jsonWriter0) {
        byte[] arr_b = this.zzd;
        jsonWriter0.name("params").beginObject();
        jsonWriter0.name("firstline").beginObject();
        jsonWriter0.name("uri").value(this.zza);
        jsonWriter0.name("verb").value(this.zzb);
        jsonWriter0.endObject();
        zzcfh.b(jsonWriter0, this.zzc);
        if(arr_b != null) {
            jsonWriter0.name("body").value(Base64Utils.encode(arr_b));
        }
        jsonWriter0.endObject();
    }
}

