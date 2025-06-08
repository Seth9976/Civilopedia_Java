package androidx.lifecycle;

import O.i;
import com.spears.civilopedia.MyApplication_LifecycleAdapter;
import java.util.HashMap;

class CompositeGeneratedAdaptersObserver implements l {
    public final MyApplication_LifecycleAdapter[] i;

    public CompositeGeneratedAdaptersObserver(MyApplication_LifecycleAdapter[] arr_myApplication_LifecycleAdapter) {
        this.i = arr_myApplication_LifecycleAdapter;
    }

    @Override  // androidx.lifecycle.l
    public final void a(n n0, g g0) {
        i i0 = new i();  // 初始化器: Ljava/lang/Object;-><init>()V
        i0.a = new HashMap();
        MyApplication_LifecycleAdapter[] arr_myApplication_LifecycleAdapter = this.i;
        for(int v1 = 0; v1 < arr_myApplication_LifecycleAdapter.length; ++v1) {
            arr_myApplication_LifecycleAdapter[v1].a(g0, false, i0);
        }
        for(int v = 0; v < arr_myApplication_LifecycleAdapter.length; ++v) {
            arr_myApplication_LifecycleAdapter[v].a(g0, true, i0);
        }
    }
}

