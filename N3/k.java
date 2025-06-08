package n3;

import g1.n;
import java.util.LinkedHashMap;

public abstract class k {
    public static final d a;
    public static final d b;
    public static final d c;
    public static final LinkedHashMap d;

    static {
        k.a = new d(g.j, false);
        k.b = new d(g.k, false);
        k.c = new d(g.k, true);
        k.d d0 = new k.d(6);
        new n(d0, "java/util/Iterator").e("forEachRemaining", new i("java/util/function/Consumer", 0));
        new n(d0, "java/lang/Iterable").e("spliterator", new m(1, 4));
        n n0 = new n(d0, "java/util/Collection");
        n0.e("removeIf", new i("java/util/function/Predicate", 6));
        n0.e("stream", new i("java/util/stream/Stream", 7));
        n0.e("parallelStream", new i("java/util/stream/Stream", 8));
        new n(d0, "java/util/List").e("replaceAll", new i("java/util/function/UnaryOperator", 9));
        n n1 = new n(d0, "java/util/Map");
        n1.e("forEach", new i("java/util/function/BiConsumer", 10));
        n1.e("putIfAbsent", new i("java/lang/Object", 11));
        n1.e("replace", new i("java/lang/Object", 12));
        n1.e("replace", new i("java/lang/Object", 13));
        n1.e("replaceAll", new i("java/util/function/BiFunction", 14));
        n1.e("compute", new j("java/lang/Object", "java/util/function/BiFunction", 0));
        n1.e("computeIfAbsent", new j("java/lang/Object", "java/util/function/Function", 1));
        n1.e("computeIfPresent", new j("java/lang/Object", "java/util/function/BiFunction", 2));
        n1.e("merge", new j("java/lang/Object", "java/util/function/BiFunction", 3));
        n n2 = new n(d0, "java/util/Optional");
        n2.e("empty", new i("java/util/Optional", 15));
        n2.e("of", new j("java/lang/Object", "java/util/Optional", 4));
        n2.e("ofNullable", new j("java/lang/Object", "java/util/Optional", 5));
        n2.e("get", new i("java/lang/Object", 16));
        n2.e("ifPresent", new i("java/util/function/Consumer", 17));
        new n(d0, "java/lang/ref/Reference").e("get", new i("java/lang/Object", 18));
        new n(d0, "java/util/function/Predicate").e("test", new i("java/lang/Object", 19));
        new n(d0, "java/util/function/BiPredicate").e("test", new i("java/lang/Object", 20));
        new n(d0, "java/util/function/Consumer").e("accept", new i("java/lang/Object", 1));
        new n(d0, "java/util/function/BiConsumer").e("accept", new i("java/lang/Object", 2));
        new n(d0, "java/util/function/Function").e("apply", new i("java/lang/Object", 3));
        new n(d0, "java/util/function/BiFunction").e("apply", new i("java/lang/Object", 4));
        new n(d0, "java/util/function/Supplier").e("get", new i("java/lang/Object", 5));
        k.d = (LinkedHashMap)d0.j;
    }
}

