package com.google.android.gms.measurement.internal;

import B1.a;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzc;
import com.google.android.gms.internal.measurement.zzd;
import com.google.android.gms.internal.measurement.zzeg;
import com.google.android.gms.internal.measurement.zzei;
import com.google.android.gms.internal.measurement.zzej;
import com.google.android.gms.internal.measurement.zzek;
import com.google.android.gms.internal.measurement.zzel;
import com.google.android.gms.internal.measurement.zzer;
import com.google.android.gms.internal.measurement.zzfb;
import com.google.android.gms.internal.measurement.zzfd;
import com.google.android.gms.internal.measurement.zzfe;
import com.google.android.gms.internal.measurement.zzgs;
import com.google.android.gms.internal.measurement.zzko;
import com.google.android.gms.internal.measurement.zzpc;
import i1.c0;
import i1.c;
import i1.e;
import i1.s;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import jeb.synthetic.TWR;
import p.b;

public final class zzfv extends c0 implements c {
    public final b d;
    public final b e;
    public final b f;
    public final b g;
    public final b h;
    public final b i;
    public final s j;
    public final T1.c k;
    public final b l;
    public final b m;
    public final b n;

    public zzfv(zzlf zzlf0) {
        super(zzlf0);
        this.d = new b();  // 初始化器: Lp/k;-><init>()V
        this.e = new b();  // 初始化器: Lp/k;-><init>()V
        this.f = new b();  // 初始化器: Lp/k;-><init>()V
        this.g = new b();  // 初始化器: Lp/k;-><init>()V
        this.h = new b();  // 初始化器: Lp/k;-><init>()V
        this.l = new b();  // 初始化器: Lp/k;-><init>()V
        this.m = new b();  // 初始化器: Lp/k;-><init>()V
        this.n = new b();  // 初始化器: Lp/k;-><init>()V
        this.i = new b();  // 初始化器: Lp/k;-><init>()V
        this.j = new s(this);
        this.k = new T1.c(this, 28);
    }

    @Override  // i1.c0
    public final void b() {
    }

    public final zzfe c(String s, byte[] arr_b) {
        zzge zzge0 = this.a;
        if(arr_b == null) {
            return zzfe.zzg();
        }
        try {
            zzfe zzfe0 = (zzfe)((zzfd)zzlh.r(zzfe.zze(), arr_b)).zzaE();
            zzes zzes0 = zzge0.zzay().zzj();
            String s1 = null;
            Long long0 = zzfe0.zzs() ? zzfe0.zzc() : null;
            if(zzfe0.zzr()) {
                s1 = "";
            }
            zzes0.zzc("Parsed config. version, gmp_app_id", long0, s1);
            return zzfe0;
        }
        catch(zzko zzko0) {
        }
        catch(RuntimeException runtimeException0) {
            zzge0.zzay().zzk().zzc("Unable to merge remote config. appId", zzeu.d(s), runtimeException0);
            return zzfe.zzg();
        }
        zzge0.zzay().zzk().zzc("Unable to merge remote config. appId", zzeu.d(s), zzko0);
        return zzfe.zzg();
    }

