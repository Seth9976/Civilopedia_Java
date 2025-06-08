package com.google.android.gms.internal.play_billing;

import A.f;
import java.util.List;

public abstract class zzfu implements zzil {
    public static void a(int v, List list0) {
        String s = f.e(list0.size() - v, "Element at index ", " is null.");
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

    @Override
    public Object clone() throws CloneNotSupportedException {
        return this.zzb();
    }

    public abstract zzfu zzb();
}

