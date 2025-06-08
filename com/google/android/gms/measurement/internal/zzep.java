package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import i3.e;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

public final class zzep {
    public final zzeo a;
    public static final AtomicReference b;
    public static final AtomicReference c;
    public static final AtomicReference d;

    static {
        zzep.b = new AtomicReference();
        zzep.c = new AtomicReference();
        zzep.d = new AtomicReference();
    }

    public zzep(zzeo zzeo0) {
        this.a = zzeo0;
    }

    public final String a(Object[] arr_object) {
        if(arr_object == null) {
            return "[]";
        }
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append("[");
        for(int v = 0; v < arr_object.length; ++v) {
            Object object0 = arr_object[v];
            String s = object0 instanceof Bundle ? this.b(((Bundle)object0)) : String.valueOf(object0);
            if(s != null) {
                if(stringBuilder0.length() != 1) {
                    stringBuilder0.append(", ");
                }
                stringBuilder0.append(s);
            }
        }
        stringBuilder0.append("]");
        return stringBuilder0.toString();
    }

    public final String b(Bundle bundle0) {
        String s;
        if(bundle0 == null) {
            return null;
        }
        if(!this.a.zza()) {
            return bundle0.toString();
        }
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append("Bundle[{");
        for(Object object0: bundle0.keySet()) {
            if(stringBuilder0.length() != 8) {
                stringBuilder0.append(", ");
            }
            stringBuilder0.append(this.e(((String)object0)));
            stringBuilder0.append("=");
            Object object1 = bundle0.get(((String)object0));
            if(object1 instanceof Bundle) {
                s = this.a(new Object[]{object1});
            }
            else if(object1 instanceof Object[]) {
                s = this.a(((Object[])object1));
            }
            else {
                s = object1 instanceof ArrayList ? this.a(((ArrayList)object1).toArray()) : String.valueOf(object1);
            }
            stringBuilder0.append(s);
        }
        stringBuilder0.append("}]");
        return stringBuilder0.toString();
    }

    public final String c(zzaw zzaw0) {
        String s;
        zzeo zzeo0 = this.a;
        if(!zzeo0.zza()) {
            return zzaw0.toString();
        }
        StringBuilder stringBuilder0 = new StringBuilder("origin=");
        stringBuilder0.append(zzaw0.zzc);
        stringBuilder0.append(",name=");
        stringBuilder0.append(this.d(zzaw0.zza));
        stringBuilder0.append(",params=");
        zzau zzau0 = zzaw0.zzb;
        if(zzau0 == null) {
            s = null;
        }
        else {
            s = zzeo0.zza() ? this.b(zzau0.zzc()) : zzau0.toString();
        }
        stringBuilder0.append(s);
        return stringBuilder0.toString();
    }

    public final String d(String s) {
        if(s == null) {
            return null;
        }
        return this.a.zza() ? zzep.g(s, zzhb.zzc, zzhb.zza, zzep.b) : s;
    }

    public final String e(String s) {
        if(s == null) {
            return null;
        }
        return this.a.zza() ? zzep.g(s, zzhc.zzb, zzhc.zza, zzep.c) : s;
    }

    public final String f(String s) {
        if(s == null) {
            return null;
        }
        if(!this.a.zza()) {
            return s;
        }
        return s.startsWith("_exp_") ? e.f("experiment_id(", s, ")") : zzep.g(s, zzhd.zzb, zzhd.zza, zzep.d);
    }

    public static final String g(String s, String[] arr_s, String[] arr_s1, AtomicReference atomicReference0) {
        Preconditions.checkNotNull(arr_s);
        Preconditions.checkNotNull(arr_s1);
        Preconditions.checkNotNull(atomicReference0);
        int v = 0;
        Preconditions.checkArgument(arr_s.length == arr_s1.length);
        while(v < arr_s.length) {
            String s1 = arr_s[v];
            if(s != s1 && !s.equals(s1)) {
                ++v;
            }
            else {
                synchronized(atomicReference0) {
                    String[] arr_s2 = (String[])atomicReference0.get();
                    if(arr_s2 == null) {
                        arr_s2 = new String[arr_s1.length];
                        atomicReference0.set(arr_s2);
                    }
                    String s2 = arr_s2[v];
                    if(s2 == null) {
                        s2 = arr_s1[v] + "(" + arr_s[v] + ")";
                        arr_s2[v] = s2;
                    }
                    return s2;
                }
            }
        }
        return s;
    }
}

