package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import com.google.android.gms.ads.AdService;
import com.google.android.gms.ads.impl.R.string;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.overlay.zzl;
import com.google.android.gms.ads.internal.util.zzbr;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Map;
import u.h;

public final class zzefa extends zzbxk {
    public final Context i;
    public final zzdwh j;
    public final zzcfn k;
    public final zzees l;
    public final zzfgp m;

    public zzefa(Context context0, zzees zzees0, zzcfn zzcfn0, zzdwh zzdwh0, zzfgp zzfgp0) {
        this.i = context0;
        this.j = zzdwh0;
        this.k = zzcfn0;
        this.l = zzees0;
        this.m = zzfgp0;
    }

    public static void zzc(Context context0, zzdwh zzdwh0, zzfgp zzfgp0, zzees zzees0, String s, String s1) {
        zzefa.zzd(context0, zzdwh0, zzfgp0, zzees0, s, s1, new HashMap());
    }

    public static void zzd(Context context0, zzdwh zzdwh0, zzfgp zzfgp0, zzees zzees0, String s, String s1, Map map0) {
        String s3;
        String s2 = "online";
        if(((Boolean)zzay.zzc().zzb(zzbhz.zzhj)).booleanValue()) {
            zzfgo zzfgo0 = zzfgo.zzb(s1);
            zzfgo0.zza("gqi", s);
            if(!zzt.zzo().zzv(context0)) {
                s2 = "offline";
            }
            zzfgo0.zza("device_connectivity", s2);
            zzfgo0.zza("event_timestamp", String.valueOf(zzt.zzA().currentTimeMillis()));
            for(Object object0: map0.entrySet()) {
                zzfgo0.zza(((String)((Map.Entry)object0).getKey()), ((String)((Map.Entry)object0).getValue()));
            }
            s3 = zzfgp0.zza(zzfgo0);
        }
        else {
            zzdwg zzdwg0 = zzdwh0.zza();
            zzdwg0.zzb("gqi", s);
            zzdwg0.zzb("action", s1);
            if(!zzt.zzo().zzv(context0)) {
                s2 = "offline";
            }
            zzdwg0.zzb("device_connectivity", s2);
            zzdwg0.zzb("event_timestamp", String.valueOf(zzt.zzA().currentTimeMillis()));
            for(Object object1: map0.entrySet()) {
                zzdwg0.zzb(((String)((Map.Entry)object1).getKey()), ((String)((Map.Entry)object1).getValue()));
            }
            s3 = zzdwg0.zzf();
        }
        zzees0.zzd(new zzeeu(zzt.zzA().currentTimeMillis(), s, s3, 2));
    }

    @Override  // com.google.android.gms.internal.ads.zzbxl
    public final void zze(Intent intent0) {
        SQLiteDatabase sQLiteDatabase0;
        zzees zzees0 = this.l;
        String s = intent0.getStringExtra("offline_notification_action");
        if(!s.equals("offline_notification_clicked") && !s.equals("offline_notification_dismissed")) {
            return;
        }
        String s1 = intent0.getStringExtra("gws_query_id");
        String s2 = intent0.getStringExtra("uri");
        Context context0 = this.i;
        boolean z = zzt.zzo().zzv(context0);
        HashMap hashMap0 = new HashMap();
        int v = 2;
        if(s.equals("offline_notification_clicked")) {
            hashMap0.put("offline_notification_action", "offline_notification_clicked");
            if(z) {
                v = 1;
            }
            hashMap0.put("obvs", "33");
            hashMap0.put("olaih", String.valueOf(s2.startsWith("http")));
            try {
                Intent intent1 = context0.getPackageManager().getLaunchIntentForPackage(s2);
                if(intent1 == null) {
                    intent1 = new Intent("android.intent.action.VIEW");
                    intent1.setData(Uri.parse(s2));
                }
                intent1.addFlags(0x10000000);
                context0.startActivity(intent1);
                hashMap0.put("olaa", "olas");
            }
            catch(ActivityNotFoundException unused_ex) {
                hashMap0.put("olaa", "olaf");
            }
        }
        else {
            hashMap0.put("offline_notification_action", "offline_notification_dismissed");
        }
        zzefa.zzd(this.i, this.j, this.m, this.l, s1, "offline_notification_action", hashMap0);
        try {
            sQLiteDatabase0 = zzees0.getWritableDatabase();
        }
        catch(SQLiteException sQLiteException0) {
            zzcfi.zzg(("Failed to get writable offline buffering database: " + sQLiteException0.toString()));
            return;
        }
        if(v == 1) {
            zzeem zzeem0 = new zzeem(sQLiteDatabase0, s1, this.k);
            zzees0.j.execute(zzeem0);
            return;
        }
        sQLiteDatabase0.delete("offline_buffered_pings", "gws_query_id = ? AND event_state = ?", new String[]{s1, "0"});
    }

