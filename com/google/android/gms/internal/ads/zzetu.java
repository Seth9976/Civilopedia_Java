package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.provider.Settings.Secure;

public final class zzetu implements zzfok {
    public final zzetv zza;

    public zzetu(zzetv zzetv0) {
        this.zza = zzetv0;
    }

    @Override  // com.google.android.gms.internal.ads.zzfok
    public final Object apply(Object object0) {
        Throwable throwable0 = (Throwable)object0;
        this.zza.getClass();
        ContentResolver contentResolver0 = this.zza.a.getContentResolver();
        return contentResolver0 == null ? new zzetw(null, null) : new zzetw(null, Settings.Secure.getString(contentResolver0, "android_id"));
    }
}

