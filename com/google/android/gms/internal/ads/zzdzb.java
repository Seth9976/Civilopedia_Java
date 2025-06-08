package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzcy;
import com.google.android.gms.ads.internal.zzt;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import jeb.synthetic.FIN;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzdzb implements zzdym, zzdzj {
    public final zzdzi a;
    public final zzdzk b;
    public final zzdyn c;
    public final zzdyw d;
    public final zzdyl e;
    public final String f;
    public final HashMap g;
    public String h;
    public String i;
    public long j;
    public zzdyx k;
    public boolean l;
    public int m;
    public boolean n;
    public zzdza o;

    public zzdzb(zzdzi zzdzi0, zzdzk zzdzk0, zzdyn zzdyn0, Context context0, zzcfo zzcfo0, zzdyw zzdyw0) {
        this.h = "{}";
        this.i = "";
        this.j = 0x7FFFFFFFFFFFFFFFL;
        this.k = zzdyx.zza;
        this.o = zzdza.zza;
        this.a = zzdzi0;
        this.b = zzdzk0;
        this.c = zzdyn0;
        this.g = new HashMap();
        this.e = new zzdyl(context0);
        this.f = zzcfo0.zza;
        this.d = zzdyw0;
        zzt.zzs().zzg(this);
    }

    public final JSONObject a() {
        synchronized(this) {
            JSONObject jSONObject0 = new JSONObject();
            for(Object object0: this.g.entrySet()) {
                Map.Entry map$Entry0 = (Map.Entry)object0;
                JSONArray jSONArray0 = new JSONArray();
                for(Object object1: ((List)map$Entry0.getValue())) {
                    zzdyp zzdyp0 = (zzdyp)object1;
                    if(zzdyp0.zzd()) {
                        jSONArray0.put(zzdyp0.zzc());
                    }
                }
                if(jSONArray0.length() > 0) {
                    jSONObject0.put(((String)map$Entry0.getKey()), jSONArray0);
                }
            }
            return jSONObject0;
        }
    }

    public final void b() {
        this.n = true;
        this.d.zzc();
        this.a.zzg(this);
        this.b.zzc(this);
        this.c.zzc(this);
        String s = zzt.zzo().zzh().zzo();
        synchronized(this) {
            if(TextUtils.isEmpty(s)) {
                return;
            }
            try {
                JSONObject jSONObject0 = new JSONObject(s);
                this.d(jSONObject0.optBoolean("isTestMode", false), false);
                this.c(zzdyx.zza(jSONObject0.optString("gesture", "NONE")), false);
                this.h = jSONObject0.optString("networkExtras", "{}");
                this.j = jSONObject0.optLong("networkExtrasExpirationSecs", 0x7FFFFFFFFFFFFFFFL);
            }
            catch(JSONException unused_ex) {
            }
        }
    }

    public final void c(zzdyx zzdyx0, boolean z) {
        synchronized(this) {
            if(this.k == zzdyx0) {
                return;
            }
            if(this.zzm()) {
                this.e();
            }
            this.k = zzdyx0;
            if(this.zzm()) {
                this.f();
            }
            if(z) {
                zzt.zzo().zzh().zzG(this.zzc());
            }
        }
    }

    public final void d(boolean z, boolean z1) {
        synchronized(this) {
            if(this.l == z) {
                return;
            }
            this.l = z;
            if(z && (!((Boolean)zzay.zzc().zzb(zzbhz.zzhK)).booleanValue() || !zzt.zzs().zzl())) {
                this.f();
            }
            else if(!this.zzm()) {
                this.e();
            }
            if(z1) {
                zzt.zzo().zzh().zzG(this.zzc());
            }
        }
    }

    public final void e() {
        __monitor_enter(this);
        int v = FIN.finallyOpen$NT();
        switch(this.k.ordinal()) {
            case 1: {
                this.b.zza();
                FIN.finallyExec$NT(v);
                return;
            }
            case 2: {
                this.c.zza();
                FIN.finallyExec$NT(v);
                return;
            }
            default: {
                FIN.finallyCodeBegin$NT(v);
                __monitor_exit(this);
                FIN.finallyCodeEnd$NT(v);
            }
        }
    }

    public final void f() {
        __monitor_enter(this);
        int v = FIN.finallyOpen$NT();
        switch(this.k.ordinal()) {
            case 1: {
                this.b.zzb();
                FIN.finallyExec$NT(v);
                return;
            }
            case 2: {
                this.c.zzb();
                FIN.finallyExec$NT(v);
                return;
            }
            default: {
                FIN.finallyCodeBegin$NT(v);
                __monitor_exit(this);
                FIN.finallyCodeEnd$NT(v);
            }
        }
    }

    public final zzdyx zza() {
        return this.k;
    }

    public final String zzb() {
        synchronized(this) {
            if(((Boolean)zzay.zzc().zzb(zzbhz.zzhv)).booleanValue() && this.zzm()) {
                if(this.j < zzt.zzA().currentTimeMillis() / 1000L) {
                    this.h = "{}";
                    this.j = 0x7FFFFFFFFFFFFFFFL;
                    return "";
                }
                return this.h.equals("{}") ? "" : this.h;
            }
            return "";
        }
    }

    public final String zzc() {
        JSONObject jSONObject0;
        synchronized(this) {
            jSONObject0 = new JSONObject();
            try {
                jSONObject0.put("isTestMode", this.l);
                jSONObject0.put("gesture", this.k);
                if(this.j > zzt.zzA().currentTimeMillis() / 1000L) {
                    jSONObject0.put("networkExtras", this.h);
                    jSONObject0.put("networkExtrasExpirationSecs", this.j);
                }
            }
            catch(JSONException unused_ex) {
            }
        }
        return jSONObject0.toString();
    }

    public final JSONObject zzd() {
        synchronized(this) {
            JSONObject jSONObject0 = new JSONObject();
            try {
                jSONObject0.put("platform", "ANDROID");
                jSONObject0.put("internalSdkVersion", this.f);
                jSONObject0.put("adapters", this.d.zza());
                if(this.j < zzt.zzA().currentTimeMillis() / 1000L) {
                    this.h = "{}";
                }
                jSONObject0.put("networkExtras", this.h);
                jSONObject0.put("adSlots", this.a());
                jSONObject0.put("appInfo", this.e.zza());
                String s = zzt.zzo().zzh().zzh().zzc();
                if(!TextUtils.isEmpty(s)) {
                    jSONObject0.put("cld", new JSONObject(s));
                }
                if(((Boolean)zzay.zzc().zzb(zzbhz.zzhL)).booleanValue() && !TextUtils.isEmpty(this.i)) {
                    zzcfi.zze(("Policy violation data: " + this.i));
                    jSONObject0.put("policyViolations", new JSONObject(this.i));
                }
                if(((Boolean)zzay.zzc().zzb(zzbhz.zzhK)).booleanValue()) {
                    jSONObject0.put("openAction", this.o);
                    jSONObject0.put("gesture", this.k);
                }
            }
            catch(JSONException jSONException0) {
                zzt.zzo().zzs(jSONException0, "Inspector.toJson");
                zzcfi.zzk("Ad inspector encountered an error", jSONException0);
            }
            return jSONObject0;
        }
    }

    public final void zze(String s, zzdyp zzdyp0) {
        synchronized(this) {
            if(((Boolean)zzay.zzc().zzb(zzbhz.zzhv)).booleanValue() && this.zzm()) {
                if(this.m >= ((int)(((Integer)zzay.zzc().zzb(zzbhz.zzhx))))) {
                    zzcfi.zzj("Maximum number of ad requests stored reached. Dropping the current request.");
                    return;
                }
                if(!this.g.containsKey(s)) {
                    ArrayList arrayList0 = new ArrayList();
                    this.g.put(s, arrayList0);
                }
                ++this.m;
                ((List)this.g.get(s)).add(zzdyp0);
            }
        }
    }

    public final void zzf() {
        if(!((Boolean)zzay.zzc().zzb(zzbhz.zzhv)).booleanValue()) {
            return;
        }
        if(((Boolean)zzay.zzc().zzb(zzbhz.zzhK)).booleanValue() && zzt.zzo().zzh().zzO()) {
            this.b();
            return;
        }
        String s = zzt.zzo().zzh().zzo();
        if(TextUtils.isEmpty(s)) {
            return;
        }
        try {
            if(new JSONObject(s).optBoolean("isTestMode", false)) {
                this.b();
            }
        }
        catch(JSONException unused_ex) {
        }
    }

    public final void zzg(zzcy zzcy0, zzdza zzdza0) {
        synchronized(this) {
            if(!this.zzm()) {
                try {
                    zzcy0.zze(zzfdc.zzd(18, null, null));
                }
                catch(RemoteException unused_ex) {
                    zzcfi.zzj("Ad inspector cannot be opened because the device is not in test mode. See https://developers.google.com/admob/android/test-ads#enable_test_devices for more information.");
                    return;
                }
                return;
            }
            if(!((Boolean)zzay.zzc().zzb(zzbhz.zzhv)).booleanValue()) {
                try {
                    zzcy0.zze(zzfdc.zzd(1, null, null));
                }
                catch(RemoteException unused_ex) {
                    zzcfi.zzj("Ad inspector had an internal error.");
                }
                return;
            }
            this.o = zzdza0;
            zzbon zzbon0 = new zzbon(this);
            this.a.zzi(zzcy0, zzbon0);
        }
    }

    public final void zzh(String s, long v) {
        synchronized(this) {
            this.h = s;
            this.j = v;
            zzt.zzo().zzh().zzG(this.zzc());
        }
    }

    public final void zzi(boolean z) {
        if(this.n) {
            if(z) {
            label_5:
                if(!this.l) {
                    this.f();
                    return;
                }
            }
        }
        else if(z) {
            this.b();
            goto label_5;
        }
        if(!this.zzm()) {
            this.e();
        }
    }

    public final void zzj(zzdyx zzdyx0) {
        this.c(zzdyx0, true);
    }

    public final void zzk(String s) {
        synchronized(this) {
            this.i = s;
        }
    }

    public final void zzl(boolean z) {
        if(!this.n && z) {
            this.b();
        }
        this.d(z, true);
    }

    public final boolean zzm() {
        synchronized(this) {
            if(((Boolean)zzay.zzc().zzb(zzbhz.zzhK)).booleanValue()) {
                return !this.l && !zzt.zzs().zzl() ? false : true;
            }
            return this.l;
        }
    }

    public final boolean zzn() {
        synchronized(this) {
        }
        return this.l;
    }
}

