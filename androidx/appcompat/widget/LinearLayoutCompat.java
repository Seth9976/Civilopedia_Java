package androidx.appcompat.widget;

import B1.a;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View.MeasureSpec;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import l.O0;
import l.c0;

public class LinearLayoutCompat extends ViewGroup {
    public boolean i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public float o;
    public boolean p;
    public int[] q;
    public int[] r;
    public Drawable s;
    public int t;
    public int u;
    public int v;
    public int w;

    public LinearLayoutCompat(Context context0, AttributeSet attributeSet0) {
        this(context0, attributeSet0, 0);
    }

    public LinearLayoutCompat(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.i = true;
        this.j = -1;
        this.k = 0;
        this.m = 0x800033;
        a a0 = a.A(context0, attributeSet0, e.a.m, v);
        TypedArray typedArray0 = (TypedArray)a0.k;
        int v1 = typedArray0.getInt(1, -1);
        if(v1 >= 0) {
            this.setOrientation(v1);
        }
        int v2 = typedArray0.getInt(0, -1);
        if(v2 >= 0) {
            this.setGravity(v2);
        }
        if(!typedArray0.getBoolean(2, true)) {
            this.setBaselineAligned(false);
        }
        this.o = typedArray0.getFloat(4, -1.0f);
        this.j = typedArray0.getInt(3, -1);
        this.p = typedArray0.getBoolean(7, false);
        this.setDividerDrawable(a0.o(5));
        this.v = typedArray0.getInt(8, 0);
        this.w = typedArray0.getDimensionPixelSize(6, 0);
        a0.C();
    }

