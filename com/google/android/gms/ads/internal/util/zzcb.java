package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.os.StrictMode.ThreadPolicy.Builder;
import android.os.StrictMode.ThreadPolicy;
import android.os.StrictMode;
import com.google.android.gms.internal.ads.zzbyy;
import com.google.android.gms.internal.ads.zzcfi;
import java.util.concurrent.Callable;

public final class zzcb {
    @Deprecated
    public static Object zza(Context context0, Callable callable0) {
        try {
            StrictMode.ThreadPolicy strictMode$ThreadPolicy0 = StrictMode.getThreadPolicy();
            try {
                StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(strictMode$ThreadPolicy0).permitDiskReads().permitDiskWrites().build());
                return callable0.call();
            }
            finally {
                StrictMode.setThreadPolicy(strictMode$ThreadPolicy0);
            }
        }
        catch(Throwable throwable0) {
        }
        zzcfi.zzh("Unexpected exception.", throwable0);
        zzbyy.zza(context0).zzd(throwable0, "StrictModeUtil.runWithLaxStrictMode");
        return null;
    }
}

