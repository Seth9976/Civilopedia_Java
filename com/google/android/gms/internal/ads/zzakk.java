package com.google.android.gms.internal.ads;

import L2.b;
import java.io.EOFException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class zzakk implements zzakl {
    public final b a;
    public static final Logger b;

    static {
        zzakk.b = Logger.getLogger(zzakk.class.getName());
    }

    public zzakk() {
        this.a = new b(3);
    }

    public abstract zzako zza(String arg1, byte[] arg2, String arg3);

    @Override  // com.google.android.gms.internal.ads.zzakl
    public final zzako zzb(zzgqg zzgqg0, zzakp zzakp0) throws IOException {
        long v3;
        String s;
        long v = zzgqg0.zzb();
        b b0 = this.a;
        ((ByteBuffer)b0.get()).rewind().limit(8);
        int v1;
        while((v1 = zzgqg0.zza(((ByteBuffer)b0.get()))) != 8) {
            if(v1 < 0) {
                zzgqg0.zze(v);
                throw new EOFException();
            }
        }
        ((ByteBuffer)b0.get()).rewind();
        long v2 = zzakn.zze(((ByteBuffer)b0.get()));
        byte[] arr_b = null;
        if(v2 < 8L && v2 > 1L) {
            zzakk.b.logp(Level.SEVERE, "com.coremedia.iso.AbstractBoxParser", "parseBox", "Plausibility check failed: size < 8 (size = " + v2 + "). Stop parsing!");
            return null;
        }
        ByteBuffer byteBuffer0 = (ByteBuffer)b0.get();
        byte[] arr_b1 = new byte[4];
        byteBuffer0.get(arr_b1);
        try {
            s = new String(arr_b1, "ISO-8859-1");
        }
        catch(UnsupportedEncodingException unsupportedEncodingException0) {
            throw new RuntimeException(unsupportedEncodingException0);
        }
        if(v2 == 1L) {
            ((ByteBuffer)b0.get()).limit(16);
            zzgqg0.zza(((ByteBuffer)b0.get()));
            ((ByteBuffer)b0.get()).position(8);
            v3 = zzakn.zzf(((ByteBuffer)b0.get())) - 16L;
        }
        else {
            v3 = v2 == 0L ? zzgqg0.zzc() - zzgqg0.zzb() : v2 - 8L;
        }
        if("uuid".equals(s)) {
            ((ByteBuffer)b0.get()).limit(((ByteBuffer)b0.get()).limit() + 16);
            zzgqg0.zza(((ByteBuffer)b0.get()));
            arr_b = new byte[16];
            for(int v4 = ((ByteBuffer)b0.get()).position() - 16; v4 < ((ByteBuffer)b0.get()).position(); ++v4) {
                int v5 = ((ByteBuffer)b0.get()).position();
                arr_b[v4 - (v5 - 16)] = ((ByteBuffer)b0.get()).get(v4);
            }
            v3 += -16L;
        }
        zzako zzako0 = this.zza(s, arr_b, (zzakp0 instanceof zzako ? ((zzako)zzakp0).zza() : ""));
        zzako0.zzc(zzakp0);
        ((ByteBuffer)b0.get()).rewind();
        zzako0.zzb(zzgqg0, ((ByteBuffer)b0.get()), v3, this);
        return zzako0;
    }
}

