package com.google.android.gms.common;

import K0.d;
import K0.e;
import K0.f;
import K0.g;
import K0.i;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.Signature;
import android.os.RemoteException;
import android.os.StrictMode.ThreadPolicy;
import android.os.StrictMode;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.dynamite.DynamiteModule.LoadingException;
import com.google.errorprone.annotations.CheckReturnValue;
import com.google.errorprone.annotations.RestrictedInheritance;
import javax.annotation.Nullable;

@KeepForSdk
@ShowFirstParty
@CheckReturnValue
@RestrictedInheritance(allowedOnPath = ".*java.*/com/google/android/gms/common/testing/.*", explanation = "Sub classing of GMS Core\'s APIs are restricted to testing fakes.", link = "go/gmscore-restrictedinheritance")
public class GoogleSignatureVerifier {
    public final Context a;
    public volatile String b;
    public static GoogleSignatureVerifier c;

    public GoogleSignatureVerifier(Context context0) {
        this.a = context0.getApplicationContext();
    }

    public static final d a(PackageInfo packageInfo0, d[] arr_d) {
        Signature[] arr_signature = packageInfo0.signatures;
        if(arr_signature != null) {
            if(arr_signature.length != 1) {
                Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
                return null;
            }
            e e0 = new e(packageInfo0.signatures[0].toByteArray());
            for(int v = 0; v < arr_d.length; ++v) {
                if(arr_d[v].equals(e0)) {
                    return arr_d[v];
                }
            }
        }
        return null;
    }

    public final i b(String s) {
        i i2;
        i i1;
        PackageInfo packageInfo0;
        i i0;
        boolean z;
        if(s == null) {
            return new i(false, 1, "null pkg", null);
        }
        if(!s.equals(this.b)) {
            StrictMode.ThreadPolicy strictMode$ThreadPolicy0 = StrictMode.allowThreadDiskReads();
            try {
                g.d();
                z = g.e.zzi();
            }
            catch(LoadingException | RemoteException dynamiteModule$LoadingException0) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", dynamiteModule$LoadingException0);
                z = false;
            }
            finally {
                StrictMode.setThreadPolicy(strictMode$ThreadPolicy0);
            }
            if(z) {
                i0 = g.c(s, GooglePlayServicesUtilLight.honorsDebugCertificates(this.a), true);
            }
            else {
                try {
                    packageInfo0 = this.a.getPackageManager().getPackageInfo(s, 0x40);
                }
                catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException0) {
                    return new i(false, 1, "no pkg " + s, packageManager$NameNotFoundException0);
                }
                boolean z1 = GooglePlayServicesUtilLight.honorsDebugCertificates(this.a);
                if(packageInfo0 == null) {
                    i0 = new i(false, 1, "null pkg", null);
                }
                else if(packageInfo0.signatures == null || packageInfo0.signatures.length != 1) {
                    i0 = new i(false, 1, "single cert required", null);
                }
                else {
                    e e0 = new e(packageInfo0.signatures[0].toByteArray());
                    String s1 = packageInfo0.packageName;
                    StrictMode.ThreadPolicy strictMode$ThreadPolicy1 = StrictMode.allowThreadDiskReads();
                    try {
                        i1 = g.b(s1, e0, z1, false);
                    }
                    finally {
                        StrictMode.setThreadPolicy(strictMode$ThreadPolicy1);
                    }
                    if(!i1.a || (packageInfo0.applicationInfo == null || (packageInfo0.applicationInfo.flags & 2) == 0)) {
                        i0 = i1;
                    }
                    else {
                        StrictMode.ThreadPolicy strictMode$ThreadPolicy2 = StrictMode.allowThreadDiskReads();
                        try {
                            i2 = g.b(s1, e0, false, true);
                        }
                        finally {
                            StrictMode.setThreadPolicy(strictMode$ThreadPolicy2);
                        }
                        i0 = i2.a ? new i(false, 1, "debuggable release cert app rejected", null) : i1;
                    }
                }
            }
            if(i0.a) {
                this.b = s;
            }
            return i0;
        }
        return i.e;
    }

    @KeepForSdk
    public static GoogleSignatureVerifier getInstance(Context context0) {
        Preconditions.checkNotNull(context0);
        synchronized(GoogleSignatureVerifier.class) {
            if(GoogleSignatureVerifier.c == null) {
                g.a(context0);
                GoogleSignatureVerifier.c = new GoogleSignatureVerifier(context0);
            }
            return GoogleSignatureVerifier.c;
        }
    }

    @KeepForSdk
    public boolean isGooglePublicSignedPackage(PackageInfo packageInfo0) {
        if(packageInfo0 == null) {
            return false;
        }
        if(GoogleSignatureVerifier.zzb(packageInfo0, false)) {
            return true;
        }
        if(GoogleSignatureVerifier.zzb(packageInfo0, true)) {
            if(GooglePlayServicesUtilLight.honorsDebugCertificates(this.a)) {
                return true;
            }
            Log.w("GoogleSignatureVerifier", "Test-keys aren\'t accepted on this build.");
        }
        return false;
    }

    @KeepForSdk
    @ShowFirstParty
    public boolean isPackageGoogleSigned(@Nullable String s) {
        i i0 = this.b(s);
        i0.b();
        return i0.a;
    }

    @KeepForSdk
    @ShowFirstParty
    public boolean isUidGoogleSigned(int v) {
        String[] arr_s = this.a.getPackageManager().getPackagesForUid(v);
        i i0 = null;
        if(arr_s == null || arr_s.length == 0) {
            i0 = new i(false, 1, "no pkgs", null);
        }
        else {
            for(int v1 = 0; v1 < arr_s.length; ++v1) {
                i0 = this.b(arr_s[v1]);
                if(i0.a) {
                    i0.b();
                    return i0.a;
                }
            }
            Preconditions.checkNotNull(i0);
        }
        i0.b();
        return i0.a;
    }

    public static final boolean zzb(PackageInfo packageInfo0, boolean z) {
        if(z) {
            if(packageInfo0 == null) {
                return false;
            }
            if("com.android.vending".equals(packageInfo0.packageName) || "com.google.android.gms".equals(packageInfo0.packageName)) {
                if(packageInfo0.applicationInfo != null && (packageInfo0.applicationInfo.flags & 0x81) != 0) {
                    return packageInfo0 == null || packageInfo0.signatures == null ? false : GoogleSignatureVerifier.a(packageInfo0, f.a) != null;
                }
                return packageInfo0 == null || packageInfo0.signatures == null ? false : GoogleSignatureVerifier.a(packageInfo0, new d[]{f.a[0]}) != null;
            }
        }
        return packageInfo0 == null || packageInfo0.signatures == null ? false : (z ? GoogleSignatureVerifier.a(packageInfo0, f.a) : GoogleSignatureVerifier.a(packageInfo0, new d[]{f.a[0]})) != null;
    }
}

