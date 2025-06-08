package com.google.android.gms.internal.ads;

public final class zzgqt implements zzgqo, zzgrh {
    public volatile zzgrh a;
    public volatile Object b;
    public static final Object c;

    static {
        zzgqt.c = new Object();
    }

    public zzgqt(zzgrh zzgrh0) {
        this.b = zzgqt.c;
        this.a = zzgrh0;
    }

    public static zzgqo zza(zzgrh zzgrh0) {
        if(zzgrh0 instanceof zzgqo) {
            return (zzgqo)zzgrh0;
        }
        zzgrh0.getClass();
        return new zzgqt(zzgrh0);
    }

    @Override  // com.google.android.gms.internal.ads.zzgrh, com.google.android.gms.internal.ads.zzgqo
    public final Object zzb() {
        Object object0 = this.b;
        Object object1 = zzgqt.c;
        if(object0 == object1) {
            synchronized(this) {
                object0 = this.b;
                if(object0 == object1) {
                    object0 = this.a.zzb();
                    Object object2 = this.b;
                    if(object2 != object1 && object2 != object0) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + object2 + " & " + object0 + ". This is likely due to a circular dependency.");
                    }
                    this.b = object0;
                    this.a = null;
                }
            }
        }
        return object0;
    }

    public static zzgrh zzc(zzgrh zzgrh0) {
        zzgrh0.getClass();
        return zzgrh0 instanceof zzgqt ? zzgrh0 : new zzgqt(zzgrh0);
    }
}

