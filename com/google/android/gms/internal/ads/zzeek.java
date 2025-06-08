package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.zzt;
import java.util.ArrayList;

public final class zzeek {
    public final zzbdm a;
    public final Context b;
    public final zzedo c;
    public final zzcfo d;
    public final String e;
    public final zzfgp f;
    public final zzg g;

    public zzeek(Context context0, zzcfo zzcfo0, zzbdm zzbdm0, zzedo zzedo0, String s, zzfgp zzfgp0) {
        this.b = context0;
        this.d = zzcfo0;
        this.a = zzbdm0;
        this.c = zzedo0;
        this.e = s;
        this.f = zzfgp0;
        this.g = zzt.zzo().zzh();
    }

    public static final void a(SQLiteDatabase sQLiteDatabase0, ArrayList arrayList0) {
        int v = arrayList0.size();
        long v2 = 0L;
        for(int v1 = 0; v1 < v; ++v1) {
            zzbfv zzbfv0 = (zzbfv)arrayList0.get(v1);
            if(zzbfv0.zzw() == 2 && zzbfv0.zze() > v2) {
                v2 = zzbfv0.zze();
            }
        }
        if(v2 != 0L) {
            ContentValues contentValues0 = new ContentValues();
            contentValues0.put("value", v2);
            sQLiteDatabase0.update("offline_signal_statistics", contentValues0, "statistic_name = \'last_successful_request_time\'", null);
        }
    }

    public final void zzb(boolean z) {
        try {
            zzeeg zzeeg0 = new zzeeg(this, z);
            this.c.zza(zzeeg0);
        }
        catch(Exception exception0) {
            zzcfi.zzg(("Error in offline signals database startup: " + exception0.getMessage()));
        }
    }
}

