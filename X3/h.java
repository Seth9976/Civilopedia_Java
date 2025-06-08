package x3;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import x2.t;

public enum h {
    VISIBILITY(true),
    MODALITY(true),
    OVERRIDE(true),
    ANNOTATIONS(false),
    INNER(true),
    MEMBER_KIND(true),
    DATA(true),
    INLINE(true),
    EXPECT(true),
    ACTUAL(true),
    CONST(true),
    LATEINIT(true),
    FUN(true),
    VALUE(true);

    public final boolean i;
    public static final Set j;
    public static final Set k;

    static {
        Set set4;
        Set set2;
        h[] arr_h = (h[])h.z.clone();
        ArrayList arrayList0 = new ArrayList();
        for(int v = 0; v < arr_h.length; ++v) {
            h h0 = arr_h[v];
            if(h0.i) {
                arrayList0.add(h0);
            }
        }
        Set set0 = t.i;
        if(arrayList0 instanceof Collection) {
            int v1 = arrayList0.size();
            if(v1 != 0) {
                if(v1 == 1) {
                    Set set1 = Collections.singleton((arrayList0 instanceof List ? arrayList0.get(0) : arrayList0.iterator().next()));
                    if(set1 == null) {
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
                    set0 = set1;
                }
                else {
                    int v2 = arrayList0.size();
                    if(v2 >= 0) {
                        if(v2 < 3) {
                            ++v2;
                        }
                        else {
                            v2 = v2 >= 0x40000000 ? 0x7FFFFFFF : ((int)(((float)v2) / 0.75f + 1.0f));
                        }
                    }
                    set0 = new LinkedHashSet(v2);
                    for(Object object0: arrayList0) {
                        ((AbstractCollection)set0).add(object0);
                    }
                }
            }
        }
        else {
            LinkedHashSet linkedHashSet0 = new LinkedHashSet();
            for(Object object1: arrayList0) {
                linkedHashSet0.add(object1);
            }
            int v5 = linkedHashSet0.size();
            if(v5 != 0) {
                if(v5 == 1) {
                    Object object2 = linkedHashSet0.iterator().next();
                    Set set3 = Collections.singleton(object2);
                    if(set3 == null) {
                        NullPointerException nullPointerException1 = new NullPointerException("singleton(...) must not be null");
                        StackTraceElement[] arr_stackTraceElement1 = nullPointerException1.getStackTrace();
                        int v6 = -1;
                        for(int v7 = 0; v7 < arr_stackTraceElement1.length; ++v7) {
                            if("J2.j".equals(arr_stackTraceElement1[v7].getClassName())) {
                                v6 = v7;
                            }
                        }
                        nullPointerException1.setStackTrace(((StackTraceElement[])Arrays.copyOfRange(arr_stackTraceElement1, v6 + 1, arr_stackTraceElement1.length)));
                        throw nullPointerException1;
                    }
                    set0 = set3;
                }
                else {
                    set0 = linkedHashSet0;
                }
            }
        }
        set2 = set0;
        h.j = set2;
        Object[] arr_object = (h[])h.z.clone();
        if(arr_object == null) {
            StackTraceElement[] arr_stackTraceElement2 = Thread.currentThread().getStackTrace();
            int v9;
            for(v9 = 0; !arr_stackTraceElement2[v9].getClassName().equals("J2.j"); ++v9) {
            }
            while(arr_stackTraceElement2[v9].getClassName().equals("J2.j")) {
                ++v9;
            }
            StackTraceElement stackTraceElement0 = arr_stackTraceElement2[v9];
            NullPointerException nullPointerException2 = new NullPointerException("Parameter specified as non-null is null: method " + stackTraceElement0.getClassName() + "." + stackTraceElement0.getMethodName() + ", parameter " + "<this>");
            StackTraceElement[] arr_stackTraceElement3 = nullPointerException2.getStackTrace();
            int v10 = -1;
            for(int v11 = 0; v11 < arr_stackTraceElement3.length; ++v11) {
                if("J2.j".equals(arr_stackTraceElement3[v11].getClassName())) {
                    v10 = v11;
                }
            }
            nullPointerException2.setStackTrace(((StackTraceElement[])Arrays.copyOfRange(arr_stackTraceElement3, v10 + 1, arr_stackTraceElement3.length)));
            throw nullPointerException2;
        }
        switch(arr_object.length) {
            case 0: {
                set4 = t.i;
                break;
            }
            case 1: {
                Set set5 = Collections.singleton(arr_object[0]);
                if(set5 == null) {
                    NullPointerException nullPointerException3 = new NullPointerException("singleton(...) must not be null");
                    StackTraceElement[] arr_stackTraceElement4 = nullPointerException3.getStackTrace();
                    int v13 = -1;
                    for(int v14 = 0; v14 < arr_stackTraceElement4.length; ++v14) {
                        if("J2.j".equals(arr_stackTraceElement4[v14].getClassName())) {
                            v13 = v14;
                        }
                    }
                    nullPointerException3.setStackTrace(((StackTraceElement[])Arrays.copyOfRange(arr_stackTraceElement4, v13 + 1, arr_stackTraceElement4.length)));
                    throw nullPointerException3;
                }
                set4 = set5;
                break;
            }
            default: {
                int v12 = arr_object.length;
                if(v12 >= 0) {
                    if(v12 < 3) {
                        ++v12;
                    }
                    else {
                        v12 = v12 >= 0x40000000 ? 0x7FFFFFFF : ((int)(((float)v12) / 0.75f + 1.0f));
                    }
                }
                set4 = new LinkedHashSet(v12);
                for(int v8 = 0; v8 < arr_object.length; ++v8) {
                    set4.add(arr_object[v8]);
                }
            }
        }
        h.k = set4;
    }

    public h(boolean z) {
        this.i = z;
    }
}

