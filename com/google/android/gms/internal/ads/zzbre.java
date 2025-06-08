package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzaw;
import i3.e;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzbre {
    public static void zza(zzbrf zzbrf0, String s, Map map0) {
        JSONObject jSONObject0;
        try {
            jSONObject0 = zzaw.zzb().zzi(map0);
        }
        catch(JSONException unused_ex) {
            zzcfi.zzj("Could not convert parameters to JSON.");
            return;
        }
        zzbrf0.zze(s, jSONObject0);
    }

    public static void zzb(zzbrf zzbrf0, String s, JSONObject jSONObject0) {
        StringBuilder stringBuilder0 = e.j("(window.AFMA_ReceiveMessage || function() {})(\'", s, "\',", jSONObject0.toString(), ");");
        zzcfi.zze(("Dispatching AFMA event: " + stringBuilder0.toString()));
        zzbrf0.zza(stringBuilder0.toString());
    }

    public static void zzc(zzbrf zzbrf0, String s, String s1) {
        zzbrf0.zza(s + "(" + s1 + ");");
    }

    public static void zzd(zzbrf zzbrf0, String s, JSONObject jSONObject0) {
        zzbrf0.zzb(s, jSONObject0.toString());
    }
}

