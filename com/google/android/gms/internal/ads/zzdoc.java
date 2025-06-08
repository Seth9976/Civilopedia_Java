package com.google.android.gms.internal.ads;

import android.view.View;
import android.widget.FrameLayout.LayoutParams;

public final class zzdoc implements Runnable {
    public final zzdod zza;

    public zzdoc(zzdod zzdod0) {
        this.zza = zzdod0;
    }

    @Override
    public final void run() {
        zzdod zzdod0 = this.zza;
        if(zzdod0.n == null) {
            View view0 = new View(zzdod0.k.getContext());
            zzdod0.n = view0;
            view0.setLayoutParams(new FrameLayout.LayoutParams(-1, 0));
        }
        if(zzdod0.k != zzdod0.n.getParent()) {
            zzdod0.k.addView(zzdod0.n);
        }
    }
}

