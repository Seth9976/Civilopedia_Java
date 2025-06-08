package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

public final class zzehv implements zzfuj {
    public final zzehx zza;
    public final zzfbx zzb;
    public final zzfbl zzc;

    public zzehv(zzehx zzehx0, zzfbx zzfbx0, zzfbl zzfbl0) {
        this.zza = zzehx0;
        this.zzb = zzfbx0;
        this.zzc = zzfbl0;
    }

    @Override  // com.google.android.gms.internal.ads.zzfuj
    public final zzfvl zza(Object object0) {
        zzdpu zzdpu1;
        zzfvm zzfvm1;
        zzfcz zzfcz1;
        int v3;
        ArrayList arrayList1;
        int v2;
        zzehx zzehx0 = this.zza;
        zzfbx zzfbx0 = this.zzb;
        zzfbl zzfbl0 = this.zzc;
        zzehx0.getClass();
        if(((JSONArray)object0).length() == 0) {
            return zzfvc.zzh(new zzdzl(3));
        }
        zzdpu zzdpu0 = zzehx0.c;
        zzfvm zzfvm0 = zzehx0.b;
        zzfcz zzfcz0 = zzehx0.d;
        if(zzfbx0.zza.zza.zzk > 1) {
            int v = ((JSONArray)object0).length();
            zzfcz0.zzc(Math.min(v, zzfbx0.zza.zza.zzk));
            ArrayList arrayList0 = new ArrayList(zzfbx0.zza.zza.zzk);
            int v1 = 0;
            while(v1 < zzfbx0.zza.zza.zzk) {
                if(v1 < v) {
                    JSONObject jSONObject0 = ((JSONArray)object0).getJSONObject(v1);
                    zzfvl zzfvl0 = zzfcz0.zza();
                    zzfvl zzfvl1 = zzdpu0.zza(zzfbx0, zzfbl0, jSONObject0);
                    v2 = v1;
                    arrayList1 = arrayList0;
                    v3 = v;
                    zzfcz1 = zzfcz0;
                    zzfvm1 = zzfvm0;
                    zzdpu1 = zzdpu0;
                    arrayList1.add(zzfvc.zzd(new zzfvl[]{zzfvl0, zzfvl1}).zza(new zzehs(zzehx0, zzfvl1, zzfvl0, zzfbx0, zzfbl0, jSONObject0), zzfvm1));
                }
                else {
                    v2 = v1;
                    arrayList1 = arrayList0;
                    v3 = v;
                    zzfcz1 = zzfcz0;
                    zzfvm1 = zzfvm0;
                    zzdpu1 = zzdpu0;
                    arrayList1.add(zzfvc.zzh(new zzdzl(3)));
                }
                v1 = v2 + 1;
                zzdpu0 = zzdpu1;
                arrayList0 = arrayList1;
                zzfvm0 = zzfvm1;
                zzfcz0 = zzfcz1;
                v = v3;
            }
            return zzfvc.zzi(arrayList0);
        }
        JSONObject jSONObject1 = ((JSONArray)object0).getJSONObject(0);
        zzfvl zzfvl2 = zzfcz0.zza();
        zzfvl zzfvl3 = zzdpu0.zza(zzfbx0, zzfbl0, jSONObject1);
        return zzfvc.zzm(zzfvc.zzd(new zzfvl[]{zzfvl2, zzfvl3}).zza(new zzehs(zzehx0, zzfvl3, zzfvl2, zzfbx0, zzfbl0, jSONObject1), zzfvm0), zzehw.zza, zzfvm0);
    }
}

