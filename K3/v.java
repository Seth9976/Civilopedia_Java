package k3;

import J2.j;
import M3.w;
import java.util.ArrayList;
import java.util.List;

public final class v {
    public final w a;
    public final List b;
    public final ArrayList c;
    public final List d;

    public v(w w0, List list0, ArrayList arrayList0, List list1) {
        this.a = w0;
        this.b = list0;
        this.c = arrayList0;
        this.d = list1;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof v)) {
            return false;
        }
        if(!this.a.equals(((v)object0).a)) {
            return false;
        }
        if(!j.a(null, null)) {
            return false;
        }
        if(!this.b.equals(((v)object0).b)) {
            return false;
        }
        return this.c.equals(((v)object0).c) ? this.d.equals(((v)object0).d) : false;
    }

    @Override
    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + (this.b.hashCode() + this.a.hashCode() * 961) * 0x1F) * 0x1F + 0x4D5) * 0x1F;
    }

    @Override
    public final String toString() {
        return "MethodSignatureData(returnType=" + this.a + ", receiverType=null, valueParameters=" + this.b + ", typeParameters=" + this.c + ", hasStableParameterNames=false, errors=" + this.d + ')';
    }
}

