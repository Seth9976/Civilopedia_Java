package com.google.android.gms.internal.ads;

import java.util.Arrays;
import javax.annotation.CheckForNull;

public final class zzfoo {
    public final String a;
    public final Q b;
    public Q c;

    public zzfoo(String s) {
        Q q0 = new Q(15);
        this.b = q0;
        this.c = q0;
        this.a = s;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder(0x20);
        stringBuilder0.append(this.a);
        stringBuilder0.append('{');
        Q q0 = (Q)this.b.k;
        for(String s = ""; q0 != null; s = ", ") {
            Object object0 = q0.j;
            stringBuilder0.append(s);
            if(object0 == null || !object0.getClass().isArray()) {
                stringBuilder0.append(object0);
            }
            else {
                String s1 = Arrays.deepToString(new Object[]{object0});
                stringBuilder0.append(s1, 1, s1.length() - 1);
            }
            q0 = (Q)q0.k;
        }
        stringBuilder0.append('}');
        return stringBuilder0.toString();
    }

    public final zzfoo zza(@CheckForNull Object object0) {
        Q q0 = new Q(15);
        this.c.k = q0;
        this.c = q0;
        q0.j = object0;
        return this;
    }
}

