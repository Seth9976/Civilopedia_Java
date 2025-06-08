package com.google.android.gms.internal.ads;

import android.os.ConditionVariable;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public final class zzanx {
    public final zzapc a;
    public volatile Boolean b;
    public static final ConditionVariable c;
    public static volatile zzfmw d;
    public static volatile Random e;

    static {
        zzanx.c = new ConditionVariable();
        zzanx.d = null;
        zzanx.e = null;
    }

    public zzanx(zzapc zzapc0) {
        this.a = zzapc0;
        zzapc0.zzk().execute(new A0(this, 1));
    }

    public final void zzc(int v, int v1, long v2, String s, Exception exception0) {
        try {
            zzanx.c.block();
            if(this.b.booleanValue() && zzanx.d != null) {
                zzaku zzaku0 = zzaky.zza();
                zzaku0.zza("com.spears.civilopedia");
                zzaku0.zze(v2);
                if(s != null) {
                    zzaku0.zzb(s);
                }
                if(exception0 != null) {
                    StringWriter stringWriter0 = new StringWriter();
                    exception0.printStackTrace(new PrintWriter(stringWriter0));
                    zzaku0.zzf(stringWriter0.toString());
                    zzaku0.zzd(exception0.getClass().getName());
                }
                zzfmv zzfmv0 = zzanx.d.zza(((zzaky)zzaku0.zzal()).zzaw());
                zzfmv0.zza(v);
                if(v1 != -1) {
                    zzfmv0.zzb(v1);
                }
                zzfmv0.zzc();
            }
        }
        catch(Exception unused_ex) {
        }
    }

    public static final int zzd() {
        try {
            return ThreadLocalRandom.current().nextInt();
        }
        catch(RuntimeException unused_ex) {
            if(zzanx.e == null) {
                Class class0 = zzanx.class;
                synchronized(class0) {
                    if(zzanx.e == null) {
                        zzanx.e = new Random();
                    }
                }
            }
            return zzanx.e.nextInt();
        }
    }
}

