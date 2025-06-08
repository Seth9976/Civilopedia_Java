package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.Date;

public final class zzakr extends zzgqd {
    public Date s;
    public Date t;
    public long u;
    public long v;
    public double w;
    public float x;
    public zzgqn y;
    public long z;

    public zzakr() {
        super("mvhd");
        this.w = 1.0;
        this.x = 1.0f;
        this.y = zzgqn.zza;
    }

    @Override
    public final String toString() {
        return "MovieHeaderBox[creationTime=" + this.s + ";modificationTime=" + this.t + ";timescale=" + this.u + ";duration=" + this.v + ";rate=" + this.w + ";volume=" + this.x + ";matrix=" + this.y + ";nextTrackId=" + this.z + "]";
    }

    public final long zzd() {
        return this.v;
    }

    public final long zze() {
        return this.u;
    }

    @Override  // com.google.android.gms.internal.ads.zzgqb
    public final void zzf(ByteBuffer byteBuffer0) {
        this.r = zzakn.zzc(byteBuffer0.get());
        zzakn.zzd(byteBuffer0);
        byteBuffer0.get();
        if(this.zzh() == 1) {
            this.s = zzgqi.zza(zzakn.zzf(byteBuffer0));
            this.t = zzgqi.zza(zzakn.zzf(byteBuffer0));
            this.u = zzakn.zze(byteBuffer0);
            this.v = zzakn.zzf(byteBuffer0);
        }
        else {
            this.s = zzgqi.zza(zzakn.zze(byteBuffer0));
            this.t = zzgqi.zza(zzakn.zze(byteBuffer0));
            this.u = zzakn.zze(byteBuffer0);
            this.v = zzakn.zze(byteBuffer0);
        }
        this.w = zzakn.zzb(byteBuffer0);
        byte[] arr_b = new byte[2];
        byteBuffer0.get(arr_b);
        this.x = ((float)(((short)(arr_b[1] & 0xFF | ((short)(arr_b[0] << 8 & 0xFF00)))))) / 256.0f;
        zzakn.zzd(byteBuffer0);
        zzakn.zze(byteBuffer0);
        zzakn.zze(byteBuffer0);
        double f = zzakn.zzb(byteBuffer0);
        double f1 = zzakn.zzb(byteBuffer0);
        double f2 = zzakn.zza(byteBuffer0);
        double f3 = zzakn.zzb(byteBuffer0);
        double f4 = zzakn.zzb(byteBuffer0);
        double f5 = zzakn.zza(byteBuffer0);
        double f6 = zzakn.zzb(byteBuffer0);
        double f7 = zzakn.zzb(byteBuffer0);
        this.y = new zzgqn(f, f1, f3, f4, f2, f5, zzakn.zza(byteBuffer0), f6, f7);
        byteBuffer0.getInt();
        byteBuffer0.getInt();
        byteBuffer0.getInt();
        byteBuffer0.getInt();
        byteBuffer0.getInt();
        byteBuffer0.getInt();
        this.z = zzakn.zze(byteBuffer0);
    }
}

