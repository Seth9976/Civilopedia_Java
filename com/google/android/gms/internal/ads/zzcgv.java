package com.google.android.gms.internal.ads;

import A.f;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.MediaPlayer.OnBufferingUpdateListener;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnErrorListener;
import android.media.MediaPlayer.OnInfoListener;
import android.media.MediaPlayer.OnPreparedListener;
import android.media.MediaPlayer.OnVideoSizeChangedListener;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build.VERSION;
import android.view.Surface;
import android.view.TextureView.SurfaceTextureListener;
import android.view.View.MeasureSpec;
import android.view.View;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import java.io.IOException;
import java.util.HashMap;

public final class zzcgv extends zzcgx implements MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnVideoSizeChangedListener, TextureView.SurfaceTextureListener {
    public static final HashMap A;
    public final zzchr k;
    public final zzchs l;
    public final boolean m;
    public int n;
    public int o;
    public MediaPlayer p;
    public Uri q;
    public int r;
    public int s;
    public int t;
    public zzchp u;
    public final boolean v;
    public int w;
    public zzcgw x;
    public boolean y;
    public Integer z;

    static {
        HashMap hashMap0 = new HashMap();
        zzcgv.A = hashMap0;
        hashMap0.put(-1004, "MEDIA_ERROR_IO");
        hashMap0.put(-1007, "MEDIA_ERROR_MALFORMED");
        hashMap0.put(-1010, "MEDIA_ERROR_UNSUPPORTED");
        hashMap0.put(-110, "MEDIA_ERROR_TIMED_OUT");
        hashMap0.put(3, "MEDIA_INFO_VIDEO_RENDERING_START");
        hashMap0.put(100, "MEDIA_ERROR_SERVER_DIED");
        hashMap0.put(1, "MEDIA_ERROR_UNKNOWN");
        hashMap0.put(1, "MEDIA_INFO_UNKNOWN");
        hashMap0.put(700, "MEDIA_INFO_VIDEO_TRACK_LAGGING");
        hashMap0.put(701, "MEDIA_INFO_BUFFERING_START");
        hashMap0.put(702, "MEDIA_INFO_BUFFERING_END");
        hashMap0.put(800, "MEDIA_INFO_BAD_INTERLEAVING");
        hashMap0.put(801, "MEDIA_INFO_NOT_SEEKABLE");
        hashMap0.put(802, "MEDIA_INFO_METADATA_UPDATE");
        hashMap0.put(901, "MEDIA_INFO_UNSUPPORTED_SUBTITLE");
        hashMap0.put(902, "MEDIA_INFO_SUBTITLE_TIMED_OUT");
    }

    public zzcgv(Context context0, zzchr zzchr0, boolean z, boolean z1, zzchq zzchq0, zzchs zzchs0) {
        super(context0);
        this.n = 0;
        this.o = 0;
        this.y = false;
        this.z = null;
        this.setSurfaceTextureListener(this);
        this.k = zzchr0;
        this.l = zzchs0;
        this.v = z;
        this.m = z1;
        zzchs0.zza(this);
    }

    public final void a() {
        zze.zza("AdMediaPlayerView init MediaPlayer");
        SurfaceTexture surfaceTexture0 = this.getSurfaceTexture();
        if(this.q != null && surfaceTexture0 != null) {
            this.b(false);
            try {
                MediaPlayer mediaPlayer0 = new MediaPlayer();
                this.p = mediaPlayer0;
                mediaPlayer0.setOnBufferingUpdateListener(this);
                this.p.setOnCompletionListener(this);
                this.p.setOnErrorListener(this);
                this.p.setOnInfoListener(this);
                this.p.setOnPreparedListener(this);
                this.p.setOnVideoSizeChangedListener(this);
                this.t = 0;
                if(this.v) {
                    zzchp zzchp0 = new zzchp(this.getContext());
                    this.u = zzchp0;
                    zzchp0.zzd(surfaceTexture0, this.getWidth(), this.getHeight());
                    this.u.start();
                    SurfaceTexture surfaceTexture1 = this.u.zzb();
                    if(surfaceTexture1 == null) {
                        this.u.zze();
                        this.u = null;
                    }
                    else {
                        surfaceTexture0 = surfaceTexture1;
                    }
                }
                this.p.setDataSource(this.getContext(), this.q);
                Surface surface0 = new Surface(surfaceTexture0);
                this.p.setSurface(surface0);
                this.p.setAudioStreamType(3);
                this.p.setScreenOnWhilePlaying(true);
                this.p.prepareAsync();
                this.c(1);
                return;
            }
            catch(IOException | IllegalArgumentException | IllegalStateException iOException0) {
            }
            zzcfi.zzk(("Failed to initialize MediaPlayer at " + this.q), iOException0);
            this.onError(this.p, 1, 0);
        }
    }

