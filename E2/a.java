package e2;

import java.util.ArrayList;

public abstract class a {
    public static final String a;

    static {
        a.a = "a";
    }

    public static ArrayList a(String s) {
        ArrayList arrayList0 = new ArrayList();
        StringBuilder stringBuilder0 = new StringBuilder();
        char[] arr_c = s.toCharArray();
        int v1 = -1;
        int v2 = -1;
        boolean z = false;
        for(int v = 0; v < s.length(); ++v) {
            int v3 = arr_c[v];
            if(v3 == 34 || v3 == 39) {
                if(v1 == -1) {
                    z = true;
                    v1 = v3;
                }
                else if(v1 == v3 && v2 != 92) {
                    v1 = -1;
                    z = false;
                }
            }
            if(v3 != 59 || z) {
                stringBuilder0.append(((char)v3));
            }
            else if(stringBuilder0.length() > 0) {
                arrayList0.add(stringBuilder0.toString().trim());
                stringBuilder0 = new StringBuilder();
            }
            v2 = v2 != 92 || arr_c[v] != 92 ? arr_c[v] : -1;
        }
        if(stringBuilder0.length() > 0) {
            arrayList0.add(stringBuilder0.toString().trim());
        }
        return arrayList0;
    }
}

