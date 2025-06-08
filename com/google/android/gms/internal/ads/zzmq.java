package com.google.android.gms.internal.ads;

import P0.f;
import android.content.Context;
import android.media.DeniedByServerException;
import android.media.MediaCodec.CryptoException;
import android.media.MediaDrm.MediaDrmStateException;
import android.media.NotProvisionedException;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.NetworkEvent;
import android.media.metrics.PlaybackErrorEvent;
import android.media.metrics.PlaybackMetrics.Builder;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.PlaybackStateEvent;
import android.media.metrics.TrackChangeEvent.Builder;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.util.Pair;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.UUID;

public final class zzmq implements zzkk, zzmr {
    public zzad A;
    public zzad B;
    public boolean C;
    public boolean D;
    public int E;
    public int F;
    public int G;
    public boolean H;
    public final Context i;
    public final zzmo j;
    public final PlaybackSession k;
    public final long l;
    public final zzch m;
    public final zzcf n;
    public final HashMap o;
    public final HashMap p;
    public String q;
    public PlaybackMetrics.Builder r;
    public int s;
    public int t;
    public int u;
    public zzbr v;
    public Q w;
    public Q x;
    public Q y;
    public zzad z;

    public zzmq(Context context0, PlaybackSession playbackSession0) {
        this.i = context0.getApplicationContext();
        this.k = playbackSession0;
        this.m = new zzch();
        this.n = new zzcf();
        this.p = new HashMap();
        this.o = new HashMap();
        this.l = SystemClock.elapsedRealtime();
        this.t = 0;
        this.u = 0;
        zzmo zzmo0 = new zzmo(zzmo.zza);
        this.j = zzmo0;
        zzmo0.zzg(this);
    }

    public final void a() {
        PlaybackMetrics.Builder playbackMetrics$Builder0 = this.r;
        if(playbackMetrics$Builder0 != null && this.H) {
            playbackMetrics$Builder0.setAudioUnderrunCount(this.G);
            this.r.setVideoFramesDropped(this.E);
            this.r.setVideoFramesPlayed(this.F);
            Long long0 = (Long)this.o.get(this.q);
            this.r.setNetworkTransferDurationMillis((long0 == null ? 0L : ((long)long0)));
            Long long1 = (Long)this.p.get(this.q);
            this.r.setNetworkBytesRead((long1 == null ? 0L : ((long)long1)));
            this.r.setStreamSource((long1 == null || ((long)long1) <= 0L ? 0 : 1));
            PlaybackMetrics playbackMetrics0 = this.r.build();
            this.k.reportPlaybackMetrics(playbackMetrics0);
        }
        this.r = null;
        this.q = null;
        this.G = 0;
        this.E = 0;
        this.F = 0;
        this.z = null;
        this.A = null;
        this.B = null;
        this.H = false;
    }

    public final void b(zzci zzci0, zzsa zzsa0) {
        PlaybackMetrics.Builder playbackMetrics$Builder0 = this.r;
        if(zzsa0 == null) {
            return;
        }
        int v = zzci0.zza(zzsa0.zza);
        if(v == -1) {
            return;
        }
        int v1 = 0;
        zzci0.zzd(v, this.n, false);
        zzch zzch0 = this.m;
        zzci0.zze(this.n.zzd, zzch0, 0L);
        zzaw zzaw0 = zzch0.zzd.zzd;
        int v2 = 2;
        if(zzaw0 != null) {
            switch(zzeg.zzp(zzaw0.zza)) {
                case 0: {
                    v1 = 3;
                    break;
                }
                case 1: {
                    v1 = 5;
                    break;
                }
                case 2: {
                    v1 = 4;
                    break;
                }
                default: {
                    v1 = 1;
                }
            }
        }
        playbackMetrics$Builder0.setStreamType(v1);
        if(zzch0.zzn != 0x8000000000000001L && !zzch0.zzl && !zzch0.zzi && !zzch0.zzb()) {
            playbackMetrics$Builder0.setMediaDurationMillis(zzeg.zzz(zzch0.zzn));
        }
        if(!zzch0.zzb()) {
            v2 = 1;
        }
        playbackMetrics$Builder0.setPlaybackType(v2);
        this.H = true;
    }

