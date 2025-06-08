package com.google.gson.internal.bind;

import A.f;
import B.c;
import J3.d;
import Y1.a;
import Y1.b;
import com.google.gson.JsonSyntaxException;
import com.google.gson.h;
import com.google.gson.internal.k;
import com.google.gson.n;
import com.google.gson.o;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Properties;

public final class MapTypeAdapterFactory implements o {
    final class Adapter extends n {
        public final n a;
        public final n b;
        public final k c;
        public final MapTypeAdapterFactory d;

        public Adapter(h h0, Type type0, n n0, Type type1, n n1, k k0) {
            this.a = new TypeAdapterRuntimeTypeWrapper(h0, n0, type0);
            this.b = new TypeAdapterRuntimeTypeWrapper(h0, n1, type1);
            this.c = k0;
        }

        @Override  // com.google.gson.n
        public final Object b(a a0) {
            int v = a0.v();
            if(v == 9) {
                a0.r();
                return null;
            }
            Map map0 = (Map)this.c.F();
            n n0 = this.b;
            n n1 = this.a;
            if(v == 1) {
                a0.a();
                while(a0.i()) {
                    a0.a();
                    Object object0 = ((TypeAdapterRuntimeTypeWrapper)n1).b.b(a0);
                    if(map0.put(object0, ((TypeAdapterRuntimeTypeWrapper)n0).b.b(a0)) != null) {
                        throw new JsonSyntaxException("duplicate key: " + object0);  // 初始化器: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
                    }
                    a0.e();
                }
                a0.e();
                return map0;
            }
            a0.b();
            while(a0.i()) {
                d.j.getClass();
                switch((a0.p == 0 ? a0.d() : a0.p)) {
                    case 12: {
                        a0.p = 8;
                        break;
                    }
                    case 13: {
                        a0.p = 9;
                        break;
                    }
                    case 14: {
                        a0.p = 10;
                        break;
                    }
                    default: {
                        throw new IllegalStateException("Expected a name but was " + f.y(a0.v()) + a0.k());
                    }
                }
                Object object1 = ((TypeAdapterRuntimeTypeWrapper)n1).b.b(a0);
                if(map0.put(object1, ((TypeAdapterRuntimeTypeWrapper)n0).b.b(a0)) != null) {
                    throw new JsonSyntaxException("duplicate key: " + object1);  // 初始化器: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
                }
                if(false) {
                    break;
                }
            }
            a0.f();
            return map0;
        }

        @Override  // com.google.gson.n
        public final void c(b b0, Object object0) {
            if(((Map)object0) == null) {
                b0.j();
                return;
            }
            this.d.getClass();
            n n0 = this.b;
            b0.c();
            for(Object object1: ((Map)object0).entrySet()) {
                b0.g(String.valueOf(((Map.Entry)object1).getKey()));
                n0.c(b0, ((Map.Entry)object1).getValue());
            }
            b0.f();
        }
    }

    public final c i;

    public MapTypeAdapterFactory(c c0) {
        this.i = c0;
    }

    @Override  // com.google.gson.o
    public final n a(h h0, X1.a a0) {
        Class class0 = Map.class;
        if(!class0.isAssignableFrom(a0.a)) {
            return null;
        }
        Type type0 = a0.b;
        Class class1 = com.google.gson.internal.d.g(type0);
        if(type0 == Properties.class) {
            return String.class == Boolean.TYPE || String.class == Boolean.class ? new Adapter(this, h0, String.class, com.google.gson.internal.bind.b.c, String.class, h0.c(new X1.a(String.class)), this.i.u(a0)) : new Adapter(this, h0, String.class, h0.c(new X1.a(String.class)), String.class, h0.c(new X1.a(String.class)), this.i.u(a0));
        }
        if(type0 instanceof WildcardType) {
            type0 = ((WildcardType)type0).getUpperBounds()[0];
        }
        com.google.gson.internal.d.c(class0.isAssignableFrom(class1));
        Type type1 = com.google.gson.internal.d.i(type0, class1, com.google.gson.internal.d.f(type0, class1, class0), new HashSet());
        if(type1 instanceof ParameterizedType) {
            ((ParameterizedType)type1).getActualTypeArguments();
        }
        return class2 == Boolean.TYPE || class2 == Boolean.class ? new Adapter(this, h0, class2, com.google.gson.internal.bind.b.c, class3, h0.c(new X1.a(class3)), this.i.u(a0)) : new Adapter(this, h0, class2, h0.c(new X1.a(class2)), class3, h0.c(new X1.a(class3)), this.i.u(a0));
    }
}

