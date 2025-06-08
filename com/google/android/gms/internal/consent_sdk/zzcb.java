package com.google.android.gms.internal.consent_sdk;

import d1.h;
import java.lang.ref.WeakReference;
import java.util.concurrent.ThreadFactory;

public final class zzcb implements ThreadFactory {
    public final h zza;
    public final String zzb;

    public zzcb(h h0, String s) {
        this.zza = h0;
        this.zzb = "Google consent worker";
    }

    @Override
    public final Thread newThread(Runnable runnable0) {
        this.zza.getClass();
        Thread thread0 = new Thread(runnable0, "Google consent worker #" + this.zza.i.getAndIncrement());
        this.zza.k = new WeakReference(thread0);
        return thread0;
    }
}

