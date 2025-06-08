package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public final class c8 extends h {
    public final AtomicReferenceFieldUpdater n;
    public final AtomicIntegerFieldUpdater o;

    public c8(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater0, AtomicIntegerFieldUpdater atomicIntegerFieldUpdater0) {
        this.n = atomicReferenceFieldUpdater0;
        this.o = atomicIntegerFieldUpdater0;
    }

    @Override  // com.google.android.gms.internal.ads.h
    public final int b(b8 b80) {
        return this.o.decrementAndGet(b80);
    }

    @Override  // com.google.android.gms.internal.ads.h
    public final void u(b8 b80, Set set0) {
        while(!this.n.compareAndSet(b80, null, set0) && (this.n.get(b80) == null || this.n.get(b80) == null)) {
        }
    }
}

