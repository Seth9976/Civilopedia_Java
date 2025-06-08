package com.google.android.gms.internal.measurement;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;
import jeb.synthetic.TWR;

public final class zzgz {
    public static final AtomicBoolean a;
    public static HashMap b;
    public static final HashMap c;
    public static final HashMap d;
    public static final HashMap e;
    public static final HashMap f;
    public static Object g;
    public static final String[] h;
    public static final Uri zza;
    public static final Uri zzb;
    public static final Pattern zzc;
    public static final Pattern zzd;

    static {
        zzgz.zza = Uri.parse("content://com.google.android.gsf.gservices");
        zzgz.zzb = Uri.parse("content://com.google.android.gsf.gservices/prefix");
        zzgz.zzc = Pattern.compile("^(1|true|t|on|yes|y)$", 2);
        zzgz.zzd = Pattern.compile("^(0|false|f|off|no|n)$", 2);
        zzgz.a = new AtomicBoolean();
        zzgz.c = new HashMap();
        zzgz.d = new HashMap();
        zzgz.e = new HashMap();
        zzgz.f = new HashMap();
        zzgz.h = new String[0];
    }

    public static void a(String s, String s1, Object object0) {
        synchronized(zzgz.class) {
            if(object0 == zzgz.g) {
                zzgz.b.put(s, s1);
            }
        }
    }

    public static String zza(ContentResolver contentResolver0, String s, String s1) {
        Object object0;
        String s4;
        String s2 = null;
        synchronized(zzgz.class) {
            if(zzgz.b == null) {
                zzgz.a.set(false);
                zzgz.b = new HashMap();
                zzgz.g = new Object();
                A a0 = new A(null, 0);
                contentResolver0.registerContentObserver(zzgz.zza, true, a0);
            }
            else if(zzgz.a.getAndSet(false)) {
                zzgz.b.clear();
                zzgz.c.clear();
                zzgz.d.clear();
                zzgz.e.clear();
                zzgz.f.clear();
                zzgz.g = new Object();
            }
            object0 = zzgz.g;
            if(zzgz.b.containsKey(s)) {
                String s3 = (String)zzgz.b.get(s);
                if(s3 != null) {
                    s2 = s3;
                }
                return s2;
            }
        }
        Cursor cursor0 = contentResolver0.query(zzgz.zza, null, null, new String[]{s}, null);
        if(cursor0 == null) {
            return null;
        }
        try {
            if(cursor0.moveToFirst()) {
                s4 = cursor0.getString(1);
                if(s4 != null && s4.equals(null)) {
                    s4 = null;
                }
                zzgz.a(s, s4, object0);
                if(s4 != null) {
                    goto label_37;
                }
                goto label_38;
            }
            goto label_40;
        }
        catch(Throwable throwable0) {
            goto label_43;
        }
    label_37:
        s2 = s4;
    label_38:
        cursor0.close();
        return s2;
        try {
        label_40:
            zzgz.a(s, null, object0);
        }
        catch(Throwable throwable0) {
        label_43:
            TWR.safeClose$NT(cursor0, throwable0);
            throw throwable0;
        }
        cursor0.close();
        return null;
    }
}

