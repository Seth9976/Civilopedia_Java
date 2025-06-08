package com.google.android.gms.ads;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbxv;
import com.google.android.gms.internal.ads.zzcfi;

@KeepForSdk
public final class AdActivity extends Activity {
    @KeepForSdk
    public static final String CLASS_NAME = "com.google.android.gms.ads.AdActivity";
    public zzbxv i;

    @Override  // android.app.Activity
    public final void onActivityResult(int v, int v1, Intent intent0) {
        zzbxv zzbxv0 = this.i;
        if(zzbxv0 != null) {
            try {
                zzbxv0.zzg(v, v1, intent0);
            }
            catch(Exception exception0) {
                zzcfi.zzl("#007 Could not call remote method.", exception0);
            }
        }
        super.onActivityResult(v, v1, intent0);
    }

    @Override  // android.app.Activity
    public final void onBackPressed() {
        try {
            if(this.i == null || this.i.zzE()) {
                goto label_4;
            }
            return;
        }
        catch(RemoteException remoteException0) {
            zzcfi.zzl("#007 Could not call remote method.", remoteException0);
        }
    label_4:
        super.onBackPressed();
        try {
            zzbxv zzbxv0 = this.i;
            if(zzbxv0 != null) {
                zzbxv0.zzh();
            }
        }
        catch(RemoteException remoteException1) {
            zzcfi.zzl("#007 Could not call remote method.", remoteException1);
        }
    }

    @Override  // android.app.Activity
    public final void onConfigurationChanged(Configuration configuration0) {
        super.onConfigurationChanged(configuration0);
        try {
            zzbxv zzbxv0 = this.i;
            if(zzbxv0 != null) {
                zzbxv0.zzj(ObjectWrapper.wrap(configuration0));
            }
        }
        catch(RemoteException remoteException0) {
            zzcfi.zzl("#007 Could not call remote method.", remoteException0);
        }
    }

    @Override  // android.app.Activity
    public final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        zzbxv zzbxv0 = zzaw.zza().zzn(this);
        this.i = zzbxv0;
        if(zzbxv0 != null) {
            try {
                zzbxv0.zzk(bundle0);
            }
            catch(RemoteException remoteException0) {
                zzcfi.zzl("#007 Could not call remote method.", remoteException0);
                this.finish();
            }
            return;
        }
        zzcfi.zzl("#007 Could not call remote method.", null);
        this.finish();
    }

    @Override  // android.app.Activity
    public final void onDestroy() {
        zzbxv zzbxv0 = this.i;
        if(zzbxv0 != null) {
            try {
                zzbxv0.zzl();
            }
            catch(RemoteException remoteException0) {
                zzcfi.zzl("#007 Could not call remote method.", remoteException0);
            }
        }
        super.onDestroy();
    }

    @Override  // android.app.Activity
    public final void onPause() {
        zzbxv zzbxv0 = this.i;
        if(zzbxv0 != null) {
            try {
                zzbxv0.zzn();
            }
            catch(RemoteException remoteException0) {
                zzcfi.zzl("#007 Could not call remote method.", remoteException0);
                this.finish();
            }
        }
        super.onPause();
    }

    @Override  // android.app.Activity
    public final void onRestart() {
        super.onRestart();
        try {
            zzbxv zzbxv0 = this.i;
            if(zzbxv0 != null) {
                zzbxv0.zzo();
            }
        }
        catch(RemoteException remoteException0) {
            zzcfi.zzl("#007 Could not call remote method.", remoteException0);
            this.finish();
        }
    }

    @Override  // android.app.Activity
    public final void onResume() {
        super.onResume();
        try {
            zzbxv zzbxv0 = this.i;
            if(zzbxv0 != null) {
                zzbxv0.zzp();
            }
        }
        catch(RemoteException remoteException0) {
            zzcfi.zzl("#007 Could not call remote method.", remoteException0);
            this.finish();
        }
    }

    @Override  // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle0) {
        zzbxv zzbxv0 = this.i;
        if(zzbxv0 != null) {
            try {
                zzbxv0.zzq(bundle0);
            }
            catch(RemoteException remoteException0) {
                zzcfi.zzl("#007 Could not call remote method.", remoteException0);
                this.finish();
            }
        }
        super.onSaveInstanceState(bundle0);
    }

    @Override  // android.app.Activity
    public final void onStart() {
        super.onStart();
        try {
            zzbxv zzbxv0 = this.i;
            if(zzbxv0 != null) {
                zzbxv0.zzr();
            }
        }
        catch(RemoteException remoteException0) {
            zzcfi.zzl("#007 Could not call remote method.", remoteException0);
            this.finish();
        }
    }

    @Override  // android.app.Activity
    public final void onStop() {
        zzbxv zzbxv0 = this.i;
        if(zzbxv0 != null) {
            try {
                zzbxv0.zzs();
            }
            catch(RemoteException remoteException0) {
                zzcfi.zzl("#007 Could not call remote method.", remoteException0);
                this.finish();
            }
        }
        super.onStop();
    }

    @Override  // android.app.Activity
    public final void onUserLeaveHint() {
        super.onUserLeaveHint();
        try {
            zzbxv zzbxv0 = this.i;
            if(zzbxv0 != null) {
                zzbxv0.zzt();
            }
        }
        catch(RemoteException remoteException0) {
            zzcfi.zzl("#007 Could not call remote method.", remoteException0);
        }
    }

    @Override  // android.app.Activity
    public final void setContentView(int v) {
        super.setContentView(v);
        zzbxv zzbxv0 = this.i;
        if(zzbxv0 != null) {
            try {
                zzbxv0.zzv();
            }
            catch(RemoteException remoteException0) {
                zzcfi.zzl("#007 Could not call remote method.", remoteException0);
            }
        }
    }

    @Override  // android.app.Activity
    public final void setContentView(View view0) {
        super.setContentView(view0);
        zzbxv zzbxv0 = this.i;
        if(zzbxv0 != null) {
            try {
                zzbxv0.zzv();
            }
            catch(RemoteException remoteException0) {
                zzcfi.zzl("#007 Could not call remote method.", remoteException0);
            }
        }
    }

    @Override  // android.app.Activity
    public final void setContentView(View view0, ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        super.setContentView(view0, viewGroup$LayoutParams0);
        zzbxv zzbxv0 = this.i;
        if(zzbxv0 != null) {
            try {
                zzbxv0.zzv();
            }
            catch(RemoteException remoteException0) {
                zzcfi.zzl("#007 Could not call remote method.", remoteException0);
            }
        }
    }
}

