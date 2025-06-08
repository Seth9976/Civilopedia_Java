package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.ads.b9;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.TreeSet;

public abstract class j0 {
    public static final w0 a;
    public static final x0 b;

    static {
        j0.a = new w0();  // 初始化器: Ljava/lang/Object;-><init>()V
        j0.b = new x0();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    public static int a(byte[] arr_b, int v, b9 b90) {
        int v1 = j0.o(arr_b, v, b90);
        int v2 = b90.a;
        if(v2 < 0) {
            throw zzko.b();
        }
        if(v2 > arr_b.length - v1) {
            throw zzko.d();
        }
        if(v2 == 0) {
            b90.c = zzjd.zzb;
            return v1;
        }
        b90.c = zzjd.zzl(arr_b, v1, v2);
        return v1 + v2;
    }

    public static String b(zzjd zzjd0) {
        StringBuilder stringBuilder0 = new StringBuilder(zzjd0.zzd());
        for(int v = 0; v < zzjd0.zzd(); ++v) {
            int v1 = zzjd0.zza(v);
            switch(v1) {
                case 7: {
                    stringBuilder0.append("\\a");
                    break;
                }
                case 8: {
                    stringBuilder0.append("\\b");
                    break;
                }
                case 9: {
                    stringBuilder0.append("\\t");
                    break;
                }
                case 10: {
                    stringBuilder0.append("\\n");
                    break;
                }
                case 11: {
                    stringBuilder0.append("\\v");
                    break;
                }
                case 12: {
                    stringBuilder0.append("\\f");
                    break;
                }
                case 13: {
                    stringBuilder0.append("\\r");
                    break;
                }
                case 34: {
                    stringBuilder0.append("\\\"");
                    break;
                }
                case 39: {
                    stringBuilder0.append("\\\'");
                    break;
                }
                case 92: {
                    stringBuilder0.append("\\\\");
                    break;
                }
                default: {
                    if(v1 < 0x20 || v1 > 0x7E) {
                        stringBuilder0.append('\\');
                        stringBuilder0.append(((char)((v1 >>> 6 & 3) + 0x30)));
                        stringBuilder0.append(((char)((v1 >>> 3 & 7) + 0x30)));
                        stringBuilder0.append(((char)((v1 & 7) + 0x30)));
                    }
                    else {
                        stringBuilder0.append(((char)v1));
                    }
                }
            }
        }
        return stringBuilder0.toString();
    }

    public static int c(byte[] arr_b, int v) {
        return (arr_b[v + 3] & 0xFF) << 24 | (arr_b[v] & 0xFF | (arr_b[v + 1] & 0xFF) << 8 | (arr_b[v + 2] & 0xFF) << 16);
    }

    public static final void d(StringBuilder stringBuilder0, int v, String s, Object object0) {
        if(object0 instanceof List) {
            for(Object object1: ((List)object0)) {
                j0.d(stringBuilder0, v, s, object1);
            }
            return;
        }
        if(object0 instanceof Map) {
            for(Object object2: ((Map)object0).entrySet()) {
                j0.d(stringBuilder0, v, s, ((Map.Entry)object2));
            }
            return;
        }
        stringBuilder0.append('\n');
        for(int v2 = 0; v2 < v; ++v2) {
            stringBuilder0.append(' ');
        }
        stringBuilder0.append(s);
        if(object0 instanceof String) {
            stringBuilder0.append(": \"");
            stringBuilder0.append(j0.b(zzjd.zzm(((String)object0))));
            stringBuilder0.append('\"');
            return;
        }
        if(object0 instanceof zzjd) {
            stringBuilder0.append(": \"");
            stringBuilder0.append(j0.b(((zzjd)object0)));
            stringBuilder0.append('\"');
            return;
        }
        if(object0 instanceof zzke) {
            stringBuilder0.append(" {");
            j0.h(((zzke)object0), stringBuilder0, v + 2);
            stringBuilder0.append("\n");
            for(int v1 = 0; v1 < v; ++v1) {
                stringBuilder0.append(' ');
            }
            stringBuilder0.append("}");
            return;
        }
        if(object0 instanceof Map.Entry) {
            stringBuilder0.append(" {");
            j0.d(stringBuilder0, v + 2, "key", ((Map.Entry)object0).getKey());
            j0.d(stringBuilder0, v + 2, "value", ((Map.Entry)object0).getValue());
            stringBuilder0.append("\n");
            while(v1 < v) {
                stringBuilder0.append(' ');
                ++v1;
            }
            stringBuilder0.append("}");
            return;
        }
        stringBuilder0.append(": ");
        stringBuilder0.append(object0);
    }

    public static int e(s0 s00, byte[] arr_b, int v, int v1, int v2, b9 b90) {
        Object object0 = ((k0)s00).zze();
        int v3 = ((k0)s00).v(object0, arr_b, v, v1, v2, b90);
        ((k0)s00).zzf(object0);
        b90.c = object0;
        return v3;
    }

    public static final String f(String s) {
        StringBuilder stringBuilder0 = new StringBuilder();
        for(int v = 0; v < s.length(); ++v) {
            int v1 = s.charAt(v);
            if(Character.isUpperCase(((char)v1))) {
                stringBuilder0.append("_");
            }
            stringBuilder0.append(Character.toLowerCase(((char)v1)));
        }
        return stringBuilder0.toString();
    }

    public static int g(s0 s00, byte[] arr_b, int v, int v1, b9 b90) {
        int v2 = v + 1;
        int v3 = arr_b[v];
        if(v3 < 0) {
            v2 = j0.p(v3, arr_b, v2, b90);
            v3 = b90.a;
        }
        if(v3 < 0 || v3 > v1 - v2) {
            throw zzko.d();
        }
        Object object0 = s00.zze();
        int v4 = v3 + v2;
        s00.b(object0, arr_b, v2, v4, b90);
        s00.zzf(object0);
        b90.c = object0;
        return v4;
    }

    public static void h(zzke zzke0, StringBuilder stringBuilder0, int v) {
        boolean z;
        HashMap hashMap0 = new HashMap();
        HashMap hashMap1 = new HashMap();
        TreeSet treeSet0 = new TreeSet();
        Method[] arr_method = zzke0.getClass().getDeclaredMethods();
        for(int v2 = 0; v2 < arr_method.length; ++v2) {
            Method method0 = arr_method[v2];
            hashMap1.put(method0.getName(), method0);
            if(method0.getParameterTypes().length == 0) {
                hashMap0.put(method0.getName(), method0);
                if(method0.getName().startsWith("get")) {
                    treeSet0.add(method0.getName());
                }
            }
        }
        for(Object object0: treeSet0) {
            String s = (String)object0;
            String s1 = s.startsWith("get") ? s.substring(3) : s;
            if(s1.endsWith("List") && !s1.endsWith("OrBuilderList") && !s1.equals("List")) {
                String s2 = s1.substring(0, 1).toLowerCase() + s1.substring(1, s1.length() - 4);
                Method method1 = (Method)hashMap0.get(s);
                if(method1 != null && method1.getReturnType().equals(List.class)) {
                    j0.d(stringBuilder0, v, j0.f(s2), zzke.e(method1, zzke0, new Object[0]));
                    continue;
                }
            }
            if(s1.endsWith("Map") && !s1.equals("Map")) {
                String s3 = s1.substring(0, 1).toLowerCase() + s1.substring(1, s1.length() - 3);
                Method method2 = (Method)hashMap0.get(s);
                if(method2 != null && method2.getReturnType().equals(Map.class) && !method2.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method2.getModifiers())) {
                    j0.d(stringBuilder0, v, j0.f(s3), zzke.e(method2, zzke0, new Object[0]));
                    continue;
                }
            }
            if(((Method)hashMap1.get("set" + s1)) != null && (!s1.endsWith("Bytes") || !hashMap0.containsKey("get" + s1.substring(0, s1.length() - 5)))) {
                String s4 = s1.substring(0, 1).toLowerCase() + s1.substring(1);
                Method method3 = (Method)hashMap0.get("get" + s1);
                Method method4 = (Method)hashMap0.get("has" + s1);
                if(method3 != null) {
                    Object object1 = zzke.e(method3, zzke0, new Object[0]);
                    if(method4 == null) {
                        if(object1 instanceof Boolean) {
                            if(!((Boolean)object1).booleanValue()) {
                                continue;
                            }
                            goto label_64;
                        }
                        else if(object1 instanceof Integer) {
                            if(((int)(((Integer)object1))) == 0) {
                                continue;
                            }
                            goto label_64;
                        }
                        else if(object1 instanceof Float) {
                            if(Float.floatToRawIntBits(((float)(((Float)object1)))) == 0) {
                                continue;
                            }
                            goto label_64;
                        }
                        else if(object1 instanceof Double) {
                            if(Double.doubleToRawLongBits(((double)(((Double)object1)))) == 0L) {
                                continue;
                            }
                            goto label_64;
                        }
                        else if(object1 instanceof String) {
                            z = object1.equals("");
                            goto label_56;
                        }
                        else {
                            if(object1 instanceof zzjd) {
                                z = object1.equals(zzjd.zzb);
                            label_56:
                                if(z) {
                                    continue;
                                }
                            }
                            else if(object1 instanceof zzll) {
                                if(object1 == ((zzll)object1).zzbO()) {
                                    continue;
                                }
                            }
                            else if(object1 instanceof Enum && ((Enum)object1).ordinal() == 0) {
                                continue;
                            }
                            goto label_64;
                        }
                        goto label_63;
                    }
                    else {
                    label_63:
                        if(((Boolean)zzke.e(method4, zzke0, new Object[0])).booleanValue()) {
                            goto label_64;
                        }
                        continue;
                    }
                label_64:
                    j0.d(stringBuilder0, v, j0.f(s4), object1);
                }
            }
        }
        if(!(zzke0 instanceof zzkb)) {
            zzmo zzmo0 = zzke0.zzc;
            if(zzmo0 != null) {
                for(int v1 = 0; v1 < zzmo0.a; ++v1) {
                    j0.d(stringBuilder0, v, String.valueOf(zzmo0.b[v1] >>> 3), zzmo0.c[v1]);
                }
            }
            return;
        }
        zzkb zzkb0 = (zzkb)zzke0;
        throw null;
    }

