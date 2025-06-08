package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.zze;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONException;
import org.json.JSONObject;

@ParametersAreNonnullByDefault
public final class zzbpa implements zzbom {
    public final Object a;
    public final HashMap b;

    public zzbpa() {
        this.a = new Object();
        this.b = new HashMap();
    }

    @Override  // com.google.android.gms.internal.ads.zzbom
    public final void zza(Object object0, Map map0) {
        String s = (String)map0.get("id");
        String s1 = (String)map0.get("fail");
        String s2 = (String)map0.get("fail_reason");
        String s3 = (String)map0.get("fail_stack");
        String s4 = (String)map0.get("result");
        if(TextUtils.isEmpty(s3)) {
            s2 = "Unknown Fail Reason.";
        }
        String s5 = TextUtils.isEmpty(s3) ? "" : "\n" + s3;
        synchronized(this.a) {
            zzboz zzboz0 = (zzboz)this.b.remove(s);
            if(zzboz0 == null) {
                zzcfi.zzj(("Received result for unexpected method invocation: " + s));
                return;
            }
            if(!TextUtils.isEmpty(s1)) {
                zzboz0.zza(s2 + s5);
                return;
            }
            if(s4 == null) {
                zzboz0.zzb(null);
                return;
            }
            try {
                JSONObject jSONObject0 = new JSONObject(s4);
                if(zze.zzc()) {
                    zze.zza(("Result GMSG: " + jSONObject0.toString(2)));
                }
                zzboz0.zzb(jSONObject0);
            }
            catch(JSONException jSONException0) {
                zzboz0.zza(jSONException0.getMessage());
            }
        }
    }

    public final zzfvl zzb(zzbrq zzbrq0, String s, JSONObject jSONObject0) {
        zzfvl zzfvl0 = new zzcga();
        this.zzc("1bd09d16-08ee-4bcd-b284-c6bd604f776f", new R1(((zzcga)zzfvl0), 0));
        try {
            JSONObject jSONObject1 = new JSONObject();
            jSONObject1.put("id", "1bd09d16-08ee-4bcd-b284-c6bd604f776f");
            jSONObject1.put("args", jSONObject0);
            zzbrq0.zzl(s, jSONObject1);
        }
        catch(Exception exception0) {
            ((zzcga)zzfvl0).zze(exception0);
        }
        return zzfvl0;
    }

    public final void zzc(String s, zzboz zzboz0) [...] // Potential decryptor
}

