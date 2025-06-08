package com.google.android.gms.internal.play_billing;

import java.util.Map.Entry;

public final class s0 implements Map.Entry {
    public final Map.Entry i;

    public s0(Map.Entry map$Entry0) {
        this.i = map$Entry0;
    }

    @Override
    public final Object getKey() {
        return this.i.getKey();
    }

    @Override
    public final Object getValue() {
        if(((zzhw)this.i.getValue()) != null) {
            throw null;
        }
        return null;
    }

    @Override
    public final Object setValue(Object object0) {
        if(!(object0 instanceof zzim)) {
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }
        return ((zzhw)this.i.getValue()).zzc(((zzim)object0));
    }
}

