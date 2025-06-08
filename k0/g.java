package K0;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.IBinder;
import android.os.RemoteException;
import android.os.StrictMode.ThreadPolicy;
import android.os.StrictMode;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.zzaf;
import com.google.android.gms.common.internal.zzag;
import com.google.android.gms.common.zze;
import com.google.android.gms.common.zzo;
import com.google.android.gms.common.zzq;
import com.google.android.gms.common.zzs;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule.LoadingException;
import com.google.android.gms.dynamite.DynamiteModule;

public abstract class g {
    public static final c a;
    public static final c b;
    public static final c c;
    public static final c d;
    public static volatile zzag e;
    public static final Object f;
    public static Context g;

    static {
        g.a = new c(new byte[]{0x30, (byte)0x82, 5, -56, 0x30, (byte)0x82, 3, -80, (byte)0xA0, 3, 2, 1, 2, 2, 20, 16, (byte)0x8A, 101, 8, 0x73, -7, 0x2F, (byte)0x8E, 81, -19}, 0);
        g.b = new c(new byte[]{0x30, (byte)0x82, 6, 4, 0x30, (byte)0x82, 3, -20, (byte)0xA0, 3, 2, 1, 2, 2, 20, 3, -93, -78, -83, -41, (byte)0xE1, 0x72, -54, 107, -20}, 1);
        g.c = new c(new byte[]{0x30, (byte)0x82, 4, 67, 0x30, (byte)0x82, 3, 43, (byte)0xA0, 3, 2, 1, 2, 2, 9, 0, -62, (byte)0xE0, (byte)0x87, 70, 100, 74, 0x30, (byte)0x8D, 0x30}, 2);
        g.d = new c(new byte[]{0x30, (byte)0x82, 4, -88, 0x30, (byte)0x82, 3, (byte)0x90, (byte)0xA0, 3, 2, 1, 2, 2, 9, 0, -43, (byte)0x85, -72, 108, 0x7D, -45, 78, -11, 0x30}, 3);
        g.f = new Object();
    }

    public static void a(Context context0) {
        synchronized(g.class) {
            if(g.g == null) {
                if(context0 != null) {
                    g.g = context0.getApplicationContext();
                    return;
                }
                return;
            }
            Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
        }
    }

    public static i b(String s, d d0, boolean z, boolean z1) {
        try {
            g.d();
        }
        catch(LoadingException dynamiteModule$LoadingException0) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", dynamiteModule$LoadingException0);
            return new i(false, 1, "module init: " + dynamiteModule$LoadingException0.getMessage(), dynamiteModule$LoadingException0);
        }
        Preconditions.checkNotNull(g.g);
        zzs zzs0 = new zzs(s, d0, z, z1);
        try {
            if(g.e.zzh(zzs0, ObjectWrapper.wrap(g.g.getPackageManager()))) {
                return i.e;
            }
        }
        catch(RemoteException remoteException0) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", remoteException0);
            return new i(false, 1, "module call", remoteException0);
        }
        return new h(new zze(z, s, d0));
    }

    public static i c(String s, boolean z, boolean z1) {
        zzq zzq0;
        StrictMode.ThreadPolicy strictMode$ThreadPolicy0 = StrictMode.allowThreadDiskReads();
        try {
            Preconditions.checkNotNull(g.g);
            try {
                g.d();
            }
            catch(LoadingException dynamiteModule$LoadingException0) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", dynamiteModule$LoadingException0);
                return new i(false, 1, "module init: " + dynamiteModule$LoadingException0.getMessage(), dynamiteModule$LoadingException0);
            }
            zzo zzo0 = new zzo(s, z, false, ((IBinder)ObjectWrapper.wrap(g.g)), false, true);
            try {
                zzq0 = z1 ? g.e.zze(zzo0) : g.e.zzf(zzo0);
            }
            catch(RemoteException remoteException0) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", remoteException0);
                return new i(false, 1, "module call", remoteException0);
            }
            PackageManager.NameNotFoundException packageManager$NameNotFoundException0 = null;
            if(zzq0.zzb()) {
                i1 = new i(true, zzq0.zzc(), null, null);
            }
            else {
                String s1 = zzq0.zza();
                if(zzq0.zzd() == 4) {
                    packageManager$NameNotFoundException0 = new PackageManager.NameNotFoundException();
                }
                if(s1 == null) {
                    s1 = "error checking package certificate";
                }
                int v1 = zzq0.zzc();
                zzq0.zzd();
                i1 = new i(false, v1, s1, packageManager$NameNotFoundException0);
            }
            return i1;
        }
        finally {
            StrictMode.setThreadPolicy(strictMode$ThreadPolicy0);
        }
    }

    public static void d() {
        if(g.e != null) {
            return;
        }
        Preconditions.checkNotNull(g.g);
        synchronized(g.f) {
            if(g.e == null) {
                g.e = zzaf.zzb(DynamiteModule.load(g.g, DynamiteModule.PREFER_HIGHEST_OR_LOCAL_VERSION_NO_FORCE_STAGING, "com.google.android.gms.googlecertificates").instantiate("com.google.android.gms.common.GoogleCertificatesImpl"));
            }
        }
    }
}

