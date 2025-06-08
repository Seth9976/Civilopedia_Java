package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public final class zzej extends zzek {
    public final AssetManager e;
    public Uri f;
    public InputStream g;
    public long h;
    public boolean i;

    public zzej(Context context0) {
        super(false);
        this.e = context0.getAssets();
    }

    @Override  // com.google.android.gms.internal.ads.zzp
    public final int zza(byte[] arr_b, int v, int v1) throws zzei {
        int v3;
        if(v1 == 0) {
            return 0;
        }
        long v2 = this.h;
        if(v2 != 0L) {
            try {
                if(v2 != -1L) {
                    v1 = (int)Math.min(v2, v1);
                }
                v3 = this.g.read(arr_b, v, v1);
            }
            catch(IOException iOException0) {
                throw new zzei(iOException0, 2000);
            }
            if(v3 == -1) {
                return -1;
            }
            long v4 = this.h;
            if(v4 != -1L) {
                this.h = v4 - ((long)v3);
            }
            this.zzg(v3);
            return v3;
        }
        return -1;
    }

    @Override  // com.google.android.gms.internal.ads.zzeq
    public final long zzb(zzev zzev0) throws zzei {
        try {
            this.f = zzev0.zza;
            String s = zzev0.zza.getPath();
            if(s == null) {
                throw null;
            }
            if(s.startsWith("/android_asset/")) {
                s = s.substring(15);
            }
            else if(s.startsWith("/")) {
                s = s.substring(1);
            }
            this.b(zzev0);
            InputStream inputStream0 = this.e.open(s, 1);
            this.g = inputStream0;
            if(inputStream0.skip(zzev0.zzf) < zzev0.zzf) {
                throw new zzei(null, 2008);
            }
            long v = zzev0.zzg;
            if(v == -1L) {
                long v1 = (long)this.g.available();
                this.h = v1;
                if(v1 == 0x7FFFFFFFL) {
                    this.h = -1L;
                }
            }
            else {
                this.h = v;
            }
            goto label_28;
        }
        catch(zzei zzei0) {
        }
        catch(IOException iOException0) {
            throw new zzei(iOException0, (iOException0 instanceof FileNotFoundException ? 2005 : 2000));
        }
        throw zzei0;
    label_28:
        this.i = true;
        this.c(zzev0);
        return this.h;
    }

    @Override  // com.google.android.gms.internal.ads.zzeq
    public final Uri zzc() {
        return this.f;
    }

    @Override  // com.google.android.gms.internal.ads.zzeq
    public final void zzd() throws zzei {
        try {
            this.f = null;
            InputStream inputStream0 = this.g;
            if(inputStream0 != null) {
                inputStream0.close();
            }
        }
        catch(IOException iOException0) {
            throw new zzei(iOException0, 2000);
        }
        finally {
            this.g = null;
            if(this.i) {
                this.i = false;
                this.a();
            }
        }
    }
}

