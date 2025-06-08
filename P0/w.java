package p0;

import android.util.SparseArray;

// 部分失败：枚举糖化
// 枚举按原样呈现，而不是糖化为Java 5枚举。
public final class w extends Enum {
    public static final enum w i;
    public static final w[] j;

    static {
        w.i = new w("DEFAULT", 0);  // 初始化器: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        w w0 = new w("UNMETERED_ONLY", 1);  // 初始化器: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        w w1 = new w("UNMETERED_OR_DAILY", 2);  // 初始化器: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        w w2 = new w("FAST_IF_RADIO_AWAKE", 3);  // 初始化器: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        w w3 = new w("NEVER", 4);  // 初始化器: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        w w4 = new w("UNRECOGNIZED", 5);  // 初始化器: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        w.j = new w[]{w.i, w0, w1, w2, w3, w4};
        SparseArray sparseArray0 = new SparseArray();
        sparseArray0.put(0, w.i);
        sparseArray0.put(1, w0);
        sparseArray0.put(2, w1);
        sparseArray0.put(3, w2);
        sparseArray0.put(4, w3);
        sparseArray0.put(-1, w4);
    }

    public static w valueOf(String s) {
        return (w)Enum.valueOf(w.class, s);
    }

    public static w[] values() {
        return (w[])w.j.clone();
    }
}

