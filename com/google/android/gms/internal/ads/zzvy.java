package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import java.util.HashMap;

public final class zzvy implements zzfs, zzvu {
    public final zzfrm i;
    public final zzvs j;
    public final zzwo k;
    public final zzcx l;
    public final boolean m;
    public int n;
    public long o;
    public long p;
    public int q;
    public long r;
    public long s;
    public long t;
    public long u;
    public static zzvy v;
    public static final zzfrj zza;
    public static final zzfrj zzb;
    public static final zzfrj zzc;
    public static final zzfrj zzd;
    public static final zzfrj zze;
    public static final zzfrj zzf;

    static {
        zzvy.zza = zzfrj.zzs(5400000L, 3300000L, 2000000L, 1300000L, 760000L);
        zzvy.zzb = zzfrj.zzs(1700000L, 820000L, 450000L, 180000L, 130000L);
        zzvy.zzc = zzfrj.zzs(2300000L, 1300000L, 1000000L, 820000L, 570000L);
        zzvy.zzd = zzfrj.zzs(3400000L, 2000000L, 1400000L, 1000000L, 620000L);
        zzvy.zze = zzfrj.zzs(7500000L, 5200000L, 3700000L, 1800000L, 1100000L);
        zzvy.zzf = zzfrj.zzs(3300000L, 1900000L, 1700000L, 1500000L, 1200000L);
    }

    @Deprecated
    public zzvy() {
        throw null;
    }

    public zzvy(Context context0, HashMap hashMap0, zzcx zzcx0) {
        this.i = zzfrm.zzc(hashMap0);
        this.j = new zzvs();
        this.k = new zzwo(2000);
        this.l = zzcx0;
        this.m = true;
        if(context0 != null) {
            zzdw zzdw0 = zzdw.zzb(context0);
            int v = zzdw0.zza();
            this.q = v;
            this.t = this.a(v);
            zzdw0.zzd(new zzvw(this));
            return;
        }
        this.q = 0;
        this.t = this.a(0);
    }

    public final long a(int v) {
        zzfrm zzfrm0 = this.i;
        Long long0 = (Long)zzfrm0.get(v);
        if(long0 == null) {
            long0 = (Long)zzfrm0.get(0);
        }
        if(long0 == null) {
            long0 = 1000000L;
        }
        return (long)long0;
    }

