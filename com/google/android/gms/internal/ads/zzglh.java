package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

public final class zzglh extends Z8 implements zzgli, RandomAccess {
    public final ArrayList j;
    public static final zzgli zza;

    static {
        zzglh zzglh0 = new zzglh(10);
        zzglh0.zzb();
        zzglh.zza = zzglh0;
    }

    public zzglh() {
        this(10);
    }

    public zzglh(int v) {
        ArrayList arrayList0 = new ArrayList(v);
        super();
        this.j = arrayList0;
    }

    public zzglh(ArrayList arrayList0) {
        this.j = arrayList0;
    }

    @Override
    public final void add(int v, Object object0) {
        this.a();
        this.j.add(v, ((String)object0));
        ++this.modCount;
    }

    @Override  // com.google.android.gms.internal.ads.Z8
    public final boolean addAll(int v, Collection collection0) {
        this.a();
        if(collection0 instanceof zzgli) {
            collection0 = ((zzgli)collection0).zzh();
        }
        boolean z = this.j.addAll(v, collection0);
        ++this.modCount;
        return z;
    }

    @Override  // com.google.android.gms.internal.ads.Z8
    public final boolean addAll(Collection collection0) {
        return this.addAll(this.size(), collection0);
    }

    @Override  // com.google.android.gms.internal.ads.Z8
    public final void clear() {
        this.a();
        this.j.clear();
        ++this.modCount;
    }

    @Override
    public final Object get(int v) {
        return this.zzg(v);
    }

    @Override  // com.google.android.gms.internal.ads.Z8
    public final Object remove(int v) {
        this.a();
        Object object0 = this.j.remove(v);
        ++this.modCount;
        if(object0 instanceof String) {
            return (String)object0;
        }
        return object0 instanceof zzgji ? ((zzgji)object0).zzA(zzgla.a) : zzgla.zzh(((byte[])object0));
    }

    @Override
    public final Object set(int v, Object object0) {
        this.a();
        Object object1 = this.j.set(v, ((String)object0));
        if(object1 instanceof String) {
            return (String)object1;
        }
        return object1 instanceof zzgji ? ((zzgji)object1).zzA(zzgla.a) : zzgla.zzh(((byte[])object1));
    }

    @Override
    public final int size() {
        return this.j.size();
    }

    @Override  // com.google.android.gms.internal.ads.zzgkz
    public final zzgkz zzd(int v) {
        if(v < this.size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList0 = new ArrayList(v);
        arrayList0.addAll(this.j);
        return new zzglh(arrayList0);
    }

    @Override  // com.google.android.gms.internal.ads.zzgli
    public final zzgli zze() {
        return this.zzc() ? new zzgnp(this) : this;
    }

    @Override  // com.google.android.gms.internal.ads.zzgli
    public final Object zzf(int v) {
        return this.j.get(v);
    }

    public final String zzg(int v) {
        ArrayList arrayList0 = this.j;
        Object object0 = arrayList0.get(v);
        if(object0 instanceof String) {
            return (String)object0;
        }
        if(object0 instanceof zzgji) {
            String s = ((zzgji)object0).zzA(zzgla.a);
            if(((zzgji)object0).zzp()) {
                arrayList0.set(v, s);
            }
            return s;
        }
        String s1 = zzgla.zzh(((byte[])object0));
        if(zzgla.zzi(((byte[])object0))) {
            arrayList0.set(v, s1);
        }
        return s1;
    }

    @Override  // com.google.android.gms.internal.ads.zzgli
    public final List zzh() {
        return Collections.unmodifiableList(this.j);
    }

    @Override  // com.google.android.gms.internal.ads.zzgli
    public final void zzi(zzgji zzgji0) {
        this.a();
        this.j.add(zzgji0);
        ++this.modCount;
    }
}

