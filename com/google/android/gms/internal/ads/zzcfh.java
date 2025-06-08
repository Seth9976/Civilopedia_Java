package com.google.android.gms.internal.ads;

import android.content.Context;
import android.provider.Settings.Global;
import android.util.JsonWriter;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import java.io.IOException;
import java.io.StringWriter;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;

public final class zzcfh {
    public final List a;
    public static final Object b = null;
    public static boolean c = false;
    public static boolean d = false;
    public static final Clock e;
    public static final HashSet f;
    public static final int zza;

    static {
        zzcfh.b = new Object();
        zzcfh.e = DefaultClock.getInstance();
        zzcfh.f = new HashSet(Arrays.asList(new String[0]));
    }

    public zzcfh() {
        this(null);
    }

    public zzcfh(String s) {
        List list0 = zzcfh.zzl() ? Arrays.asList(new String[]{"network_request_a63467f4-539a-427a-a16d-990641cfa019"}) : new ArrayList();
        this.a = list0;
    }

    public final void a(String s, F2 f20) {
        StringWriter stringWriter0 = new StringWriter();
        JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
        try {
            jsonWriter0.beginObject();
            jsonWriter0.name("timestamp").value(zzcfh.e.currentTimeMillis());
            jsonWriter0.name("event").value(s);
            jsonWriter0.name("components").beginArray();
            for(Object object0: this.a) {
                jsonWriter0.value(((String)object0));
            }
            jsonWriter0.endArray();
            f20.zza(jsonWriter0);
            jsonWriter0.endObject();
            jsonWriter0.flush();
            jsonWriter0.close();
        }
        catch(IOException iOException0) {
            zzcfi.zzh("unable to log", iOException0);
        }
        String s1 = stringWriter0.toString();
        synchronized(zzcfh.class) {
            zzcfi.zzi("GMA Debug BEGIN");
            for(int v1 = 0; v1 < s1.length(); v1 += 4000) {
                zzcfi.zzi(("GMA Debug CONTENT " + s1.substring(v1, Math.min(v1 + 4000, s1.length()))));
            }
            zzcfi.zzi("GMA Debug FINISH");
        }
    }

    public static void b(JsonWriter jsonWriter0, Map map0) {
        if(map0 == null) {
            return;
        }
        jsonWriter0.name("headers").beginArray();
        for(Object object0: map0.entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object0;
            String s = (String)map$Entry0.getKey();
            if(zzcfh.f.contains(s)) {
            }
            else if(map$Entry0.getValue() instanceof List) {
                for(Object object1: ((List)map$Entry0.getValue())) {
                    jsonWriter0.beginObject();
                    jsonWriter0.name("name").value(s);
                    jsonWriter0.name("value").value(((String)object1));
                    jsonWriter0.endObject();
                }
            }
            else if(map$Entry0.getValue() instanceof String) {
                jsonWriter0.beginObject();
                jsonWriter0.name("name").value(s);
                jsonWriter0.name("value").value(((String)map$Entry0.getValue()));
                jsonWriter0.endObject();
            }
            else {
                zzcfi.zzg("Connection headers should be either Map<String, String> or Map<String, List<String>>");
                if(true) {
                    break;
                }
            }
        }
        jsonWriter0.endArray();
    }

    public final void zzc(HttpURLConnection httpURLConnection0, byte[] arr_b) {
        if(!zzcfh.zzl()) {
            return;
        }
        HashMap hashMap0 = httpURLConnection0.getRequestProperties() == null ? null : new HashMap(httpURLConnection0.getRequestProperties());
        this.a("onNetworkRequest", new zzcfe(new String(httpURLConnection0.getURL().toString()), new String(httpURLConnection0.getRequestMethod()), hashMap0, arr_b));
    }

    public final void zzd(String s, String s1, Map map0, byte[] arr_b) {
        if(!zzcfh.zzl()) {
            return;
        }
        this.a("onNetworkRequest", new zzcfe(s, "GET", map0, arr_b));
    }

    public final void zze(HttpURLConnection httpURLConnection0, int v) {
        String s = null;
        if(!zzcfh.zzl()) {
            return;
        }
        this.a("onNetworkResponse", new zzcfc(v, (httpURLConnection0.getHeaderFields() == null ? null : new HashMap(httpURLConnection0.getHeaderFields()))));
        if(v >= 200 && v < 300) {
            return;
        }
        try {
            s = httpURLConnection0.getResponseMessage();
        }
        catch(IOException iOException0) {
            zzcfi.zzj(("Can not get error message from error HttpURLConnection\n" + iOException0.getMessage()));
        }
        this.a("onNetworkRequestError", new zzcfd(s));
    }

    public final void zzf(Map map0, int v) {
        if(!zzcfh.zzl()) {
            return;
        }
        this.a("onNetworkResponse", new zzcfc(v, map0));
        if(v >= 200 && v < 300) {
            return;
        }
        this.a("onNetworkRequestError", new zzcfd(null));
    }

    public final void zzg(String s) {
        if(!zzcfh.zzl()) {
            return;
        }
        if(s == null) {
            return;
        }
        this.zzh(s.getBytes());
    }

    public final void zzh(byte[] arr_b) {
        this.a("onNetworkResponseBody", new zzcff(arr_b));
    }

    public static void zzi() {
        synchronized(zzcfh.b) {
            zzcfh.c = false;
            zzcfh.d = false;
            zzcfi.zzj("Ad debug logging enablement is out of date.");
        }
    }

    public static void zzj(boolean z) {
        synchronized(zzcfh.b) {
            zzcfh.c = true;
            zzcfh.d = z;
        }
    }

    public static boolean zzk(Context context0) {
        if(!((Boolean)zzbjl.zza.zze()).booleanValue()) {
            return false;
        }
        try {
            if(Settings.Global.getInt(context0.getContentResolver(), "development_settings_enabled", 0) != 0) {
                return true;
            }
        }
        catch(Exception exception0) {
            zzcfi.zzk("Fail to determine debug setting.", exception0);
        }
        return false;
    }

    public static boolean zzl() {
        boolean z = false;
        synchronized(zzcfh.b) {
            if(zzcfh.c && zzcfh.d) {
                z = true;
            }
        }
        return z;
    }

    public static boolean zzm() {
        synchronized(zzcfh.b) {
        }
        return zzcfh.c;
    }
}