    public static int[] b(String s) {
        switch(s.hashCode()) {
            case 2083: {
                return s.equals("AD") ? new int[]{1, 2, 0, 0, 2, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 2084: {
                return s.equals("AE") ? new int[]{1, 4, 4, 4, 3, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 2085: {
                return s.equals("AF") ? new int[]{4, 4, 4, 4, 2, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 2086: {
                return s.equals("AG") ? new int[]{2, 3, 1, 2, 2, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 2088: {
                return s.equals("AI") ? new int[]{1, 2, 2, 2, 2, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 2091: {
                return s.equals("AL") ? new int[]{1, 2, 0, 1, 2, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 2092: {
                return s.equals("AM") ? new int[]{2, 3, 2, 4, 2, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 2094: {
                return s.equals("AO") ? new int[]{3, 4, 3, 2, 2, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 0x830: {
                return s.equals("AQ") ? new int[]{4, 2, 2, 2, 2, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 2097: {
                return s.equals("AR") ? new int[]{2, 4, 1, 1, 2, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 2098: {
                return s.equals("AS") ? new int[]{2, 2, 2, 3, 2, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 2099: {
                return s.equals("AT") ? new int[]{0, 0, 0, 0, 0, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 2100: {
                return s.equals("AU") ? new int[]{0, 1, 0, 1, 2, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 2102: {
                return s.equals("AW") ? new int[]{1, 2, 4, 4, 2, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 2103: {
                return s.equals("AX") ? new int[]{0, 2, 2, 2, 2, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 2105: {
                return s.equals("AZ") ? new int[]{3, 2, 4, 4, 2, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 0x83F: {
                return s.equals("BA") ? new int[]{1, 2, 0, 1, 2, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 0x840: {
                return s.equals("BB") ? new int[]{0, 2, 0, 0, 2, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 0x842: {
                return s.equals("BD") ? new int[]{2, 1, 3, 3, 2, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 0x843: {
                return s.equals("BE") ? new int[]{0, 0, 3, 3, 2, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 0x844: {
                return s.equals("BF") ? new int[]{4, 3, 4, 3, 2, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 0x845: {
                return s.equals("BG") ? new int[]{0, 0, 0, 0, 1, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 0x846: {
                return s.equals("BH") ? new int[]{1, 2, 2, 4, 4, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 0x847: {
                return s.equals("BI") ? new int[]{4, 3, 4, 4, 2, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 2120: {
                return s.equals("BJ") ? new int[]{4, 4, 3, 4, 2, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 0x84A: {
                return s.equals("BL") ? new int[]{1, 2, 2, 2, 2, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 0x84B: {
                return s.equals("BM") ? new int[]{1, 2, 0, 0, 2, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 0x84C: {
                return s.equals("BN") ? new int[]{3, 2, 1, 1, 2, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 0x84D: {
                return s.equals("BO") ? new int[]{1, 3, 3, 2, 2, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 0x84F: {
                return s.equals("BQ") ? new int[]{1, 2, 2, 0, 2, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 0x850: {
                return s.equals("BR") ? new int[]{2, 3, 2, 2, 2, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 0x851: {
                return s.equals("BS") ? new int[]{4, 2, 2, 3, 2, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 2130: {
                return s.equals("BT") ? new int[]{3, 1, 3, 2, 2, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 0x855: {
                return s.equals("BW") ? new int[]{3, 4, 1, 0, 2, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 0x857: {
                return s.equals("BY") ? new int[]{0, 1, 1, 3, 2, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 0x858: {
                return s.equals("BZ") ? new int[]{2, 4, 2, 2, 2, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 0x85E: {
                return s.equals("CA") ? new int[]{0, 2, 1, 2, 4, 1} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 0x861: {
                return s.equals("CD") ? new int[]{4, 2, 3, 1, 2, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 0x863: {
                return s.equals("CF") ? new int[]{4, 2, 3, 2, 2, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 0x864: {
                return s.equals("CG") ? new int[]{2, 4, 3, 4, 2, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 0x865: {
                return s.equals("CH") ? new int[]{0, 0, 0, 0, 0, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 2150: {
                return s.equals("CI") ? new int[]{3, 3, 3, 4, 2, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 0x868: {
                return s.equals("CK") ? new int[]{2, 2, 2, 1, 2, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 0x869: {
                return s.equals("CL") ? new int[]{1, 1, 2, 2, 3, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 0x86A: {
                return s.equals("CM") ? new int[]{3, 4, 3, 2, 2, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 0x86B: {
                return s.equals("CN") ? new int[]{2, 0, 2, 2, 3, 1} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 0x86C: {
                return s.equals("CO") ? new int[]{2, 2, 4, 2, 2, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 0x86F: {
                return s.equals("CR") ? new int[]{2, 2, 4, 4, 2, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 0x872: {
                return s.equals("CU") ? new int[]{4, 4, 3, 2, 2, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 0x873: {
                return s.equals("CV") ? new int[]{2, 3, 1, 0, 2, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 0x874: {
                return s.equals("CW") ? new int[]{2, 2, 0, 0, 2, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 0x875: {
                return s.equals("CX") ? new int[]{1, 2, 2, 2, 2, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 0x876: {
                return s.equals("CY") ? new int[]{1, 0, 0, 0, 1, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 0x877: {
                return s.equals("CZ") ? new int[]{0, 0, 0, 0, 1, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 0x881: {
                return s.equals("DE") ? new int[]{0, 0, 2, 2, 1, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 0x886: {
                return s.equals("DJ") ? new int[]{4, 1, 4, 4, 2, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 0x887: {
                return s.equals("DK") ? new int[]{0, 0, 1, 0, 0, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 0x889: {
                return s.equals("DM") ? new int[]{1, 2, 2, 2, 2, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 0x88B: {
                return s.equals("DO") ? new int[]{3, 4, 4, 4, 2, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 0x896: {
                return s.equals("DZ") ? new int[]{4, 3, 4, 4, 2, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 2206: {
                return s.equals("EC") ? new int[]{2, 4, 2, 1, 2, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 0x8A0: {
                return s.equals("EE") ? new int[]{0, 0, 0, 0, 2, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 2210: {
                return s.equals("EG") ? new int[]{3, 4, 2, 3, 2, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 0x8AD: {
                return s.equals("ER") ? new int[]{4, 2, 2, 2, 2, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 0x8AE: {
                return s.equals("ES") ? new int[]{0, 1, 1, 1, 2, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 0x8AF: {
                return s.equals("ET") ? new int[]{4, 4, 3, 1, 2, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 0x8C3: {
                return s.equals("FI") ? new int[]{0, 0, 0, 1, 0, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 0x8C4: {
                return s.equals("FJ") ? new int[]{3, 1, 3, 3, 2, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 0x8C5: {
                return s.equals("FK") ? new int[]{3, 2, 2, 2, 2, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 0x8C7: {
                return s.equals("FM") ? new int[]{3, 2, 4, 2, 2, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 0x8C9: {
                return s.equals("FO") ? new int[]{0, 2, 0, 0, 2, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 0x8CC: {
                return s.equals("FR") ? new int[]{1, 1, 2, 1, 1, 1} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 0x8DA: {
                return s.equals("GA") ? new int[]{2, 3, 1, 1, 2, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 0x8DB: {
                return s.equals("GB") ? new int[]{0, 0, 1, 1, 2, 3} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 0x8DD: {
                return s.equals("GD") ? new int[]{1, 2, 2, 2, 2, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 2270: {
                return s.equals("GE") ? new int[]{1, 1, 1, 3, 2, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 0x8DF: {
                return s.equals("GF") ? new int[]{2, 1, 2, 3, 2, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 0x8E0: {
                return s.equals("GG") ? new int[]{0, 2, 0, 0, 2, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 0x8E1: {
                return s.equals("GH") ? new int[]{3, 2, 3, 2, 2, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 0x8E2: {
                return s.equals("GI") ? new int[]{0, 2, 2, 2, 2, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 0x8E5: {
                return s.equals("GL") ? new int[]{1, 2, 0, 0, 2, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 0x8E6: {
                return s.equals("GM") ? new int[]{4, 2, 2, 4, 2, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 0x8E7: {
                return s.equals("GN") ? new int[]{4, 3, 4, 2, 2, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 0x8E9: {
                return s.equals("GP") ? new int[]{2, 1, 2, 3, 2, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 0x8EA: {
                return s.equals("GQ") ? new int[]{4, 2, 3, 4, 2, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 0x8EB: {
                return s.equals("GR") ? new int[]{1, 0, 0, 0, 2, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 0x8ED: {
                return s.equals("GT") ? new int[]{2, 3, 2, 1, 2, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 0x8EE: {
                return s.equals("GU") ? new int[]{1, 2, 4, 4, 2, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 0x8F0: {
                return s.equals("GW") ? new int[]{3, 4, 3, 3, 2, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 0x8F2: {
                return s.equals("GY") ? new int[]{3, 4, 1, 0, 2, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 0x903: {
                return s.equals("HK") ? new int[]{0, 1, 2, 3, 2, 0} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 0x906: {
                return s.equals("HN") ? new int[]{3, 2, 3, 3, 2, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 0x90A: {
                return s.equals("HR") ? new int[]{1, 0, 0, 0, 2, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 0x90C: {
                return s.equals("HT") ? new int[]{4, 4, 4, 4, 2, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 0x90D: {
                return s.equals("HU") ? new int[]{0, 0, 0, 1, 3, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 0x91B: {
                return s.equals("ID") ? new int[]{3, 2, 3, 3, 3, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 0x91C: {
                return s.equals("IE") ? new int[]{0, 1, 1, 1, 2, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 0x923: {
                return s.equals("IL") ? new int[]{1, 1, 2, 3, 4, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 2340: {
                return s.equals("IM") ? new int[]{0, 2, 0, 1, 2, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 0x925: {
                return s.equals("IN") ? new int[]{1, 1, 3, 2, 4, 3} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 0x926: {
                return s.equals("IO") ? new int[]{4, 2, 2, 2, 2, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 0x928: {
                return s.equals("IQ") ? new int[]{3, 3, 3, 3, 2, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 0x929: {
                return s.equals("IR") ? new int[]{3, 0, 1, 1, 3, 0} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 0x92A: {
                return s.equals("IS") ? new int[]{0, 0, 0, 0, 0, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 0x92B: {
                return s.equals("IT") ? new int[]{0, 1, 0, 1, 1, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 0x93B: {
                return s.equals("JE") ? new int[]{3, 2, 1, 2, 2, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 0x943: {
                return s.equals("JM") ? new int[]{3, 4, 4, 4, 2, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 0x945: {
                return s.equals("JO") ? new int[]{1, 0, 0, 1, 2, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 0x946: {
                return s.equals("JP") ? new int[]{0, 1, 0, 1, 1, 1} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 0x95A: {
                return s.equals("KE") ? new int[]{3, 3, 2, 2, 2, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 0x95C: {
                return s.equals("KG") ? new int[]{2, 1, 1, 1, 2, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 0x95D: {
                return s.equals("KH") ? new int[]{1, 1, 4, 2, 2, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 0x95E: {
                return s.equals("KI") ? new int[]{4, 2, 4, 3, 2, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 2402: {
                return s.equals("KM") ? new int[]{4, 2, 4, 3, 2, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 2405: {
                return s.equals("KP") ? new int[]{3, 2, 2, 2, 2, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 2407: {
                return s.equals("KR") ? new int[]{0, 0, 1, 3, 4, 4} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 0x96C: {
                return s.equals("KW") ? new int[]{1, 1, 0, 0, 0, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 0x96E: {
                return s.equals("KY") ? new int[]{1, 2, 0, 1, 2, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 0x96F: {
                return s.equals("KZ") ? new int[]{1, 1, 2, 2, 2, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 0x975: {
                return s.equals("LA") ? new int[]{2, 2, 1, 2, 2, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 0x976: {
                return s.equals("LB") ? new int[]{3, 2, 1, 4, 2, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 0x977: {
                return s.equals("LC") ? new int[]{1, 2, 0, 0, 2, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 0x97D: {
                return s.equals("LI") ? new int[]{0, 2, 2, 2, 2, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 0x97F: {
                return s.equals("LK") ? new int[]{3, 1, 3, 4, 4, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 0x986: {
                return s.equals("LR") ? new int[]{3, 4, 4, 3, 2, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 0x987: {
                return s.equals("LS") ? new int[]{3, 3, 4, 3, 2, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 2440: {
                return s.equals("LT") ? new int[]{0, 0, 0, 0, 2, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 0x989: {
                return s.equals("LU") ? new int[]{1, 0, 2, 2, 2, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 0x98A: {
                return s.equals("LV") ? new int[]{0, 0, 0, 0, 2, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 0x98D: {
                return s.equals("LY") ? new int[]{4, 2, 4, 3, 2, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 0x994: {
                return s.equals("MA") ? new int[]{3, 2, 2, 2, 2, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 0x996: {
                return s.equals("MC") ? new int[]{0, 2, 2, 0, 2, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 0x997: {
                return s.equals("MD") ? new int[]{1, 0, 0, 0, 2, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 0x998: {
                return s.equals("ME") ? new int[]{1, 0, 0, 1, 2, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 0x999: {
                return s.equals("MF") ? new int[]{1, 2, 1, 0, 2, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 0x99A: {
                return s.equals("MG") ? new int[]{3, 4, 2, 2, 2, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 0x99B: {
                return s.equals("MH") ? new int[]{3, 2, 2, 4, 2, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 0x99E: {
                return s.equals("MK") ? new int[]{1, 0, 0, 0, 2, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 0x99F: {
                return s.equals("ML") ? new int[]{4, 3, 3, 1, 2, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 0x9A0: {
                return s.equals("MM") ? new int[]{2, 4, 3, 3, 2, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 0x9A1: {
                return s.equals("MN") ? new int[]{2, 0, 1, 2, 2, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 0x9A2: {
                return s.equals("MO") ? new int[]{0, 2, 4, 4, 2, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 0x9A3: {
                return s.equals("MP") ? new int[]{0, 2, 2, 2, 2, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 0x9A4: {
                return s.equals("MQ") ? new int[]{2, 1, 2, 3, 2, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 0x9A5: {
                return s.equals("MR") ? new int[]{4, 1, 3, 4, 2, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 2470: {
                return s.equals("MS") ? new int[]{1, 2, 2, 2, 2, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 0x9A7: {
                return s.equals("MT") ? new int[]{0, 0, 0, 0, 2, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 0x9A8: {
                return s.equals("MU") ? new int[]{3, 1, 1, 2, 2, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 0x9A9: {
                return s.equals("MV") ? new int[]{3, 4, 1, 4, 2, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 0x9AA: {
                return s.equals("MW") ? new int[]{4, 2, 1, 0, 2, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 0x9AB: {
                return s.equals("MX") ? new int[]{2, 4, 3, 4, 2, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 0x9AC: {
                return s.equals("MY") ? new int[]{2, 1, 3, 3, 2, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 0x9AD: {
                return s.equals("MZ") ? new int[]{3, 2, 2, 2, 2, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 0x9B3: {
                return s.equals("NA") ? new int[]{4, 3, 2, 2, 2, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 0x9B5: {
                return s.equals("NC") ? new int[]{3, 2, 4, 4, 2, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 0x9B7: {
                return s.equals("NE") ? new int[]{4, 4, 4, 4, 2, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 0x9B9: {
                return s.equals("NG") ? new int[]{3, 4, 1, 1, 2, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 0x9BB: {
                return s.equals("NI") ? new int[]{2, 3, 4, 3, 2, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 0x9BE: {
                return s.equals("NL") ? new int[]{0, 0, 3, 2, 0, 4} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 0x9C1: {
                return s.equals("NO") ? new int[]{0, 0, 2, 0, 0, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 0x9C2: {
                return s.equals("NP") ? new int[]{2, 1, 4, 3, 2, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 2500: {
                return s.equals("NR") ? new int[]{3, 2, 2, 0, 2, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 2503: {
                return s.equals("NU") ? new int[]{4, 2, 2, 2, 2, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 2508: {
                return s.equals("NZ") ? new int[]{1, 0, 1, 2, 4, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 0x9DE: {
                return s.equals("OM") ? new int[]{2, 3, 1, 3, 4, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 0x9F1: {
                return s.equals("PA") ? new int[]{1, 3, 3, 3, 2, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 0x9F5: {
                return s.equals("PE") ? new int[]{2, 3, 4, 4, 4, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 0x9F6: {
                return s.equals("PF") ? new int[]{2, 3, 3, 1, 2, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 0x9F7: {
                return s.equals("PG") ? new int[]{4, 4, 3, 2, 2, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 0x9F8: {
                return s.equals("PH") ? new int[]{2, 2, 3, 3, 3, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 0x9FB: {
                return s.equals("PK") ? new int[]{3, 2, 3, 3, 2, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 0x9FC: {
                return s.equals("PL") ? new int[]{1, 1, 2, 2, 3, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 0x9FD: {
                return s.equals("PM") ? new int[]{0, 2, 2, 2, 2, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 0xA02: {
                return s.equals("PR") ? new int[]{2, 3, 2, 2, 3, 3} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 0xA03: {
                return s.equals("PS") ? new int[]{3, 4, 1, 2, 2, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 0xA04: {
                return s.equals("PT") ? new int[]{0, 1, 0, 0, 2, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 0xA07: {
                return s.equals("PW") ? new int[]{2, 2, 4, 1, 2, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 0xA09: {
                return s.equals("PY") ? new int[]{2, 2, 3, 2, 2, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 0xA10: {
                return s.equals("QA") ? new int[]{2, 4, 2, 4, 4, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 0xA33: {
                return s.equals("RE") ? new int[]{1, 1, 1, 2, 2, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 0xA3D: {
                return s.equals("RO") ? new int[]{0, 0, 1, 1, 1, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 0xA41: {
                return s.equals("RS") ? new int[]{1, 0, 0, 0, 2, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 0xA43: {
                return s.equals("RU") ? new int[]{0, 0, 0, 1, 2, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 0xA45: {
                return s.equals("RW") ? new int[]{3, 4, 3, 0, 2, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 0xA4E: {
                return s.equals("SA") ? new int[]{2, 2, 1, 1, 2, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 0xA4F: {
                return s.equals("SB") ? new int[]{4, 2, 4, 3, 2, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 0xA50: {
                return s.equals("SC") ? new int[]{4, 3, 0, 2, 2, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 0xA51: {
                return s.equals("SD") ? new int[]{4, 4, 4, 4, 2, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 0xA52: {
                return s.equals("SE") ? new int[]{0, 0, 0, 0, 0, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 0xA54: {
                return s.equals("SG") ? new int[]{1, 1, 2, 3, 1, 4} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 0xA55: {
                return s.equals("SH") ? new int[]{4, 2, 2, 2, 2, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 0xA56: {
                return s.equals("SI") ? new int[]{0, 0, 0, 0, 1, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 0xA57: {
                return s.equals("SJ") ? new int[]{0, 2, 2, 2, 2, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 0xA58: {
                return s.equals("SK") ? new int[]{0, 0, 0, 0, 0, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 0xA59: {
                return s.equals("SL") ? new int[]{4, 3, 4, 1, 2, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 2650: {
                return s.equals("SM") ? new int[]{0, 2, 2, 2, 2, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 0xA5B: {
                return s.equals("SN") ? new int[]{4, 4, 4, 4, 2, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 0xA5C: {
                return s.equals("SO") ? new int[]{3, 2, 3, 3, 2, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 0xA5F: {
                return s.equals("SR") ? new int[]{2, 3, 2, 2, 2, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 0xA60: {
                return s.equals("SS") ? new int[]{4, 2, 2, 2, 2, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 0xA61: {
                return s.equals("ST") ? new int[]{3, 2, 2, 2, 2, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 0xA63: {
                return s.equals("SV") ? new int[]{2, 2, 3, 3, 2, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 0xA65: {
                return s.equals("SX") ? new int[]{2, 2, 1, 0, 2, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 0xA66: {
                return s.equals("SY") ? new int[]{4, 3, 4, 4, 2, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 0xA67: {
                return s.equals("SZ") ? new int[]{4, 3, 2, 4, 2, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 0xA6F: {
                return s.equals("TC") ? new int[]{2, 2, 1, 0, 2, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 0xA70: {
                return s.equals("TD") ? new int[]{4, 4, 4, 4, 2, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 0xA73: {
                return s.equals("TG") ? new int[]{3, 3, 2, 0, 2, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 0xA74: {
                return s.equals("TH") ? new int[]{0, 3, 2, 3, 3, 0} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 0xA76: {
                return s.equals("TJ") ? new int[]{4, 2, 4, 4, 2, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 2680: {
                return s.equals("TL") ? new int[]{4, 3, 4, 4, 2, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 0xA79: {
                return s.equals("TM") ? new int[]{4, 2, 4, 2, 2, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 0xA7A: {
                return s.equals("TN") ? new int[]{2, 2, 1, 1, 2, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 0xA7B: {
                return s.equals("TO") ? new int[]{4, 2, 3, 3, 2, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 0xA7E: {
                return s.equals("TR") ? new int[]{1, 1, 0, 1, 2, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 0xA80: {
                return s.equals("TT") ? new int[]{1, 4, 1, 1, 2, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 2690: {
                return s.equals("TV") ? new int[]{4, 2, 2, 2, 2, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 0xA83: {
                return s.equals("TW") ? new int[]{0, 0, 0, 0, 0, 0} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 0xA86: {
                return s.equals("TZ") ? new int[]{3, 4, 3, 3, 2, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 2700: {
                return s.equals("UA") ? new int[]{0, 3, 1, 1, 2, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 2706: {
                return s.equals("UG") ? new int[]{3, 3, 3, 3, 2, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 0xA9E: {
                return s.equals("US") ? new int[]{1, 1, 2, 2, 3, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 0xAA4: {
                return s.equals("UY") ? new int[]{2, 2, 1, 2, 2, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 0xAA5: {
                return s.equals("UZ") ? new int[]{2, 2, 3, 4, 2, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 0xAAD: {
                return s.equals("VC") ? new int[]{1, 2, 2, 2, 2, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 0xAAF: {
                return s.equals("VE") ? new int[]{4, 4, 4, 4, 2, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 0xAB1: {
                return s.equals("VG") ? new int[]{2, 2, 1, 1, 2, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 0xAB3: {
                return s.equals("VI") ? new int[]{1, 2, 1, 3, 2, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 0xAB8: {
                return s.equals("VN") ? new int[]{0, 3, 3, 4, 2, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 0xABF: {
                return s.equals("VU") ? new int[]{4, 2, 2, 1, 2, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 0xACF: {
                return s.equals("WF") ? new int[]{4, 2, 2, 4, 2, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 2780: {
                return s.equals("WS") ? new int[]{3, 1, 2, 1, 2, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 0xAF3: {
                return s.equals("XK") ? new int[]{1, 1, 1, 1, 2, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 0xB0C: {
                return s.equals("YE") ? new int[]{4, 4, 4, 4, 2, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 0xB1B: {
                return s.equals("YT") ? new int[]{4, 1, 1, 1, 2, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 0xB27: {
                return s.equals("ZA") ? new int[]{3, 3, 1, 1, 1, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 0xB33: {
                return s.equals("ZM") ? new int[]{3, 3, 4, 2, 2, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            case 0xB3D: {
                return s.equals("ZW") ? new int[]{3, 2, 4, 3, 2, 2} : new int[]{2, 2, 2, 2, 2, 2};
            }
            default: {
                return new int[]{2, 2, 2, 2, 2, 2};
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzfs
    public final void zza(zzeq zzeq0, zzev zzev0, boolean z, int v) {
        synchronized(this) {
            if(!z || zzev0.zzb(8)) {
                return;
            }
            this.p += (long)v;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzfs
    public final void zzb(zzeq zzeq0, zzev zzev0, boolean z) {
        boolean z1 = true;
        synchronized(this) {
            if(!z || zzev0.zzb(8)) {
                return;
            }
            if(this.n <= 0) {
                z1 = false;
            }
            zzcw.zzf(z1);
            long v1 = SystemClock.elapsedRealtime();
            int v2 = (int)(v1 - this.o);
            this.r += (long)v2;
            long v3 = this.p;
            this.s += v3;
            if(v2 > 0) {
                this.k.zzb(((int)Math.sqrt(v3)), ((float)v3) * 8000.0f / ((float)v2));
                if(this.r >= 2000L || this.s >= 0x80000L) {
                    this.t = (long)this.k.zza(0.5f);
                }
                this.u = this.t;
                this.j.zzb(v2, this.p, this.t);
                this.o = v1;
                this.p = 0L;
            }
            --this.n;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzfs
    public final void zzc(zzeq zzeq0, zzev zzev0, boolean z) {
    }

    @Override  // com.google.android.gms.internal.ads.zzfs
    public final void zzd(zzeq zzeq0, zzev zzev0, boolean z) {
        synchronized(this) {
            if(!z || zzev0.zzb(8)) {
                return;
            }
            if(this.n == 0) {
                this.o = SystemClock.elapsedRealtime();
            }
            ++this.n;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzvu
    public final void zze(Handler handler0, zzvt zzvt0) {
        zzvt0.getClass();
        this.j.zza(handler0, zzvt0);
    }

    @Override  // com.google.android.gms.internal.ads.zzvu
    public final void zzf(zzvt zzvt0) {
        this.j.zzc(zzvt0);
    }

    public static zzvy zzg(Context context0) {
        synchronized(zzvy.class) {
            if(zzvy.v == null) {
                Context context1 = context0 == null ? null : context0.getApplicationContext();
                int[] arr_v = zzvy.b(zzeg.zzK(context0));
                HashMap hashMap0 = new HashMap(8);
                hashMap0.put(0, 1000000L);
                hashMap0.put(2, ((Long)zzvy.zza.get(arr_v[0])));
                hashMap0.put(3, ((Long)zzvy.zzb.get(arr_v[1])));
                hashMap0.put(4, ((Long)zzvy.zzc.get(arr_v[2])));
                hashMap0.put(5, ((Long)zzvy.zzd.get(arr_v[3])));
                hashMap0.put(10, ((Long)zzvy.zze.get(arr_v[4])));
                hashMap0.put(9, ((Long)zzvy.zzf.get(arr_v[5])));
                hashMap0.put(7, ((Long)zzvy.zza.get(arr_v[0])));
                zzvy.v = new zzvy(context1, hashMap0, zzcx.zza);
            }
            return zzvy.v;
        }
    }

    public static void zzh(zzvy zzvy0, int v) {
        synchronized(zzvy0) {
            int v2 = zzvy0.q;
            if((v2 == 0 || zzvy0.m) && v2 != v) {
                zzvy0.q = v;
                if(v != 0 && v != 1 && v != 8) {
                    zzvy0.t = zzvy0.a(v);
                    long v3 = SystemClock.elapsedRealtime();
                    int v4 = zzvy0.n <= 0 ? 0 : ((int)(v3 - zzvy0.o));
                    long v5 = zzvy0.p;
                    long v6 = zzvy0.t;
                    if(v4 != 0) {
                        zzvy0.u = v6;
                        zzvy0.j.zzb(v4, v5, v6);
                    }
                    else if(v5 != 0L) {
                        zzvy0.u = v6;
                        zzvy0.j.zzb(0, v5, v6);
                    }
                    else if(v6 != zzvy0.u) {
                        zzvy0.u = v6;
                        zzvy0.j.zzb(0, 0L, v6);
                    }
                    zzvy0.o = v3;
                    zzvy0.p = 0L;
                    zzvy0.s = 0L;
                    zzvy0.r = 0L;
                    zzvy0.k.zzc();
                }
            }
        }
    }
}

