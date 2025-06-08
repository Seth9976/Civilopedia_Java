package com.google.android.gms.internal.ads;

import java.util.Map;

public final class s4 implements zzcya {
    public final Map a;
    public final Map b;
    public final Map c;
    public final zzgrh d;
    public final zzdns e;

    public s4(Map map0, Map map1, Map map2, zzgrh zzgrh0, zzdns zzdns0) {
        this.a = map0;
        this.b = map1;
        this.c = map2;
        this.d = zzgrh0;
        this.e = zzdns0;
    }

    @Override  // com.google.android.gms.internal.ads.zzcya
    public final zzefd zza(int v, String s) {
        zzefd zzefd0 = (zzefd)this.a.get(s);
        if(zzefd0 != null) {
            return zzefd0;
        }
        switch(v) {
            case 1: {
                if(this.e.zze() != null) {
                    zzefd zzefd1 = ((zzcya)this.d.zzb()).zza(1, s);
                    return zzefd1 == null ? null : zzcye.zza(zzefd1);
                }
                return null;
            }
            case 4: {
                zzehr zzehr0 = (zzehr)this.c.get(s);
                if(zzehr0 != null) {
                    return new zzefe(zzehr0, zzcyc.zza);
                }
                zzefd zzefd2 = (zzefd)this.b.get(s);
                return zzefd2 == null ? null : zzcye.zza(zzefd2);
            }
            default: {
                return null;
            }
        }
    }
}

