package v3;

public final class b {
    public final c a;
    public final c b;
    public final boolean c;

    public b(c c0, c c1, boolean z) {
        if(c0 != null) {
            super();
            this.a = c0;
            this.b = c1;
            this.c = z;
            return;
        }
        b.a(1);
        throw null;
    }

    public b(c c0, f f0) {
        if(c0 != null) {
            if(f0 != null) {
                this(c0, c.j(f0), false);
                return;
            }
            b.a(4);
            throw null;
        }
        b.a(3);
        throw null;
    }

    public static void a(int v) {
        Object[] arr_object = new Object[(v == 5 || v == 6 || v == 7 || v == 9 || (v == 13 || v == 14 || v == 15 || v == 16) ? 2 : 3)];
        switch(v) {
            case 2: {
                arr_object[0] = "relativeClassName";
                break;
            }
            case 1: 
            case 3: {
                arr_object[0] = "packageFqName";
                break;
            }
            case 4: {
                arr_object[0] = "topLevelName";
                break;
            }
            case 8: {
                arr_object[0] = "name";
                break;
            }
            case 10: {
                arr_object[0] = "segment";
                break;
            }
            case 11: 
            case 12: {
                arr_object[0] = "string";
                break;
            }
            case 5: 
            case 6: 
            case 7: 
            case 9: 
            case 13: 
            case 14: 
            case 15: 
            case 16: {
                arr_object[0] = "kotlin/reflect/jvm/internal/impl/name/ClassId";
                break;
            }
            default: {
                arr_object[0] = "topLevelFqName";
            }
        }
        switch(v) {
            case 5: {
                arr_object[1] = "getPackageFqName";
                break;
            }
            case 6: {
                arr_object[1] = "getRelativeClassName";
                break;
            }
            case 7: {
                arr_object[1] = "getShortClassName";
                break;
            }
            case 9: {
                arr_object[1] = "asSingleFqName";
                break;
            }
            case 13: 
            case 14: {
                arr_object[1] = "asString";
                break;
            }
            case 15: 
            case 16: {
                arr_object[1] = "asFqNameString";
                break;
            }
            default: {
                arr_object[1] = "kotlin/reflect/jvm/internal/impl/name/ClassId";
            }
        }
        switch(v) {
            case 1: 
            case 2: 
            case 3: 
            case 4: {
                arr_object[2] = "<init>";
                break;
            }
            case 8: {
                arr_object[2] = "createNestedClassId";
                break;
            }
            case 10: {
                arr_object[2] = "startsWith";
                break;
            }
            case 11: 
            case 12: {
                arr_object[2] = "fromString";
                break;
            }
            case 5: 
            case 6: 
            case 7: 
            case 9: 
            case 13: 
            case 14: 
            case 15: 
            case 16: {
                break;
            }
            default: {
                arr_object[2] = "topLevel";
            }
        }
        String s = String.format((v == 5 || v == 6 || v == 7 || v == 9 || (v == 13 || v == 14 || v == 15 || v == 16) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter \'%s\' of %s.%s must not be null"), arr_object);
        IllegalStateException illegalStateException0 = v == 5 || v == 6 || v == 7 || v == 9 || (v == 13 || v == 14 || v == 15 || v == 16) ? new IllegalStateException(s) : new IllegalArgumentException(s);
        throw illegalStateException0;
    }

    public final c b() {
        c c0 = this.a;
        c c1 = this.b;
        if(c0.d()) {
            if(c1 != null) {
                return c1;
            }
            b.a(9);
            throw null;
        }
        return new c(c0.b() + "." + c1.b());
    }

    public final String c() {
        c c0 = this.a;
        c c1 = this.b;
        if(c0.d()) {
            return c1.b();
        }
        String s = c0.b().replace('.', '/') + "/" + c1.b();
        if(s != null) {
            return s;
        }
        b.a(14);
        throw null;
    }

    public final b d(f f0) {
        if(f0 != null) {
            return new b(this.g(), this.b.c(f0), this.c);
        }
        b.a(8);
        throw null;
    }

    public static b e(String s, boolean z) [...] // Inlined contents

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            return b.class == class0 && (this.a.equals(((b)object0).a) && this.b.equals(((b)object0).b) && this.c == ((b)object0).c);
        }
        return false;
    }

    public final b f() {
        c c0 = this.b.e();
        return c0.d() ? null : new b(this.g(), c0, this.c);
    }

    public final c g() {
        c c0 = this.a;
        if(c0 != null) {
            return c0;
        }
        b.a(5);
        throw null;
    }

    public final c h() {
        c c0 = this.b;
        if(c0 != null) {
            return c0;
        }
        b.a(6);
        throw null;
    }

    @Override
    public final int hashCode() {
        return Boolean.valueOf(this.c).hashCode() + (this.b.hashCode() + this.a.hashCode() * 0x1F) * 0x1F;
    }

    public final f i() {
        f f0 = this.b.f();
        if(f0 != null) {
            return f0;
        }
        b.a(7);
        throw null;
    }

    public static b j(c c0) {
        if(c0 != null) {
            return new b(c0.e(), c0.f());
        }
        b.a(0);
        throw null;
    }

    // 去混淆评级： 低(20)
    @Override
    public final String toString() {
        return this.a.d() ? "/" + this.c() : this.c();
    }
}

