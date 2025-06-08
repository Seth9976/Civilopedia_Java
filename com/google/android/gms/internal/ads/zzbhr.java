package com.google.android.gms.internal.ads;

import android.content.SharedPreferences.Editor;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzay;
import org.json.JSONObject;

public abstract class zzbhr {
    public final int a;
    public final String b;
    public final Object c;

    public zzbhr(int v, Object object0, String s) {
        this.a = v;
        this.b = s;
        this.c = object0;
        zzay.zza().zzd(this);
    }

    public abstract Object a(JSONObject arg1);

    public abstract Object b(SharedPreferences arg1);

    public abstract Object zzb(Bundle arg1);

    public abstract void zzd(SharedPreferences.Editor arg1, Object arg2);

    public final int zze() {
        return this.a;
    }

    public static zzbhr zzf(int v, String s, float f) {
        return new I1(1, s, f, 3);
    }

    public static zzbhr zzg(int v, String s, int v1) {
        return new I1(1, s, v1, 1);
    }

    public static zzbhr zzh(int v, String s, long v1) {
        return new I1(1, s, v1, 2);
    }

    public static zzbhr zzi(int v, String s, Boolean boolean0) {
        return new I1(v, s, boolean0, 0);
    }

    public static zzbhr zzj(int v, String s, String s1) {
        return new I1(1, s, s1, 4);
    }

    public static zzbhr zzk(int v, String s) {
        zzbhr zzbhr0 = zzbhr.zzj(1, "gads:sdk_core_constants:experiment_id", null);
        zzay.zza().zzc(zzbhr0);
        return zzbhr0;
    }

    public final Object zzl() {
        return zzay.zzc().zzb(this);
    }

    public final Object zzm() {
        return this.c;
    }

    public final String zzn() {
        return this.b;
    }
}