    public final void d(String s, zzfd zzfd0) {
        HashSet hashSet0 = new HashSet();
        b b0 = new b();  // 初始化器: Lp/k;-><init>()V
        b b1 = new b();  // 初始化器: Lp/k;-><init>()V
        b b2 = new b();  // 初始化器: Lp/k;-><init>()V
        if(zzfd0 != null) {
            zzpc.zzc();
            zzge zzge0 = this.a;
            if(zzge0.zzf().zzs(null, zzeh.zzas)) {
                Iterator iterator0 = zzfd0.zzg().iterator();
                while(iterator0.hasNext()) {
                    iterator0.next();
                    hashSet0.add("");
                }
            }
            for(int v = 0; v < zzfd0.zza(); ++v) {
                zzfb zzfb0 = (zzfb)zzfd0.zzb(v).zzby();
                if(zzfb0.zzc().isEmpty()) {
                    zzge0.zzay().zzk().zza("EventConfig contained null event name");
                }
                else {
                    String s1 = zzfb0.zzc();
                    String s2 = zzhb.zzb(zzfb0.zzc());
                    if(!TextUtils.isEmpty(s2)) {
                        zzfb0.zzb(s2);
                        zzfd0.zzd(v, zzfb0);
                    }
                    if(zzfb0.zzf() && zzfb0.zzd()) {
                        b0.put(s1, Boolean.TRUE);
                    }
                    if(zzfb0.zzg() && zzfb0.zze()) {
                        b1.put(zzfb0.zzc(), Boolean.TRUE);
                    }
                    if(zzfb0.zzh()) {
                        if(zzfb0.zza() < 2 || zzfb0.zza() > 0xFFFF) {
                            zzge0.zzay().zzk().zzc("Invalid sampling rate. Event name, sample rate", zzfb0.zzc(), zzfb0.zza());
                        }
                        else {
                            b2.put(zzfb0.zzc(), zzfb0.zza());
                        }
                    }
                }
            }
        }
        this.e.put(s, hashSet0);
        this.f.put(s, b0);
        this.g.put(s, b1);
        this.i.put(s, b2);
    }

    public final void e(String s) {
        a a0;
        String s2;
        String s1;
        byte[] arr_b;
        Cursor cursor0;
        this.a();
        this.zzg();
        Preconditions.checkNotEmpty(s);
        b b0 = this.h;
        if(b0.getOrDefault(s, null) == null) {
            e e0 = this.b.zzi();
            Preconditions.checkNotEmpty(s);
            e0.zzg();
            zzge zzge0 = e0.a;
            e0.a();
            try {
                cursor0 = null;
                cursor0 = e0.r().query("apps", new String[]{"remote_config", "config_last_modified_time", "e_tag"}, "app_id=?", new String[]{s}, null, null, null);
            }
            catch(SQLiteException sQLiteException0) {
                try {
                    zzge0.zzay().zzd().zzc("Error querying remote config. appId", zzeu.d(s), sQLiteException0);
                    goto label_30;
                }
                catch(Throwable throwable0) {
                    goto label_35;
                }
            }
            catch(Throwable throwable0) {
                TWR.safeClose$NT(null, throwable0);
                throw throwable0;
            }
            try {
                if(cursor0.moveToFirst()) {
                    arr_b = cursor0.getBlob(0);
                    s1 = cursor0.getString(1);
                    s2 = zzge0.zzf().zzs(null, zzeh.zzaD) ? cursor0.getString(2) : null;
                    if(cursor0.moveToNext()) {
                        zzge0.zzay().zzd().zzb("Got multiple records for app config, expected one. appId", zzeu.d(s));
                    }
                    goto label_25;
                }
                else {
                    goto label_42;
                }
                goto label_44;
            }
            catch(SQLiteException sQLiteException1) {
                goto label_29;
            }
            catch(Throwable throwable0) {
                goto label_35;
            }
        label_25:
            if(arr_b == null) {
                cursor0.close();
                a0 = null;
                goto label_44;
            label_42:
                cursor0.close();
                a0 = null;
            }
            else {
                try {
                    try {
                        a0 = new a(s1, arr_b, s2);
                        goto label_37;
                    }
                    catch(SQLiteException sQLiteException1) {
                    }
                label_29:
                    zzge0.zzay().zzd().zzc("Error querying remote config. appId", zzeu.d(s), sQLiteException1);
                }
                catch(Throwable throwable0) {
                    goto label_35;
                }
            label_30:
                if(cursor0 != null) {
                    cursor0.close();
                }
                a0 = null;
                goto label_44;
            label_35:
                TWR.safeClose$NT(cursor0, throwable0);
                throw throwable0;
            label_37:
                cursor0.close();
            }
        label_44:
            b b1 = this.n;
            b b2 = this.m;
            b b3 = this.l;
            b b4 = this.d;
            if(a0 == null) {
                b4.put(s, null);
                this.f.put(s, null);
                this.e.put(s, null);
                this.g.put(s, null);
                b0.put(s, null);
                b3.put(s, null);
                b2.put(s, null);
                b1.put(s, null);
                this.i.put(s, null);
                return;
            }
            zzfd zzfd0 = (zzfd)this.c(s, ((byte[])a0.k)).zzby();
            this.d(s, zzfd0);
            b4.put(s, zzfv.g(((zzfe)zzfd0.zzaE())));
            b0.put(s, ((zzfe)zzfd0.zzaE()));
            this.f(s, ((zzfe)zzfd0.zzaE()));
            b3.put(s, zzfd0.zze());
            b2.put(s, ((String)a0.j));
            b1.put(s, ((String)a0.l));
        }
    }

