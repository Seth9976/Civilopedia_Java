package q3;

import w3.p;

// 部分失败：枚举糖化
// 枚举按原样呈现，而不是糖化为Java 5枚举。
public final class z extends Enum implements p {
    public final int i;
    public static final z[] j;

    static {
        z.j = new z[]{new z("DECLARATION", 0, 0), new z("FAKE_OVERRIDE", 1, 1), new z("DELEGATION", 2, 2), new z("SYNTHESIZED", 3, 3)};
    }

    public z(String s, int v, int v1) {
        super(s, v);
        this.i = v1;
    }

    @Override  // w3.p
    public final int a() {
        return this.i;
    }

    public static z valueOf(String s) {
        return (z)Enum.valueOf(z.class, s);
    }

    public static z[] values() {
        return (z[])z.j.clone();
    }
}