    @Override  // com.google.android.gms.internal.ads.zzbxl
    public final void zzf() {
        zzeeo zzeeo0 = new zzeeo(this.k);
        this.l.a(zzeeo0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbxl
    public final void zzg(IObjectWrapper iObjectWrapper0, String s, String s1) {
        Context context0 = (Context)ObjectWrapper.unwrap(iObjectWrapper0);
        zzt.zzq().zzg(context0);
        Intent intent0 = new Intent();
        intent0.setClass(context0, AdService.class);
        intent0.setAction("offline_notification_clicked");
        intent0.putExtra("offline_notification_action", "offline_notification_clicked");
        intent0.putExtra("gws_query_id", s1);
        intent0.putExtra("uri", s);
        PendingIntent pendingIntent0 = zzfoa.zza(context0, 0, intent0, zzfoa.zza | 0x40000000, 0);
        Intent intent1 = new Intent();
        intent1.setClass(context0, AdService.class);
        intent1.setAction("offline_notification_dismissed");
        intent1.putExtra("offline_notification_action", "offline_notification_dismissed");
        intent1.putExtra("gws_query_id", s1);
        PendingIntent pendingIntent1 = zzfoa.zza(context0, 0, intent1, zzfoa.zza | 0x40000000, 0);
        Resources resources0 = zzt.zzo().zzd();
        h h0 = new h(context0, "offline_notification_channel");
        h0.e = h.b((resources0 == null ? "View the ad you saved when you were offline" : resources0.getString(string.offline_notification_title)));
        h0.f = h.b((resources0 == null ? "Tap to open ad" : resources0.getString(string.offline_notification_text)));
        h0.o.flags |= 16;
        h0.o.deleteIntent = pendingIntent1;
        h0.g = pendingIntent0;
        h0.o.icon = context0.getApplicationInfo().icon;
        ((NotificationManager)context0.getSystemService("notification")).notify(s1, 0xD431, h0.a());
        HashMap hashMap0 = new HashMap();
        zzefa.zzd(this.i, this.j, this.m, this.l, s1, "offline_notification_impression", hashMap0);
    }

    public static void zzh(Activity activity0, zzl zzl0, zzbr zzbr0, zzees zzees0, zzdwh zzdwh0, zzfgp zzfgp0, String s, String s1) {
        AlertDialog.Builder alertDialog$Builder0 = new AlertDialog.Builder(activity0, zzt.zzq().zza());
        Resources resources0 = zzt.zzo().zzd();
        alertDialog$Builder0.setTitle((resources0 == null ? "Open ad when you\'re back online." : resources0.getString(string.offline_opt_in_title))).setMessage((resources0 == null ? "We\'ll send you a notification with a link to the advertiser site." : resources0.getString(string.offline_opt_in_message))).setPositiveButton((resources0 == null ? "OK" : resources0.getString(string.offline_opt_in_confirm)), new zzeew(zzdwh0, activity0, zzfgp0, zzees0, s, zzbr0, s1, resources0, zzl0)).setNegativeButton((resources0 == null ? "No thanks" : resources0.getString(string.offline_opt_in_decline)), new zzeex(zzees0, s, zzdwh0, activity0, zzfgp0, zzl0)).setOnCancelListener(new zzeey(zzees0, s, zzdwh0, activity0, zzfgp0, zzl0));
        alertDialog$Builder0.create().show();
    }
}

