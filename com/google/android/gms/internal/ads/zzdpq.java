package com.google.android.gms.internal.ads;

import A.f;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory.Options;
import android.graphics.BitmapFactory;
import android.os.Looper;
import com.google.android.gms.ads.internal.util.zzbo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.common.util.Clock;
import java.util.concurrent.Executor;

public final class zzdpq {
    public final zzbo a;
    public final Clock b;
    public final Executor c;

    public zzdpq(zzbo zzbo0, Clock clock0, Executor executor0) {
        this.a = zzbo0;
        this.b = clock0;
        this.c = executor0;
    }

    public final Bitmap a(byte[] arr_b, BitmapFactory.Options bitmapFactory$Options0) {
        long v = this.b.elapsedRealtime();
        boolean z = false;
        Bitmap bitmap0 = BitmapFactory.decodeByteArray(arr_b, 0, arr_b.length, bitmapFactory$Options0);
        long v1 = this.b.elapsedRealtime();
        if(bitmap0 != null) {
            int v2 = bitmap0.getWidth();
            int v3 = bitmap0.getHeight();
            int v4 = bitmap0.getAllocationByteCount();
            if(Looper.getMainLooper().getThread() == Thread.currentThread()) {
                z = true;
            }
            StringBuilder stringBuilder0 = f.n("Decoded image w: ", v2, " h:", v3, " bytes: ");
            stringBuilder0.append(v4);
            stringBuilder0.append(" time: ");
            stringBuilder0.append(v1 - v);
            stringBuilder0.append(" on ui thread: ");
            stringBuilder0.append(z);
            zze.zza(stringBuilder0.toString());
        }
        return bitmap0;
    }

    public final zzfvl zzb(String s, double f, boolean z) {
        return zzfvc.zzm(this.a.zza(s), new zzdpp(this, f, z), this.c);
    }
}

