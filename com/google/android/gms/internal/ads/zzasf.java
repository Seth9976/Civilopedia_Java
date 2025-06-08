package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

public final class zzasf {
    public static final int[] a;
    public static final int[] b;
    public static final int[] c;
    public static final int zza;

    static {
        zzasf.a = new int[]{1, 2, 3, 6};
        zzasf.b = new int[]{48000, 44100, 32000};
        zzasf.c = new int[]{2, 1, 2, 3, 3, 4, 4, 5};
    }

    public static int zza(ByteBuffer byteBuffer0) {
        return ((byteBuffer0.get(byteBuffer0.position() + 4) & 0xC0) >> 6 == 3 ? 6 : zzasf.a[(byteBuffer0.get(byteBuffer0.position() + 4) & 0x30) >> 4]) * 0x100;
    }

    public static zzart zzb(zzazh zzazh0, String s, String s1, zzats zzats0) {
        int v = zzasf.b[(zzazh0.zzg() & 0xC0) >> 6];
        int v1 = zzazh0.zzg();
        int v2 = zzasf.c[(v1 & 56) >> 3];
        if((v1 & 4) != 0) {
            ++v2;
        }
        return zzart.zzg(s, "audio/ac3", null, -1, -1, v2, v, null, zzats0, 0, s1);
    }

    public static zzart zzc(zzazh zzazh0, String s, String s1, zzats zzats0) {
        zzazh0.zzw(2);
        int v = zzasf.b[(zzazh0.zzg() & 0xC0) >> 6];
        int v1 = zzazh0.zzg();
        int v2 = zzasf.c[(v1 & 14) >> 1];
        if((v1 & 1) != 0) {
            ++v2;
        }
        return zzart.zzg(s, "audio/eac3", null, -1, -1, v2, v, null, zzats0, 0, s1);
    }
}

