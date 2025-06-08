package com.google.android.gms.internal.ads;

public final class s8 extends T7 implements Runnable {
    public final Runnable p;

    public s8(Runnable runnable0) {
        runnable0.getClass();
        this.p = runnable0;
    }

    @Override  // com.google.android.gms.internal.ads.zzftt
    public final String d() {
        return "task=[" + this.p + "]";
    }

    @Override
    public final void run() {
        try {
            this.p.run();
        }
        catch(RuntimeException | Error runtimeException0) {
            this.zze(runtimeException0);
            throw runtimeException0;
        }
    }
}

