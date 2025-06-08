package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.content.SharedPreferences.Editor;
import android.content.SharedPreferences;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzbbm;
import com.google.android.gms.internal.ads.zzbhz;
import com.google.android.gms.internal.ads.zzbjh;
import com.google.android.gms.internal.ads.zzcel;
import com.google.android.gms.internal.ads.zzcfi;
import com.google.android.gms.internal.ads.zzcfv;
import com.google.android.gms.internal.ads.zzfvl;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzj implements zzg {
    public boolean A;
    public String B;
    public int C;
    public int D;
    public long E;
    public final Object a;
    public boolean b;
    public final ArrayList c;
    public zzfvl d;
    public zzbbm e;
    public SharedPreferences f;
    public SharedPreferences.Editor g;
    public boolean h;
    public String i;
    public String j;
    public boolean k;
    public String l;
    public String m;
    public String n;
    public int o;
    public zzcel p;
    public long q;
    public long r;
    public int s;
    public int t;
    public Set u;
    public JSONObject v;
    public boolean w;
    public boolean x;
    public String y;
    public String z;

    public zzj() {
        this.a = new Object();
        this.c = new ArrayList();
        this.e = null;
        this.h = true;
        this.k = true;
        this.l = "-1";
        this.m = "-1";
        this.n = "-1";
        this.o = -1;
        this.p = new zzcel("", 0L);
        this.q = 0L;
        this.r = 0L;
        this.s = -1;
        this.t = 0;
        this.u = Collections.emptySet();
        this.v = new JSONObject();
        this.w = true;
        this.x = true;
        this.y = null;
        this.z = "";
        this.A = false;
        this.B = "";
        this.C = -1;
        this.D = -1;
        this.E = 0L;
    }

    public final void a() {
        zzfvl zzfvl0 = this.d;
        if(zzfvl0 == null) {
            return;
        }
        if(zzfvl0.isDone()) {
            return;
        }
        try {
            this.d.get(1L, TimeUnit.SECONDS);
        }
        catch(InterruptedException interruptedException0) {
            Thread.currentThread().interrupt();
            zzcfi.zzk("Interrupted while waiting for preferences loaded.", interruptedException0);
        }
        catch(CancellationException | ExecutionException | TimeoutException cancellationException0) {
            zzcfi.zzh("Fail to initialize AdSharedPreferenceManager.", cancellationException0);
        }
    }

    public final void b() {
        zzi zzi0 = () -> {
            if(!this.b) {
                return null;
            }
            if(this.zzM() && this.zzN()) {
                return null;
            }
            if(!((Boolean)zzbjh.zzb.zze()).booleanValue()) {
                return null;
            }
            synchronized(this.a) {
                if(Looper.getMainLooper() == null) {
                    return null;
                }
                if(this.e == null) {
                    this.e = new zzbbm();
                }
                this.e.zze();
                zzcfi.zzi("start fetching content...");
                return this.e;
            }
        };
        zzcfv.zza.execute(zzi0);
    }

    @Override  // com.google.android.gms.ads.internal.util.zzg
    public final void zzA(String s) {
        if(!((Boolean)zzay.zzc().zzb(zzbhz.zzhK)).booleanValue()) {
            return;
        }
        this.a();
        synchronized(this.a) {
            if(this.B.equals(s)) {
                return;
            }
            this.B = s;
            SharedPreferences.Editor sharedPreferences$Editor0 = this.g;
            if(sharedPreferences$Editor0 != null) {
                sharedPreferences$Editor0.putString("linked_ad_unit", s);
                this.g.apply();
            }
            this.b();
        }
    }

    @Override  // com.google.android.gms.ads.internal.util.zzg
    public final void zzB(boolean z) {
        if(!((Boolean)zzay.zzc().zzb(zzbhz.zzhK)).booleanValue()) {
            return;
        }
        this.a();
        synchronized(this.a) {
            if(this.A == z) {
                return;
            }
            this.A = z;
            SharedPreferences.Editor sharedPreferences$Editor0 = this.g;
            if(sharedPreferences$Editor0 != null) {
                sharedPreferences$Editor0.putBoolean("linked_device", z);
                this.g.apply();
            }
            this.b();
        }
    }

    @Override  // com.google.android.gms.ads.internal.util.zzg
    public final void zzC(String s) {
        this.a();
        synchronized(this.a) {
            if(TextUtils.equals(this.y, s)) {
                return;
            }
            this.y = s;
            SharedPreferences.Editor sharedPreferences$Editor0 = this.g;
            if(sharedPreferences$Editor0 != null) {
                sharedPreferences$Editor0.putString("display_cutout", s);
                this.g.apply();
            }
            this.b();
        }
    }

    @Override  // com.google.android.gms.ads.internal.util.zzg
    public final void zzD(long v) {
        this.a();
        synchronized(this.a) {
            if(this.r == v) {
                return;
            }
            this.r = v;
            SharedPreferences.Editor sharedPreferences$Editor0 = this.g;
            if(sharedPreferences$Editor0 != null) {
                sharedPreferences$Editor0.putLong("first_ad_req_time_ms", v);
                this.g.apply();
            }
            this.b();
        }
    }

    @Override  // com.google.android.gms.ads.internal.util.zzg
    public final void zzE(int v) {
        this.a();
        synchronized(this.a) {
            this.o = v;
            SharedPreferences.Editor sharedPreferences$Editor0 = this.g;
            if(sharedPreferences$Editor0 != null) {
                if(v == -1) {
                    sharedPreferences$Editor0.remove("gad_has_consent_for_cookies");
                }
                else {
                    sharedPreferences$Editor0.putInt("gad_has_consent_for_cookies", v);
                }
                this.g.apply();
            }
            this.b();
        }
    }

    @Override  // com.google.android.gms.ads.internal.util.zzg
    public final void zzF(String s, String s1) {
        this.a();
        synchronized(this.a) {
            switch(s) {
                case "IABTCF_PurposeConsents": {
                    this.n = s1;
                    break;
                }
                case "IABTCF_TCString": {
                    this.m = s1;
                    break;
                }
                case "IABTCF_gdprApplies": {
                    this.l = s1;
                    break;
                }
                default: {
                    return;
                }
            }
            if(this.g != null) {
                if(s1.equals("-1")) {
                    this.g.remove(s);
                }
                else {
                    this.g.putString(s, s1);
                }
                this.g.apply();
            }
            this.b();
        }
    }

    @Override  // com.google.android.gms.ads.internal.util.zzg
    public final void zzG(String s) {
        if(!((Boolean)zzay.zzc().zzb(zzbhz.zzhv)).booleanValue()) {
            return;
        }
        this.a();
        synchronized(this.a) {
            if(this.z.equals(s)) {
                return;
            }
            this.z = s;
            SharedPreferences.Editor sharedPreferences$Editor0 = this.g;
            if(sharedPreferences$Editor0 != null) {
                sharedPreferences$Editor0.putString("inspector_info", s);
                this.g.apply();
            }
            this.b();
        }
    }

    @Override  // com.google.android.gms.ads.internal.util.zzg
    public final void zzH(boolean z) {
        this.a();
        synchronized(this.a) {
            if(z == this.k) {
                return;
            }
            this.k = z;
            SharedPreferences.Editor sharedPreferences$Editor0 = this.g;
            if(sharedPreferences$Editor0 != null) {
                sharedPreferences$Editor0.putBoolean("gad_idless", z);
                this.g.apply();
            }
            this.b();
        }
    }

    @Override  // com.google.android.gms.ads.internal.util.zzg
    public final void zzI(String s, String s1, boolean z) {
        this.a();
        synchronized(this.a) {
            JSONArray jSONArray0 = this.v.optJSONArray(s);
            if(jSONArray0 == null) {
                jSONArray0 = new JSONArray();
            }
            int v1 = jSONArray0.length();
            for(int v2 = 0; v2 < jSONArray0.length(); ++v2) {
                JSONObject jSONObject0 = jSONArray0.optJSONObject(v2);
                if(jSONObject0 == null) {
                    return;
                }
                if(s1.equals(jSONObject0.optString("template_id"))) {
                    if(z && jSONObject0.optBoolean("uses_media_view", false)) {
                        return;
                    }
                    v1 = v2;
                    break;
                }
            }
            try {
                JSONObject jSONObject1 = new JSONObject();
                jSONObject1.put("template_id", s1);
                jSONObject1.put("uses_media_view", z);
                jSONObject1.put("timestamp_ms", zzt.zzA().currentTimeMillis());
                jSONArray0.put(v1, jSONObject1);
                this.v.put(s, jSONArray0);
            }
            catch(JSONException jSONException0) {
                zzcfi.zzk("Could not update native advanced settings", jSONException0);
            }
            SharedPreferences.Editor sharedPreferences$Editor0 = this.g;
            if(sharedPreferences$Editor0 != null) {
                sharedPreferences$Editor0.putString("native_advanced_settings", this.v.toString());
                this.g.apply();
            }
            this.b();
        }
    }

    @Override  // com.google.android.gms.ads.internal.util.zzg
    public final void zzJ(int v) {
        this.a();
        synchronized(this.a) {
            if(this.s == v) {
                return;
            }
            this.s = v;
            SharedPreferences.Editor sharedPreferences$Editor0 = this.g;
            if(sharedPreferences$Editor0 != null) {
                sharedPreferences$Editor0.putInt("request_in_session_count", v);
                this.g.apply();
            }
            this.b();
        }
    }

    @Override  // com.google.android.gms.ads.internal.util.zzg
    public final void zzK(int v) {
        this.a();
        synchronized(this.a) {
            if(this.D == v) {
                return;
            }
            this.D = v;
            SharedPreferences.Editor sharedPreferences$Editor0 = this.g;
            if(sharedPreferences$Editor0 != null) {
                sharedPreferences$Editor0.putInt("sd_app_measure_npa", v);
                this.g.apply();
            }
            this.b();
        }
    }

    @Override  // com.google.android.gms.ads.internal.util.zzg
    public final void zzL(long v) {
        this.a();
        synchronized(this.a) {
            if(this.E == v) {
                return;
            }
            this.E = v;
            SharedPreferences.Editor sharedPreferences$Editor0 = this.g;
            if(sharedPreferences$Editor0 != null) {
                sharedPreferences$Editor0.putLong("sd_app_measure_npa_ts", v);
                this.g.apply();
            }
            this.b();
        }
    }

    @Override  // com.google.android.gms.ads.internal.util.zzg
    public final boolean zzM() {
        this.a();
        synchronized(this.a) {
        }
        return this.w;
    }

    @Override  // com.google.android.gms.ads.internal.util.zzg
    public final boolean zzN() {
        this.a();
        synchronized(this.a) {
        }
        return this.x;
    }

    @Override  // com.google.android.gms.ads.internal.util.zzg
    public final boolean zzO() {
        this.a();
        synchronized(this.a) {
        }
        return this.A;
    }

    @Override  // com.google.android.gms.ads.internal.util.zzg
    public final boolean zzP() {
        if(!((Boolean)zzay.zzc().zzb(zzbhz.zzar)).booleanValue()) {
            return false;
        }
        this.a();
        return this.k;
    }

    @Override  // com.google.android.gms.ads.internal.util.zzg
    public final int zza() {
        this.a();
        synchronized(this.a) {
        }
        return this.t;
    }

    @Override  // com.google.android.gms.ads.internal.util.zzg
    public final int zzb() {
        this.a();
        synchronized(this.a) {
        }
        return this.o;
    }

    @Override  // com.google.android.gms.ads.internal.util.zzg
    public final int zzc() {
        this.a();
        synchronized(this.a) {
        }
        return this.s;
    }

    @Override  // com.google.android.gms.ads.internal.util.zzg
    public final long zzd() {
        this.a();
        synchronized(this.a) {
        }
        return this.q;
    }

    @Override  // com.google.android.gms.ads.internal.util.zzg
    public final long zze() {
        this.a();
        synchronized(this.a) {
        }
        return this.r;
    }

    @Override  // com.google.android.gms.ads.internal.util.zzg
    public final long zzf() {
        this.a();
        synchronized(this.a) {
        }
        return this.E;
    }

    // 检测为 lambda 实现。
    @Override  // com.google.android.gms.ads.internal.util.zzg
    public final zzbbm zzg() {
        if(!this.b) {
            return null;
        }
        if(this.zzM() && this.zzN()) {
            return null;
        }
        if(!((Boolean)zzbjh.zzb.zze()).booleanValue()) {
            return null;
        }
        synchronized(this.a) {
            if(Looper.getMainLooper() == null) {
                return null;
            }
            if(this.e == null) {
                this.e = new zzbbm();
            }
            this.e.zze();
            zzcfi.zzi("start fetching content...");
            return this.e;
        }
    }

    @Override  // com.google.android.gms.ads.internal.util.zzg
    public final zzcel zzh() {
        this.a();
        synchronized(this.a) {
        }
        return this.p;
    }

    @Override  // com.google.android.gms.ads.internal.util.zzg
    public final zzcel zzi() {
        synchronized(this.a) {
        }
        return this.p;
    }

    @Override  // com.google.android.gms.ads.internal.util.zzg
    public final String zzj() {
        this.a();
        synchronized(this.a) {
        }
        return this.i;
    }

    @Override  // com.google.android.gms.ads.internal.util.zzg
    public final String zzk() {
        this.a();
        synchronized(this.a) {
        }
        return this.j;
    }

    @Override  // com.google.android.gms.ads.internal.util.zzg
    public final String zzl() {
        this.a();
        synchronized(this.a) {
        }
        return this.B;
    }

    @Override  // com.google.android.gms.ads.internal.util.zzg
    public final String zzm() {
        this.a();
        synchronized(this.a) {
        }
        return this.y;
    }

    @Override  // com.google.android.gms.ads.internal.util.zzg
    public final String zzn(String s) {
        this.a();
        Object object0 = this.a;
        __monitor_enter(object0);
        switch(s) {
            case "IABTCF_PurposeConsents": {
                __monitor_exit(object0);
                return this.n;
            }
            case "IABTCF_TCString": {
                __monitor_exit(object0);
                return this.m;
            }
            case "IABTCF_gdprApplies": {
                __monitor_exit(object0);
                return this.l;
            }
            default: {
                __monitor_exit(object0);
                return null;
            }
        }
    }

    @Override  // com.google.android.gms.ads.internal.util.zzg
    public final String zzo() {
        this.a();
        synchronized(this.a) {
        }
        return this.z;
    }

    @Override  // com.google.android.gms.ads.internal.util.zzg
    public final JSONObject zzp() {
        this.a();
        synchronized(this.a) {
        }
        return this.v;
    }

    @Override  // com.google.android.gms.ads.internal.util.zzg
    public final void zzq(Runnable runnable0) {
        this.c.add(runnable0);
    }

    @Override  // com.google.android.gms.ads.internal.util.zzg
    public final void zzr(Context context0) {
        synchronized(this.a) {
            if(this.f != null) {
                return;
            }
        }
        zzh zzh0 = new zzh(this, context0, "admob");
        this.d = zzcfv.zza.zza(zzh0);
        this.b = true;
    }

    @Override  // com.google.android.gms.ads.internal.util.zzg
    public final void zzs() {
        this.a();
        synchronized(this.a) {
            this.v = new JSONObject();
            SharedPreferences.Editor sharedPreferences$Editor0 = this.g;
            if(sharedPreferences$Editor0 != null) {
                sharedPreferences$Editor0.remove("native_advanced_settings");
                this.g.apply();
            }
            this.b();
        }
    }

    @Override  // com.google.android.gms.ads.internal.util.zzg
    public final void zzt(long v) {
        this.a();
        synchronized(this.a) {
            if(this.q == v) {
                return;
            }
            this.q = v;
            SharedPreferences.Editor sharedPreferences$Editor0 = this.g;
            if(sharedPreferences$Editor0 != null) {
                sharedPreferences$Editor0.putLong("app_last_background_time_ms", v);
                this.g.apply();
            }
            this.b();
        }
    }

    @Override  // com.google.android.gms.ads.internal.util.zzg
    public final void zzu(String s) {
        this.a();
        synchronized(this.a) {
            long v1 = zzt.zzA().currentTimeMillis();
            if(s != null && !s.equals(this.p.zzc())) {
                this.p = new zzcel(s, v1);
                SharedPreferences.Editor sharedPreferences$Editor0 = this.g;
                if(sharedPreferences$Editor0 != null) {
                    sharedPreferences$Editor0.putString("app_settings_json", s);
                    this.g.putLong("app_settings_last_update_ms", v1);
                    this.g.apply();
                }
                this.b();
                for(Object object1: this.c) {
                    ((Runnable)object1).run();
                }
                return;
            }
            this.p.zzg(v1);
        }
    }

    @Override  // com.google.android.gms.ads.internal.util.zzg
    public final void zzv(int v) {
        this.a();
        synchronized(this.a) {
            if(this.t == v) {
                return;
            }
            this.t = v;
            SharedPreferences.Editor sharedPreferences$Editor0 = this.g;
            if(sharedPreferences$Editor0 != null) {
                sharedPreferences$Editor0.putInt("version_code", v);
                this.g.apply();
            }
            this.b();
        }
    }

    @Override  // com.google.android.gms.ads.internal.util.zzg
    public final void zzw(String s) {
        this.a();
        synchronized(this.a) {
            if(s.equals(this.i)) {
                return;
            }
            this.i = s;
            SharedPreferences.Editor sharedPreferences$Editor0 = this.g;
            if(sharedPreferences$Editor0 != null) {
                sharedPreferences$Editor0.putString("content_url_hashes", s);
                this.g.apply();
            }
            this.b();
        }
    }

    @Override  // com.google.android.gms.ads.internal.util.zzg
    public final void zzx(boolean z) {
        this.a();
        synchronized(this.a) {
            if(this.w == z) {
                return;
            }
            this.w = z;
            SharedPreferences.Editor sharedPreferences$Editor0 = this.g;
            if(sharedPreferences$Editor0 != null) {
                sharedPreferences$Editor0.putBoolean("content_url_opted_out", z);
                this.g.apply();
            }
            this.b();
        }
    }

    @Override  // com.google.android.gms.ads.internal.util.zzg
    public final void zzy(String s) {
        this.a();
        synchronized(this.a) {
            if(s.equals(this.j)) {
                return;
            }
            this.j = s;
            SharedPreferences.Editor sharedPreferences$Editor0 = this.g;
            if(sharedPreferences$Editor0 != null) {
                sharedPreferences$Editor0.putString("content_vertical_hashes", s);
                this.g.apply();
            }
            this.b();
        }
    }

    @Override  // com.google.android.gms.ads.internal.util.zzg
    public final void zzz(boolean z) {
        this.a();
        synchronized(this.a) {
            if(this.x == z) {
                return;
            }
            this.x = z;
            SharedPreferences.Editor sharedPreferences$Editor0 = this.g;
            if(sharedPreferences$Editor0 != null) {
                sharedPreferences$Editor0.putBoolean("content_vertical_opted_out", z);
                this.g.apply();
            }
            this.b();
        }
    }
}

