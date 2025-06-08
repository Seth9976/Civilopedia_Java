package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzt;
import java.util.concurrent.Future;

public final class zzbdj {
    public static final Future zza(Context context0, zzbcy zzbcy0) {
        zzbdi zzbdi0 = new zzbdi(context0);
        Future future0 = new E1(zzbdi0);
        G1 g10 = new G1(zzbdi0, zzbcy0, ((E1)future0));
        H1 h10 = new H1(zzbdi0, ((E1)future0));
        synchronized(zzbdi0.c) {
            zzbcx zzbcx0 = new zzbcx(context0, zzt.zzt().zzb(), g10, h10);
            zzbdi0.a = zzbcx0;
            zzbcx0.checkAvailabilityAndConnect();
            return future0;
        }
    }
}

