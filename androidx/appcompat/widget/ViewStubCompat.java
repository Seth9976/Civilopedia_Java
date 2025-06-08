package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup;
import android.view.ViewParent;
import e.a;
import java.lang.ref.WeakReference;
import l.N0;

public final class ViewStubCompat extends View {
    public int i;
    public int j;
    public WeakReference k;
    public LayoutInflater l;

    public ViewStubCompat(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0, 0);
        this.i = 0;
        TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, a.A, 0, 0);
        this.j = typedArray0.getResourceId(2, -1);
        this.i = typedArray0.getResourceId(1, 0);
        this.setId(typedArray0.getResourceId(0, -1));
        typedArray0.recycle();
        this.setVisibility(8);
        this.setWillNotDraw(true);
    }

    public final View a() {
        ViewParent viewParent0 = this.getParent();
        if(!(viewParent0 instanceof ViewGroup)) {
            throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
        }
        if(this.i == 0) {
            throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
        View view0 = (this.l == null ? LayoutInflater.from(this.getContext()) : this.l).inflate(this.i, ((ViewGroup)viewParent0), false);
        int v = this.j;
        if(v != -1) {
            view0.setId(v);
        }
        int v1 = ((ViewGroup)viewParent0).indexOfChild(this);
        ((ViewGroup)viewParent0).removeViewInLayout(this);
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = this.getLayoutParams();
        if(viewGroup$LayoutParams0 == null) {
            ((ViewGroup)viewParent0).addView(view0, v1);
        }
        else {
            ((ViewGroup)viewParent0).addView(view0, v1, viewGroup$LayoutParams0);
        }
        this.k = new WeakReference(view0);
        return view0;
    }

    @Override  // android.view.View
    public final void dispatchDraw(Canvas canvas0) {
    }

    @Override  // android.view.View
    public final void draw(Canvas canvas0) {
    }

    public int getInflatedId() {
        return this.j;
    }

    public LayoutInflater getLayoutInflater() {
        return this.l;
    }

    public int getLayoutResource() {
        return this.i;
    }

    @Override  // android.view.View
    public final void onMeasure(int v, int v1) {
        this.setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int v) {
        this.j = v;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater0) {
        this.l = layoutInflater0;
    }

    public void setLayoutResource(int v) {
        this.i = v;
    }

    public void setOnInflateListener(N0 n00) {
    }

    @Override  // android.view.View
    public void setVisibility(int v) {
        WeakReference weakReference0 = this.k;
        if(weakReference0 != null) {
            View view0 = (View)weakReference0.get();
            if(view0 == null) {
                throw new IllegalStateException("setVisibility called on un-referenced view");
            }
            view0.setVisibility(v);
            return;
        }
        super.setVisibility(v);
        if(v == 0 || v == 4) {
            this.a();
        }
    }
}

