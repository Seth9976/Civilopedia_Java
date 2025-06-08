package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.interfaces.ECPublicKey;

public final class zzghm implements zzfwn {
    public final zzghp a;
    public final String b;
    public final byte[] c;
    public final zzghk d;
    public final int e;
    public static final byte[] f;

    static {
        zzghm.f = new byte[0];
    }

    public zzghm(ECPublicKey eCPublicKey0, byte[] arr_b, String s, int v, zzghk zzghk0) throws GeneralSecurityException {
        zzghq.a(eCPublicKey0.getW(), eCPublicKey0.getParams().getCurve());
        this.a = new zzghp(eCPublicKey0);
        this.c = arr_b;
        this.b = s;
        this.e = v;
        this.d = zzghk0;
    }

    @Override  // com.google.android.gms.internal.ads.zzfwn
    public final byte[] zza(byte[] arr_b, byte[] arr_b1) throws GeneralSecurityException {
        int v = this.d.zza();
        zzgho zzgho0 = this.a.zza(this.b, this.c, arr_b1, v, this.e);
        byte[] arr_b2 = zzgho0.zzb();
        byte[] arr_b3 = this.d.zzb(arr_b2).zza(arr_b, zzghm.f);
        byte[] arr_b4 = zzgho0.zza();
        return ByteBuffer.allocate(arr_b4.length + arr_b3.length).put(arr_b4).put(arr_b3).array();
    }
}

