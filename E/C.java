package E;

import java.util.Objects;

public final class c {
    public final Object a;

    public c(Object object0) {
        this.a = object0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            return c.class == class0 ? Objects.equals(this.a, ((c)object0).a) : false;
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return this.a == null ? 0 : this.a.hashCode();
    }

    @Override
    public final String toString() {
        return "DisplayCutoutCompat{" + this.a + "}";
    }
}

