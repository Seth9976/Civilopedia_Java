package androidx.fragment.app;

import androidx.lifecycle.A;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public final class x extends A {
    public final HashSet b;
    public final HashMap c;
    public final HashMap d;
    public final boolean e;
    public boolean f;

    static {
    }

    public x(boolean z) {
        this.b = new HashSet();
        this.c = new HashMap();
        this.d = new HashMap();
        this.f = false;
        this.e = z;
    }

    @Override  // androidx.lifecycle.A
    public final void a() {
        this.f = true;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            return x.class == class0 && (this.b.equals(((x)object0).b) && this.c.equals(((x)object0).c) && this.d.equals(((x)object0).d));
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return this.d.hashCode() + (this.c.hashCode() + this.b.hashCode() * 0x1F) * 0x1F;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("FragmentManagerViewModel{");
        stringBuilder0.append(Integer.toHexString(System.identityHashCode(this)));
        stringBuilder0.append("} Fragments (");
        Iterator iterator0 = this.b.iterator();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            stringBuilder0.append(object0);
            if(iterator0.hasNext()) {
                stringBuilder0.append(", ");
            }
        }
        stringBuilder0.append(") Child Non Config (");
        Iterator iterator1 = this.c.keySet().iterator();
        while(iterator1.hasNext()) {
            Object object1 = iterator1.next();
            stringBuilder0.append(((String)object1));
            if(iterator1.hasNext()) {
                stringBuilder0.append(", ");
            }
        }
        stringBuilder0.append(") ViewModelStores (");
        Iterator iterator2 = this.d.keySet().iterator();
        while(iterator2.hasNext()) {
            Object object2 = iterator2.next();
            stringBuilder0.append(((String)object2));
            if(iterator2.hasNext()) {
                stringBuilder0.append(", ");
            }
        }
        stringBuilder0.append(')');
        return stringBuilder0.toString();
    }
}

