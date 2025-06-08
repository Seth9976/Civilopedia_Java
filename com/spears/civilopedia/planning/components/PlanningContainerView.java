package com.spears.civilopedia.planning.components;

import J2.j;
import N2.b;
import N2.c;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;
import java.util.ArrayList;
import kotlin.Metadata;
import l2.a;
import l2.f;
import n2.t;
import x2.k;
import z1.a0;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/spears/civilopedia/planning/components/PlanningContainerView;", "Landroid/widget/RelativeLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class PlanningContainerView extends RelativeLayout {
    public final ArrayList i;

    public PlanningContainerView(Context context0, AttributeSet attributeSet0) {
        j.f(context0, "context");
        j.f(attributeSet0, "attributeSet");
        super(context0, attributeSet0);
        this.i = new ArrayList();
    }

    public final void a(t t0, View view0) {
        Rect rect0 = new Rect();
        view0.getHitRect(rect0);
        rect0.right -= rect0.left;
        rect0.left = 0;
        this.offsetDescendantRectToMyCoords(view0, rect0);
        rect0.left -= this.getPaddingLeft();
        rect0.bottom -= this.getPaddingTop();
        a a0 = new a(t0, rect0, view0);
        this.i.add(a0);
    }

    public final void b() {
        c c0 = a0.Q(0, this.getChildCount());
        ArrayList arrayList0 = new ArrayList(k.E(c0));
        b b0 = c0.h();
        while(b0.k) {
            arrayList0.add(this.getChildAt(b0.b()));
        }
        for(Object object0: arrayList0) {
            View view0 = (View)object0;
            if(j.a(view0.getTag(), "temporary") || view0 instanceof f) {
                this.removeView(view0);
            }
        }
    }

    @Override  // android.view.ViewGroup
    public final boolean dispatchTouchEvent(MotionEvent motionEvent0) {
        if(motionEvent0 == null) {
            return super.dispatchTouchEvent(null);
        }
        float f = motionEvent0.getX();
        float f1 = motionEvent0.getY();
        for(Object object0: this.i) {
            motionEvent0.setLocation(f, f1);
            if(((a)object0).onTouchEvent(motionEvent0)) {
                return true;
            }
            if(false) {
                break;
            }
        }
        return super.dispatchTouchEvent(motionEvent0);
    }
}