    public final void f(String s, zzfe zzfe0) {
        s s1 = this.j;
        if(zzfe0.zza() != 0) {
            zzge zzge0 = this.a;
            zzge0.zzay().zzj().zzb("EES programs found", zzfe0.zza());
            zzgs zzgs0 = (zzgs)zzfe0.zzm().get(0);
            try {
                zzc zzc0 = new zzc();
                zzc0.zzd("internal.remoteConfig", new zzfp(this, s));
                zzc0.zzd("internal.appMetadata", new zzfq(this, s));
                zzc0.zzd("internal.logger", new zzfr(this));
                zzc0.zzc(zzgs0);
                s1.put(s, zzc0);
                zzge0.zzay().zzj().zzc("EES program loaded for appId, activities", s, zzgs0.zza().zza());
                Iterator iterator0 = zzgs0.zza().zzd().iterator();
                while(iterator0.hasNext()) {
                    iterator0.next();
                    zzge0.zzay().zzj().zzb("EES program activity", "");
                }
            }
            catch(zzd unused_ex) {
                zzge0.zzay().zzd().zzb("Failed to load EES program. appId", s);
            }
            return;
        }
        s1.remove(s);
    }

    public static final b g(zzfe zzfe0) {
        b b0 = new b();  // 初始化器: Lp/k;-><init>()V
        if(zzfe0 != null) {
            Iterator iterator0 = zzfe0.zzn().iterator();
            while(iterator0.hasNext()) {
                iterator0.next();
                b0.put("", "");
            }
        }
        return b0;
    }

    public final int h(String s, String s1) {
        this.zzg();
        this.e(s);
        Map map0 = (Map)this.i.getOrDefault(s, null);
        if(map0 != null) {
            Integer integer0 = (Integer)map0.get(s1);
            return integer0 == null ? 1 : ((int)integer0);
        }
        return 1;
    }

    public final zzfe i(String s) {
        this.a();
        this.zzg();
        Preconditions.checkNotEmpty(s);
        this.e(s);
        return (zzfe)this.h.getOrDefault(s, null);
    }

    public final String j(String s) {
        this.zzg();
        this.e(s);
        return (String)this.l.getOrDefault(s, null);
    }

    public final boolean k(String s) {
        this.zzg();
        zzfe zzfe0 = this.i(s);
        return zzfe0 == null ? false : zzfe0.zzq();
    }

    public final boolean l(String s, String s1) {
        this.zzg();
        this.e(s);
        if("ecommerce_purchase".equals(s1)) {
            return true;
        }
        if(!"purchase".equals(s1) && !"refund".equals(s1)) {
            Map map0 = (Map)this.g.getOrDefault(s, null);
            if(map0 != null) {
                Boolean boolean0 = (Boolean)map0.get(s1);
                return boolean0 == null ? false : boolean0.booleanValue();
            }
            return false;
        }
        return true;
    }

