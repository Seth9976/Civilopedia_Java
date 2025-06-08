package p3;

import java.util.LinkedHashMap;
import t1.c;

public enum a {
    UNKNOWN(0),
    CLASS(1),
    FILE_FACADE(2),
    SYNTHETIC_CLASS(3),
    MULTIFILE_CLASS(4),
    MULTIFILE_CLASS_PART(5);

    public final int i;
    public static final c j;
    public static final LinkedHashMap k;

    static {
        a.j = new c(17);
        a[] arr_a = (a[])a.r.clone();
        int v1 = arr_a.length;
        if(v1 >= 0) {
            if(v1 < 3) {
                ++v1;
            }
            else {
                v1 = v1 >= 0x40000000 ? 0x7FFFFFFF : ((int)(((float)v1) / 0.75f + 1.0f));
            }
        }
        LinkedHashMap linkedHashMap0 = new LinkedHashMap((v1 >= 16 ? v1 : 16));
        for(int v = 0; v < arr_a.length; ++v) {
            a a0 = arr_a[v];
            linkedHashMap0.put(a0.i, a0);
        }
        a.k = linkedHashMap0;
    }

    public a(int v1) {
        this.i = v1;
    }
}

