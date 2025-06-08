package x3;

// 部分失败：枚举糖化
// 枚举按原样呈现，而不是糖化为Java 5枚举。
public final class n extends Enum {
    public static final enum n i;
    public static final enum n j;
    public static final n[] k;

    static {
        n.i = new n("RENDER_OVERRIDE", 0);  // 初始化器: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        n.j = new n("RENDER_OPEN", 1);  // 初始化器: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        n.k = new n[]{n.i, n.j, new n("RENDER_OPEN_OVERRIDE", 2)};  // 初始化器: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
    }

    public static n valueOf(String s) {
        return (n)Enum.valueOf(n.class, s);
    }

    public static n[] values() {
        return (n[])n.k.clone();
    }
}

