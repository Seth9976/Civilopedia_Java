package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences.Editor;
import android.content.SharedPreferences;
import android.util.Pair;
import com.google.android.gms.common.internal.Preconditions;
import i1.r;

public final class zzfh {
    public final String a;
    public final String b;
    public final String c;
    public final long d;
    public final r e;

    public zzfh(r r0, long v) {
        this.e = r0;
        new String("health_monitor");
        Preconditions.checkArgument(v > 0L);
        this.a = "health_monitor:start";
        this.b = "health_monitor:count";
        this.c = "health_monitor:value";
        this.d = v;
    }

    public final void a() {
        this.e.zzg();
        long v = this.e.a.zzav().currentTimeMillis();
        SharedPreferences.Editor sharedPreferences$Editor0 = this.e.d().edit();
        sharedPreferences$Editor0.remove(this.b);
        sharedPreferences$Editor0.remove(this.c);
        sharedPreferences$Editor0.putLong(this.a, v);
        sharedPreferences$Editor0.apply();
    }

    public final Pair zza() {
        long v1;
        r r0 = this.e;
        r0.zzg();
        r0.zzg();
        long v = r0.d().getLong(this.a, 0L);
        if(v == 0L) {
            this.a();
            v1 = 0L;
        }
        else {
            v1 = Math.abs(v - r0.a.zzav().currentTimeMillis());
        }
        long v2 = this.d;
        if(v1 < v2) {
            return null;
        }
        if(v1 > v2 + v2) {
            this.a();
            return null;
        }
        String s = r0.d().getString(this.c, null);
        long v3 = r0.d().getLong(this.b, 0L);
        this.a();
        return s == null || v3 <= 0L ? r.w : new Pair(s, v3);
    }

    public final void zzb(String s, long v) {
        r r0 = this.e;
        r0.zzg();
        if(r0.d().getLong(this.a, 0L) == 0L) {
            this.a();
        }
        if(s == null) {
            s = "";
        }
        SharedPreferences sharedPreferences0 = r0.d();
        String s1 = this.b;
        long v1 = sharedPreferences0.getLong(s1, 0L);
        String s2 = this.c;
        if(v1 <= 0L) {
            SharedPreferences.Editor sharedPreferences$Editor0 = r0.d().edit();
            sharedPreferences$Editor0.putString(s2, s);
            sharedPreferences$Editor0.putLong(s1, 1L);
            sharedPreferences$Editor0.apply();
            return;
        }
        long v2 = r0.a.zzv().g().nextLong();
        SharedPreferences.Editor sharedPreferences$Editor1 = r0.d().edit();
        if((v2 & 0x7FFFFFFFFFFFFFFFL) < 0x7FFFFFFFFFFFFFFFL / (v1 + 1L)) {
            sharedPreferences$Editor1.putString(s2, s);
        }
        sharedPreferences$Editor1.putLong(s1, v1 + 1L);
        sharedPreferences$Editor1.apply();
    }
}

