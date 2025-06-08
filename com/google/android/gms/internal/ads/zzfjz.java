package com.google.android.gms.internal.ads;

import java.util.HashSet;
import org.json.JSONObject;

public final class zzfjz {
    public JSONObject a;
    public final zzfki b;

    public zzfjz(zzfki zzfki0) {
        this.b = zzfki0;
    }

    public final JSONObject zza() {
        return this.a;
    }

    public final void zzb() {
        zzfkj zzfkj0 = new zzfkj(this, null);
        this.b.zzb(zzfkj0);
    }

    public final void zzc(JSONObject jSONObject0, HashSet hashSet0, long v) {
        zzfkk zzfkk0 = new zzfkk(this, hashSet0, jSONObject0, v, null);
        this.b.zzb(zzfkk0);
    }

    public final void zzd(JSONObject jSONObject0, HashSet hashSet0, long v) {
        zzfkl zzfkl0 = new zzfkl(this, hashSet0, jSONObject0, v, null);
        this.b.zzb(zzfkl0);
    }

    public final void zze(JSONObject jSONObject0) {
        this.a = jSONObject0;
    }
}

