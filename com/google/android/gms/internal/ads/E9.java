package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;

public final class e9 {
    public final AudioManager a;
    public final X8 b;
    public qa c;
    public int d;
    public float e;

    public e9(Context context0, Handler handler0, qa qa0) {
        this.e = 1.0f;
        AudioManager audioManager0 = (AudioManager)context0.getApplicationContext().getSystemService("audio");
        audioManager0.getClass();
        this.a = audioManager0;
        this.c = qa0;
        this.b = new X8(this, handler0);
        this.d = 0;
    }

    public final void a() {
        if(this.d == 0) {
            return;
        }
        if(zzeg.zza < 26) {
            this.a.abandonAudioFocus(this.b);
        }
        this.c(0);
    }

    public final void b(int v) {
        qa qa0 = this.c;
        if(qa0 != null) {
            boolean z = qa0.i.zzq();
            qa0.i.k(v, (!z || v == 1 ? 1 : 2), z);
        }
    }

    public final void c(int v) {
        if(this.d == v) {
            return;
        }
        this.d = v;
        float f = v == 3 ? 0.2f : 1.0f;
        if(this.e == f) {
            return;
        }
        this.e = f;
        qa qa0 = this.c;
        if(qa0 != null) {
            qa0.i.h(1, 2, ((float)(qa0.i.H * qa0.i.s.e)));
        }
    }
}

