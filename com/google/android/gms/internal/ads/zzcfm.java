package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

public final class zzcfm {
    public static Context zza(Context context0) throws zzcfl {
        try {
            return DynamiteModule.load(context0, DynamiteModule.PREFER_REMOTE, "com.google.android.gms.ads.dynamite").getModuleContext();
        }
        catch(Exception exception0) {
            throw new zzcfl(exception0);
        }
    }

    public static Object zzb(Context context0, String s, zzcfk zzcfk0) throws zzcfl {
        DynamiteModule dynamiteModule0;
        try {
            dynamiteModule0 = DynamiteModule.load(context0, DynamiteModule.PREFER_REMOTE, "com.google.android.gms.ads.dynamite");
            return zzcfk0.zza(dynamiteModule0.instantiate(s));
        }
        catch(Exception exception0) {
            try {
                throw new zzcfl(exception0);
            }
            catch(Exception exception1) {
            }
        }
        throw new zzcfl(exception1);
    }
}

