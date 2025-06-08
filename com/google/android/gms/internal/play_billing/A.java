package com.google.android.gms.internal.play_billing;

import javax.annotation.CheckForNull;

public abstract class a implements zzdj {
    @Override
    public final boolean equals(@CheckForNull Object object0) {
        if(object0 == this) {
            return true;
        }
        return object0 instanceof zzdj ? this.zzc().equals(((zzdj)object0).zzc()) : false;
    }

    @Override
    public final int hashCode() {
        return this.zzc().hashCode();
    }

    @Override
    public final String toString() {
        return this.zzc().toString();
    }
}

