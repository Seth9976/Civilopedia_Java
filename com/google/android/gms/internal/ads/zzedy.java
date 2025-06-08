package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;
import android.provider.Settings.Global;
import com.google.android.gms.ads.internal.zzt;
import java.util.ArrayList;

public final class zzedy implements zzffi {
    public final h5 zza;
    public final boolean zzb;
    public final ArrayList zzc;
    public final zzbfq zzd;
    public final zzbfz zze;

    public zzedy(h5 h50, boolean z, ArrayList arrayList0, zzbfq zzbfq0, zzbfz zzbfz0) {
        this.zza = h50;
        this.zzb = z;
        this.zzc = arrayList0;
        this.zzd = zzbfq0;
        this.zze = zzbfz0;
    }

    @Override  // com.google.android.gms.internal.ads.zzffi
    public final Object zza(Object object0) {
        h5 h50 = this.zza;
        boolean z = this.zzb;
        ArrayList arrayList0 = this.zzc;
        zzbfq zzbfq0 = this.zzd;
        zzbfz zzbfz0 = this.zze;
        if(!h50.j.a.zzP()) {
            zzbfu zzbfu0 = zzbfv.zzg();
            zzbfu0.zza(arrayList0);
            int v = 2;
            zzbfu0.zzi((Settings.Global.getInt(h50.j.c.getContentResolver(), "airplane_mode_on", 0) == 0 ? 1 : 2));
            zzbfu0.zzj(zzt.zzq().zzh(h50.j.c, h50.j.e));
            zzeds zzeds0 = h50.j.f;
            zzbfu0.zzf(zzeds0.zze());
            zzbfu0.zze(zzeds0.zzb());
            zzbfu0.zzb(zzeds0.zza());
            zzbfu0.zzc(zzbfz0);
            zzbfu0.zzd(zzbfq0);
            zzbfu0.zzk(h50.j.g);
            zzbfu0.zzl((z ? 2 : 1));
            zzbfu0.zzh(zzeds0.zzd());
            zzbfu0.zzg(zzt.zzA().currentTimeMillis());
            if(Settings.Global.getInt(h50.j.c.getContentResolver(), "wifi_on", 0) == 0) {
                v = 1;
            }
            zzbfu0.zzm(v);
            byte[] arr_b = ((zzbfv)zzbfu0.zzal()).zzaw();
            zzeed.zzg(((SQLiteDatabase)object0), z, true);
            zzeed.zzd(((SQLiteDatabase)object0), zzeds0.zzd(), arr_b);
        }
        return null;
    }
}

