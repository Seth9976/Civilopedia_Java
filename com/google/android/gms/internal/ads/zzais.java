package com.google.android.gms.internal.ads;

import android.os.Handler;

public final class zzais {
    public final n0 a;

    public zzais(Handler handler0) {
        this.a = new n0(handler0);
    }

    public final void zza(zzajb zzajb0, zzajk zzajk0) {
        zzajb0.zzm("post-error");
        o0 o00 = new o0(zzajb0, zzajh.zza(zzajk0), null);
        this.a.j.post(o00);
    }

    public final void zzb(zzajb zzajb0, zzajh zzajh0, Runnable runnable0) {
        zzajb0.zzq();
        zzajb0.zzm("post-response");
        o0 o00 = new o0(zzajb0, zzajh0, runnable0);
        this.a.j.post(o00);
    }
}

