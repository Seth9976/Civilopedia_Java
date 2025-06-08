package a3;

import M3.Q;
import M3.w;
import X2.e;
import X2.k;
import X2.o;
import X2.y;
import Y2.h;
import java.util.LinkedHashMap;
import java.util.List;
import v3.f;
import x2.r;

public final class t implements X2.t {
    public h A;
    public boolean B;
    public final LinkedHashMap C;
    public Boolean D;
    public boolean E;
    public final u F;
    public Q i;
    public k j;
    public y k;
    public o l;
    public X2.u m;
    public int n;
    public List o;
    public final List p;
    public v q;
    public v r;
    public w s;
    public f t;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean y;
    public r z;

    public t(u u0, Q q0, k k0, y y0, o o0, int v, List list0, List list1, v v1, w w0) {
        if(q0 != null) {
            if(k0 != null) {
                if(y0 != null) {
                    if(o0 != null) {
                        if(v != 0) {
                            if(list0 != null) {
                                if(list1 != null) {
                                    if(w0 != null) {
                                        super();
                                        this.F = u0;
                                        this.m = null;
                                        this.r = u0.r;
                                        this.u = true;
                                        this.v = false;
                                        this.w = false;
                                        this.x = false;
                                        this.y = u0.A;
                                        this.z = null;
                                        this.A = null;
                                        this.B = u0.B;
                                        this.C = new LinkedHashMap();
                                        this.D = null;
                                        this.E = false;
                                        this.i = q0;
                                        this.j = k0;
                                        this.k = y0;
                                        this.l = o0;
                                        this.n = v;
                                        this.o = list0;
                                        this.p = list1;
                                        this.q = v1;
                                        this.s = w0;
                                        this.t = null;
                                        return;
                                    }
                                    t.d(7);
                                    throw null;
                                }
                                t.d(6);
                                throw null;
                            }
                            t.d(5);
                            throw null;
                        }
                        t.d(4);
                        throw null;
                    }
                    t.d(3);
                    throw null;
                }
                t.d(2);
                throw null;
            }
            t.d(1);
            throw null;
        }
        t.d(0);
        throw null;
    }

    @Override  // X2.t
    public final X2.t C(y y0) {
        if(y0 != null) {
            this.k = y0;
            return this;
        }
        t.d(10);
        throw null;
    }

    @Override  // X2.t
    public final X2.t G() {
        this.C.put(i3.f.O, Boolean.TRUE);
        return this;
    }

    @Override  // X2.t
    public final X2.t H() {
        this.B = true;
        return this;
    }

    @Override  // X2.t
    public final X2.t K() {
        this.v = true;
        return this;
    }

    @Override  // X2.t
    public final X2.t L(f f0) {
        if(f0 != null) {
            this.t = f0;
            return this;
        }
        t.d(17);
        throw null;
    }

    @Override  // X2.t
    public final X2.t M(o o0) {
        if(o0 != null) {
            this.l = o0;
            return this;
        }
        t.d(12);
        throw null;
    }

    @Override  // X2.t
    public final X2.t a() {
        this.u = false;
        return this;
    }

    @Override  // X2.t
    public final X2.t b(v v0) {
        this.r = v0;
        return this;
    }

    @Override  // X2.t
    public final X2.u c() {
        return this.F.P0(this);
    }

