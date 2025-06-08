package U2;

import J2.j;
import v3.b;
import v3.c;
import v3.f;

// 部分失败：枚举糖化
// 枚举按原样呈现，而不是糖化为Java 5枚举。
public final class q extends Enum {
    public final b i;
    public final f j;
    public final b k;
    public static final q[] l;

    static {
        b b0 = new b(new c("kotlin"), new c("UShort"), false);
        b b1 = new b(new c("kotlin"), new c("UInt"), false);
        b b2 = new b(new c("kotlin"), new c("ULong"), false);
        q.l = new q[]{new q("UBYTE", 0, new b(new c("kotlin"), new c("UByte"), false)), new q("USHORT", 1, b0), new q("UINT", 2, b1), new q("ULONG", 3, b2)};
    }

    public q(String s, int v, b b0) {
        super(s, v);
        this.i = b0;
        f f0 = b0.i();
        j.e(f0, "getShortClassName(...)");
        this.j = f0;
        this.k = new b(b0.g(), f.e((f0.b() + "Array")));
    }

    public static q valueOf(String s) {
        return (q)Enum.valueOf(q.class, s);
    }

    public static q[] values() {
        return (q[])q.l.clone();
    }
}

