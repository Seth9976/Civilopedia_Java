package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.MediaFormat;
import android.os.Handler;
import java.nio.ByteBuffer;
import java.util.List;

public final class zzos extends zzqi implements zzjb {
    public final Context H0;
    public final zznj I0;
    public final zznq J0;
    public int K0;
    public boolean L0;
    public zzad M0;
    public long N0;
    public boolean O0;
    public boolean P0;
    public boolean Q0;
    public zzjs R0;

    public zzos(Context context0, zzqc zzqc0, zzqk zzqk0, boolean z, Handler handler0, zznk zznk0, zznq zznq0) {
        super(1, zzqc0, zzqk0, false, 44100.0f);
        this.H0 = context0.getApplicationContext();
        this.J0 = zznq0;
        this.I0 = new zznj(handler0, zznk0);
        zznq0.zzn(new Va(this));
    }

    @Override  // com.google.android.gms.internal.ads.zzqi
    public final void A() {
        this.J0.zzf();
    }

    @Override  // com.google.android.gms.internal.ads.zzqi
    public final void B(zzgb zzgb0) {
        if(this.O0 && !zzgb0.zzf()) {
            if(Math.abs(zzgb0.zzd - this.N0) > 500000L) {
                this.N0 = zzgb0.zzd;
            }
            this.O0 = false;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzqi
    public final void C() {
        try {
            this.J0.zzi();
        }
        catch(zznp zznp0) {
            throw this.b(zznp0, zznp0.zzc, zznp0.zzb, 5002);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzqi
    public final boolean D(long v, long v1, zzqd zzqd0, ByteBuffer byteBuffer0, int v2, int v3, int v4, long v5, boolean z, boolean z1, zzad zzad0) {
        byteBuffer0.getClass();
        if(this.M0 != null && (v3 & 2) != 0) {
            zzqd0.getClass();
            zzqd0.zzn(v2, false);
            return true;
        }
        zznq zznq0 = this.J0;
        if(z) {
            if(zzqd0 != null) {
                zzqd0.zzn(v2, false);
            }
            this.A0.zzf += v4;
            zznq0.zzf();
            return true;
        }
        try {
            if(zznq0.zzs(byteBuffer0, v5, v4)) {
                goto label_18;
            }
            return false;
        }
        catch(zznm zznm0) {
            throw this.b(zznm0, zznm0.zzc, zznm0.zzb, 5001);
        }
        catch(zznp zznp0) {
            throw this.b(zznp0, zzad0, zznp0.zzb, 5002);
        }
    label_18:
        if(zzqd0 != null) {
            zzqd0.zzn(v2, false);
        }
        this.A0.zze += v4;
        return true;
    }

    @Override  // com.google.android.gms.internal.ads.zzqi
    public final boolean E(zzad zzad0) {
        return this.J0.zzv(zzad0);
    }

    // 去混淆评级： 低(30)
    public final int Q(zzqf zzqf0, zzad zzad0) {
        return !"OMX.google.raw.decoder".equals(zzqf0.zza) || (zzeg.zza >= 24 || zzeg.zza == 23 && zzeg.zzW(this.H0)) ? zzad0.zzn : -1;
    }

    public static zzfrj R(zzad zzad0, zznq zznq0) {
        String s = zzad0.zzm;
        if(s == null) {
            return zzfrj.zzo();
        }
        if(zznq0.zzv(zzad0)) {
            zzqf zzqf0 = zzqx.zzd();
            if(zzqf0 != null) {
                return zzfrj.zzp(zzqf0);
            }
        }
        List list0 = zzqx.zzf(s, false, false);
        String s1 = zzqx.zze(zzad0);
        if(s1 == null) {
            return zzfrj.zzm(list0);
        }
        List list1 = zzqx.zzf(s1, false, false);
        zzfrg zzfrg0 = zzfrj.zzi();
        zzfrg0.zzf(list0);
        zzfrg0.zzf(list1);
        return zzfrg0.zzg();
    }

    public final void S() {
        boolean z = this.zzM();
        long v = this.J0.zzb(z);
        if(v != 0x8000000000000000L) {
            if(!this.P0) {
                v = Math.max(this.N0, v);
            }
            this.N0 = v;
            this.P0 = false;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzqi
    public final void c() {
        zznj zznj0;
        try {
            zznj0 = this.I0;
            this.Q0 = true;
            this.J0.zze();
        }
        catch(Throwable throwable0) {
            try {
                super.c();
            }
            catch(Throwable throwable1) {
                zznj0.zze(this.A0);
                throw throwable1;
            }
            zznj0.zze(this.A0);
            throw throwable0;
        }
        try {
            super.c();
        }
        catch(Throwable throwable2) {
            zznj0.zze(this.A0);
            throw throwable2;
        }
        zznj0.zze(this.A0);
    }

    @Override  // com.google.android.gms.internal.ads.zzqi
    public final void d(boolean z, boolean z1) {
        super.d(z, z1);
        this.I0.zzf(this.A0);
        this.k.getClass();
        zzmu zzmu0 = this.m;
        zzmu0.getClass();
        this.J0.zzp(zzmu0);
    }

    @Override  // com.google.android.gms.internal.ads.zzqi
    public final void e(long v, boolean z) {
        super.e(v, z);
        this.J0.zze();
        this.N0 = v;
        this.O0 = true;
        this.P0 = true;
    }

    @Override  // com.google.android.gms.internal.ads.zzqi
    public final void f() {
        zznq zznq0;
        try {
            zznq0 = this.J0;
            super.f();
        }
        catch(Throwable throwable0) {
            if(this.Q0) {
                this.Q0 = false;
                zznq0.zzj();
            }
            throw throwable0;
        }
        if(this.Q0) {
            this.Q0 = false;
            zznq0.zzj();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzgk
    public final void g() {
        this.J0.zzh();
    }

    @Override  // com.google.android.gms.internal.ads.zzgk
    public final void h() {
        this.S();
        this.J0.zzg();
    }

    @Override  // com.google.android.gms.internal.ads.zzqi
    public final float j(float f, zzad[] arr_zzad) {
        int v1 = -1;
        for(int v = 0; v < arr_zzad.length; ++v) {
            int v2 = arr_zzad[v].zzA;
            if(v2 != -1) {
                v1 = Math.max(v1, v2);
            }
        }
        return v1 == -1 ? -1.0f : ((float)v1) * f;
    }

    @Override  // com.google.android.gms.internal.ads.zzqi
    public final int k(zzqk zzqk0, zzad zzad0) {
        int v = 0x80;
        if(!zzbo.zzg(zzad0.zzm)) {
            return 0x80;
        }
        int v1 = zzeg.zza < 21 ? 0 : 0x20;
        boolean z = zzad0.zzF == 0;
        zznq zznq0 = this.J0;
        if(z && zznq0.zzv(zzad0) && (zzad0.zzF == 0 || zzqx.zzd() != null)) {
            return v1 | 140;
        }
        if("audio/raw".equals(zzad0.zzm) && !zznq0.zzv(zzad0)) {
            return 0x81;
        }
        if(!zznq0.zzv(zzeg.zzE(2, zzad0.zzz, zzad0.zzA))) {
            return 0x81;
        }
        zzfrj zzfrj0 = zzos.R(zzad0, zznq0);
        if(zzfrj0.isEmpty()) {
            return 0x81;
        }
        if(!z) {
            return 130;
        }
        int v2 = 1;
        zzqf zzqf0 = (zzqf)zzfrj0.get(0);
        boolean z1 = zzqf0.zzd(zzad0);
        if(!z1) {
            for(int v3 = 1; v3 < zzfrj0.size(); ++v3) {
                zzqf zzqf1 = (zzqf)zzfrj0.get(v3);
                if(zzqf1.zzd(zzad0)) {
                    zzqf0 = zzqf1;
                    v2 = 0;
                    z1 = true;
                    break;
                }
            }
        }
        int v4 = !z1 || !zzqf0.zze(zzad0) ? 8 : 16;
        int v5 = zzqf0.zzg ? 0x40 : 0;
        if(1 != v2) {
            v = 0;
        }
        return v1 | ((z1 ? 4 : 3) | v4) | v5 | v;
    }

    @Override  // com.google.android.gms.internal.ads.zzqi
    public final zzgm l(zzqf zzqf0, zzad zzad0, zzad zzad1) {
        zzgm zzgm0 = zzqf0.zzb(zzad0, zzad1);
        int v = this.Q(zzqf0, zzad1) <= this.K0 ? zzgm0.zze : zzgm0.zze | 0x40;
        return v == 0 ? new zzgm(zzqf0.zza, zzad0, zzad1, zzgm0.zzd, 0) : new zzgm(zzqf0.zza, zzad0, zzad1, 0, v);
    }

    @Override  // com.google.android.gms.internal.ads.zzqi
    public final zzgm m(zziz zziz0) {
        zzgm zzgm0 = super.m(zziz0);
        this.I0.zzg(zziz0.zza, zzgm0);
        return zzgm0;
    }

    @Override  // com.google.android.gms.internal.ads.zzqi
    public final zzqb p(zzqf zzqf0, zzad zzad0, float f) {
        zzad[] arr_zzad = this.p;
        arr_zzad.getClass();
        int v = this.Q(zzqf0, zzad0);
        if(arr_zzad.length != 1) {
            for(int v1 = 0; v1 < arr_zzad.length; ++v1) {
                zzad zzad1 = arr_zzad[v1];
                if(zzqf0.zzb(zzad0, zzad1).zzd != 0) {
                    v = Math.max(v, this.Q(zzqf0, zzad1));
                }
            }
        }
        this.K0 = v;
        int v2 = zzeg.zza;
        this.L0 = v2 < 24 && "OMX.SEC.aac.dec".equals(zzqf0.zza) && "samsung".equals(zzeg.zzc) && (zzeg.zzb.startsWith("zeroflte") || zzeg.zzb.startsWith("herolte") || zzeg.zzb.startsWith("heroqlte"));
        int v3 = this.K0;
        MediaFormat mediaFormat0 = new MediaFormat();
        mediaFormat0.setString("mime", zzqf0.zzc);
        mediaFormat0.setInteger("channel-count", zzad0.zzz);
        mediaFormat0.setInteger("sample-rate", zzad0.zzA);
        zzdp.zzb(mediaFormat0, zzad0.zzo);
        zzdp.zza(mediaFormat0, "max-input-size", v3);
        if(v2 >= 23) {
            mediaFormat0.setInteger("priority", 0);
            if(f != -1.0f && (v2 != 23 || !"ZTE B2017G".equals(zzeg.zzd) && !"AXON 7 mini".equals(zzeg.zzd))) {
                mediaFormat0.setFloat("operating-rate", f);
            }
        }
        if(v2 <= 28 && "audio/ac4".equals(zzad0.zzm)) {
            mediaFormat0.setInteger("ac4-is-sync", 1);
        }
        if(v2 >= 24) {
            zzad zzad2 = zzeg.zzE(4, zzad0.zzz, zzad0.zzA);
            if(this.J0.zza(zzad2) == 2) {
                mediaFormat0.setInteger("pcm-encoding", 4);
            }
        }
        if(v2 >= 0x20) {
            mediaFormat0.setInteger("max-output-channel-count", 99);
        }
        this.M0 = !"audio/raw".equals(zzqf0.zzb) || "audio/raw".equals(zzad0.zzm) ? null : zzad0;
        return zzqb.zza(zzqf0, mediaFormat0, zzad0, null);
    }

    @Override  // com.google.android.gms.internal.ads.zzqi
    public final List q(zzqk zzqk0, zzad zzad0) {
        return zzqx.zzg(zzos.R(zzad0, this.J0), zzad0);
    }

    @Override  // com.google.android.gms.internal.ads.zzqi
    public final void r(Exception exception0) {
        zzdn.zza("MediaCodecAudioRenderer", "Audio codec error", exception0);
        this.I0.zza(exception0);
    }

    @Override  // com.google.android.gms.internal.ads.zzqi
    public final void s(String s, long v, long v1) {
        this.I0.zzc(s, v, v1);
    }

    @Override  // com.google.android.gms.internal.ads.zzqi
    public final void t(String s) {
        this.I0.zzd(s);
    }

    @Override  // com.google.android.gms.internal.ads.zzqi
    public final void y(zzad zzad0, MediaFormat mediaFormat0) {
        int v;
        zzad zzad1 = this.M0;
        int[] arr_v = null;
        if(zzad1 != null) {
            zzad0 = zzad1;
        }
        else if(this.M != null) {
            if("audio/raw".equals(zzad0.zzm)) {
                v = zzad0.zzB;
            }
            else if(zzeg.zza < 24 || !mediaFormat0.containsKey("pcm-encoding")) {
                v = mediaFormat0.containsKey("v-bits-per-sample") ? zzeg.zzn(mediaFormat0.getInteger("v-bits-per-sample")) : 2;
            }
            else {
                v = mediaFormat0.getInteger("pcm-encoding");
            }
            zzab zzab0 = new zzab();
            zzab0.zzS("audio/raw");
            zzab0.zzN(v);
            zzab0.zzC(zzad0.zzC);
            zzab0.zzD(zzad0.zzD);
            zzab0.zzw(mediaFormat0.getInteger("channel-count"));
            zzab0.zzT(mediaFormat0.getInteger("sample-rate"));
            zzad zzad2 = zzab0.zzY();
            if(this.L0 && zzad2.zzz == 6) {
                int v1 = zzad0.zzz;
                if(v1 < 6) {
                    arr_v = new int[v1];
                    for(int v2 = 0; v2 < zzad0.zzz; ++v2) {
                        arr_v[v2] = v2;
                    }
                }
            }
            zzad0 = zzad2;
        }
        try {
            this.J0.zzd(zzad0, 0, arr_v);
        }
        catch(zznl zznl0) {
            throw this.b(zznl0, zznl0.zza, false, 5001);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzjt, com.google.android.gms.internal.ads.zzju
    public final String zzK() {
        return "MediaCodecAudioRenderer";
    }

    // 去混淆评级： 低(20)
    @Override  // com.google.android.gms.internal.ads.zzqi
    public final boolean zzM() {
        return super.zzM() && this.J0.zzu();
    }

    // 去混淆评级： 低(20)
    @Override  // com.google.android.gms.internal.ads.zzqi
    public final boolean zzN() {
        return this.J0.zzt() || super.zzN();
    }

    @Override  // com.google.android.gms.internal.ads.zzjb
    public final long zza() {
        if(this.zzbe() == 2) {
            this.S();
        }
        return this.N0;
    }

    @Override  // com.google.android.gms.internal.ads.zzjb
    public final zzbt zzc() {
        return this.J0.zzc();
    }

    @Override  // com.google.android.gms.internal.ads.zzjb
    public final void zzg(zzbt zzbt0) {
        this.J0.zzo(zzbt0);
    }

    @Override  // com.google.android.gms.internal.ads.zzgk
    public final zzjb zzi() {
        return this;
    }

    @Override  // com.google.android.gms.internal.ads.zzgk
    public final void zzp(int v, Object object0) throws zzgt {
        zznq zznq0 = this.J0;
        switch(v) {
            case 2: {
                zznq0.zzr(((float)(((Float)object0))));
                return;
            }
            case 3: {
                zznq0.zzk(((zzi)object0));
                return;
            }
            case 6: {
                zznq0.zzm(((zzj)object0));
                return;
            }
            case 9: {
                zznq0.zzq(((Boolean)object0).booleanValue());
                return;
            }
            case 10: {
                zznq0.zzl(((int)(((Integer)object0))));
                return;
            }
            case 11: {
                this.R0 = (zzjs)object0;
            }
        }
    }
}

