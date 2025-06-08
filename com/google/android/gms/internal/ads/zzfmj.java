package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.common.util.Hex;
import java.io.File;

public final class zzfmj {
    public final File a;
    public final File b;
    public final SharedPreferences c;
    public final int d;

    public zzfmj(Context context0, int v) {
        this.c = context0.getSharedPreferences("pcvmspf", 0);
        File file0 = context0.getDir("pccache", 0);
        zzfmk.zza(file0, false);
        this.a = file0;
        File file1 = context0.getDir("tmppccache", 0);
        zzfmk.zza(file1, true);
        this.b = file1;
        this.d = v;
    }

    public final zzaqv a(int v) {
        String s = v == 1 ? this.c.getString("LATMTD" + (this.d - 1), null) : this.c.getString("FBAMTD" + (this.d - 1), null);
        if(TextUtils.isEmpty(s)) {
            return null;
        }
        try {
            zzaqv zzaqv0 = zzaqv.zzh(zzgji.zzv(Hex.stringToBytes(s)));
            File file0 = zzfmk.zzb("", "pcam.jar", this.b());
            if(!file0.exists()) {
                file0 = zzfmk.zzb("", "pcam", this.b());
            }
            File file1 = zzfmk.zzb("", "pcbc", this.b());
            if(file0.exists() && file1.exists()) {
                return zzaqv0;
            }
        }
        catch(zzglc unused_ex) {
        }
        return null;
    }

    public final File b() {
        File file0 = new File(this.a, Integer.toString(this.d - 1));
        if(!file0.exists()) {
            file0.mkdir();
        }
        return file0;
    }

    // 去混淆评级： 中等(123)
    public final boolean zzb(zzaqs zzaqs0, zzfmp zzfmp0) {
        zzaqs0.zzf().zzE();
        zzaqs0.zze().zzE();
        return false;
    }

    public final zzfmi zzd(int v) {
        zzaqv zzaqv0 = this.a(1);
        if(zzaqv0 == null) {
            return null;
        }
        File file0 = zzfmk.zzb("", "pcam.jar", this.b());
        if(!file0.exists()) {
            file0 = zzfmk.zzb("", "pcam", this.b());
        }
        File file1 = zzfmk.zzb("", "pcopt", this.b());
        return new zzfmi(zzaqv0, file0, zzfmk.zzb("", "pcbc", this.b()), file1);
    }
}

