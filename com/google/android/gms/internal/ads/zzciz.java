package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.view.Surface;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
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

public final class zzciz extends zzchi implements zzarg, zzasq, zzaww, zzayy, zzbai {
    public final Object A;
    public final ArrayList B;
    public volatile zzcin C;
    public final HashSet D;
    public final Context k;
    public final zzcio l;
    public final zzazx m;
    public final zzatf n;
    public final zzaxw o;
    public final zzchq p;
    public zzarj q;
    public ByteBuffer r;
    public boolean s;
    public final WeakReference t;
    public zzchh u;
    public int v;
    public int w;
    public long x;
    public final String y;
    public final int z;
    public static final int zzc;

    public zzciz(Context context0, zzchq zzchq0, zzchr zzchr0) {
        int v = 0;
        super();
        this.A = new Object();
        this.D = new HashSet();
        this.k = context0;
        this.p = zzchq0;
        this.t = new WeakReference(zzchr0);
        zzcio zzcio0 = new zzcio();
        this.l = zzcio0;
        zzazx zzazx0 = new zzazx(context0, zzavt.zza, 0L, zzs.zza, this, -1);
        this.m = zzazx0;
        zzatf zzatf0 = new zzatf(zzavt.zza, null, true, zzs.zza, this);
        this.n = zzatf0;
        zzaxw zzaxw0 = new zzaxw(null);
        this.o = zzaxw0;
        if(zze.zzc()) {
            zze.zza(("ForkedExoPlayerAdapter initialize " + this.toString()));
        }
        zzchi.i.incrementAndGet();
        zzarj zzarj0 = zzark.zza(new zzary[]{zzatf0, zzazx0}, zzaxw0, zzcio0);
        this.q = zzarj0;
        zzarj0.zze(this);
        this.v = 0;
        this.x = 0L;
        this.w = 0;
        this.B = new ArrayList();
        this.C = null;
        this.y = zzchr0 == null || zzchr0.zzt() == null ? "" : zzchr0.zzt();
        if(zzchr0 != null) {
            v = zzchr0.zzh();
        }
        this.z = v;
        if(((Boolean)zzay.zzc().zzb(zzbhz.zzn)).booleanValue()) {
            this.q.zzg();
        }
        if(zzchr0 != null && zzchr0.zzg() > 0) {
            this.q.zzp(zzchr0.zzg());
        }
        if(zzchr0 != null && zzchr0.zzf() > 0) {
            this.q.zzo(zzchr0.zzf());
        }
        if(((Boolean)zzay.zzc().zzb(zzbhz.zzp)).booleanValue()) {
            this.q.zzi();
            this.q.zzh(((int)(((Integer)zzay.zzc().zzb(zzbhz.zzq)))));
        }
    }

    public final zzawx a(String s, Uri uri0) {
        zzcip zzcip0;
        boolean z = true;
        zzchq zzchq0 = this.p;
        if(this.s && this.r.limit() > 0) {
            byte[] arr_b = new byte[this.r.limit()];
            this.r.get(arr_b);
            zzcip0 = new zzcip(arr_b);
            return ((Boolean)zzay.zzc().zzb(zzbhz.zzm)).booleanValue() ? new zzawx(uri0, zzcip0, zzcix.zza, zzchq0.zzk, zzs.zza, this, null, zzchq0.zzg) : new zzawx(uri0, zzcip0, zzciy.zza, zzchq0.zzk, zzs.zza, this, null, zzchq0.zzg);
        }
        if((!((Boolean)zzay.zzc().zzb(zzbhz.zzbK)).booleanValue() || !((Boolean)zzay.zzc().zzb(zzbhz.zzbB)).booleanValue()) && zzchq0.zzj) {
            z = false;
        }
        if(zzchq0.zzo) {
            zzcip0 = new zzciq(this, s, z);
        }
        else if(zzchq0.zzi > 0) {
            zzcip0 = new zzcir(this, s, z);
        }
        else {
            zzcip0 = new zzcis(this, s, z);
        }
        if(zzchq0.zzj) {
            zzcip0 = new zzcit(this, zzcip0);
        }
        if(this.r != null && this.r.limit() > 0) {
            byte[] arr_b1 = new byte[this.r.limit()];
            this.r.get(arr_b1);
            zzcip zzcip1 = new zzciu(zzcip0, arr_b1);
            return ((Boolean)zzay.zzc().zzb(zzbhz.zzm)).booleanValue() ? new zzawx(uri0, zzcip1, zzcix.zza, zzchq0.zzk, zzs.zza, this, null, zzchq0.zzg) : new zzawx(uri0, zzcip1, zzciy.zza, zzchq0.zzk, zzs.zza, this, null, zzchq0.zzg);
        }
        return ((Boolean)zzay.zzc().zzb(zzbhz.zzm)).booleanValue() ? new zzawx(uri0, zzcip0, zzcix.zza, zzchq0.zzk, zzs.zza, this, null, zzchq0.zzg) : new zzawx(uri0, zzcip0, zzciy.zza, zzchq0.zzk, zzs.zza, this, null, zzchq0.zzg);
    }

