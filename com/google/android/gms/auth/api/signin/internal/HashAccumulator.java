package com.google.android.gms.auth.api.signin.internal;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.errorprone.annotations.CanIgnoreReturnValue;

@KeepForSdk
public class HashAccumulator {
    public int a;

    public HashAccumulator() {
        this.a = 1;
    }

    @KeepForSdk
    @CanIgnoreReturnValue
    public HashAccumulator addObject(Object object0) {
        this.a = this.a * 0x1F + (object0 == null ? 0 : object0.hashCode());
        return this;
    }

    @KeepForSdk
    public int hash() {
        return this.a;
    }

    @CanIgnoreReturnValue
    public final HashAccumulator zaa(boolean z) {
        this.a = this.a * 0x1F + ((int)z);
        return this;
    }
}

