package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.view.Surface;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.net.SocketException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;

public final class zzckv extends zzchi implements zzfs, zzkk {
    public final ArrayList A;
    public volatile zzcki B;
    public final HashSet C;
    public final Context k;
    public final zzckg l;
    public final zzve m;
    public final zzchq n;
    public final WeakReference o;
    public final zztf p;
    public zzjy q;
    public ByteBuffer r;
    public boolean s;
    public zzchh t;
    public int u;
    public int v;
    public long w;
    public final String x;
    public final int y;
    public final Object z;
    public static final int zzc;

    public zzckv(Context context0, zzchq zzchq0, zzchr zzchr0) {
        zzckk zzckk0;
        zzckm zzckm0;
        this.z = new Object();
        this.C = new HashSet();
        this.k = context0;
        this.n = zzchq0;
        this.o = new WeakReference(zzchr0);
        zzckg zzckg0 = new zzckg();
        this.l = zzckg0;
        zzve zzve0 = new zzve(context0);
        this.m = zzve0;
        if(zze.zzc()) {
            zze.zza(("OfficialSimpleExoPlayerAdapter initialize " + this.toString()));
        }
        zzchi.i.incrementAndGet();
        zzjx zzjx0 = new zzjx(context0, new zzckr(this), null);
        zzjx0.zzb(zzve0);
        zzjx0.zza(zzckg0);
        this.q = zzjx0.zzc();
        if(!((Boolean)zzay.zzc().zzb(zzbhz.zzbI)).booleanValue()) {
            zzix.zza(this.q);
        }
        this.q.zzx(this);
        boolean z = false;
        this.u = 0;
        this.w = 0L;
        this.v = 0;
        this.A = new ArrayList();
        this.B = null;
        this.x = zzchr0 == null || zzchr0.zzt() == null ? "" : zzchr0.zzt();
        this.y = zzchr0 == null ? 0 : zzchr0.zzh();
        String s = zzt.zzp().zzc(context0, zzchr0.zzp().zza);
        if(!this.s || this.r.limit() <= 0) {
            if(((Boolean)zzay.zzc().zzb(zzbhz.zzbK)).booleanValue() && ((Boolean)zzay.zzc().zzb(zzbhz.zzbB)).booleanValue()) {
                z = true;
            }
            else if(!zzchq0.zzj) {
                z = true;
            }
            if(zzchq0.zzo) {
                zzckm0 = new zzckm(this, s, z);
            }
            else if(zzchq0.zzi > 0) {
                zzckm0 = new zzckn(this, s, z);
            }
            else {
                zzckm0 = new zzcko(this, s, z);
            }
            zzckk0 = zzchq0.zzj ? new zzckp(this, zzckm0) : zzckm0;
            if(this.r != null && this.r.limit() > 0) {
                byte[] arr_b1 = new byte[this.r.limit()];
                this.r.get(arr_b1);
                zzckk0 = new zzckq(zzckk0, arr_b1);
            }
        }
        else {
            byte[] arr_b = new byte[this.r.limit()];
            this.r.get(arr_b);
            zzckk0 = new zzckk(arr_b);
        }
        zzckt zzckt0 = ((Boolean)zzay.zzc().zzb(zzbhz.zzm)).booleanValue() ? zzckt.zza : zzcku.zza;
        this.p = new zztf(zzckk0, new zzte(zzckt0), null);
    }

