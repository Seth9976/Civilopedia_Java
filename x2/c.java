package X2;

import J2.j;
import java.util.List;
import v3.b;

public final class C {
    public final b a;
    public final List b;

    public C(b b0, List list0) {
        j.f(b0, "classId");
        super();
        this.a = b0;
        this.b = list0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof C)) {
            return false;
        }
        return j.a(this.a, ((C)object0).a) ? j.a(this.b, ((C)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        return this.b.hashCode() + this.a.hashCode() * 0x1F;
    }

    @Override
    public final String toString() {
        return "ClassRequest(classId=" + this.a + ", typeParametersCount=" + this.b + ')';
    }
}

