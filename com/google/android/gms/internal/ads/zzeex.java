package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface;
import com.google.android.gms.ads.internal.overlay.zzl;
import java.util.HashMap;

public final class zzeex implements DialogInterface.OnClickListener {
    public final zzees zza;
    public final String zzb;
    public final zzdwh zzc;
    public final Activity zzd;
    public final zzfgp zze;
    public final zzl zzf;

    public zzeex(zzees zzees0, String s, zzdwh zzdwh0, Activity activity0, zzfgp zzfgp0, zzl zzl0) {
        this.zza = zzees0;
        this.zzb = s;
        this.zzc = zzdwh0;
        this.zzd = activity0;
        this.zze = zzfgp0;
        this.zzf = zzl0;
    }

    @Override  // android.content.DialogInterface$OnClickListener
    public final void onClick(DialogInterface dialogInterface0, int v) {
        zzees zzees0 = this.zza;
        String s = this.zzb;
        zzdwh zzdwh0 = this.zzc;
        Activity activity0 = this.zzd;
        zzfgp zzfgp0 = this.zze;
        zzl zzl0 = this.zzf;
        zzees0.zzc(s);
        if(zzdwh0 != null) {
            HashMap hashMap0 = new HashMap();
            hashMap0.put("dialog_action", "dismiss");
            zzefa.zzd(activity0, zzdwh0, zzfgp0, zzees0, s, "dialog_click", hashMap0);
        }
        if(zzl0 != null) {
            zzl0.zzb();
        }
    }
}

