package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode.Callback;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View.MeasureSpec;
import android.view.View;
import android.widget.FrameLayout;
import e.a;
import l.b;
import l.o0;

public class ActionBarContainer extends FrameLayout {
    public boolean i;
    public View j;
    public View k;
    public Drawable l;
    public Drawable m;
    public Drawable n;
    public final boolean o;
    public boolean p;
    public final int q;

    public ActionBarContainer(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.setBackground(new b(this));
        TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, a.a);
        boolean z = false;
        this.l = typedArray0.getDrawable(0);
        this.m = typedArray0.getDrawable(2);
        this.q = typedArray0.getDimensionPixelSize(13, -1);
        if(this.getId() == 0x7F0700ED) {  // id:split_action_bar
            this.o = true;
            this.n = typedArray0.getDrawable(1);
        }
        typedArray0.recycle();
        if(!this.o) {
            if(this.l == null && this.m == null) {
                z = true;
            }
        }
        else if(this.n == null) {
            z = true;
        }
        this.setWillNotDraw(z);
    }

    @Override  // android.view.ViewGroup
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        if(this.l != null && this.l.isStateful()) {
            this.l.setState(this.getDrawableState());
        }
        if(this.m != null && this.m.isStateful()) {
            this.m.setState(this.getDrawableState());
        }
        if(this.n != null && this.n.isStateful()) {
            this.n.setState(this.getDrawableState());
        }
    }

    public View getTabContainer() [...] // Inlined contents

    @Override  // android.view.ViewGroup
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable0 = this.l;
        if(drawable0 != null) {
            drawable0.jumpToCurrentState();
        }
        Drawable drawable1 = this.m;
        if(drawable1 != null) {
            drawable1.jumpToCurrentState();
        }
        Drawable drawable2 = this.n;
        if(drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
    }

    @Override  // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.j = this.findViewById(0x7F070028);  // id:action_bar
        this.k = this.findViewById(0x7F070030);  // id:action_context_bar
    }

    @Override  // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent0) {
        super.onHoverEvent(motionEvent0);
        return true;
    }

    // 去混淆评级： 低(20)
    @Override  // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent0) {
        return this.i || super.onInterceptTouchEvent(motionEvent0);
    }

    @Override  // android.widget.FrameLayout
    public final void onLayout(boolean z, int v, int v1, int v2, int v3) {
        super.onLayout(z, v, v1, v2, v3);
        boolean z1 = true;
        if(this.o) {
            Drawable drawable0 = this.n;
            if(drawable0 == null) {
                z1 = false;
            }
            else {
                drawable0.setBounds(0, 0, this.getMeasuredWidth(), this.getMeasuredHeight());
            }
        }
        else {
            if(this.l == null) {
                z1 = false;
            }
            else if(this.j.getVisibility() == 0) {
                this.l.setBounds(this.j.getLeft(), this.j.getTop(), this.j.getRight(), this.j.getBottom());
            }
            else if(this.k == null || this.k.getVisibility() != 0) {
                this.l.setBounds(0, 0, 0, 0);
            }
            else {
                this.l.setBounds(this.k.getLeft(), this.k.getTop(), this.k.getRight(), this.k.getBottom());
            }
            this.p = false;
        }
        if(z1) {
            this.invalidate();
        }
    }

    @Override  // android.widget.FrameLayout
    public final void onMeasure(int v, int v1) {
        if(this.j == null && View.MeasureSpec.getMode(v1) == 0x80000000) {
            int v2 = this.q;
            if(v2 >= 0) {
                v1 = View.MeasureSpec.makeMeasureSpec(Math.min(v2, View.MeasureSpec.getSize(v1)), 0x80000000);
            }
        }
        super.onMeasure(v, v1);
        if(this.j == null) {
            return;
        }
        View.MeasureSpec.getMode(v1);
    }

    @Override  // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent0) {
        super.onTouchEvent(motionEvent0);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable0) {
        Drawable drawable1 = this.l;
        if(drawable1 != null) {
            drawable1.setCallback(null);
            this.unscheduleDrawable(this.l);
        }
        this.l = drawable0;
        if(drawable0 != null) {
            drawable0.setCallback(this);
            View view0 = this.j;
            if(view0 != null) {
                this.l.setBounds(view0.getLeft(), this.j.getTop(), this.j.getRight(), this.j.getBottom());
            }
        }
        boolean z = false;
        if(!this.o) {
            if(this.l == null && this.m == null) {
                z = true;
            }
        }
        else if(this.n == null) {
            z = true;
        }
        this.setWillNotDraw(z);
        this.invalidate();
        this.invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable0) {
        Drawable drawable1 = this.n;
        if(drawable1 != null) {
            drawable1.setCallback(null);
            this.unscheduleDrawable(this.n);
        }
        this.n = drawable0;
        boolean z = this.o;
        boolean z1 = false;
        if(drawable0 != null) {
            drawable0.setCallback(this);
            if(z) {
                Drawable drawable2 = this.n;
                if(drawable2 != null) {
                    drawable2.setBounds(0, 0, this.getMeasuredWidth(), this.getMeasuredHeight());
                }
            }
        }
        if(!z) {
            if(this.l == null && this.m == null) {
                z1 = true;
            }
        }
        else if(this.n == null) {
            z1 = true;
        }
        this.setWillNotDraw(z1);
        this.invalidate();
        this.invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable0) {
        Drawable drawable1 = this.m;
        if(drawable1 != null) {
            drawable1.setCallback(null);
            this.unscheduleDrawable(this.m);
        }
        this.m = drawable0;
        if(drawable0 != null) {
            drawable0.setCallback(this);
            if(this.p && this.m != null) {
                throw null;
            }
        }
        boolean z = false;
        if(!this.o) {
            if(this.l == null && this.m == null) {
                z = true;
            }
        }
        else if(this.n == null) {
            z = true;
        }
        this.setWillNotDraw(z);
        this.invalidate();
        this.invalidateOutline();
    }

    public void setTabContainer(o0 o00) {
    }

    public void setTransitioning(boolean z) {
        this.i = z;
        this.setDescendantFocusability((z ? 0x60000 : 0x40000));
    }

    @Override  // android.view.View
    public void setVisibility(int v) {
        super.setVisibility(v);
        Drawable drawable0 = this.l;
        if(drawable0 != null) {
            drawable0.setVisible(v == 0, false);
        }
        Drawable drawable1 = this.m;
        if(drawable1 != null) {
            drawable1.setVisible(v == 0, false);
        }
        Drawable drawable2 = this.n;
        if(drawable2 != null) {
            drawable2.setVisible(v == 0, false);
        }
    }

    @Override  // android.view.ViewGroup
    public final ActionMode startActionModeForChild(View view0, ActionMode.Callback actionMode$Callback0) {
        return null;
    }

    @Override  // android.view.ViewGroup
    public final ActionMode startActionModeForChild(View view0, ActionMode.Callback actionMode$Callback0, int v) {
        return v == 0 ? null : super.startActionModeForChild(view0, actionMode$Callback0, v);
    }

    // 去混淆评级： 中等(70)
    @Override  // android.view.View
    public final boolean verifyDrawable(Drawable drawable0) {
        return drawable0 == this.l && !this.o || drawable0 == this.m && this.p || drawable0 == this.n && this.o || super.verifyDrawable(drawable0);
    }
}

