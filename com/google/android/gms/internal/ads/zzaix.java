package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.TreeMap;

public final class zzaix {
    public final int zza;
    public final byte[] zzb;
    public final Map zzc;
    public final List zzd;
    public final boolean zze;

    public zzaix(int v, byte[] arr_b, Map map0, List list0, boolean z) {
        this.zza = v;
        this.zzb = arr_b;
        this.zzc = map0;
        this.zzd = list0 == null ? null : Collections.unmodifiableList(list0);
        this.zze = z;
    }

    @Deprecated
    public zzaix(int v, byte[] arr_b, Map map0, boolean z, long v1) {
        this(v, arr_b, map0, zzaix.a(map0), z);
    }

    public zzaix(int v, byte[] arr_b, boolean z, long v1, List list0) {
        Map map0;
        if(list0 == null) {
            map0 = null;
        }
        else if(list0.isEmpty()) {
            map0 = Collections.emptyMap();
        }
        else {
            map0 = new TreeMap(String.CASE_INSENSITIVE_ORDER);
            for(Object object0: list0) {
                ((TreeMap)map0).put(((zzait)object0).zza(), ((zzait)object0).zzb());
            }
        }
        this(v, arr_b, map0, list0, z);
    }

    @Deprecated
    public zzaix(byte[] arr_b, Map map0) {
        this(200, arr_b, map0, zzaix.a(map0), false);
    }

    public static List a(Map map0) {
        if(map0 == null) {
            return null;
        }
        if(map0.isEmpty()) {
            return Collections.emptyList();
        }
        List list0 = new ArrayList(map0.size());
        for(Object object0: map0.entrySet()) {
            ((ArrayList)list0).add(new zzait(((String)((Map.Entry)object0).getKey()), ((String)((Map.Entry)object0).getValue())));
        }
        return list0;
    }
}

