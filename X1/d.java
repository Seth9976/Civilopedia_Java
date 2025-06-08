package x1;

import java.util.HashMap;

// 部分失败：枚举糖化
// 枚举按原样呈现，而不是糖化为Java 5枚举。
public final class d extends Enum {
    public static final enum d i;
    public static final HashMap j;
    public static final d[] k;

    static {
        d d0 = new d("X86_32", 0);  // 初始化器: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        d d1 = new d("X86_64", 1);  // 初始化器: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        d d2 = new d("ARM_UNKNOWN", 2);  // 初始化器: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        d d3 = new d("PPC", 3);  // 初始化器: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        d d4 = new d("PPC64", 4);  // 初始化器: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        d d5 = new d("ARMV6", 5);  // 初始化器: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        d d6 = new d("ARMV7", 6);  // 初始化器: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        d.i = new d("UNKNOWN", 7);  // 初始化器: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        d d7 = new d("ARMV7S", 8);  // 初始化器: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        d d8 = new d("ARM64", 9);  // 初始化器: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        d.k = new d[]{d0, d1, d2, d3, d4, d5, d6, d.i, d7, d8};
        HashMap hashMap0 = new HashMap(4);
        d.j = hashMap0;
        hashMap0.put("armeabi-v7a", d6);
        hashMap0.put("armeabi", d5);
        hashMap0.put("arm64-v8a", d8);
        hashMap0.put("x86", d0);
    }

    public static d valueOf(String s) {
        return (d)Enum.valueOf(d.class, s);
    }

    public static d[] values() {
        return (d[])d.k.clone();
    }
}

