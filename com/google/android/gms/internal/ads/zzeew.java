package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.app.AlertDialog;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.RemoteException;
import com.google.android.gms.ads.impl.R.string;
import com.google.android.gms.ads.internal.overlay.zzl;
import com.google.android.gms.ads.internal.util.zzbr;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.HashMap;
import java.util.Timer;

public final class zzeew implements DialogInterface.OnClickListener {
    public final zzdwh zza;
    public final Activity zzb;
    public final zzfgp zzc;
    public final zzees zzd;
    public final String zze;
    public final zzbr zzf;
    public final String zzg;
    public final Resources zzh;
    public final zzl zzi;

    public zzeew(zzdwh zzdwh0, Activity activity0, zzfgp zzfgp0, zzees zzees0, String s, zzbr zzbr0, String s1, Resources resources0, zzl zzl0) {
        this.zza = zzdwh0;
        this.zzb = activity0;
        this.zzc = zzfgp0;
        this.zzd = zzees0;
        this.zze = s;
        this.zzf = zzbr0;
        this.zzg = s1;
        this.zzh = resources0;
        this.zzi = zzl0;
    }

    @Override  // android.content.DialogInterface$OnClickListener
    public final void onClick(DialogInterface dialogInterface0, int v) {
        zzl zzl1;
        zzdwh zzdwh0 = this.zza;
        Activity activity0 = this.zzb;
        zzfgp zzfgp0 = this.zzc;
        zzees zzees0 = this.zzd;
        String s = this.zze;
        zzbr zzbr0 = this.zzf;
        String s1 = this.zzg;
        Resources resources0 = this.zzh;
        zzl zzl0 = this.zzi;
        if(zzdwh0 == null) {
            zzl1 = zzl0;
        }
        else {
            HashMap hashMap0 = new HashMap();
            hashMap0.put("dialog_action", "confirm");
            zzl1 = zzl0;
            zzefa.zzd(activity0, zzdwh0, zzfgp0, zzees0, s, "dialog_click", hashMap0);
        }
        try {
            if(!zzbr0.zzf(ObjectWrapper.wrap(activity0), s1, s)) {
                goto label_20;
            }
            goto label_23;
        }
        catch(RemoteException remoteException0) {
            zzcfi.zzh("Failed to schedule offline notification poster.", remoteException0);
        }
    label_20:
        zzees0.zzc(s);
        if(zzdwh0 != null) {
            zzefa.zzc(activity0, zzdwh0, zzfgp0, zzees0, s, "offline_notification_worker_not_scheduled");
        }
    label_23:
        AlertDialog.Builder alertDialog$Builder0 = new AlertDialog.Builder(activity0, zzt.zzq().zza());
        alertDialog$Builder0.setMessage((resources0 == null ? "You\'ll get a notification with the link when you\'re back online" : resources0.getString(string.offline_opt_in_confirmation))).setOnCancelListener(new zzeev(zzl1));
        AlertDialog alertDialog0 = alertDialog$Builder0.create();
        alertDialog0.show();
        Timer timer0 = new Timer();
        timer0.schedule(new i5(alertDialog0, timer0, zzl1), 3000L);
    }
}

