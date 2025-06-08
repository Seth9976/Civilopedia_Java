package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceHolder.Callback;
import android.view.SurfaceHolder;
import android.view.TextureView.SurfaceTextureListener;

public final class qa implements SurfaceHolder.Callback, TextureView.SurfaceTextureListener, zzge, zzgi, zzgu, zzka, zznk, zzra, zzua, zzxq {
    public final ta i;

    public qa(ta ta0) {
        this.i = ta0;
    }

    @Override  // android.view.TextureView$SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture0, int v, int v1) {
        Surface surface0 = new Surface(surfaceTexture0);
        this.i.i(surface0);
        this.i.D = surface0;
        this.i.g(v, v1);
    }

    @Override  // android.view.TextureView$SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture0) {
        this.i.i(null);
        this.i.g(0, 0);
        return true;
    }

    @Override  // android.view.TextureView$SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture0, int v, int v1) {
        this.i.g(v, v1);
    }

    @Override  // android.view.TextureView$SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture0) {
    }

    @Override  // android.view.SurfaceHolder$Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder0, int v, int v1, int v2) {
        this.i.g(v1, v2);
    }

    @Override  // android.view.SurfaceHolder$Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder0) {
    }

    @Override  // android.view.SurfaceHolder$Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder0) {
        this.i.g(0, 0);
    }

    @Override  // com.google.android.gms.internal.ads.zzgu
    public final void zza(boolean z) {
    }

    @Override  // com.google.android.gms.internal.ads.zzgu
    public final void zzb(boolean z) {
        ta ta0 = this.i;
        switch(ta0.zzh()) {
            case 2: 
            case 3: {
                ta0.m();
                ta0.zzq();
                ta0.zzq();
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zznk
    public final void zzc(Exception exception0) {
        this.i.o.zzy(exception0);
    }

    @Override  // com.google.android.gms.internal.ads.zznk
    public final void zzd(String s, long v, long v1) {
        this.i.o.zzz(s, v, v1);
    }

    @Override  // com.google.android.gms.internal.ads.zznk
    public final void zze(String s) {
        this.i.o.zzA(s);
    }

    @Override  // com.google.android.gms.internal.ads.zznk
    public final void zzf(zzgl zzgl0) {
        this.i.o.zzB(zzgl0);
        this.i.getClass();
        this.i.getClass();
    }

    @Override  // com.google.android.gms.internal.ads.zznk
    public final void zzg(zzgl zzgl0) {
        this.i.getClass();
        this.i.o.zzC(zzgl0);
    }

    @Override  // com.google.android.gms.internal.ads.zznk
    public final void zzh(zzad zzad0, zzgm zzgm0) {
        this.i.getClass();
        this.i.o.zzD(zzad0, zzgm0);
    }

    @Override  // com.google.android.gms.internal.ads.zznk
    public final void zzi(long v) {
        this.i.o.zzE(v);
    }

    @Override  // com.google.android.gms.internal.ads.zznk
    public final void zzj(Exception exception0) {
        this.i.o.zzF(exception0);
    }

    @Override  // com.google.android.gms.internal.ads.zznk
    public final void zzk(int v, long v1, long v2) {
        this.i.o.zzG(v, v1, v2);
    }

    @Override  // com.google.android.gms.internal.ads.zzxq
    public final void zzl(int v, long v1) {
        this.i.o.zzH(v, v1);
    }

    @Override  // com.google.android.gms.internal.ads.zzxq
    public final void zzm(Object object0, long v) {
        ta ta0 = this.i;
        ta0.o.zzI(object0, v);
        if(ta0.C == object0) {
            ta0.j.zzd(26, zzic.zza);
            ta0.j.zzc();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zznk
    public final void zzn(boolean z) {
        ta ta0 = this.i;
        if(ta0.I == z) {
            return;
        }
        ta0.I = z;
        zzif zzif0 = new zzif(z);
        ta0.j.zzd(23, zzif0);
        ta0.j.zzc();
    }

    @Override  // com.google.android.gms.internal.ads.zzxq
    public final void zzo(Exception exception0) {
        this.i.o.zzJ(exception0);
    }

    @Override  // com.google.android.gms.internal.ads.zzxq
    public final void zzp(String s, long v, long v1) {
        this.i.o.zzK(s, v, v1);
    }

    @Override  // com.google.android.gms.internal.ads.zzxq
    public final void zzq(String s) {
        this.i.o.zzL(s);
    }

    @Override  // com.google.android.gms.internal.ads.zzxq
    public final void zzr(zzgl zzgl0) {
        this.i.o.zzM(zzgl0);
        this.i.getClass();
        this.i.getClass();
    }

    @Override  // com.google.android.gms.internal.ads.zzxq
    public final void zzs(zzgl zzgl0) {
        this.i.getClass();
        this.i.o.zzN(zzgl0);
    }

    @Override  // com.google.android.gms.internal.ads.zzxq
    public final void zzt(long v, int v1) {
        this.i.o.zzO(v, v1);
    }

    @Override  // com.google.android.gms.internal.ads.zzxq
    public final void zzu(zzad zzad0, zzgm zzgm0) {
        this.i.getClass();
        this.i.o.zzP(zzad0, zzgm0);
    }

    @Override  // com.google.android.gms.internal.ads.zzxq
    public final void zzv(zzcv zzcv0) {
        this.i.getClass();
        zzig zzig0 = new zzig(zzcv0);
        this.i.j.zzd(25, zzig0);
        this.i.j.zzc();
    }
}

