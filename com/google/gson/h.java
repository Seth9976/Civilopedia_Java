package com.google.gson;

import B.c;
import X1.a;
import com.google.gson.internal.Excluder;
import com.google.gson.internal.bind.ArrayTypeAdapter;
import com.google.gson.internal.bind.CollectionTypeAdapterFactory;
import com.google.gson.internal.bind.DateTypeAdapter;
import com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory;
import com.google.gson.internal.bind.MapTypeAdapterFactory;
import com.google.gson.internal.bind.ObjectTypeAdapter;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import com.google.gson.internal.bind.SqlDateTypeAdapter;
import com.google.gson.internal.bind.TimeTypeAdapter;
import com.google.gson.internal.bind.b;
import com.google.gson.stream.MalformedJsonException;
import com.spears.civilopedia.planning.logic.storage.MapFile;
import java.io.EOFException;
import java.io.IOException;
import java.io.StringReader;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

public final class h {
    public final ThreadLocal a;
    public final ConcurrentHashMap b;
    public final c c;
    public final JsonAdapterAnnotationTypeAdapterFactory d;
    public final List e;
    public final boolean f;
    public final List g;
    public final List h;

    static {
        new a(Object.class);
    }

    public h() {
        Map map0 = Collections.emptyMap();
        List list0 = Collections.emptyList();
        List list1 = Collections.emptyList();
        List list2 = Collections.emptyList();
        super();
        this.a = new ThreadLocal();
        this.b = new ConcurrentHashMap();
        c c0 = new c(map0);
        this.c = c0;
        this.f = true;
        this.g = list0;
        this.h = list1;
        ArrayList arrayList0 = new ArrayList();
        arrayList0.add(b.B);
        arrayList0.add(ObjectTypeAdapter.b);
        arrayList0.add(Excluder.k);
        arrayList0.addAll(list2);
        arrayList0.add(b.p);
        arrayList0.add(b.g);
        arrayList0.add(b.d);
        arrayList0.add(b.e);
        arrayList0.add(b.f);
        arrayList0.add(b.b(Long.TYPE, Long.class, b.k));
        Class class0 = Double.TYPE;
        Gson.1 gson$10 = new Gson.1();  // 初始化器: Ljava/lang/Object;-><init>()V
        arrayList0.add(b.b(class0, Double.class, gson$10));
        Class class1 = Float.TYPE;
        Gson.2 gson$20 = new Gson.2();  // 初始化器: Ljava/lang/Object;-><init>()V
        arrayList0.add(b.b(class1, Float.class, gson$20));
        arrayList0.add(b.l);
        arrayList0.add(b.h);
        arrayList0.add(b.i);
        TypeAdapter.1 typeAdapter$10 = new TypeAdapter.1(new Gson.4(b.k));
        arrayList0.add(b.a(AtomicLong.class, typeAdapter$10));
        TypeAdapter.1 typeAdapter$11 = new TypeAdapter.1(new Gson.5(b.k));
        arrayList0.add(b.a(AtomicLongArray.class, typeAdapter$11));
        arrayList0.add(b.j);
        arrayList0.add(b.m);
        arrayList0.add(b.q);
        arrayList0.add(b.r);
        arrayList0.add(b.a(BigDecimal.class, b.n));
        arrayList0.add(b.a(BigInteger.class, b.o));
        arrayList0.add(b.s);
        arrayList0.add(b.t);
        arrayList0.add(b.v);
        arrayList0.add(b.w);
        arrayList0.add(b.z);
        arrayList0.add(b.u);
        arrayList0.add(b.b);
        arrayList0.add(DateTypeAdapter.b);
        arrayList0.add(b.y);
        arrayList0.add(TimeTypeAdapter.b);
        arrayList0.add(SqlDateTypeAdapter.b);
        arrayList0.add(b.x);
        arrayList0.add(ArrayTypeAdapter.c);
        arrayList0.add(b.a);
        arrayList0.add(new CollectionTypeAdapterFactory(c0));
        arrayList0.add(new MapTypeAdapterFactory(c0));
        JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory0 = new JsonAdapterAnnotationTypeAdapterFactory(c0);
        this.d = jsonAdapterAnnotationTypeAdapterFactory0;
        arrayList0.add(jsonAdapterAnnotationTypeAdapterFactory0);
        arrayList0.add(b.C);
        arrayList0.add(new ReflectiveTypeAdapterFactory(c0, Excluder.k, jsonAdapterAnnotationTypeAdapterFactory0));
        this.e = Collections.unmodifiableList(arrayList0);
    }

