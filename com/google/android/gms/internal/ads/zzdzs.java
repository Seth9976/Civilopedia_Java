package com.google.android.gms.internal.ads;

import android.webkit.CookieManager;
import com.google.android.gms.ads.internal.client.zzay;
import java.util.concurrent.Callable;

public final class zzdzs implements Callable {
    public final CookieManager zza;

    public zzdzs(CookieManager cookieManager0) {
        this.zza = cookieManager0;
    }

    @Override
    public final Object call() {
        return this.zza == null ? "" : this.zza.getCookie(((String)zzay.zzc().zzb(zzbhz.zzaH)));
    }
}

