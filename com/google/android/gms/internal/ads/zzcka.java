package com.google.android.gms.internal.ads;

import A.f;
import N.b;
import android.net.Uri;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.util.Clock;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;

public final class zzcka extends zzcju implements zzayy {
    public String l;
    public final zzchq m;
    public boolean n;
    public final b o;
    public final zzcjf p;
    public ByteBuffer q;
    public boolean r;
    public final Object s;
    public final String t;
    public final int u;
    public boolean v;

    public zzcka(zzchr zzchr0, zzchq zzchq0) {
        super(zzchr0);
        this.m = zzchq0;
        this.o = new b(2);
        this.p = new zzcjf();
        this.s = new Object();
        this.t = zzchr0 == null ? "" : zzchr0.zzt();
        this.u = zzchr0 == null ? 0 : zzchr0.zzh();
    }

    public final void b() {
        b b0 = this.o;
        Iterator iterator0 = ((ArrayList)b0.k).iterator();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            Map map0 = ((zzayn)object0).zze();
            if(map0 != null) {
                for(Object object1: map0.entrySet()) {
                    Map.Entry map$Entry0 = (Map.Entry)object1;
                    try {
                        if(!"content-length".equalsIgnoreCase(((String)map$Entry0.getKey()))) {
                            continue;
                        }
                        long v = Long.parseLong(((String)((List)map$Entry0.getValue()).get(0)));
                        b0.j = Math.max(b0.j, v);
                    }
                    catch(RuntimeException unused_ex) {
                    }
                }
                iterator0.remove();
            }
        }
        int v1 = (int)b0.j;
        int v2 = (int)this.p.zza(this.q);
        int v3 = this.q.position();
        int v4 = Math.round(((float)v3) / ((float)v1) * ((float)v2));
        int v5 = zzchi.zzs();
        int v6 = zzchi.zzu();
        this.zzf(this.l, "cache:" + zzcfb.zze(this.l), v3, v1, ((long)v4), ((long)v2), v4 > 0, v5, v6);
    }

    @Override  // com.google.android.gms.internal.ads.zzcju
    public final void zzb() {
        this.n = true;
    }

    public final String zzi() {
        return this.l;
    }

    @Override  // com.google.android.gms.internal.ads.zzayy
    public final void zzj(Object object0, int v) {
    }

    @Override  // com.google.android.gms.internal.ads.zzayy
    public final void zzk(Object object0, zzayl zzayl0) {
        ((ArrayList)this.o.k).add(((zzayn)object0));
    }

    public final ByteBuffer zzl() {
        synchronized(this.s) {
            ByteBuffer byteBuffer0 = this.q;
            if(byteBuffer0 != null && !this.r) {
                byteBuffer0.flip();
                this.r = true;
            }
            this.n = true;
            return this.q;
        }
    }

    public final boolean zzm() {
        return this.v;
    }

    @Override  // com.google.android.gms.internal.ads.zzcju
    public final boolean zzq(String s) {
        String s2;
        zzayn zzayn1;
        long v2;
        this.l = s;
        String s1 = "cache:" + zzcfb.zze(s);
        try {
            zzayn zzayn0 = new zzayn(this.j, null, this, this.m.zzd, this.m.zzf, true, null);
            if(this.m.zzj) {
                zzayn0 = new zzcin(this.i, zzayn0, this.t, this.u, null, null, null);
            }
            zzayn0.zzb(new zzayl(Uri.parse(s), null, 0L, 0L, -1L, null, 0));
            zzchr zzchr0 = (zzchr)this.k.get();
            if(zzchr0 != null) {
                zzchr0.zzv(s1, this);
            }
            Clock clock0 = zzt.zzA();
            long v = clock0.currentTimeMillis();
            long v1 = (long)(((Long)zzay.zzc().zzb(zzbhz.zzw)));
            v2 = (long)(((Long)zzay.zzc().zzb(zzbhz.zzv)));
            this.q = ByteBuffer.allocate(this.m.zzc);
            byte[] arr_b = new byte[0x2000];
            long v3 = v;
            while(true) {
                int v4 = zzayn0.zza(arr_b, 0, Math.min(this.q.remaining(), 0x2000));
                if(v4 == -1) {
                    this.v = true;
                    this.zze(s, s1, ((long)(((int)this.p.zza(this.q)))));
                    return true;
                }
                synchronized(this.s) {
                    if(this.n) {
                        zzayn1 = zzayn0;
                    }
                    else {
                        zzayn1 = zzayn0;
                        this.q.put(arr_b, 0, v4);
                    }
                }
                if(this.q.remaining() <= 0) {
                    this.b();
                    return true;
                }
                if(this.n) {
                    goto label_45;
                }
                long v6 = clock0.currentTimeMillis();
                if(v6 - v3 >= v1) {
                    this.b();
                    v3 = v6;
                }
                if(v6 - v > 1000L * v2) {
                    s2 = "downloadTimeout";
                    break;
                }
                zzayn0 = zzayn1;
            }
        }
        catch(Exception exception0) {
            s2 = "error";
            goto label_52;
        }
        try {
            throw new IOException("Timeout exceeded. Limit: " + v2 + " sec");
        }
        catch(Exception exception0) {
            goto label_52;
        }
        try {
        label_45:
            s2 = "externalAbort";
        }
        catch(Exception exception0) {
            s2 = "error";
            goto label_52;
        }
        try {
            throw new IOException("Precache abort at " + this.q.limit() + " bytes");
        }
        catch(Exception exception0) {
        }
    label_52:
        String s3 = f.i(exception0.getClass().getCanonicalName(), ":", exception0.getMessage());
        zzcfi.zzj(("Failed to preload url " + s + " Exception: " + s3));
        this.zzc(s, s1, s2, s3);
        return false;
    }
}

