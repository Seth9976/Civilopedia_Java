package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzu;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzdyp implements zzdbw, zzddl, zzdeo {
    public final zzdzb i;
    public final String j;
    public int k;
    public zzdyo l;
    public zzdbm m;
    public zze n;

    public zzdyp(zzdzb zzdzb0, zzfcd zzfcd0) {
        this.i = zzdzb0;
        this.j = zzfcd0.zzf;
        this.k = 0;
        this.l = zzdyo.zza;
    }

    public static JSONObject a(zze zze0) {
        JSONObject jSONObject0 = new JSONObject();
        jSONObject0.put("errorDomain", zze0.zzc);
        jSONObject0.put("errorCode", zze0.zza);
        jSONObject0.put("errorDescription", zze0.zzb);
        jSONObject0.put("underlyingError", (zze0.zzd == null ? null : zzdyp.a(zze0.zzd)));
        return jSONObject0;
    }

    public static JSONObject b(zzdbm zzdbm0) {
        JSONObject jSONObject0 = new JSONObject();
        jSONObject0.put("winningAdapterClassName", zzdbm0.zzg());
        jSONObject0.put("responseSecsSinceEpoch", zzdbm0.zzc());
        jSONObject0.put("responseId", zzdbm0.zzh());
        if(((Boolean)zzay.zzc().zzb(zzbhz.zzhM)).booleanValue()) {
            String s = zzdbm0.zzd();
            if(!TextUtils.isEmpty(s)) {
                zzcfi.zze(("Bidding data: " + s));
                jSONObject0.put("biddingData", new JSONObject(s));
            }
        }
        JSONArray jSONArray0 = new JSONArray();
        for(Object object0: zzdbm0.zzi()) {
            zzu zzu0 = (zzu)object0;
            JSONObject jSONObject1 = new JSONObject();
            jSONObject1.put("adapterClassName", zzu0.zza);
            jSONObject1.put("latencyMillis", zzu0.zzb);
            if(((Boolean)zzay.zzc().zzb(zzbhz.zzhN)).booleanValue()) {
                jSONObject1.put("credentials", zzaw.zzb().zzh(zzu0.zzd));
            }
            jSONObject1.put("error", (zzu0.zzc == null ? null : zzdyp.a(zzu0.zzc)));
            jSONArray0.put(jSONObject1);
        }
        jSONObject0.put("adNetworks", jSONArray0);
        return jSONObject0;
    }

    @Override  // com.google.android.gms.internal.ads.zzdbw
    public final void zza(zze zze0) {
        this.l = zzdyo.zzc;
        this.n = zze0;
    }

    @Override  // com.google.android.gms.internal.ads.zzdeo
    public final void zzb(zzfbx zzfbx0) {
        if(!zzfbx0.zzb.zza.isEmpty()) {
            this.k = ((zzfbl)zzfbx0.zzb.zza.get(0)).zzb;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzdeo
    public final void zzbE(zzbzv zzbzv0) {
        this.i.zze(this.j, this);
    }

    @Override  // com.google.android.gms.internal.ads.zzddl
    public final void zzbH(zzcxx zzcxx0) {
        this.m = zzcxx0.zzl();
        this.l = zzdyo.zzb;
    }

    public final JSONObject zzc() throws JSONException {
        JSONObject jSONObject1;
        JSONObject jSONObject0 = new JSONObject();
        jSONObject0.put("state", this.l);
        jSONObject0.put("format", zzfbl.zza(this.k));
        zzdbm zzdbm0 = this.m;
        if(zzdbm0 == null) {
            zze zze0 = this.n;
            JSONObject jSONObject2 = null;
            if(zze0 != null) {
                IBinder iBinder0 = zze0.zze;
                if(iBinder0 != null) {
                    jSONObject2 = zzdyp.b(((zzdbm)iBinder0));
                    if(((zzdbm)iBinder0).zzi().isEmpty()) {
                        JSONArray jSONArray0 = new JSONArray();
                        jSONArray0.put(zzdyp.a(this.n));
                        jSONObject2.put("errors", jSONArray0);
                    }
                }
            }
            jSONObject1 = jSONObject2;
        }
        else {
            jSONObject1 = zzdyp.b(zzdbm0);
        }
        jSONObject0.put("responseInfo", jSONObject1);
        return jSONObject0;
    }

    public final boolean zzd() {
        return this.l != zzdyo.zza;
    }
}

