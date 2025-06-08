package com.google.android.gms.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzdk;
import com.google.android.gms.ads.internal.client.zzfe;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.ads.zzcfi;
import jeb.synthetic.FIN;

public final class VideoController {
    public static abstract class VideoLifecycleCallbacks {
        public void onVideoEnd() {
        }

        public void onVideoMute(boolean z) {
        }

        public void onVideoPause() {
        }

        public void onVideoPlay() {
        }

        public void onVideoStart() {
        }
    }

    @KeepForSdk
    public static final int PLAYBACK_STATE_ENDED = 3;
    @KeepForSdk
    public static final int PLAYBACK_STATE_PAUSED = 2;
    @KeepForSdk
    public static final int PLAYBACK_STATE_PLAYING = 1;
    @KeepForSdk
    public static final int PLAYBACK_STATE_READY = 5;
    @KeepForSdk
    public static final int PLAYBACK_STATE_UNKNOWN;
    public final Object a;
    public zzdk b;
    public VideoLifecycleCallbacks c;

    public VideoController() {
        this.a = new Object();
    }

    @KeepForSdk
    public int getPlaybackState() {
        Object object0 = this.a;
        __monitor_enter(object0);
        int v = FIN.finallyOpen$NT();
        zzdk zzdk0 = this.b;
        if(zzdk0 == null) {
            FIN.finallyCodeBegin$NT(v);
            __monitor_exit(object0);
            FIN.finallyCodeEnd$NT(v);
            return 0;
        }
        try {
            int v1 = zzdk0.zzh();
            FIN.finallyExec$NT(v);
            return v1;
        }
        catch(RemoteException remoteException0) {
            zzcfi.zzh("Unable to call getPlaybackState on video controller.", remoteException0);
            FIN.finallyExec$NT(v);
            return 0;
        }
    }

    public VideoLifecycleCallbacks getVideoLifecycleCallbacks() {
        synchronized(this.a) {
        }
        return this.c;
    }

    public boolean hasVideoContent() {
        synchronized(this.a) {
        }
        return this.b != null;
    }

    public boolean isClickToExpandEnabled() {
        Object object0 = this.a;
        __monitor_enter(object0);
        int v = FIN.finallyOpen$NT();
        zzdk zzdk0 = this.b;
        if(zzdk0 == null) {
            FIN.finallyCodeBegin$NT(v);
            __monitor_exit(object0);
            FIN.finallyCodeEnd$NT(v);
            return false;
        }
        try {
            boolean z = zzdk0.zzo();
            FIN.finallyExec$NT(v);
            return z;
        }
        catch(RemoteException remoteException0) {
            zzcfi.zzh("Unable to call isClickToExpandEnabled.", remoteException0);
            FIN.finallyExec$NT(v);
            return false;
        }
    }

    public boolean isCustomControlsEnabled() {
        Object object0 = this.a;
        __monitor_enter(object0);
        int v = FIN.finallyOpen$NT();
        zzdk zzdk0 = this.b;
        if(zzdk0 == null) {
            FIN.finallyCodeBegin$NT(v);
            __monitor_exit(object0);
            FIN.finallyCodeEnd$NT(v);
            return false;
        }
        try {
            boolean z = zzdk0.zzp();
            FIN.finallyExec$NT(v);
            return z;
        }
        catch(RemoteException remoteException0) {
            zzcfi.zzh("Unable to call isUsingCustomPlayerControls.", remoteException0);
            FIN.finallyExec$NT(v);
            return false;
        }
    }

    public boolean isMuted() {
        Object object0 = this.a;
        __monitor_enter(object0);
        int v = FIN.finallyOpen$NT();
        zzdk zzdk0 = this.b;
        if(zzdk0 == null) {
            FIN.finallyCodeBegin$NT(v);
            __monitor_exit(object0);
            FIN.finallyCodeEnd$NT(v);
            return true;
        }
        try {
            boolean z = zzdk0.zzq();
            FIN.finallyExec$NT(v);
            return z;
        }
        catch(RemoteException remoteException0) {
            zzcfi.zzh("Unable to call isMuted on video controller.", remoteException0);
            FIN.finallyExec$NT(v);
            return true;
        }
    }

    public void mute(boolean z) {
        synchronized(this.a) {
            zzdk zzdk0 = this.b;
            if(zzdk0 != null) {
                try {
                    zzdk0.zzj(z);
                }
                catch(RemoteException remoteException0) {
                    zzcfi.zzh("Unable to call mute on video controller.", remoteException0);
                }
            }
        }
    }

    public void pause() {
        synchronized(this.a) {
            zzdk zzdk0 = this.b;
            if(zzdk0 != null) {
                try {
                    zzdk0.zzk();
                }
                catch(RemoteException remoteException0) {
                    zzcfi.zzh("Unable to call pause on video controller.", remoteException0);
                }
            }
        }
    }

    public void play() {
        synchronized(this.a) {
            zzdk zzdk0 = this.b;
            if(zzdk0 != null) {
                try {
                    zzdk0.zzl();
                }
                catch(RemoteException remoteException0) {
                    zzcfi.zzh("Unable to call play on video controller.", remoteException0);
                }
            }
        }
    }

    public void setVideoLifecycleCallbacks(VideoLifecycleCallbacks videoController$VideoLifecycleCallbacks0) {
        zzfe zzfe0;
        synchronized(this.a) {
            this.c = videoController$VideoLifecycleCallbacks0;
            zzdk zzdk0 = this.b;
            if(zzdk0 != null) {
                if(videoController$VideoLifecycleCallbacks0 == null) {
                    zzfe0 = null;
                }
                else {
                    try {
                        zzfe0 = new zzfe(videoController$VideoLifecycleCallbacks0);
                    label_10:
                        zzdk0.zzm(zzfe0);
                        return;
                    }
                    catch(RemoteException remoteException0) {
                    }
                    zzcfi.zzh("Unable to call setVideoLifecycleCallbacks on video controller.", remoteException0);
                    return;
                }
                goto label_10;
            }
        }
    }

    public void stop() {
        synchronized(this.a) {
            zzdk zzdk0 = this.b;
            if(zzdk0 != null) {
                try {
                    zzdk0.zzn();
                }
                catch(RemoteException remoteException0) {
                    zzcfi.zzh("Unable to call stop on video controller.", remoteException0);
                }
            }
        }
    }

    public final zzdk zza() {
        synchronized(this.a) {
        }
        return this.b;
    }

    public final void zzb(zzdk zzdk0) {
        synchronized(this.a) {
            this.b = zzdk0;
            VideoLifecycleCallbacks videoController$VideoLifecycleCallbacks0 = this.c;
            if(videoController$VideoLifecycleCallbacks0 != null) {
                this.setVideoLifecycleCallbacks(videoController$VideoLifecycleCallbacks0);
            }
        }
    }
}

