package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.StrictMode.ThreadPolicy.Builder;
import android.os.StrictMode.ThreadPolicy;
import android.os.StrictMode;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzl;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
public final class zzclu {
    public static final zzcli zza(Context context0, zzcmx zzcmx0, String s, boolean z, boolean z1, zzaoc zzaoc0, zzbiy zzbiy0, zzcfo zzcfo0, zzbio zzbio0, zzl zzl0, zza zza0, zzbdm zzbdm0, zzfbl zzfbl0, zzfbo zzfbo0) throws zzclt {
        zzbhz.zzc(context0);
        try {
            zzclq zzclq0 = new zzclq(context0, zzcmx0, s, z, z1, zzaoc0, zzbiy0, zzcfo0, null, zzl0, zza0, zzbdm0, zzfbl0, zzfbo0);
            StrictMode.ThreadPolicy strictMode$ThreadPolicy0 = StrictMode.getThreadPolicy();
            try {
                StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(strictMode$ThreadPolicy0).permitDiskReads().permitDiskWrites().build());
                return zzclq0.zza();
            }
            finally {
                StrictMode.setThreadPolicy(strictMode$ThreadPolicy0);
            }
        }
        catch(Throwable throwable0) {
        }
        throw new zzclt("Webview initialization failed.", throwable0);
    }
}

