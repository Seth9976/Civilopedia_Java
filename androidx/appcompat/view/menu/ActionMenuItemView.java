package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.View;
import e.a;
import k.b;
import k.c;
import k.n;
import k.y;
import l.N;
import l.k;
import z1.a0;

public class ActionMenuItemView extends N implements View.OnClickListener, y, k {
    public n m;
    public CharSequence n;
    public Drawable o;
    public k.k p;
    public b q;
    public c r;
    public boolean s;
    public boolean t;
    public final int u;
    public int v;
    public final int w;

    public ActionMenuItemView(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0, 0);
        Resources resources0 = context0.getResources();
        this.s = this.e();
        TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, a.c, 0, 0);
        this.u = typedArray0.getDimensionPixelSize(0, 0);
        typedArray0.recycle();
        this.w = (int)(resources0.getDisplayMetrics().density * 32.0f + 0.5f);
        this.setOnClickListener(this);
        this.v = -1;
        this.setSaveEnabled(false);
    }

    @Override  // k.y
    public final void a(n n0) {
        this.m = n0;
        this.setIcon(n0.getIcon());
        this.setTitle(n0.getTitleCondensed());
        this.setId(n0.a);
        this.setVisibility((n0.isVisible() ? 0 : 8));
        this.setEnabled(n0.isEnabled());
        if(n0.hasSubMenu() && this.q == null) {
            this.q = new b(this);
        }
    }

    @Override  // l.k
    public final boolean b() {
        return !TextUtils.isEmpty(this.getText());
    }

    @Override  // l.k
    public final boolean c() {
        return !TextUtils.isEmpty(this.getText()) && this.m.getIcon() == null;
    }

    public final boolean e() {
        Configuration configuration0 = this.getContext().getResources().getConfiguration();
        return configuration0.screenWidthDp >= 480 || configuration0.screenWidthDp >= 640 && configuration0.screenHeightDp >= 480 || configuration0.orientation == 2;
    }

    public final void f() {
        int v = !TextUtils.isEmpty(this.n) & (this.o == null || (this.m.y & 4) == 4 && (this.s || this.t) ? 1 : 0);
        CharSequence charSequence0 = null;
        this.setText((v == 0 ? null : this.n));
        CharSequence charSequence1 = this.m.q;
        if(TextUtils.isEmpty(charSequence1)) {
            this.setContentDescription((v == 0 ? this.m.e : null));
        }
        else {
            this.setContentDescription(charSequence1);
        }
        CharSequence charSequence2 = this.m.r;
        if(TextUtils.isEmpty(charSequence2)) {
            if(v == 0) {
                charSequence0 = this.m.e;
            }
            a0.M(this, charSequence0);
            return;
        }
        a0.M(this, charSequence2);
    }

    @Override  // k.y
    public n getItemData() {
        return this.m;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        k.k k0 = this.p;
        if(k0 != null) {
            k0.a(this.m);
        }
    }

    @Override  // android.widget.TextView
    public final void onConfigurationChanged(Configuration configuration0) {
        super.onConfigurationChanged(configuration0);
        this.s = this.e();
        this.f();
    }

    @Override  // l.N
    public final void onMeasure(int v, int v1) {
        boolean z = TextUtils.isEmpty(this.getText());
        if(!z) {
            int v2 = this.v;
            if(v2 >= 0) {
                super.setPadding(v2, this.getPaddingTop(), this.getPaddingRight(), this.getPaddingBottom());
            }
        }
        super.onMeasure(v, v1);
        int v3 = View.MeasureSpec.getMode(v);
        int v4 = View.MeasureSpec.getSize(v);
        int v5 = this.getMeasuredWidth();
        int v6 = v3 == 0x80000000 ? Math.min(v4, this.u) : this.u;
        if(v3 != 0x40000000 && this.u > 0 && v5 < v6) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(v6, 0x40000000), v1);
        }
        if(z && this.o != null) {
            super.setPadding((this.getMeasuredWidth() - this.o.getBounds().width()) / 2, this.getPaddingTop(), this.getPaddingRight(), this.getPaddingBottom());
        }
    }

    @Override  // android.widget.TextView
    public final void onRestoreInstanceState(Parcelable parcelable0) {
        super.onRestoreInstanceState(null);
    }

    // 去混淆评级： 低(20)
    @Override  // android.widget.TextView
    public final boolean onTouchEvent(MotionEvent motionEvent0) {
        return !this.m.hasSubMenu() || (this.q == null || !this.q.onTouch(this, motionEvent0)) ? super.onTouchEvent(motionEvent0) : true;
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }

    public void setExpandedFormat(boolean z) {
        if(this.t != z) {
            this.t = z;
            n n0 = this.m;
            if(n0 != null) {
                n0.n.k = true;
                n0.n.p(true);
            }
        }
    }

    public void setIcon(Drawable drawable0) {
        this.o = drawable0;
        if(drawable0 != null) {
            int v = drawable0.getIntrinsicWidth();
            int v1 = drawable0.getIntrinsicHeight();
            int v2 = this.w;
            if(v > v2) {
                v1 = (int)(((float)v1) * (((float)v2) / ((float)v)));
                v = v2;
            }
            if(v1 > v2) {
                v = (int)(((float)v) * (((float)v2) / ((float)v1)));
            }
            else {
                v2 = v1;
            }
            drawable0.setBounds(0, 0, v, v2);
        }
        this.setCompoundDrawables(drawable0, null, null, null);
        this.f();
    }

    public void setItemInvoker(k.k k0) {
        this.p = k0;
    }

    @Override  // android.widget.TextView
    public final void setPadding(int v, int v1, int v2, int v3) {
        this.v = v;
        super.setPadding(v, v1, v2, v3);
    }

    public void setPopupCallback(c c0) {
        this.r = c0;
    }

    public void setTitle(CharSequence charSequence0) {
        this.n = charSequence0;
        this.f();
    }
}

