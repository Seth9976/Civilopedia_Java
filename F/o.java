package f;

import B.c;
import E.q;
import E.u;
import X2.h0;
import android.content.Context;
import android.content.res.Resources.Theme;
import android.os.Build.VERSION;
import android.util.TypedValue;
import android.view.ActionMode.Callback;
import android.view.ActionMode;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window.Callback;
import android.view.WindowManager.LayoutParams;
import android.view.accessibility.AccessibilityEvent;
import android.widget.PopupWindow;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ViewStubCompat;
import f0.g;
import j.b;
import j.d;
import java.util.ArrayList;
import java.util.List;
import k.l;

public final class o implements Window.Callback {
    public final Window.Callback i;
    public final t j;

    public o(t t0, Window.Callback window$Callback0) {
        this.j = t0;
        if(window$Callback0 == null) {
            throw new IllegalArgumentException("Window callback may not be null");
        }
        this.i = window$Callback0;
    }

    public final boolean a(int v, Menu menu0) {
        return this.i.onMenuOpened(v, menu0);
    }

    public final void b(int v, Menu menu0) {
        this.i.onPanelClosed(v, menu0);
    }

    public final void c(List list0, Menu menu0, int v) {
        this.i.onProvideKeyboardShortcuts(list0, menu0, v);
    }

    public final d d(ActionMode.Callback actionMode$Callback0) {
        t t0 = this.j;
        g g0 = new g(t0.l, actionMode$Callback0);
        h0 h00 = t0.v;
        if(h00 != null) {
            h00.b();
        }
        c c0 = new c(t0, g0, 27, false);
        t0.t();
        A a0 = t0.p;
        if(a0 != null) {
            z z0 = a0.l;
            if(z0 != null) {
                z0.b();
            }
            a0.f.setHideOnContentScrollEnabled(false);
            ActionBarContextView actionBarContextView0 = a0.i;
            actionBarContextView0.removeAllViews();
            actionBarContextView0.t = null;
            actionBarContextView0.k = null;
            z z1 = new z(a0, a0.i.getContext(), c0);
            z1.m.w();
            try {
                boolean z2 = ((g)z1.n.j).m(z1, z1.m);
            }
            finally {
                z1.m.v();
            }
            if(z2) {
                a0.l = z1;
                z1.k();
                a0.i.c(z1);
                a0.Y(true);
                a0.i.sendAccessibilityEvent(0x20);
            }
            else {
                z1 = null;
            }
            t0.v = z1;
        }
        if(t0.v == null) {
            u u0 = t0.z;
            if(u0 != null) {
                u0.b();
            }
            h0 h01 = t0.v;
            if(h01 != null) {
                h01.b();
            }
            if(t0.w == null) {
                Context context0 = t0.l;
                if(t0.J) {
                    TypedValue typedValue0 = new TypedValue();
                    Resources.Theme resources$Theme0 = context0.getTheme();
                    resources$Theme0.resolveAttribute(0x7F020009, typedValue0, true);  // attr:actionBarTheme
                    if(typedValue0.resourceId != 0) {
                        Resources.Theme resources$Theme1 = context0.getResources().newTheme();
                        resources$Theme1.setTo(resources$Theme0);
                        resources$Theme1.applyStyle(typedValue0.resourceId, true);
                        b b0 = new b(context0, 0);
                        b0.getTheme().setTo(resources$Theme1);
                        context0 = b0;
                    }
                    t0.w = new ActionBarContextView(context0, null);
                    PopupWindow popupWindow0 = new PopupWindow(context0, null, 0x7F020017);  // attr:actionModePopupWindowStyle
                    t0.x = popupWindow0;
                    O2.A.a0(popupWindow0, 2);
                    t0.x.setContentView(t0.w);
                    t0.x.setWidth(-1);
                    context0.getTheme().resolveAttribute(0x7F020003, typedValue0, true);  // attr:actionBarSize
                    int v1 = TypedValue.complexToDimensionPixelSize(typedValue0.data, context0.getResources().getDisplayMetrics());
                    t0.w.setContentHeight(v1);
                    t0.x.setHeight(-2);
                    t0.y = new k(t0, 1);
                }
                else {
                    ViewStubCompat viewStubCompat0 = (ViewStubCompat)t0.B.findViewById(0x7F070036);  // id:action_mode_bar_stub
                    if(viewStubCompat0 != null) {
                        t0.t();
                        Context context1 = t0.p == null ? null : t0.p.Z();
                        if(context1 != null) {
                            context0 = context1;
                        }
                        viewStubCompat0.setLayoutInflater(LayoutInflater.from(context0));
                        t0.w = (ActionBarContextView)viewStubCompat0.a();
                    }
                }
            }
            if(t0.w != null) {
                u u1 = t0.z;
                if(u1 != null) {
                    u1.b();
                }
                ActionBarContextView actionBarContextView1 = t0.w;
                actionBarContextView1.removeAllViews();
                actionBarContextView1.t = null;
                actionBarContextView1.k = null;
                Context context2 = t0.w.getContext();
                ActionBarContextView actionBarContextView2 = t0.w;
                j.c c1 = new j.c();  // 初始化器: LX2/h0;-><init>()V
                c1.l = context2;
                c1.m = actionBarContextView2;
                c1.n = c0;
                l l0 = new l(actionBarContextView2.getContext());
                l0.l = 1;
                c1.q = l0;
                l0.e = c1;
                if(((g)c0.j).m(c1, l0)) {
                    c1.k();
                    t0.w.c(c1);
                    t0.v = c1;
                    if(!t0.A || (t0.B == null || !t0.B.isLaidOut())) {
                        t0.w.setAlpha(1.0f);
                        t0.w.setVisibility(0);
                        t0.w.sendAccessibilityEvent(0x20);
                        if(t0.w.getParent() instanceof View) {
                            ((View)t0.w.getParent()).requestApplyInsets();
                        }
                    }
                    else {
                        t0.w.setAlpha(0.0f);
                        u u2 = q.a(t0.w);
                        u2.a(1.0f);
                        t0.z = u2;
                        u2.d(new n(t0, 1));
                    }
                    if(t0.x != null) {
                        t0.m.getDecorView().post(t0.y);
                    }
                }
                else {
                    t0.v = null;
                }
            }
            t0.v = t0.v;
        }
        return t0.v == null ? null : g0.d(t0.v);
    }

