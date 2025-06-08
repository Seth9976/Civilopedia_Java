package v3;

public final class c {
    public final e a;
    public transient c b;
    public static final c c;

    static {
        c.c = new c("");
    }

    public c(String s) {
        if(s != null) {
            super();
            this.a = new e(s, this);
            return;
        }
        c.a(1);
        throw null;
    }

    public c(e e0) {
        if(e0 != null) {
            super();
            this.a = e0;
            return;
        }
        c.a(2);
        throw null;
    }

    public c(e e0, c c0) {
        this.a = e0;
        this.b = c0;
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
            case 9: 
            case 10: 
            case 11: {
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
            case 9: 
            case 10: 
            case 11: {
                v1 = 2;
                break;
            }
            default: {
                v1 = 3;
            }
        }
        Object[] arr_object = new Object[v1];
        switch(v) {
            case 1: 
            case 2: 
            case 3: {
                arr_object[0] = "fqName";
                break;
            }
            case 8: {
                arr_object[0] = "name";
                break;
            }
            case 4: 
            case 5: 
            case 6: 
            case 7: 
            case 9: 
            case 10: 
            case 11: {
                arr_object[0] = "kotlin/reflect/jvm/internal/impl/name/FqName";
                break;
            }
            case 12: {
                arr_object[0] = "segment";
                break;
            }
            case 13: {
                arr_object[0] = "other";
                break;
            }
            case 14: {
                arr_object[0] = "shortName";
                break;
            }
            default: {
                arr_object[0] = "names";
            }
        }
        switch(v) {
            case 4: {
                arr_object[1] = "asString";
                break;
            }
            case 5: {
                arr_object[1] = "toUnsafe";
                break;
            }
            case 6: 
            case 7: {
                arr_object[1] = "parent";
                break;
            }
            case 9: {
                arr_object[1] = "shortName";
                break;
            }
            case 10: {
                arr_object[1] = "shortNameOrSpecial";
                break;
            }
            case 11: {
                arr_object[1] = "pathSegments";
                break;
            }
            default: {
                arr_object[1] = "kotlin/reflect/jvm/internal/impl/name/FqName";
            }
        }
        switch(v) {
            case 1: 
            case 2: 
            case 3: {
                arr_object[2] = "<init>";
                break;
            }
            case 8: {
                arr_object[2] = "child";
                break;
            }
            case 4: 
            case 5: 
            case 6: 
            case 7: 
            case 9: 
            case 10: 
            case 11: {
                break;
            }
            case 12: 
            case 13: {
                arr_object[2] = "startsWith";
                break;
            }
            case 14: {
                arr_object[2] = "topLevel";
                break;
            }
            default: {
                arr_object[2] = "fromSegments";
            }
        }
        String s1 = String.format(s, arr_object);
        switch(v) {
            case 4: 
            case 5: 
            case 6: 
            case 7: 
            case 9: 
            case 10: 
            case 11: {
                illegalArgumentException0 = new IllegalStateException(s1);
                break;
            }
            default: {
                illegalArgumentException0 = new IllegalArgumentException(s1);
            }
        }
        throw illegalArgumentException0;
    }

    public final String b() {
        String s = this.a.a;
        if(s != null) {
            return s;
        }
        e.a(4);
        throw null;
    }

    public final c c(f f0) {
        if(f0 != null) {
            return new c(this.a.b(f0), this);
        }
        c.a(8);
        throw null;
    }

    public final boolean d() {
        return this.a.a.isEmpty();
    }

    public final c e() {
        c c0 = this.b;
        if(c0 != null) {
            return c0;
        }
        if(this.d()) {
            throw new IllegalStateException("root");
        }
        e e0 = this.a;
        e e1 = e0.c;
        if(e1 == null) {
            if(e0.a.isEmpty()) {
                throw new IllegalStateException("root");
            }
            e0.c();
            e1 = e0.c;
            if(e1 == null) {
                e.a(8);
                throw null;
            }
        }
        c c1 = new c(e1);
        this.b = c1;
        return c1;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof c ? this.a.equals(((c)object0).a) : false;
    }

    public final f f() {
        f f0 = this.a.f();
        if(f0 != null) {
            return f0;
        }
        c.a(9);
        throw null;
    }

    public final f g() {
        f f0;
        e e0 = this.a;
        if(e0.a.isEmpty()) {
            f0 = e.e;
            if(f0 != null) {
                return f0;
            }
            e.a(12);
            throw null;
        }
        f0 = e0.f();
        if(f0 != null) {
            return f0;
        }
        e.a(13);
        throw null;
    }

    public final boolean h(f f0) {
        if(f0 != null) {
            String s = this.a.a;
            if(!s.isEmpty()) {
                int v = s.indexOf(46);
                String s1 = f0.b();
                if(v == -1) {
                    v = Math.max(s.length(), s1.length());
                }
                return s.regionMatches(0, s1, 0, v);
            }
            return false;
        }
        c.a(12);
        throw null;
    }

    @Override
    public final int hashCode() {
        return this.a.a.hashCode();
    }

    public final e i() {
        e e0 = this.a;
        if(e0 != null) {
            return e0;
        }
        c.a(5);
        throw null;
    }

    public static c j(f f0) {
        if(f0 != null) {
            return new c(new e(f0.b(), c.c.i(), f0));
        }
        c.a(14);
        throw null;
    }

    @Override
    public final String toString() {
        return this.a.toString();
    }
}