    public final boolean m(String s, String s1) {
        this.zzg();
        this.e(s);
        if("1".equals(this.zza(s, "measurement.upload.blacklist_internal")) && zzln.y(s1)) {
            return true;
        }
        if("1".equals(this.zza(s, "measurement.upload.blacklist_public")) && zzln.z(s1)) {
            return true;
        }
        Map map0 = (Map)this.f.getOrDefault(s, null);
        if(map0 != null) {
            Boolean boolean0 = (Boolean)map0.get(s1);
            return boolean0 == null ? false : boolean0.booleanValue();
        }
        return false;
    }

    public final boolean n(String s, String s1, String s2, byte[] arr_b) {
        byte[] arr_b1;
        SQLiteDatabase sQLiteDatabase2;
        int v4;
        com.google.android.gms.internal.measurement.zzeh zzeh0;
        zzge zzge0;
        boolean z;
        b b2;
        this.a();
        this.zzg();
        Preconditions.checkNotEmpty(s);
        zzfd zzfd0 = (zzfd)this.c(s, arr_b).zzby();
        if(zzfd0 == null) {
            return false;
        }
        this.d(s, zzfd0);
        this.f(s, ((zzfe)zzfd0.zzaE()));
        zzfe zzfe0 = (zzfe)zzfd0.zzaE();
        b b0 = this.h;
        b0.put(s, zzfe0);
        String s3 = zzfd0.zze();
        this.l.put(s, s3);
        this.m.put(s, s1);
        this.n.put(s, s2);
        b b1 = zzfv.g(((zzfe)zzfd0.zzaE()));
        this.d.put(s, b1);
        zzlf zzlf0 = this.b;
        e e0 = zzlf0.zzi();
        ArrayList arrayList0 = new ArrayList(zzfd0.zzf());
        e0.getClass();
        Preconditions.checkNotNull(arrayList0);
        int v = 0;
        while(v < arrayList0.size()) {
            zzeg zzeg0 = (zzeg)((com.google.android.gms.internal.measurement.zzeh)arrayList0.get(v)).zzby();
            if(zzeg0.zza() == 0) {
                b2 = b0;
            }
            else {
                b2 = b0;
                for(int v1 = 0; v1 < zzeg0.zza(); ++v1) {
                    zzei zzei0 = (zzei)zzeg0.zze(v1).zzby();
                    zzei zzei1 = (zzei)zzei0.zzaB();
                    String s4 = zzhb.zzb(zzei0.zze());
                    if(s4 == null) {
                        z = false;
                    }
                    else {
                        zzei1.zzb(s4);
                        z = true;
                    }
                    for(int v2 = 0; v2 < zzei0.zza(); ++v2) {
                        zzel zzel0 = zzei0.zzd(v2);
                        String s5 = zzip.zzb("", zzhc.zza, zzhc.zzb);
                        if(s5 != null) {
                            zzek zzek0 = (zzek)zzel0.zzby();
                            zzek0.zza(s5);
                            zzei1.zzc(v2, ((zzel)zzek0.zzaE()));
                            z = true;
                        }
                    }
                    if(z) {
                        zzeg0.zzc(v1, zzei1);
                        arrayList0.set(v, ((com.google.android.gms.internal.measurement.zzeh)zzeg0.zzaE()));
                    }
                }
            }
            if(zzeg0.zzb() != 0) {
                for(int v3 = 0; v3 < zzeg0.zzb(); ++v3) {
                    com.google.android.gms.internal.measurement.zzes zzes0 = zzeg0.zzf(v3);
                    String s6 = zzip.zzb("", zzhd.zza, zzhd.zzb);
                    if(s6 != null) {
                        zzer zzer0 = (zzer)zzes0.zzby();
                        zzer0.zza(s6);
                        zzeg0.zzd(v3, zzer0);
                        arrayList0.set(v, ((com.google.android.gms.internal.measurement.zzeh)zzeg0.zzaE()));
                    }
                }
            }
            ++v;
            b0 = b2;
        }
        e0.a();
        e0.zzg();
        Preconditions.checkNotEmpty(s);
        Preconditions.checkNotNull(arrayList0);
        SQLiteDatabase sQLiteDatabase0 = e0.r();
        sQLiteDatabase0.beginTransaction();
        try {
            e0.a();
            e0.zzg();
            Preconditions.checkNotEmpty(s);
            SQLiteDatabase sQLiteDatabase1 = e0.r();
            sQLiteDatabase1.delete("property_filters", "app_id=?", new String[]{s});
            sQLiteDatabase1.delete("event_filters", "app_id=?", new String[]{s});
            Iterator iterator0 = arrayList0.iterator();
        alab1:
            while(true) {
            label_83:
                boolean z1 = iterator0.hasNext();
                zzge0 = e0.a;
                if(!z1) {
                    goto label_142;
                }
                Object object0 = iterator0.next();
                zzeh0 = (com.google.android.gms.internal.measurement.zzeh)object0;
                e0.a();
                e0.zzg();
                Preconditions.checkNotEmpty(s);
                Preconditions.checkNotNull(zzeh0);
                if(zzeh0.zzk()) {
                    v4 = zzeh0.zza();
                    for(Object object1: zzeh0.zzg()) {
                        if(!((zzej)object1).zzp()) {
                            zzge0.zzay().zzk().zzc("Event filter with no ID. Audience definition ignored. appId, audienceId", zzeu.d(s), v4);
                            continue alab1;
                        }
                        if(false) {
                            break;
                        }
                    }
                    for(Object object2: zzeh0.zzh()) {
                        if(!((com.google.android.gms.internal.measurement.zzes)object2).zzj()) {
                            zzge0.zzay().zzk().zzc("Property filter with no ID. Audience definition ignored. appId, audienceId", zzeu.d(s), v4);
                            continue alab1;
                        }
                        if(false) {
                            break;
                        }
                    }
                    Iterator iterator3 = zzeh0.zzg().iterator();
                    if(iterator3.hasNext()) {
                        Object object3 = iterator3.next();
                        zzej zzej0 = (zzej)object3;
                        e0.a();
                        e0.zzg();
                        Preconditions.checkNotEmpty(s);
                        Preconditions.checkNotNull(zzej0);
                        zzge0.zzay().zzk().zzd("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", zzeu.d(s), v4, String.valueOf((zzej0.zzp() ? zzej0.zzb() : null)));
                        sQLiteDatabase2 = sQLiteDatabase0;
                        goto label_129;
                    }
                    break;
                }
                goto label_137;
            }
        }
        catch(Throwable throwable0) {
            sQLiteDatabase2 = sQLiteDatabase0;
            sQLiteDatabase2.endTransaction();
            throw throwable0;
        }
        try {
            sQLiteDatabase2 = sQLiteDatabase0;
            Iterator iterator4 = zzeh0.zzh().iterator();
            if(iterator4.hasNext()) {
                Object object4 = iterator4.next();
                com.google.android.gms.internal.measurement.zzes zzes1 = (com.google.android.gms.internal.measurement.zzes)object4;
                e0.a();
                e0.zzg();
                Preconditions.checkNotEmpty(s);
                Preconditions.checkNotNull(zzes1);
                zzge0.zzay().zzk().zzd("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", zzeu.d(s), v4, String.valueOf((zzes1.zzj() ? zzes1.zza() : null)));
            label_129:
                e0.a();
                e0.zzg();
                Preconditions.checkNotEmpty(s);
                SQLiteDatabase sQLiteDatabase3 = e0.r();
                sQLiteDatabase3.delete("property_filters", "app_id=? and audience_id=?", new String[]{s, String.valueOf(v4)});
                sQLiteDatabase3.delete("event_filters", "app_id=? and audience_id=?", new String[]{s, String.valueOf(v4)});
            }
            sQLiteDatabase0 = sQLiteDatabase2;
            goto label_83;
        }
        catch(Throwable throwable0) {
            sQLiteDatabase2.endTransaction();
            throw throwable0;
        }
        try {
        label_137:
            zzge0.zzay().zzk().zzb("Audience with no ID. appId", zzeu.d(s));
            goto label_83;
        }
        catch(Throwable throwable0) {
            sQLiteDatabase2 = sQLiteDatabase0;
            sQLiteDatabase2.endTransaction();
            throw throwable0;
        }
        try {
        label_142:
            sQLiteDatabase2 = sQLiteDatabase0;
            ArrayList arrayList1 = new ArrayList();
            for(Object object5: arrayList0) {
                com.google.android.gms.internal.measurement.zzeh zzeh1 = (com.google.android.gms.internal.measurement.zzeh)object5;
                arrayList1.add((zzeh1.zzk() ? zzeh1.zza() : null));
            }
            Preconditions.checkNotEmpty(s);
            e0.a();
            e0.zzg();
            SQLiteDatabase sQLiteDatabase4 = e0.r();
            try {
                long v5 = e0.m("select count(1) from audience_filter_values where app_id=?", new String[]{s});
            }
            catch(SQLiteException sQLiteException0) {
                zzge0.zzay().zzd().zzc("Database error querying filters. appId", zzeu.d(s), sQLiteException0);
                sQLiteDatabase2.setTransactionSuccessful();
                goto label_176;
            }
            int v6 = Math.max(0, Math.min(2000, zzge0.zzf().zze(s, zzeh.zzE)));
            if(v5 > ((long)v6)) {
                ArrayList arrayList2 = new ArrayList();
                for(int v7 = 0; true; ++v7) {
                    if(v7 >= arrayList1.size()) {
                        sQLiteDatabase4.delete("audience_filter_values", "audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in " + ("(" + TextUtils.join(",", arrayList2) + ")") + " order by rowid desc limit -1 offset ?)", new String[]{s, Integer.toString(v6)});
                        break;
                    }
                    Integer integer0 = (Integer)arrayList1.get(v7);
                    if(integer0 == null) {
                        break;
                    }
                    arrayList2.add(Integer.toString(((int)integer0)));
                }
            }
            sQLiteDatabase2.setTransactionSuccessful();
        }
        catch(Throwable throwable0) {
            sQLiteDatabase2.endTransaction();
            throw throwable0;
        }
    label_176:
        sQLiteDatabase2.endTransaction();
        try {
            zzfd0.zzc();
            arr_b1 = ((zzfe)zzfd0.zzaE()).zzbv();
        }
        catch(RuntimeException runtimeException0) {
            this.a.zzay().zzk().zzc("Unable to serialize reduced-size config. Storing full config instead. appId", zzeu.d(s), runtimeException0);
            arr_b1 = arr_b;
        }
        e e1 = zzlf0.zzi();
        Preconditions.checkNotEmpty(s);
        e1.zzg();
        e1.a();
        ContentValues contentValues0 = new ContentValues();
        contentValues0.put("remote_config", arr_b1);
        contentValues0.put("config_last_modified_time", s1);
        zzge zzge1 = e1.a;
        if(zzge1.zzf().zzs(null, zzeh.zzaD)) {
            contentValues0.put("e_tag", s2);
        }
        try {
            if(((long)e1.r().update("apps", contentValues0, "app_id = ?", new String[]{s})) == 0L) {
                zzge1.zzay().zzd().zzb("Failed to update remote config (got 0). appId", zzeu.d(s));
            }
        }
        catch(SQLiteException sQLiteException1) {
            zzge1.zzay().zzd().zzc("Error storing remote config. appId", zzeu.d(s), sQLiteException1);
        }
        b0.put(s, ((zzfe)zzfd0.zzaE()));
        return true;
    }

    @Override  // i1.c
    public final String zza(String s, String s1) {
        this.zzg();
        this.e(s);
        Map map0 = (Map)this.d.getOrDefault(s, null);
        return map0 == null ? null : ((String)map0.get(s1));
    }

    public final boolean zzo(String s) {
        if(TextUtils.isEmpty(s)) {
            return false;
        }
        zzfe zzfe0 = (zzfe)this.h.getOrDefault(s, null);
        return zzfe0 == null ? false : zzfe0.zza() != 0;
    }
}

