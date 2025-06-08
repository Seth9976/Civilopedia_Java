package androidx.lifecycle;

import java.lang.reflect.Method;

public final class b {
    public final int a;
    public final Method b;

    public b(int v, Method method0) {
        this.a = v;
        this.b = method0;
        method0.setAccessible(true);
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof b ? this.a == ((b)object0).a && this.b.getName().equals(((b)object0).b.getName()) : false;
    }

    @Override
    public final int hashCode() {
        return this.b.getName().hashCode() + this.a * 0x1F;
    }
}

