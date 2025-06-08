package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;

public final class zzeep implements zzffi {
    public final zzees zza;
    public final String zzb;

    public zzeep(zzees zzees0, String s) {
        this.zza = zzees0;
        this.zzb = s;
    }

    @Override  // com.google.android.gms.internal.ads.zzffi
    public final Object zza(Object object0) {
        ((SQLiteDatabase)object0).delete("offline_buffered_pings", "gws_query_id = ? AND event_state = ?", new String[]{this.zzb, "0"});
        return null;
    }
}

