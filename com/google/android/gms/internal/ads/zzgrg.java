package com.google.android.gms.internal.ads;

public final class zzgrg implements zzgrh {
    public volatile zzgrh a;
    public volatile Object b;
    public static final Object c;

    static {
        zzgrg.c = new Object();
    }

    public static zzgrh zza(zzgrh zzgrh0) {
        if(!(zzgrh0 instanceof zzgrg) && !(zzgrh0 instanceof zzgqt)) {
            zzgrh0.getClass();
            zzgrh zzgrh1 = new zzgrg();  // 初始化器: Ljava/lang/Object;-><init>()V
            zzgrh1.b = zzgrg.c;
            zzgrh1.a = zzgrh0;
            return zzgrh1;
        }
        return zzgrh0;
    }

    @Override  // com.google.android.gms.internal.ads.zzgrh
    public final Object zzb() {
        Object object0 = this.b;
        if(object0 == zzgrg.c) {
            zzgrh zzgrh0 = this.a;
            if(zzgrh0 == null) {
                return this.b;
            }
            object0 = zzgrh0.zzb();
            this.b = object0;
            this.a = null;
        }
        return object0;
    }
}

