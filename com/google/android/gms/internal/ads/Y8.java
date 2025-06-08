package com.google.android.gms.internal.ads;

import android.app.Notification.Builder;
import android.media.MediaCodec.CryptoInfo.Pattern;
import com.google.android.gms.internal.play_billing.zzcj;
import java.util.Spliterator;
import java.util.Spliterators;

public abstract class y8 {
    public static MediaCodec.CryptoInfo.Pattern d(int v, int v1) {
        return new MediaCodec.CryptoInfo.Pattern(v, v1);
    }

    public static Spliterator g(zzcj zzcj0) {
        return Spliterators.spliterator(zzcj0, 0x510);
    }

    public static void l() {
    }

    public static void n(Notification.Builder notification$Builder0) {
        notification$Builder0.setRemoteInputHistory(null);
    }
}

