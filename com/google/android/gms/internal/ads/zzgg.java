package com.google.android.gms.internal.ads;

import A.f;

public final class zzgg implements Runnable {
    public final X8 zza;
    public final int zzb;

    public zzgg(X8 x80, int v) {
        this.zza = x80;
        this.zzb = v;
    }

    @Override
    public final void run() {
        int v = this.zzb;
        e9 e90 = this.zza.b;
        if(v != -3 && v != -2) {
            switch(v) {
                case -1: {
                    e90.b(-1);
                    e90.a();
                    return;
                }
                case 1: {
                    e90.c(1);
                    e90.b(1);
                    return;
                }
                default: {
                    f.p(v, "Unknown focus change type: ", "AudioFocusManager");
                    return;
                }
            }
        }
        if(v != -2) {
            e90.c(3);
            return;
        }
        e90.b(0);
        e90.c(2);
    }
}

