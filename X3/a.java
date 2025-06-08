package x3;

// 部分失败：枚举糖化
// 枚举按原样呈现，而不是糖化为Java 5枚举。
public final class a extends Enum {
    public final boolean i;
    public final boolean j;
    public static final enum a k;
    public static final a[] l;

    static {
        a.k = new a("NO_ARGUMENTS", 0, 3);
        a.l = new a[]{a.k, new a("UNLESS_EMPTY", 1, 2), new a(true, 2, "ALWAYS_PARENTHESIZED", true)};
    }

    public a(String s, int v, int v1) {
        this((v1 & 1) == 0, v, s, false);
    }

    public a(boolean z, int v, String s, boolean z1) {
        super(s, v);
        this.i = z;
        this.j = z1;
    }

    public static a valueOf(String s) {
        return (a)Enum.valueOf(a.class, s);
    }

    public static a[] values() {
        return (a[])a.l.clone();
    }
}

