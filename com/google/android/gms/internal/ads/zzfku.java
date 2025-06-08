package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Map;
import java.util.concurrent.Executor;

public final class zzfku {
    public final Context a;
    public final Executor b;
    public final Task c;
    public final boolean d;
    public static volatile int e = 1;
    public static final int zza;

    public zzfku(Context context0, Executor executor0, Task task0, boolean z) {
        this.a = context0;
        this.b = executor0;
        this.c = task0;
        this.d = z;
    }

    public final Task a(int v, long v1, Exception exception0, String s, String s1) {
        if(!this.d) {
            return this.c.continueWith(this.b, zzfks.zza);
        }
        zzaku zzaku0 = zzaky.zza();
        zzaku0.zza("com.spears.civilopedia");
        zzaku0.zze(v1);
        zzaku0.zzg(zzfku.e);
        if(exception0 != null) {
            zzaku0.zzf(zzfpk.zza(exception0));
            zzaku0.zzd(exception0.getClass().getName());
        }
        if(s1 != null) {
            zzaku0.zzb(s1);
        }
        if(s != null) {
            zzaku0.zzc(s);
        }
        zzfkt zzfkt0 = new zzfkt(zzaku0, v);
        return this.c.continueWith(this.b, zzfkt0);
    }

    public static zzfku zza(Context context0, Executor executor0, boolean z) {
        TaskCompletionSource taskCompletionSource0 = new TaskCompletionSource();
        if(z) {
            executor0.execute(new zzfkq(context0, taskCompletionSource0));
            return new zzfku(context0, executor0, taskCompletionSource0.getTask(), true);
        }
        executor0.execute(new zzfkr(taskCompletionSource0));
        return new zzfku(context0, executor0, taskCompletionSource0.getTask(), false);
    }

    public final Task zzb(int v, String s) {
        return this.a(v, 0L, null, null, s);
    }

    public final Task zzc(int v, long v1, Exception exception0) {
        return this.a(v, v1, exception0, null, null);
    }

    public final Task zzd(int v, long v1) {
        return this.a(v, v1, null, null, null);
    }

    public final Task zze(int v, long v1, String s) {
        return this.a(v, v1, null, null, s);
    }

    public final Task zzf(int v, long v1, String s, Map map0) {
        return this.a(v, v1, null, s, null);
    }
}

