package com.google.android.gms.internal.consent_sdk;

public final class zzcg implements zzcl {
    public volatile zzcl i;
    public volatile Object j;
    public static final Object k;

    static {
        zzcg.k = new Object();
    }

    public static zzcl zza(zzcl zzcl0) {
        zzcl0.getClass();
        if(zzcl0 instanceof zzcg) {
            return zzcl0;
        }
        zzcl zzcl1 = new zzcg();  // 初始化器: Ljava/lang/Object;-><init>()V
        zzcl1.j = zzcg.k;
        zzcl1.i = zzcl0;
        return zzcl1;
    }

    @Override  // com.google.android.gms.internal.consent_sdk.zzcl
    public final Object zzb() {
        Object object0 = this.j;
        Object object1 = zzcg.k;
        if(object0 == object1) {
            synchronized(this) {
                object0 = this.j;
                if(object0 == object1) {
                    object0 = this.i.zzb();
                    Object object2 = this.j;
                    if(object2 != object1 && !(object2 instanceof zzcj) && object2 != object0) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + object2 + " & " + object0 + ". This is likely due to a circular dependency.");
                    }
                    this.j = object0;
                    this.i = null;
                }
            }
        }
        return object0;
    }
}

