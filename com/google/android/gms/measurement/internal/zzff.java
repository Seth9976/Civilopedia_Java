package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences.Editor;
import com.google.android.gms.common.internal.Preconditions;
import i1.r;

public final class zzff {
    public final String a;
    public final long b;
    public boolean c;
    public long d;
    public final r e;

    public zzff(r r0, String s, long v) {
        this.e = r0;
        super();
        Preconditions.checkNotEmpty(s);
        this.a = s;
        this.b = v;
    }

    public final long zza() {
        if(!this.c) {
            this.c = true;
            this.d = this.e.d().getLong(this.a, this.b);
        }
        return this.d;
    }

    public final void zzb(long v) {
        SharedPreferences.Editor sharedPreferences$Editor0 = this.e.d().edit();
        sharedPreferences$Editor0.putLong(this.a, v);
        sharedPreferences$Editor0.apply();
        this.d = v;
    }
}

