package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.zzbr;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.dynamic.ObjectWrapper;

public final class zzeen implements zzffi {
    public final zzees zza;
    public final zzeeu zzb;

    public zzeen(zzees zzees0, zzeeu zzeeu0) {
        this.zza = zzees0;
        this.zzb = zzeeu0;
    }

    @Override  // com.google.android.gms.internal.ads.zzffi
    public final Object zza(Object object0) {
        this.zza.getClass();
        ContentValues contentValues0 = new ContentValues();
        contentValues0.put("timestamp", this.zzb.zza);
        contentValues0.put("gws_query_id", this.zzb.zzb);
        contentValues0.put("url", this.zzb.zzc);
        contentValues0.put("event_state", ((int)(this.zzb.zzd - 1)));
        ((SQLiteDatabase)object0).insert("offline_buffered_pings", null, contentValues0);
        Context context0 = this.zza.i;
        zzbr zzbr0 = zzs.zzw(context0);
        if(zzbr0 != null) {
            try {
                zzbr0.zze(ObjectWrapper.wrap(context0));
                return null;
            }
            catch(RemoteException remoteException0) {
                zze.zzb("Failed to schedule offline ping sender.", remoteException0);
            }
        }
        return null;
    }
}

