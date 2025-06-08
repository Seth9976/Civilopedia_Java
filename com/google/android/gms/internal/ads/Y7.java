package com.google.android.gms.internal.ads;

public final class y7 extends zzfrm {
    public final transient Object l;
    public final transient Object[] m;
    public final transient int n;
    public static final y7 o;

    static {
        y7.o = new y7(null, new Object[0], 0);
    }

    public y7(Object object0, Object[] arr_object, int v) {
        this.l = object0;
        this.m = arr_object;
        this.n = v;
    }

    @Override  // com.google.android.gms.internal.ads.zzfrm
    public final x7 b() {
        return new x7(this.m, 1, this.n);
    }

    @Override  // com.google.android.gms.internal.ads.zzfrm
    public final v7 c() {
        return new v7(this, this.m, this.n);
    }

    @Override  // com.google.android.gms.internal.ads.zzfrm
    public final w7 d() {
        return new w7(this, new x7(this.m, 0, this.n));
    }

    @Override  // com.google.android.gms.internal.ads.zzfrm
    public final Object get(Object object0) {
        Object object2;
        if(object0 != null) {
            Object[] arr_object = this.m;
            if(this.n == 1) {
                Object object1 = arr_object[0];
                object1.getClass();
                if(object1.equals(object0)) {
                    object2 = arr_object[1];
                    object2.getClass();
                    return object2 == null ? null : object2;
                }
            }
            else {
                Object object3 = this.l;
                if(object3 != null) {
                    if(object3 instanceof byte[]) {
                        int v = ((byte[])object3).length - 1;
                        for(int v1 = h.a(object0.hashCode()); true; v1 = v2 + 1) {
                            int v2 = v1 & v;
                            int v3 = ((byte[])object3)[v2] & 0xFF;
                            if(v3 == 0xFF) {
                                break;
                            }
                            if(object0.equals(arr_object[v3])) {
                                object2 = arr_object[v3 ^ 1];
                                return object2 == null ? null : object2;
                            }
                        }
                    }
                    else if(object3 instanceof short[]) {
                        int v4 = ((short[])object3).length - 1;
                        for(int v5 = h.a(object0.hashCode()); true; v5 = v6 + 1) {
                            int v6 = v5 & v4;
                            int v7 = (char)((short[])object3)[v6];
                            if(v7 == 0xFFFF) {
                                break;
                            }
                            if(object0.equals(arr_object[v7])) {
                                object2 = arr_object[v7 ^ 1];
                                return object2 == null ? null : object2;
                            }
                        }
                    }
                    else {
                        int v8 = ((int[])object3).length - 1;
                        for(int v9 = h.a(object0.hashCode()); true; v9 = v10 + 1) {
                            int v10 = v9 & v8;
                            int v11 = ((int[])object3)[v10];
                            if(v11 == -1) {
                                break;
                            }
                            if(object0.equals(arr_object[v11])) {
                                object2 = arr_object[v11 ^ 1];
                                return object2 == null ? null : object2;
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    @Override
    public final int size() {
        return this.n;
    }
}

