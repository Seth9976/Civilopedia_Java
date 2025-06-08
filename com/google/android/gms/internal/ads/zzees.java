package com.google.android.gms.internal.ads;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.google.android.gms.ads.internal.client.zzay;

public final class zzees extends SQLiteOpenHelper {
    public final Context i;
    public final zzfvm j;
    public static final int k;

    public zzees(Context context0, zzfvm zzfvm0) {
        super(context0, "AdMobOfflineBufferedPings.db", null, ((int)(((Integer)zzay.zzc().zzb(zzbhz.zzha)))));
        this.i = context0;
        this.j = zzfvm0;
    }

    public final void a(zzffi zzffi0) {
        zzeel zzeel0 = new zzeel(this);
        zzfvc.zzr(this.j.zzb(zzeel0), new f5(zzffi0, 1), this.j);
    }

    public static void b(SQLiteDatabase sQLiteDatabase0, zzcfn zzcfn0) {
        String[] arr_s;
        sQLiteDatabase0.beginTransaction();
        try {
            Cursor cursor0 = sQLiteDatabase0.query("offline_buffered_pings", new String[]{"url"}, "event_state = 1", null, null, null, "timestamp ASC", null);
            int v1 = cursor0.getCount();
            arr_s = new String[v1];
            for(int v3 = 0; cursor0.moveToNext(); ++v3) {
                int v4 = cursor0.getColumnIndex("url");
                if(v4 != -1) {
                    arr_s[v3] = cursor0.getString(v4);
                }
            }
            cursor0.close();
            sQLiteDatabase0.delete("offline_buffered_pings", "event_state = ?", new String[]{"1"});
            sQLiteDatabase0.setTransactionSuccessful();
        }
        finally {
            sQLiteDatabase0.endTransaction();
        }
        for(int v2 = 0; v2 < v1; ++v2) {
            zzcfn0.zza(arr_s[v2]);
        }
    }

    @Override  // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase0) {
        sQLiteDatabase0.execSQL("CREATE TABLE offline_buffered_pings (timestamp INTEGER PRIMARY_KEY, gws_query_id TEXT, url TEXT, event_state INTEGER)");
    }

    @Override  // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase0, int v, int v1) {
        sQLiteDatabase0.execSQL("DROP TABLE IF EXISTS offline_buffered_pings");
    }

    @Override  // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase0, int v, int v1) {
        sQLiteDatabase0.execSQL("DROP TABLE IF EXISTS offline_buffered_pings");
    }

    public final void zzc(String s) {
        this.a(new zzeep(this, s));
    }

    public final void zzd(zzeeu zzeeu0) {
        this.a(new zzeen(this, zzeeu0));
    }

    public final void zzh(zzcfn zzcfn0, String s) {
        this.a(new zzeeq(this, zzcfn0, s));
    }
}

