package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.AbstractSequentialList;
import java.util.List;
import java.util.ListIterator;

public final class l7 extends AbstractSequentialList implements Serializable {
    public final List i;
    public final zzfok j;

    public l7(List list0, zzfok zzfok0) {
        this.i = list0;
        this.j = zzfok0;
    }

    @Override
    public final void clear() {
        this.i.clear();
    }

    @Override
    public final ListIterator listIterator(int v) {
        return new k7(this.i.listIterator(v));  // 初始化器: Lcom/google/android/gms/internal/ads/G7;-><init>(Ljava/util/Iterator;)V
    }

    @Override
    public final int size() {
        return this.i.size();
    }
}

