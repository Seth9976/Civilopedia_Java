package com.google.android.gms.internal.play_billing;

import java.util.Iterator;

public final class l implements zzdf {
    public final Iterator i;
    public boolean j;
    public Object k;

    public l(Iterator iterator0) {
        iterator0.getClass();
        this.i = iterator0;
    }

    // 去混淆评级： 低(20)
    @Override
    public final boolean hasNext() {
        return this.j || this.i.hasNext();
    }

    @Override  // com.google.android.gms.internal.play_billing.zzdf
    public final Object next() {
        if(!this.j) {
            return this.i.next();
        }
        Object object1 = this.k;
        this.j = false;
        this.k = null;
        return object1;
    }

    @Override
    public final void remove() {
        if(this.j) {
            throw new IllegalStateException("Can\'t remove after you\'ve peeked at next");
        }
        this.i.remove();
    }

    @Override  // com.google.android.gms.internal.play_billing.zzdf
    public final Object zza() {
        if(!this.j) {
            Object object0 = this.i.next();
            this.k = object0;
            this.j = true;
        }
        return this.k;
    }
}