    public static int i(s0 s00, int v, byte[] arr_b, int v1, int v2, zzkl zzkl0, b9 b90) {
        int v3 = j0.g(s00, arr_b, v1, v2, b90);
        zzkl0.add(b90.c);
        while(v3 < v2) {
            int v4 = j0.o(arr_b, v3, b90);
            if(v != b90.a) {
                break;
            }
            v3 = j0.g(s00, arr_b, v4, v2, b90);
            zzkl0.add(b90.c);
        }
        return v3;
    }

    public static boolean j(byte b) {
        return b > -65;
    }

    public static int k(byte[] arr_b, int v, zzkl zzkl0, b9 b90) {
        int v1 = j0.o(arr_b, v, b90);
        int v2 = b90.a + v1;
        while(v1 < v2) {
            v1 = j0.o(arr_b, v1, b90);
            ((Z)zzkl0).zzh(b90.a);
        }
        if(v1 != v2) {
            throw zzko.d();
        }
        return v1;
    }

    public static int l(byte[] arr_b, int v, b9 b90) {
        int v1 = j0.o(arr_b, v, b90);
        int v2 = b90.a;
        if(v2 < 0) {
            throw zzko.b();
        }
        if(v2 == 0) {
            b90.c = "";
            return v1;
        }
        b90.c = new String(arr_b, v1, v2, zzkm.a);
        return v1 + v2;
    }

