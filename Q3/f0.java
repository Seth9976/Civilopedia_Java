package q3;

import w3.p;

// 部分失败：枚举糖化
// 枚举按原样呈现，而不是糖化为Java 5枚举。
public final class f0 extends Enum implements p {
    public final int i;
    public static final f0[] j;

    static {
        f0.j = new f0[]{new f0("INTERNAL", 0, 0), new f0("PRIVATE", 1, 1), new f0("PROTECTED", 2, 2), new f0("PUBLIC", 3, 3), new f0("PRIVATE_TO_THIS", 4, 4), new f0("LOCAL", 5, 5)};
    }

    public f0(String s, int v, int v1) {
        super(s, v);
        this.i = v1;
    }

    @Override  // w3.p
    public final int a() {
        return this.i;
    }

    public static f0 valueOf(String s) {
        return (f0)Enum.valueOf(f0.class, s);
    }

    public static f0[] values() {
        return (f0[])f0.j.clone();
    }
}

