package com.google.android.gms.internal.ads;

import java.util.Comparator;

public final class s0 implements Comparator {
    public final int i;

    public s0(int v) {
        this.i = v;
        super();
    }

    @Override
    public final int compare(Object object0, Object object1) {
        switch(this.i) {
            case 0: {
                return ((byte[])object0).length - ((byte[])object1).length;
            }
            case 1: {
                return ((zzart)object1).zzb - ((zzart)object0).zzb;
            }
            default: {
                int v = ((zzbbv)object0).c - ((zzbbv)object1).c;
                return v == 0 ? ((int)(((zzbbv)object0).a - ((zzbbv)object1).a)) : v;
            }
        }
    }
}

