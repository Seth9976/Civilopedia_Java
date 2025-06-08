package com.google.android.gms.internal.consent_sdk;

import android.content.Context;
import android.content.SharedPreferences.Editor;
import java.util.HashMap;

public final class zzbz {
    public final Context a;
    public final HashMap b;

    public zzbz(Context context0) {
        this.b = new HashMap();
        this.a = context0;
    }

    public final SharedPreferences.Editor a(String s) {
        HashMap hashMap0 = this.b;
        if(!hashMap0.containsKey(s)) {
            hashMap0.put(s, this.a.getSharedPreferences(s, 0).edit());
        }
        return (SharedPreferences.Editor)hashMap0.get(s);
    }

    public final void zzb() {
        for(Object object0: this.b.values()) {
            ((SharedPreferences.Editor)object0).apply();
        }
    }

    public final boolean zzc(String s, Object object0) {
        zzby zzby0 = zzca.zza(this.a, s);
        if(zzby0 == null) {
            return false;
        }
        SharedPreferences.Editor sharedPreferences$Editor0 = this.a(zzby0.zza);
        if(object0 instanceof Integer) {
            sharedPreferences$Editor0.putInt(zzby0.zzb, ((int)(((Integer)object0))));
            return true;
        }
        if(object0 instanceof Long) {
            sharedPreferences$Editor0.putLong(zzby0.zzb, ((long)(((Long)object0))));
            return true;
        }
        if(object0 instanceof Double) {
            sharedPreferences$Editor0.putFloat(zzby0.zzb, ((Double)object0).floatValue());
            return true;
        }
        if(object0 instanceof Float) {
            sharedPreferences$Editor0.putFloat(zzby0.zzb, ((float)(((Float)object0))));
            return true;
        }
        if(object0 instanceof Boolean) {
            sharedPreferences$Editor0.putBoolean(zzby0.zzb, ((Boolean)object0).booleanValue());
            return true;
        }
        if(object0 instanceof String) {
            sharedPreferences$Editor0.putString(zzby0.zzb, ((String)object0));
            return true;
        }
        return false;
    }
}

