package com.google.android.gms.internal.measurement;

import H.a;
import android.content.ContentResolver;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.StrictMode.ThreadPolicy;
import android.os.StrictMode;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import p.b;
import p.j;

public final class zzhe implements C {
    public final ContentResolver a;
    public final Uri b;
    public final Runnable c;
    public final a d;
    public final Object e;
    public volatile Map f;
    public final ArrayList g;
    public static final b h;
    public static final String[] zza;

    static {
        zzhe.h = new b();  // 初始化器: Lp/k;-><init>()V
        zzhe.zza = new String[]{"key", "value"};
    }

    public zzhe(ContentResolver contentResolver0, Uri uri0, Runnable runnable0) {
        a a0 = new a(this);
        this.d = a0;
        this.e = new Object();
        this.g = new ArrayList();
        contentResolver0.getClass();
        uri0.getClass();
        this.a = contentResolver0;
        this.b = uri0;
        this.c = runnable0;
        contentResolver0.registerContentObserver(uri0, false, a0);
    }

    public static void a() {
        synchronized(zzhe.class) {
            for(Object object0: ((j)zzhe.h.values())) {
                ((zzhe)object0).a.unregisterContentObserver(((zzhe)object0).d);
            }
            zzhe.h.clear();
        }
    }

    public static zzhe zza(ContentResolver contentResolver0, Uri uri0, Runnable runnable0) {
        synchronized(zzhe.class) {
            b b0 = zzhe.h;
            zzhe zzhe0 = (zzhe)b0.getOrDefault(uri0, null);
            if(zzhe0 == null) {
                try {
                    zzhe zzhe1 = new zzhe(contentResolver0, uri0, runnable0);
                    try {
                        b0.put(uri0, zzhe1);
                    }
                    catch(SecurityException unused_ex) {
                    }
                    zzhe0 = zzhe1;
                }
                catch(SecurityException unused_ex) {
                }
            }
            return zzhe0;
        }
    }

    @Override  // com.google.android.gms.internal.measurement.C
    public final Object zzb(String s) {
        return (String)this.zzc().get(s);
    }

    public final Map zzc() {
        Map map1;
        StrictMode.ThreadPolicy strictMode$ThreadPolicy0;
        Map map0 = this.f;
        if(map0 == null) {
            synchronized(this.e) {
                map0 = this.f;
                if(map0 == null) {
                    strictMode$ThreadPolicy0 = StrictMode.allowThreadDiskReads();
                    map1 = (Map)zzhh.zza(new zzhc(this));
                    goto label_16;
                }
                return map0 == null ? Collections.emptyMap() : map0;
            }
            try {
                try {
                    map1 = (Map)zzhh.zza(new zzhc(this));
                    goto label_16;
                }
                catch(SecurityException | SQLiteException | IllegalStateException unused_ex) {
                }
                Log.e("ConfigurationContentLdr", "PhenotypeFlag unable to load ContentProvider, using default values");
            }
            catch(Throwable throwable1) {
                StrictMode.setThreadPolicy(strictMode$ThreadPolicy0);
                throw throwable1;
            }
            StrictMode.setThreadPolicy(strictMode$ThreadPolicy0);
            map1 = null;
            this.f = map1;
            map0 = map1;
            return map0 == null ? Collections.emptyMap() : map0;
        label_16:
            StrictMode.setThreadPolicy(strictMode$ThreadPolicy0);
            this.f = map1;
            map0 = map1;
        }
        return map0 == null ? Collections.emptyMap() : map0;
    }

    public final void zzf() {
        synchronized(this.e) {
            this.f = null;
            this.c.run();
        }
        synchronized(this) {
            for(Object object0: this.g) {
                ((zzhf)object0).zza();
            }
        }
    }
}

