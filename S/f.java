package s;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParserException;

public final class f {
    public HashMap a;
    public static final int[] b;
    public static final SparseIntArray c;

    static {
        f.b = new int[]{0, 4, 8};
        SparseIntArray sparseIntArray0 = new SparseIntArray();
        f.c = sparseIntArray0;
        sparseIntArray0.append(55, 25);
        sparseIntArray0.append(56, 26);
        sparseIntArray0.append(58, 29);
        sparseIntArray0.append(59, 30);
        sparseIntArray0.append(0x40, 36);
        sparseIntArray0.append(0x3F, 35);
        sparseIntArray0.append(37, 4);
        sparseIntArray0.append(36, 3);
        sparseIntArray0.append(34, 1);
        sparseIntArray0.append(72, 6);
        sparseIntArray0.append(73, 7);
        sparseIntArray0.append(44, 17);
        sparseIntArray0.append(45, 18);
        sparseIntArray0.append(46, 19);
        sparseIntArray0.append(0, 27);
        sparseIntArray0.append(60, 0x20);
        sparseIntArray0.append(61, 33);
        sparseIntArray0.append(43, 10);
        sparseIntArray0.append(42, 9);
        sparseIntArray0.append(76, 13);
        sparseIntArray0.append(0x4F, 16);
        sparseIntArray0.append(77, 14);
        sparseIntArray0.append(74, 11);
        sparseIntArray0.append(78, 15);
        sparseIntArray0.append(75, 12);
        sparseIntArray0.append(67, 40);
        sparseIntArray0.append(53, 39);
        sparseIntArray0.append(52, 41);
        sparseIntArray0.append(66, 42);
        sparseIntArray0.append(51, 20);
        sparseIntArray0.append(65, 37);
        sparseIntArray0.append(41, 5);
        sparseIntArray0.append(54, 75);
        sparseIntArray0.append(62, 75);
        sparseIntArray0.append(57, 75);
        sparseIntArray0.append(35, 75);
        sparseIntArray0.append(33, 75);
        sparseIntArray0.append(5, 24);
        sparseIntArray0.append(7, 28);
        sparseIntArray0.append(23, 0x1F);
        sparseIntArray0.append(24, 8);
        sparseIntArray0.append(6, 34);
        sparseIntArray0.append(8, 2);
        sparseIntArray0.append(3, 23);
        sparseIntArray0.append(4, 21);
        sparseIntArray0.append(2, 22);
        sparseIntArray0.append(13, 43);
        sparseIntArray0.append(26, 44);
        sparseIntArray0.append(21, 45);
        sparseIntArray0.append(22, 46);
        sparseIntArray0.append(20, 60);
        sparseIntArray0.append(18, 0x2F);
        sparseIntArray0.append(19, 0x30);
        sparseIntArray0.append(14, 49);
        sparseIntArray0.append(15, 50);
        sparseIntArray0.append(16, 51);
        sparseIntArray0.append(17, 52);
        sparseIntArray0.append(25, 53);
        sparseIntArray0.append(68, 54);
        sparseIntArray0.append(0x2F, 55);
        sparseIntArray0.append(69, 56);
        sparseIntArray0.append(0x30, 57);
        sparseIntArray0.append(70, 58);
        sparseIntArray0.append(49, 59);
        sparseIntArray0.append(38, 61);
        sparseIntArray0.append(40, 62);
        sparseIntArray0.append(39, 0x3F);
        sparseIntArray0.append(1, 38);
        sparseIntArray0.append(71, 69);
        sparseIntArray0.append(50, 70);
        sparseIntArray0.append(29, 71);
        sparseIntArray0.append(28, 72);
        sparseIntArray0.append(30, 73);
        sparseIntArray0.append(27, 74);
    }

    public static int[] a(a a0, String s) {
        int v2;
        String[] arr_s = s.split(",");
        Context context0 = a0.getContext();
        int[] arr_v = new int[arr_s.length];
        int v = 0;
        int v1;
        for(v1 = 0; v < arr_s.length; ++v1) {
            String s1 = arr_s[v].trim();
            Object object0 = null;
            try {
                v2 = 0;
                v2 = h.class.getField(s1).getInt(null);
            }
            catch(Exception unused_ex) {
            }
            if(v2 == 0) {
                v2 = context0.getResources().getIdentifier(s1, "id", "com.spears.civilopedia");
            }
            if(v2 == 0 && a0.isInEditMode() && a0.getParent() instanceof ConstraintLayout) {
                ConstraintLayout constraintLayout0 = (ConstraintLayout)a0.getParent();
                constraintLayout0.getClass();
                if(s1 instanceof String && (constraintLayout0.u != null && constraintLayout0.u.containsKey(s1))) {
                    object0 = constraintLayout0.u.get(s1);
                }
                if(object0 != null && object0 instanceof Integer) {
                    v2 = (int)(((Integer)object0));
                }
            }
            arr_v[v1] = v2;
            ++v;
        }
        return v1 == arr_s.length ? arr_v : Arrays.copyOf(arr_v, v1);
    }

