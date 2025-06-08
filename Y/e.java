package Y;

import java.util.HashSet;

public final class e {
    public final HashSet a;

    public e() {
        this.a = new HashSet();
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            return e.class == class0 ? this.a.equals(((e)object0).a) : false;
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
}

