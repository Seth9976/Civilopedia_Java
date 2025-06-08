package com.google.android.gms.common.wrappers;

import D.b;
import android.annotation.TargetApi;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Binder;
import android.os.Process;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;

@KeepForSdk
public class PackageManagerWrapper {
    public final Context a;

    public PackageManagerWrapper(Context context0) {
        this.a = context0;
    }

    @KeepForSdk
    public int checkCallingOrSelfPermission(String s) {
        return this.a.checkCallingOrSelfPermission(s);
    }

    @KeepForSdk
    @ResultIgnorabilityUnspecified
    public int checkPermission(String s, String s1) {
        return this.a.getPackageManager().checkPermission(s, s1);
    }

    @KeepForSdk
    @ResultIgnorabilityUnspecified
    public ApplicationInfo getApplicationInfo(String s, int v) throws PackageManager.NameNotFoundException {
        return this.a.getPackageManager().getApplicationInfo(s, v);
    }

    @KeepForSdk
    public CharSequence getApplicationLabel(String s) throws PackageManager.NameNotFoundException {
        return this.a.getPackageManager().getApplicationLabel(this.a.getPackageManager().getApplicationInfo(s, 0));
    }

    @KeepForSdk
    @ResultIgnorabilityUnspecified
    public b getApplicationLabelAndIcon(String s) throws PackageManager.NameNotFoundException {
        ApplicationInfo applicationInfo0 = this.a.getPackageManager().getApplicationInfo(s, 0);
        return new b(this.a.getPackageManager().getApplicationLabel(applicationInfo0), this.a.getPackageManager().getApplicationIcon(applicationInfo0));
    }

    @KeepForSdk
    @ResultIgnorabilityUnspecified
    public PackageInfo getPackageInfo(String s, int v) throws PackageManager.NameNotFoundException {
        return this.a.getPackageManager().getPackageInfo(s, v);
    }

    @KeepForSdk
    public boolean isCallerInstantApp() {
        int v = Binder.getCallingUid();
        int v1 = Process.myUid();
        Context context0 = this.a;
        if(v == v1) {
            return InstantApps.isInstantApp(context0);
        }
        String s = context0.getPackageManager().getNameForUid(Binder.getCallingUid());
        return s == null ? false : context0.getPackageManager().isInstantApp(s);
    }

    @TargetApi(19)
    public final boolean zza(int v, String s) {
        try {
            AppOpsManager appOpsManager0 = (AppOpsManager)this.a.getSystemService("appops");
            if(appOpsManager0 == null) {
                throw new NullPointerException("context.getSystemService(Context.APP_OPS_SERVICE) is null");
            }
            appOpsManager0.checkPackage(v, s);
            return true;
        }
        catch(SecurityException unused_ex) {
            return false;
        }
    }
}

