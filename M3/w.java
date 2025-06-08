package M3;

import N3.f;

public final class W extends n {
    public final String j;

    public W(String s) {
        this.j = s;
    }

    @Override  // M3.n
    public final w J0(f f0) {
        if(f0 != null) {
            return this;
        }
        W.T0(3);
        throw null;
    }

    @Override  // M3.A
    public final Z L0(boolean z) {
        this.O0(z);
        throw null;
    }

    @Override  // M3.n
    public final Z M0(f f0) {
        if(f0 != null) {
            return this;
        }
        W.T0(3);
        throw null;
    }

    @Override  // M3.A
    public final Z N0(H h0) {
        this.P0(h0);
        throw null;
    }

    @Override  // M3.A
    public final A O0(boolean z) {
        throw new IllegalStateException(this.j);
    }

    @Override  // M3.A
    public final A P0(H h0) {
        if(h0 != null) {
            throw new IllegalStateException(this.j);
        }
        W.T0(0);
        throw null;
    }

    @Override  // M3.n
    public final A Q0() {
        throw new IllegalStateException(this.j);
    }

    @Override  // M3.n
    public final A R0(f f0) {
        if(f0 != null) {
            return this;
        }
        W.T0(3);
        throw null;
    }

    @Override  // M3.n
    public final n S0(A a0) {
        throw new IllegalStateException(this.j);
    }

    public static void T0(int v) {
        Object[] arr_object = new Object[(v == 1 || v == 4 ? 2 : 3)];
        switch(v) {
            case 2: {
                arr_object[0] = "delegate";
                break;
            }
            case 3: {
                arr_object[0] = "kotlinTypeRefiner";
                break;
            }
            case 1: 
            case 4: {
                arr_object[0] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils$SpecialType";
                break;
            }
            default: {
                arr_object[0] = "newAttributes";
            }
        }
        switch(v) {
            case 1: {
                arr_object[1] = "toString";
                break;
            }
            case 4: {
                arr_object[1] = "refine";
                break;
            }
            default: {
                arr_object[1] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils$SpecialType";
            }
        }
        switch(v) {
            case 2: {
                arr_object[2] = "replaceDelegate";
                break;
            }
            case 3: {
                arr_object[2] = "refine";
                break;
            }
            case 1: 
            case 4: {
                break;
            }
            default: {
                arr_object[2] = "replaceAttributes";
            }
        }
        String s = String.format((v == 1 || v == 4 ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter \'%s\' of %s.%s must not be null"), arr_object);
        IllegalStateException illegalStateException0 = v == 1 || v == 4 ? new IllegalStateException(s) : new IllegalArgumentException(s);
        throw illegalStateException0;
    }

    @Override  // M3.A
    public final String toString() {
        String s = this.j;
        if(s != null) {
            return s;
        }
        W.T0(1);
        throw null;
    }
}

