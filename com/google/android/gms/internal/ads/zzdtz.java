package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.List;
import javax.annotation.Nullable;

public final class zzdtz {
    public final HashMap a;

    public zzdtz() {
        this.a = new HashMap();
    }

    @Nullable
    public final zzdty zza(String s) {
        synchronized(this) {
            return (zzdty)this.a.get(s);
        }
    }

    @Nullable
    public final zzdty zzb(List list0) {
        for(Object object0: list0) {
            zzdty zzdty0 = this.zza(((String)object0));
            if(zzdty0 != null) {
                return zzdty0;
            }
            if(false) {
                break;
            }
        }
        return null;
    }

    public final String zzc(String s) {
        zzdty zzdty0 = this.zza(s);
        if(zzdty0 != null) {
            return zzdty0.zzb == null ? "" : zzdty0.zzb.toString();
        }
        return "";
    }
}

