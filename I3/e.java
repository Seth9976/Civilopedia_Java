package i3;

import J2.j;
import J2.s;
import Q1.b;
import android.support.v4.media.session.a;
import android.view.View;
import android.widget.LinearLayout;
import j2.c;
import java.util.ArrayList;
import java.util.Iterator;

public abstract class e {
    public static int a(int v) {
        int v1 = 1;
        if(v != 1 && v != 2) {
            v1 = 3;
            switch(v) {
                case 3: {
                    break;
                }
                case 4: {
                    return 4;
                }
                default: {
                    throw null;
                }
            }
        }
        return v1;
    }

    public static boolean b(int v) {
        switch(v) {
            case 1: 
            case 2: {
                return false;
            }
            case 3: {
                return true;
            }
            case 4: {
                return true;
            }
            default: {
                throw null;
            }
        }
    }

    public static View c(LinearLayout linearLayout0, int v, int v1) {
        linearLayout0.getBackground().setAlpha(v);
        return linearLayout0.findViewById(v1);
    }

    public static String d(int v, String s) [...] // Inlined contents

    public static String e(s s0, Class class0, StringBuilder stringBuilder0) {
        stringBuilder0.append(s0.b(class0));
        return stringBuilder0.toString();
    }

    public static String f(String s, String s1, String s2) {
        return s + s1 + s2;
    }

    public static String g(StringBuilder stringBuilder0, int v, String s) {
        stringBuilder0.append(v);
        stringBuilder0.append(s);
        return stringBuilder0.toString();
    }

    public static String h(StringBuilder stringBuilder0, String s, String s1) {
        stringBuilder0.append(s);
        stringBuilder0.append(s1);
        return stringBuilder0.toString();
    }

    public static String i(StringBuilder stringBuilder0, String s, String s1, String s2, String s3) {
        stringBuilder0.append(s);
        stringBuilder0.append(s1);
        stringBuilder0.append(s2);
        stringBuilder0.append(s3);
        return stringBuilder0.toString();
    }

    public static StringBuilder j(String s, String s1, String s2, String s3, String s4) [...] // Inlined contents

    public static Iterator k(String s, Object[] arr_object, b b0, ArrayList arrayList0) {
        b0.a(a.H(s, arr_object));
        return arrayList0.iterator();
    }

    public static void l(Integer integer0, String s, String s1, String s2, StringBuilder stringBuilder0) {
        stringBuilder0.append(integer0);
        stringBuilder0.append(s);
        stringBuilder0.append(s1);
        stringBuilder0.append(s2);
    }

    public static boolean m(c c0, String s) {
        return j.a(s, c0.p().a());
    }

    public static String n(int v) {
        switch(v) {
            case 1: {
                return "NONE";
            }
            case 2: {
                return "LEFT";
            }
            case 3: {
                return "TOP";
            }
            case 4: {
                return "RIGHT";
            }
            case 5: {
                return "BOTTOM";
            }
            case 6: {
                return "BASELINE";
            }
            case 7: {
                return "CENTER";
            }
            case 8: {
                return "CENTER_X";
            }
            case 9: {
                return "CENTER_Y";
            }
            default: {
                throw null;
            }
        }
    }
}

