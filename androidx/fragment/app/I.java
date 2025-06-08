package androidx.fragment.app;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.Window;
import androidx.activity.h;
import androidx.lifecycle.B;
import androidx.lifecycle.C;

public final class i extends r implements h, C {
    public final j j;
    public final j k;
    public final Handler l;
    public final v m;
    public final j n;

    public i(j j0) {
        this.n = j0;
        Handler handler0 = new Handler();
        this.m = new v();
        this.j = j0;
        if(j0 == null) {
            throw new NullPointerException("context == null");
        }
        this.k = j0;
        this.l = handler0;
    }

    @Override  // androidx.fragment.app.r
    public final View a(int v) {
        return this.n.findViewById(v);
    }

    @Override  // androidx.fragment.app.r
    public final boolean b() {
        Window window0 = this.n.getWindow();
        return window0 != null && window0.peekDecorView() != null;
    }

    public final void c(androidx.fragment.app.h h0, Intent intent0, int v, Bundle bundle0) {
        j j0;
        try {
            j0 = this.n;
            j0.x = true;
            if(v == -1) {
                j0.startActivityForResult(intent0, -1, bundle0);
            }
            else {
                j.f(v);
                j0.startActivityForResult(intent0, (j0.e(h0) + 1 << 16) + (v & 0xFFFF), bundle0);
            }
        }
        finally {
            j0.x = false;
        }
    }

    @Override  // androidx.lifecycle.n
    public final androidx.lifecycle.i getLifecycle() {
        return this.n.r;
    }

    @Override  // androidx.lifecycle.C
    public final B getViewModelStore() {
        return this.n.getViewModelStore();
    }
}

