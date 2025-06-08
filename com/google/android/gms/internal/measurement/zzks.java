package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

public final class zzks extends K implements zzkt, RandomAccess {
    public final ArrayList j;
    public static final zzkt zza;

    static {
        zzks zzks0 = new zzks(10);
        zzks0.zzb();
        zzks.zza = zzks0;
    }

    public zzks() {
        this(10);
    }

    public zzks(int v) {
        ArrayList arrayList0 = new ArrayList(v);
        super();
        this.j = arrayList0;
    }

    public zzks(ArrayList arrayList0) {
        this.j = arrayList0;
    }

    @Override
    public final void add(int v, Object object0) {
        this.a();
        this.j.add(v, ((String)object0));
        ++this.modCount;
    }

    @Override  // com.google.android.gms.internal.measurement.K
    public final boolean addAll(int v, Collection collection0) {
        this.a();
        if(collection0 instanceof zzkt) {
            collection0 = ((zzkt)collection0).zzh();
        }
        boolean z = this.j.addAll(v, collection0);
        ++this.modCount;
        return z;
    }

    @Override  // com.google.android.gms.internal.measurement.K
    public final boolean addAll(Collection collection0) {
        return this.addAll(this.size(), collection0);
    }

    @Override  // com.google.android.gms.internal.measurement.K
    public final void clear() {
        this.a();
        this.j.clear();
        ++this.modCount;
    }

    @Override
    public final Object get(int v) {
        return this.zzg(v);
    }

    @Override  // com.google.android.gms.internal.measurement.K
    public final Object remove(int v) {
        this.a();
        Object object0 = this.j.remove(v);
        ++this.modCount;
        if(object0 instanceof String) {
            return (String)object0;
        }
        return object0 instanceof zzjd ? ((zzjd)object0).zzn(zzkm.a) : zzkm.zzh(((byte[])object0));
    }

    @Override
    public final Object set(int v, Object object0) {
        this.a();
        Object object1 = this.j.set(v, ((String)object0));
        if(object1 instanceof String) {
            return (String)object1;
        }
        return object1 instanceof zzjd ? ((zzjd)object1).zzn(zzkm.a) : zzkm.zzh(((byte[])object1));
    }

    @Override
    public final int size() {
        return this.j.size();
    }

    @Override  // com.google.android.gms.internal.measurement.zzkl
    public final zzkl zzd(int v) {
        if(v < this.size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList0 = new ArrayList(v);
        arrayList0.addAll(this.j);
        return new zzks(arrayList0);
    }

    @Override  // com.google.android.gms.internal.measurement.zzkt
    public final zzkt zze() {
        return this.zzc() ? new zzms(this) : this;
    }

    @Override  // com.google.android.gms.internal.measurement.zzkt
    public final Object zzf(int v) {
        return this.j.get(v);
    }

    public final String zzg(int v) {
        ArrayList arrayList0 = this.j;
        Object object0 = arrayList0.get(v);
        if(object0 instanceof String) {
            return (String)object0;
        }
        if(object0 instanceof zzjd) {
            String s = ((zzjd)object0).zzn(zzkm.a);
            if(((zzjd)object0).zzi()) {
                arrayList0.set(v, s);
            }
            return s;
        }
        String s1 = zzkm.zzh(((byte[])object0));
        if(zzkm.zzi(((byte[])object0))) {
            arrayList0.set(v, s1);
        }
        return s1;
    }

    @Override  // com.google.android.gms.internal.measurement.zzkt
    public final List zzh() {
        return Collections.unmodifiableList(this.j);
    }

    @Override  // com.google.android.gms.internal.measurement.zzkt
    public final void zzi(zzjd zzjd0) {
        this.a();
        this.j.add(zzjd0);
        ++this.modCount;
    }
}