    public static void d(int v) {
        IllegalArgumentException illegalArgumentException0;
        int v1;
        String s;
        switch(v) {
            case 9: 
            case 11: 
            case 13: 
            case 15: 
            case 16: 
            case 18: 
            case 20: 
            case 22: 
            case 24: 
            case 26: 
            case 27: 
            case 28: 
            case 29: 
            case 30: 
            case 0x1F: 
            case 0x20: 
            case 33: 
            case 34: 
            case 36: 
            case 38: 
            case 40: 
            case 41: 
            case 42: {
                s = "@NotNull method %s.%s must not return null";
                break;
            }
            default: {
                s = "Argument for @NotNull parameter \'%s\' of %s.%s must not be null";
            }
        }
        switch(v) {
            case 9: 
            case 11: 
            case 13: 
            case 15: 
            case 16: 
            case 18: 
            case 20: 
            case 22: 
            case 24: 
            case 26: 
            case 27: 
            case 28: 
            case 29: 
            case 30: 
            case 0x1F: 
            case 0x20: 
            case 33: 
            case 34: 
            case 36: 
            case 38: 
            case 40: 
            case 41: 
            case 42: {
                v1 = 2;
                break;
            }
            default: {
                v1 = 3;
            }
        }
        Object[] arr_object = new Object[v1];
        switch(v) {
            case 1: {
                arr_object[0] = "newOwner";
                break;
            }
            case 2: {
                arr_object[0] = "newModality";
                break;
            }
            case 3: {
                arr_object[0] = "newVisibility";
                break;
            }
            case 5: {
                arr_object[0] = "newValueParameterDescriptors";
                break;
            }
            case 6: {
                arr_object[0] = "newContextReceiverParameters";
                break;
            }
            case 7: {
                arr_object[0] = "newReturnType";
                break;
            }
            case 8: {
                arr_object[0] = "owner";
                break;
            }
            case 10: {
                arr_object[0] = "modality";
                break;
            }
            case 12: {
                arr_object[0] = "visibility";
                break;
            }
            case 4: 
            case 14: {
                arr_object[0] = "kind";
                break;
            }
            case 17: {
                arr_object[0] = "name";
                break;
            }
            case 19: 
            case 21: {
                arr_object[0] = "parameters";
                break;
            }
            case 23: {
                arr_object[0] = "type";
                break;
            }
            case 25: {
                arr_object[0] = "contextReceiverParameters";
                break;
            }
            case 35: {
                arr_object[0] = "additionalAnnotations";
                break;
            }
            case 39: {
                arr_object[0] = "userDataKey";
                break;
            }
            case 9: 
            case 11: 
            case 13: 
            case 15: 
            case 16: 
            case 18: 
            case 20: 
            case 22: 
            case 24: 
            case 26: 
            case 27: 
            case 28: 
            case 29: 
            case 30: 
            case 0x1F: 
            case 0x20: 
            case 33: 
            case 34: 
            case 36: 
            case 38: 
            case 40: 
            case 41: 
            case 42: {
                arr_object[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl$CopyConfiguration";
                break;
            }
            default: {
                arr_object[0] = "substitution";
            }
        }
        switch(v) {
            case 9: {
                arr_object[1] = "setOwner";
                break;
            }
            case 11: {
                arr_object[1] = "setModality";
                break;
            }
            case 13: {
                arr_object[1] = "setVisibility";
                break;
            }
            case 15: {
                arr_object[1] = "setKind";
                break;
            }
            case 16: {
                arr_object[1] = "setCopyOverrides";
                break;
            }
            case 18: {
                arr_object[1] = "setName";
                break;
            }
            case 20: {
                arr_object[1] = "setValueParameters";
                break;
            }
            case 22: {
                arr_object[1] = "setTypeParameters";
                break;
            }
            case 24: {
                arr_object[1] = "setReturnType";
                break;
            }
            case 26: {
                arr_object[1] = "setContextReceiverParameters";
                break;
            }
            case 27: {
                arr_object[1] = "setExtensionReceiverParameter";
                break;
            }
            case 28: {
                arr_object[1] = "setDispatchReceiverParameter";
                break;
            }
            case 29: {
                arr_object[1] = "setOriginal";
                break;
            }
            case 30: {
                arr_object[1] = "setSignatureChange";
                break;
            }
            case 0x1F: {
                arr_object[1] = "setPreserveSourceElement";
                break;
            }
            case 0x20: {
                arr_object[1] = "setDropOriginalInContainingParts";
                break;
            }
            case 33: {
                arr_object[1] = "setHiddenToOvercomeSignatureClash";
                break;
            }
            case 34: {
                arr_object[1] = "setHiddenForResolutionEverywhereBesideSupercalls";
                break;
            }
            case 36: {
                arr_object[1] = "setAdditionalAnnotations";
                break;
            }
            case 38: {
                arr_object[1] = "setSubstitution";
                break;
            }
            case 40: {
                arr_object[1] = "putUserData";
                break;
            }
            case 41: {
                arr_object[1] = "getSubstitution";
                break;
            }
            case 42: {
                arr_object[1] = "setJustForTypeSubstitution";
                break;
            }
            default: {
                arr_object[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl$CopyConfiguration";
            }
        }
        switch(v) {
            case 8: {
                arr_object[2] = "setOwner";
                break;
            }
            case 10: {
                arr_object[2] = "setModality";
                break;
            }
            case 12: {
                arr_object[2] = "setVisibility";
                break;
            }
            case 14: {
                arr_object[2] = "setKind";
                break;
            }
            case 17: {
                arr_object[2] = "setName";
                break;
            }
            case 19: {
                arr_object[2] = "setValueParameters";
                break;
            }
            case 21: {
                arr_object[2] = "setTypeParameters";
                break;
            }
            case 23: {
                arr_object[2] = "setReturnType";
                break;
            }
            case 25: {
                arr_object[2] = "setContextReceiverParameters";
                break;
            }
            case 35: {
                arr_object[2] = "setAdditionalAnnotations";
                break;
            }
            case 37: {
                arr_object[2] = "setSubstitution";
                break;
            }
            case 39: {
                arr_object[2] = "putUserData";
                break;
            }
            case 9: 
            case 11: 
            case 13: 
            case 15: 
            case 16: 
            case 18: 
            case 20: 
            case 22: 
            case 24: 
            case 26: 
            case 27: 
            case 28: 
            case 29: 
            case 30: 
            case 0x1F: 
            case 0x20: 
            case 33: 
            case 34: 
            case 36: 
            case 38: 
            case 40: 
            case 41: 
            case 42: {
                break;
            }
            default: {
                arr_object[2] = "<init>";
            }
        }
        String s1 = String.format(s, arr_object);
        switch(v) {
            case 9: 
            case 11: 
            case 13: 
            case 15: 
            case 16: 
            case 18: 
            case 20: 
            case 22: 
            case 24: 
            case 26: 
            case 27: 
            case 28: 
            case 29: 
            case 30: 
            case 0x1F: 
            case 0x20: 
            case 33: 
            case 34: 
            case 36: 
            case 38: 
            case 40: 
            case 41: 
            case 42: {
                illegalArgumentException0 = new IllegalStateException(s1);
                break;
            }
            default: {
                illegalArgumentException0 = new IllegalArgumentException(s1);
            }
        }
        throw illegalArgumentException0;
    }

    @Override  // X2.t
    public final X2.t g(List list0) {
        this.o = list0;
        return this;
    }

    @Override  // X2.t
    public final X2.t i(e e0) {
        if(e0 != null) {
            this.j = e0;
            return this;
        }
        t.d(8);
        throw null;
    }

    @Override  // X2.t
    public final X2.t k(h h0) {
        if(h0 != null) {
            this.A = h0;
            return this;
        }
        t.d(35);
        throw null;
    }

    @Override  // X2.t
    public final X2.t p() {
        this.z = r.i;
        return this;
    }

    @Override  // X2.t
    public final X2.t r() {
        this.y = true;
        return this;
    }

    @Override  // X2.t
    public final X2.t s(int v) {
        if(v != 0) {
            this.n = v;
            return this;
        }
        t.d(14);
        throw null;
    }

    @Override  // X2.t
    public final X2.t t(w w0) {
        if(w0 != null) {
            this.s = w0;
            return this;
        }
        t.d(23);
        throw null;
    }

    @Override  // X2.t
    public final X2.t x() {
        this.w = true;
        return this;
    }
}

