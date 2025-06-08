package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzay;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public abstract class y0 {
    public static boolean a = false;
    public static MessageDigest b;
    public static final Object c;
    public static final Object d;
    public static final CountDownLatch e;

    static {
        y0.c = new Object();
        y0.d = new Object();
        y0.e = new CountDownLatch(1);
    }

    public static String a(zzaly zzaly0, String s) {
        Vector vector0 = null;
        byte[] arr_b = zzaly0.zzaw();
        if(!((Boolean)zzay.zzc().zzb(zzbhz.zzcu)).booleanValue()) {
            if(h.m == null) {
                throw new GeneralSecurityException();
            }
            byte[] arr_b1 = h.m.zza(arr_b, (s == null ? new byte[0] : s.getBytes()));
            zzamk zzamk0 = zzaml.zza();
            zzamk0.zza(zzgji.zzv(arr_b1));
            zzamk0.zzc(3);
            return zzamn.zza(((zzaml)zzamk0.zzal()).zzaw(), true);
        }
        if(arr_b != null && arr_b.length > 0) {
            int v = (arr_b.length + 0xFE) / 0xFF;
            Vector vector1 = new Vector();
            int v1 = 0;
            while(v1 < v) {
                try {
                    vector1.add(Arrays.copyOfRange(arr_b, v1 * 0xFF, (arr_b.length - v1 * 0xFF <= 0xFF ? arr_b.length : v1 * 0xFF + 0xFF)));
                    ++v1;
                }
                catch(IndexOutOfBoundsException unused_ex) {
                    goto label_20;
                }
            }
            vector0 = vector1;
        }
    label_20:
        if(vector0 != null && vector0.size() != 0) {
            zzamk zzamk1 = zzaml.zza();
            int v2 = vector0.size();
            for(int v3 = 0; v3 < v2; ++v3) {
                zzamk1.zza(zzgji.zzv(y0.d(((byte[])vector0.get(v3)), s, false)));
            }
            zzamk1.zzb(zzgji.zzv(y0.c(arr_b)));
            return zzamn.zza(((zzaml)zzamk1.zzal()).zzaw(), true);
        }
        zzali zzali0 = zzaly.zza();
        zzali0.zzC(0x1000L);
        return zzamn.zza(y0.d(((zzaly)zzali0.zzal()).zzaw(), s, true), true);
    }

    public static void b() {
        synchronized(y0.d) {
            if(!y0.a) {
                y0.a = true;
                new Thread(new x0(0)).start();
            }
        }
    }

    public static byte[] c(byte[] arr_b) {
        synchronized(y0.c) {
            y0.b();
            MessageDigest messageDigest0 = null;
            try {
                if(y0.e.await(2L, TimeUnit.SECONDS)) {
                    MessageDigest messageDigest1 = y0.b;
                    if(messageDigest1 != null) {
                        messageDigest0 = messageDigest1;
                    }
                }
            }
            catch(InterruptedException unused_ex) {
            }
            if(messageDigest0 != null) {
                messageDigest0.reset();
                messageDigest0.update(arr_b);
                return y0.b.digest();
            }
        }
        throw new NoSuchAlgorithmException("Cannot compute hash");
    }

    public static byte[] d(byte[] arr_b, String s, boolean z) {
        byte[] arr_b2;
        if(arr_b.length > (z ? 0xEF : 0xFF)) {
            zzali zzali0 = zzaly.zza();
            zzali0.zzC(0x1000L);
            arr_b = ((zzaly)zzali0.zzal()).zzaw();
        }
        if(arr_b.length < (z ? 0xEF : 0xFF)) {
            byte[] arr_b1 = new byte[(z ? 0xEF : 0xFF) - arr_b.length];
            new SecureRandom().nextBytes(arr_b1);
            arr_b2 = ByteBuffer.allocate((z ? 0xEF : 0xFF) + 1).put(((byte)arr_b.length)).put(arr_b).put(arr_b1).array();
        }
        else {
            arr_b2 = ByteBuffer.allocate((z ? 0xEF : 0xFF) + 1).put(((byte)arr_b.length)).put(arr_b).array();
        }
        if(z) {
            byte[] arr_b3 = y0.c(arr_b2);
            arr_b2 = ByteBuffer.allocate(0x100).put(arr_b3).put(arr_b2).array();
        }
        byte[] arr_b4 = new byte[0x100];
        z0[] arr_z0 = new zzanr().G2;
        for(int v = 0; v < 12; ++v) {
            arr_z0[v].a(arr_b2, arr_b4);
        }
        if(s != null && s.length() > 0) {
            if(s.length() > 0x20) {
                s = s.substring(0, 0x20);
            }
            new zzgip(s.getBytes("UTF-8")).zza(arr_b4);
        }
        return arr_b4;
    }
}

