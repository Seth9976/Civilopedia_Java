package D0;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzau;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzca;
import com.google.android.gms.ads.internal.client.zzcc;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.internal.ads.zzbhz;
import com.google.android.gms.internal.ads.zzbjk;
import com.google.android.gms.internal.ads.zzbjx;
import com.google.android.gms.internal.ads.zzcfb;
import com.google.android.gms.internal.ads.zzcfi;

public abstract class n {
    public static final zzcc a;

    static {
        zzcc zzcc0 = null;
        try {
            Object object0 = zzau.class.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi").getDeclaredConstructor(null).newInstance(null);
            if(!(object0 instanceof IBinder)) {
                zzcfi.zzj("ClientApi class is not an instance of IBinder.");
            }
            else if(((IBinder)object0) != null) {
                IInterface iInterface0 = ((IBinder)object0).queryLocalInterface("com.google.android.gms.ads.internal.client.IClientApi");
                zzcc zzcc1 = iInterface0 instanceof zzcc ? ((zzcc)iInterface0) : new zzca(((IBinder)object0), "com.google.android.gms.ads.internal.client.IClientApi");  // 初始化器: Lcom/google/android/gms/internal/ads/zzaqw;-><init>(Landroid/os/IBinder;Ljava/lang/String;)V
                zzcc0 = zzcc1;
            }
        }
        catch(Exception unused_ex) {
            zzcfi.zzj("Failed to instantiate ClientApi class.");
        }
        n.a = zzcc0;
    }

    public abstract Object a();

    public abstract Object b(zzcc arg1);

    public abstract Object c();

    public final Object d(Context context0, boolean z) {
        Object object1;
        Object object2;
        boolean z1;
        if(!z && !zzcfb.zzr(context0, 12451000)) {
            zzcfi.zze("Google Play Services is not available.");
            z = true;
        }
        int v = 0;
        int v1 = DynamiteModule.getLocalVersion(context0, "com.google.android.gms.ads.dynamite") <= DynamiteModule.getRemoteVersion(context0, "com.google.android.gms.ads.dynamite") ? 1 : 0;
        zzbhz.zzc(context0);
        if(((Boolean)zzbjk.zza.zze()).booleanValue()) {
            z1 = false;
        }
        else if(((Boolean)zzbjk.zzb.zze()).booleanValue()) {
            z1 = true;
            v = 1;
        }
        else {
            v = z | v1 ^ 1;
            z1 = false;
        }
        zzcc zzcc0 = n.a;
        Object object0 = null;
        if(v == 0) {
            try {
                object2 = this.c();
            }
            catch(RemoteException remoteException2) {
                zzcfi.zzk("Cannot invoke remote loader.", remoteException2);
                object2 = null;
            }
            if(object2 == null && zzaw.zze().nextInt(((Long)zzbjx.zza.zze()).intValue()) == 0) {
                Bundle bundle0 = new Bundle();
                bundle0.putString("action", "dynamite_load");
                bundle0.putInt("is_missing", 1);
                zzaw.zzb().zzm(context0, zzaw.zzc().zza, "gmob-apps", bundle0, true);
            }
            if(object2 == null) {
                if(zzcc0 != null) {
                    try {
                        object0 = this.b(zzcc0);
                        return object0 == null ? this.a() : object0;
                    }
                    catch(RemoteException remoteException3) {
                        zzcfi.zzk("Cannot invoke local loader using ClientApi class.", remoteException3);
                        return object0 == null ? this.a() : object0;
                    }
                }
                zzcfi.zzj("ClientApi class cannot be loaded.");
                return this.a();
            }
            object1 = object2;
        }
        else {
            if(zzcc0 == null) {
                zzcfi.zzj("ClientApi class cannot be loaded.");
                object1 = null;
            }
            else {
                try {
                    object1 = this.b(zzcc0);
                }
                catch(RemoteException remoteException0) {
                    zzcfi.zzk("Cannot invoke local loader using ClientApi class.", remoteException0);
                    object1 = null;
                }
            }
            if(object1 == null && !z1) {
                try {
                    object0 = this.c();
                    return object0 == null ? this.a() : object0;
                }
                catch(RemoteException remoteException1) {
                    zzcfi.zzk("Cannot invoke remote loader.", remoteException1);
                    return object0 == null ? this.a() : object0;
                }
            }
        }
        return object1 == null ? this.a() : object1;
    }
}

