package com.google.android.gms.ads.internal.util;

import F0.a;
import F0.c;
import android.app.Activity;
import android.content.Context;
import android.net.Uri.Builder;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.util.IOUtils;
import com.google.android.gms.internal.ads.zzbhz;
import com.google.android.gms.internal.ads.zzcfi;
import com.google.android.gms.internal.ads.zzdza;
import com.google.android.gms.internal.ads.zzdzb;
import com.google.android.gms.internal.ads.zzfvl;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzaw {
    public final Object a;
    public String b;
    public String c;
    public boolean d;
    public boolean e;
    public String f;
    public zzdzb g;

    public zzaw() {
        this.a = new Object();
        this.b = "";
        this.c = "";
        this.d = false;
        this.e = false;
        this.f = "";
    }

    public static void a(String s, Context context0, boolean z, boolean z1) {
        if(!(context0 instanceof Activity)) {
            zzcfi.zzi("Can not create dialog without Activity Context");
            return;
        }
        c c0 = new c(s, context0, z, z1);
        zzs.zza.post(c0);
    }

    public static final String b(Context context0, String s, String s1) {
        HashMap hashMap0 = new HashMap();
        hashMap0.put("User-Agent", zzt.zzp().zzc(context0, s1));
        zzfvl zzfvl0 = new zzbo(context0).zzb(0, s, hashMap0, null);
        try {
            return (String)zzfvl0.get(((long)(((int)(((Integer)zzay.zzc().zzb(zzbhz.zzdO)))))), TimeUnit.MILLISECONDS);
        }
        catch(TimeoutException timeoutException0) {
            zzcfi.zzh(("Timeout while retrieving a response from: " + s), timeoutException0);
            zzfvl0.cancel(true);
            return null;
        }
        catch(InterruptedException interruptedException0) {
            zzcfi.zzh(("Interrupted while retrieving a response from: " + s), interruptedException0);
            zzfvl0.cancel(true);
            return null;
        }
        catch(Exception exception0) {
            zzcfi.zzh(("Error retrieving a response from: " + s), exception0);
            return null;
        }
    }

    public final Uri c(Context context0, String s, String s1, String s2) {
        String s3;
        Uri.Builder uri$Builder0 = Uri.parse(s).buildUpon();
        synchronized(this.a) {
            if(TextUtils.isEmpty(this.b)) {
                try {
                    s3 = new String(IOUtils.readInputStreamFully(context0.openFileInput("debug_signals_id.txt"), true), "UTF-8");
                }
                catch(IOException unused_ex) {
                    zzcfi.zze("Error reading from internal storage.");
                    s3 = "";
                }
                this.b = s3;
                if(TextUtils.isEmpty(s3)) {
                    try {
                        this.b = "f1e914b4-315b-48c8-9af3-f5bfc62858a1";
                        FileOutputStream fileOutputStream0 = context0.openFileOutput("debug_signals_id.txt", 0);
                        fileOutputStream0.write("f1e914b4-315b-48c8-9af3-f5bfc62858a1".getBytes("UTF-8"));
                        fileOutputStream0.close();
                    }
                    catch(Exception exception0) {
                        zzcfi.zzh("Error writing to file in internal storage.", exception0);
                    }
                }
            }
        }
        uri$Builder0.appendQueryParameter("linkedDeviceId", this.b);
        uri$Builder0.appendQueryParameter("adSlotPath", s1);
        uri$Builder0.appendQueryParameter("afmaVersion", s2);
        return uri$Builder0.build();
    }

    public final zzdzb zza() {
        return this.g;
    }

    public final String zzb() [...] // Potential decryptor

    public final void zzc(Context context0) {
        if(((Boolean)zzay.zzc().zzb(zzbhz.zzhK)).booleanValue()) {
            zzdzb zzdzb0 = this.g;
            if(zzdzb0 != null) {
                zzdzb0.zzg(new a(this, context0), zzdza.zzd);
            }
        }
    }

    public final void zzd(Context context0, String s, String s1) {
        zzs.zzP(context0, this.c(context0, ((String)zzay.zzc().zzb(zzbhz.zzdK)), s, s1));
    }

    public final void zze(Context context0, String s, String s1, String s2) {
        Uri.Builder uri$Builder0 = this.c(context0, ((String)zzay.zzc().zzb(zzbhz.zzdN)), s2, s).buildUpon();
        uri$Builder0.appendQueryParameter("debugData", s1);
        zzs.zzG(context0, s, uri$Builder0.build().toString());
    }

    public final void zzf(boolean z) {
        synchronized(this.a) {
            this.e = z;
            if(((Boolean)zzay.zzc().zzb(zzbhz.zzhK)).booleanValue()) {
                zzt.zzo().zzh().zzB(z);
                zzdzb zzdzb0 = this.g;
                if(zzdzb0 != null) {
                    zzdzb0.zzi(z);
                }
            }
        }
    }

    public final void zzg(zzdzb zzdzb0) {
        this.g = zzdzb0;
    }

    public final void zzh(boolean z) {
        synchronized(this.a) {
            this.d = z;
        }
    }

    public final boolean zzj(Context context0, String s, String s1) {
        String s4;
        String s2 = zzaw.b(context0, this.c(context0, ((String)zzay.zzc().zzb(zzbhz.zzdM)), s, s1).toString(), s1);
        if(TextUtils.isEmpty(s2)) {
            zzcfi.zze("Not linked for debug signals.");
            return false;
        }
        String s3 = s2.trim();
        try {
            s4 = new JSONObject(s3).optString("debug_mode");
        }
        catch(JSONException jSONException0) {
            zzcfi.zzk("Fail to get debug mode response json.", jSONException0);
            return false;
        }
        boolean z = "1".equals(s4);
        this.zzf(z);
        if(((Boolean)zzay.zzc().zzb(zzbhz.zzhK)).booleanValue()) {
            zzg zzg0 = zzt.zzo().zzh();
            if(!z) {
                s = "";
            }
            zzg0.zzA(s);
        }
        return z;
    }

    public final boolean zzl() {
        synchronized(this.a) {
        }
        return this.e;
    }

    public final boolean zzm() {
        synchronized(this.a) {
        }
        return this.d;
    }

    public final boolean zzn(Context context0, String s, String s1, String s2) {
        if(!TextUtils.isEmpty(s1) && this.zzm()) {
            zzcfi.zze("Sending troubleshooting signals to the server.");
            this.zze(context0, s, s1, s2);
            return true;
        }
        return false;
    }
}

