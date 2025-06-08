package com.google.android.gms.internal.measurement;

public abstract class zzim implements zzlk {
    public abstract zzka a(zzin arg1);

    @Override
    public Object clone() throws CloneNotSupportedException {
        return this.zzau();
    }

    @Override  // com.google.android.gms.internal.measurement.zzlk
    public final zzlk zzaA(byte[] arr_b, zzjq zzjq0) throws zzko {
        return this.zzax(arr_b, 0, arr_b.length, zzjq0);
    }

    public abstract zzim zzau();

    public zzim zzaw(byte[] arr_b, int v, int v1) throws zzko {
        throw null;
    }

    public zzim zzax(byte[] arr_b, int v, int v1, zzjq zzjq0) throws zzko {
        throw null;
    }

    @Override  // com.google.android.gms.internal.measurement.zzlk
    public final zzlk zzay(zzll zzll0) {
        if(!this.zzbO().getClass().isInstance(zzll0)) {
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }
        return this.a(((zzin)zzll0));
    }

    @Override  // com.google.android.gms.internal.measurement.zzlk
    public final zzlk zzaz(byte[] arr_b) throws zzko {
        return this.zzaw(arr_b, 0, arr_b.length);
    }
}

