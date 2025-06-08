package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.wrappers.PackageManagerWrapper;
import com.google.android.gms.common.wrappers.Wrappers;

public final class zzah {
    public static final Object a;
    public static boolean b;
    public static String c;
    public static int d;

    static {
        zzah.a = new Object();
    }

    public static void a(Context context0) {
        synchronized(zzah.a) {
            if(zzah.b) {
                return;
            }
            zzah.b = true;
            PackageManagerWrapper packageManagerWrapper0 = Wrappers.packageManager(context0);
            try {
                Bundle bundle0 = packageManagerWrapper0.getApplicationInfo("com.spears.civilopedia", 0x80).metaData;
                if(bundle0 == null) {
                    return;
                }
                zzah.c = bundle0.getString("com.google.app.id");
                zzah.d = bundle0.getInt("com.google.android.gms.version");
            }
            catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException0) {
                Log.wtf("MetadataValueReader", "This should never happen.", packageManager$NameNotFoundException0);
            }
        }
    }

    public static int zza(Context context0) {
        zzah.a(context0);
        return zzah.d;
    }

    public static String zzb(Context context0) {
        zzah.a(context0);
        return zzah.c;
    }
}

