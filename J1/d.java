package J1;

import I1.a;
import java.util.Date;
import java.util.HashMap;

public final class d implements a {
    public final HashMap a;
    public final HashMap b;
    public final J1.a c;
    public boolean d;
    public static final J1.a e;
    public static final b f;
    public static final b g;
    public static final c h;

    static {
        d.e = new J1.a(0);
        d.f = new b(0);
        d.g = new b(1);
        d.h = new c();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    public d() {
        HashMap hashMap0 = new HashMap();
        this.a = hashMap0;
        HashMap hashMap1 = new HashMap();
        this.b = hashMap1;
        this.c = d.e;
        this.d = false;
        hashMap1.put(String.class, d.f);
        hashMap0.remove(String.class);
        hashMap1.put(Boolean.class, d.g);
        hashMap0.remove(Boolean.class);
        hashMap1.put(Date.class, d.h);
        hashMap0.remove(Date.class);
    }

    public final a a(Class class0, H1.c c0) {
        this.a.put(class0, c0);
        this.b.remove(class0);
        return this;
    }
}

