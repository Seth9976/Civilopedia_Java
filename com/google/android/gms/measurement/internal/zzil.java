package com.google.android.gms.measurement.internal;

import android.content.Intent;
import android.content.SharedPreferences.Editor;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import i1.M;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzil implements Runnable {
    public final M zza;
    public final int zzb;
    public final Exception zzc;
    public final byte[] zzd;
    public final Map zze;

    public zzil(M m0, int v, Exception exception0, byte[] arr_b, Map map0) {
        this.zza = m0;
        this.zzb = v;
        this.zzc = exception0;
        this.zzd = arr_b;
        this.zze = map0;
    }

    @Override
    public final void run() {
        int v = this.zzb;
        Exception exception0 = this.zzc;
        byte[] arr_b = this.zzd;
        zzge zzge0 = this.zza.k.zza;
        zzge0.getClass();
        switch(v) {
            case 200: 
            case 204: {
                break;
            }
            case 304: {
                v = 304;
                break;
            }
            default: {
                zzge0.zzay().zzk().zzc("Network Request for Deferred Deep Link failed. response, exception", v, exception0);
                return;
            }
        }
        if(exception0 == null) {
            zzge0.zzm().q.zza(true);
            if(arr_b != null && arr_b.length != 0) {
                try {
                    JSONObject jSONObject0 = new JSONObject(new String(arr_b));
                    String s = jSONObject0.optString("deeplink", "");
                    String s1 = jSONObject0.optString("gclid", "");
                    double f = jSONObject0.optDouble("timestamp", 0.0);
                    if(TextUtils.isEmpty(s)) {
                        zzge0.zzay().zzc().zza("Deferred Deep Link is empty.");
                        return;
                    }
                    zzln zzln0 = zzge0.zzv();
                    if(TextUtils.isEmpty(s)) {
                        zzge0.zzay().zzk().zzc("Deferred Deep Link validation failed. gclid, deep link", s1, s);
                        return;
                    }
                    List list0 = zzln0.a.a.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(s)), 0);
                    if(list0 == null || list0.isEmpty()) {
                        zzge0.zzay().zzk().zzc("Deferred Deep Link validation failed. gclid, deep link", s1, s);
                        return;
                    }
                    Bundle bundle0 = new Bundle();
                    bundle0.putString("gclid", s1);
                    bundle0.putString("_cis", "ddp");
                    zzge0.p.c("auto", "_cmp", bundle0);
                    zzln zzln1 = zzge0.zzv();
                    if(!TextUtils.isEmpty(s)) {
                        try {
                            SharedPreferences.Editor sharedPreferences$Editor0 = zzln1.a.a.getSharedPreferences("google.analytics.deferred.deeplink.prefs", 0).edit();
                            sharedPreferences$Editor0.putString("deeplink", s);
                            sharedPreferences$Editor0.putLong("timestamp", Double.doubleToRawLongBits(f));
                            if(sharedPreferences$Editor0.commit()) {
                                goto label_39;
                            }
                        }
                        catch(RuntimeException runtimeException0) {
                            zzln1.a.zzay().zzd().zzb("Failed to persist Deferred Deep Link. exception", runtimeException0);
                        }
                        return;
                    label_39:
                        Intent intent0 = new Intent("android.google.analytics.action.DEEPLINK_ACTION");
                        zzln1.a.a.sendBroadcast(intent0);
                        return;
                    }
                    return;
                }
                catch(JSONException jSONException0) {
                }
                zzge0.zzay().zzd().zzb("Failed to parse the Deferred Deep Link response. exception", jSONException0);
                return;
            }
            zzge0.zzay().zzc().zza("Deferred Deep Link response empty.");
        }
        else {
            zzge0.zzay().zzk().zzc("Network Request for Deferred Deep Link failed. response, exception", v, exception0);
        }
    }
}

