package z1;

import i3.e;

public final class x extends X {
    public final String a;
    public final String b;

    public x(String s, String s1) {
        this.a = s;
        this.b = s1;
    }

    // 去混淆评级： 低(40)
    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : object0 instanceof X && (this.a.equals(((x)(((X)object0))).a) && this.b.equals(((x)(((X)object0))).b));
    }

    @Override
    public final int hashCode() {
        return (this.a.hashCode() ^ 1000003) * 1000003 ^ this.b.hashCode();
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("CustomAttribute{key=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", value=");
        return e.h(stringBuilder0, this.b, "}");
    }
}