    public static int m(byte[] arr_b, int v, b9 b90) {
        int v1 = j0.o(arr_b, v, b90);
        int v2 = b90.a;
        if(v2 < 0) {
            throw zzko.b();
        }
        if(v2 == 0) {
            b90.c = "";
            return v1;
        }
        if((v1 | v2 | arr_b.length - v1 - v2) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", ((int)arr_b.length), v1, v2));
        }
        int v3 = v1 + v2;
        char[] arr_c = new char[v2];
        int v4;
        for(v4 = 0; v1 < v3; ++v4) {
            int v5 = arr_b[v1];
            if(v5 < 0) {
                break;
            }
            ++v1;
            arr_c[v4] = (char)v5;
        }
        while(v1 < v3) {
            int v6 = v1 + 1;
            int v7 = arr_b[v1];
            if(v7 >= 0) {
                arr_c[v4] = (char)v7;
                ++v4;
                v1 = v6;
                while(v1 < v3) {
                    int v8 = arr_b[v1];
                    if(v8 < 0) {
                        break;
                    }
                    ++v1;
                    arr_c[v4] = (char)v8;
                    ++v4;
                }
                continue;
            }
            if(v7 < 0xFFFFFFE0) {
                if(v6 < v3) {
                    v1 += 2;
                    int v9 = arr_b[v6];
                    if(v7 < -62 || j0.j(((byte)v9))) {
                        throw zzko.a();
                    }
                    arr_c[v4] = (char)(v9 & 0x3F | (v7 & 0x1F) << 6);
                    ++v4;
                    continue;
                }
            }
            else if(v7 < -16) {
                if(v6 < v3 - 1) {
                    int v10 = v1 + 2;
                    v1 += 3;
                    int v11 = arr_b[v6];
                    int v12 = arr_b[v10];
                    if(!j0.j(((byte)v11))) {
                        if(v7 != 0xFFFFFFE0) {
                        label_52:
                            if(v7 != -19) {
                            label_55:
                                if(!j0.j(((byte)v12))) {
                                    arr_c[v4] = (char)((v11 & 0x3F) << 6 | (v7 & 15) << 12 | v12 & 0x3F);
                                    ++v4;
                                    continue;
                                }
                            }
                            else if(v11 < 0xFFFFFFA0) {
                                v7 = -19;
                                goto label_55;
                            }
                        }
                        else if(v11 >= 0xFFFFFFA0) {
                            v7 = 0xFFFFFFE0;
                            goto label_52;
                        }
                    }
                    throw zzko.a();
                }
            }
            else if(v6 < v3 - 2) {
                int v13 = v1 + 2;
                int v14 = v1 + 3;
                v1 += 4;
                int v15 = arr_b[v6];
                int v16 = arr_b[v13];
                int v17 = arr_b[v14];
                if(j0.j(((byte)v15)) || v15 + 0x70 + (v7 << 28) >> 30 != 0 || j0.j(((byte)v16)) || j0.j(((byte)v17))) {
                    throw zzko.a();
                }
                int v18 = (v15 & 0x3F) << 12 | (v7 & 7) << 18 | (v16 & 0x3F) << 6 | v17 & 0x3F;
                arr_c[v4] = (char)((v18 >>> 10) + 0xD7C0);
                arr_c[v4 + 1] = (char)((v18 & 0x3FF) + 0xDC00);
                v4 += 2;
                continue;
            }
            throw zzko.a();
        }
        b90.c = new String(arr_c, 0, v4);
        return v3;
    }

