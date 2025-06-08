package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

public abstract class zzfpm extends zzfti {
    public Object i;
    public int j;

    @Override
    public final boolean hasNext() {
        zzfou.zzh(this.j != 4);
        int v = this.j - 1;
        if(this.j == 0) {
            throw null;
        }
        switch(v) {
            case 0: {
                return true;
            label_6:
                this.j = 4;
                this.i = this.zza();
                if(this.j != 3) {
                    this.j = 1;
                    return true;
                }
                break;
            }
            case 2: {
                break;
            }
            default: {
                goto label_6;
            }
        }
        return false;
    }

    @Override
    public final Object next() {
        if(!this.hasNext()) {
            throw new NoSuchElementException();
        }
        this.j = 2;
        Object object0 = this.i;
        this.i = null;
        return object0;
    }

    public abstract Object zza();
}

