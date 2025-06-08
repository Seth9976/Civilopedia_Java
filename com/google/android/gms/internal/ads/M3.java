package com.google.android.gms.internal.ads;

import android.view.View.OnAttachStateChangeListener;
import android.view.View;

public final class m3 implements View.OnAttachStateChangeListener {
    public final zzccj i;
    public final zzclp j;

    public m3(zzclp zzclp0, zzccj zzccj0) {
        this.j = zzclp0;
        this.i = zzccj0;
    }

    @Override  // android.view.View$OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view0) {
        this.j.d(view0, this.i, 10);
    }

    @Override  // android.view.View$OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view0) {
    }
}

