package E;

import android.os.Build.VERSION;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View.AccessibilityDelegate;
import android.view.View;
import android.view.ViewParent;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class q {
    public static WeakHashMap a;
    public static Field b;
    public static boolean c;

    static {
        new AtomicInteger(1);
        q.a = null;
        q.c = false;
        new WeakHashMap();
    }

    public static u a(View view0) {
        if(q.a == null) {
            q.a = new WeakHashMap();
        }
        u u0 = (u)q.a.get(view0);
        if(u0 == null) {
            u0 = new u();  // 初始化器: Ljava/lang/Object;-><init>()V
            u0.a = new WeakReference(view0);
            q.a.put(view0, u0);
        }
        return u0;
    }

    public static boolean b(View view0, KeyEvent keyEvent0) {
        if(Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        p p0 = (p)view0.getTag(0x7F07010A);  // id:tag_unhandled_key_event_manager
        if(p0 == null) {
            p0 = new p();  // 初始化器: Ljava/lang/Object;-><init>()V
            p0.a = null;
            p0.b = null;
            p0.c = null;
            view0.setTag(0x7F07010A, p0);  // id:tag_unhandled_key_event_manager
        }
        if(keyEvent0.getAction() == 0) {
            WeakHashMap weakHashMap0 = p0.a;
            if(weakHashMap0 != null) {
                weakHashMap0.clear();
            }
            ArrayList arrayList0 = p.d;
            if(!arrayList0.isEmpty()) {
                synchronized(arrayList0) {
                    if(p0.a == null) {
                        p0.a = new WeakHashMap();
                    }
                    for(int v1 = arrayList0.size() - 1; v1 >= 0; --v1) {
                        ArrayList arrayList1 = p.d;
                        View view1 = (View)((WeakReference)arrayList1.get(v1)).get();
                        if(view1 == null) {
                            arrayList1.remove(v1);
                        }
                        else {
                            p0.a.put(view1, Boolean.TRUE);
                            for(ViewParent viewParent0 = view1.getParent(); viewParent0 instanceof View; viewParent0 = viewParent0.getParent()) {
                                p0.a.put(((View)viewParent0), Boolean.TRUE);
                            }
                        }
                    }
                }
            }
        }
        View view2 = p0.a(view0);
        if(keyEvent0.getAction() == 0) {
            int v2 = keyEvent0.getKeyCode();
            if(view2 != null && !KeyEvent.isModifierKey(v2)) {
                if(p0.b == null) {
                    p0.b = new SparseArray();
                }
                p0.b.put(v2, new WeakReference(view2));
            }
        }
        return view2 != null;
    }

    public static View.AccessibilityDelegate c(View view0) {
        if(Build.VERSION.SDK_INT >= 29) {
            return view0.getAccessibilityDelegate();
        }
        if(!q.c) {
            if(q.b == null) {
                try {
                    Field field0 = View.class.getDeclaredField("mAccessibilityDelegate");
                    q.b = field0;
                    field0.setAccessible(true);
                }
                catch(Throwable unused_ex) {
                    q.c = true;
                    return null;
                }
            }
            try {
                Object object0 = q.b.get(view0);
                if(object0 instanceof View.AccessibilityDelegate) {
                    return (View.AccessibilityDelegate)object0;
                }
            }
            catch(Throwable unused_ex) {
                q.c = true;
            }
        }
        return null;
    }

    public static void d(View view0, b b0) {
        if(b0 == null && q.c(view0) instanceof a) {
            b0 = new b();
        }
        view0.setAccessibilityDelegate((b0 == null ? null : b0.b));
    }
}

