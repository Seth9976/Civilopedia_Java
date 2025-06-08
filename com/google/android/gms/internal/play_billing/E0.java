package com.google.android.gms.internal.play_billing;

import java.util.concurrent.CancellationException;

public final class e0 {
    public final CancellationException a;
    public static final e0 b;
    public static final e0 c;

    static {
        if(zzq.l) {
            e0.c = null;
            e0.b = null;
            return;
        }
        e0.c = new e0(null);
        e0.b = new e0(null);
    }

    public e0(CancellationException cancellationException0) {
        this.a = cancellationException0;
    }
}

