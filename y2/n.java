package Y2;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import w2.e;

// 部分失败：枚举糖化
// 枚举按原样呈现，而不是糖化为Java 5枚举。
public final class n extends Enum {
    public static final enum n A;
    public static final enum n B;
    public static final enum n C;
    public static final enum n D;
    public static final enum n E;
    public static final enum n F;
    public static final enum n G;
    public static final enum n H;
    public static final enum n I;
    public static final enum n J;
    public static final enum n K;
    public static final enum n L;
    public static final enum n M;
    public static final enum n N;
    public static final enum n O;
    public static final enum n P;
    public static final enum n Q;
    public static final n[] R;
    public final boolean i;
    public static final HashMap j;
    public static final List k;
    public static final List l;
    public static final List m;
    public static final List n;
    public static final List o;
    public static final List p;
    public static final List q;
    public static final List r;
    public static final List s;
    public static final List t;
    public static final List u;
    public static final List v;
    public static final enum n w;
    public static final enum n x;
    public static final enum n y;
    public static final enum n z;

    static {
        n.w = new n("CLASS", 0, true);
        n.x = new n("ANNOTATION_CLASS", 1, true);
        n.y = new n("TYPE_PARAMETER", 2, false);
        n.z = new n("PROPERTY", 3, true);
        n.A = new n("FIELD", 4, true);
        n.B = new n("LOCAL_VARIABLE", 5, true);
        n.C = new n("VALUE_PARAMETER", 6, true);
        n.D = new n("CONSTRUCTOR", 7, true);
        n.E = new n("FUNCTION", 8, true);
        n.F = new n("PROPERTY_GETTER", 9, true);
        n.G = new n("PROPERTY_SETTER", 10, true);
        n.H = new n("TYPE", 11, false);
        n n0 = new n("EXPRESSION", 12, false);
        n.I = new n("FILE", 13, false);
        n n1 = new n("TYPEALIAS", 14, false);
        n n2 = new n("TYPE_PROJECTION", 15, false);
        n n3 = new n("STAR_PROJECTION", 16, false);
        n n4 = new n("PROPERTY_PARAMETER", 17, false);
        n.J = new n("CLASS_ONLY", 18, false);
        n.K = new n("OBJECT", 19, false);
        n.L = new n("STANDALONE_OBJECT", 20, false);
        n.M = new n("COMPANION_OBJECT", 21, false);
        n.N = new n("INTERFACE", 22, false);
        n.O = new n("ENUM_CLASS", 23, false);
        n.P = new n("ENUM_ENTRY", 24, false);
        n.Q = new n("LOCAL_CLASS", 25, false);
        n.R = new n[]{n.w, n.x, n.y, n.z, n.A, n.B, n.C, n.D, n.E, n.F, n.G, n.H, n0, n.I, n1, n2, n3, n4, n.J, n.K, n.L, n.M, n.N, n.O, n.P, n.Q, new n("LOCAL_FUNCTION", 26, false), new n("MEMBER_FUNCTION", 27, false), new n("TOP_LEVEL_FUNCTION", 28, false), new n("MEMBER_PROPERTY", 29, false), new n("MEMBER_PROPERTY_WITH_BACKING_FIELD", 30, false), new n("MEMBER_PROPERTY_WITH_DELEGATE", 0x1F, false), new n("MEMBER_PROPERTY_WITHOUT_FIELD_OR_DELEGATE", 0x20, false), new n("TOP_LEVEL_PROPERTY", 33, false), new n("TOP_LEVEL_PROPERTY_WITH_BACKING_FIELD", 34, false), new n("TOP_LEVEL_PROPERTY_WITH_DELEGATE", 35, false), new n("TOP_LEVEL_PROPERTY_WITHOUT_FIELD_OR_DELEGATE", 36, false), new n("BACKING_FIELD", 37, true), new n("INITIALIZER", 38, false), new n("DESTRUCTURING_DECLARATION", 39, false), new n("LAMBDA_EXPRESSION", 40, false), new n("ANONYMOUS_FUNCTION", 41, false), new n("OBJECT_LITERAL", 42, false)};
        n.j = new HashMap();
        n[] arr_n = (n[])n.R.clone();
        for(int v = 0; v < arr_n.length; ++v) {
            n.j.put("OBJECT_LITERAL", arr_n[v]);
        }
        n[] arr_n1 = (n[])n.R.clone();
        ArrayList arrayList0 = new ArrayList();
        for(int v1 = 0; v1 < arr_n1.length; ++v1) {
            n n5 = arr_n1[v1];
            if(n5.i) {
                arrayList0.add(n5);
            }
        }
        if(arrayList0 instanceof Collection) {
            int v2 = arrayList0.size();
            if(v2 != 0) {
                if(v2 != 1) {
                    int v5 = arrayList0.size();
                    if(v5 >= 0) {
                        if(v5 < 3) {
                            ++v5;
                        }
                        else {
                            v5 = v5 >= 0x40000000 ? 0x7FFFFFFF : ((int)(((float)v5) / 0.75f + 1.0f));
                        }
                    }
                    AbstractCollection abstractCollection0 = new LinkedHashSet(v5);
                    for(Object object0: arrayList0) {
                        abstractCollection0.add(object0);
                    }
                }
                else if(Collections.singleton((arrayList0 instanceof List ? arrayList0.get(0) : arrayList0.iterator().next())) == null) {
                    NullPointerException nullPointerException0 = new NullPointerException("singleton(...) must not be null");
                    StackTraceElement[] arr_stackTraceElement = nullPointerException0.getStackTrace();
                    int v3 = -1;
                    for(int v4 = 0; v4 < arr_stackTraceElement.length; ++v4) {
                        if("J2.j".equals(arr_stackTraceElement[v4].getClassName())) {
                            v3 = v4;
                        }
                    }
                    nullPointerException0.setStackTrace(((StackTraceElement[])Arrays.copyOfRange(arr_stackTraceElement, v3 + 1, arr_stackTraceElement.length)));
                    throw nullPointerException0;
                }
            }
        }
        else {
            LinkedHashSet linkedHashSet0 = new LinkedHashSet();
            for(Object object1: arrayList0) {
                linkedHashSet0.add(object1);
            }
            int v6 = linkedHashSet0.size();
            if(v6 != 0 && v6 == 1) {
                Object object2 = linkedHashSet0.iterator().next();
                if(Collections.singleton(object2) == null) {
                    NullPointerException nullPointerException1 = new NullPointerException("singleton(...) must not be null");
                    StackTraceElement[] arr_stackTraceElement1 = nullPointerException1.getStackTrace();
                    int v7 = -1;
                    for(int v8 = 0; v8 < arr_stackTraceElement1.length; ++v8) {
                        if("J2.j".equals(arr_stackTraceElement1[v8].getClassName())) {
                            v7 = v8;
                        }
                    }
                    nullPointerException1.setStackTrace(((StackTraceElement[])Arrays.copyOfRange(arr_stackTraceElement1, v7 + 1, arr_stackTraceElement1.length)));
                    throw nullPointerException1;
                }
            }
        }
        Object[] arr_object = (n[])n.R.clone();
        if(arr_object == null) {
            StackTraceElement[] arr_stackTraceElement2 = Thread.currentThread().getStackTrace();
            int v10;
            for(v10 = 0; !arr_stackTraceElement2[v10].getClassName().equals("J2.j"); ++v10) {
            }
            while(arr_stackTraceElement2[v10].getClassName().equals("J2.j")) {
                ++v10;
            }
            StackTraceElement stackTraceElement0 = arr_stackTraceElement2[v10];
            NullPointerException nullPointerException2 = new NullPointerException("Parameter specified as non-null is null: method " + stackTraceElement0.getClassName() + "." + stackTraceElement0.getMethodName() + ", parameter " + "<this>");
            StackTraceElement[] arr_stackTraceElement3 = nullPointerException2.getStackTrace();
            int v11 = -1;
            for(int v12 = 0; v12 < arr_stackTraceElement3.length; ++v12) {
                if("J2.j".equals(arr_stackTraceElement3[v12].getClassName())) {
                    v11 = v12;
                }
            }
            nullPointerException2.setStackTrace(((StackTraceElement[])Arrays.copyOfRange(arr_stackTraceElement3, v11 + 1, arr_stackTraceElement3.length)));
            throw nullPointerException2;
        }
        switch(arr_object.length) {
            case 0: {
                break;
            }
            case 1: {
                if(Collections.singleton(arr_object[0]) == null) {
                    NullPointerException nullPointerException3 = new NullPointerException("singleton(...) must not be null");
                    StackTraceElement[] arr_stackTraceElement4 = nullPointerException3.getStackTrace();
                    int v14 = -1;
                    for(int v15 = 0; v15 < arr_stackTraceElement4.length; ++v15) {
                        if("J2.j".equals(arr_stackTraceElement4[v15].getClassName())) {
                            v14 = v15;
                        }
                    }
                    nullPointerException3.setStackTrace(((StackTraceElement[])Arrays.copyOfRange(arr_stackTraceElement4, v14 + 1, arr_stackTraceElement4.length)));
                    throw nullPointerException3;
                }
                break;
            }
            default: {
                int v13 = arr_object.length;
                if(v13 >= 0) {
                    if(v13 < 3) {
                        ++v13;
                    }
                    else {
                        v13 = v13 >= 0x40000000 ? 0x7FFFFFFF : ((int)(((float)v13) / 0.75f + 1.0f));
                    }
                }
                Set set0 = new LinkedHashSet(v13);
                for(int v9 = 0; v9 < arr_object.length; ++v9) {
                    set0.add(arr_object[v9]);
                }
            }
        }
        List list0 = Arrays.asList(new n[]{n.x, n.w});
        if(list0 == null) {
            NullPointerException nullPointerException4 = new NullPointerException("asList(...) must not be null");
            StackTraceElement[] arr_stackTraceElement5 = nullPointerException4.getStackTrace();
            int v16 = -1;
            for(int v17 = 0; v17 < arr_stackTraceElement5.length; ++v17) {
                if("J2.j".equals(arr_stackTraceElement5[v17].getClassName())) {
                    v16 = v17;
                }
            }
            nullPointerException4.setStackTrace(((StackTraceElement[])Arrays.copyOfRange(arr_stackTraceElement5, v16 + 1, arr_stackTraceElement5.length)));
            throw nullPointerException4;
        }
        n.k = list0;
        List list1 = Arrays.asList(new n[]{n.Q, n.w});
        if(list1 == null) {
            NullPointerException nullPointerException5 = new NullPointerException("asList(...) must not be null");
            StackTraceElement[] arr_stackTraceElement6 = nullPointerException5.getStackTrace();
            int v18 = -1;
            for(int v19 = 0; v19 < arr_stackTraceElement6.length; ++v19) {
                if("J2.j".equals(arr_stackTraceElement6[v19].getClassName())) {
                    v18 = v19;
                }
            }
            nullPointerException5.setStackTrace(((StackTraceElement[])Arrays.copyOfRange(arr_stackTraceElement6, v18 + 1, arr_stackTraceElement6.length)));
            throw nullPointerException5;
        }
        n.l = list1;
        List list2 = Arrays.asList(new n[]{n.J, n.w});
        if(list2 == null) {
            NullPointerException nullPointerException6 = new NullPointerException("asList(...) must not be null");
            StackTraceElement[] arr_stackTraceElement7 = nullPointerException6.getStackTrace();
            int v20 = -1;
            for(int v21 = 0; v21 < arr_stackTraceElement7.length; ++v21) {
                if("J2.j".equals(arr_stackTraceElement7[v21].getClassName())) {
                    v20 = v21;
                }
            }
            nullPointerException6.setStackTrace(((StackTraceElement[])Arrays.copyOfRange(arr_stackTraceElement7, v20 + 1, arr_stackTraceElement7.length)));
            throw nullPointerException6;
        }
        n.m = list2;
        List list3 = Arrays.asList(new n[]{n.M, n.K, n.w});
        if(list3 == null) {
            NullPointerException nullPointerException7 = new NullPointerException("asList(...) must not be null");
            StackTraceElement[] arr_stackTraceElement8 = nullPointerException7.getStackTrace();
            int v22 = -1;
            for(int v23 = 0; v23 < arr_stackTraceElement8.length; ++v23) {
                if("J2.j".equals(arr_stackTraceElement8[v23].getClassName())) {
                    v22 = v23;
                }
            }
            nullPointerException7.setStackTrace(((StackTraceElement[])Arrays.copyOfRange(arr_stackTraceElement8, v22 + 1, arr_stackTraceElement8.length)));
            throw nullPointerException7;
        }
        n.n = list3;
        List list4 = Arrays.asList(new n[]{n.L, n.K, n.w});
        if(list4 == null) {
            NullPointerException nullPointerException8 = new NullPointerException("asList(...) must not be null");
            StackTraceElement[] arr_stackTraceElement9 = nullPointerException8.getStackTrace();
            int v24 = -1;
            for(int v25 = 0; v25 < arr_stackTraceElement9.length; ++v25) {
                if("J2.j".equals(arr_stackTraceElement9[v25].getClassName())) {
                    v24 = v25;
                }
            }
            nullPointerException8.setStackTrace(((StackTraceElement[])Arrays.copyOfRange(arr_stackTraceElement9, v24 + 1, arr_stackTraceElement9.length)));
            throw nullPointerException8;
        }
        n.o = list4;
        List list5 = Arrays.asList(new n[]{n.N, n.w});
        if(list5 == null) {
            NullPointerException nullPointerException9 = new NullPointerException("asList(...) must not be null");
            StackTraceElement[] arr_stackTraceElement10 = nullPointerException9.getStackTrace();
            int v26 = -1;
            for(int v27 = 0; v27 < arr_stackTraceElement10.length; ++v27) {
                if("J2.j".equals(arr_stackTraceElement10[v27].getClassName())) {
                    v26 = v27;
                }
            }
            nullPointerException9.setStackTrace(((StackTraceElement[])Arrays.copyOfRange(arr_stackTraceElement10, v26 + 1, arr_stackTraceElement10.length)));
            throw nullPointerException9;
        }
        n.p = list5;
        List list6 = Arrays.asList(new n[]{n.O, n.w});
        if(list6 == null) {
            NullPointerException nullPointerException10 = new NullPointerException("asList(...) must not be null");
            StackTraceElement[] arr_stackTraceElement11 = nullPointerException10.getStackTrace();
            int v28 = -1;
            for(int v29 = 0; v29 < arr_stackTraceElement11.length; ++v29) {
                if("J2.j".equals(arr_stackTraceElement11[v29].getClassName())) {
                    v28 = v29;
                }
            }
            nullPointerException10.setStackTrace(((StackTraceElement[])Arrays.copyOfRange(arr_stackTraceElement11, v28 + 1, arr_stackTraceElement11.length)));
            throw nullPointerException10;
        }
        n.q = list6;
        List list7 = Arrays.asList(new n[]{n.P, n.z, n.A});
        if(list7 == null) {
            NullPointerException nullPointerException11 = new NullPointerException("asList(...) must not be null");
            StackTraceElement[] arr_stackTraceElement12 = nullPointerException11.getStackTrace();
            int v30 = -1;
            for(int v31 = 0; v31 < arr_stackTraceElement12.length; ++v31) {
                if("J2.j".equals(arr_stackTraceElement12[v31].getClassName())) {
                    v30 = v31;
                }
            }
            nullPointerException11.setStackTrace(((StackTraceElement[])Arrays.copyOfRange(arr_stackTraceElement12, v30 + 1, arr_stackTraceElement12.length)));
            throw nullPointerException11;
        }
        n.r = list7;
        List list8 = Collections.singletonList(n.G);
        if(list8 == null) {
            NullPointerException nullPointerException12 = new NullPointerException("singletonList(...) must not be null");
            StackTraceElement[] arr_stackTraceElement13 = nullPointerException12.getStackTrace();
            int v32 = -1;
            for(int v33 = 0; v33 < arr_stackTraceElement13.length; ++v33) {
                if("J2.j".equals(arr_stackTraceElement13[v33].getClassName())) {
                    v32 = v33;
                }
            }
            nullPointerException12.setStackTrace(((StackTraceElement[])Arrays.copyOfRange(arr_stackTraceElement13, v32 + 1, arr_stackTraceElement13.length)));
            throw nullPointerException12;
        }
        n.s = list8;
        List list9 = Collections.singletonList(n.F);
        if(list9 == null) {
            NullPointerException nullPointerException13 = new NullPointerException("singletonList(...) must not be null");
            StackTraceElement[] arr_stackTraceElement14 = nullPointerException13.getStackTrace();
            int v34 = -1;
            for(int v35 = 0; v35 < arr_stackTraceElement14.length; ++v35) {
                if("J2.j".equals(arr_stackTraceElement14[v35].getClassName())) {
                    v34 = v35;
                }
            }
            nullPointerException13.setStackTrace(((StackTraceElement[])Arrays.copyOfRange(arr_stackTraceElement14, v34 + 1, arr_stackTraceElement14.length)));
            throw nullPointerException13;
        }
        n.t = list9;
        List list10 = Collections.singletonList(n.E);
        if(list10 == null) {
            NullPointerException nullPointerException14 = new NullPointerException("singletonList(...) must not be null");
            StackTraceElement[] arr_stackTraceElement15 = nullPointerException14.getStackTrace();
            int v36 = -1;
            for(int v37 = 0; v37 < arr_stackTraceElement15.length; ++v37) {
                if("J2.j".equals(arr_stackTraceElement15[v37].getClassName())) {
                    v36 = v37;
                }
            }
            nullPointerException14.setStackTrace(((StackTraceElement[])Arrays.copyOfRange(arr_stackTraceElement15, v36 + 1, arr_stackTraceElement15.length)));
            throw nullPointerException14;
        }
        n.u = list10;
        List list11 = Collections.singletonList(n.I);
        if(list11 == null) {
            NullPointerException nullPointerException15 = new NullPointerException("singletonList(...) must not be null");
            StackTraceElement[] arr_stackTraceElement16 = nullPointerException15.getStackTrace();
            int v38 = -1;
            for(int v39 = 0; v39 < arr_stackTraceElement16.length; ++v39) {
                if("J2.j".equals(arr_stackTraceElement16[v39].getClassName())) {
                    v38 = v39;
                }
            }
            nullPointerException15.setStackTrace(((StackTraceElement[])Arrays.copyOfRange(arr_stackTraceElement16, v38 + 1, arr_stackTraceElement16.length)));
            throw nullPointerException15;
        }
        n.v = list11;
        e[] arr_e = {new e(d.p, n.C), new e(d.j, n.A), new e(d.l, n.z), new e(d.k, n.I), new e(d.m, n.F), new e(d.n, n.G), new e(d.o, n.C), new e(d.q, n.C), new e(d.r, n.A)};
        HashMap hashMap0 = new LinkedHashMap(13);
        for(int v40 = 0; v40 < 9; ++v40) {
            e e0 = arr_e[v40];
            hashMap0.put(e0.i, e0.j);
        }
    }

    public n(String s, int v, boolean z) {
        super(s, v);
        this.i = z;
    }

    public static n valueOf(String s) {
        return (n)Enum.valueOf(n.class, s);
    }

    public static n[] values() [...] // Inlined contents
}

