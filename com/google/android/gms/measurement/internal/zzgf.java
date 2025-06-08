package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import i1.e;

public final class zzgf implements Runnable {
    public final zzgw zza;
    public final String zzb;
    public final Bundle zzc;

    public zzgf(zzgw zzgw0, String s, Bundle bundle0) {
        this.zza = zzgw0;
        this.zzb = s;
        this.zzc = bundle0;
    }

    @Override
    public final void run() {
        String s = this.zzb;
        e e0 = this.zza.i.zzi();
        e0.zzg();
        e0.a();
        zzar zzar0 = new zzar(e0.a, "", s, "dep", 0L, this.zzc);
        byte[] arr_b = e0.b.zzu().q(zzar0).zzbv();
        zzge zzge0 = e0.a;
        zzge0.zzay().zzj().zzc("Saving default event parameters, appId, data size", zzge0.zzj().d(s), ((int)arr_b.length));
        ContentValues contentValues0 = new ContentValues();
        contentValues0.put("app_id", s);
        contentValues0.put("parameters", arr_b);
        try {
            if(e0.r().insertWithOnConflict("default_event_params", null, contentValues0, 5) == -1L) {
                zzge0.zzay().zzd().zzb("Failed to insert default event parameters (got -1). appId", zzeu.d(s));
            }
        }
        catch(SQLiteException sQLiteException0) {
            zzge0.zzay().zzd().zzc("Error storing default event parameters. appId", zzeu.d(s), sQLiteException0);
        }
    }
}