    public final void c(int v, long v1, zzad zzad0, int v2) {
        TrackChangeEvent.Builder trackChangeEvent$Builder0 = f.n(v).setTimeSinceCreatedMillis(v1 - this.l);
        if(zzad0 == null) {
            Ja.p(trackChangeEvent$Builder0);
        }
        else {
            Ja.u(trackChangeEvent$Builder0);
            trackChangeEvent$Builder0.setTrackChangeReason((v2 == 1 ? 2 : 1));
            String s = zzad0.zzl;
            if(s != null) {
                trackChangeEvent$Builder0.setContainerMimeType(s);
            }
            String s1 = zzad0.zzm;
            if(s1 != null) {
                trackChangeEvent$Builder0.setSampleMimeType(s1);
            }
            String s2 = zzad0.zzj;
            if(s2 != null) {
                trackChangeEvent$Builder0.setCodecName(s2);
            }
            int v3 = zzad0.zzi;
            if(v3 != -1) {
                trackChangeEvent$Builder0.setBitrate(v3);
            }
            int v4 = zzad0.zzr;
            if(v4 != -1) {
                trackChangeEvent$Builder0.setWidth(v4);
            }
            int v5 = zzad0.zzs;
            if(v5 != -1) {
                trackChangeEvent$Builder0.setHeight(v5);
            }
            int v6 = zzad0.zzz;
            if(v6 != -1) {
                trackChangeEvent$Builder0.setChannelCount(v6);
            }
            int v7 = zzad0.zzA;
            if(v7 != -1) {
                trackChangeEvent$Builder0.setAudioSampleRate(v7);
            }
            String s3 = zzad0.zzd;
            if(s3 != null) {
                String[] arr_s = zzeg.zzaf(s3, "-");
                Pair pair0 = Pair.create(arr_s[0], (arr_s.length < 2 ? null : arr_s[1]));
                trackChangeEvent$Builder0.setLanguage(((String)pair0.first));
                Object object0 = pair0.second;
                if(object0 != null) {
                    trackChangeEvent$Builder0.setLanguageRegion(((String)object0));
                }
            }
            float f = zzad0.zzt;
            if(f != -1.0f) {
                trackChangeEvent$Builder0.setVideoFrameRate(f);
            }
        }
        this.H = true;
        TrackChangeEvent trackChangeEvent0 = trackChangeEvent$Builder0.build();
        this.k.reportTrackChangeEvent(trackChangeEvent0);
    }

    public final boolean d(Q q0) {
        if(q0 != null) {
            String s = this.j.zzd();
            return ((String)q0.k).equals(s);
        }
        return false;
    }

    public final LogSessionId zza() {
        return this.k.getSessionId();
    }

    public static zzmq zzb(Context context0) {
        MediaMetricsManager mediaMetricsManager0 = f.e(context0.getSystemService("media_metrics"));
        return mediaMetricsManager0 == null ? null : new zzmq(context0, mediaMetricsManager0.createPlaybackSession());
    }

    @Override  // com.google.android.gms.internal.ads.zzmr
    public final void zzc(zzki zzki0, String s) {
        if(zzki0.zzd != null && zzki0.zzd.zzb()) {
            return;
        }
        this.a();
        this.q = s;
        this.r = f.y(f.h(Ja.h()));
        this.b(zzki0.zzb, zzki0.zzd);
    }

    @Override  // com.google.android.gms.internal.ads.zzmr
    public final void zzd(zzki zzki0, String s, boolean z) {
        if((zzki0.zzd == null || !zzki0.zzd.zzb()) && s.equals(this.q)) {
            this.a();
        }
        this.o.remove(s);
        this.p.remove(s);
    }

    @Override  // com.google.android.gms.internal.ads.zzkk
    public final void zze(zzki zzki0, zzad zzad0, zzgm zzgm0) {
    }

