package com.google.android.gms.internal.play_billing;

import java.util.Objects;
import java.util.function.Function;

public final class zzbs implements Function {
    @Override
    public final Object apply(Object object0) {
        int v = ((zzcu)object0).b;
        switch(v) {
            case 0: {
                return x.q;
            }
            case 1: {
                Object object1 = ((zzcu)object0).a[0];
                Objects.requireNonNull(object1);
                return new z(object1);
            }
            default: {
                zzcv zzcv0 = zzcv.n(v, ((zzcu)object0).a);
                ((zzcu)object0).b = zzcv0.size();
                ((zzcu)object0).c = true;
                return zzcv0;
            }
        }
    }
}

