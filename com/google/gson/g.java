package com.google.gson;

import java.lang.reflect.Field;
import java.util.Locale;

// 部分失败：枚举糖化
// 枚举按原样呈现，而不是糖化为Java 5枚举。
public abstract class g extends Enum {
    public static final enum a i;
    public static final g[] j;

    static {
        a a0 = new a();
        g.i = a0;
        g.j = new g[]{a0, new b(), new c(), new g() {
            @Override  // com.google.gson.g
            public final String b(Field field0) {
                return g.a(field0.getName(), "_").toLowerCase(Locale.ENGLISH);
            }
        }, new g() {
            @Override  // com.google.gson.g
            public final String b(Field field0) {
                return g.a(field0.getName(), "-").toLowerCase(Locale.ENGLISH);
            }
        }, new g() {
            @Override  // com.google.gson.g
            public final String b(Field field0) {
                return g.a(field0.getName(), ".").toLowerCase(Locale.ENGLISH);
            }
        }};
    }

    public static String a(String s, String s1) {
        StringBuilder stringBuilder0 = new StringBuilder();
        int v = s.length();
        for(int v1 = 0; v1 < v; ++v1) {
            int v2 = s.charAt(v1);
            if(Character.isUpperCase(((char)v2)) && stringBuilder0.length() != 0) {
                stringBuilder0.append(s1);
            }
            stringBuilder0.append(((char)v2));
        }
        return stringBuilder0.toString();
    }

    public abstract String b(Field arg1);

    public static String c(String s) {
        int v = s.length();
        int v1;
        for(v1 = 0; !Character.isLetter(s.charAt(v1)) && v1 < v - 1; ++v1) {
        }
        int v2 = s.charAt(v1);
        if(Character.isUpperCase(((char)v2))) {
            return s;
        }
        int v3 = Character.toUpperCase(((char)v2));
        return v1 == 0 ? ((char)v3) + s.substring(1) : s.substring(0, v1) + ((char)v3) + s.substring(v1 + 1);
    }

    public static g valueOf(String s) {
        return (g)Enum.valueOf(g.class, s);
    }

    public static g[] values() {
        return (g[])g.j.clone();
    }
}

