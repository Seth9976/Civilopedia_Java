package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;

public final class zzffp {
    public static final zzffw zza(Callable callable0, Object object0, zzffx zzffx0) {
        return zzffp.zzb(callable0, zzffx0.a, object0, zzffx0);
    }

    public static final zzffw zzb(Callable callable0, zzfvm zzfvm0, Object object0, zzffx zzffx0) {
        List list0 = Collections.emptyList();
        zzfvl zzfvl0 = zzfvm0.zzb(callable0);
        return new zzffw(zzffx0, object0, null, zzffx.d, list0, zzfvl0);
    }

    public static final zzffw zzc(zzfvl zzfvl0, Object object0, zzffx zzffx0) {
        List list0 = Collections.emptyList();
        return new zzffw(zzffx0, object0, null, zzffx.d, list0, zzfvl0);
    }

    public static final zzffw zzd(zzffj zzffj0, zzfvm zzfvm0, Object object0, zzffx zzffx0) {
        return zzffp.zzb(new zzffo(zzffj0), zzfvm0, object0, zzffx0);
    }
}

