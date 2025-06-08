package J2;

import R2.t0;

public abstract class r {
    public static final s a;

    static {
        s s0 = null;
        try {
            s0 = (s)t0.class.newInstance();
        }
        catch(ClassCastException | ClassNotFoundException | InstantiationException | IllegalAccessException unused_ex) {
        }
        if(s0 == null) {
            s0 = new s();  // 初始化器: Ljava/lang/Object;-><init>()V
        }
        r.a = s0;
    }
}