    @Override  // com.google.android.gms.internal.ads.zzkk
    public final void zzf(zzki zzki0, int v, long v1, long v2) {
        zzsa zzsa0 = zzki0.zzd;
        if(zzsa0 != null) {
            String s = this.j.zze(zzki0.zzb, zzsa0);
            Long long0 = (Long)this.p.get(s);
            HashMap hashMap0 = this.o;
            Long long1 = (Long)hashMap0.get(s);
            long v3 = 0L;
            this.p.put(s, ((long)((long0 == null ? 0L : ((long)long0)) + v1)));
            if(long1 != null) {
                v3 = (long)long1;
            }
            hashMap0.put(s, ((long)(v3 + ((long)v))));
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzkk
    public final void zzg(zzki zzki0, zzrw zzrw0) {
        zzsa zzsa0 = zzki0.zzd;
        if(zzsa0 == null) {
            return;
        }
        zzrw0.zzb.getClass();
        String s = this.j.zze(zzki0.zzb, zzsa0);
        Q q0 = new Q(17, zzrw0.zzb, s);
        switch(zzrw0.zza) {
            case 1: {
                this.x = q0;
                return;
            }
            case 0: 
            case 2: {
                this.w = q0;
                return;
            }
            case 3: {
                this.y = q0;
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzkk
    public final void zzh(zzki zzki0, int v, long v1) {
    }

    @Override  // com.google.android.gms.internal.ads.zzkk
    public final void zzi(zzcb zzcb0, zzkj zzkj0) {
        int v25;
        int v23;
        long v16;
        boolean z3;
        int v15;
        int v10;
        int v8;
        zzv zzv0;
        zzmo zzmo0;
        if(zzkj0.zzb() != 0) {
            int v = 0;
            for(int v1 = 0; true; ++v1) {
                zzmo0 = this.j;
                if(v1 >= zzkj0.zzb()) {
                    break;
                }
                int v2 = zzkj0.zza(v1);
                zzki zzki0 = zzkj0.zzc(v2);
                if(v2 == 0) {
                    zzmo0.zzj(zzki0);
                }
                else if(v2 == 11) {
                    zzmo0.zzi(zzki0, this.s);
                }
                else {
                    zzmo0.zzh(zzki0);
                }
            }
            long v3 = SystemClock.elapsedRealtime();
            if(zzkj0.zzd(0)) {
                zzki zzki1 = zzkj0.zzc(0);
                if(this.r != null) {
                    this.b(zzki1.zzb, zzki1.zzd);
                }
            }
            if(zzkj0.zzd(2) && this.r != null) {
                zzfrj zzfrj0 = zzcb0.zzo().zza();
                int v4 = zzfrj0.size();
            alab1:
                for(int v5 = 0; true; ++v5) {
                    zzv0 = null;
                    if(v5 >= v4) {
                        break;
                    }
                    zzcs zzcs0 = (zzcs)zzfrj0.get(v5);
                    for(int v6 = 0; v6 <= 0; ++v6) {
                        if(zzcs0.zzd(v6)) {
                            zzv zzv1 = zzcs0.zzb(v6).zzp;
                            if(zzv1 != null) {
                                zzv0 = zzv1;
                                break alab1;
                            }
                        }
                    }
                }
                if(zzv0 != null) {
                    PlaybackMetrics.Builder playbackMetrics$Builder0 = this.r;
                    for(int v7 = 0; true; ++v7) {
                        v8 = 1;
                        if(v7 >= zzv0.zzb) {
                            break;
                        }
                        UUID uUID0 = zzv0.zza(v7).zza;
                        if(uUID0.equals(zzm.zzd)) {
                            v8 = 3;
                            break;
                        }
                        if(uUID0.equals(zzm.zze)) {
                            v8 = 2;
                            break;
                        }
                        if(uUID0.equals(zzm.zzc)) {
                            v8 = 6;
                            break;
                        }
                    }
                    playbackMetrics$Builder0.setDrmType(v8);
                }
            }
            if(zzkj0.zzd(0x3F3)) {
                ++this.G;
            }
            zzbr zzbr0 = this.v;
            Context context0 = this.i;
            long v9 = this.l;
            if(zzbr0 != null) {
                if(zzbr0.zzb == 1001) {
                    v10 = 20;
                }
                else {
                    int v11 = ((zzgt)zzbr0).zze;
                    int v12 = ((zzgt)zzbr0).zzi;
                    Throwable throwable0 = zzbr0.getCause();
                    throwable0.getClass();
                    int v13 = 28;
                    if(!(throwable0 instanceof IOException)) {
                        if(v11 == 1 && (v12 == 0 || v12 == 1)) {
                            v10 = 35;
                        }
                        else if(v11 == 1 && v12 == 3) {
                            v10 = 15;
                        }
                        else if(v11 == 1 && v12 == 2) {
                            v10 = 23;
                        }
                        else if(throwable0 instanceof zzqh) {
                            v = zzeg.zzm(((zzqh)throwable0).zzd);
                            v10 = 13;
                        }
                        else if(throwable0 instanceof zzqe) {
                            v = zzeg.zzm(((zzqe)throwable0).zzb);
                            v10 = 14;
                        }
                        else if(throwable0 instanceof OutOfMemoryError) {
                            v10 = 14;
                        }
                        else if(throwable0 instanceof zznm) {
                            v = ((zznm)throwable0).zza;
                            v10 = 17;
                        }
                        else if(throwable0 instanceof zznp) {
                            v = ((zznp)throwable0).zza;
                            v10 = 18;
                        }
                        else if(throwable0 instanceof MediaCodec.CryptoException) {
                            v15 = ((MediaCodec.CryptoException)throwable0).getErrorCode();
                            switch(zzeg.zzl(v15)) {
                                case 6002: {
                                    v13 = 24;
                                    break;
                                }
                                case 6003: {
                                    break;
                                }
                                case 6004: {
                                    v13 = 25;
                                    break;
                                }
                                case 6005: {
                                    v13 = 26;
                                    break;
                                }
                                default: {
                                    v13 = 27;
                                }
                            }
                            v = v15;
                            v10 = v13;
                        }
                        else {
                            v10 = 22;
                        }
                    }
                    else if(throwable0 instanceof zzfl) {
                        v = ((zzfl)throwable0).zzd;
                        v10 = 5;
                    }
                    else if(throwable0 instanceof zzfk || throwable0 instanceof zzbp) {
                        v10 = 11;
                    }
                    else if(throwable0 instanceof zzfj || throwable0 instanceof zzft) {
                        if(zzdw.zzb(context0).zza() == 1) {
                            v10 = 3;
                        }
                        else {
                            Throwable throwable4 = throwable0.getCause();
                            if(throwable4 instanceof UnknownHostException) {
                                v10 = 6;
                            }
                            else if(throwable4 instanceof SocketTimeoutException) {
                                v10 = 7;
                            }
                            else if(!(throwable0 instanceof zzfj) || ((zzfj)throwable0).zzc != 1) {
                                v10 = 8;
                            }
                            else {
                                v10 = 4;
                            }
                        }
                    }
                    else if(zzbr0.zzb == 1002) {
                        v10 = 21;
                    }
                    else if(throwable0 instanceof zzpa) {
                        Throwable throwable1 = throwable0.getCause();
                        throwable1.getClass();
                        int v14 = zzeg.zza;
                        if(v14 >= 21 && throwable1 instanceof MediaDrm.MediaDrmStateException) {
                            v15 = zzeg.zzm(((MediaDrm.MediaDrmStateException)throwable1).getDiagnosticInfo());
                            switch(zzeg.zzl(v15)) {
                                case 6002: {
                                    v13 = 24;
                                    break;
                                }
                                case 6003: {
                                    break;
                                }
                                case 6004: {
                                    v13 = 25;
                                    break;
                                }
                                case 6005: {
                                    v13 = 26;
                                    break;
                                }
                                default: {
                                    v13 = 27;
                                }
                            }
                            v = v15;
                            v10 = v13;
                        }
                        else if(v14 >= 23 && l5.B(throwable1)) {
                            v10 = 27;
                        }
                        else if(throwable1 instanceof NotProvisionedException) {
                            v10 = 24;
                        }
                        else if(throwable1 instanceof DeniedByServerException) {
                            v10 = 29;
                        }
                        else if(throwable1 instanceof zzpl) {
                            v10 = 23;
                        }
                        else if(throwable1 instanceof zzoy) {
                            v10 = 28;
                        }
                        else {
                            v10 = 30;
                        }
                    }
                    else if(!(throwable0 instanceof zzff) || !(throwable0.getCause() instanceof FileNotFoundException)) {
                        v10 = 9;
                    }
                    else {
                        Throwable throwable2 = throwable0.getCause();
                        throwable2.getClass();
                        Throwable throwable3 = throwable2.getCause();
                        v10 = zzeg.zza < 21 || !(throwable3 instanceof ErrnoException) || ((ErrnoException)throwable3).errno != OsConstants.EACCES ? 0x1F : 0x20;
                    }
                }
                PlaybackErrorEvent playbackErrorEvent0 = Ja.e().setTimeSinceCreatedMillis(v3 - v9).setErrorCode(v10).setSubErrorCode(v).setException(zzbr0).build();
                this.k.reportPlaybackErrorEvent(playbackErrorEvent0);
                this.H = true;
                this.v = null;
            }
            if(zzkj0.zzd(2)) {
                zzct zzct0 = zzcb0.zzo();
                boolean z = zzct0.zzb(2);
                boolean z1 = zzct0.zzb(1);
                boolean z2 = zzct0.zzb(3);
                if(z || z1) {
                    z3 = z2;
                label_203:
                    if(z) {
                        v16 = v9;
                    }
                    else if(zzeg.zzS(this.z, null)) {
                        v16 = v9;
                    }
                    else {
                        int v17 = this.z == null ? 1 : 0;
                        this.z = null;
                        v16 = v9;
                        this.c(1, v3, null, v17);
                    }
                    if(!z1 && !zzeg.zzS(this.A, null)) {
                        int v18 = this.A == null ? 1 : 0;
                        this.A = null;
                        this.c(0, v3, null, v18);
                    }
                    if(!z3 && !zzeg.zzS(this.B, null)) {
                        int v19 = this.B == null ? 1 : 0;
                        this.B = null;
                        this.c(2, v3, null, v19);
                    }
                }
                else if(z2) {
                    z3 = true;
                    goto label_203;
                }
                else {
                    v16 = v9;
                }
            }
            else {
                v16 = v9;
            }
            if(this.d(this.w)) {
                zzad zzad0 = (zzad)this.w.j;
                if(zzad0.zzs != -1) {
                    if(!zzeg.zzS(this.z, zzad0)) {
                        int v20 = this.z == null ? 1 : 0;
                        this.z = zzad0;
                        this.c(1, v3, zzad0, v20);
                    }
                    this.w = null;
                }
            }
            if(this.d(this.x)) {
                zzad zzad1 = (zzad)this.x.j;
                if(!zzeg.zzS(this.A, zzad1)) {
                    int v21 = this.A == null ? 1 : 0;
                    this.A = zzad1;
                    this.c(0, v3, zzad1, v21);
                }
                this.x = null;
            }
            if(this.d(this.y)) {
                zzad zzad2 = (zzad)this.y.j;
                if(!zzeg.zzS(this.B, zzad2)) {
                    int v22 = this.B == null ? 1 : 0;
                    this.B = zzad2;
                    this.c(2, v3, zzad2, v22);
                }
                this.y = null;
            }
            switch(zzdw.zzb(context0).zza()) {
                case 0: {
                    v23 = 0;
                    break;
                }
                case 1: {
                    v23 = 9;
                    break;
                }
                case 2: {
                    v23 = 2;
                    break;
                }
                case 3: {
                    v23 = 4;
                    break;
                }
                case 4: {
                    v23 = 5;
                    break;
                }
                case 5: {
                    v23 = 6;
                    break;
                }
                case 7: {
                    v23 = 3;
                    break;
                }
                case 9: {
                    v23 = 8;
                    break;
                }
                case 10: {
                    v23 = 7;
                    break;
                }
                default: {
                    v23 = 1;
                }
            }
            if(v23 != this.u) {
                this.u = v23;
                NetworkEvent networkEvent0 = Ja.a().setNetworkType(v23).setTimeSinceCreatedMillis(v3 - v16).build();
                this.k.reportNetworkEvent(networkEvent0);
            }
            if(zzcb0.zzh() != 2) {
                this.C = false;
            }
            if(((zzjy)zzcb0).zzw() == null) {
                this.D = false;
            }
            else if(zzkj0.zzd(10)) {
                this.D = true;
            }
            int v24 = zzcb0.zzh();
            if(this.C) {
                v25 = 5;
            }
            else if(this.D) {
                v25 = 13;
            }
            else {
                switch(v24) {
                    case 1: {
                        v25 = this.t == 0 ? this.t : 12;
                        break;
                    }
                    case 2: {
                        if(this.t == 0 || this.t == 2) {
                            v25 = 2;
                        }
                        else if(!zzcb0.zzq()) {
                            v25 = 7;
                        }
                        else if(zzcb0.zzi() == 0) {
                            v25 = 6;
                        }
                        else {
                            v25 = 10;
                        }
                        break;
                    }
                    case 3: {
                        if(!zzcb0.zzq()) {
                            v25 = 4;
                        }
                        else if(zzcb0.zzi() == 0) {
                            v25 = 3;
                        }
                        else {
                            v25 = 9;
                        }
                        break;
                    }
                    case 4: {
                        v25 = 11;
                        break;
                    }
                    default: {
                        v25 = this.t;
                    }
                }
            }
            if(this.t != v25) {
                this.t = v25;
                this.H = true;
                PlaybackStateEvent playbackStateEvent0 = Ja.i().setState(this.t).setTimeSinceCreatedMillis(v3 - v16).build();
                this.k.reportPlaybackStateEvent(playbackStateEvent0);
            }
            if(zzkj0.zzd(0x404)) {
                zzmo0.zzf(zzkj0.zzc(0x404));
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzkk
    public final void zzj(zzki zzki0, zzrr zzrr0, zzrw zzrw0, IOException iOException0, boolean z) {
    }

    @Override  // com.google.android.gms.internal.ads.zzkk
    public final void zzk(zzki zzki0, int v) {
    }

    @Override  // com.google.android.gms.internal.ads.zzkk
    public final void zzl(zzki zzki0, zzbr zzbr0) {
        this.v = zzbr0;
    }

    @Override  // com.google.android.gms.internal.ads.zzkk
    public final void zzm(zzki zzki0, zzca zzca0, zzca zzca1, int v) {
        if(v == 1) {
            this.C = true;
            v = 1;
        }
        this.s = v;
    }

    @Override  // com.google.android.gms.internal.ads.zzkk
    public final void zzn(zzki zzki0, Object object0, long v) {
    }

    @Override  // com.google.android.gms.internal.ads.zzkk
    public final void zzo(zzki zzki0, zzgl zzgl0) {
        this.E += zzgl0.zzg;
        this.F += zzgl0.zze;
    }

    @Override  // com.google.android.gms.internal.ads.zzkk
    public final void zzp(zzki zzki0, zzad zzad0, zzgm zzgm0) {
    }

    @Override  // com.google.android.gms.internal.ads.zzkk
    public final void zzq(zzki zzki0, zzcv zzcv0) {
        Q q0 = this.w;
        if(q0 != null) {
            zzad zzad0 = (zzad)q0.j;
            if(zzad0.zzs == -1) {
                zzab zzab0 = zzad0.zzb();
                zzab0.zzX(zzcv0.zzc);
                zzab0.zzF(zzcv0.zzd);
                this.w = new Q(17, zzab0.zzY(), ((String)q0.k));
            }
        }
    }
}

