package com.google.android.gms.internal.play_billing;

// 部分失败：枚举糖化
// 枚举按原样呈现，而不是糖化为Java 5枚举。
public final class n extends Enum {
    public final int i;
    public static final enum n j;
    public static final zzcr k;
    public static final n[] l;

    static {
        n.j = new n("RESPONSE_CODE_UNSPECIFIED", 0, -999);
        n n0 = new n("SERVICE_TIMEOUT", 1, -3);
        n n1 = new n("FEATURE_NOT_SUPPORTED", 2, -2);
        n n2 = new n("SERVICE_DISCONNECTED", 3, -1);
        n n3 = new n("OK", 4, 0);
        n n4 = new n("USER_CANCELED", 5, 1);
        n n5 = new n("SERVICE_UNAVAILABLE", 6, 2);
        n n6 = new n("BILLING_UNAVAILABLE", 7, 3);
        n n7 = new n("ITEM_UNAVAILABLE", 8, 4);
        n n8 = new n("DEVELOPER_ERROR", 9, 5);
        n n9 = new n("ERROR", 10, 6);
        n n10 = new n("ITEM_ALREADY_OWNED", 11, 7);
        n n11 = new n("ITEM_NOT_OWNED", 12, 8);
        n n12 = new n("EXPIRED_OFFER_TOKEN", 13, 11);
        n n13 = new n("NETWORK_ERROR", 14, 12);
        n[] arr_n = new n[15];
        arr_n[0] = n.j;
        arr_n[1] = n0;
        arr_n[2] = n1;
        arr_n[3] = n2;
        arr_n[4] = n3;
        arr_n[5] = n4;
        arr_n[6] = n5;
        arr_n[7] = n6;
        arr_n[8] = n7;
        arr_n[9] = n8;
        arr_n[10] = n9;
        arr_n[11] = n10;
        arr_n[12] = n11;
        arr_n[13] = n12;
        arr_n[14] = n13;
        n.l = arr_n;
        zzcq zzcq0 = new zzcq();
        n[] arr_n1 = (n[])n.l.clone();
        for(int v = 0; v < arr_n1.length; ++v) {
            n n14 = arr_n1[v];
            zzcq0.zza(n14.i, n14);
        }
        n.k = zzcq0.zzb();
    }

    public n(String s, int v, int v1) {
        super(s, v);
        this.i = v1;
    }

    public static n[] values() [...] // Inlined contents
}

