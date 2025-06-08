package com.google.android.gms.internal.ads;

import android.util.Base64;
import com.google.android.gms.ads.identifier.AdvertisingIdClient.Info;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.nio.ByteBuffer;
import java.util.UUID;
import java.util.concurrent.Callable;

public final class zzflh implements Callable {
    public final zzfln zza;

    public zzflh(zzfln zzfln0) {
        this.zza = zzfln0;
    }

    @Override
    public final Object call() {
        this.zza.getClass();
        zzali zzali0 = zzaly.zza();
        Info advertisingIdClient$Info0 = AdvertisingIdClient.getAdvertisingIdInfo(this.zza.a);
        String s = advertisingIdClient$Info0.getId();
        if(s != null && s.matches("^[a-fA-F0-9]{8}-([a-fA-F0-9]{4}-){3}[a-fA-F0-9]{12}$")) {
            UUID uUID0 = UUID.fromString(s);
            byte[] arr_b = new byte[16];
            ByteBuffer byteBuffer0 = ByteBuffer.wrap(arr_b);
            byteBuffer0.putLong(uUID0.getMostSignificantBits());
            byteBuffer0.putLong(uUID0.getLeastSignificantBits());
            s = Base64.encodeToString(arr_b, 11);
        }
        if(s != null) {
            zzali0.zzr(s);
            zzali0.zzq(advertisingIdClient$Info0.isLimitAdTrackingEnabled());
            zzali0.zzaa(6);
        }
        return (zzaly)zzali0.zzal();
    }
}

