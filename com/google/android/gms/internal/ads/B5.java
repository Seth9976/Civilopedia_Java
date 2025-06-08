package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Message;
import java.util.ArrayList;

public final class b5 implements zzdg {
    public final Handler a;
    public static final ArrayList b;

    static {
        b5.b = new ArrayList(50);
    }

    public b5(Handler handler0) {
        this.a = handler0;
    }

    public static Y4 a() {
        synchronized(b5.b) {
            return b5.b.isEmpty() ? new Y4() : ((Y4)b5.b.remove(b5.b.size() - 1));  // 初始化器: Ljava/lang/Object;-><init>()V
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzdg
    public final zzdf zza(int v) {
        zzdf zzdf0 = b5.a();
        zzdf0.a = this.a.obtainMessage(v);
        return zzdf0;
    }

    @Override  // com.google.android.gms.internal.ads.zzdg
    public final zzdf zzb(int v, Object object0) {
        zzdf zzdf0 = b5.a();
        zzdf0.a = this.a.obtainMessage(v, object0);
        return zzdf0;
    }

    @Override  // com.google.android.gms.internal.ads.zzdg
    public final zzdf zzc(int v, int v1, int v2) {
        zzdf zzdf0 = b5.a();
        zzdf0.a = this.a.obtainMessage(1, v1, v2);
        return zzdf0;
    }

    @Override  // com.google.android.gms.internal.ads.zzdg
    public final void zzd(Object object0) {
        this.a.removeCallbacksAndMessages(null);
    }

    @Override  // com.google.android.gms.internal.ads.zzdg
    public final void zze(int v) {
        this.a.removeMessages(2);
    }

    @Override  // com.google.android.gms.internal.ads.zzdg
    public final boolean zzf(int v) {
        return this.a.hasMessages(0);
    }

    @Override  // com.google.android.gms.internal.ads.zzdg
    public final boolean zzg(Runnable runnable0) {
        return this.a.post(runnable0);
    }

    @Override  // com.google.android.gms.internal.ads.zzdg
    public final boolean zzh(int v) {
        return this.a.sendEmptyMessage(v);
    }

    @Override  // com.google.android.gms.internal.ads.zzdg
    public final boolean zzi(int v, long v1) {
        return this.a.sendEmptyMessageAtTime(2, v1);
    }

    @Override  // com.google.android.gms.internal.ads.zzdg
    public final boolean zzj(zzdf zzdf0) {
        Message message0 = ((Y4)zzdf0).a;
        message0.getClass();
        boolean z = this.a.sendMessageAtFrontOfQueue(message0);
        ((Y4)zzdf0).a();
        return z;
    }
}

