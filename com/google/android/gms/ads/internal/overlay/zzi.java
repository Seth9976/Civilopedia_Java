package com.google.android.gms.ads.internal.overlay;

import E0.c;
import android.graphics.drawable.Drawable;

public final class zzi implements Runnable {
    public final c zza;
    public final Drawable zzb;

    public zzi(c c0, Drawable drawable0) {
        this.zza = c0;
        this.zzb = drawable0;
    }

    @Override
    public final void run() {
        this.zza.b.i.getWindow().setBackgroundDrawable(this.zzb);
    }
}

