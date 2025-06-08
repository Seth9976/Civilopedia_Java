package G;

import E.b;
import F.c;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.widget.NestedScrollView;

public final class d extends b {
    @Override  // E.b
    public final void c(View view0, AccessibilityEvent accessibilityEvent0) {
        super.c(view0, accessibilityEvent0);
        accessibilityEvent0.setClassName("android.widget.ScrollView");
        accessibilityEvent0.setScrollable(((NestedScrollView)view0).getScrollRange() > 0);
        accessibilityEvent0.setScrollX(((NestedScrollView)view0).getScrollX());
        accessibilityEvent0.setScrollY(((NestedScrollView)view0).getScrollY());
        accessibilityEvent0.setMaxScrollX(((NestedScrollView)view0).getScrollX());
        accessibilityEvent0.setMaxScrollY(((NestedScrollView)view0).getScrollRange());
    }

    @Override  // E.b
    public final void d(View view0, c c0) {
        AccessibilityNodeInfo accessibilityNodeInfo0 = c0.a;
        this.a.onInitializeAccessibilityNodeInfo(view0, accessibilityNodeInfo0);
        accessibilityNodeInfo0.setClassName("android.widget.ScrollView");
        if(((NestedScrollView)view0).isEnabled()) {
            int v = ((NestedScrollView)view0).getScrollRange();
            if(v > 0) {
                accessibilityNodeInfo0.setScrollable(true);
                if(((NestedScrollView)view0).getScrollY() > 0) {
                    accessibilityNodeInfo0.addAction(((AccessibilityNodeInfo.AccessibilityAction)F.b.c.a));
                    accessibilityNodeInfo0.addAction(((AccessibilityNodeInfo.AccessibilityAction)F.b.d.a));
                }
                if(((NestedScrollView)view0).getScrollY() < v) {
                    accessibilityNodeInfo0.addAction(((AccessibilityNodeInfo.AccessibilityAction)F.b.b.a));
                    accessibilityNodeInfo0.addAction(((AccessibilityNodeInfo.AccessibilityAction)F.b.e.a));
                }
            }
        }
    }

    @Override  // E.b
    public final boolean g(View view0, int v, Bundle bundle0) {
        if(super.g(view0, v, bundle0)) {
            return true;
        }
        if(!((NestedScrollView)view0).isEnabled()) {
            return false;
        }
        switch(v) {
            case 0x2000: 
            case 0x1020038: {
                int v5 = ((NestedScrollView)view0).getHeight();
                int v6 = ((NestedScrollView)view0).getPaddingBottom();
                int v7 = ((NestedScrollView)view0).getPaddingTop();
                int v8 = Math.max(((NestedScrollView)view0).getScrollY() - (v5 - v6 - v7), 0);
                if(v8 != ((NestedScrollView)view0).getScrollY()) {
                    ((NestedScrollView)view0).t(-((NestedScrollView)view0).getScrollX(), v8 - ((NestedScrollView)view0).getScrollY(), true);
                    return true;
                }
                return false;
            }
            case 0x1000: 
            case 0x102003A: {
                int v1 = ((NestedScrollView)view0).getHeight();
                int v2 = ((NestedScrollView)view0).getPaddingBottom();
                int v3 = ((NestedScrollView)view0).getPaddingTop();
                int v4 = Math.min(((NestedScrollView)view0).getScrollY() + (v1 - v2 - v3), ((NestedScrollView)view0).getScrollRange());
                if(v4 != ((NestedScrollView)view0).getScrollY()) {
                    ((NestedScrollView)view0).t(-((NestedScrollView)view0).getScrollX(), v4 - ((NestedScrollView)view0).getScrollY(), true);
                    return true;
                }
                return false;
            }
            default: {
                return false;
            }
        }
    }
}

