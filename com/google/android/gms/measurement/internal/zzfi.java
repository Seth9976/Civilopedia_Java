package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences.Editor;
import com.google.android.gms.common.internal.Preconditions;
import i1.r;

public final class zzfi {
    public final String a;
    public boolean b;
    public String c;
    public final r d;

    public zzfi(r r0, String s, String s1) {
        this.d = r0;
        super();
        Preconditions.checkNotEmpty(s);
        this.a = s;
    }

    public final String zza() {
        if(!this.b) {
            this.b = true;
            this.c = this.d.d().getString(this.a, null);
        }
        return this.c;
    }

    public final void zzb(String s) {
        SharedPreferences.Editor sharedPreferences$Editor0 = this.d.d().edit();
        sharedPreferences$Editor0.putString(this.a, s);
        sharedPreferences$Editor0.apply();
        this.c = s;
    }
}

