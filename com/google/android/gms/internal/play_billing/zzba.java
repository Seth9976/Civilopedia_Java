package com.google.android.gms.internal.play_billing;

import B.c;
import java.util.Arrays;
import javax.annotation.CheckForNull;

public final class zzba {
    public final String a;
    public final c b;
    public c c;

    public zzba(String s) {
        c c0 = new c(24);
        this.b = c0;
        this.c = c0;
        this.a = s;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder(0x20);
        stringBuilder0.append(this.a);
        stringBuilder0.append('{');
        c c0 = (c)this.b.k;
        for(String s = ""; c0 != null; s = ", ") {
            Object object0 = c0.j;
            stringBuilder0.append(s);
            if(object0 == null || !object0.getClass().isArray()) {
                stringBuilder0.append(object0);
            }
            else {
                String s1 = Arrays.deepToString(new Object[]{object0});
                stringBuilder0.append(s1, 1, s1.length() - 1);
            }
            c0 = (c)c0.k;
        }
        stringBuilder0.append('}');
        return stringBuilder0.toString();
    }

    public final zzba zza(@CheckForNull Object object0) {
        c c0 = new c(24);
        this.c.k = c0;
        this.c = c0;
        c0.j = object0;
        return this;
    }
}

