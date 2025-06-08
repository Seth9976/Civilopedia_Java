package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager.OnAudioFocusChangeListener;
import android.media.AudioManager;

public final class zzchv implements AudioManager.OnAudioFocusChangeListener {
    public final AudioManager a;
    public final Q2 b;
    public boolean c;
    public boolean d;
    public boolean e;
    public float f;

    public zzchv(Context context0, Q2 q20) {
        this.f = 1.0f;
        this.a = (AudioManager)context0.getSystemService("audio");
        this.b = q20;
    }

    public final void a() {
        Q2 q20 = this.b;
        boolean z = false;
        AudioManager audioManager0 = this.a;
        if(this.d && !this.e && this.f > 0.0f) {
            if(!this.c) {
                if(audioManager0 != null) {
                    if(audioManager0.requestAudioFocus(this, 3, 2) == 1) {
                        z = true;
                    }
                    this.c = z;
                }
                q20.zzn();
            }
        }
        else if(this.c) {
            if(audioManager0 != null) {
                if(audioManager0.abandonAudioFocus(this) == 0) {
                    z = true;
                }
                this.c = z;
            }
            q20.zzn();
        }
    }

    @Override  // android.media.AudioManager$OnAudioFocusChangeListener
    public final void onAudioFocusChange(int v) {
        this.c = v > 0;
        this.b.zzn();
    }

    // 去混淆评级： 低(40)
    public final float zza() {
        return this.c ? (this.e ? 0.0f : this.f) : 0.0f;
    }

    public final void zzb() {
        this.d = true;
        this.a();
    }

    public final void zzc() {
        this.d = false;
        this.a();
    }

    public final void zzd(boolean z) {
        this.e = z;
        this.a();
    }

    public final void zze(float f) {
        this.f = f;
        this.a();
    }
}

