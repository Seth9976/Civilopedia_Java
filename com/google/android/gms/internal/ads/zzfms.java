package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import dalvik.system.DexClassLoader;
import f0.g;
import java.io.File;
import java.lang.reflect.Constructor;
import java.security.GeneralSecurityException;
import java.util.HashMap;

public final class zzfms {
    public final Context a;
    public final zzfmt b;
    public final zzfku c;
    public final zzfkp d;
    public g e;
    public final Object f;
    public static final HashMap g;

    static {
        zzfms.g = new HashMap();
    }

    public zzfms(Context context0, zzfmt zzfmt0, zzfku zzfku0, zzfkp zzfkp0) {
        this.f = new Object();
        this.a = context0;
        this.b = zzfmt0;
        this.c = zzfku0;
        this.d = zzfkp0;
    }

    public final Class a(zzfmi zzfmi0) {
        Class class1;
        synchronized(this) {
            HashMap hashMap0 = zzfms.g;
            Class class0 = (Class)hashMap0.get("");
            if(class0 != null) {
                return class0;
            }
            try {
                if(!this.d.zza(zzfmi0.zzc())) {
                    throw new zzfmr(2026, "VM did not pass signature verification");
                }
            }
            catch(GeneralSecurityException generalSecurityException0) {
                throw new zzfmr(2026, generalSecurityException0);
            }
            try {
                File file0 = zzfmi0.zzb();
                if(!file0.exists()) {
                    file0.mkdirs();
                }
                class1 = new DexClassLoader(zzfmi0.zzc().getAbsolutePath(), file0.getAbsolutePath(), null, this.a.getClassLoader()).loadClass("com.google.ccc.abuse.droidguard.DroidGuard");
            }
            catch(ClassNotFoundException | SecurityException | IllegalArgumentException classNotFoundException0) {
                throw new zzfmr(2008, classNotFoundException0);
            }
            hashMap0.put("", class1);
            return class1;
        }
    }

    public final zzfkx zza() {
        synchronized(this.f) {
        }
        return this.e;
    }

    public final zzfmi zzb() {
        synchronized(this.f) {
            g g0 = this.e;
            if(g0 != null) {
                return (zzfmi)g0.k;
            }
        }
        return null;
    }

    public final boolean zzc(zzfmi zzfmi0) {
        Object object0;
        long v;
        try {
            v = System.currentTimeMillis();
            Class class0 = this.a(zzfmi0);
            try {
                Constructor constructor0 = class0.getDeclaredConstructor(Context.class, String.class, byte[].class, Object.class, Bundle.class, Integer.TYPE);
                byte[] arr_b = zzfmi0.zze();
                Bundle bundle0 = new Bundle();
                object0 = constructor0.newInstance(this.a, "msa-r", arr_b, null, bundle0, 2);
            }
            catch(Exception exception1) {
                throw new zzfmr(2004, exception1);
            }
            g g0 = new g(object0, zzfmi0, this.b, this.c, 11);
            if(!g0.A()) {
                throw new zzfmr(4000, "init failed");
            }
            int v1 = g0.w();
            if(v1 != 0) {
                throw new zzfmr(4001, "ci: " + v1);
            }
            synchronized(this.f) {
                g g1 = this.e;
                if(g1 != null) {
                    try {
                        g1.z();
                    }
                    catch(zzfmr zzfmr1) {
                        this.c.zzc(zzfmr1.zza(), -1L, zzfmr1);
                    }
                }
                this.e = g0;
            }
            this.c.zzd(3000, System.currentTimeMillis() - v);
            return true;
        }
        catch(zzfmr zzfmr0) {
            this.c.zzc(zzfmr0.zza(), System.currentTimeMillis() - v, zzfmr0);
            return false;
        }
        catch(Exception exception0) {
            this.c.zzc(4010, System.currentTimeMillis() - v, exception0);
            return false;
        }
    }
}

