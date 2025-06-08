package A2;

import I2.c;
import J2.j;
import java.io.Serializable;

public final class i implements h, Serializable {
    public static final i i;

    static {
        i.i = new i();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @Override  // A2.h
    public final Object fold(Object object0, c c0) {
        return object0;
    }

    @Override  // A2.h
    public final f get(g g0) {
        j.f(g0, "key");
        return null;
    }

    @Override
    public final int hashCode() {
        return 0;
    }

    @Override  // A2.h
    public final h minusKey(g g0) {
        j.f(g0, "key");
        return this;
    }

    @Override
    public final String toString() {
        return "EmptyCoroutineContext";
    }
}

