package com.google.android.gms.ads.internal.util;

import android.os.Looper;
import android.os.Message;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzfnw;

public final class zzf extends zzfnw {
    public zzf(Looper looper0) {
        super(looper0);
    }

    @Override  // com.google.android.gms.internal.ads.zzfnw
    public final void a(Message message0) {
        try {
            super.a(message0);
        }
        catch(Throwable throwable0) {
            zzs.zzH(zzt.zzo().zzc(), throwable0);
            throw throwable0;
        }
    }

    @Override  // android.os.Handler
    public final void handleMessage(Message message0) {
        try {
            super.handleMessage(message0);
        }
        catch(Exception exception0) {
            zzt.zzo().zzt(exception0, "AdMobHandler.handleMessage");
        }
    }
}

