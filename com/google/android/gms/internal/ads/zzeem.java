package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

public final class zzeem implements Runnable {
    public final SQLiteDatabase zza;
    public final String zzb;
    public final zzcfn zzc;

    public zzeem(SQLiteDatabase sQLiteDatabase0, String s, zzcfn zzcfn0) {
        this.zza = sQLiteDatabase0;
        this.zzb = s;
        this.zzc = zzcfn0;
    }

    @Override
    public final void run() {
        ContentValues contentValues0 = new ContentValues();
        contentValues0.put("event_state", 1);
        this.zza.update("offline_buffered_pings", contentValues0, "gws_query_id = ?", new String[]{this.zzb});
        zzees.b(this.zza, this.zzc);
    }
}

