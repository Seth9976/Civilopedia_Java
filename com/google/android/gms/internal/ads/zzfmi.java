package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.IOUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public final class zzfmi {
    public final zzaqv a;
    public final File b;
    public final File c;
    public final File d;
    public byte[] e;

    public zzfmi(zzaqv zzaqv0, File file0, File file1, File file2) {
        this.a = zzaqv0;
        this.b = file0;
        this.c = file2;
        this.d = file1;
    }

    public final zzaqv zza() {
        return this.a;
    }

    public final File zzb() {
        return this.c;
    }

    public final File zzc() {
        return this.b;
    }

    public final boolean zzd(long v) {
        return this.a.zzc() - System.currentTimeMillis() / 1000L < 3600L;
    }

    public final byte[] zze() {
        byte[] arr_b;
        FileInputStream fileInputStream0;
        if(this.e == null) {
            try {
                fileInputStream0 = null;
                fileInputStream0 = new FileInputStream(this.d);
                arr_b = zzgji.zzy(fileInputStream0).zzE();
            }
            catch(IOException unused_ex) {
                IOUtils.closeQuietly(fileInputStream0);
                arr_b = null;
            }
            finally {
                IOUtils.closeQuietly(fileInputStream0);
            }
            this.e = arr_b;
        }
        return this.e == null ? null : Arrays.copyOf(this.e, this.e.length);
    }
}

