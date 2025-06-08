package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import java.nio.ByteBuffer;

@TargetApi(16)
public final class zzatf extends zzavr implements zzazd {
    public final zzasp Q;
    public final zzatb R;
    public boolean S;
    public int T;
    public int U;
    public long V;
    public boolean W;

    public zzatf(zzavt zzavt0, zzatt zzatt0, boolean z, Handler handler0, zzasq zzasq0) {
        super(1, zzavt0, null, true);
        Q0 q00 = new Q0(this);
        this.R = new zzatb(null, new zzasi[0], q00);
        this.Q = new zzasp(handler0, zzasq0);
    }

    @Override  // com.google.android.gms.internal.ads.zzavr
    public final void b() {
        zzasp zzasp0;
        try {
            zzasp0 = this.Q;
            this.R.zzj();
        }
        catch(Throwable throwable0) {
            try {
                super.b();
            }
            catch(Throwable throwable1) {
                zzasp0.zze(this.O);
                throw throwable1;
            }
            zzasp0.zze(this.O);
            throw throwable0;
        }
        try {
            super.b();
        }
        catch(Throwable throwable2) {
            zzasp0.zze(this.O);
            throw throwable2;
        }
        zzasp0.zze(this.O);
    }

    @Override  // com.google.android.gms.internal.ads.zzavr
    public final void c(boolean z) {
        super.c(z);
        this.Q.zzf(this.O);
    }

    @Override  // com.google.android.gms.internal.ads.zzavr
    public final void d(long v, boolean z) {
        super.d(v, z);
        this.R.zzk();
        this.V = v;
        this.W = true;
    }

    @Override  // com.google.android.gms.internal.ads.zzard
    public final void e() {
        this.R.zzh();
    }

    @Override  // com.google.android.gms.internal.ads.zzard
    public final void f() {
        this.R.zzg();
    }

    @Override  // com.google.android.gms.internal.ads.zzavr
    public final int h(zzart zzart0) {
        String s = zzart0.zzf;
        if(!zzaze.zza(s)) {
            return 0;
        }
        int v = zzazo.zza;
        int v1 = v < 21 ? 0 : 16;
        zzavp zzavp0 = zzawb.zzc(s, false);
        if(zzavp0 == null) {
            return 1;
        }
        if(v >= 21) {
            if(zzart0.zzs != -1 && !zzavp0.zzd(zzart0.zzs)) {
                return v1 | 6;
            }
            return zzart0.zzr != -1 && !zzavp0.zzc(zzart0.zzr) ? v1 | 6 : v1 | 7;
        }
        return v1 | 7;
    }

    @Override  // com.google.android.gms.internal.ads.zzavr
    public final void j(zzavp zzavp0, MediaCodec mediaCodec0, zzart zzart0) {
        this.S = zzazo.zza < 24 && "OMX.SEC.aac.dec".equals(zzavp0.zza) && "samsung".equals(zzazo.zzc) && (zzazo.zzb.startsWith("zeroflte") || zzazo.zzb.startsWith("herolte") || zzazo.zzb.startsWith("heroqlte"));
        mediaCodec0.configure(zzart0.zzb(), null, null, 0);
    }

    @Override  // com.google.android.gms.internal.ads.zzavr
    public final void k(String s, long v, long v1) {
        this.Q.zzd(s, v, v1);
    }

    @Override  // com.google.android.gms.internal.ads.zzavr
    public final void l(zzart zzart0) {
        super.l(zzart0);
        this.Q.zzg(zzart0);
        this.T = "audio/raw".equals(zzart0.zzf) ? zzart0.zzt : 2;
        this.U = zzart0.zzr;
    }

    @Override  // com.google.android.gms.internal.ads.zzavr
    public final void m(MediaCodec mediaCodec0, MediaFormat mediaFormat0) {
        int v4;
        int[] arr_v1;
        int v = mediaFormat0.getInteger("channel-count");
        int v1 = mediaFormat0.getInteger("sample-rate");
        if(!this.S || v != 6) {
            v4 = v;
            arr_v1 = null;
        }
        else {
            int v2 = this.U;
            if(v2 < 6) {
                int[] arr_v = new int[v2];
                for(int v3 = 0; v3 < this.U; ++v3) {
                    arr_v[v3] = v3;
                }
                arr_v1 = arr_v;
            }
            else {
                arr_v1 = null;
            }
            v4 = 6;
        }
        try {
            this.R.zze("audio/raw", v4, v1, this.T, 0, arr_v1);
        }
        catch(zzasv zzasv0) {
            throw zzarf.zza(zzasv0, this.c);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzavr
    public final void n() {
        try {
            this.R.zzi();
        }
        catch(zzata zzata0) {
            throw zzarf.zza(zzata0, this.c);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzavr
    public final boolean o(long v, long v1, MediaCodec mediaCodec0, ByteBuffer byteBuffer0, int v2, long v3, boolean z) {
        zzatb zzatb0 = this.R;
        if(z) {
            mediaCodec0.releaseOutputBuffer(v2, false);
            ++this.O.zze;
            zzatb0.zzf();
            return true;
        }
        try {
            if(zzatb0.zzm(byteBuffer0, v3)) {
                mediaCodec0.releaseOutputBuffer(v2, false);
                ++this.O.zzd;
                return true;
            }
            return false;
        }
        catch(zzasw | zzata zzasw0) {
            throw zzarf.zza(zzasw0, this.c);
        }
    }

    // 去混淆评级： 低(20)
    @Override  // com.google.android.gms.internal.ads.zzavr
    public final boolean zzE() {
        return super.zzE() && this.R.zzo();
    }

    // 去混淆评级： 低(20)
    @Override  // com.google.android.gms.internal.ads.zzavr
    public final boolean zzF() {
        return this.R.zzn() || super.zzF();
    }

    @Override  // com.google.android.gms.internal.ads.zzazd
    public final long zzI() {
        boolean z = this.zzE();
        long v = this.R.zza(z);
        if(v != 0x8000000000000000L) {
            if(!this.W) {
                v = Math.max(this.V, v);
            }
            this.V = v;
            this.W = false;
        }
        return this.V;
    }

    @Override  // com.google.android.gms.internal.ads.zzazd
    public final zzarx zzJ() {
        return this.R.zzc();
    }

    @Override  // com.google.android.gms.internal.ads.zzazd
    public final zzarx zzK(zzarx zzarx0) {
        return this.R.zzd(zzarx0);
    }

    @Override  // com.google.android.gms.internal.ads.zzard
    public final zzazd zzi() {
        return this;
    }

    @Override  // com.google.android.gms.internal.ads.zzard
    public final void zzl(int v, Object object0) throws zzarf {
        if(v != 2) {
            return;
        }
        this.R.zzl(((float)(((Float)object0))));
    }
}

