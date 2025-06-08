package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzdyg implements Runnable {
    public final S4 zza;
    public final String zzb;

    public zzdyg(S4 s40, String s) {
        this.zza = s40;
        this.zzb = s;
    }

    @Override
    public final void run() {
        zzfhh zzfhh3;
        zzfvb zzfvb0;
        ArrayList arrayList1;
        JSONObject jSONObject1;
        T4 t40;
        long v;
        zzfhh zzfhh2;
        Long long0;
        zzcga zzcga0;
        Object object1;
        zzfhh zzfhh1;
        String s;
        Executor executor0;
        Iterator iterator0;
        JSONObject jSONObject0;
        ArrayList arrayList0;
        zzdyj zzdyj0 = this.zza.i;
        zzdik zzdik0 = zzdyj0.o;
        zzdwq zzdwq0 = zzdyj0.l;
        Context context0 = zzdyj0.f;
        zzfhh zzfhh0 = zzfhg.zza(context0, 5);
        zzfhh0.zzf();
        try {
            arrayList0 = new ArrayList();
            jSONObject0 = new JSONObject(this.zzb).getJSONObject("initializer_settings").getJSONObject("config");
            iterator0 = jSONObject0.keys();
            while(true) {
            label_9:
                boolean z = iterator0.hasNext();
                executor0 = zzdyj0.i;
                if(z) {
                    break;
                }
                zzfhh2 = zzfhh0;
                zzfvb0 = zzfvc.zza(arrayList0);
                zzfhh3 = zzfhh2;
                goto label_78;
            }
        }
        catch(JSONException jSONException0) {
            zzfhh3 = zzfhh0;
            goto label_81;
        }
        try {
            Object object0 = iterator0.next();
            s = (String)object0;
            zzfhh1 = zzfhg.zza(context0, 5);
            zzfhh1.zzf();
            zzfhh1.zzc(s);
            object1 = new Object();
            zzcga0 = new zzcga();
            long0 = (Long)zzay.zzc().zzb(zzbhz.zzbz);
        }
        catch(JSONException jSONException0) {
            try {
                zzfhh2 = zzfhh0;
            }
            catch(JSONException jSONException0) {
            }
            zzfhh3 = zzfhh2;
            goto label_81;
        }
        try {
            v = (long)long0;
            goto label_29;
        }
        catch(JSONException jSONException0) {
            try {
                zzfhh2 = zzfhh0;
                zzfhh3 = zzfhh2;
                goto label_81;
            label_29:
                zzfvl zzfvl0 = zzfvc.zzo(zzcga0, v, TimeUnit.SECONDS, zzdyj0.k);
                zzdwq0.zzc(s);
                zzdik0.zzc(s);
                zzfhh2 = zzfhh0;
                long v1 = zzt.zzA().elapsedRealtime();
                zzfhh2 = zzfhh0;
                zzfvl0.zzc(new zzdya(zzdyj0, object1, zzcga0, s, v1, zzfhh1), executor0);
                arrayList0.add(zzfvl0);
                t40 = new T4(zzdyj0, object1, zzcga0, s, v1, zzfhh1);
                jSONObject1 = jSONObject0.optJSONObject(s);
                arrayList1 = new ArrayList();
                if(jSONObject1 != null) {
                    goto label_41;
                }
                goto label_57;
            }
            catch(JSONException jSONException0) {
                zzfhh3 = zzfhh2;
                goto label_81;
            }
        }
        try {
        label_41:
            JSONArray jSONArray0 = jSONObject1.getJSONArray("data");
            int v2 = 0;
            while(true) {
                if(v2 >= jSONArray0.length()) {
                    goto label_57;
                }
                JSONObject jSONObject2 = jSONArray0.getJSONObject(v2);
                String s1 = jSONObject2.optString("format", "");
                JSONObject jSONObject3 = jSONObject2.optJSONObject("data");
                Bundle bundle0 = new Bundle();
                if(jSONObject3 != null) {
                    Iterator iterator1 = jSONObject3.keys();
                    while(iterator1.hasNext()) {
                        Object object2 = iterator1.next();
                        bundle0.putString(((String)object2), jSONObject3.optString(((String)object2), ""));
                    }
                }
                arrayList1.add(new zzbqq(s1, bundle0));
                ++v2;
            }
        }
        catch(JSONException unused_ex) {
            try {
            label_57:
                zzdyj0.b(s, 0, "", false);
                try {
                    JSONObject jSONObject4 = new JSONObject();
                    zzdye zzdye0 = new zzdye(zzdyj0, zzdyj0.h.zzc(s, jSONObject4), t40, arrayList1, s);
                    zzdyj0.j.execute(zzdye0);
                }
                catch(zzfci unused_ex) {
                    try {
                        t40.zze("Failed to create Adapter.");
                    }
                    catch(RemoteException remoteException0) {
                        zzcfi.zzh("", remoteException0);
                    }
                }
            }
            catch(JSONException jSONException0) {
                zzfhh3 = zzfhh2;
                goto label_81;
            }
            try {
                zzfhh0 = zzfhh2;
                goto label_9;
            }
            catch(JSONException jSONException0) {
            }
        }
        zzfhh3 = zzfhh0;
        goto label_81;
        try {
            zzfhh2 = zzfhh0;
            zzfvb0 = zzfvc.zza(arrayList0);
            zzfhh3 = zzfhh2;
            goto label_78;
        }
        catch(JSONException jSONException0) {
        }
        zzfhh3 = zzfhh2;
        goto label_81;
        try {
        label_78:
            zzfvb0.zza(new zzdyb(zzdyj0, zzfhh3), executor0);
            return;
        }
        catch(JSONException jSONException0) {
        }
    label_81:
        zze.zzb("Malformed CLD response", jSONException0);
        zzdik0.zza("MalformedJson");
        zzdwq0.zza("MalformedJson");
        zzdyj0.e.zze(jSONException0);
        zzt.zzo().zzt(jSONException0, "AdapterInitializer.updateAdapterStatus");
        zzfhh3.zze(false);
        zzfhl zzfhl0 = zzfhh3.zzj();
        zzdyj0.p.zzb(zzfhl0);
    }
}