    public static int n(int v, byte[] arr_b, int v1, int v2, zzmo zzmo0, b9 b90) {
        if(v >>> 3 != 0) {
            switch(v & 7) {
                case 0: {
                    int v3 = j0.r(arr_b, v1, b90);
                    zzmo0.b(v, b90.b);
                    return v3;
                }
                case 1: {
                    zzmo0.b(v, j0.s(v1, arr_b));
                    return v1 + 8;
                }
                case 2: {
                    int v4 = j0.o(arr_b, v1, b90);
                    int v5 = b90.a;
                    if(v5 < 0) {
                        throw zzko.b();
                    }
                    if(v5 > arr_b.length - v4) {
                        throw zzko.d();
                    }
                    if(v5 == 0) {
                        zzmo0.b(v, zzjd.zzb);
                        return v4;
                    }
                    zzmo0.b(v, zzjd.zzl(arr_b, v4, v5));
                    return v4 + v5;
                }
                case 3: {
                    int v6 = v & -8 | 4;
                    zzmo zzmo1 = zzmo.a();
                    int v7 = 0;
                    while(v1 < v2) {
                        int v8 = j0.o(arr_b, v1, b90);
                        int v9 = b90.a;
                        if(v9 == v6) {
                            v7 = v9;
                            v1 = v8;
                            break;
                        }
                        v7 = v9;
                        v1 = j0.n(v9, arr_b, v8, v2, zzmo1, b90);
                    }
                    if(v1 > v2 || v7 != v6) {
                        throw zzko.c();
                    }
                    zzmo0.b(v, zzmo1);
                    return v1;
                }
                case 5: {
                    zzmo0.b(v, j0.c(arr_b, v1));
                    return v1 + 4;
                }
                default: {
                    throw new zzko("Protocol message contained an invalid tag (zero).");
                }
            }
        }
        throw new zzko("Protocol message contained an invalid tag (zero).");
    }

