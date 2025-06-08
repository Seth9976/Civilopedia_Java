package X2;

import J2.j;
import a3.C;
import y3.d;

public final class o {
    public final h0 a;
    public final int b;

    public o(h0 h00, int v) {
        this.b = v;
        j.f(h00, "delegate");
        super();
        this.a = h00;
    }

    public final boolean a(P p0, n n0, k k0) {
        switch(this.b) {
            case 0: {
                if(k0 == null) {
                    throw new IllegalArgumentException("Argument for @NotNull parameter \'from\' of kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$1.isVisible must not be null");
                }
                if(d.t(n0) && d.f(k0) != P.j) {
                    return p.d(n0, k0);
                }
                if(n0 instanceof X2.j) {
                    ((X2.j)n0).p();
                }
                while(n0 != null) {
                    n0 = n0.p();
                    if(n0 instanceof e && !d.m(n0) || n0 instanceof F) {
                        break;
                    }
                }
                if(n0 != null) {
                    while(k0 != null) {
                        if(n0 == k0) {
                            return true;
                        }
                        if(k0 instanceof F) {
                            return n0 instanceof F && ((C)(((F)n0))).m.equals(((C)(((F)k0))).m) && d.d(k0).equals(d.d(n0));
                        }
                        k0 = k0.p();
                    }
                }
                return false;
            }
            case 1: {
                if(k0 == null) {
                    throw new IllegalArgumentException("Argument for @NotNull parameter \'from\' of kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$2.isVisible must not be null");
                }
                if(p.a.a(p0, n0, k0)) {
                    if(p0 == p.l) {
                        return true;
                    }
                    if(p0 != p.k) {
                        d.j(n0, e.class, true);
                        return false;
                    }
                }
                return false;
            }
            case 2: {
                if(k0 == null) {
                    throw new IllegalArgumentException("Argument for @NotNull parameter \'from\' of kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$3.isVisible must not be null");
                }
                Class class0 = e.class;
                e e0 = (e)d.j(n0, class0, true);
                e e1 = (e)d.j(k0, class0, false);
                if(e1 != null) {
                    if(e0 != null && d.m(e0)) {
                        e e2 = (e)d.j(e0, class0, true);
                        if(e2 == null || !d.s(e1.k(), e2.a())) {
                            goto label_39;
                        }
                        return true;
                    }
                label_39:
                    n n1 = n0 instanceof c ? d.u(((c)n0)) : n0;
                    e e3 = (e)d.j(n1, class0, true);
                    if(e3 != null) {
                        if(d.s(e1.k(), e3.a()) && p0 != p.m) {
                            if(!(n1 instanceof c) || n1 instanceof X2.j || p0 == p.l) {
                                return true;
                            }
                            if(p0 != p.k && p0 != null) {
                                p0.getType();
                                throw null;
                            }
                        }
                        return this.a(p0, n0, e1.p());
                    }
                }
                return false;
            }
            case 3: {
                if(k0 == null) {
                    throw new IllegalArgumentException("Argument for @NotNull parameter \'from\' of kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$4.isVisible must not be null");
                }
                A a0 = d.d(n0);
                if(!d.d(k0).v(a0)) {
                    return false;
                }
                p.n.getClass();
                return true;
            }
            case 4: {
                if(k0 == null) {
                    throw new IllegalArgumentException("Argument for @NotNull parameter \'from\' of kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$5.isVisible must not be null");
                }
                return true;
            }
            case 5: {
                if(k0 != null) {
                    throw new IllegalStateException("This method shouldn\'t be invoked for LOCAL visibility");
                }
                throw new IllegalArgumentException("Argument for @NotNull parameter \'from\' of kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$6.isVisible must not be null");
            }
            case 6: {
                if(k0 != null) {
                    throw new IllegalStateException("Visibility is unknown yet");
                }
                throw new IllegalArgumentException("Argument for @NotNull parameter \'from\' of kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$7.isVisible must not be null");
            }
            case 7: {
                if(k0 == null) {
                    throw new IllegalArgumentException("Argument for @NotNull parameter \'from\' of kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$8.isVisible must not be null");
                }
                return false;
            }
            case 8: {
                if(k0 == null) {
                    throw new IllegalArgumentException("Argument for @NotNull parameter \'from\' of kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$9.isVisible must not be null");
                }
                return false;
            }
            case 9: {
                if(k0 == null) {
                    throw new IllegalArgumentException("Argument for @NotNull parameter \'from\' of kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$1.isVisible must not be null");
                }
                return g3.o.c(n0, k0);
            }
            case 10: {
                if(k0 == null) {
                    throw new IllegalArgumentException("Argument for @NotNull parameter \'from\' of kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$2.isVisible must not be null");
                }
                return g3.o.b(p0, n0, k0);
            }
            default: {
                if(k0 == null) {
                    throw new IllegalArgumentException("Argument for @NotNull parameter \'from\' of kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$3.isVisible must not be null");
                }
                return g3.o.b(p0, n0, k0);
            }
        }
    }

    @Override
    public final String toString() {
        return this.a.f();
    }
}

