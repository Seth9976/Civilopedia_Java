package com.google.android.gms.internal.ads;

import E.h;
import android.content.Context;
import android.media.MediaFormat;
import android.media.MediaPlayer.TrackInfo;
import android.media.MediaPlayer;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.view.Surface;
import android.view.View;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzm;
import com.google.android.gms.ads.internal.zzt;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.ExecutionException;

public final class m0 implements Runnable {
    public final int i;
    public final Object j;
    public final Object k;

    public m0(int v, Object object0, Object object1) {
        this.i = v;
        this.k = object0;
        this.j = object1;
        super();
    }

    public m0(Object object0, Object object1, int v, boolean z) {
        this.i = v;
        this.j = object0;
        this.k = object1;
        super();
    }

    @Override
    public final void run() {
        Object object2;
        Context context0;
        zzbbc zzbbc0;
        int v = 0;
        Object object0 = this.k;
        Object object1 = this.j;
        switch(this.i) {
            case 0: {
                try {
                    ((zzain)object0).j.put(((zzajb)object1));
                }
                catch(InterruptedException unused_ex) {
                    Thread.currentThread().interrupt();
                }
                return;
            }
            case 1: {
                ((zzasp)object0).b.zzh(((zzart)object1));
                return;
            }
            case 2: {
                if(((zzatw)((S8)object1).l) != null) {
                    ((S8)object1).l = null;
                }
                int v1 = ((o1)object0).v.size();
                while(v < v1) {
                    ((zzaxk)((o1)object0).v.valueAt(v)).zzi();
                    ++v;
                }
                return;
            }
            case 3: {
                ((o1)object0).m.zzi(((IOException)object1));
                return;
            }
            case 4: {
                ((zzbah)object0).b.zzn(((zzart)object1));
                return;
            }
            case 5: {
                ((zzbah)object0).b.zzm(((Surface)object1));
                return;
            }
            case 6: {
                zzbbm zzbbm0 = (zzbbm)object0;
                String s = zzbbm0.u;
                try {
                    zzbbc0 = new zzbbc(zzbbm0.n, zzbbm0.o, zzbbm0.p, zzbbm0.q, zzbbm0.r, zzbbm0.s, zzbbm0.t, zzbbm0.w);
                    context0 = zzt.zzb().zzb();
                }
                catch(Exception exception0) {
                    zzcfi.zzh("Exception in fetchContentOnUIThread", exception0);
                    zzt.zzo().zzt(exception0, "ContentFetchTask.fetchContent");
                    return;
                }
                View view0 = (View)object1;
                try {
                    if(context0 == null || TextUtils.isEmpty(s)) {
                    label_48:
                        h h0 = zzbbm0.a(view0, zzbbc0);
                        zzbbc0.zzm();
                        int v2 = h0.b;
                        if(h0.a != 0 || v2 != 0) {
                            zzbbd zzbbd0 = zzbbm0.l;
                            if(v2 != 0 || zzbbc0.k != 0 && !zzbbd0.zzd(zzbbc0)) {
                                zzbbd0.zzb(zzbbc0);
                                return;
                            }
                        }
                    }
                    else {
                        String s1 = (String)view0.getTag(context0.getResources().getIdentifier(((String)zzay.zzc().zzb(zzbhz.zzT)), "id", "com.spears.civilopedia"));
                        if(s1 == null || !s1.equals(s)) {
                            goto label_48;
                        }
                    }
                    return;
                }
                catch(Exception exception0) {
                }
                zzcfi.zzh("Exception in fetchContentOnUIThread", exception0);
                zzt.zzo().zzt(exception0, "ContentFetchTask.fetchContent");
                return;
            }
            case 7: {
                zzm.zza(((zzbwk)object0).a, ((AdOverlayInfoParcel)object1), true);
                return;
            }
            case 8: {
                if(((Boolean)zzay.zzc().zzb(zzbhz.zzbB)).booleanValue() && ((zzcgv)object0).k != null && ((MediaPlayer)object1) != null) {
                    MediaPlayer.TrackInfo[] arr_mediaPlayer$TrackInfo = ((MediaPlayer)object1).getTrackInfo();
                    if(arr_mediaPlayer$TrackInfo != null) {
                        HashMap hashMap0 = new HashMap();
                        while(v < arr_mediaPlayer$TrackInfo.length) {
                            MediaPlayer.TrackInfo mediaPlayer$TrackInfo0 = arr_mediaPlayer$TrackInfo[v];
                            if(mediaPlayer$TrackInfo0 != null) {
                                switch(mediaPlayer$TrackInfo0.getTrackType()) {
                                    case 1: {
                                        MediaFormat mediaFormat0 = mediaPlayer$TrackInfo0.getFormat();
                                        if(mediaFormat0 != null) {
                                            if(mediaFormat0.containsKey("frame-rate")) {
                                                try {
                                                    hashMap0.put("frameRate", String.valueOf(mediaFormat0.getFloat("frame-rate")));
                                                }
                                                catch(ClassCastException unused_ex) {
                                                    hashMap0.put("frameRate", String.valueOf(mediaFormat0.getInteger("frame-rate")));
                                                }
                                            }
                                            if(mediaFormat0.containsKey("bitrate")) {
                                                Integer integer0 = mediaFormat0.getInteger("bitrate");
                                                ((zzcgv)object0).z = integer0;
                                                hashMap0.put("bitRate", String.valueOf(integer0));
                                            }
                                            if(mediaFormat0.containsKey("width") && mediaFormat0.containsKey("height")) {
                                                hashMap0.put("resolution", mediaFormat0.getInteger("width") + "x" + mediaFormat0.getInteger("height"));
                                            }
                                            if(mediaFormat0.containsKey("mime")) {
                                                hashMap0.put("videoMime", mediaFormat0.getString("mime"));
                                            }
                                            if(Build.VERSION.SDK_INT >= 30 && mediaFormat0.containsKey("codecs-string")) {
                                                hashMap0.put("videoCodec", mediaFormat0.getString("codecs-string"));
                                            }
                                        }
                                        break;
                                    }
                                    case 2: {
                                        MediaFormat mediaFormat1 = mediaPlayer$TrackInfo0.getFormat();
                                        if(mediaFormat1 != null) {
                                            if(mediaFormat1.containsKey("mime")) {
                                                hashMap0.put("audioMime", mediaFormat1.getString("mime"));
                                            }
                                            if(Build.VERSION.SDK_INT >= 30 && mediaFormat1.containsKey("codecs-string")) {
                                                hashMap0.put("audioCodec", mediaFormat1.getString("codecs-string"));
                                            }
                                        }
                                    }
                                }
                            }
                            ++v;
                        }
                        if(!hashMap0.isEmpty()) {
                            ((zzcgv)object0).k.zzd("onMetadataEvent", hashMap0);
                        }
                    }
                }
                zzcgw zzcgw0 = ((zzcgv)object0).x;
                if(zzcgw0 != null) {
                    zzcgw0.zzf();
                }
                return;
            }
            case 9: {
                ((WebView)object1).loadUrl(((String)object0));
                return;
            }
            default: {
                zzfvl zzfvl0 = (zzfvl)object1;
                if(zzfvl0 instanceof zzfwd) {
                    Throwable throwable0 = zzfwe.zza(((zzfwd)zzfvl0));
                    if(throwable0 != null) {
                        ((zzfuy)object0).zza(throwable0);
                        return;
                    }
                }
                try {
                    object2 = zzfvc.zzp(zzfvl0);
                }
                catch(ExecutionException executionException0) {
                    ((zzfuy)object0).zza(executionException0.getCause());
                    return;
                }
                catch(RuntimeException | Error runtimeException0) {
                    ((zzfuy)object0).zza(runtimeException0);
                    return;
                }
                ((zzfuy)object0).zzb(object2);
            }
        }
    }

    @Override
    public String toString() {
        if(this.i != 10) {
            return super.toString();
        }
        zzfoo zzfoo0 = zzfop.zza(this);
        zzfoo0.zza(((zzfuy)this.k));
        return zzfoo0.toString();
    }
}

