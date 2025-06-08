package K1;

// 部分失败：枚举糖化
// 枚举按原样呈现，而不是糖化为Java 5枚举。
public final class c extends Enum {
    public static final enum c i;
    public static final c[] j;

    static {
        c.i = new c("DEFAULT", 0);  // 初始化器: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        c.j = new c[]{c.i, new c("SIGNED", 1), new c("FIXED", 2)};  // 初始化器: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V / 初始化器: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
    }

    public static c valueOf(String s) {
        return (c)Enum.valueOf(c.class, s);
    }

    public static c[] values() {
        return (c[])c.j.clone();
    }
}

