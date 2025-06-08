package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzi;
import java.lang.ref.WeakReference;

public final class zzcni {
    public final zzcfo a;
    public final Context b;
    public final WeakReference c;

    public zzcni(zzcng zzcng0) {
        this.a = zzcng0.a;
        this.b = zzcng0.b;
        this.c = zzcng0.c;
    }

    public final zzaoc zzb() {
        return new zzaoc(new zzi(this.b, this.a));
    }
}

