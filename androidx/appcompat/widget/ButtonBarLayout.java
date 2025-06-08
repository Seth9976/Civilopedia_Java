package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.view.View;
import android.widget.LinearLayout.LayoutParams;
import android.widget.LinearLayout;
import e.a;
import l.S;

public class ButtonBarLayout extends LinearLayout {
    public boolean i;
    public int j;

    public ButtonBarLayout(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.j = -1;
        int[] arr_v = a.k;
        TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, arr_v);
        if(Build.VERSION.SDK_INT >= 29) {
            S.e(this, context0, arr_v, attributeSet0, typedArray0);
        }
        this.i = typedArray0.getBoolean(0, true);
        typedArray0.recycle();
    }

    @Override  // android.view.View
    public int getMinimumHeight() {
        return Math.max(0, super.getMinimumHeight());
    }

    @Override  // android.widget.LinearLayout
    public final void onMeasure(int v, int v1) {
        int v7;
        boolean z;
        int v4;
        int v2 = View.MeasureSpec.getSize(v);
        int v3 = 0;
        if(this.i) {
            if(v2 > this.j && this.getOrientation() == 1) {
                this.setStacked(false);
            }
            this.j = v2;
        }
        if(this.getOrientation() == 1 || View.MeasureSpec.getMode(v) != 0x40000000) {
            v4 = v;
            z = false;
        }
        else {
            v4 = View.MeasureSpec.makeMeasureSpec(v2, 0x80000000);
            z = true;
        }
        super.onMeasure(v4, v1);
        if(this.i && this.getOrientation() != 1 && (this.getMeasuredWidthAndState() & 0xFF000000) == 0x1000000) {
            this.setStacked(true);
            z = true;
        }
        if(z) {
            super.onMeasure(v, v1);
        }
        int v5 = this.getChildCount();
        int v6;
        for(v6 = 0; true; ++v6) {
            v7 = -1;
            if(v6 >= v5) {
                v6 = -1;
                break;
            }
            if(this.getChildAt(v6).getVisibility() == 0) {
                break;
            }
        }
        if(v6 >= 0) {
            View view0 = this.getChildAt(v6);
            LinearLayout.LayoutParams linearLayout$LayoutParams0 = (LinearLayout.LayoutParams)view0.getLayoutParams();
            int v8 = this.getPaddingTop();
            int v9 = view0.getMeasuredHeight() + v8 + linearLayout$LayoutParams0.topMargin + linearLayout$LayoutParams0.bottomMargin;
            if(this.getOrientation() == 1) {
                int v10 = v6 + 1;
                int v11 = this.getChildCount();
                while(v10 < v11) {
                    if(this.getChildAt(v10).getVisibility() == 0) {
                        v7 = v10;
                        break;
                    }
                    ++v10;
                }
                v3 = v7 >= 0 ? this.getChildAt(v7).getPaddingTop() + ((int)(this.getResources().getDisplayMetrics().density * 16.0f)) + v9 : v9;
            }
            else {
                v3 = this.getPaddingBottom() + v9;
            }
        }
        if(this.getMinimumHeight() != v3) {
            this.setMinimumHeight(v3);
        }
    }

    public void setAllowStacking(boolean z) {
        if(this.i != z) {
            this.i = z;
            if(!z && this.getOrientation() == 1) {
                this.setStacked(false);
            }
            this.requestLayout();
        }
    }

    private void setStacked(boolean z) {
        this.setOrientation(((int)z));
        this.setGravity((z ? 5 : 80));
        View view0 = this.findViewById(0x7F0700EC);  // id:spacer
        if(view0 != null) {
            view0.setVisibility((z ? 8 : 4));
        }
        for(int v = this.getChildCount() - 2; v >= 0; --v) {
            this.bringChildToFront(this.getChildAt(v));
        }
    }
}

