package z1;

import i3.e;

public final class y extends Z {
    public final r0 a;
    public final String b;

    public y(r0 r00, String s) {
        this.a = r00;
        this.b = s;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 instanceof Z && this.a.i.equals(((y)(((Z)object0))).a)) {
            return this.b == null ? ((y)(((Z)object0))).b == null : this.b.equals(((y)(((Z)object0))).b);
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int v = this.a.i.hashCode();
        return this.b == null ? (v ^ 1000003) * 1000003 : (v ^ 1000003) * 1000003 ^ this.b.hashCode();
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("FilesPayload{files=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", orgId=");
        return e.h(stringBuilder0, this.b, "}");
    }
}

