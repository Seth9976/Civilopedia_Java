package com.google.android.gms.internal.ads;

import android.app.PendingIntent;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build.VERSION;
import javax.annotation.Nullable;

public final class zzfoa {
    public static final int zza;
    public static final ClipData zzb;

    static {
        zzfoa.zza = Build.VERSION.SDK_INT <= 22 ? 0 : 0x4000000;
        zzfoa.zzb = ClipData.newIntent("", new Intent());
    }

    public static boolean a(int v, int v1) [...] // Potential decryptor

    @Nullable
    public static PendingIntent zza(Context context0, int v, Intent intent0, int v1, int v2) {
        boolean z = true;
        zzfou.zzf((v1 & 0x5F) == 0, "Cannot set any dangerous parts of intent to be mutable.");
        zzfou.zzf(intent0.getComponent() != null, "Must set component on Intent.");
        if(Build.VERSION.SDK_INT >= 23 && !zzfoa.a(v1, 0x4000000)) {
            z = false;
        }
        zzfou.zzf(z, "Must set PendingIntent.FLAG_IMMUTABLE for SDK >= 23 if no parts of intent are mutable.");
        Intent intent1 = new Intent(intent0);
        if(Build.VERSION.SDK_INT < 23 || !zzfoa.a(v1, 0x4000000)) {
            if(intent1.getPackage() == null) {
                intent1.setPackage(intent1.getComponent().getPackageName());
            }
            if(intent1.getAction() == null) {
                intent1.setAction("");
            }
            if(intent1.getCategories() == null) {
                intent1.addCategory("");
            }
            if(intent1.getData() == null) {
                intent1.setDataAndType(Uri.EMPTY, "*/*");
            }
            if(intent1.getClipData() == null) {
                intent1.setClipData(zzfoa.zzb);
            }
        }
        return PendingIntent.getService(context0, 0, intent1, v1);
    }
}

