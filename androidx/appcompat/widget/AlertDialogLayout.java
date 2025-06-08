package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View.MeasureSpec;
import android.view.View;
import android.view.ViewGroup;
import l.c0;

public class AlertDialogLayout extends LinearLayoutCompat {
    public AlertDialogLayout(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
    }

    public static int k(View view0) {
        int v = view0.getMinimumHeight();
        if(v > 0) {
            return v;
        }
        return !(view0 instanceof ViewGroup) || ((ViewGroup)view0).getChildCount() != 1 ? 0 : AlertDialogLayout.k(((ViewGroup)view0).getChildAt(0));
    }

    @Override  // androidx.appcompat.widget.LinearLayoutCompat
    public final void onLayout(boolean z, int v, int v1, int v2, int v3) {
        int v16;
        int v11;
        int v4 = this.getPaddingLeft();
        int v5 = v2 - v;
        int v6 = this.getPaddingRight();
        int v7 = this.getPaddingRight();
        int v8 = this.getMeasuredHeight();
        int v9 = this.getChildCount();
        int v10 = this.getGravity();
        switch(v10 & 0x70) {
            case 16: {
                v11 = (v3 - v1 - v8) / 2 + this.getPaddingTop();
                break;
            }
            case 80: {
                v11 = this.getPaddingTop() + v3 - v1 - v8;
                break;
            }
            default: {
                v11 = this.getPaddingTop();
            }
        }
        Drawable drawable0 = this.getDividerDrawable();
        int v13 = drawable0 == null ? 0 : drawable0.getIntrinsicHeight();
        for(int v12 = 0; v12 < v9; ++v12) {
            View view0 = this.getChildAt(v12);
            if(view0 != null && view0.getVisibility() != 8) {
                int v14 = view0.getMeasuredWidth();
                int v15 = view0.getMeasuredHeight();
                c0 c00 = (c0)view0.getLayoutParams();
                switch(Gravity.getAbsoluteGravity((c00.b >= 0 ? c00.b : v10 & 0x800007), this.getLayoutDirection()) & 7) {
                    case 1: {
                        v16 = (v5 - v4 - v7 - v14) / 2 + v4 + c00.leftMargin - c00.rightMargin;
                        break;
                    }
                    case 5: {
                        v16 = v5 - v6 - v14 - c00.rightMargin;
                        break;
                    }
                    default: {
                        v16 = c00.leftMargin + v4;
                    }
                }
                if(this.j(v12)) {
                    v11 += v13;
                }
                int v17 = v11 + c00.topMargin;
                view0.layout(v16, v17, v14 + v16, v17 + v15);
                v11 = v15 + c00.bottomMargin + v17;
            }
        }
    }

    @Override  // androidx.appcompat.widget.LinearLayoutCompat
    public final void onMeasure(int v, int v1) {
        int v13;
        int v12;
        int v11;
        int v10;
        int v2 = this.getChildCount();
        View view0 = null;
        View view1 = null;
        View view2 = null;
        int v3 = 0;
        while(v3 < v2) {
            View view3 = this.getChildAt(v3);
            if(view3.getVisibility() != 8) {
                int v4 = view3.getId();
                if(v4 == 0x7F07011A) {  // id:topPanel
                    view0 = view3;
                }
                else {
                    switch(v4) {
                        case 0x7F070056: {  // id:buttonPanel
                            view1 = view3;
                            goto label_20;
                        }
                        case 0x7F070069:   // id:contentPanel
                        case 0x7F07006D: {  // id:customPanel
                            if(view2 != null) {
                                break;
                            }
                            goto label_19;
                        }
                    }
                    super.onMeasure(v, v1);
                    return;
                label_19:
                    view2 = view3;
                }
            }
        label_20:
            ++v3;
        }
        int v5 = View.MeasureSpec.getMode(v1);
        int v6 = View.MeasureSpec.getSize(v1);
        int v7 = View.MeasureSpec.getMode(v);
        int v8 = this.getPaddingTop();
        int v9 = this.getPaddingBottom() + v8;
        if(view0 == null) {
            v10 = 0;
        }
        else {
            view0.measure(v, 0);
            v9 += view0.getMeasuredHeight();
            v10 = View.combineMeasuredStates(0, view0.getMeasuredState());
        }
        if(view1 == null) {
            v11 = 0;
            v12 = 0;
        }
        else {
            view1.measure(v, 0);
            v11 = AlertDialogLayout.k(view1);
            v12 = view1.getMeasuredHeight() - v11;
            v9 += v11;
            v10 = View.combineMeasuredStates(v10, view1.getMeasuredState());
        }
        if(view2 == null) {
            v13 = 0;
        }
        else {
            view2.measure(v, (v5 == 0 ? 0 : View.MeasureSpec.makeMeasureSpec(Math.max(0, v6 - v9), v5)));
            v13 = view2.getMeasuredHeight();
            v9 += v13;
            v10 = View.combineMeasuredStates(v10, view2.getMeasuredState());
        }
        int v14 = v6 - v9;
        if(view1 != null) {
            int v15 = v9 - v11;
            int v16 = Math.min(v14, v12);
            if(v16 > 0) {
                v14 -= v16;
                v11 += v16;
            }
            view1.measure(v, View.MeasureSpec.makeMeasureSpec(v11, 0x40000000));
            v9 = v15 + view1.getMeasuredHeight();
            v10 = View.combineMeasuredStates(v10, view1.getMeasuredState());
        }
        if(view2 != null && v14 > 0) {
            view2.measure(v, View.MeasureSpec.makeMeasureSpec(v13 + v14, v5));
            v9 = v9 - v13 + view2.getMeasuredHeight();
            v10 = View.combineMeasuredStates(v10, view2.getMeasuredState());
        }
        int v18 = 0;
        for(int v17 = 0; v17 < v2; ++v17) {
            View view4 = this.getChildAt(v17);
            if(view4.getVisibility() != 8) {
                v18 = Math.max(v18, view4.getMeasuredWidth());
            }
        }
        int v19 = this.getPaddingLeft();
        this.setMeasuredDimension(View.resolveSizeAndState(this.getPaddingRight() + v19 + v18, v, v10), View.resolveSizeAndState(v9, v1, 0));
        if(v7 != 0x40000000) {
            int v20 = View.MeasureSpec.makeMeasureSpec(this.getMeasuredWidth(), 0x40000000);
            for(int v21 = 0; v21 < v2; ++v21) {
                View view5 = this.getChildAt(v21);
                if(view5.getVisibility() != 8) {
                    c0 c00 = (c0)view5.getLayoutParams();
                    if(c00.width == -1) {
                        int v22 = c00.height;
                        c00.height = view5.getMeasuredHeight();
                        this.measureChildWithMargins(view5, v20, 0, v1, 0);
                        c00.height = v22;
                    }
                }
            }
        }
    }
}

