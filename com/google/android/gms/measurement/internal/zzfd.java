package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences.Editor;
import com.google.android.gms.common.internal.Preconditions;
import i1.r;

public final class zzfd {
    public final String a;
    public final boolean b;
    public boolean c;
    public boolean d;
    public final r e;

    public zzfd(r r0, String s, boolean z) {
        this.e = r0;
        super();
        Preconditions.checkNotEmpty(s);
        this.a = s;
        this.b = z;
    }

    public final void zza(boolean z) {
        SharedPreferences.Editor sharedPreferences$Editor0 = this.e.d().edit();
        sharedPreferences$Editor0.putBoolean(this.a, z);
        sharedPreferences$Editor0.apply();
        this.d = z;
    }

    public final boolean zzb() {
        if(!this.c) {
            this.c = true;
            this.d = this.e.d().getBoolean(this.a, this.b);
        }
        return this.d;
    }
}

