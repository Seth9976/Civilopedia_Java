package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.Map.Entry;
import java.util.Objects;

public final class zzfrl {
    public Object[] a;
    public int b;
    public g7 c;

    public zzfrl() {
        this(4);
    }

    public zzfrl(int v) {
        this.a = new Object[v + v];
        this.b = 0;
    }

    public final zzfrl zza(Object object0, Object object1) {
        int v = this.b + 1;
        int v1 = v + v;
        Object[] arr_object = this.a;
        if(v1 > arr_object.length) {
            int v2 = arr_object.length + (arr_object.length >> 1) + 1;
            if(v2 < v1) {
                int v3 = Integer.highestOneBit(v1 - 1);
                v2 = v3 + v3;
            }
            if(v2 < 0) {
                v2 = 0x7FFFFFFF;
            }
            this.a = Arrays.copyOf(arr_object, v2);
        }
        if(object0 != null) {
            if(object1 == null) {
                throw new NullPointerException("null value in entry: " + object0 + "=null");
            }
            Object[] arr_object1 = this.a;
            int v4 = this.b;
            int v5 = v4 + v4;
            arr_object1[v5] = object0;
            arr_object1[v5 + 1] = object1;
            this.b = v4 + 1;
            return this;
        }
        Objects.toString(object1);
        throw new NullPointerException("null key in entry: null=" + object1);
    }

    public final zzfrl zzb(Iterable iterable0) {
        if(iterable0 instanceof Collection) {
            int v = this.b * 2 + ((Collection)iterable0).size() * 2;
            Object[] arr_object = this.a;
            if(v > arr_object.length) {
                int v1 = arr_object.length + (arr_object.length >> 1) + 1;
                if(v1 < v) {
                    int v2 = Integer.highestOneBit(v - 1);
                    v1 = v2 + v2;
                }
                if(v1 < 0) {
                    v1 = 0x7FFFFFFF;
                }
                this.a = Arrays.copyOf(arr_object, v1);
            }
        }
        for(Object object0: iterable0) {
            this.zza(((Map.Entry)object0).getKey(), ((Map.Entry)object0).getValue());
        }
        return this;
    }

    public final zzfrm zzc() {
        short[] arr_v;
        zzfrm zzfrm0;
        g7 g70 = this.c;
        if(g70 != null) {
            throw g70.a();
        }
        Object object0 = null;
        int v = this.b;
        Object[] arr_object = this.a;
        if(v == 0) {
            zzfrm0 = y7.o;
        }
        else if(v == 1) {
            arr_object[0].getClass();
            arr_object[1].getClass();
            zzfrm0 = new y7(null, arr_object, 1);
        }
        else {
            zzfou.zzb(v, arr_object.length >> 1, "index");
            int v1 = zzfro.l(v);
            if(v1 <= 0x80) {
                byte[] arr_b = new byte[v1];
                Arrays.fill(arr_b, -1);
                int v3 = 0;
                for(int v2 = 0; v2 < v; ++v2) {
                    int v4 = v2 + v2;
                    int v5 = v3 + v3;
                    Object object1 = arr_object[v4];
                    object1.getClass();
                    Object object2 = arr_object[v4 ^ 1];
                    object2.getClass();
                    for(int v6 = h.a(object1.hashCode()); true; v6 = v7 + 1) {
                        int v7 = v6 & v1 - 1;
                        int v8 = arr_b[v7] & 0xFF;
                        if(v8 == 0xFF) {
                            arr_b[v7] = (byte)v5;
                            if(v3 < v2) {
                                arr_object[v5] = object1;
                                arr_object[v5 ^ 1] = object2;
                            }
                            ++v3;
                            break;
                        }
                        if(object1.equals(arr_object[v8])) {
                            Object object3 = arr_object[v8 ^ 1];
                            object3.getClass();
                            object0 = new g7(object1, object2, object3);
                            arr_object[v8 ^ 1] = object2;
                            break;
                        }
                    }
                }
                object0 = v3 == v ? arr_b : new Object[]{arr_b, v3, object0};
            }
            else if(v1 <= 0x8000) {
                arr_v = new short[v1];
                Arrays.fill(arr_v, -1);
                int v10 = 0;
                for(int v9 = 0; v9 < v; ++v9) {
                    int v11 = v9 + v9;
                    int v12 = v10 + v10;
                    Object object4 = arr_object[v11];
                    object4.getClass();
                    Object object5 = arr_object[v11 ^ 1];
                    object5.getClass();
                    for(int v13 = h.a(object4.hashCode()); true; v13 = v14 + 1) {
                        int v14 = v13 & v1 - 1;
                        int v15 = (char)arr_v[v14];
                        if(v15 == 0xFFFF) {
                            arr_v[v14] = (short)v12;
                            if(v10 < v9) {
                                arr_object[v12] = object4;
                                arr_object[v12 ^ 1] = object5;
                            }
                            ++v10;
                            break;
                        }
                        if(object4.equals(arr_object[v15])) {
                            Object object6 = arr_object[v15 ^ 1];
                            object6.getClass();
                            g7 g71 = new g7(object4, object5, object6);
                            arr_object[v15 ^ 1] = object5;
                            object0 = g71;
                            break;
                        }
                    }
                }
                object0 = v10 == v ? arr_v : new Object[]{arr_v, v10, object0};
            }
            else {
                arr_v = new int[v1];
                Arrays.fill(((int[])arr_v), -1);
                int v17 = 0;
                for(int v16 = 0; v16 < v; ++v16) {
                    int v18 = v16 + v16;
                    short v19 = v17 + v17;
                    Object object7 = arr_object[v18];
                    object7.getClass();
                    Object object8 = arr_object[v18 ^ 1];
                    object8.getClass();
                    for(int v20 = h.a(object7.hashCode()); true; v20 = v21 + 1) {
                        int v21 = v20 & v1 - 1;
                        int v22 = arr_v[v21];
                        if(v22 == -1) {
                            arr_v[v21] = v19;
                            if(v17 < v16) {
                                arr_object[v19] = object7;
                                arr_object[v19 ^ 1] = object8;
                            }
                            ++v17;
                            break;
                        }
                        if(object7.equals(arr_object[v22])) {
                            Object object9 = arr_object[v22 ^ 1];
                            object9.getClass();
                            g7 g72 = new g7(object7, object8, object9);
                            arr_object[v22 ^ 1] = object8;
                            object0 = g72;
                            break;
                        }
                    }
                }
                object0 = v17 == v ? arr_v : new Object[]{arr_v, v17, object0};
            }
            if(object0 instanceof Object[]) {
                this.c = (g7)((Object[])object0)[2];
                Object object10 = ((Object[])object0)[0];
                int v23 = (int)(((Integer)((Object[])object0)[1]));
                arr_object = Arrays.copyOf(arr_object, v23 + v23);
                object0 = object10;
                v = v23;
            }
            zzfrm0 = new y7(object0, arr_object, v);
        }
        g7 g73 = this.c;
        if(g73 != null) {
            throw g73.a();
        }
        return zzfrm0;
    }
}

