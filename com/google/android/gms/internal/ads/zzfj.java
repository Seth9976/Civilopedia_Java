package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

public class zzfj extends zzer {
    public final zzev zzb;
    public final int zzc;

    public zzfj(zzev zzev0, int v, int v1) {
        super(2008);
        this.zzb = zzev0;
        this.zzc = 1;
    }

    public zzfj(IOException iOException0, zzev zzev0, int v, int v1) {
        if(v == 2000) {
            v = v1 == 1 ? 2001 : 2000;
        }
        super(iOException0, v);
        this.zzb = zzev0;
        this.zzc = v1;
    }

    public zzfj(String s, zzev zzev0, int v, int v1) {
        if(v == 2000) {
            v = v1 == 1 ? 2001 : 2000;
        }
        super(s, v);
        this.zzb = zzev0;
        this.zzc = v1;
    }

    public zzfj(String s, IOException iOException0, zzev zzev0, int v, int v1) {
        if(v == 2000) {
            v = v1 == 1 ? 2001 : 2000;
        }
        super(s, iOException0, v);
        this.zzb = zzev0;
        this.zzc = v1;
    }

    public static zzfj zza(IOException iOException0, zzev zzev0, int v) {
        int v1;
        String s = iOException0.getMessage();
        if(iOException0 instanceof SocketTimeoutException) {
            v1 = 2002;
        }
        else if(iOException0 instanceof InterruptedIOException) {
            v1 = 1004;
        }
        else {
            v1 = s == null || !zzfoc.zza(s).matches("cleartext.*not permitted.*") ? 2001 : 2007;
        }
        return v1 == 2007 ? new zzfi(iOException0, zzev0) : new zzfj(iOException0, zzev0, v1, v);
    }
}

