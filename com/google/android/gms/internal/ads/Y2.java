package com.google.android.gms.internal.ads;

import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import android.content.SharedPreferences;
import java.util.Map;
import java.util.Set;

public final class y2 implements SharedPreferences.OnSharedPreferenceChangeListener {
    public final String a;
    public final z2 b;

    public y2(z2 z20, String s) {
        this.b = z20;
        this.a = s;
    }

    @Override  // android.content.SharedPreferences$OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences0, String s) {
        synchronized(this.b) {
            for(Object object0: this.b.b) {
                z2 z21 = ((zzcdq)object0).zza;
                Map map0 = ((zzcdq)object0).zzb;
                z21.getClass();
                if(map0.containsKey(this.a) && ((Set)map0.get(this.a)).contains(s)) {
                    z21.d.zze();
                }
            }
        }
    }
}

