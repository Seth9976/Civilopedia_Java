package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.android.gms.ads.internal.client.zzay;
import java.util.Map;

public final class zzbol {
    public static final zzbom zza;
    public static final zzbom zzb;
    public static final zzbom zzc;
    public static final zzbom zzd;
    public static final zzbom zze;
    public static final zzbom zzf;
    public static final zzbom zzg;
    public static final zzbom zzh;
    public static final zzbom zzi;
    public static final zzbom zzj;
    public static final zzbom zzk;
    public static final zzbom zzl;
    public static final zzbom zzm;
    public static final zzbom zzn;
    public static final zzbpa zzo;
    public static final zzbom zzp;
    public static final zzbom zzq;
    public static final zzbom zzr;
    public static final zzbom zzs;
    public static final zzbom zzt;

    static {
        zzbol.zza = zzbnx.zza;
        zzbol.zzb = zzbny.zza;
        zzbol.zzc = zzbnq.zza;
        zzbol.zzd = new N1(3);
        zzbol.zze = new N1(4);
        zzbol.zzf = zzbnw.zza;
        zzbol.zzg = new N1(5);
        zzbol.zzh = new N1(6);
        zzbol.zzi = zzbnv.zza;
        zzbol.zzj = new N1(7);
        zzbol.zzk = new N1(8);
        zzbol.zzl = new zzcji();
        zzbol.zzm = new zzcjj();
        zzbol.zzn = new zzbnp();
        zzbol.zzo = new zzbpa();
        zzbol.zzp = new N1(9);
        zzbol.zzq = new N1(10);
        zzbol.zzr = new N1(0);
        zzbol.zzs = new N1(1);
        zzbol.zzt = new N1(2);
    }

    public static zzbom zza(zzdjg zzdjg0) {
        return new zzbnu(zzdjg0);
    }

    public static zzfvl zzb(zzcli zzcli0, String s) {
        Uri uri0 = Uri.parse(s);
        try {
            zzaoc zzaoc0 = zzcli0.zzK();
            if(zzaoc0 != null && zzaoc0.zzf(uri0)) {
                uri0 = zzaoc0.zza(uri0, zzcli0.getContext(), zzcli0.zzH(), zzcli0.zzk());
            }
        }
        catch(zzaod unused_ex) {
            zzcfi.zzj(("Unable to append parameter to URL: " + s));
        }
        String s1 = zzcdp.zzb(uri0, zzcli0.getContext());
        long v = (long)(((Long)zzbjo.zze.zze()));
        if(v > 0L && v <= 221908400L) {
            zzfvl zzfvl0 = zzfvc.zzm(zzfvc.zzf(zzfut.zzv(zzcli0.zzT()), Throwable.class, zzbnr.zza, zzcfv.zzf), new zzbns(s1), zzcfv.zzf);
            zzbnt zzbnt0 = new zzbnt(s1);
            return zzfvc.zzf(zzfvl0, Throwable.class, zzbnt0, zzcfv.zzf);
        }
        return zzfvc.zzi(s1);
    }

    public static void zzd(Map map0, zzdjg zzdjg0) {
        if(((Boolean)zzay.zzc().zzb(zzbhz.zzii)).booleanValue() && map0.containsKey("sc") && ((String)map0.get("sc")).equals("1") && zzdjg0 != null) {
            zzdjg0.zzq();
        }
    }
}

