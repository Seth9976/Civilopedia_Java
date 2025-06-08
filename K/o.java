package k;

import D3.b;
import android.view.ActionProvider.VisibilityListener;
import android.view.ActionProvider;
import android.view.View;

public final class o implements ActionProvider.VisibilityListener {
    public final ActionProvider a;
    public final s b;
    public b c;

    public o(s s0, ActionProvider actionProvider0) {
        this.b = s0;
        this.a = actionProvider0;
    }

    public final View a(n n0) {
        return this.a.onCreateActionView(n0);
    }

    @Override  // android.view.ActionProvider$VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z) {
        b b0 = this.c;
        if(b0 != null) {
            ((n)b0.j).n.h = true;
            ((n)b0.j).n.p(true);
        }
    }
}

