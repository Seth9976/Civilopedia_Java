package com.google.android.gms.internal.ads;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings.System;

public final class zzfja extends ContentObserver {
    public final Context a;
    public final AudioManager b;
    public float c;
    public final zzfjj d;

    public zzfja(Handler handler0, Context context0, zzfiy zzfiy0, zzfjj zzfjj0, byte[] arr_b) {
        super(handler0);
        this.a = context0;
        this.b = (AudioManager)context0.getSystemService("audio");
        this.d = zzfjj0;
    }

    public final float a() {
        int v = this.b.getStreamVolume(3);
        int v1 = this.b.getStreamMaxVolume(3);
        if(v1 > 0 && v > 0) {
            float f = ((float)v) / ((float)v1);
            return f > 1.0f ? 1.0f : f;
        }
        return 0.0f;
    }

    @Override  // android.database.ContentObserver
    public final void onChange(boolean z) {
        super.onChange(z);
        float f = this.a();
        if(f != this.c) {
            this.c = f;
            this.d.zzd(f);
        }
    }

    public final void zza() {
        float f = this.a();
        this.c = f;
        this.d.zzd(f);
        this.a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    public final void zzb() {
        this.a.getContentResolver().unregisterContentObserver(this);
    }
}

