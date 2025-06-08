package f3;

// 部分失败：枚举糖化
// 枚举按原样呈现，而不是糖化为Java 5枚举。
public final class b extends Enum {
    public static final enum b i;
    public static final enum b j;
    public static final enum b k;
    public static final enum b l;
    public static final enum b m;
    public static final enum b n;
    public static final enum b o;
    public static final enum b p;
    public static final b[] q;

    static {
        b b0 = new b("FROM_IDE", 0);  // 初始化器: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        b b1 = new b("FROM_BACKEND", 1);  // 初始化器: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        b b2 = new b("FROM_TEST", 2);  // 初始化器: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        b.i = new b("FROM_BUILTINS", 3);  // 初始化器: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        b b3 = new b("WHEN_CHECK_DECLARATION_CONFLICTS", 4);  // 初始化器: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        b b4 = new b("WHEN_CHECK_OVERRIDES", 5);  // 初始化器: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        b b5 = new b("FOR_SCRIPT", 6);  // 初始化器: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        b.j = new b("FROM_REFLECTION", 7);  // 初始化器: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        b b6 = new b("WHEN_RESOLVE_DECLARATION", 8);  // 初始化器: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        b b7 = new b("WHEN_GET_DECLARATION_SCOPE", 9);  // 初始化器: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        b b8 = new b("WHEN_RESOLVING_DEFAULT_TYPE_ARGUMENTS", 10);  // 初始化器: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        b.k = new b("FOR_ALREADY_TRACKED", 11);  // 初始化器: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        b.l = new b("WHEN_GET_ALL_DESCRIPTORS", 12);  // 初始化器: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        b b9 = new b("WHEN_TYPING", 13);  // 初始化器: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        b.m = new b("WHEN_GET_SUPER_MEMBERS", 14);  // 初始化器: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        b.n = new b("FOR_NON_TRACKED_SCOPE", 15);  // 初始化器: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        b b10 = new b("FROM_SYNTHETIC_SCOPE", 16);  // 初始化器: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        b.o = new b("FROM_DESERIALIZATION", 17);  // 初始化器: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        b.p = new b("FROM_JAVA_LOADER", 18);  // 初始化器: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        b.q = new b[]{b0, b1, b2, b.i, b3, b4, b5, b.j, b6, b7, b8, b.k, b.l, b9, b.m, b.n, b10, b.o, b.p, new b("WHEN_GET_LOCAL_VARIABLE", 19), new b("WHEN_FIND_BY_FQNAME", 20), new b("WHEN_GET_COMPANION_OBJECT", 21), new b("FOR_DEFAULT_IMPORTS", 22)};  // 初始化器: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V / 初始化器: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V / 初始化器: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V / 初始化器: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
    }

    public static b valueOf(String s) {
        return (b)Enum.valueOf(b.class, s);
    }

    public static b[] values() {
        return (b[])b.q.clone();
    }
}

