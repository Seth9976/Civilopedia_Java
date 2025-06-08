package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzbhz;
import com.google.android.gms.internal.ads.zzcfi;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzac implements Runnable {
    public final zzas zza;

    public zzac(zzas zzas0) {
        this.zza = zzas0;
    }

    @Override
    public final void run() {
        String s4;
        this.zza.getClass();
        zzaw zzaw0 = zzt.zzs();
        Context context0 = this.zza.a;
        String s = this.zza.d;
        String s1 = this.zza.e;
        zzaw0.getClass();
        String s2 = zzaw.b(context0, zzaw0.c(context0, ((String)zzay.zzc().zzb(zzbhz.zzdL)), s, s1).toString(), s1);
        if(TextUtils.isEmpty(s2)) {
            zzcfi.zze("Not linked for in app preview.");
        }
        else {
            String s3 = s2.trim();
            try {
                JSONObject jSONObject0 = new JSONObject(s3);
                s4 = jSONObject0.optString("gct");
                zzaw0.f = jSONObject0.optString("status");
                if(((Boolean)zzay.zzc().zzb(zzbhz.zzhK)).booleanValue()) {
                    boolean z = "0".equals(zzaw0.f) || "2".equals(zzaw0.f);
                    zzaw0.zzf(z);
                    zzg zzg0 = zzt.zzo().zzh();
                    String s5 = z ? s : "";
                    zzg0.zzA(s5);
                }
                goto label_28;
            }
            catch(JSONException jSONException0) {
            }
            zzcfi.zzk("Fail to get in app preview response json.", jSONException0);
        }
        zzaw.a("In-app preview failed to load because of a system error. Please try again later.", context0, true, true);
        return;
    label_28:
        synchronized(zzaw0.a) {
            zzaw0.c = s4;
        }
        if("2".equals(zzaw0.f)) {
            zzcfi.zze("Creative is not pushed for this device.");
            zzaw.a("There was no creative pushed from DFP to the device.", context0, false, false);
            return;
        }
        if("1".equals(zzaw0.f)) {
            zzcfi.zze("The app is not linked for creative preview.");
            zzaw0.zzd(context0, s, s1);
            return;
        }
        if("0".equals(zzaw0.f)) {
            zzcfi.zze("Device is linked for in app preview.");
            zzaw.a("The device is successfully linked for creative preview.", context0, false, true);
        }
    }
}

