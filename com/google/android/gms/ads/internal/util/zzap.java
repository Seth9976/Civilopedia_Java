package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface;
import android.net.Uri.Builder;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzcfi;
import com.google.android.gms.internal.ads.zzcfv;
import com.google.android.gms.internal.ads.zzdzb;
import com.google.android.gms.internal.ads.zzfvm;
import java.util.Map;

public final class zzap implements DialogInterface.OnClickListener {
    public final zzas zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;

    public zzap(zzas zzas0, int v, int v1, int v2, int v3, int v4) {
        this.zza = zzas0;
        this.zzb = v;
        this.zzc = v1;
        this.zzd = v2;
        this.zze = v3;
        this.zzf = v4;
    }

    @Override  // android.content.DialogInterface$OnClickListener
    public final void onClick(DialogInterface dialogInterface0, int v) {
        zzas zzas0 = this.zza;
        int v1 = this.zzc;
        int v2 = this.zzd;
        int v3 = this.zze;
        int v4 = this.zzf;
        zzas0.getClass();
        if(v == this.zzb) {
            Context context0 = zzas0.a;
            if(!(context0 instanceof Activity)) {
                zzcfi.zzi("Can not create dialog without Activity Context");
                return;
            }
            String s = zzas0.c;
            String s1 = "No debug information";
            if(!TextUtils.isEmpty(s)) {
                Uri uri0 = new Uri.Builder().encodedQuery(s.replaceAll("\\+", "%20")).build();
                StringBuilder stringBuilder0 = new StringBuilder();
                Map map0 = zzs.zzK(uri0);
                for(Object object0: map0.keySet()) {
                    stringBuilder0.append(((String)object0));
                    stringBuilder0.append(" = ");
                    stringBuilder0.append(((String)map0.get(((String)object0))));
                    stringBuilder0.append("\n\n");
                }
                String s2 = stringBuilder0.toString().trim();
                if(!TextUtils.isEmpty(s2)) {
                    s1 = s2;
                }
            }
            AlertDialog.Builder alertDialog$Builder0 = new AlertDialog.Builder(context0);
            alertDialog$Builder0.setMessage(s1);
            alertDialog$Builder0.setTitle("Ad Information");
            alertDialog$Builder0.setPositiveButton("Share", new zzad(zzas0, s1));
            alertDialog$Builder0.setNegativeButton("Close", zzae.zza);
            alertDialog$Builder0.create().show();
            return;
        }
        if(v == v1) {
            zzcfi.zze("Debug mode [Creative Preview] selected.");
            zzac zzac0 = new zzac(zzas0);
            zzcfv.zza.execute(zzac0);
            return;
        }
        if(v == v2) {
            zzcfi.zze("Debug mode [Troubleshooting] selected.");
            zzag zzag0 = new zzag(zzas0);
            zzcfv.zza.execute(zzag0);
            return;
        }
        zzdzb zzdzb0 = zzas0.b;
        if(v == v3) {
            zzfvm zzfvm0 = zzcfv.zze;
            zzfvm zzfvm1 = zzcfv.zza;
            if(zzdzb0.zzm()) {
                zzfvm0.execute(new zzan(zzas0));
                return;
            }
            zzfvm1.execute(new zzao(zzas0, zzfvm0));
            return;
        }
        if(v == v4) {
            zzfvm zzfvm2 = zzcfv.zze;
            zzfvm zzfvm3 = zzcfv.zza;
            if(zzdzb0.zzm()) {
                zzfvm2.execute(new zzah(zzas0));
                return;
            }
            zzfvm3.execute(new zzai(zzas0, zzfvm2));
        }
    }
}

