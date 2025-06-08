package g3;

// 部分失败：枚举糖化
// 枚举按原样呈现，而不是糖化为Java 5枚举。
public final class a extends Enum {
    public final String i;
    public static final enum a j;
    public static final enum a k;
    public static final enum a l;
    public static final enum a m;
    public static final enum a n;
    public static final a[] o;

    static {
        a.j = new a("METHOD_RETURN_TYPE", 0, "METHOD");
        a.k = new a("VALUE_PARAMETER", 1, "PARAMETER");
        a.l = new a("FIELD", 2, "FIELD");
        a.m = new a("TYPE_USE", 3, "TYPE_USE");
        a.n = new a("TYPE_PARAMETER_BOUNDS", 4, "TYPE_USE");
        a.o = new a[]{a.j, a.k, a.l, a.m, a.n, new a("TYPE_PARAMETER", 5, "TYPE_PARAMETER")};
    }

    public a(String s, int v, String s1) {
        super(s, v);
        this.i = s1;
    }

    public static a valueOf(String s) {
        return (a)Enum.valueOf(a.class, s);
    }

    public static a[] values() {
        return (a[])a.o.clone();
    }
}

