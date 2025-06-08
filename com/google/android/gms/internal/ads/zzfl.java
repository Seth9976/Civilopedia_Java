package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Map;

public final class zzfl extends zzfj {
    public final int zzd;
    public final String zze;
    public final Map zzf;
    public final byte[] zzg;

    public zzfl(int v, String s, IOException iOException0, Map map0, zzev zzev0, byte[] arr_b) {
        super("Response code: " + v, iOException0, zzev0, 2004, 1);
        this.zzd = v;
        this.zze = s;
        this.zzf = map0;
        this.zzg = arr_b;
    }
}

