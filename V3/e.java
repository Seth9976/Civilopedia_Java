package v3;

import J2.j;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;

public final class e {
    public final String a;
    public transient c b;
    public transient e c;
    public transient f d;
    public static final f e;
    public static final Pattern f;
    public static final d g;

    static {
        e.e = f.g("<root>");
        e.f = Pattern.compile("\\.");
        e.g = new d();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    public e(String s) {
        if(s != null) {
            super();
            this.a = s;
            return;
        }
        e.a(2);
        throw null;
    }

    public e(String s, c c0) {
        if(s != null) {
            if(c0 != null) {
                super();
                this.a = s;
                this.b = c0;
                return;
            }
            e.a(1);
            throw null;
        }
        e.a(0);
        throw null;
    }

    public e(String s, e e0, f f0) {
        if(s != null) {
            super();
            this.a = s;
            this.c = e0;
            this.d = f0;
            return;
        }
        e.a(3);
        throw null;
    }

    public static void a(int v) {
        IllegalArgumentException illegalArgumentException0;
        int v1;
        String s;
        switch(v) {
            case 4: 
            case 5: 
            case 6: 
            case 7: 
            case 8: 
            case 10: 
            case 11: 
            case 12: 
            case 13: 
            case 14: 
            case 18: {
                s = "@NotNull method %s.%s must not return null";
                break;
            }
            default: {
                s = "Argument for @NotNull parameter \'%s\' of %s.%s must not be null";
            }
        }
        switch(v) {
            case 4: 
            case 5: 
            case 6: 
            case 7: 
            case 8: 
            case 10: 
            case 11: 
            case 12: 
            case 13: 
            case 14: 
            case 18: {
                v1 = 2;
                break;
            }
            default: {
                v1 = 3;
            }
        }
        Object[] arr_object = new Object[v1];
        if(v == 1) {
            arr_object[0] = "safe";
        }
        else {
            switch(v) {
                case 9: {
                    arr_object[0] = "name";
                    break;
                }
                case 15: {
                    arr_object[0] = "segment";
                    break;
                }
                case 16: {
                    arr_object[0] = "other";
                    break;
                }
                case 17: {
                    arr_object[0] = "shortName";
                    break;
                }
                case 4: 
                case 5: 
                case 6: 
                case 7: 
                case 8: 
                case 10: 
                case 11: 
                case 12: 
                case 13: 
                case 14: 
                case 18: {
                    arr_object[0] = "kotlin/reflect/jvm/internal/impl/name/FqNameUnsafe";
                    break;
                }
                default: {
                    arr_object[0] = "fqName";
                }
            }
        }
        switch(v) {
            case 4: {
                arr_object[1] = "asString";
                break;
            }
            case 5: 
            case 6: {
                arr_object[1] = "toSafe";
                break;
            }
            case 7: 
            case 8: {
                arr_object[1] = "parent";
                break;
            }
            case 10: 
            case 11: {
                arr_object[1] = "shortName";
                break;
            }
            case 12: 
            case 13: {
                arr_object[1] = "shortNameOrSpecial";
                break;
            }
            case 14: {
                arr_object[1] = "pathSegments";
                break;
            }
            case 18: {
                arr_object[1] = "toString";
                break;
            }
            default: {
                arr_object[1] = "kotlin/reflect/jvm/internal/impl/name/FqNameUnsafe";
            }
        }
        switch(v) {
            case 9: {
                arr_object[2] = "child";
                break;
            }
            case 15: 
            case 16: {
                arr_object[2] = "startsWith";
                break;
            }
            case 17: {
                arr_object[2] = "topLevel";
                break;
            }
            case 4: 
            case 5: 
            case 6: 
            case 7: 
            case 8: 
            case 10: 
            case 11: 
            case 12: 
            case 13: 
            case 14: 
            case 18: {
                break;
            }
            default: {
                arr_object[2] = "<init>";
            }
        }
        String s1 = String.format(s, arr_object);
        switch(v) {
            case 4: 
            case 5: 
            case 6: 
            case 7: 
            case 8: 
            case 10: 
            case 11: 
            case 12: 
            case 13: 
            case 14: 
            case 18: {
                illegalArgumentException0 = new IllegalStateException(s1);
                break;
            }
            default: {
                illegalArgumentException0 = new IllegalArgumentException(s1);
            }
        }
        throw illegalArgumentException0;
    }

    public final e b(f f0) {
        if(f0 != null) {
            return this.a.isEmpty() ? new e(f0.b(), this, f0) : new e(this.a + "." + f0.b(), this, f0);
        }
        e.a(9);
        throw null;
    }

    public final void c() {
        String s = this.a;
        int v = s.lastIndexOf(46);
        if(v >= 0) {
            this.d = f.d(s.substring(v + 1));
            this.c = new e(s.substring(0, v));
            return;
        }
        this.d = f.d(s);
        this.c = c.c.i();
    }

    public final boolean d() {
        if(this.b == null) {
            String s = this.a;
            if(s != null) {
                return s.indexOf(60) < 0;
            }
            e.a(4);
            throw null;
        }
        return true;
    }

    public final List e() {
        List list0;
        String s = this.a;
        if(s.isEmpty()) {
            list0 = Collections.emptyList();
        }
        else {
            String[] arr_s = e.f.split(s);
            j.f(arr_s, "<this>");
            j.f(e.g, "transform");
            ArrayList arrayList0 = new ArrayList(arr_s.length);
            for(int v = 0; v < arr_s.length; ++v) {
                arrayList0.add(f.d(arr_s[v]));
            }
            list0 = arrayList0;
        }
        if(list0 != null) {
            return list0;
        }
        e.a(14);
        throw null;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof e ? this.a.equals(((e)object0).a) : false;
    }

    public final f f() {
        f f0 = this.d;
        if(f0 != null) {
            return f0;
        }
        if(this.a.isEmpty()) {
            throw new IllegalStateException("root");
        }
        this.c();
        f f1 = this.d;
        if(f1 != null) {
            return f1;
        }
        e.a(11);
        throw null;
    }

    public final c g() {
        c c0 = this.b;
        if(c0 != null) {
            return c0;
        }
        c c1 = new c(this);
        this.b = c1;
        return c1;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public final String toString() {
        String s = this.a.isEmpty() ? "<root>" : this.a;
        if(s != null) {
            return s;
        }
        e.a(18);
        throw null;
    }
}

