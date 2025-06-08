package com.google.android.gms.internal.ads;

import i3.e;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public abstract class zzgir implements zzgma {
    protected int zza;

    public zzgir() {
        this.zza = 0;
    }

    public int a() {
        throw null;
    }

    public static void b(Iterable iterable0, List list0) {
        iterable0.getClass();
        if(list0 instanceof ArrayList) {
            ((ArrayList)list0).ensureCapacity(((Collection)iterable0).size() + list0.size());
        }
        int v = list0.size();
        for(Object object0: iterable0) {
            if(object0 == null) {
                String s = "Element at index " + (list0.size() - v) + " is null.";
                int v1 = list0.size();
                while(true) {
                    --v1;
                    if(v1 < v) {
                        break;
                    }
                    list0.remove(v1);
                }
                throw new NullPointerException(s);
            }
            list0.add(object0);
        }
    }

    public void c(int v) {
        throw null;
    }

    @Override  // com.google.android.gms.internal.ads.zzgma
    public final zzgji zzas() {
        try {
            byte[] arr_b = new byte[this.zzax()];
            zzgjx zzgjx0 = zzgjx.zzG(arr_b);
            this.zzaQ(zzgjx0);
            zzgjx0.zzI();
            return new h9(arr_b);
        }
        catch(IOException iOException0) {
            throw new RuntimeException(e.f("Serializing ", this.getClass().getName(), " to a ByteString threw an IOException (should never happen)."), iOException0);
        }
    }

    public final void zzav(OutputStream outputStream0) throws IOException {
        int v = this.zzax();
        if(v > 0x1000) {
            v = 0x1000;
        }
        zzgjx zzgjx0 = zzgjx.zzH(outputStream0, v);
        this.zzaQ(zzgjx0);
        zzgjx0.zzN();
    }

    @Override  // com.google.android.gms.internal.ads.zzgma
    public final byte[] zzaw() {
        try {
            byte[] arr_b = new byte[this.zzax()];
            zzgjx zzgjx0 = zzgjx.zzG(arr_b);
            this.zzaQ(zzgjx0);
            zzgjx0.zzI();
            return arr_b;
        }
        catch(IOException iOException0) {
            throw new RuntimeException(e.f("Serializing ", this.getClass().getName(), " to a byte array threw an IOException (should never happen)."), iOException0);
        }
    }
}

