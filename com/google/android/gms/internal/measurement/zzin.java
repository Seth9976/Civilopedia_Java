package com.google.android.gms.internal.measurement;

import i3.e;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public abstract class zzin implements zzll {
    protected int zzb;

    public zzin() {
        this.zzb = 0;
    }

    public int a() {
        throw null;
    }

    public static void b(Iterable iterable0, List list0) {
        iterable0.getClass();
        if(iterable0 instanceof zzkt) {
            List list1 = ((zzkt)iterable0).zzh();
            int v = list0.size();
            for(Object object0: list1) {
                if(object0 == null) {
                    String s = "Element at index " + (((zzkt)list0).size() - v) + " is null.";
                    int v1 = ((zzkt)list0).size();
                    while(true) {
                        --v1;
                        if(v1 < v) {
                            break;
                        }
                        ((zzkt)list0).remove(v1);
                    }
                    throw new NullPointerException(s);
                }
                if(object0 instanceof zzjd) {
                    ((zzkt)list0).zzi(((zzjd)object0));
                }
                else {
                    ((zzkt)list0).add(((String)object0));
                }
            }
            return;
        }
        if(!(iterable0 instanceof o0)) {
            if(list0 instanceof ArrayList && iterable0 instanceof Collection) {
                ((ArrayList)list0).ensureCapacity(((Collection)iterable0).size() + list0.size());
            }
            int v2 = list0.size();
            for(Object object1: iterable0) {
                if(object1 == null) {
                    String s1 = "Element at index " + (list0.size() - v2) + " is null.";
                    int v3 = list0.size();
                    while(true) {
                        --v3;
                        if(v3 < v2) {
                            break;
                        }
                        list0.remove(v3);
                    }
                    throw new NullPointerException(s1);
                }
                list0.add(object1);
            }
            return;
        }
        list0.addAll(((Collection)iterable0));
    }

    public void c(int v) {
        throw null;
    }

    @Override  // com.google.android.gms.internal.measurement.zzll
    public final zzjd zzbs() {
        try {
            byte[] arr_b = new byte[this.zzbw()];
            zzjl zzjl0 = zzjl.zzC(arr_b);
            this.zzbK(zzjl0);
            zzjl0.zzD();
            return new O(arr_b);
        }
        catch(IOException iOException0) {
            throw new RuntimeException(e.f("Serializing ", this.getClass().getName(), " to a ByteString threw an IOException (should never happen)."), iOException0);
        }
    }

    public final byte[] zzbv() {
        try {
            byte[] arr_b = new byte[this.zzbw()];
            zzjl zzjl0 = zzjl.zzC(arr_b);
            this.zzbK(zzjl0);
            zzjl0.zzD();
            return arr_b;
        }
        catch(IOException iOException0) {
            throw new RuntimeException(e.f("Serializing ", this.getClass().getName(), " to a byte array threw an IOException (should never happen)."), iOException0);
        }
    }
}

