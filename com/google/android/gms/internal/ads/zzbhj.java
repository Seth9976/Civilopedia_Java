package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.ads.internal.util.zzcb;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.wrappers.Wrappers;

public final class zzbhj {
    public final Context a;

    public zzbhj(Context context0) {
        Preconditions.checkNotNull(context0, "Context can not be null");
        this.a = context0;
    }

    public final boolean zza(Intent intent0) {
        Preconditions.checkNotNull(intent0, "Intent can not be null");
        return !this.a.getPackageManager().queryIntentActivities(intent0, 0).isEmpty();
    }

    public final boolean zzb() {
        return this.zza(new Intent("android.intent.action.INSERT").setType("vnd.android.cursor.dir/event"));
    }

    public final boolean zzc() {
        return ((Boolean)zzcb.zza(this.a, zzbhi.zza)).booleanValue() && Wrappers.packageManager(this.a).checkCallingOrSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0;
    }
}

