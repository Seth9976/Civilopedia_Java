package E;

import T1.c;
import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View.AccessibilityDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction;
import android.view.accessibility.AccessibilityNodeProvider;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;

public class b {
    public final View.AccessibilityDelegate a;
    public final a b;
    public static final View.AccessibilityDelegate c;

    static {
        b.c = new View.AccessibilityDelegate();
    }

    public b() {
        this(b.c);
    }

    public b(View.AccessibilityDelegate view$AccessibilityDelegate0) {
        this.a = view$AccessibilityDelegate0;
        this.b = new a(this);
    }

    public boolean a(View view0, AccessibilityEvent accessibilityEvent0) {
        return this.a.dispatchPopulateAccessibilityEvent(view0, accessibilityEvent0);
    }

    public c b(View view0) {
        AccessibilityNodeProvider accessibilityNodeProvider0 = this.a.getAccessibilityNodeProvider(view0);
        return accessibilityNodeProvider0 == null ? null : new c(accessibilityNodeProvider0, 4);
    }

    public void c(View view0, AccessibilityEvent accessibilityEvent0) {
        this.a.onInitializeAccessibilityEvent(view0, accessibilityEvent0);
    }

    public void d(View view0, F.c c0) {
        this.a.onInitializeAccessibilityNodeInfo(view0, c0.a);
    }

    public void e(View view0, AccessibilityEvent accessibilityEvent0) {
        this.a.onPopulateAccessibilityEvent(view0, accessibilityEvent0);
    }

    public boolean f(ViewGroup viewGroup0, View view0, AccessibilityEvent accessibilityEvent0) {
        return this.a.onRequestSendAccessibilityEvent(viewGroup0, view0, accessibilityEvent0);
    }

    public boolean g(View view0, int v, Bundle bundle0) {
        List list0 = (List)view0.getTag(0x7F070100);  // id:tag_accessibility_actions
        if(list0 == null) {
            list0 = Collections.emptyList();
        }
        for(int v1 = 0; v1 < list0.size() && ((AccessibilityNodeInfo.AccessibilityAction)((F.b)list0.get(v1)).a).getId() != v; ++v1) {
        }
        boolean z = this.a.performAccessibilityAction(view0, v, bundle0);
        if(!z && v == 0x7F070006) {  // id:accessibility_action_clickable_span
            int v2 = bundle0.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
            SparseArray sparseArray0 = (SparseArray)view0.getTag(0x7F070101);  // id:tag_accessibility_clickable_spans
            if(sparseArray0 != null) {
                WeakReference weakReference0 = (WeakReference)sparseArray0.get(v2);
                if(weakReference0 != null) {
                    ClickableSpan clickableSpan0 = (ClickableSpan)weakReference0.get();
                    if(clickableSpan0 != null) {
                        CharSequence charSequence0 = view0.createAccessibilityNodeInfo().getText();
                        ClickableSpan[] arr_clickableSpan = charSequence0 instanceof Spanned ? ((ClickableSpan[])((Spanned)charSequence0).getSpans(0, charSequence0.length(), ClickableSpan.class)) : null;
                        for(int v3 = 0; arr_clickableSpan != null && v3 < arr_clickableSpan.length; ++v3) {
                            if(clickableSpan0.equals(arr_clickableSpan[v3])) {
                                clickableSpan0.onClick(view0);
                                return true;
                            }
                        }
                    }
                }
            }
            return false;
        }
        return z;
    }

    public void h(View view0, int v) {
        this.a.sendAccessibilityEvent(view0, v);
    }

    public void i(View view0, AccessibilityEvent accessibilityEvent0) {
        this.a.sendAccessibilityEventUnchecked(view0, accessibilityEvent0);
    }
}

