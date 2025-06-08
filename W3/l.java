package w3;

// 部分失败：枚举糖化
// 枚举按原样呈现，而不是糖化为Java 5枚举。
public class L extends Enum {
    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    public final class H extends L {
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    public final class I extends L {
        @Override  // w3.L
        public final boolean a() {
            return false;
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    public final class J extends L {
        @Override  // w3.L
        public final boolean a() {
            return false;
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    public final class K extends L {
        @Override  // w3.L
        public final boolean a() {
            return false;
        }
    }

    public final M i;
    public final int j;
    public static final enum L k;
    public static final enum L l;
    public static final enum I m;
    public static final enum J n;
    public static final enum L o;
    public static final L[] p;

    static {
        L l0 = new L("DOUBLE", 0, M.m, 1);
        L l1 = new L("FLOAT", 1, M.l, 5);
        L l2 = new L("INT64", 2, M.k, 0);
        L l3 = new L("UINT64", 3, M.k, 0);
        L.k = new L("INT32", 4, M.j, 0);
        L l4 = new L("FIXED64", 5, M.k, 1);
        L l5 = new L("FIXED32", 6, M.j, 5);
        L.l = new L("BOOL", 7, M.n, 0);
        H h0 = new H("STRING", 8, M.o, 2);  // 初始化器: Lw3/L;-><init>(Ljava/lang/String;ILw3/M;I)V
        L.m = new I("GROUP", 9, M.r, 3);  // 初始化器: Lw3/L;-><init>(Ljava/lang/String;ILw3/M;I)V
        L.n = new J("MESSAGE", 10, M.r, 2);  // 初始化器: Lw3/L;-><init>(Ljava/lang/String;ILw3/M;I)V
        K k0 = new K("BYTES", 11, M.p, 2);  // 初始化器: Lw3/L;-><init>(Ljava/lang/String;ILw3/M;I)V
        L l6 = new L("UINT32", 12, M.j, 0);
        L.o = new L("ENUM", 13, M.q, 0);
        L.p = new L[]{l0, l1, l2, l3, L.k, l4, l5, L.l, h0, L.m, L.n, k0, l6, L.o, new L("SFIXED32", 14, M.j, 5), new L("SFIXED64", 15, M.k, 1), new L("SINT32", 16, M.j, 0), new L("SINT64", 17, M.k, 0)};
    }

    public L(String s, int v, M m0, int v1) {
        super(s, v);
        this.i = m0;
        this.j = v1;
    }

    public boolean a() {
        return !(this instanceof H);
    }

    public static L valueOf(String s) {
        return (L)Enum.valueOf(L.class, s);
    }

    public static L[] values() {
        return (L[])L.p.clone();
    }
}

