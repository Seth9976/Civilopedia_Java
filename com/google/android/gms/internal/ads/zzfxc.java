package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public final class zzfxc {
    public final ConcurrentHashMap a;
    public zzfwz b;
    public final Class c;

    public zzfxc(Class class0) {
        this.a = new ConcurrentHashMap();
        this.c = class0;
    }

    public final zzfwz zza(Object object0, zzgfv zzgfv0) throws GeneralSecurityException {
        byte[] arr_b;
        if(zzgfv0.zzi() != 3) {
            throw new GeneralSecurityException("only ENABLED key is allowed");
        }
        int v = zzgfv0.zzj();
        if(v - 2 == 1) {
            arr_b = ByteBuffer.allocate(5).put(1).putInt(zzgfv0.zza()).array();
        }
        else {
            switch(v - 2) {
                case 2: {
                    arr_b = ByteBuffer.allocate(5).put(0).putInt(zzgfv0.zza()).array();
                    break;
                }
                case 3: {
                    arr_b = zzfwk.zza;
                    break;
                }
                default: {
                    if(v - 2 != 4) {
                        throw new GeneralSecurityException("unknown output prefix type");
                    }
                    arr_b = ByteBuffer.allocate(5).put(0).putInt(zzgfv0.zza()).array();
                }
            }
        }
        zzfwz zzfwz0 = new zzfwz(object0, arr_b, zzgfv0.zzi(), zzgfv0.zzj());
        ArrayList arrayList0 = new ArrayList();
        arrayList0.add(zzfwz0);
        z8 z80 = new z8(zzfwz0.zzb());
        ConcurrentHashMap concurrentHashMap0 = this.a;
        List list0 = (List)concurrentHashMap0.put(z80, Collections.unmodifiableList(arrayList0));
        if(list0 != null) {
            ArrayList arrayList1 = new ArrayList();
            arrayList1.addAll(list0);
            arrayList1.add(zzfwz0);
            concurrentHashMap0.put(z80, Collections.unmodifiableList(arrayList1));
        }
        return zzfwz0;
    }

    public final zzfwz zzb() {
        return this.b;
    }

    public static zzfxc zzc(Class class0) {
        return new zzfxc(class0);
    }

    public final Class zzd() {
        return this.c;
    }

    public final List zze(byte[] arr_b) {
        z8 z80 = new z8(arr_b);
        List list0 = (List)this.a.get(z80);
        return list0 == null ? Collections.emptyList() : list0;
    }

    public final void zzf(zzfwz zzfwz0) {
        if(zzfwz0.zzc() != 3) {
            throw new IllegalArgumentException("the primary entry has to be ENABLED");
        }
        if(this.zze(zzfwz0.zzb()).isEmpty()) {
            throw new IllegalArgumentException("the primary entry cannot be set to an entry which is not held by this primitive set");
        }
        this.b = zzfwz0;
    }
}

