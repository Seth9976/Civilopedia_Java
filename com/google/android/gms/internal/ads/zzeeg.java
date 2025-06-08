package com.google.android.gms.internal.ads;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.zzt;
import java.util.ArrayList;

public final class zzeeg implements zzffi {
    public final zzeek zza;
    public final boolean zzb;

    public zzeeg(zzeek zzeek0, boolean z) {
        this.zza = zzeek0;
        this.zzb = z;
    }

    @Override  // com.google.android.gms.internal.ads.zzffi
    public final Object zza(Object object0) {
        zzeek zzeek0 = this.zza;
        Context context0 = zzeek0.b;
        if(this.zzb) {
            context0.deleteDatabase("OfflineUpload.db");
            return null;
        }
        if(((Boolean)zzay.zzc().zzb(zzbhz.zzhj)).booleanValue()) {
            zzfgo zzfgo0 = zzfgo.zzb("oa_upload");
            zzfgo0.zza("oa_failed_reqs", String.valueOf(zzeed.zza(((SQLiteDatabase)object0), 0)));
            zzfgo0.zza("oa_total_reqs", String.valueOf(zzeed.zza(((SQLiteDatabase)object0), 1)));
            zzfgo0.zza("oa_upload_time", String.valueOf(zzt.zzA().currentTimeMillis()));
            zzfgo0.zza("oa_last_successful_time", String.valueOf(zzeed.zzb(((SQLiteDatabase)object0), 2)));
            zzg zzg0 = zzeek0.g;
            boolean z = zzg0.zzP();
            String s = zzeek0.e;
            zzfgo0.zza("oa_session_id", (z ? "" : s));
            zzfgp zzfgp0 = zzeek0.f;
            zzfgp0.zzb(zzfgo0);
            ArrayList arrayList0 = zzeed.zzc(((SQLiteDatabase)object0));
            zzeek.a(((SQLiteDatabase)object0), arrayList0);
            int v1 = arrayList0.size();
            for(int v = 0; v < v1; ++v) {
                zzbfv zzbfv0 = (zzbfv)arrayList0.get(v);
                zzfgo zzfgo1 = zzfgo.zzb("oa_signals");
                zzfgo1.zza("oa_session_id", (zzg0.zzP() ? "" : s));
                zzbfq zzbfq0 = zzbfv0.zzf();
                String s1 = zzbfq0.zzf() ? String.valueOf(zzbfq0.zzh() - 1) : "-1";
                String s2 = zzfrx.zzb(zzbfv0.zzk(), zzeej.zza).toString();
                zzfgo1.zza("oa_sig_ts", String.valueOf(zzbfv0.zze()));
                zzfgo1.zza("oa_sig_status", String.valueOf(zzbfv0.zzw() - 1));
                zzfgo1.zza("oa_sig_resp_lat", String.valueOf(zzbfv0.zzd()));
                zzfgo1.zza("oa_sig_render_lat", String.valueOf(zzbfv0.zzc()));
                zzfgo1.zza("oa_sig_formats", s2);
                zzfgo1.zza("oa_sig_nw_type", s1);
                zzfgo1.zza("oa_sig_wifi", String.valueOf(zzbfv0.zzx() - 1));
                zzfgo1.zza("oa_sig_airplane", String.valueOf(zzbfv0.zzt() - 1));
                zzfgo1.zza("oa_sig_data", String.valueOf(zzbfv0.zzu() - 1));
                zzfgo1.zza("oa_sig_nw_resp", String.valueOf(zzbfv0.zza()));
                zzfgo1.zza("oa_sig_offline", String.valueOf(zzbfv0.zzv() - 1));
                zzfgo1.zza("oa_sig_nw_state", String.valueOf(zzbfv0.zzj().zza()));
                if(zzbfq0.zze() && zzbfq0.zzf() && zzbfq0.zzh() == 2) {
                    zzfgo1.zza("oa_sig_cell_type", String.valueOf(zzbfq0.zzg() - 1));
                }
                zzfgp0.zzb(zzfgo1);
            }
        }
        else {
            ArrayList arrayList1 = zzeed.zzc(((SQLiteDatabase)object0));
            zzbfw zzbfw0 = zzbga.zza();
            zzbfw0.zzb("com.spears.civilopedia");
            zzbfw0.zzd(Build.MODEL);
            zzbfw0.zze(zzeed.zza(((SQLiteDatabase)object0), 0));
            zzbfw0.zza(arrayList1);
            zzbfw0.zzg(zzeed.zza(((SQLiteDatabase)object0), 1));
            zzbfw0.zzc(zzeed.zza(((SQLiteDatabase)object0), 3));
            zzbfw0.zzh(zzt.zzA().currentTimeMillis());
            zzbfw0.zzf(zzeed.zzb(((SQLiteDatabase)object0), 2));
            zzbga zzbga0 = (zzbga)zzbfw0.zzal();
            zzeek.a(((SQLiteDatabase)object0), arrayList1);
            zzeeh zzeeh0 = new zzeeh(zzbga0);
            zzeek0.a.zzb(zzeeh0);
            zzbgl zzbgl0 = zzbgm.zza();
            zzbgl0.zza(zzeek0.d.zzb);
            zzbgl0.zzc(zzeek0.d.zzc);
            zzbgl0.zzb((zzeek0.d.zzd ? 0 : 2));
            zzeek0.a.zzb(new zzeei(((zzbgm)zzbgl0.zzal())));
            zzeek0.a.zzc(10004);
        }
        zzeed.zzf(((SQLiteDatabase)object0));
        return null;
    }
}

