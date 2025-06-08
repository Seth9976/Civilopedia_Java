package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.internal.ShowFirstParty;
import java.util.concurrent.TimeUnit;

@ShowFirstParty
public final class zzflc {
    public static zzaly zza(Context context0, String s, String s1) {
        zzaly zzaly0;
        r6 r60 = new r6(context0, s, s1);
        try {
            zzaly0 = null;
            zzaly0 = (zzaly)r60.l.poll(5000L, TimeUnit.MILLISECONDS);
        }
        catch(InterruptedException unused_ex) {
        }
        return zzaly0 == null ? r6.a() : zzaly0;
    }
}

