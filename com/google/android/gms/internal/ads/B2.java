package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

public final class b2 implements zzboz {
    public final zzbsg a;
    public final zzcga b;
    public final zzbte c;

    public b2(zzbte zzbte0, zzbsg zzbsg0, zzcga zzcga0) {
        this.c = zzbte0;
        this.a = zzbsg0;
        this.b = zzcga0;
    }

    @Override  // com.google.android.gms.internal.ads.zzboz
    public final void zza(String s) {
        zzbsg zzbsg0;
        try {
            zzcga zzcga0 = this.b;
            zzbsg0 = this.a;
            if(s == null) {
                zzcga0.zze(new zzbsp());
            }
            else {
                zzcga0.zze(new zzbsp(s));
            }
        }
        catch(IllegalStateException unused_ex) {
            zzbsg0.zzb();
        }
        finally {
            zzbsg0.zzb();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzboz
    public final void zzb(JSONObject jSONObject0) {
        zzbsg zzbsg0;
        zzcga zzcga0;
        try {
            zzcga0 = this.b;
            zzbsg0 = this.a;
            zzcga0.zzd(this.c.a.zza(jSONObject0));
        }
        catch(IllegalStateException unused_ex) {
        }
        catch(JSONException jSONException0) {
            zzcga0.zze(jSONException0);
        }
        finally {
            zzbsg0.zzb();
        }
    }
}