    @Override
    public final void finalize() {
        zzchi.i.decrementAndGet();
        if(zze.zzc()) {
            zze.zza(("OfficialSimpleExoPlayerAdapter finalize " + this.toString()));
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzchi
    public final long zzA() {
        return this.B == null || !this.B.zzq() ? ((long)this.u) : 0L;
    }

    @Override  // com.google.android.gms.internal.ads.zzchi
    public final long zzB() {
        if(this.B != null && this.B.zzq()) {
            return this.B.zzl();
        }
        synchronized(this.z) {
            while(!this.A.isEmpty()) {
                long v1 = this.w;
                Map map0 = ((zzfn)this.A.remove(0)).zze();
                long v2 = 0L;
                if(map0 != null) {
                    for(Object object1: map0.entrySet()) {
                        Map.Entry map$Entry0 = (Map.Entry)object1;
                        if(map$Entry0 != null) {
                            try {
                                if(map$Entry0.getKey() != null && zzfoc.zzc("content-length", ((CharSequence)map$Entry0.getKey())) && map$Entry0.getValue() != null && ((List)map$Entry0.getValue()).get(0) != null) {
                                    v2 = Long.parseLong(((String)((List)map$Entry0.getValue()).get(0)));
                                    break;
                                }
                            }
                            catch(NumberFormatException unused_ex) {
                                continue;
                            }
                            if(false) {
                                break;
                            }
                        }
                    }
                }
                this.w = v1 + v2;
            }
            return this.w;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzchi
    public final void zzC(Uri[] arr_uri, String s) {
        this.zzD(arr_uri, s, ByteBuffer.allocate(0), false);
    }

    @Override  // com.google.android.gms.internal.ads.zzchi
    public final void zzD(Uri[] arr_uri, String s, ByteBuffer byteBuffer0, boolean z) {
        zzth zzth0;
        if(this.q == null) {
            return;
        }
        this.r = byteBuffer0;
        this.s = z;
        zztf zztf0 = this.p;
        zzchq zzchq0 = this.n;
        if(arr_uri.length == 1) {
            Uri uri0 = arr_uri[0];
            zzah zzah0 = new zzah();
            zzah0.zzb(uri0);
            zzbb zzbb0 = zzah0.zzc();
            zztf0.zza(zzchq0.zzg);
            zzth0 = zztf0.zzb(zzbb0);
        }
        else {
            zzsc[] arr_zzsc = new zzsc[arr_uri.length];
            for(int v = 0; v < arr_uri.length; ++v) {
                Uri uri1 = arr_uri[v];
                zzah zzah1 = new zzah();
                zzah1.zzb(uri1);
                zzbb zzbb1 = zzah1.zzc();
                zztf0.zza(zzchq0.zzg);
                arr_zzsc[v] = zztf0.zzb(zzbb1);
            }
            zzth0 = new zzss(false, false, arr_zzsc);
        }
        this.q.zzB(zzth0);
        this.q.zzy();
        zzchi.j.incrementAndGet();
    }

    @Override  // com.google.android.gms.internal.ads.zzchi
    public final void zzE() {
        zzjy zzjy0 = this.q;
        if(zzjy0 != null) {
            zzjy0.zzA(this);
            this.q.zzz();
            this.q = null;
            zzchi.j.decrementAndGet();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzchi
    public final void zzF(long v) {
        this.q.zzp(this.q.zzf(), v);
    }

    @Override  // com.google.android.gms.internal.ads.zzchi
    public final void zzG(int v) {
        this.l.zzk(v);
    }

    @Override  // com.google.android.gms.internal.ads.zzchi
    public final void zzH(int v) {
        this.l.zzl(v);
    }

    @Override  // com.google.android.gms.internal.ads.zzchi
    public final void zzI(zzchh zzchh0) {
        this.t = zzchh0;
    }

    @Override  // com.google.android.gms.internal.ads.zzchi
    public final void zzJ(int v) {
        this.l.zzm(v);
    }

    @Override  // com.google.android.gms.internal.ads.zzchi
    public final void zzK(int v) {
        this.l.zzn(v);
    }

    @Override  // com.google.android.gms.internal.ads.zzchi
    public final void zzL(boolean z) {
        this.q.zzC(z);
    }

    @Override  // com.google.android.gms.internal.ads.zzchi
    public final void zzM(boolean z) {
        if(this.q != null) {
            for(int v = 0; true; ++v) {
                this.q.zzt();
                if(v >= 2) {
                    break;
                }
                zzuv zzuv0 = this.m.zzc().zzd();
                zzuv0.zzo(v, !z);
                this.m.zzg(zzuv0);
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzchi
    public final void zzN(int v) {
        for(Object object0: this.C) {
            e3 e30 = (e3)((WeakReference)object0).get();
            if(e30 != null) {
                e30.s = v;
                for(Object object1: e30.t) {
                    Socket socket0 = (Socket)object1;
                    if(!socket0.isClosed()) {
                        try {
                            socket0.setReceiveBufferSize(e30.s);
                        }
                        catch(SocketException socketException0) {
                            zzcfi.zzk("Failed to update receive buffer size.", socketException0);
                        }
                    }
                }
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzchi
    public final void zzO(Surface surface0, boolean z) {
        zzjy zzjy0 = this.q;
        if(zzjy0 == null) {
            return;
        }
        zzjy0.zzE(surface0);
    }

    @Override  // com.google.android.gms.internal.ads.zzchi
    public final void zzP(float f, boolean z) {
        zzjy zzjy0 = this.q;
        if(zzjy0 == null) {
            return;
        }
        zzjy0.zzF(f);
    }

    @Override  // com.google.android.gms.internal.ads.zzchi
    public final void zzQ() {
        this.q.zzG();
    }

    @Override  // com.google.android.gms.internal.ads.zzchi
    public final boolean zzR() {
        return this.q != null;
    }

    @Override  // com.google.android.gms.internal.ads.zzfs
    public final void zza(zzeq zzeq0, zzev zzev0, boolean z, int v) {
        this.u += v;
    }

    @Override  // com.google.android.gms.internal.ads.zzfs
    public final void zzb(zzeq zzeq0, zzev zzev0, boolean z) {
    }

    @Override  // com.google.android.gms.internal.ads.zzfs
    public final void zzc(zzeq zzeq0, zzev zzev0, boolean z) {
    }

    @Override  // com.google.android.gms.internal.ads.zzfs
    public final void zzd(zzeq zzeq0, zzev zzev0, boolean z) {
        if(zzeq0 instanceof zzfn) {
            synchronized(this.z) {
                this.A.add(((zzfn)zzeq0));
            }
            return;
        }
        if(zzeq0 instanceof zzcki) {
            this.B = (zzcki)zzeq0;
            zzchr zzchr0 = (zzchr)this.o.get();
            if(((Boolean)zzay.zzc().zzb(zzbhz.zzbB)).booleanValue() && zzchr0 != null && this.B.zzn()) {
                HashMap hashMap0 = new HashMap();
                hashMap0.put("gcacheHit", String.valueOf(this.B.zzp()));
                hashMap0.put("gcacheDownloaded", String.valueOf(this.B.zzo()));
                zzcks zzcks0 = new zzcks(zzchr0, hashMap0);
                zzs.zza.post(zzcks0);
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzkk
    public final void zze(zzki zzki0, zzad zzad0, zzgm zzgm0) {
        zzchr zzchr0 = (zzchr)this.o.get();
        if(((Boolean)zzay.zzc().zzb(zzbhz.zzbB)).booleanValue() && zzchr0 != null && zzad0 != null) {
            HashMap hashMap0 = new HashMap();
            hashMap0.put("audioMime", zzad0.zzl);
            hashMap0.put("audioSampleMime", zzad0.zzm);
            hashMap0.put("audioCodec", zzad0.zzj);
            zzchr0.zzd("onMetadataEvent", hashMap0);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzkk
    public final void zzf(zzki zzki0, int v, long v1, long v2) {
    }

    @Override  // com.google.android.gms.internal.ads.zzkk
    public final void zzg(zzki zzki0, zzrw zzrw0) {
    }

    @Override  // com.google.android.gms.internal.ads.zzkk
    public final void zzh(zzki zzki0, int v, long v1) {
        this.v += v;
    }

    @Override  // com.google.android.gms.internal.ads.zzkk
    public final void zzi(zzcb zzcb0, zzkj zzkj0) {
    }

    @Override  // com.google.android.gms.internal.ads.zzkk
    public final void zzj(zzki zzki0, zzrr zzrr0, zzrw zzrw0, IOException iOException0, boolean z) {
        zzchh zzchh0 = this.t;
        if(zzchh0 != null) {
            if(this.n.zzl) {
                zzchh0.zzl("onLoadException", iOException0);
                return;
            }
            zzchh0.zzk("onLoadError", iOException0);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzkk
    public final void zzk(zzki zzki0, int v) {
        zzchh zzchh0 = this.t;
        if(zzchh0 != null) {
            zzchh0.zzm(v);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzkk
    public final void zzl(zzki zzki0, zzbr zzbr0) {
        zzchh zzchh0 = this.t;
        if(zzchh0 != null) {
            zzchh0.zzk("onPlayerError", zzbr0);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzkk
    public final void zzm(zzki zzki0, zzca zzca0, zzca zzca1, int v) {
    }

    @Override  // com.google.android.gms.internal.ads.zzkk
    public final void zzn(zzki zzki0, Object object0, long v) {
        zzchh zzchh0 = this.t;
        if(zzchh0 != null) {
            zzchh0.zzv();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzkk
    public final void zzo(zzki zzki0, zzgl zzgl0) {
    }

    @Override  // com.google.android.gms.internal.ads.zzkk
    public final void zzp(zzki zzki0, zzad zzad0, zzgm zzgm0) {
        zzchr zzchr0 = (zzchr)this.o.get();
        if(((Boolean)zzay.zzc().zzb(zzbhz.zzbB)).booleanValue() && zzchr0 != null && zzad0 != null) {
            HashMap hashMap0 = new HashMap();
            hashMap0.put("frameRate", String.valueOf(zzad0.zzt));
            hashMap0.put("bitRate", String.valueOf(zzad0.zzi));
            hashMap0.put("resolution", zzad0.zzr + "x" + zzad0.zzs);
            hashMap0.put("videoMime", zzad0.zzl);
            hashMap0.put("videoSampleMime", zzad0.zzm);
            hashMap0.put("videoCodec", zzad0.zzj);
            zzchr0.zzd("onMetadataEvent", hashMap0);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzkk
    public final void zzq(zzki zzki0, zzcv zzcv0) {
        zzchh zzchh0 = this.t;
        if(zzchh0 != null) {
            zzchh0.zzC(zzcv0.zzc, zzcv0.zzd);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzchi
    public final int zzr() {
        return this.v;
    }

    @Override  // com.google.android.gms.internal.ads.zzchi
    public final int zzt() {
        return this.q.zzh();
    }

    @Override  // com.google.android.gms.internal.ads.zzchi
    public final long zzv() {
        return this.q.zzu();
    }

    @Override  // com.google.android.gms.internal.ads.zzchi
    public final long zzw() {
        return (long)this.u;
    }

    @Override  // com.google.android.gms.internal.ads.zzchi
    public final long zzx() {
        if(this.B == null || !this.B.zzq()) {
            return 0L;
        }
        return this.B.zzp() ? Math.min(this.u, this.B.zzk()) : 0L;
    }

    @Override  // com.google.android.gms.internal.ads.zzchi
    public final long zzy() {
        return this.q.zzl();
    }

    @Override  // com.google.android.gms.internal.ads.zzchi
    public final long zzz() {
        return this.q.zzv();
    }
}

