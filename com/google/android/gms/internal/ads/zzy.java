package com.google.android.gms.internal.ads;

import android.util.SparseBooleanArray;

public final class zzy {
    public final SparseBooleanArray a;

    public zzy(SparseBooleanArray sparseBooleanArray0) {
        this.a = sparseBooleanArray0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof zzy)) {
            return false;
        }
        SparseBooleanArray sparseBooleanArray0 = this.a;
        if(zzeg.zza < 24) {
            if(sparseBooleanArray0.size() == ((zzy)object0).a.size()) {
                for(int v = 0; v < sparseBooleanArray0.size(); ++v) {
                    if(this.zza(v) != ((zzy)object0).zza(v)) {
                        return false;
                    }
                }
                return true;
            }
            return false;
        }
        return sparseBooleanArray0.equals(((zzy)object0).a);
    }

    @Override
    public final int hashCode() {
        SparseBooleanArray sparseBooleanArray0 = this.a;
        if(zzeg.zza < 24) {
            int v = sparseBooleanArray0.size();
            for(int v1 = 0; v1 < sparseBooleanArray0.size(); ++v1) {
                v = v * 0x1F + this.zza(v1);
            }
            return v;
        }
        return sparseBooleanArray0.hashCode();
    }

    public final int zza(int v) {
        zzcw.zza(v, 0, this.a.size());
        return this.a.keyAt(v);
    }

    public final int zzb() {
        return this.a.size();
    }

    public final boolean zzc(int v) {
        return this.a.get(v);
    }
}

