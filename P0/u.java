package p0;

import android.util.SparseArray;

// 部分失败：枚举糖化
// 枚举按原样呈现，而不是糖化为Java 5枚举。
public final class u extends Enum {
    public static final SparseArray i;
    public static final u[] j;

    static {
        u u0 = new u("MOBILE", 0);  // 初始化器: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        u u1 = new u("WIFI", 1);  // 初始化器: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        u u2 = new u("MOBILE_MMS", 2);  // 初始化器: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        u u3 = new u("MOBILE_SUPL", 3);  // 初始化器: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        u u4 = new u("MOBILE_DUN", 4);  // 初始化器: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        u u5 = new u("MOBILE_HIPRI", 5);  // 初始化器: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        u u6 = new u("WIMAX", 6);  // 初始化器: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        u u7 = new u("BLUETOOTH", 7);  // 初始化器: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        u u8 = new u("DUMMY", 8);  // 初始化器: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        u u9 = new u("ETHERNET", 9);  // 初始化器: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        u u10 = new u("MOBILE_FOTA", 10);  // 初始化器: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        u u11 = new u("MOBILE_IMS", 11);  // 初始化器: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        u u12 = new u("MOBILE_CBS", 12);  // 初始化器: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        u u13 = new u("WIFI_P2P", 13);  // 初始化器: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        u u14 = new u("MOBILE_IA", 14);  // 初始化器: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        u u15 = new u("MOBILE_EMERGENCY", 15);  // 初始化器: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        u u16 = new u("PROXY", 16);  // 初始化器: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        u u17 = new u("VPN", 17);  // 初始化器: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        u u18 = new u("NONE", 18);  // 初始化器: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        u.j = new u[]{u0, u1, u2, u3, u4, u5, u6, u7, u8, u9, u10, u11, u12, u13, u14, u15, u16, u17, u18};
        SparseArray sparseArray0 = new SparseArray();
        u.i = sparseArray0;
        sparseArray0.put(0, u0);
        sparseArray0.put(1, u1);
        sparseArray0.put(2, u2);
        sparseArray0.put(3, u3);
        sparseArray0.put(4, u4);
        sparseArray0.put(5, u5);
        sparseArray0.put(6, u6);
        sparseArray0.put(7, u7);
        sparseArray0.put(8, u8);
        sparseArray0.put(9, u9);
        sparseArray0.put(10, u10);
        sparseArray0.put(11, u11);
        sparseArray0.put(12, u12);
        sparseArray0.put(13, u13);
        sparseArray0.put(14, u14);
        sparseArray0.put(15, u15);
        sparseArray0.put(16, u16);
        sparseArray0.put(17, u17);
        sparseArray0.put(-1, u18);
    }

    public static u valueOf(String s) {
        return (u)Enum.valueOf(u.class, s);
    }

    public static u[] values() {
        return (u[])u.j.clone();
    }
}

