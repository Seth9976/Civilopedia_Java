package com.google.android.gms.internal.ads;

public final class zzty {
    public final zzfrj a;
    public int b;
    public static final zzty zza;
    public static final zzl zzb;
    public final int zzc;

    static {
        zzty.zza = new zzty(new zzck[0]);
        zzty.zzb = zztx.zza;
    }

    public zzty(zzck[] arr_zzck) {
        this.a = zzfrj.zzn(arr_zzck);
        this.zzc = arr_zzck.length;
        for(int v = 0; v < this.a.size(); ++v) {
            for(int v1 = v + 1; v1 < this.a.size(); ++v1) {
                if(((zzck)this.a.get(v)).equals(this.a.get(v1))) {
                    zzdn.zza("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
        }
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            return zzty.class == class0 && this.zzc == ((zzty)object0).zzc && this.a.equals(((zzty)object0).a);
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int v = this.b;
        if(v == 0) {
            v = this.a.hashCode();
            this.b = v;
        }
        return v;
    }

    public final int zza(zzck zzck0) {
        int v = this.a.indexOf(zzck0);
        return v < 0 ? -1 : v;
    }

    public final zzck zzb(int v) {
        return (zzck)this.a.get(v);
    }
}