    @Override  // android.view.Window$Callback
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent0) {
        return this.i.dispatchGenericMotionEvent(motionEvent0);
    }

    // 去混淆评级： 低(20)
    @Override  // android.view.Window$Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent0) {
        return this.j.n(keyEvent0) || this.i.dispatchKeyEvent(keyEvent0);
    }

    @Override  // android.view.Window$Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent0) {
        boolean z1;
        if(!this.i.dispatchKeyShortcutEvent(keyEvent0)) {
            int v = keyEvent0.getKeyCode();
            t t0 = this.j;
            t0.t();
            A a0 = t0.p;
            if(a0 != null) {
                z z0 = a0.l;
                if(z0 == null) {
                    z1 = false;
                }
                else {
                    l l0 = z0.m;
                    if(l0 == null) {
                        z1 = false;
                    }
                    else {
                        l0.setQwertyMode(KeyCharacterMap.load(keyEvent0.getDeviceId()).getKeyboardType() != 1);
                        z1 = l0.performShortcut(v, keyEvent0, 0);
                    }
                }
                if(!z1) {
                    goto label_17;
                }
                return true;
            }
        label_17:
            if(t0.N != null && t0.w(t0.N, keyEvent0.getKeyCode(), keyEvent0)) {
                s s0 = t0.N;
                if(s0 != null) {
                    s0.l = true;
                    return true;
                }
                return true;
            }
            if(t0.N == null) {
                s s1 = t0.s(0);
                t0.x(s1, keyEvent0);
                boolean z2 = t0.w(s1, keyEvent0.getKeyCode(), keyEvent0);
                s1.k = false;
                return z2;
            }
            return false;
        }
        return true;
    }

    @Override  // android.view.Window$Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent0) {
        return this.i.dispatchPopulateAccessibilityEvent(accessibilityEvent0);
    }

    @Override  // android.view.Window$Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent0) {
        return this.i.dispatchTouchEvent(motionEvent0);
    }

    @Override  // android.view.Window$Callback
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent0) {
        return this.i.dispatchTrackballEvent(motionEvent0);
    }

    @Override  // android.view.Window$Callback
    public final void onActionModeFinished(ActionMode actionMode0) {
        this.i.onActionModeFinished(actionMode0);
    }

    @Override  // android.view.Window$Callback
    public final void onActionModeStarted(ActionMode actionMode0) {
        this.i.onActionModeStarted(actionMode0);
    }

    @Override  // android.view.Window$Callback
    public final void onAttachedToWindow() {
        this.i.onAttachedToWindow();
    }

    @Override  // android.view.Window$Callback
    public final void onContentChanged() {
    }

    @Override  // android.view.Window$Callback
    public final boolean onCreatePanelMenu(int v, Menu menu0) {
        return v != 0 || menu0 instanceof l ? this.i.onCreatePanelMenu(v, menu0) : false;
    }

    @Override  // android.view.Window$Callback
    public final View onCreatePanelView(int v) {
        return this.i.onCreatePanelView(v);
    }

    @Override  // android.view.Window$Callback
    public final void onDetachedFromWindow() {
        this.i.onDetachedFromWindow();
    }

    @Override  // android.view.Window$Callback
    public final boolean onMenuItemSelected(int v, MenuItem menuItem0) {
        return this.i.onMenuItemSelected(v, menuItem0);
    }

    @Override  // android.view.Window$Callback
    public final boolean onMenuOpened(int v, Menu menu0) {
        this.a(v, menu0);
        t t0 = this.j;
        if(v == 108) {
            t0.t();
            A a0 = t0.p;
            if(a0 != null && !a0.o) {
                a0.o = true;
                ArrayList arrayList0 = a0.p;
                if(arrayList0.size() > 0) {
                    arrayList0.get(0).getClass();
                    throw new ClassCastException();
                }
            }
        }
        else {
            t0.getClass();
        }
        return true;
    }

    @Override  // android.view.Window$Callback
    public final void onPanelClosed(int v, Menu menu0) {
        this.b(v, menu0);
        t t0 = this.j;
        if(v == 108) {
            t0.t();
            A a0 = t0.p;
            if(a0 != null && a0.o) {
                a0.o = false;
                ArrayList arrayList0 = a0.p;
                if(arrayList0.size() > 0) {
                    arrayList0.get(0).getClass();
                    throw new ClassCastException();
                }
            }
        }
        else if(v == 0) {
            s s0 = t0.s(0);
            if(s0.m) {
                t0.m(s0, false);
            }
        }
        else {
            t0.getClass();
        }
    }

    @Override  // android.view.Window$Callback
    public final void onPointerCaptureChanged(boolean z) {
        this.i.onPointerCaptureChanged(z);
    }

    @Override  // android.view.Window$Callback
    public final boolean onPreparePanel(int v, View view0, Menu menu0) {
        l l0 = menu0 instanceof l ? ((l)menu0) : null;
        if(v == 0 && l0 == null) {
            return false;
        }
        if(l0 != null) {
            l0.x = true;
        }
        boolean z = this.i.onPreparePanel(v, view0, menu0);
        if(l0 != null) {
            l0.x = false;
        }
        return z;
    }

    @Override  // android.view.Window$Callback
    public final void onProvideKeyboardShortcuts(List list0, Menu menu0, int v) {
        l l0 = this.j.s(0).h;
        if(l0 != null) {
            this.c(list0, l0, v);
            return;
        }
        this.c(list0, menu0, v);
    }

    @Override  // android.view.Window$Callback
    public final boolean onSearchRequested() {
        return this.i.onSearchRequested();
    }

    @Override  // android.view.Window$Callback
    public final boolean onSearchRequested(SearchEvent searchEvent0) {
        return this.i.onSearchRequested(searchEvent0);
    }

    @Override  // android.view.Window$Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams windowManager$LayoutParams0) {
        this.i.onWindowAttributesChanged(windowManager$LayoutParams0);
    }

    @Override  // android.view.Window$Callback
    public final void onWindowFocusChanged(boolean z) {
        this.i.onWindowFocusChanged(z);
    }

    @Override  // android.view.Window$Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback actionMode$Callback0) {
        if(Build.VERSION.SDK_INT >= 23) {
            return null;
        }
        this.j.getClass();
        return this.d(actionMode$Callback0);
    }

    @Override  // android.view.Window$Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback actionMode$Callback0, int v) {
        this.j.getClass();
        return v != 0 ? this.i.onWindowStartingActionMode(actionMode$Callback0, v) : this.d(actionMode$Callback0);
    }
}

