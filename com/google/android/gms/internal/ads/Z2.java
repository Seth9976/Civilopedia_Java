package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.util.ArrayList;
import java.util.HashMap;

public final class z2 {
    public final HashMap a;
    public final ArrayList b;
    public final Context c;
    public final zzccp d;

    public z2(Context context0, zzccp zzccp0) {
        this.a = new HashMap();
        this.b = new ArrayList();
        this.c = context0;
        this.d = zzccp0;
    }

    public final void a(String s) {
        synchronized(this) {
            if(this.a.containsKey(s)) {
                return;
            }
            SharedPreferences sharedPreferences0 = "__default__".equals(s) ? PreferenceManager.getDefaultSharedPreferences(this.c) : this.c.getSharedPreferences(s, 0);
            y2 y20 = new y2(this, s);
            this.a.put(s, y20);
            sharedPreferences0.registerOnSharedPreferenceChangeListener(y20);
        }
    }

    public final void b(zzcdq zzcdq0) {
        synchronized(this) {
            this.b.add(zzcdq0);
        }
    }
}

