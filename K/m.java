package k;

import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.DialogInterface.OnKeyListener;
import android.content.DialogInterface;
import android.view.KeyEvent.DispatcherState;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import f.g;

public final class m implements DialogInterface.OnClickListener, DialogInterface.OnDismissListener, DialogInterface.OnKeyListener, w {
    public D i;
    public g j;
    public h k;

    @Override  // k.w
    public final void a(l l0, boolean z) {
        if(z || l0 == this.i) {
            g g0 = this.j;
            if(g0 != null) {
                g0.dismiss();
            }
        }
    }

    @Override  // k.w
    public final boolean d(D d0) {
        return false;
    }

    @Override  // android.content.DialogInterface$OnClickListener
    public final void onClick(DialogInterface dialogInterface0, int v) {
        h h0 = this.k;
        if(h0.n == null) {
            h0.n = new k.g(h0);
        }
        n n0 = h0.n.b(v);
        this.i.q(n0, null, 0);
    }

    @Override  // android.content.DialogInterface$OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface0) {
        this.k.a(this.i, true);
    }

    @Override  // android.content.DialogInterface$OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface0, int v, KeyEvent keyEvent0) {
        D d0 = this.i;
        if(v == 4 || v == 82) {
            if(keyEvent0.getAction() == 0 && keyEvent0.getRepeatCount() == 0) {
                Window window0 = this.j.getWindow();
                if(window0 != null) {
                    View view0 = window0.getDecorView();
                    if(view0 != null) {
                        KeyEvent.DispatcherState keyEvent$DispatcherState0 = view0.getKeyDispatcherState();
                        if(keyEvent$DispatcherState0 != null) {
                            keyEvent$DispatcherState0.startTracking(keyEvent0, this);
                            return true;
                        }
                    }
                }
            }
            else if(keyEvent0.getAction() == 1 && !keyEvent0.isCanceled()) {
                Window window1 = this.j.getWindow();
                if(window1 != null) {
                    View view1 = window1.getDecorView();
                    if(view1 != null) {
                        KeyEvent.DispatcherState keyEvent$DispatcherState1 = view1.getKeyDispatcherState();
                        if(keyEvent$DispatcherState1 != null && keyEvent$DispatcherState1.isTracking(keyEvent0)) {
                            d0.c(true);
                            dialogInterface0.dismiss();
                            return true;
                        }
                    }
                }
            }
        }
        return d0.performShortcut(v, keyEvent0, 0);
    }
}

