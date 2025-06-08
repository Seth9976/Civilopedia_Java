package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import i3.e;

public final class zzait {
    public final String a;
    public final String b;

    public zzait(String s, String s1) {
        this.a = s;
        this.b = s1;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            return zzait.class == class0 && TextUtils.equals(this.a, ((zzait)object0).a) && TextUtils.equals(this.b, ((zzait)object0).b);
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return this.b.hashCode() + this.a.hashCode() * 0x1F;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("Header[name=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(",value=");
        return e.h(stringBuilder0, this.b, "]");
    }

    public final String zza() {
        return this.a;
    }

    public final String zzb() {
        return this.b;
    }
}

