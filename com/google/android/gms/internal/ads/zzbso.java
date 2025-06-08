package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zze;
import java.util.AbstractMap.SimpleEntry;
import java.util.HashSet;
import java.util.Map;
import org.json.JSONObject;

public final class zzbso implements zzbrf, zzbsn {
    public final zzbsn i;
    public final HashSet j;

    public zzbso(zzbsn zzbsn0) {
        this.i = zzbsn0;
        this.j = new HashSet();
    }

    @Override  // com.google.android.gms.internal.ads.zzbrf, com.google.android.gms.internal.ads.zzbrq
    public final void zza(String s) {
        this.i.zza(s);
    }

    @Override  // com.google.android.gms.internal.ads.zzbrf, com.google.android.gms.internal.ads.zzbrq
    public final void zzb(String s, String s1) {
        zzbre.zzc(this, s, s1);
    }

    public final void zzc() {
        HashSet hashSet0 = this.j;
        for(Object object0: hashSet0) {
            zze.zza(("Unregistering eventhandler: " + ((zzbom)((AbstractMap.SimpleEntry)object0).getValue()).toString()));
            String s = (String)((AbstractMap.SimpleEntry)object0).getKey();
            zzbom zzbom0 = (zzbom)((AbstractMap.SimpleEntry)object0).getValue();
            this.i.zzr(s, zzbom0);
        }
        hashSet0.clear();
    }

    @Override  // com.google.android.gms.internal.ads.zzbrd
    public final void zzd(String s, Map map0) {
        zzbre.zza(this, s, map0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbrf, com.google.android.gms.internal.ads.zzbrd
    public final void zze(String s, JSONObject jSONObject0) {
        zzbre.zzb(this, s, jSONObject0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbrq
    public final void zzl(String s, JSONObject jSONObject0) {
        zzbre.zzd(this, s, jSONObject0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbsn
    public final void zzq(String s, zzbom zzbom0) {
        this.i.zzq(s, zzbom0);
        AbstractMap.SimpleEntry abstractMap$SimpleEntry0 = new AbstractMap.SimpleEntry(s, zzbom0);
        this.j.add(abstractMap$SimpleEntry0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbsn
    public final void zzr(String s, zzbom zzbom0) {
        this.i.zzr(s, zzbom0);
        AbstractMap.SimpleEntry abstractMap$SimpleEntry0 = new AbstractMap.SimpleEntry(s, zzbom0);
        this.j.remove(abstractMap$SimpleEntry0);
    }
}

