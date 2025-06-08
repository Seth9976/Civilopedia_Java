package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.util.Base64;
import java.io.IOException;
import java.net.URLDecoder;

public final class zzeo extends zzek {
    public zzev e;
    public byte[] f;
    public int g;
    public int h;

    public zzeo() {
        super(false);
    }

    @Override  // com.google.android.gms.internal.ads.zzp
    public final int zza(byte[] arr_b, int v, int v1) {
        if(v1 == 0) {
            return 0;
        }
        int v2 = this.h;
        if(v2 == 0) {
            return -1;
        }
        int v3 = Math.min(v1, v2);
        System.arraycopy(this.f, this.g, arr_b, v, v3);
        this.g += v3;
        this.h -= v3;
        this.zzg(v3);
        return v3;
    }

    @Override  // com.google.android.gms.internal.ads.zzeq
    public final long zzb(zzev zzev0) throws IOException {
        this.b(zzev0);
        this.e = zzev0;
        Uri uri0 = zzev0.zza;
        String s = uri0.getScheme();
        zzcw.zze("data".equals(s), "Unsupported scheme: " + s);
        String[] arr_s = zzeg.zzaf(uri0.getSchemeSpecificPart(), ",");
        if(arr_s.length != 2) {
            throw zzbp.zzb(("Unexpected URI format: " + uri0), null);
        }
        String s1 = arr_s[1];
        if(arr_s[0].contains(";base64")) {
            try {
                this.f = Base64.decode(s1, 0);
            }
            catch(IllegalArgumentException illegalArgumentException0) {
                throw zzbp.zzb(("Error while parsing Base64 encoded string: " + s1), illegalArgumentException0);
            }
        }
        else {
            this.f = zzeg.zzZ(URLDecoder.decode(s1, "US-ASCII"));
        }
        long v = zzev0.zzf;
        int v1 = this.f.length;
        if(v <= ((long)v1)) {
            this.g = (int)v;
            int v2 = v1 - ((int)v);
            this.h = v2;
            long v3 = zzev0.zzg;
            if(v3 != -1L) {
                this.h = (int)Math.min(v2, v3);
            }
            this.c(zzev0);
            return zzev0.zzg == -1L ? ((long)this.h) : zzev0.zzg;
        }
        this.f = null;
        throw new zzer(2008);
    }

    @Override  // com.google.android.gms.internal.ads.zzeq
    public final Uri zzc() {
        return this.e == null ? null : this.e.zza;
    }

    @Override  // com.google.android.gms.internal.ads.zzeq
    public final void zzd() {
        if(this.f != null) {
            this.f = null;
            this.a();
        }
        this.e = null;
    }
}

