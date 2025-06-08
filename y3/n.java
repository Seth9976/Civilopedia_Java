package Y3;

import J2.j;
import N2.c;
import X3.o;
import java.util.ArrayList;
import java.util.List;
import o1.a;
import o2.G;
import x2.g;
import x2.k;

public abstract class n extends m {
    public static final boolean A0(int v, int v1, int v2, String s, String s1, boolean z) {
        j.f(s, "<this>");
        j.f(s1, "other");
        return z ? s.regionMatches(true, v, s1, v1, v2) : s.regionMatches(v, s1, v1, v2);
    }

    public static final boolean B0(String s, int v, CharSequence charSequence0, int v1, int v2, boolean z) {
        j.f(s, "<this>");
        j.f(charSequence0, "other");
        if(v1 >= 0 && v >= 0 && v <= s.length() - v2 && v1 <= charSequence0.length() - v2) {
            for(int v3 = 0; v3 < v2; ++v3) {
                if(!a.o(s.charAt(v + v3), charSequence0.charAt(v1 + v3), z)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public static String C0(String s, String s1) {
        j.f(s, "<this>");
        if(n.H0(s, s1)) {
            s = s.substring(s1.length());
            j.e(s, "substring(...)");
        }
        return s;
    }

    public static String D0(String s) {
        j.f(s, "<this>");
        if(n.u0(s, "V")) {
            s = s.substring(0, s.length() - 1);
            j.e(s, "substring(...)");
        }
        return s;
    }

    public static String E0(String s, char c, char c1) {
        j.f(s, "<this>");
        String s1 = s.replace(c, c1);
        j.e(s1, "replace(...)");
        return s1;
    }

    public static String F0(String s, String s1, String s2) {
        j.f(s, "<this>");
        j.f(s1, "oldValue");
        j.f(s2, "newValue");
        int v = n.w0(s, s1, 0, false);
        if(v >= 0) {
            int v1 = s1.length();
            int v2 = s2.length() + (s.length() - v1);
            if(v2 < 0) {
                throw new OutOfMemoryError();
            }
            StringBuilder stringBuilder0 = new StringBuilder(v2);
            int v3 = 0;
            do {
                stringBuilder0.append(s, v3, v);
                stringBuilder0.append(s2);
                v3 = v + v1;
                if(v >= s.length()) {
                    break;
                }
                v = n.w0(s, s1, v + (v1 < 1 ? 1 : v1), false);
            }
            while(v > 0);
            stringBuilder0.append(s, v3, s.length());
            s = stringBuilder0.toString();
            j.e(s, "toString(...)");
            return s;
        }
        return s;
    }

    public static List G0(String s, String[] arr_s) {
        List list0;
        if(arr_s.length == 1) {
            String s1 = arr_s[0];
            if(s1.length() != 0) {
                int v = n.w0(s, s1, 0, false);
                if(v != -1) {
                    list0 = new ArrayList(10);
                    int v1 = 0;
                    do {
                        ((ArrayList)list0).add(s.subSequence(v1, v).toString());
                        v1 = s1.length() + v;
                        v = n.w0(s, s1, v1, false);
                    }
                    while(v != -1);
                    ((ArrayList)list0).add(s.subSequence(v1, s.length()).toString());
                    return list0;
                }
                return G.p(s.toString());
            }
        }
        X3.j j0 = new X3.j(s, new A3.m(g.B(arr_s)));
        list0 = new ArrayList(k.E(new o(j0, 0)));
        for(Object object0: j0) {
            j.f(((c)object0), "range");
            ((ArrayList)list0).add(s.subSequence(((c)object0).i, ((c)object0).j + 1).toString());
        }
        return list0;
    }

    public static boolean H0(String s, String s1) {
        j.f(s, "<this>");
        j.f(s1, "prefix");
        return s.startsWith(s1);
    }

    public static String I0(String s, String s1, String s2) {
        j.f(s1, "delimiter");
        int v = n.x0(s, s1, 0, 6);
        if(v != -1) {
            s2 = s.substring(s1.length() + v, s.length());
            j.e(s2, "substring(...)");
        }
        return s2;
    }

    public static String J0(String s, char c) {
        j.f(s, "<this>");
        j.f(s, "missingDelimiterValue");
        int v = s.lastIndexOf(((int)c), n.v0(s));
        if(v != -1) {
            s = s.substring(v + 1, s.length());
            j.e(s, "substring(...)");
        }
        return s;
    }

    public static String K0(String s, String s1) {
        j.f(s, "<this>");
        j.f(s, "missingDelimiterValue");
        int v = n.x0(s, s1, 0, 6);
        if(v != -1) {
            s = s.substring(0, v);
            j.e(s, "substring(...)");
        }
        return s;
    }

    public static Integer L0(String s) {
        int v6;
        boolean z;
        int v4;
        j.f(s, "<this>");
        int v = 1;
        if(!new c(2, 36, 1).i(10)) {  // 初始化器: LN2/a;-><init>(III)V
            throw new IllegalArgumentException("radix 10 was not in valid range " + new c(2, 36, 1));  // 初始化器: LN2/a;-><init>(III)V
        }
        int v1 = s.length();
        if(v1 != 0) {
            int v2 = 0;
            int v3 = s.charAt(0);
            if(v3 < 0x30) {
                v4 = -1;
            }
            else {
                v4 = v3 == 0x30 ? 0 : 1;
            }
            int v5 = 0x80000001;
            if(v4 >= 0) {
                v = 0;
                z = false;
                v6 = 0xFC71C71D;
            label_25:
                while(v < v1) {
                    int v7 = Character.digit(s.charAt(v), 10);
                    if(v7 < 0) {
                        return null;
                    }
                    if(v2 < v6) {
                        if(v6 != 0xFC71C71D) {
                            return null;
                        }
                        v6 = v5 / 10;
                        if(v2 >= v6) {
                            goto label_32;
                        }
                        return null;
                    }
                label_32:
                    if(v2 * 10 < v5 + v7) {
                        return null;
                    }
                    v2 = v2 * 10 - v7;
                    ++v;
                }
                return z ? v2 : ((int)(-v2));
            }
            else if(v1 != 1) {
                switch(v3) {
                    case 43: {
                        z = false;
                        break;
                    }
                    case 45: {
                        v5 = 0x80000000;
                        z = true;
                        break;
                    }
                    default: {
                        return null;
                    }
                }
                v6 = 0xFC71C71D;
                goto label_25;
            }
        }
        return null;
    }

    public static CharSequence M0(String s) {
        j.f(s, "<this>");
        int v = s.length() - 1;
        int v1 = 0;
        boolean z = false;
        while(v1 <= v) {
            int v2 = s.charAt((z ? v : v1));
            boolean z1 = Character.isWhitespace(((char)v2)) || Character.isSpaceChar(((char)v2));
            if(z) {
                if(!z1) {
                    break;
                }
                --v;
            }
            else if(z1) {
                ++v1;
            }
            else {
                z = true;
            }
        }
        return s.subSequence(v1, v + 1);
    }

    public static boolean t0(String s, String s1) {
        j.f(s, "<this>");
        return n.x0(s, s1, 0, 2) >= 0;
    }

    public static boolean u0(String s, String s1) {
        j.f(s, "<this>");
        j.f(s1, "suffix");
        return s.endsWith(s1);
    }

    public static int v0(CharSequence charSequence0) {
        j.f(charSequence0, "<this>");
        return charSequence0.length() - 1;
    }

    public static final int w0(CharSequence charSequence0, String s, int v, boolean z) {
        j.f(charSequence0, "<this>");
        j.f(s, "string");
        if(!z && charSequence0 instanceof String) {
            return ((String)charSequence0).indexOf(s, v);
        }
        int v1 = charSequence0.length();
        if(v < 0) {
            v = 0;
        }
        int v2 = charSequence0.length();
        if(v1 > v2) {
            v1 = v2;
        }
        c c0 = new c(v, v1, 1);  // 初始化器: LN2/a;-><init>(III)V
        int v3 = c0.k;
        int v4 = c0.j;
        int v5 = c0.i;
        if(charSequence0 instanceof String && s instanceof String) {
            if(v3 > 0 && v5 <= v4 || v3 < 0 && v4 <= v5) {
                while(!n.A0(0, v5, s.length(), s, ((String)charSequence0), z)) {
                    if(v5 == v4) {
                        return -1;
                    }
                    v5 += v3;
                }
                return v5;
            }
        }
        else if(v3 > 0 && v5 <= v4 || v3 < 0 && v4 <= v5) {
            while(!n.B0(s, 0, charSequence0, v5, s.length(), z)) {
                if(v5 == v4) {
                    return -1;
                }
                v5 += v3;
            }
            return v5;
        }
        return -1;
    }

    public static int x0(CharSequence charSequence0, String s, int v, int v1) {
        if((v1 & 2) != 0) {
            v = 0;
        }
        return n.w0(charSequence0, s, v, false);
    }

    public static int y0(String s, char c, int v, int v1) {
        if((v1 & 2) != 0) {
            v = 0;
        }
        j.f(s, "<this>");
        return s.indexOf(((int)c), v);
    }

    public static int z0(int v, String s, String s1) {
        int v1 = (v & 2) == 0 ? 0 : n.v0(s);
        j.f(s1, "string");
        return s.lastIndexOf(s1, v1);
    }
}

