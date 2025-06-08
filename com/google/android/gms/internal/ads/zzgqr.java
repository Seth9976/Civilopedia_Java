package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;

public final class zzgqr {
    public static LinkedHashMap zzb(int v) {
        if(v < 3) {
            return new LinkedHashMap(v + 1);
        }
        return v >= 0x40000000 ? new LinkedHashMap(0x7FFFFFFF) : new LinkedHashMap(((int)(((float)v) / 0.75f + 1.0f)));
    }

    public static List zzc(int v) {
        return v == 0 ? Collections.emptyList() : new ArrayList(v);
    }
}

