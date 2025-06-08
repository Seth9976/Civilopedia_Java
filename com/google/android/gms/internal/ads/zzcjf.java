package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Iterator;

public final class zzcjf {
    public long a;

    public final long zza(ByteBuffer byteBuffer0) {
        zzakr zzakr0;
        long v = this.a;
        if(v > 0L) {
            return v;
        }
        try {
            zzakq zzakq0 = null;
            ByteBuffer byteBuffer1 = byteBuffer0.duplicate();
            byteBuffer1.flip();
            Iterator iterator0 = new zzakm(new W2(byteBuffer1), X2.c).zze().iterator();
            while(true) {
                zzakr0 = null;
                if(!iterator0.hasNext()) {
                    break;
                }
                Object object0 = iterator0.next();
                zzako zzako0 = (zzako)object0;
                if(zzako0 instanceof zzakq) {
                    zzakq0 = (zzakq)zzako0;
                    break;
                }
            }
            for(Object object1: zzakq0.zze()) {
                zzako zzako1 = (zzako)object1;
                if(zzako1 instanceof zzakr) {
                    zzakr0 = (zzakr)zzako1;
                    break;
                }
                if(false) {
                    break;
                }
            }
            long v1 = zzakr0.zzd() * 1000L / zzakr0.zze();
            this.a = v1;
            return v1;
        }
        catch(RuntimeException | IOException unused_ex) {
            return 0L;
        }
    }
}

