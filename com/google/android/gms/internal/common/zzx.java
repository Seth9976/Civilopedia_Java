package com.google.android.gms.internal.common;

import T1.c;
import c1.e;
import c1.f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.jspecify.nullness.NullMarked;

@NullMarked
public final class zzx {
    public final boolean a;
    public final c b;

    public zzx(c c0, boolean z) {
        this.b = c0;
        this.a = z;
    }

    public final zzx zzb() {
        return new zzx(this.b, true);
    }

    public static zzx zzc(zzo zzo0) {
        return new zzx(new c(zzo0, 21), false);
    }

    public final Iterable zzd(CharSequence charSequence0) {
        return new f(this, charSequence0);
    }

    public final List zzf(CharSequence charSequence0) {
        charSequence0.getClass();
        e e0 = new e(this.b, this, charSequence0);
        ArrayList arrayList0 = new ArrayList();
        while(e0.hasNext()) {
            arrayList0.add(((String)e0.next()));
        }
        return Collections.unmodifiableList(arrayList0);
    }
}

