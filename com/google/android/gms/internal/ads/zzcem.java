package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import com.google.android.gms.common.wrappers.Wrappers;
import java.util.ArrayList;
import java.util.concurrent.Callable;

public final class zzcem implements Callable {
    public final zzcer zza;

    public zzcem(zzcer zzcer0) {
        this.zza = zzcer0;
    }

    @Override
    public final Object call() {
        PackageInfo packageInfo0;
        Context context0 = zzcaj.zza(this.zza.e);
        ArrayList arrayList0 = new ArrayList();
        try {
            packageInfo0 = Wrappers.packageManager(context0).getPackageInfo(context0.getApplicationInfo().packageName, 0x1000);
            if(packageInfo0.requestedPermissions != null && packageInfo0.requestedPermissionsFlags != null) {
                goto label_4;
            }
        }
        catch(PackageManager.NameNotFoundException unused_ex) {
        }
        return arrayList0;
    label_4:
        for(int v = 0; true; ++v) {
            String[] arr_s = packageInfo0.requestedPermissions;
            if(v >= arr_s.length) {
                break;
            }
            if((packageInfo0.requestedPermissionsFlags[v] & 2) != 0) {
                arrayList0.add(arr_s[v]);
            }
        }
        return arrayList0;
    }
}

