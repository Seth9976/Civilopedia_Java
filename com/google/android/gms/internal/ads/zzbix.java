package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;
import o.a;
import o.b;
import o.e;

@ParametersAreNonnullByDefault
public final class zzbix {
    public e a;
    public b b;
    public zzgrj c;
    public zzbiv d;

    public final e zza() {
        b b0 = this.b;
        e e0 = null;
        if(b0 != null) {
            if(this.a == null) {
                a a0 = new a();  // 初始化器: Landroid/os/Binder;-><init>()V
                a0.attachInterface(a0, "android.support.customtabs.ICustomTabsCallback");
                new Handler(Looper.getMainLooper());
                try {
                    if(((a.a)b0.a).a(a0)) {
                        e0 = new e(a0, b0.b);
                        this.a = e0;
                        return this.a;
                    }
                }
                catch(RemoteException unused_ex) {
                }
                this.a = e0;
                return this.a;
            }
            return this.a;
        }
        this.a = e0;
        return this.a;
    }

    public final void zzb(Activity activity0) {
        if(this.b != null) {
            return;
        }
        String s = zzgri.zza(activity0);
        if(s == null) {
            return;
        }
        zzgrj zzgrj0 = new zzgrj(this, null);
        this.c = zzgrj0;
        zzgrj0.i = activity0.getApplicationContext();
        Intent intent0 = new Intent("android.support.customtabs.action.CustomTabsService");
        if(!TextUtils.isEmpty(s)) {
            intent0.setPackage(s);
        }
        activity0.bindService(intent0, zzgrj0, 33);
    }

    public final void zzc(b b0) {
        this.b = b0;
        b0.getClass();
        try {
            ((a.a)b0.a).b();
        }
        catch(RemoteException unused_ex) {
        }
        zzbiv zzbiv0 = this.d;
        if(zzbiv0 != null) {
            zzbiv0.zza();
        }
    }

    public final void zzd() {
        this.b = null;
        this.a = null;
    }

    public final void zze(zzbiv zzbiv0) {
        this.d = zzbiv0;
    }

    public final void zzf(Activity activity0) {
        zzgrj zzgrj0 = this.c;
        if(zzgrj0 == null) {
            return;
        }
        activity0.unbindService(zzgrj0);
        this.b = null;
        this.a = null;
        this.c = null;
    }

    public static boolean zzg(Context context0) {
        PackageManager packageManager0 = context0.getPackageManager();
        if(packageManager0 == null) {
            return false;
        }
        Intent intent0 = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
        ResolveInfo resolveInfo0 = packageManager0.resolveActivity(intent0, 0);
        List list0 = packageManager0.queryIntentActivities(intent0, 0x10000);
        if(list0 != null && resolveInfo0 != null) {
            for(int v = 0; v < list0.size(); ++v) {
                ResolveInfo resolveInfo1 = (ResolveInfo)list0.get(v);
                if(resolveInfo0.activityInfo.name.equals(resolveInfo1.activityInfo.name)) {
                    return resolveInfo0.activityInfo.packageName.equals(zzgri.zza(context0));
                }
            }
        }
        return false;
    }
}

