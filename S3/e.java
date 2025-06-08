package s3;

import q3.A;
import q3.f0;
import q3.i;
import q3.z;

public abstract class e {
    public static final b A;
    public static final b B;
    public static final b C;
    public static final b D;
    public static final b E;
    public static final b F;
    public static final b G;
    public static final b H;
    public static final b I;
    public static final b J;
    public static final b K;
    public static final b L;
    public static final b M;
    public static final b N;
    public static final b a;
    public static final b b;
    public static final b c;
    public static final c d;
    public static final c e;
    public static final c f;
    public static final b g;
    public static final b h;
    public static final b i;
    public static final b j;
    public static final b k;
    public static final b l;
    public static final b m;
    public static final b n;
    public static final b o;
    public static final c p;
    public static final b q;
    public static final b r;
    public static final b s;
    public static final b t;
    public static final b u;
    public static final b v;
    public static final b w;
    public static final b x;
    public static final b y;
    public static final b z;

    static {
        b b0 = d.b();
        e.a = b0;
        e.b = d.a(b0);
        b b1 = d.b();
        e.c = b1;
        f0[] arr_f0 = f0.values();
        int v = b1.a + b1.b;
        c c0 = new c(v, arr_f0);
        e.d = c0;
        A[] arr_a = A.values();
        int v1 = v + c0.b;
        c c1 = new c(v1, arr_a);
        e.e = c1;
        i[] arr_i = i.values();
        c c2 = new c(v1 + c1.b, arr_i);
        e.f = c2;
        b b2 = d.a(c2);
        e.g = b2;
        b b3 = d.a(b2);
        e.h = b3;
        b b4 = d.a(b3);
        e.i = b4;
        b b5 = d.a(b4);
        e.j = b5;
        b b6 = d.a(b5);
        e.k = b6;
        b b7 = d.a(b6);
        e.l = b7;
        e.m = d.a(b7);
        b b8 = d.a(c0);
        e.n = b8;
        e.o = d.a(b8);
        z[] arr_z = z.values();
        c c3 = new c(v1 + c1.b, arr_z);
        e.p = c3;
        b b9 = d.a(c3);
        e.q = b9;
        b b10 = d.a(b9);
        e.r = b10;
        b b11 = d.a(b10);
        e.s = b11;
        b b12 = d.a(b11);
        e.t = b12;
        b b13 = d.a(b12);
        e.u = b13;
        b b14 = d.a(b13);
        e.v = b14;
        b b15 = d.a(b14);
        e.w = b15;
        e.x = d.a(b15);
        b b16 = d.a(c3);
        e.y = b16;
        b b17 = d.a(b16);
        e.z = b17;
        b b18 = d.a(b17);
        e.A = b18;
        b b19 = d.a(b18);
        e.B = b19;
        b b20 = d.a(b19);
        e.C = b20;
        b b21 = d.a(b20);
        e.D = b21;
        b b22 = d.a(b21);
        e.E = b22;
        b b23 = d.a(b22);
        e.F = b23;
        e.G = d.a(b23);
        b b24 = d.a(b1);
        e.H = b24;
        b b25 = d.a(b24);
        e.I = b25;
        e.J = d.a(b25);
        b b26 = d.a(c1);
        e.K = b26;
        b b27 = d.a(b26);
        e.L = b27;
        e.M = d.a(b27);
        e.N = d.b();
    }

    public static void a(int v) {
        Object[] arr_object = new Object[3];
        switch(v) {
            case 2: {
                arr_object[0] = "kind";
                break;
            }
            case 6: 
            case 9: {
                arr_object[0] = "memberKind";
                break;
            }
            case 1: 
            case 5: 
            case 8: 
            case 11: {
                arr_object[0] = "modality";
                break;
            }
            default: {
                arr_object[0] = "visibility";
            }
        }
        arr_object[1] = "kotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags";
        switch(v) {
            case 3: {
                arr_object[2] = "getConstructorFlags";
                break;
            }
            case 4: 
            case 5: 
            case 6: {
                arr_object[2] = "getFunctionFlags";
                break;
            }
            case 7: 
            case 8: 
            case 9: {
                arr_object[2] = "getPropertyFlags";
                break;
            }
            case 10: 
            case 11: {
                arr_object[2] = "getAccessorFlags";
                break;
            }
            default: {
                arr_object[2] = "getClassFlags";
            }
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter \'%s\' of %s.%s must not be null", arr_object));
    }
}

