package com.google.android.gms.common;

import B.c;
import K0.g;
import K0.i;
import M1.f;
import android.content.Context;
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

@KeepForSdk
@ShowFirstParty
@CheckReturnValue
@RestrictedInheritance(allowedOnPath = ".*javatests.*/com/google/android/gms/common/.*", explanation = "Sub classing of GMS Core\'s APIs are restricted to testing fakes.", link = "go/gmscore-restrictedinheritance")
public class PackageSignatureVerifier {
    public static f a;
    public static volatile c b;

    public static void a(Context context0) {
        synchronized(PackageSignatureVerifier.class) {
            if(PackageSignatureVerifier.a == null) {
                f f0 = new f(4);
                g.a(context0);
                PackageSignatureVerifier.a = f0;
            }
        }
    }

    @KeepForSdk
    @ShowFirstParty
    public PackageVerificationResult queryPackageSignatureVerified(Context context0, String s) {
        boolean z1;
        boolean z = GooglePlayServicesUtilLight.honorsDebugCertificates(context0);
        PackageSignatureVerifier.a(context0);
        StrictMode.ThreadPolicy strictMode$ThreadPolicy0 = StrictMode.allowThreadDiskReads();
        try {
            g.d();
            z1 = g.e.zzg();
        }
        catch(LoadingException | RemoteException dynamiteModule$LoadingException0) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", dynamiteModule$LoadingException0);
            z1 = false;
        }
        finally {
            StrictMode.setThreadPolicy(strictMode$ThreadPolicy0);
        }
        if(!z1) {
            throw new zzae();
        }
        String s1 = s + (z ? "-1" : "-0");
        if(PackageSignatureVerifier.b != null && ((String)PackageSignatureVerifier.b.j).equals(s1)) {
            return (PackageVerificationResult)PackageSignatureVerifier.b.k;
        }
        PackageSignatureVerifier.a(context0);
        i i0 = g.c(s, z, false);
        if(i0.a) {
            PackageSignatureVerifier.b = new c(7, s1, PackageVerificationResult.zzd(s, i0.d));
            return (PackageVerificationResult)PackageSignatureVerifier.b.k;
        }
        Preconditions.checkNotNull(i0.b);
        return PackageVerificationResult.zza(s, i0.b, i0.c);
    }

    @KeepForSdk
    @ShowFirstParty
    public PackageVerificationResult queryPackageSignatureVerifiedWithRetry(Context context0, String s) {
        try {
            PackageVerificationResult packageVerificationResult0 = this.queryPackageSignatureVerified(context0, s);
            packageVerificationResult0.zzb();
            return packageVerificationResult0;
        }
        catch(SecurityException securityException0) {
            PackageVerificationResult packageVerificationResult1 = this.queryPackageSignatureVerified(context0, s);
            if(packageVerificationResult1.zzc()) {
                Log.e("PkgSignatureVerifier", "Got flaky result during package signature verification", securityException0);
                return packageVerificationResult1;
            }
            return packageVerificationResult1;
        }
    }
}