    public final void b(boolean z) {
        zze.zza("AdMediaPlayerView release");
        zzchp zzchp0 = this.u;
        if(zzchp0 != null) {
            zzchp0.zze();
            this.u = null;
        }
        MediaPlayer mediaPlayer0 = this.p;
        if(mediaPlayer0 != null) {
            mediaPlayer0.reset();
            this.p.release();
            this.p = null;
            this.c(0);
            if(z) {
                this.o = 0;
            }
        }
    }

    public final void c(int v) {
        zzchv zzchv0 = this.j;
        zzchs zzchs0 = this.l;
        if(v == 3) {
            zzchs0.zzc();
            zzchv0.zzb();
        }
        else if(this.n == 3) {
            zzchs0.zze();
            zzchv0.zzc();
        }
        this.n = v;
    }

    public final boolean d() {
        return this.p != null && (this.n != -1 && this.n != 0 && this.n != 1);
    }

    @Override  // android.media.MediaPlayer$OnBufferingUpdateListener
    public final void onBufferingUpdate(MediaPlayer mediaPlayer0, int v) {
        this.t = v;
    }

    @Override  // android.media.MediaPlayer$OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer0) {
        zze.zza("AdMediaPlayerView completion");
        this.c(5);
        this.o = 5;
        K2 k20 = new K2(this, 0);
        zzs.zza.post(k20);
    }

    @Override  // android.media.MediaPlayer$OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer0, int v, int v1) {
        String s = (String)zzcgv.A.get(v);
        String s1 = (String)zzcgv.A.get(v1);
        zzcfi.zzj(("AdMediaPlayerView MediaPlayer error: " + s + ":" + s1));
        this.c(-1);
        this.o = -1;
        o0 o00 = new o0(this, s, s1, 3);
        zzs.zza.post(o00);
        return true;
    }

    @Override  // android.media.MediaPlayer$OnInfoListener
    public final boolean onInfo(MediaPlayer mediaPlayer0, int v, int v1) {
        zze.zza(("AdMediaPlayerView MediaPlayer info: " + ((String)zzcgv.A.get(v)) + ":" + ((String)zzcgv.A.get(v1))));
        return true;
    }

    @Override  // android.view.View
    public final void onMeasure(int v, int v1) {
        int v13;
        int v2 = View.getDefaultSize(this.r, v);
        int v3 = View.getDefaultSize(this.s, v1);
        if(this.r > 0 && this.s > 0 && this.u == null) {
            int v4 = View.MeasureSpec.getMode(v);
            int v5 = View.MeasureSpec.getSize(v);
            int v6 = View.MeasureSpec.getMode(v1);
            int v7 = View.MeasureSpec.getSize(v1);
            if(v4 != 0x40000000) {
            label_25:
                if(v4 == 0x40000000) {
                    int v12 = this.s * v5 / this.r;
                    if(v6 == 0x80000000 && v12 > v7) {
                        v2 = v5;
                        v3 = v7;
                    }
                    else {
                        v3 = v12;
                        v2 = v5;
                    }
                }
                else if(v6 == 0x40000000) {
                    v13 = this.r * v7 / this.s;
                    v2 = v4 != 0x80000000 || v13 <= v5 ? v13 : v5;
                    v3 = v7;
                }
                else {
                    int v14 = this.r;
                    int v15 = this.s;
                    if(v6 != 0x80000000 || v15 <= v7) {
                        v13 = v14;
                        v7 = v15;
                    }
                    else {
                        v13 = v7 * v14 / v15;
                    }
                    if(v4 != 0x80000000 || v13 <= v5) {
                        v2 = v13;
                        v3 = v7;
                    }
                    else {
                        v3 = v15 * v5 / v14;
                        v2 = v5;
                    }
                }
            }
            else if(v6 == 0x40000000) {
                int v8 = this.r;
                int v9 = v8 * v7;
                int v10 = this.s;
                int v11 = v5 * v10;
                if(v9 < v11) {
                    v2 = v9 / v10;
                    v3 = v7;
                }
                else if(v9 > v11) {
                    v3 = v11 / v8;
                    v2 = v5;
                }
                else {
                    v2 = v5;
                    v3 = v7;
                }
            }
            else {
                v4 = 0x40000000;
                goto label_25;
            }
        }
        this.setMeasuredDimension(v2, v3);
        zzchp zzchp0 = this.u;
        if(zzchp0 != null) {
            zzchp0.zzc(v2, v3);
        }
    }

    @Override  // android.media.MediaPlayer$OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer0) {
        zze.zza("AdMediaPlayerView prepared");
        this.c(2);
        this.l.zzb();
        m0 m00 = new m0(8, this, mediaPlayer0);
        zzs.zza.post(m00);
        this.r = mediaPlayer0.getVideoWidth();
        this.s = mediaPlayer0.getVideoHeight();
        int v = this.w;
        if(v != 0) {
            this.zzq(v);
        }
        if(this.m && this.d() && this.p.getCurrentPosition() > 0 && this.o != 3) {
            zze.zza("AdMediaPlayerView nudging MediaPlayer");
            MediaPlayer mediaPlayer1 = this.p;
            if(mediaPlayer1 == null) {
                zzcfi.zzj("AdMediaPlayerView setMediaPlayerVolume() called before onPrepared().");
            }
            else {
                try {
                    mediaPlayer1.setVolume(0.0f, 0.0f);
                }
                catch(IllegalStateException unused_ex) {
                }
            }
            this.p.start();
            int v1 = this.p.getCurrentPosition();
            long v2 = zzt.zzA().currentTimeMillis();
            while(this.d() && this.p.getCurrentPosition() == v1 && zzt.zzA().currentTimeMillis() - v2 <= 0xFAL) {
            }
            this.p.pause();
            this.zzn();
        }
        zzcfi.zzi(("AdMediaPlayerView stream dimensions: " + this.r + " x " + this.s));
        if(this.o == 3) {
            this.zzp();
        }
        this.zzn();
    }

    @Override  // android.view.TextureView$SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture0, int v, int v1) {
        zze.zza("AdMediaPlayerView surface created");
        this.a();
        K2 k20 = new K2(this, 1);
        zzs.zza.post(k20);
    }

    @Override  // android.view.TextureView$SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture0) {
        zze.zza("AdMediaPlayerView surface destroyed");
        MediaPlayer mediaPlayer0 = this.p;
        if(mediaPlayer0 != null && this.w == 0) {
            this.w = mediaPlayer0.getCurrentPosition();
        }
        zzchp zzchp0 = this.u;
        if(zzchp0 != null) {
            zzchp0.zze();
        }
        K2 k20 = new K2(this, 2);
        zzs.zza.post(k20);
        this.b(true);
        return true;
    }

    @Override  // android.view.TextureView$SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture0, int v, int v1) {
        zze.zza("AdMediaPlayerView surface changed");
        if(this.p != null && this.o == 3 && (this.r == v && this.s == v1)) {
            int v2 = this.w;
            if(v2 != 0) {
                this.zzq(v2);
            }
            this.zzp();
        }
        zzchp zzchp0 = this.u;
        if(zzchp0 != null) {
            zzchp0.zzc(v, v1);
        }
        L2 l20 = new L2(this, v, v1);
        zzs.zza.post(l20);
    }

    @Override  // android.view.TextureView$SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture0) {
        this.l.zzf(this);
        this.i.zza(surfaceTexture0, this.x);
    }

    @Override  // android.media.MediaPlayer$OnVideoSizeChangedListener
    public final void onVideoSizeChanged(MediaPlayer mediaPlayer0, int v, int v1) {
        zze.zza(("AdMediaPlayerView size changed: " + v + " x " + v1));
        this.r = mediaPlayer0.getVideoWidth();
        int v2 = mediaPlayer0.getVideoHeight();
        this.s = v2;
        if(this.r != 0 && v2 != 0) {
            this.requestLayout();
        }
    }

    @Override  // android.view.View
    public final void onWindowVisibilityChanged(int v) {
        zze.zza(("AdMediaPlayerView window visibility changed to " + v));
        zzcgm zzcgm0 = new zzcgm(this, v);
        zzs.zza.post(zzcgm0);
        super.onWindowVisibilityChanged(v);
    }

    @Override  // android.view.View
    public final String toString() {
        return f.i(zzcgv.class.getName(), "@", Integer.toHexString(this.hashCode()));
    }

    // 去混淆评级： 低(20)
    @Override  // com.google.android.gms.internal.ads.zzcgx
    public final int zza() {
        return this.d() ? this.p.getCurrentPosition() : 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzcgx
    public final int zzb() {
        return Build.VERSION.SDK_INT < 26 || !this.d() ? -1 : this.p.getMetrics().getInt("android.media.mediaplayer.dropped");
    }

    // 去混淆评级： 低(20)
    @Override  // com.google.android.gms.internal.ads.zzcgx
    public final int zzc() {
        return this.d() ? this.p.getDuration() : -1;
    }

    @Override  // com.google.android.gms.internal.ads.zzcgx
    public final int zzd() {
        return this.p == null ? 0 : this.p.getVideoHeight();
    }

    @Override  // com.google.android.gms.internal.ads.zzcgx
    public final int zze() {
        return this.p == null ? 0 : this.p.getVideoWidth();
    }

    @Override  // com.google.android.gms.internal.ads.zzcgx
    public final long zzf() {
        return 0L;
    }

    @Override  // com.google.android.gms.internal.ads.zzcgx
    public final long zzg() {
        return this.z == null ? -1L : this.zzh() * ((long)this.t) / 100L;
    }

    @Override  // com.google.android.gms.internal.ads.zzcgx
    public final long zzh() {
        return this.z == null ? -1L : ((long)this.zzc()) * ((long)(((int)this.z)));
    }

    // 去混淆评级： 低(30)
    @Override  // com.google.android.gms.internal.ads.zzcgx
    public final String zzj() {
        return this.v ? "MediaPlayer spherical" : "MediaPlayer";
    }

    @Override  // com.google.android.gms.internal.ads.zzcgx
    public final void zzn() {
        float f = this.j.zza();
        MediaPlayer mediaPlayer0 = this.p;
        if(mediaPlayer0 == null) {
            zzcfi.zzj("AdMediaPlayerView setMediaPlayerVolume() called before onPrepared().");
        }
        else {
            try {
                mediaPlayer0.setVolume(f, f);
            }
            catch(IllegalStateException unused_ex) {
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcgx
    public final void zzo() {
        zze.zza("AdMediaPlayerView pause");
        if(this.d() && this.p.isPlaying()) {
            this.p.pause();
            this.c(4);
            K2 k20 = new K2(this, 4);
            zzs.zza.post(k20);
        }
        this.o = 4;
    }

    @Override  // com.google.android.gms.internal.ads.zzcgx
    public final void zzp() {
        zze.zza("AdMediaPlayerView play");
        if(this.d()) {
            this.p.start();
            this.c(3);
            this.i.zzb();
            K2 k20 = new K2(this, 3);
            zzs.zza.post(k20);
        }
        this.o = 3;
    }

    @Override  // com.google.android.gms.internal.ads.zzcgx
    public final void zzq(int v) {
        zze.zza(("AdMediaPlayerView seek " + v));
        if(this.d()) {
            this.p.seekTo(v);
            this.w = 0;
            return;
        }
        this.w = v;
    }

    @Override  // com.google.android.gms.internal.ads.zzcgx
    public final void zzr(zzcgw zzcgw0) {
        this.x = zzcgw0;
    }

    @Override  // com.google.android.gms.internal.ads.zzcgx
    public final void zzs(String s) {
        Uri uri0 = Uri.parse(s);
        zzbcy zzbcy0 = zzbcy.zza(uri0);
        if(zzbcy0 != null && zzbcy0.zza == null) {
            return;
        }
        if(zzbcy0 != null) {
            uri0 = Uri.parse(zzbcy0.zza);
        }
        this.q = uri0;
        this.w = 0;
        this.a();
        this.requestLayout();
        this.invalidate();
    }

    @Override  // com.google.android.gms.internal.ads.zzcgx
    public final void zzt() {
        zze.zza("AdMediaPlayerView stop");
        MediaPlayer mediaPlayer0 = this.p;
        if(mediaPlayer0 != null) {
            mediaPlayer0.stop();
            this.p.release();
            this.p = null;
            this.c(0);
            this.o = 0;
        }
        this.l.zzd();
    }

    @Override  // com.google.android.gms.internal.ads.zzcgx
    public final void zzu(float f, float f1) {
        zzchp zzchp0 = this.u;
        if(zzchp0 != null) {
            zzchp0.zzf(f, f1);
        }
    }
}

