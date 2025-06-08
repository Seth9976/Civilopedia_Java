package com.google.android.gms.ads.internal.util;

import android.graphics.Bitmap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public final class zzbw {
    public final ConcurrentHashMap a;

    public zzbw() {
        this.a = new ConcurrentHashMap();
        new AtomicInteger(0);
    }

    public final Bitmap zza(Integer integer0) {
        return (Bitmap)this.a.get(integer0);
    }
}

