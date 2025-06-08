package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import android.content.SharedPreferences;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.os.ConditionVariable;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.wrappers.Wrappers;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONException;
import org.json.JSONObject;

@ParametersAreNonnullByDefault
public final class zzbhx implements SharedPreferences.OnSharedPreferenceChangeListener {
    public final Object a;
    public final ConditionVariable b;
    public volatile boolean c;
    public volatile boolean d;
    public SharedPreferences e;
    public Bundle f;
    public Context g;
    public JSONObject h;

    public zzbhx() {
        this.a = new Object();
        this.b = new ConditionVariable();
        this.c = false;
        this.d = false;
        this.e = null;
        this.f = new Bundle();
        this.h = new JSONObject();
    }

    public final void a() {
        if(this.e == null) {
            return;
        }
        try {
            this.h = new JSONObject(((String)zzbib.zza(new zzbhv(this))));
        }
        catch(JSONException unused_ex) {
        }
    }

    @Override  // android.content.SharedPreferences$OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences0, String s) {
        if("flag_configuration".equals(s)) {
            this.a();
        }
    }

    public final Object zzb(zzbhr zzbhr0) {
        if(!this.b.block(5000L)) {
            Object object0 = this.a;
            synchronized(object0) {
                if(this.d) {
                    goto label_11;
                }
            }
            throw new IllegalStateException("Flags.initialize() was not called!");
        }
    label_11:
        if(!this.c || this.e == null) {
            synchronized(this.a) {
                if(this.c && this.e != null) {
                    goto label_19;
                }
            }
            return zzbhr0.zzm();
        }
    label_19:
        switch(zzbhr0.zze()) {
            case 1: {
                return this.h.has(zzbhr0.zzn()) ? zzbhr0.a(this.h) : zzbib.zza(new zzbhu(this, zzbhr0));
            }
            case 2: {
                return this.f == null ? zzbhr0.zzm() : zzbhr0.zzb(this.f);
            }
            default: {
                return zzbib.zza(new zzbhu(this, zzbhr0));
            }
        }
    }

    public final void zze(Context context0) {
        if(this.c) {
            return;
        }
        synchronized(this.a) {
            if(this.c) {
                return;
            }
            if(!this.d) {
                this.d = true;
            }
            Context context1 = context0.getApplicationContext() == null ? context0 : context0.getApplicationContext();
            try {
                this.g = context1;
                this.f = Wrappers.packageManager(context1).getApplicationInfo("com.spears.civilopedia", 0x80).metaData;
            }
            catch(PackageManager.NameNotFoundException | NullPointerException unused_ex) {
            }
            try {
                Context context2 = GooglePlayServicesUtilLight.getRemoteContext(context0);
                if(context2 == null) {
                    context2 = context0.getApplicationContext();
                    if(context2 != null) {
                        context0 = context2;
                    }
                }
                else {
                    context0 = context2;
                }
                SharedPreferences sharedPreferences0 = zzbht.zza(context0);
                this.e = sharedPreferences0;
                if(sharedPreferences0 != null) {
                    sharedPreferences0.registerOnSharedPreferenceChangeListener(this);
                }
                zzbkg.zzc(new J1(this));
                this.a();
                this.c = true;
            }
            finally {
                this.d = false;
                this.b.open();
            }
        }
    }
}

