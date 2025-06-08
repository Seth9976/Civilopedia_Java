package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.View.OnTouchListener;
import android.view.View;

public final class zzdti implements View.OnTouchListener {
    public final zzdto zza;

    public zzdti(zzdto zzdto0) {
        this.zza = zzdto0;
    }

    @Override  // android.view.View$OnTouchListener
    public final boolean onTouch(View view0, MotionEvent motionEvent0) {
        this.zza.j.zza();
        return false;
    }
}

