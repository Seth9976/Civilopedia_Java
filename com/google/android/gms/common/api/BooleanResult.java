package com.google.android.gms.common.api;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;

public class BooleanResult implements Result {
    public final Status i;
    public final boolean j;

    @KeepForSdk
    @ShowFirstParty
    public BooleanResult(Status status0, boolean z) {
        this.i = (Status)Preconditions.checkNotNull(status0, "Status must not be null");
        this.j = z;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == null) {
            return false;
        }
        if(object0 == this) {
            return true;
        }
        return object0 instanceof BooleanResult ? this.i.equals(((BooleanResult)object0).i) && this.j == ((BooleanResult)object0).j : false;
    }

    @Override  // com.google.android.gms.common.api.Result
    public Status getStatus() {
        return this.i;
    }

    public boolean getValue() {
        return this.j;
    }

    @Override
    public final int hashCode() {
        return (this.i.hashCode() + 0x20F) * 0x1F + this.j;
    }
}

