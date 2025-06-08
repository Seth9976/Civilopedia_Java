package com.google.android.gms.internal.ads;

import android.app.AlertDialog;
import com.google.android.gms.ads.internal.overlay.zzl;
import java.util.Timer;
import java.util.TimerTask;

public final class i5 extends TimerTask {
    public final AlertDialog i;
    public final Timer j;
    public final zzl k;

    public i5(AlertDialog alertDialog0, Timer timer0, zzl zzl0) {
        this.i = alertDialog0;
        this.j = timer0;
        this.k = zzl0;
        super();
    }

    @Override
    public final void run() {
        this.i.dismiss();
        this.j.cancel();
        zzl zzl0 = this.k;
        if(zzl0 != null) {
            zzl0.zzb();
        }
    }
}

