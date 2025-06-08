package com.google.android.gms.internal.play_billing;

import java.util.Arrays;
import java.util.Objects;
import o1.a;

public final class w extends zzcr {
    public final transient Object l;
    public final transient Object[] m;
    public final transient int n;
    public static final w o;

    static {
        w.o = new w(null, new Object[0], 0);
    }

    public w(Object object0, Object[] arr_object, int v) {
        this.l = object0;
        this.m = arr_object;
        this.n = v;
    }

    @Override  // com.google.android.gms.internal.play_billing.zzcr
    public final v b() {
        return new v(this.m, 1, this.n);
    }

    @Override  // com.google.android.gms.internal.play_billing.zzcr
    public final t c() {
        return new t(this, this.m, this.n);
    }

    @Override  // com.google.android.gms.internal.play_billing.zzcr
    public final u d() {
        return new u(this, new v(this.m, 0, this.n));
    }

    public static w e(int v, Object[] arr_object, zzcq zzcq0) {
        short[] arr_v;
        byte[] arr_b = null;
        if(v == 0) {
            return w.o;
        }
        if(v == 1) {
            Objects.requireNonNull(arr_object[0]);
            Objects.requireNonNull(arr_object[1]);
            return new w(null, arr_object, 1);
        }
        zzbe.zzb(v, arr_object.length >> 1, "index");
        int v1 = zzcv.l(v);
        if(v1 <= 0x80) {
            byte[] arr_b1 = new byte[v1];
            Arrays.fill(arr_b1, -1);
            int v3 = 0;
            for(int v2 = 0; v2 < v; ++v2) {
                int v4 = v3 + v3;
                int v5 = v2 + v2;
                Object object0 = arr_object[v5];
                Objects.requireNonNull(object0);
                Object object1 = arr_object[v5 ^ 1];
                Objects.requireNonNull(object1);
                for(int v6 = a.a0(object0.hashCode()); true; v6 = v7 + 1) {
                    int v7 = v6 & v1 - 1;
                    int v8 = arr_b1[v7] & 0xFF;
                    if(v8 == 0xFF) {
                        arr_b1[v7] = (byte)v4;
                        if(v3 < v2) {
                            arr_object[v4] = object0;
                            arr_object[v4 ^ 1] = object1;
                        }
                        ++v3;
                        break;
                    }
                    if(object0.equals(arr_object[v8])) {
                        Object object2 = arr_object[v8 ^ 1];
                        Objects.requireNonNull(object2);
                        arr_b = new k(object0, object1, object2);
                        arr_object[v8 ^ 1] = object1;
                        break;
                    }
                }
            }
            arr_b = v3 == v ? arr_b1 : new Object[]{arr_b1, v3, arr_b};
        }
        else if(v1 <= 0x8000) {
            arr_v = new short[v1];
            Arrays.fill(arr_v, -1);
            int v10 = 0;
            for(int v9 = 0; v9 < v; ++v9) {
                int v11 = v10 + v10;
                int v12 = v9 + v9;
                Object object3 = arr_object[v12];
                Objects.requireNonNull(object3);
                Object object4 = arr_object[v12 ^ 1];
                Objects.requireNonNull(object4);
                for(int v13 = a.a0(object3.hashCode()); true; v13 = v14 + 1) {
                    int v14 = v13 & v1 - 1;
                    int v15 = (char)arr_v[v14];
                    if(v15 == 0xFFFF) {
                        arr_v[v14] = (short)v11;
                        if(v10 < v9) {
                            arr_object[v11] = object3;
                            arr_object[v11 ^ 1] = object4;
                        }
                        ++v10;
                        break;
                    }
                    if(object3.equals(arr_object[v15])) {
                        Object object5 = arr_object[v15 ^ 1];
                        Objects.requireNonNull(object5);
                        k k0 = new k(object3, object4, object5);
                        arr_object[v15 ^ 1] = object4;
                        arr_b = k0;
                        break;
                    }
                }
            }
            arr_b = v10 == v ? arr_v : new Object[]{arr_v, v10, arr_b};
        }
        else {
            arr_v = new int[v1];
            Arrays.fill(((int[])arr_v), -1);
            int v17 = 0;
            for(int v16 = 0; v16 < v; ++v16) {
                short v18 = v17 + v17;
                int v19 = v16 + v16;
                Object object6 = arr_object[v19];
                Objects.requireNonNull(object6);
                Object object7 = arr_object[v19 ^ 1];
                Objects.requireNonNull(object7);
                for(int v20 = a.a0(object6.hashCode()); true; v20 = v21 + 1) {
                    int v21 = v20 & v1 - 1;
                    int v22 = arr_v[v21];
                    if(v22 == -1) {
                        arr_v[v21] = v18;
                        if(v17 < v16) {
                            arr_object[v18] = object6;
                            arr_object[v18 ^ 1] = object7;
                        }
                        ++v17;
                        break;
                    }
                    if(object6.equals(arr_object[v22])) {
                        Object object8 = arr_object[v22 ^ 1];
                        Objects.requireNonNull(object8);
                        k k1 = new k(object6, object7, object8);
                        arr_object[v22 ^ 1] = object7;
                        arr_b = k1;
                        break;
                    }
                }
            }
            arr_b = v17 == v ? arr_v : new Object[]{arr_v, v17, arr_b};
        }
        if(arr_b instanceof Object[]) {
            k k2 = (k)((Object[])arr_b)[2];
            if(zzcq0 == null) {
                throw k2.a();
            }
            zzcq0.c = k2;
            Object object9 = ((Object[])arr_b)[0];
            int v23 = (int)(((Integer)((Object[])arr_b)[1]));
            return new w(object9, Arrays.copyOf(arr_object, v23 + v23), v23);
        }
        return new w(arr_b, arr_object, v);
    }

    @Override  // com.google.android.gms.internal.play_billing.zzcr
    public final Object get(Object object0) {
        Object object2;
        if(object0 != null) {
            Object[] arr_object = this.m;
            if(this.n == 1) {
                Object object1 = arr_object[0];
                Objects.requireNonNull(object1);
                if(object1.equals(object0)) {
                    object2 = arr_object[1];
                    Objects.requireNonNull(object2);
                    return object2 == null ? null : object2;
                }
            }
            else {
                Object object3 = this.l;
                if(object3 != null) {
                    if(object3 instanceof byte[]) {
                        int v = ((byte[])object3).length - 1;
                        for(int v1 = a.a0(object0.hashCode()); true; v1 = v2 + 1) {
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
                        for(int v5 = a.a0(object0.hashCode()); true; v5 = v6 + 1) {
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
                        for(int v9 = a.a0(object0.hashCode()); true; v9 = v10 + 1) {
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