    @Override
    public final void finalize() throws Throwable {
        zzchi.i.decrementAndGet();
        if(zze.zzc()) {
            zze.zza(("ForkedExoPlayerAdapter finalize " + this.toString()));
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzchi
    public final long zzA() {
        return this.C == null || !this.C.zzk() ? ((long)this.v) : 0L;
    }

    @Override  // com.google.android.gms.internal.ads.zzchi
    public final long zzB() {
        if(this.C != null && this.C.zzk()) {
            return this.C.zzf();
        }
        synchronized(this.A) {
            while(!this.B.isEmpty()) {
                long v1 = this.x;
                Map map0 = ((zzays)this.B.remove(0)).zze();
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
                this.x = v1 + v2;
            }
            return this.x;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzchi
    public final void zzC(Uri[] arr_uri, String s) {
        this.zzD(arr_uri, s, ByteBuffer.allocate(0), false);
    }

    @Override  // com.google.android.gms.internal.ads.zzchi
    public final void zzD(Uri[] arr_uri, String s, ByteBuffer byteBuffer0, boolean z) {
        zzawx zzawx0;
        if(this.q == null) {
            return;
        }
        this.r = byteBuffer0;
        this.s = z;
        if(arr_uri.length == 1) {
            zzawx0 = this.a(s, arr_uri[0]);
        }
        else {
            zzaxb[] arr_zzaxb = new zzaxb[arr_uri.length];
            for(int v = 0; v < arr_uri.length; ++v) {
                arr_zzaxb[v] = this.a(s, arr_uri[v]);
            }
            zzawx0 = new zzaxf(arr_zzaxb);
        }
        this.q.zzj(zzawx0);
        zzchi.j.incrementAndGet();
    }

    @Override  // com.google.android.gms.internal.ads.zzchi
    public final void zzE() {
        zzarj zzarj0 = this.q;
        if(zzarj0 != null) {
            zzarj0.zzl(this);
            this.q.zzk();
            this.q = null;
            zzchi.j.decrementAndGet();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzchi
    public final void zzF(long v) {
        this.q.zzm(v);
    }

    @Override  // com.google.android.gms.internal.ads.zzchi
    public final void zzG(int v) {
        this.l.zzf(v);
    }

    @Override  // com.google.android.gms.internal.ads.zzchi
    public final void zzH(int v) {
        this.l.zzg(v);
    }

    @Override  // com.google.android.gms.internal.ads.zzchi
    public final void zzI(zzchh zzchh0) {
        this.u = zzchh0;
    }

    @Override  // com.google.android.gms.internal.ads.zzchi
    public final void zzJ(int v) {
        this.l.zzh(v);
    }

    @Override  // com.google.android.gms.internal.ads.zzchi
    public final void zzK(int v) {
        this.l.zzi(v);
    }

    @Override  // com.google.android.gms.internal.ads.zzchi
    public final void zzL(boolean z) {
        this.q.zzq(z);
    }

    @Override  // com.google.android.gms.internal.ads.zzchi
    public final void zzM(boolean z) {
        if(this.q != null) {
            for(int v = 0; v < 2; ++v) {
                this.o.zze(v, !z);
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzchi
    public final void zzN(int v) {
        for(Object object0: this.D) {
            S2 s20 = (S2)((WeakReference)object0).get();
            if(s20 != null) {
                s20.o = v;
                for(Object object1: s20.p) {
                    Socket socket0 = (Socket)object1;
                    if(!socket0.isClosed()) {
                        try {
                            socket0.setReceiveBufferSize(s20.o);
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
        zzarj zzarj0 = this.q;
        if(zzarj0 == null) {
            return;
        }
        zzari zzari0 = new zzari(this.m, 1, surface0);
        zzari[] arr_zzari = new zzari[1];
        if(z) {
            arr_zzari[0] = zzari0;
            zzarj0.zzf(arr_zzari);
            return;
        }
        arr_zzari[0] = zzari0;
        zzarj0.zzn(arr_zzari);
    }

    @Override  // com.google.android.gms.internal.ads.zzchi
    public final void zzP(float f, boolean z) {
        if(this.q == null) {
            return;
        }
        zzari[] arr_zzari = {new zzari(this.n, 2, f)};
        this.q.zzn(arr_zzari);
    }

    @Override  // com.google.android.gms.internal.ads.zzchi
    public final void zzQ() {
        this.q.zzr();
    }

    @Override  // com.google.android.gms.internal.ads.zzchi
    public final boolean zzR() {
        return this.q != null;
    }

    public final void zzW(zzayj zzayj0, int v) {
        this.v += v;
    }

    public final void zzX(zzayj zzayj0, zzayl zzayl0) {
        if(zzayj0 instanceof zzays) {
            synchronized(this.A) {
                this.B.add(((zzays)zzayj0));
            }
            return;
        }
        if(zzayj0 instanceof zzcin) {
            this.C = (zzcin)zzayj0;
            zzchr zzchr0 = (zzchr)this.t.get();
            if(((Boolean)zzay.zzc().zzb(zzbhz.zzbB)).booleanValue() && zzchr0 != null && this.C.zzh()) {
                HashMap hashMap0 = new HashMap();
                hashMap0.put("gcacheHit", String.valueOf(this.C.zzj()));
                hashMap0.put("gcacheDownloaded", String.valueOf(this.C.zzi()));
                zzciw zzciw0 = new zzciw(zzchr0, hashMap0);
                zzs.zza.post(zzciw0);
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzarg
    public final void zza(boolean z) {
    }

    @Override  // com.google.android.gms.internal.ads.zzarg
    public final void zzb(zzarx zzarx0) {
    }

    @Override  // com.google.android.gms.internal.ads.zzarg
    public final void zzc(zzarf zzarf0) {
        zzchh zzchh0 = this.u;
        if(zzchh0 != null) {
            zzchh0.zzk("onPlayerError", zzarf0);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzarg
    public final void zzd(boolean z, int v) {
        zzchh zzchh0 = this.u;
        if(zzchh0 != null) {
            zzchh0.zzm(v);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzarg
    public final void zze() {
    }

    @Override  // com.google.android.gms.internal.ads.zzarg
    public final void zzf(zzase zzase0, Object object0) {
    }

    @Override  // com.google.android.gms.internal.ads.zzarg
    public final void zzg(zzaxq zzaxq0, zzayc zzayc0) {
    }

    @Override  // com.google.android.gms.internal.ads.zzasq
    public final void zzh(zzart zzart0) {
        zzchr zzchr0 = (zzchr)this.t.get();
        if(((Boolean)zzay.zzc().zzb(zzbhz.zzbB)).booleanValue() && zzchr0 != null && zzart0 != null) {
            HashMap hashMap0 = new HashMap();
            hashMap0.put("audioMime", zzart0.zze);
            hashMap0.put("audioSampleMime", zzart0.zzf);
            hashMap0.put("audioCodec", zzart0.zzc);
            zzchr0.zzd("onMetadataEvent", hashMap0);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzaww
    public final void zzi(IOException iOException0) {
        zzchh zzchh0 = this.u;
        if(zzchh0 != null) {
            if(this.p.zzl) {
                zzchh0.zzl("onLoadException", iOException0);
                return;
            }
            zzchh0.zzk("onLoadError", iOException0);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzayy
    public final void zzj(Object object0, int v) {
        this.v += v;
    }

    @Override  // com.google.android.gms.internal.ads.zzayy
    public final void zzk(Object object0, zzayl zzayl0) {
        this.zzX(((zzayj)object0), zzayl0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbai
    public final void zzl(int v, long v1) {
        this.w += v;
    }

    @Override  // com.google.android.gms.internal.ads.zzbai
    public final void zzm(Surface surface0) {
        zzchh zzchh0 = this.u;
        if(zzchh0 != null) {
            zzchh0.zzv();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbai
    public final void zzn(zzart zzart0) {
        zzchr zzchr0 = (zzchr)this.t.get();
        if(((Boolean)zzay.zzc().zzb(zzbhz.zzbB)).booleanValue() && zzchr0 != null && zzart0 != null) {
            HashMap hashMap0 = new HashMap();
            hashMap0.put("frameRate", String.valueOf(zzart0.zzl));
            hashMap0.put("bitRate", String.valueOf(zzart0.zzb));
            hashMap0.put("resolution", zzart0.zzj + "x" + zzart0.zzk);
            hashMap0.put("videoMime", zzart0.zze);
            hashMap0.put("videoSampleMime", zzart0.zzf);
            hashMap0.put("videoCodec", zzart0.zzc);
            zzchr0.zzd("onMetadataEvent", hashMap0);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbai
    public final void zzo(int v, int v1, int v2, float f) {
        zzchh zzchh0 = this.u;
        if(zzchh0 != null) {
            zzchh0.zzC(v, v1);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzchi
    public final int zzr() {
        return this.w;
    }

    @Override  // com.google.android.gms.internal.ads.zzchi
    public final int zzt() {
        return this.q.zza();
    }

    @Override  // com.google.android.gms.internal.ads.zzchi
    public final long zzv() {
        return this.q.zzb();
    }

    @Override  // com.google.android.gms.internal.ads.zzchi
    public final long zzw() {
        return (long)this.v;
    }

    @Override  // com.google.android.gms.internal.ads.zzchi
    public final long zzx() {
        if(this.C == null || !this.C.zzk()) {
            return 0L;
        }
        return this.C.zzj() ? Math.min(this.v, this.C.zze()) : 0L;
    }

    @Override  // com.google.android.gms.internal.ads.zzchi
    public final long zzy() {
        return this.q.zzc();
    }

    @Override  // com.google.android.gms.internal.ads.zzchi
    public final long zzz() {
        return this.q.zzd();
    }
}