    public static e b(Context context0, AttributeSet attributeSet0) {
        e e0 = new e();
        TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, i.b);
        int v = typedArray0.getIndexCount();
        for(int v1 = 0; v1 < v; ++v1) {
            int v2 = typedArray0.getIndex(v1);
            SparseIntArray sparseIntArray0 = f.c;
            switch(sparseIntArray0.get(v2)) {
                case 1: {
                    e0.p = f.d(typedArray0, v2, e0.p);
                    break;
                }
                case 2: {
                    e0.G = typedArray0.getDimensionPixelSize(v2, e0.G);
                    break;
                }
                case 3: {
                    e0.o = f.d(typedArray0, v2, e0.o);
                    break;
                }
                case 4: {
                    e0.n = f.d(typedArray0, v2, e0.n);
                    break;
                }
                case 5: {
                    e0.w = typedArray0.getString(v2);
                    break;
                }
                case 6: {
                    e0.A = typedArray0.getDimensionPixelOffset(v2, e0.A);
                    break;
                }
                case 7: {
                    e0.B = typedArray0.getDimensionPixelOffset(v2, e0.B);
                    break;
                }
                case 8: {
                    e0.H = typedArray0.getDimensionPixelSize(v2, e0.H);
                    break;
                }
                case 9: {
                    e0.t = f.d(typedArray0, v2, e0.t);
                    break;
                }
                case 10: {
                    e0.s = f.d(typedArray0, v2, e0.s);
                    break;
                }
                case 11: {
                    e0.N = typedArray0.getDimensionPixelSize(v2, e0.N);
                    break;
                }
                case 12: {
                    e0.O = typedArray0.getDimensionPixelSize(v2, e0.O);
                    break;
                }
                case 13: {
                    e0.K = typedArray0.getDimensionPixelSize(v2, e0.K);
                    break;
                }
                case 14: {
                    e0.M = typedArray0.getDimensionPixelSize(v2, e0.M);
                    break;
                }
                case 15: {
                    e0.P = typedArray0.getDimensionPixelSize(v2, e0.P);
                    break;
                }
                case 16: {
                    e0.L = typedArray0.getDimensionPixelSize(v2, e0.L);
                    break;
                }
                case 17: {
                    e0.e = typedArray0.getDimensionPixelOffset(v2, e0.e);
                    break;
                }
                case 18: {
                    e0.f = typedArray0.getDimensionPixelOffset(v2, e0.f);
                    break;
                }
                case 19: {
                    e0.g = typedArray0.getFloat(v2, e0.g);
                    break;
                }
                case 20: {
                    e0.u = typedArray0.getFloat(v2, e0.u);
                    break;
                }
                case 21: {
                    e0.c = typedArray0.getLayoutDimension(v2, e0.c);
                    break;
                }
                case 22: {
                    e0.J = f.b[typedArray0.getInt(v2, e0.J)];
                    break;
                }
                case 23: {
                    e0.b = typedArray0.getLayoutDimension(v2, e0.b);
                    break;
                }
                case 24: {
                    e0.D = typedArray0.getDimensionPixelSize(v2, e0.D);
                    break;
                }
                case 25: {
                    e0.h = f.d(typedArray0, v2, e0.h);
                    break;
                }
                case 26: {
                    e0.i = f.d(typedArray0, v2, e0.i);
                    break;
                }
                case 27: {
                    e0.C = typedArray0.getInt(v2, e0.C);
                    break;
                }
                case 28: {
                    e0.E = typedArray0.getDimensionPixelSize(v2, e0.E);
                    break;
                }
                case 29: {
                    e0.j = f.d(typedArray0, v2, e0.j);
                    break;
                }
                case 30: {
                    e0.k = f.d(typedArray0, v2, e0.k);
                    break;
                }
                case 0x1F: {
                    e0.I = typedArray0.getDimensionPixelSize(v2, e0.I);
                    break;
                }
                case 0x20: {
                    e0.q = f.d(typedArray0, v2, e0.q);
                    break;
                }
                case 33: {
                    e0.r = f.d(typedArray0, v2, e0.r);
                    break;
                }
                case 34: {
                    e0.F = typedArray0.getDimensionPixelSize(v2, e0.F);
                    break;
                }
                case 35: {
                    e0.m = f.d(typedArray0, v2, e0.m);
                    break;
                }
                case 36: {
                    e0.l = f.d(typedArray0, v2, e0.l);
                    break;
                }
                case 37: {
                    e0.v = typedArray0.getFloat(v2, e0.v);
                    break;
                }
                case 38: {
                    e0.d = typedArray0.getResourceId(v2, e0.d);
                    break;
                }
                case 39: {
                    e0.R = typedArray0.getFloat(v2, e0.R);
                    break;
                }
                case 40: {
                    e0.Q = typedArray0.getFloat(v2, e0.Q);
                    break;
                }
                case 41: {
                    e0.S = typedArray0.getInt(v2, e0.S);
                    break;
                }
                case 42: {
                    e0.T = typedArray0.getInt(v2, e0.T);
                    break;
                }
                case 43: {
                    e0.U = typedArray0.getFloat(v2, e0.U);
                    break;
                }
                case 44: {
                    e0.V = true;
                    e0.W = typedArray0.getDimension(v2, e0.W);
                    break;
                }
                case 45: {
                    e0.Y = typedArray0.getFloat(v2, e0.Y);
                    break;
                }
                case 46: {
                    e0.Z = typedArray0.getFloat(v2, e0.Z);
                    break;
                }
                case 0x2F: {
                    e0.a0 = typedArray0.getFloat(v2, e0.a0);
                    break;
                }
                case 0x30: {
                    e0.b0 = typedArray0.getFloat(v2, e0.b0);
                    break;
                }
                case 49: {
                    e0.c0 = typedArray0.getFloat(v2, e0.c0);
                    break;
                }
                case 50: {
                    e0.d0 = typedArray0.getFloat(v2, e0.d0);
                    break;
                }
                case 51: {
                    e0.e0 = typedArray0.getDimension(v2, e0.e0);
                    break;
                }
                case 52: {
                    e0.f0 = typedArray0.getDimension(v2, e0.f0);
                    break;
                }
                case 53: {
                    e0.g0 = typedArray0.getDimension(v2, e0.g0);
                    break;
                }
                case 60: {
                    e0.X = typedArray0.getFloat(v2, e0.X);
                    break;
                }
                case 61: {
                    e0.x = f.d(typedArray0, v2, e0.x);
                    break;
                }
                case 62: {
                    e0.y = typedArray0.getDimensionPixelSize(v2, e0.y);
                    break;
                }
                case 0x3F: {
                    e0.z = typedArray0.getFloat(v2, e0.z);
                    break;
                }
                case 69: {
                    e0.l0 = typedArray0.getFloat(v2, 1.0f);
                    break;
                }
                case 70: {
                    e0.m0 = typedArray0.getFloat(v2, 1.0f);
                    break;
                }
                case 71: {
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    break;
                }
                case 72: {
                    e0.o0 = typedArray0.getInt(v2, e0.o0);
                    break;
                }
                case 73: {
                    e0.r0 = typedArray0.getString(v2);
                    break;
                }
                case 74: {
                    e0.n0 = typedArray0.getBoolean(v2, e0.n0);
                    break;
                }
                case 75: {
                    Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(v2) + "   " + sparseIntArray0.get(v2));
                    break;
                }
                default: {
                    Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(v2) + "   " + sparseIntArray0.get(v2));
                }
            }
        }
        typedArray0.recycle();
        return e0;
    }

    public final void c(Context context0, int v) {
        XmlResourceParser xmlResourceParser0 = context0.getResources().getXml(v);
        try {
            int v1 = xmlResourceParser0.getEventType();
            while(true) {
                switch(v1) {
                    case 0: {
                        xmlResourceParser0.getName();
                        v1 = xmlResourceParser0.next();
                        break;
                    }
                    case 1: {
                        return;
                    }
                    default: {
                        if(v1 == 2) {
                            String s = xmlResourceParser0.getName();
                            e e0 = f.b(context0, Xml.asAttributeSet(xmlResourceParser0));
                            if(s.equalsIgnoreCase("Guideline")) {
                                e0.a = true;
                            }
                            this.a.put(e0.d, e0);
                        }
                        v1 = xmlResourceParser0.next();
                        break;
                    }
                }
            }
            goto label_18;
        }
        catch(XmlPullParserException xmlPullParserException0) {
        }
        catch(IOException iOException0) {
            goto label_18;
        }
        xmlPullParserException0.printStackTrace();
        return;
    label_18:
        iOException0.printStackTrace();
    }

    public static int d(TypedArray typedArray0, int v, int v1) {
        int v2 = typedArray0.getResourceId(v, v1);
        return v2 == -1 ? typedArray0.getInt(v, -1) : v2;
    }
}

