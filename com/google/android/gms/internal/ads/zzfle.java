package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.internal.ShowFirstParty;
import java.util.concurrent.TimeUnit;

@ShowFirstParty
public final class zzfle {
    public static zzfmn zza(Context context0, int v, int v1, String s, String s1, String s2, zzfku zzfku0) {
        zzfmn zzfmn0;
        s6 s60 = new s6(context0, v1, s, s1, zzfku0);
        try {
            zzfmn0 = (zzfmn)s60.l.poll(50000L, TimeUnit.MILLISECONDS);
        }
        catch(InterruptedException interruptedException0) {
            s60.b(2009, s60.o, interruptedException0);
            zzfmn0 = null;
        }
        s60.b(3004, s60.o, null);
        if(zzfmn0 != null) {
            if(zzfmn0.zzc == 7) {
                zzfku.e = 3;
                return zzfmn0 == null ? new zzfmn(null, 1) : zzfmn0;
            }
            zzfku.e = 2;
        }
        return zzfmn0 == null ? new zzfmn(null, 1) : zzfmn0;
    }
}

