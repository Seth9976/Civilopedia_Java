package com.google.android.gms.internal.ads;

import android.util.JsonWriter;
import java.util.Map;

public final class zzcfc implements F2 {
    public final int zza;
    public final Map zzb;

    public zzcfc(int v, Map map0) {
        this.zza = v;
        this.zzb = map0;
    }

    @Override  // com.google.android.gms.internal.ads.F2
    public final void zza(JsonWriter jsonWriter0) {
        jsonWriter0.name("params").beginObject();
        jsonWriter0.name("firstline").beginObject();
        jsonWriter0.name("code").value(((long)this.zza));
        jsonWriter0.endObject();
        zzcfh.b(jsonWriter0, this.zzb);
        jsonWriter0.endObject();
    }
}

