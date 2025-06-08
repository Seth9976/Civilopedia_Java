package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class zzfpg {
    public final F6 a;

    public zzfpg(F6 f60) {
        this.a = f60;
    }

    public static zzfpg zzb(int v) {
        return new zzfpg(new S(20));
    }

    public static zzfpg zzc(zzfoh zzfoh0) {
        return new zzfpg(new J5(zzfoh0, 5));
    }

    public final Iterable zzd(CharSequence charSequence0) {
        charSequence0.getClass();
        return new D6(this, charSequence0);
    }

    public final List zzf(CharSequence charSequence0) {
        Iterator iterator0 = this.a.d(this, charSequence0);
        ArrayList arrayList0 = new ArrayList();
        while(((E6)iterator0).hasNext()) {
            arrayList0.add(((String)((E6)iterator0).next()));
        }
        return Collections.unmodifiableList(arrayList0);
    }
}

