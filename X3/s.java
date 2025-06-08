package x3;

// 部分失败：枚举糖化
// 枚举按原样呈现，而不是糖化为Java 5枚举。
public abstract class s extends Enum {
    public static final enum r i;
    public static final enum q j;
    public static final s[] k;

    static {
        r r0 = new r();
        s.i = r0;
        q q0 = new q();
        s.j = q0;
        s.k = new s[]{r0, q0};
    }

    public abstract String a(String arg1);

    public static s valueOf(String s) {
        return (s)Enum.valueOf(s.class, s);
    }

    public static s[] values() {
        return (s[])s.k.clone();
    }
}