    public static void a(double f) {
        if(Double.isNaN(f) || Double.isInfinite(f)) {
            throw new IllegalArgumentException(f + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    public final Object b(String s, Type type0) {
        Object object0;
        Y1.a a0 = new Y1.a(new StringReader(s));
        boolean z = true;
        a0.j = true;
        try {
            a0.v();
            object0 = this.c(new a(type0)).b(a0);
            a0.j = false;
            goto label_28;
        }
        catch(EOFException eOFException0) {
        }
        catch(IllegalStateException illegalStateException0) {
            throw new JsonSyntaxException(illegalStateException0);  // 初始化器: Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V
        }
        catch(IOException iOException0) {
            throw new JsonSyntaxException(iOException0);  // 初始化器: Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V
        }
        catch(AssertionError assertionError0) {
            goto label_22;
        }
        catch(Throwable throwable0) {
            a0.j = false;
            throw throwable0;
        }
        goto label_12;
        try {
            object0 = this.c(new a(type0)).b(a0);
            a0.j = false;
            goto label_28;
        }
        catch(EOFException eOFException0) {
        }
        catch(IllegalStateException illegalStateException0) {
            throw new JsonSyntaxException(illegalStateException0);  // 初始化器: Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V
        }
        catch(IOException iOException0) {
            throw new JsonSyntaxException(iOException0);  // 初始化器: Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V
        }
        catch(AssertionError assertionError0) {
            goto label_22;
        }
        catch(Throwable throwable0) {
            a0.j = false;
            throw throwable0;
        }
        z = false;
    label_12:
        if(z) {
            a0.j = false;
            object0 = null;
        }
        else {
            try {
                throw new JsonSyntaxException(eOFException0);  // 初始化器: Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V
            label_22:
                AssertionError assertionError1 = new AssertionError("AssertionError (GSON 2.8.6): " + assertionError0.getMessage());
                assertionError1.initCause(assertionError0);
                throw assertionError1;
            }
            catch(Throwable throwable0) {
                a0.j = false;
                throw throwable0;
            }
        }
    label_28:
        if(object0 == null) {
            return object0;
        }
        else {
            try {
                if(a0.v() != 10) {
                    throw new JsonIOException("JSON document was not fully consumed.");  // 初始化器: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
                }
                return object0;
            }
            catch(MalformedJsonException malformedJsonException0) {
            }
            catch(IOException iOException1) {
                throw new JsonIOException(iOException1);  // 初始化器: Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V
            }
        }
        throw new JsonSyntaxException(malformedJsonException0);  // 初始化器: Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V
    }

    public final n c(a a0) {
        boolean z;
        ConcurrentHashMap concurrentHashMap0 = this.b;
        n n0 = (n)concurrentHashMap0.get(a0);
        if(n0 != null) {
            return n0;
        }
        ThreadLocal threadLocal0 = this.a;
        Map map0 = (Map)threadLocal0.get();
        if(map0 == null) {
            map0 = new HashMap();
            threadLocal0.set(map0);
            z = true;
        }
        else {
            z = false;
        }
        n n1 = (Gson.FutureTypeAdapter)map0.get(a0);
        if(n1 != null) {
            return n1;
        }
        try {
            Gson.FutureTypeAdapter gson$FutureTypeAdapter0 = new Gson.FutureTypeAdapter();
            map0.put(a0, gson$FutureTypeAdapter0);
            for(Object object0: this.e) {
                n n2 = ((o)object0).a(this, a0);
                if(n2 != null) {
                    if(gson$FutureTypeAdapter0.a != null) {
                        throw new AssertionError();
                    }
                    gson$FutureTypeAdapter0.a = n2;
                    concurrentHashMap0.put(a0, n2);
                    return n2;
                }
                if(false) {
                    break;
                }
            }
        }
        finally {
            map0.remove(a0);
            if(z) {
                threadLocal0.remove();
            }
        }
        throw new IllegalArgumentException("GSON (2.8.6) cannot handle " + a0);
    }

    public final void d(MapFile mapFile0, Class class0, Y1.b b0) {
        n n0 = this.c(new a(class0));
        boolean z = b0.m;
        b0.m = true;
        boolean z1 = b0.n;
        b0.n = this.f;
        boolean z2 = b0.p;
        b0.p = false;
        try {
            try {
                n0.c(b0, mapFile0);
                b0.m = z;
                b0.n = z1;
                b0.p = z2;
            }
            catch(IOException iOException0) {
                throw new JsonIOException(iOException0);  // 初始化器: Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V
            }
            catch(AssertionError assertionError0) {
                AssertionError assertionError1 = new AssertionError("AssertionError (GSON 2.8.6): " + assertionError0.getMessage());
                assertionError1.initCause(assertionError0);
                throw assertionError1;
            }
        }
        catch(Throwable throwable0) {
            b0.m = z;
            b0.n = z1;
            b0.p = z2;
            throw throwable0;
        }
    }

    @Override
    public final String toString() {
        return "{serializeNulls:false,factories:" + this.e + ",instanceCreators:" + this.c + "}";
    }
}

