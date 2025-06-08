package com.google.android.gms.internal.ads;

import org.json.JSONObject;

public final class zzfio {
    public final zzfiv a;
    public final zzfiv b;
    public final zzfis c;
    public final zzfiu d;

    public zzfio(zzfis zzfis0, zzfiu zzfiu0, zzfiv zzfiv0, zzfiv zzfiv1) {
        this.c = zzfis0;
        this.d = zzfiu0;
        this.a = zzfiv0;
        if(zzfiv1 == null) {
            this.b = zzfiv.zzc;
            return;
        }
        this.b = zzfiv1;
    }

    public static zzfio zza(zzfis zzfis0, zzfiu zzfiu0, zzfiv zzfiv0, zzfiv zzfiv1, boolean z) {
        zzfjv.zzb(zzfiu0, "ImpressionType is null");
        zzfjv.zzb(zzfiv0, "Impression owner is null");
        if(zzfiv0 == zzfiv.zzc) {
            throw new IllegalArgumentException("Impression owner is none");
        }
        if(zzfis0 == zzfis.zza && zzfiv0 == zzfiv.zza) {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        }
        if(zzfiu0 == zzfiu.zza && zzfiv0 == zzfiv.zza) {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        }
        return new zzfio(zzfis0, zzfiu0, zzfiv0, zzfiv1);
    }

    public final JSONObject zzb() {
        JSONObject jSONObject0 = new JSONObject();
        zzfjt.zzg(jSONObject0, "impressionOwner", this.a);
        zzfiv zzfiv0 = this.b;
        zzfiu zzfiu0 = this.d;
        if(zzfiu0 == null) {
            zzfjt.zzg(jSONObject0, "videoEventsOwner", zzfiv0);
        }
        else {
            zzfjt.zzg(jSONObject0, "mediaEventsOwner", zzfiv0);
            zzfjt.zzg(jSONObject0, "creativeType", this.c);
            zzfjt.zzg(jSONObject0, "impressionType", zzfiu0);
        }
        zzfjt.zzg(jSONObject0, "isolateVerificationScripts", Boolean.TRUE);
        return jSONObject0;
    }
}

