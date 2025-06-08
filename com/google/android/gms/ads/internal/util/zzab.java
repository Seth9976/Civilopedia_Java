package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.media.AudioManager;

public final class zzab {
    public boolean a;
    public float b;

    public zzab() {
        this.a = false;
        this.b = 1.0f;
    }

    public final boolean a() {
        synchronized(this) {
        }
        return Float.compare(this.b, 0.0f) >= 0;
    }

    public final float zza() {
        synchronized(this) {
            return this.a() ? this.b : 1.0f;
        }
    }

    public static float zzb(Context context0) {
        AudioManager audioManager0 = (AudioManager)context0.getSystemService("audio");
        if(audioManager0 == null) {
            return 0.0f;
        }
        int v = audioManager0.getStreamMaxVolume(3);
        return v == 0 ? 0.0f : ((float)audioManager0.getStreamVolume(3)) / ((float)v);
    }

    public final void zzc(boolean z) {
        synchronized(this) {
            this.a = z;
        }
    }

    public final void zzd(float f) {
        synchronized(this) {
            this.b = f;
        }
    }

    public final boolean zze() {
        synchronized(this) {
        }
        return this.a;
    }
}