    public static int o(byte[] arr_b, int v, b9 b90) {
        int v1 = arr_b[v];
        if(v1 >= 0) {
            b90.a = v1;
            return v + 1;
        }
        return j0.p(v1, arr_b, v + 1, b90);
    }

    public static int p(int v, byte[] arr_b, int v1, b9 b90) {
        int v2 = arr_b[v1];
        if(v2 >= 0) {
            b90.a = v & 0x7F | v2 << 7;
            return v1 + 1;
        }
        int v3 = v & 0x7F | (v2 & 0x7F) << 7;
        int v4 = arr_b[v1 + 1];
        if(v4 >= 0) {
            b90.a = v3 | v4 << 14;
            return v1 + 2;
        }
        int v5 = v3 | (v4 & 0x7F) << 14;
        int v6 = arr_b[v1 + 2];
        if(v6 >= 0) {
            b90.a = v5 | v6 << 21;
            return v1 + 3;
        }
        int v7 = v5 | (v6 & 0x7F) << 21;
        int v8 = v1 + 4;
        int v9 = arr_b[v1 + 3];
        if(v9 >= 0) {
            b90.a = v7 | v9 << 28;
            return v8;
        }
        while(arr_b[v8] < 0) {
            ++v8;
        }
        b90.a = v7 | (v9 & 0x7F) << 28;
        return v8 + 1;
    }

    public static int q(int v, byte[] arr_b, int v1, int v2, zzkl zzkl0, b9 b90) {
        int v3 = j0.o(arr_b, v1, b90);
        ((Z)zzkl0).zzh(b90.a);
        while(v3 < v2) {
            int v4 = j0.o(arr_b, v3, b90);
            if(v != b90.a) {
                break;
            }
            v3 = j0.o(arr_b, v4, b90);
            ((Z)zzkl0).zzh(b90.a);
        }
        return v3;
    }

    public static int r(byte[] arr_b, int v, b9 b90) {
        long v1 = (long)arr_b[v];
        if(v1 >= 0L) {
            b90.b = v1;
            return v + 1;
        }
        int v2 = v + 2;
        int v3 = arr_b[v + 1];
        long v4 = v1 & 0x7FL | ((long)(v3 & 0x7F)) << 7;
        int v5 = 7;
        while(v3 < 0) {
            int v6 = arr_b[v2];
            v5 += 7;
            v4 |= ((long)(v6 & 0x7F)) << v5;
            v3 = v6;
            ++v2;
        }
        b90.b = v4;
        return v2;
    }

    public static long s(int v, byte[] arr_b) {
        return (((long)arr_b[v + 7]) & 0xFFL) << 56 | (((long)arr_b[v]) & 0xFFL | (((long)arr_b[v + 1]) & 0xFFL) << 8 | (((long)arr_b[v + 2]) & 0xFFL) << 16 | (((long)arr_b[v + 3]) & 0xFFL) << 24 | (((long)arr_b[v + 4]) & 0xFFL) << 0x20 | (((long)arr_b[v + 5]) & 0xFFL) << 40 | (((long)arr_b[v + 6]) & 0xFFL) << 0x30);
    }
}