    @Override  // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        return viewGroup$LayoutParams0 instanceof c0;
    }

    public final void e(Canvas canvas0, int v) {
        this.s.setBounds(this.getPaddingLeft() + this.w, v, this.getWidth() - this.getPaddingRight() - this.w, this.u + v);
        this.s.draw(canvas0);
    }

    public final void f(Canvas canvas0, int v) {
        this.s.setBounds(v, this.getPaddingTop() + this.w, this.t + v, this.getHeight() - this.getPaddingBottom() - this.w);
        this.s.draw(canvas0);
    }

    public c0 g() {
        int v = this.l;
        if(v == 0) {
            return new c0(-2);
        }
        return v == 1 ? new c0(-1) : null;
    }

    @Override  // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return this.g();
    }

    @Override  // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet0) {
        return this.h(attributeSet0);
    }

    @Override  // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        return this.i(viewGroup$LayoutParams0);
    }

    @Override  // android.view.View
    public int getBaseline() {
        if(this.j < 0) {
            return super.getBaseline();
        }
        int v = this.getChildCount();
        int v1 = this.j;
        if(v <= v1) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View view0 = this.getChildAt(v1);
        int v2 = view0.getBaseline();
        if(v2 == -1) {
            if(this.j != 0) {
                throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn\'t know how to get its baseline.");
            }
            return -1;
        }
        int v3 = this.k;
        if(this.l == 1) {
            switch(this.m & 0x70) {
                case 16: {
                    v3 += (this.getBottom() - this.getTop() - this.getPaddingTop() - this.getPaddingBottom() - this.n) / 2;
                    break;
                }
                case 80: {
                    return this.getBottom() - this.getTop() - this.getPaddingBottom() - this.n + ((c0)view0.getLayoutParams()).topMargin + v2;
                }
                default: {
                    return v3 + ((c0)view0.getLayoutParams()).topMargin + v2;
                }
            }
        }
        return v3 + ((c0)view0.getLayoutParams()).topMargin + v2;
    }

    public int getBaselineAlignedChildIndex() {
        return this.j;
    }

    public Drawable getDividerDrawable() {
        return this.s;
    }

    public int getDividerPadding() {
        return this.w;
    }

    public int getDividerWidth() {
        return this.t;
    }

    public int getGravity() {
        return this.m;
    }

    public int getOrientation() {
        return this.l;
    }

    public int getShowDividers() {
        return this.v;
    }

    public int getVirtualChildCount() {
        return this.getChildCount();
    }

    public float getWeightSum() {
        return this.o;
    }

    public c0 h(AttributeSet attributeSet0) {
        return new c0(this.getContext(), attributeSet0);
    }

    public c0 i(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        return new c0(viewGroup$LayoutParams0);
    }

    public final boolean j(int v) {
        if(v == 0) {
            return (this.v & 1) != 0;
        }
        if(v == this.getChildCount()) {
            return (this.v & 4) != 0;
        }
        if((this.v & 2) != 0) {
            for(int v1 = v - 1; v1 >= 0; --v1) {
                if(this.getChildAt(v1).getVisibility() != 8) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override  // android.view.View
    public final void onDraw(Canvas canvas0) {
        int v4;
        int v2;
        int v = 0;
        if(this.s == null) {
            return;
        }
        if(this.l == 1) {
            int v1 = this.getVirtualChildCount();
            while(v < v1) {
                View view0 = this.getChildAt(v);
                if(view0 != null && view0.getVisibility() != 8 && this.j(v)) {
                    c0 c00 = (c0)view0.getLayoutParams();
                    this.e(canvas0, view0.getTop() - c00.topMargin - this.u);
                }
                ++v;
            }
            if(this.j(v1)) {
                View view1 = this.getChildAt(v1 - 1);
                if(view1 == null) {
                    v2 = this.getHeight() - this.getPaddingBottom() - this.u;
                }
                else {
                    c0 c01 = (c0)view1.getLayoutParams();
                    v2 = view1.getBottom() + c01.bottomMargin;
                }
                this.e(canvas0, v2);
            }
        }
        else {
            int v3 = this.getVirtualChildCount();
            boolean z = O0.a(this);
            while(v < v3) {
                View view2 = this.getChildAt(v);
                if(view2 != null && view2.getVisibility() != 8 && this.j(v)) {
                    c0 c02 = (c0)view2.getLayoutParams();
                    this.f(canvas0, (z ? view2.getRight() + c02.rightMargin : view2.getLeft() - c02.leftMargin - this.t));
                }
                ++v;
            }
            if(this.j(v3)) {
                View view3 = this.getChildAt(v3 - 1);
                if(view3 != null) {
                    c0 c03 = (c0)view3.getLayoutParams();
                    v4 = z ? view3.getLeft() - c03.leftMargin - this.t : view3.getRight() + c03.rightMargin;
                }
                else if(z) {
                    v4 = this.getPaddingLeft();
                }
                else {
                    v4 = this.getWidth() - this.getPaddingRight() - this.t;
                }
                this.f(canvas0, v4);
            }
        }
    }

    @Override  // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent0) {
        super.onInitializeAccessibilityEvent(accessibilityEvent0);
        accessibilityEvent0.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override  // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo0) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo0);
        accessibilityNodeInfo0.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override  // android.view.ViewGroup
    public void onLayout(boolean z, int v, int v1, int v2, int v3) {
        int v34;
        int v33;
        int v30;
        int v29;
        int v28;
        int v27;
        int v24;
        int v23;
        int v22;
        int v14;
        int v10;
        if(this.l == 1) {
            int v4 = this.getPaddingLeft();
            int v5 = v2 - v;
            int v6 = this.getPaddingRight();
            int v7 = this.getPaddingRight();
            int v8 = this.getVirtualChildCount();
            int v9 = 0x800007 & this.m;
            switch(this.m & 0x70) {
                case 16: {
                    v10 = this.getPaddingTop() + (v3 - v1 - this.n) / 2;
                    break;
                }
                case 80: {
                    v10 = this.getPaddingTop() + v3 - v1 - this.n;
                    break;
                }
                default: {
                    v10 = this.getPaddingTop();
                }
            }
            for(int v11 = 0; v11 < v8; ++v11) {
                View view0 = this.getChildAt(v11);
                if(view0 != null && view0.getVisibility() != 8) {
                    int v12 = view0.getMeasuredWidth();
                    int v13 = view0.getMeasuredHeight();
                    c0 c00 = (c0)view0.getLayoutParams();
                    switch(Gravity.getAbsoluteGravity((c00.b >= 0 ? c00.b : v9), this.getLayoutDirection()) & 7) {
                        case 1: {
                            v14 = (v5 - v4 - v7 - v12) / 2 + v4 + c00.leftMargin - c00.rightMargin;
                            break;
                        }
                        case 5: {
                            v14 = v5 - v6 - v12 - c00.rightMargin;
                            break;
                        }
                        default: {
                            v14 = c00.leftMargin + v4;
                        }
                    }
                    if(this.j(v11)) {
                        v10 += this.u;
                    }
                    int v15 = v10 + c00.topMargin;
                    view0.layout(v14, v15, v12 + v14, v15 + v13);
                    v10 = v13 + c00.bottomMargin + v15;
                }
            }
            return;
        }
        boolean z1 = O0.a(this);
        int v16 = this.getPaddingTop();
        int v17 = v3 - v1;
        int v18 = this.getPaddingBottom();
        int v19 = this.getPaddingBottom();
        int v20 = this.getVirtualChildCount();
        int v21 = this.m & 0x70;
        boolean z2 = this.i;
        int[] arr_v = this.q;
        int[] arr_v1 = this.r;
        switch(Gravity.getAbsoluteGravity(0x800007 & this.m, this.getLayoutDirection())) {
            case 1: {
                v22 = this.getPaddingLeft() + (v2 - v - this.n) / 2;
                break;
            }
            case 5: {
                v22 = this.getPaddingLeft() + v2 - v - this.n;
                break;
            }
            default: {
                v22 = this.getPaddingLeft();
            }
        }
        if(z1) {
            v23 = v20 - 1;
            v24 = -1;
        }
        else {
            v23 = 0;
            v24 = 1;
        }
        int v25 = 0;
        while(v25 < v20) {
            int v26 = v24 * v25 + v23;
            View view1 = this.getChildAt(v26);
            if(view1 == null) {
                v27 = v23;
                v28 = v24;
                v29 = v20;
                v30 = v21;
            }
            else {
                v27 = v23;
                if(view1.getVisibility() == 8) {
                    v28 = v24;
                    v29 = v20;
                    v30 = v21;
                }
                else {
                    int v31 = view1.getMeasuredWidth();
                    int v32 = view1.getMeasuredHeight();
                    c0 c01 = (c0)view1.getLayoutParams();
                    v28 = v24;
                    if(z2) {
                        v29 = v20;
                        if(c01.height != -1) {
                            v33 = view1.getBaseline();
                            goto label_79;
                        }
                    }
                    else {
                        v29 = v20;
                    }
                    v33 = -1;
                label_79:
                    v30 = v21;
                    switch((c01.b >= 0 ? c01.b : v21) & 0x70) {
                        case 16: {
                            v34 = (v17 - v16 - v19 - v32) / 2 + v16 + c01.topMargin - c01.bottomMargin;
                            break;
                        }
                        case 0x30: {
                            v34 = c01.topMargin + v16;
                            if(v33 != -1) {
                                v34 = arr_v[1] - v33 + v34;
                            }
                            break;
                        }
                        case 80: {
                            v34 = v17 - v18 - v32 - c01.bottomMargin;
                            if(v33 != -1) {
                                int v35 = view1.getMeasuredHeight();
                                v34 -= arr_v1[2] - (v35 - v33);
                            }
                            break;
                        }
                        default: {
                            v34 = v16;
                        }
                    }
                    if(this.j(v26)) {
                        v22 += this.t;
                    }
                    int v36 = v22 + c01.leftMargin;
                    view1.layout(v36, v34, v36 + v31, v34 + v32);
                    v22 = v31 + c01.rightMargin + v36;
                }
            }
            ++v25;
            v23 = v27;
            v24 = v28;
            v20 = v29;
            v21 = v30;
        }
    }

    @Override  // android.view.View
    public void onMeasure(int v, int v1) {
        int v93;
        int v92;
        int v97;
        int v96;
        int v105;
        float f9;
        int v103;
        int v84;
        int v83;
        int v79;
        boolean z8;
        int v71;
        int v70;
        int v69;
        c0 c06;
        int v68;
        int v72;
        boolean z7;
        boolean z6;
        int v67;
        int v39;
        int v24;
        boolean z2;
        int v21;
        int v18;
        c0 c01;
        int v17;
        int v16;
        int v15;
        int v14;
        int v19;
        if(this.l == 1) {
            this.n = 0;
            int v2 = this.getVirtualChildCount();
            int v3 = View.MeasureSpec.getMode(v);
            int v4 = View.MeasureSpec.getMode(v1);
            int v5 = this.j;
            boolean z = this.p;
            int v6 = 0;
            float f = 0.0f;
            int v7 = 0;
            int v8 = 0;
            int v9 = 0;
            int v10 = 0;
            int v11 = 0;
            int v12 = 0;
            int v13 = 1;
            boolean z1 = false;
            while(v6 < v2) {
                View view0 = this.getChildAt(v6);
                if(view0 == null) {
                    this.n = this.n;
                }
                else if(view0.getVisibility() != 8) {
                    if(this.j(v6)) {
                        this.n += this.u;
                    }
                    c0 c00 = (c0)view0.getLayoutParams();
                    float f1 = c00.a;
                    f += f1;
                    if(v4 != 0x40000000 || c00.height != 0 || f1 <= 0.0f) {
                        if(c00.height != 0 || f1 <= 0.0f) {
                            v19 = 0x80000000;
                        }
                        else {
                            c00.height = -2;
                            v19 = 0;
                        }
                        v14 = v5;
                        v15 = v4;
                        v16 = v3;
                        v17 = v2;
                        c01 = c00;
                        this.measureChildWithMargins(view0, v, 0, v1, (f == 0.0f ? this.n : 0));
                        if(v19 != 0x80000000) {
                            c01.height = v19;
                        }
                        int v20 = view0.getMeasuredHeight();
                        this.n = Math.max(this.n, this.n + v20 + c01.topMargin + c01.bottomMargin);
                        if(z) {
                            v10 = Math.max(v20, v10);
                        }
                        v18 = v9;
                    }
                    else {
                        this.n = Math.max(this.n, c00.topMargin + this.n + c00.bottomMargin);
                        v14 = v5;
                        v15 = 0x40000000;
                        v16 = v3;
                        v17 = v2;
                        c01 = c00;
                        v18 = 1;
                    }
                    if(v14 >= 0 && v14 == v6 + 1) {
                        this.k = this.n;
                    }
                    if(v6 < v14 && c01.a > 0.0f) {
                        throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won\'t work.  Either remove the weight, or don\'t set mBaselineAlignedChildIndex.");
                    }
                    v21 = v16;
                    if(v21 == 0x40000000 || c01.width != -1) {
                        z2 = false;
                    }
                    else {
                        z2 = true;
                        z1 = true;
                    }
                    int v22 = c01.leftMargin + c01.rightMargin;
                    int v23 = view0.getMeasuredWidth() + v22;
                    v24 = Math.max(v11, v23);
                    int v25 = View.combineMeasuredStates(v12, view0.getMeasuredState());
                    int v26 = v13 == 0 || c01.width != -1 ? 0 : 1;
                    if(c01.a > 0.0f) {
                        if(!z2) {
                            v22 = v23;
                        }
                        v8 = Math.max(v8, v22);
                    }
                    else {
                        if(!z2) {
                            v22 = v23;
                        }
                        v7 = Math.max(v7, v22);
                    }
                    v9 = v18;
                    v12 = v25;
                    v13 = v26;
                    goto label_87;
                }
                v14 = v5;
                v15 = v4;
                v21 = v3;
                v17 = v2;
                v24 = v11;
            label_87:
                ++v6;
                v3 = v21;
                v11 = v24;
                v5 = v14;
                v4 = v15;
                v2 = v17;
            }
            int v27 = v7;
            int v28 = v11;
            int v29 = v12;
            if(this.n > 0 && this.j(v2)) {
                this.n += this.u;
            }
            int v30 = v4;
            if(z && (v30 == 0x80000000 || v30 == 0)) {
                this.n = 0;
                for(int v31 = 0; v31 < v2; ++v31) {
                    View view1 = this.getChildAt(v31);
                    if(view1 == null) {
                        this.n = this.n;
                    }
                    else if(view1.getVisibility() != 8) {
                        c0 c02 = (c0)view1.getLayoutParams();
                        this.n = Math.max(this.n, this.n + v10 + c02.topMargin + c02.bottomMargin);
                    }
                }
            }
            int v32 = this.n;
            int v33 = this.getPaddingTop();
            int v34 = this.getPaddingBottom() + v33 + v32;
            this.n = v34;
            int v35 = View.resolveSizeAndState(Math.max(v34, this.getSuggestedMinimumHeight()), v1, 0);
            int v36 = (0xFFFFFF & v35) - this.n;
            if(v9 != 0 || v36 != 0 && f > 0.0f) {
                float f2 = this.o;
                if(f2 > 0.0f) {
                    f = f2;
                }
                this.n = 0;
                int v38 = 0;
                while(v38 < v2) {
                    View view3 = this.getChildAt(v38);
                    if(view3.getVisibility() == 8) {
                        v39 = v30;
                    }
                    else {
                        c0 c03 = (c0)view3.getLayoutParams();
                        float f3 = c03.a;
                        if(f3 > 0.0f) {
                            int v40 = (int)(((float)v36) * f3 / f);
                            f -= f3;
                            int v41 = this.getPaddingLeft();
                            int v42 = v36 - v40;
                            int v43 = ViewGroup.getChildMeasureSpec(v, this.getPaddingRight() + v41 + c03.leftMargin + c03.rightMargin, c03.width);
                            if(c03.height != 0 || v30 != 0x40000000) {
                                int v44 = view3.getMeasuredHeight() + v40;
                                if(v44 < 0) {
                                    v44 = 0;
                                }
                                view3.measure(v43, View.MeasureSpec.makeMeasureSpec(v44, 0x40000000));
                            }
                            else {
                                if(v40 <= 0) {
                                    v40 = 0;
                                }
                                view3.measure(v43, View.MeasureSpec.makeMeasureSpec(v40, 0x40000000));
                            }
                            v29 = View.combineMeasuredStates(v29, view3.getMeasuredState() & 0xFFFFFF00);
                            v36 = v42;
                        }
                        int v45 = c03.leftMargin + c03.rightMargin;
                        int v46 = view3.getMeasuredWidth() + v45;
                        int v47 = Math.max(v28, v46);
                        if(v3 == 0x40000000) {
                            v39 = v30;
                        }
                        else {
                            v39 = v30;
                            if(c03.width == -1) {
                                goto label_168;
                            }
                        }
                        v45 = v46;
                    label_168:
                        v27 = Math.max(v27, v45);
                        int v48 = v13 == 0 || c03.width != -1 ? 0 : 1;
                        int v49 = this.n;
                        this.n = Math.max(v49, view3.getMeasuredHeight() + v49 + c03.topMargin + c03.bottomMargin);
                        v13 = v48;
                        v28 = v47;
                    }
                    ++v38;
                    v30 = v39;
                }
                int v50 = this.n;
                int v51 = this.getPaddingTop();
                this.n = this.getPaddingBottom() + v51 + v50;
            }
            else {
                v27 = Math.max(v27, v8);
                if(z && v30 != 0x40000000) {
                    for(int v37 = 0; v37 < v2; ++v37) {
                        View view2 = this.getChildAt(v37);
                        if(view2 != null && view2.getVisibility() != 8 && ((c0)view2.getLayoutParams()).a > 0.0f) {
                            view2.measure(View.MeasureSpec.makeMeasureSpec(view2.getMeasuredWidth(), 0x40000000), View.MeasureSpec.makeMeasureSpec(v10, 0x40000000));
                        }
                    }
                }
            }
            if(v13 != 0 || v3 == 0x40000000) {
                v27 = v28;
            }
            int v52 = this.getPaddingLeft();
            this.setMeasuredDimension(View.resolveSizeAndState(Math.max(this.getPaddingRight() + v52 + v27, this.getSuggestedMinimumWidth()), v, v29), v35);
            if(z1) {
                int v53 = View.MeasureSpec.makeMeasureSpec(this.getMeasuredWidth(), 0x40000000);
                for(int v54 = 0; v54 < v2; ++v54) {
                    View view4 = this.getChildAt(v54);
                    if(view4.getVisibility() != 8) {
                        c0 c04 = (c0)view4.getLayoutParams();
                        if(c04.width == -1) {
                            int v55 = c04.height;
                            c04.height = view4.getMeasuredHeight();
                            this.measureChildWithMargins(view4, v53, 0, v1, 0);
                            c04.height = v55;
                        }
                    }
                }
            }
        }
        else {
            this.n = 0;
            int v56 = this.getVirtualChildCount();
            int v57 = View.MeasureSpec.getMode(v);
            int v58 = View.MeasureSpec.getMode(v1);
            if(this.q == null || this.r == null) {
                this.q = new int[4];
                this.r = new int[4];
            }
            int[] arr_v = this.q;
            int[] arr_v1 = this.r;
            arr_v[3] = -1;
            arr_v[2] = -1;
            arr_v[1] = -1;
            arr_v[0] = -1;
            arr_v1[3] = -1;
            arr_v1[2] = -1;
            arr_v1[1] = -1;
            arr_v1[0] = -1;
            boolean z3 = this.i;
            boolean z4 = this.p;
            int v59 = 0;
            float f4 = 0.0f;
            int v60 = 0;
            int v61 = 0;
            int v62 = 0;
            int v63 = 0;
            int v64 = 0;
            int v65 = 1;
            int v66 = 0;
            boolean z5 = false;
            while(v61 < v56) {
                View view5 = this.getChildAt(v61);
                if(view5 == null) {
                    this.n = this.n;
                    v67 = v61;
                    z6 = z4;
                    z7 = z3;
                }
                else if(view5.getVisibility() == 8) {
                    z7 = z3;
                    v67 = v61;
                    z6 = z4;
                }
                else {
                    if(this.j(v61)) {
                        this.n += this.t;
                    }
                    c0 c05 = (c0)view5.getLayoutParams();
                    float f5 = c05.a;
                    float f6 = f4 + f5;
                    if(v57 != 0x40000000 || c05.width != 0 || f5 <= 0.0f) {
                    label_270:
                        if(c05.width != 0 || f5 <= 0.0f) {
                            v72 = 0x80000000;
                        }
                        else {
                            c05.width = -2;
                            v72 = 0;
                        }
                        v69 = v59;
                        v70 = v60;
                        v67 = v61;
                        z6 = z4;
                        z7 = z3;
                        this.measureChildWithMargins(view5, v, (f6 == 0.0f ? this.n : 0), v1, 0);
                        if(v72 == 0x80000000) {
                            c06 = c05;
                        }
                        else {
                            c06 = c05;
                            c06.width = v72;
                        }
                        int v73 = view5.getMeasuredWidth();
                        this.n = v57 == 0x40000000 ? c06.leftMargin + v73 + c06.rightMargin + this.n : Math.max(this.n, this.n + v73 + c06.leftMargin + c06.rightMargin);
                        if(z6) {
                            v63 = Math.max(v73, v63);
                        }
                    }
                    else {
                        if(v57 == 0x40000000) {
                            v68 = v61;
                            this.n = c05.leftMargin + c05.rightMargin + this.n;
                        }
                        else {
                            v68 = v61;
                            this.n = Math.max(this.n, c05.leftMargin + this.n + c05.rightMargin);
                        }
                        if(z3) {
                            view5.measure(0, 0);
                            c06 = c05;
                            v69 = v59;
                            v70 = v60;
                            v67 = v68;
                            z6 = z4;
                            z7 = true;
                            goto label_293;
                        }
                        else {
                            c06 = c05;
                            v69 = v59;
                            v70 = v60;
                            v67 = v68;
                            z6 = z4;
                            z7 = false;
                            v71 = 1;
                            goto label_294;
                        }
                        goto label_270;
                    }
                label_293:
                    v71 = v66;
                label_294:
                    if(v58 == 0x40000000 || c06.height != -1) {
                        z8 = false;
                    }
                    else {
                        z8 = true;
                        z5 = true;
                    }
                    int v74 = c06.topMargin + c06.bottomMargin;
                    int v75 = view5.getMeasuredHeight() + v74;
                    int v76 = View.combineMeasuredStates(v62, view5.getMeasuredState());
                    if(z7) {
                        int v77 = view5.getBaseline();
                        if(v77 != -1) {
                            int v78 = (((c06.b >= 0 ? c06.b : this.m) & 0x70) >> 4 & -2) >> 1;
                            v79 = v74;
                            arr_v[v78] = Math.max(arr_v[v78], v77);
                            arr_v1[v78] = Math.max(arr_v1[v78], v75 - v77);
                        }
                    }
                    else {
                        v79 = v74;
                    }
                    int v80 = Math.max(v70, v75);
                    int v81 = v65 == 0 || c06.height != -1 ? 0 : 1;
                    if(c06.a > 0.0f) {
                        if(z8) {
                            v75 = v79;
                        }
                        v64 = Math.max(v64, v75);
                        v59 = v69;
                    }
                    else {
                        if(z8) {
                            v75 = v79;
                        }
                        v59 = Math.max(v69, v75);
                    }
                    v60 = v80;
                    v62 = v76;
                    v66 = v71;
                    v65 = v81;
                    f4 = f6;
                }
                v61 = v67 + 1;
                z4 = z6;
                z3 = z7;
            }
            if(this.n > 0 && this.j(v56)) {
                this.n += this.t;
            }
            int v82 = arr_v[1];
            if(v82 != -1 || arr_v[0] != -1 || arr_v[2] != -1 || arr_v[3] != -1) {
                v84 = v62;
                v83 = Math.max(v60, Math.max(arr_v1[3], Math.max(arr_v1[0], Math.max(arr_v1[1], arr_v1[2]))) + Math.max(arr_v[3], Math.max(arr_v[0], Math.max(v82, arr_v[2]))));
            }
            else {
                v83 = v60;
                v84 = v62;
            }
            if(z4 && (v57 == 0x80000000 || v57 == 0)) {
                this.n = 0;
                for(int v85 = 0; v85 < v56; ++v85) {
                    View view6 = this.getChildAt(v85);
                    if(view6 == null) {
                        this.n = this.n;
                    }
                    else if(view6.getVisibility() != 8) {
                        c0 c07 = (c0)view6.getLayoutParams();
                        this.n = v57 == 0x40000000 ? c07.leftMargin + v63 + c07.rightMargin + this.n : Math.max(this.n, this.n + v63 + c07.leftMargin + c07.rightMargin);
                    }
                }
            }
            int v86 = this.n;
            int v87 = this.getPaddingLeft();
            int v88 = this.getPaddingRight() + v87 + v86;
            this.n = v88;
            int v89 = View.resolveSizeAndState(Math.max(v88, this.getSuggestedMinimumWidth()), v, 0);
            int v90 = (0xFFFFFF & v89) - this.n;
            if(v66 != 0 || v90 != 0 && f4 > 0.0f) {
                float f7 = this.o;
                if(f7 > 0.0f) {
                    f4 = f7;
                }
                arr_v[3] = -1;
                arr_v[2] = -1;
                arr_v[1] = -1;
                arr_v[0] = -1;
                arr_v1[3] = -1;
                arr_v1[2] = -1;
                arr_v1[1] = -1;
                arr_v1[0] = -1;
                this.n = 0;
                int v94 = v84;
                v83 = -1;
                int v95 = 0;
                while(v95 < v56) {
                    View view8 = this.getChildAt(v95);
                    if(view8 != null && view8.getVisibility() != 8) {
                        c0 c08 = (c0)view8.getLayoutParams();
                        float f8 = c08.a;
                        if(f8 > 0.0f) {
                            v97 = v56;
                            int v98 = (int)(((float)v90) * f8 / f4);
                            int v99 = this.getPaddingTop();
                            int v100 = v90 - v98;
                            int v101 = ViewGroup.getChildMeasureSpec(v1, this.getPaddingBottom() + v99 + c08.topMargin + c08.bottomMargin, c08.height);
                            if(c08.width != 0 || v57 != 0x40000000) {
                                int v102 = view8.getMeasuredWidth() + v98;
                                if(v102 < 0) {
                                    v102 = 0;
                                }
                                view8.measure(View.MeasureSpec.makeMeasureSpec(v102, 0x40000000), v101);
                            }
                            else {
                                if(v98 <= 0) {
                                    v98 = 0;
                                }
                                view8.measure(View.MeasureSpec.makeMeasureSpec(v98, 0x40000000), v101);
                            }
                            v94 = View.combineMeasuredStates(v94, view8.getMeasuredState() & 0xFF000000);
                            f4 -= f8;
                            v103 = v100;
                        }
                        else {
                            v103 = v90;
                            v97 = v56;
                        }
                        if(v57 == 0x40000000) {
                            int v104 = this.n;
                            f9 = f4;
                            this.n = view8.getMeasuredWidth() + c08.leftMargin + c08.rightMargin + v104;
                            v105 = v103;
                        }
                        else {
                            f9 = f4;
                            int v106 = this.n;
                            v105 = v103;
                            this.n = Math.max(v106, view8.getMeasuredWidth() + v106 + c08.leftMargin + c08.rightMargin);
                        }
                        boolean z9 = v58 != 0x40000000 && c08.height == -1;
                        int v107 = c08.topMargin + c08.bottomMargin;
                        int v108 = view8.getMeasuredHeight() + v107;
                        v83 = Math.max(v83, v108);
                        if(!z9) {
                            v107 = v108;
                        }
                        v59 = Math.max(v59, v107);
                        int v109 = v65 == 0 || c08.height != -1 ? 0 : 1;
                        if(z3) {
                            int v110 = view8.getBaseline();
                            if(v110 != -1) {
                                int v111 = (((c08.b >= 0 ? c08.b : this.m) & 0x70) >> 4 & -2) >> 1;
                                arr_v[v111] = Math.max(arr_v[v111], v110);
                                arr_v1[v111] = Math.max(arr_v1[v111], v108 - v110);
                            }
                        }
                        v65 = v109;
                        v96 = v105;
                        f4 = f9;
                    }
                    else {
                        v96 = v90;
                        v97 = v56;
                    }
                    ++v95;
                    v90 = v96;
                    v56 = v97;
                }
                v92 = v56;
                int v112 = this.n;
                int v113 = this.getPaddingLeft();
                this.n = this.getPaddingRight() + v113 + v112;
                int v114 = arr_v[1];
                if(v114 != -1 || arr_v[0] != -1 || arr_v[2] != -1 || arr_v[3] != -1) {
                    v93 = 0;
                    v83 = Math.max(v83, Math.max(arr_v1[3], Math.max(arr_v1[0], Math.max(arr_v1[1], arr_v1[2]))) + Math.max(arr_v[3], Math.max(arr_v[0], Math.max(v114, arr_v[2]))));
                }
                else {
                    v93 = 0;
                }
                v84 = v94;
            }
            else {
                v59 = Math.max(v59, v64);
                if(z4 && v57 != 0x40000000) {
                    for(int v91 = 0; v91 < v56; ++v91) {
                        View view7 = this.getChildAt(v91);
                        if(view7 != null && view7.getVisibility() != 8 && ((c0)view7.getLayoutParams()).a > 0.0f) {
                            view7.measure(View.MeasureSpec.makeMeasureSpec(v63, 0x40000000), View.MeasureSpec.makeMeasureSpec(view7.getMeasuredHeight(), 0x40000000));
                        }
                    }
                }
                v92 = v56;
                v93 = 0;
            }
            if(v65 != 0 || v58 == 0x40000000) {
                v59 = v83;
            }
            int v115 = this.getPaddingTop();
            this.setMeasuredDimension(v84 & 0xFF000000 | v89, View.resolveSizeAndState(Math.max(this.getPaddingBottom() + v115 + v59, this.getSuggestedMinimumHeight()), v1, v84 << 16));
            if(z5) {
                int v116 = View.MeasureSpec.makeMeasureSpec(this.getMeasuredHeight(), 0x40000000);
                while(v93 < v92) {
                    View view9 = this.getChildAt(v93);
                    if(view9.getVisibility() != 8) {
                        c0 c09 = (c0)view9.getLayoutParams();
                        if(c09.height == -1) {
                            int v117 = c09.width;
                            c09.width = view9.getMeasuredWidth();
                            this.measureChildWithMargins(view9, v, 0, v116, 0);
                            c09.width = v117;
                        }
                    }
                    ++v93;
                }
            }
        }
    }

    public void setBaselineAligned(boolean z) {
        this.i = z;
    }

    public void setBaselineAlignedChildIndex(int v) {
        if(v < 0 || v >= this.getChildCount()) {
            throw new IllegalArgumentException("base aligned child index out of range (0, " + this.getChildCount() + ")");
        }
        this.j = v;
    }

    public void setDividerDrawable(Drawable drawable0) {
        if(drawable0 == this.s) {
            return;
        }
        this.s = drawable0;
        boolean z = false;
        if(drawable0 == null) {
            this.t = 0;
            this.u = 0;
        }
        else {
            this.t = drawable0.getIntrinsicWidth();
            this.u = drawable0.getIntrinsicHeight();
        }
        if(drawable0 == null) {
            z = true;
        }
        this.setWillNotDraw(z);
        this.requestLayout();
    }

    public void setDividerPadding(int v) {
        this.w = v;
    }

    public void setGravity(int v) {
        if(this.m != v) {
            if((0x800007 & v) == 0) {
                v |= 0x800003;
            }
            if((v & 0x70) == 0) {
                v |= 0x30;
            }
            this.m = v;
            this.requestLayout();
        }
    }

    public void setHorizontalGravity(int v) {
        int v1 = this.m;
        if((0x800007 & v1) != (v & 0x800007)) {
            this.m = v & 0x800007 | 0xFF7FFFF8 & v1;
            this.requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z) {
        this.p = z;
    }

    public void setOrientation(int v) {
        if(this.l != v) {
            this.l = v;
            this.requestLayout();
        }
    }

    public void setShowDividers(int v) {
        if(v != this.v) {
            this.requestLayout();
        }
        this.v = v;
    }

    public void setVerticalGravity(int v) {
        int v1 = this.m;
        if((v1 & 0x70) != (v & 0x70)) {
            this.m = v & 0x70 | v1 & 0xFFFFFF8F;
            this.requestLayout();
        }
    }

    public void setWeightSum(float f) {
        this.o = Math.max(0.0f, f);
    }

    @Override  // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}

