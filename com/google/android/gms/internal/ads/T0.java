package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;

public final class t0 {
    public long a;
    public final String b;
    public final String c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final List h;

    public t0(String s, zzaik zzaik0) {
        String s1 = zzaik0.zzb;
        long v = zzaik0.zzc;
        long v1 = zzaik0.zzd;
        long v2 = zzaik0.zze;
        long v3 = zzaik0.zzf;
        List list0 = zzaik0.zzh;
        if(list0 == null) {
            Map map0 = zzaik0.zzg;
            list0 = new ArrayList(map0.size());
            for(Object object0: map0.entrySet()) {
                ((ArrayList)list0).add(new zzait(((String)((Map.Entry)object0).getKey()), ((String)((Map.Entry)object0).getValue())));
            }
        }
        this(s, s1, v, v1, v2, v3, list0);
    }

    public t0(String s, String s1, long v, long v1, long v2, long v3, List list0) {
        this.b = s;
        if("".equals(s1)) {
            s1 = null;
        }
        this.c = s1;
        this.d = v;
        this.e = v1;
        this.f = v2;
        this.g = v3;
        this.h = list0;
    }

    public static t0 a(u0 u00) {
        if(zzajx.a(u00) != 0x20150306) {
            throw new IOException();
        }
        String s = zzajx.c(u00);
        String s1 = zzajx.c(u00);
        long v = zzajx.b(u00);
        long v1 = zzajx.b(u00);
        long v2 = zzajx.b(u00);
        long v3 = zzajx.b(u00);
        int v4 = zzajx.a(u00);
        if(v4 < 0) {
            throw new IOException("readHeaderList size=" + v4);
        }
        List list0 = v4 == 0 ? Collections.emptyList() : new ArrayList();
        for(int v5 = 0; v5 < v4; ++v5) {
            list0.add(new zzait(zzajx.c(u00).intern(), zzajx.c(u00).intern()));
        }
        return new t0(s, s1, v, v1, v2, v3, list0);
    }
}

