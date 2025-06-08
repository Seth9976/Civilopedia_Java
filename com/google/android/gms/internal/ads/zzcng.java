package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;

public final class zzcng {
    public zzcfo a;
    public Context b;
    public WeakReference c;

    public final zzcng zzc(Context context0) {
        this.c = new WeakReference(context0);
        if(context0.getApplicationContext() != null) {
            context0 = context0.getApplicationContext();
        }
        this.b = context0;
        return this;
    }

    public final zzcng zzd(zzcfo zzcfo0) {
        this.a = zzcfo0;
        return this;
    }
}

