package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;

public final class f5 implements zzfuy {
    public final int i;
    public final zzffi j;

    public f5(zzffi zzffi0, int v) {
        this.i = v;
        this.j = zzffi0;
        super();
    }

    @Override  // com.google.android.gms.internal.ads.zzfuy
    public final void zza(Throwable throwable0) {
        if(this.i != 0) {
            zzcfi.zzg(("Failed to get offline buffered ping database: " + throwable0.getMessage()));
            return;
        }
        zzcfi.zzg(("Failed to get offline signal database: " + throwable0.getMessage()));
    }

    @Override  // com.google.android.gms.internal.ads.zzfuy
    public final void zzb(Object object0) {
        if(this.i != 0) {
            SQLiteDatabase sQLiteDatabase0 = (SQLiteDatabase)object0;
            try {
                this.j.zza(sQLiteDatabase0);
            }
            catch(Exception exception0) {
                zzcfi.zzg(("Error executing function on offline buffered ping database: " + exception0.getMessage()));
            }
            return;
        }
        SQLiteDatabase sQLiteDatabase1 = (SQLiteDatabase)object0;
        try {
            this.j.zza(sQLiteDatabase1);
        }
        catch(Exception exception1) {
            zzcfi.zzg(("Error executing function on offline signal database: " + exception1.getMessage()));
        }
    }
}

