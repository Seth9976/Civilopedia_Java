package R2;

import java.lang.ref.WeakReference;

public final class y0 {
    public final WeakReference a;
    public final int b;

    public y0(ClassLoader classLoader0) {
        this.a = new WeakReference(classLoader0);
        this.b = System.identityHashCode(classLoader0);
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 instanceof y0 && this.a.get() == ((y0)object0).a.get();
    }

    @Override
    public final int hashCode() {
        return this.b;
    }

    @Override
    public final String toString() {
        ClassLoader classLoader0 = (ClassLoader)this.a.get();
        if(classLoader0 != null) {
            String s = classLoader0.toString();
            return s == null ? "<null>" : s;
        }
        return "<null>";
    }
}

