package O;

import P.a;
import R.b;
import android.content.Context;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeMap;
import java.util.concurrent.Executor;

public final class h {
    public final String a;
    public final Context b;
    public ArrayList c;
    public Executor d;
    public Executor e;
    public b f;
    public boolean g;
    public boolean h;
    public boolean i;
    public final i j;
    public HashSet k;

    public h(Context context0, String s) {
        this.b = context0;
        this.a = s;
        this.h = true;
        i i0 = new i();  // 初始化器: Ljava/lang/Object;-><init>()V
        i0.a = new HashMap();
        this.j = i0;
    }

    public final void a(a[] arr_a) {
        if(this.k == null) {
            this.k = new HashSet();
        }
        for(int v1 = 0; v1 < arr_a.length; ++v1) {
            a a0 = arr_a[v1];
            this.k.add(a0.a);
            this.k.add(a0.b);
        }
        i i0 = this.j;
        i0.getClass();
        for(int v = 0; v < arr_a.length; ++v) {
            a a1 = arr_a[v];
            int v2 = a1.a;
            HashMap hashMap0 = i0.a;
            TreeMap treeMap0 = (TreeMap)hashMap0.get(v2);
            if(treeMap0 == null) {
                treeMap0 = new TreeMap();
                hashMap0.put(v2, treeMap0);
            }
            int v3 = a1.b;
            a a2 = (a)treeMap0.get(v3);
            if(a2 != null) {
                Log.w("ROOM", "Overriding migration " + a2 + " with " + a1);
            }
            treeMap0.put(v3, a1);
        }
    }
}

