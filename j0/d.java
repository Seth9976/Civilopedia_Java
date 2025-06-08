package j0;

import O2.A;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public final class d extends A {
    public final AtomicReferenceFieldUpdater i;
    public final AtomicReferenceFieldUpdater j;
    public final AtomicReferenceFieldUpdater k;
    public final AtomicReferenceFieldUpdater l;
    public final AtomicReferenceFieldUpdater m;

    public d(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater0, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater1, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4) {
        this.i = atomicReferenceFieldUpdater0;
        this.j = atomicReferenceFieldUpdater1;
        this.k = atomicReferenceFieldUpdater2;
        this.l = atomicReferenceFieldUpdater3;
        this.m = atomicReferenceFieldUpdater4;
    }

    @Override  // O2.A
    public final void V(g g0, g g1) {
        this.j.lazySet(g0, g1);
    }

    @Override  // O2.A
    public final void W(g g0, Thread thread0) {
        this.i.lazySet(g0, thread0);
    }

    @Override  // O2.A
    public final boolean h(h h0, c c0, c c1) {
        do {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater0 = this.l;
            if(atomicReferenceFieldUpdater0.compareAndSet(h0, c0, c1)) {
                return true;
            }
        }
        while(atomicReferenceFieldUpdater0.get(h0) == c0);
        return false;
    }

    @Override  // O2.A
    public final boolean i(h h0, Object object0, Object object1) {
        do {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater0 = this.m;
            if(atomicReferenceFieldUpdater0.compareAndSet(h0, object0, object1)) {
                return true;
            }
        }
        while(atomicReferenceFieldUpdater0.get(h0) == object0);
        return false;
    }

    @Override  // O2.A
    public final boolean j(h h0, g g0, g g1) {
        do {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater0 = this.k;
            if(atomicReferenceFieldUpdater0.compareAndSet(h0, g0, g1)) {
                return true;
            }
        }
        while(atomicReferenceFieldUpdater0.get(h0) == g0);
        return false;
    }
}

