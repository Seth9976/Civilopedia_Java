package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import i1.B;
import i1.l;
import i1.m;

public final class zzeu extends B {
    public char c;
    public long d;
    public String e;
    public final zzes f;
    public final zzes g;
    public final zzes h;
    public final zzes i;
    public final zzes j;
    public final zzes k;
    public final zzes l;
    public final zzes m;
    public final zzes n;

    public zzeu(zzge zzge0) {
        super(zzge0);
        this.c = '\u0000';
        this.d = -1L;
        this.f = new zzes(this, 6, false, false);
        this.g = new zzes(this, 6, true, false);
        this.h = new zzes(this, 6, false, true);
        this.i = new zzes(this, 5, false, false);
        this.j = new zzes(this, 5, true, false);
        this.k = new zzes(this, 5, false, true);
        this.l = new zzes(this, 4, false, false);
        this.m = new zzes(this, 3, false, false);
        this.n = new zzes(this, 2, false, false);
    }

    @Override  // i1.B
    public final boolean b() {
        return false;
    }

    public static m d(String s) {
        return s == null ? null : new m(s);
    }

    public static String e(boolean z, String s, Object object0, Object object1, Object object2) {
        String s1 = "";
        if(s == null) {
            s = "";
        }
        String s2 = zzeu.f(object0, z);
        String s3 = zzeu.f(object1, z);
        String s4 = zzeu.f(object2, z);
        StringBuilder stringBuilder0 = new StringBuilder();
        if(!TextUtils.isEmpty(s)) {
            stringBuilder0.append(s);
            s1 = ": ";
        }
        String s5 = ", ";
        if(!TextUtils.isEmpty(s2)) {
            stringBuilder0.append(s1);
            stringBuilder0.append(s2);
            s1 = ", ";
        }
        if(TextUtils.isEmpty(s3)) {
            s5 = s1;
        }
        else {
            stringBuilder0.append(s1);
            stringBuilder0.append(s3);
        }
        if(!TextUtils.isEmpty(s4)) {
            stringBuilder0.append(s5);
            stringBuilder0.append(s4);
        }
        return stringBuilder0.toString();
    }

    public static String f(Object object0, boolean z) {
        String s = "";
        if(object0 == null) {
            return "";
        }
        if(object0 instanceof Integer) {
            object0 = (long)(((int)(((Integer)object0))));
        }
        if(object0 instanceof Long) {
            if(!z) {
                return object0.toString();
            }
            if(Math.abs(((long)(((Long)object0)))) < 100L) {
                return object0.toString();
            }
            if(object0.toString().charAt(0) == 45) {
                s = "-";
            }
            String s1 = String.valueOf(Math.abs(((long)(((Long)object0)))));
            return s + Math.round(Math.pow(10.0, s1.length() - 1)) + "..." + s + Math.round(Math.pow(10.0, s1.length()) - 1.0);
        }
        if(object0 instanceof Boolean) {
            return object0.toString();
        }
        if(object0 instanceof Throwable) {
            StringBuilder stringBuilder0 = new StringBuilder((z ? ((Throwable)object0).getClass().getName() : ((Throwable)object0).toString()));
            String s2 = zzge.class.getCanonicalName();
            if(TextUtils.isEmpty(s2)) {
                s2 = "";
            }
            else {
                int v = s2.lastIndexOf(46);
                if(v != -1) {
                    s2 = s2.substring(0, v);
                }
            }
            StackTraceElement[] arr_stackTraceElement = ((Throwable)object0).getStackTrace();
            for(int v1 = 0; v1 < arr_stackTraceElement.length; ++v1) {
                StackTraceElement stackTraceElement0 = arr_stackTraceElement[v1];
                if(!stackTraceElement0.isNativeMethod()) {
                    String s3 = stackTraceElement0.getClassName();
                    if(s3 != null) {
                        if(TextUtils.isEmpty(s3)) {
                            s3 = "";
                        }
                        else {
                            int v2 = s3.lastIndexOf(46);
                            if(v2 != -1) {
                                s3 = s3.substring(0, v2);
                            }
                        }
                        if(s3.equals(s2)) {
                            stringBuilder0.append(": ");
                            stringBuilder0.append(stackTraceElement0);
                            return stringBuilder0.toString();
                        }
                    }
                }
            }
            return stringBuilder0.toString();
        }
        if(object0 instanceof m) {
            return ((m)object0).a;
        }
        return z ? "-" : object0.toString();
    }

    public final void g(int v, boolean z, boolean z1, String s, Object object0, Object object1, Object object2) {
        if(!z && Log.isLoggable(this.zzq(), v)) {
            String s1 = zzeu.e(false, s, object0, object1, object2);
            Log.println(v, this.zzq(), s1);
        }
        if(!z1 && v >= 5) {
            Preconditions.checkNotNull(s);
            zzgb zzgb0 = this.a.j;
            if(zzgb0 == null) {
                Log.println(6, this.zzq(), "Scheduler not set. Not logging error/warn");
                return;
            }
            if(!zzgb0.b) {
                Log.println(6, this.zzq(), "Scheduler not initialized. Not logging error/warn");
                return;
            }
            zzgb0.zzp(new l(this, (v < 9 ? v : 8), s, object0, object1, object2));
        }
    }

    public final zzes zzc() {
        return this.m;
    }

    public final zzes zzd() {
        return this.f;
    }

    public final zzes zze() {
        return this.h;
    }

    public final zzes zzh() {
        return this.g;
    }

    public final zzes zzi() {
        return this.l;
    }

    public final zzes zzj() {
        return this.n;
    }

    public final zzes zzk() {
        return this.i;
    }

    public final zzes zzl() {
        return this.k;
    }

    public final zzes zzm() {
        return this.j;
    }

    public final String zzq() {
        synchronized(this) {
            if(this.e == null) {
                if(this.a.zzy() == null) {
                    this.a.zzf().a.zzaw();
                    this.e = "FA";
                }
                else {
                    this.e = this.a.zzy();
                }
            }
            Preconditions.checkNotNull(this.e);
            return this.e;
        }
    }
}

