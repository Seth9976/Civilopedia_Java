package i1;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzei;
import com.google.android.gms.internal.measurement.zzej;
import com.google.android.gms.internal.measurement.zzer;
import com.google.android.gms.internal.measurement.zzes;
import com.google.android.gms.internal.measurement.zzfo;
import com.google.android.gms.internal.measurement.zzfq;
import com.google.android.gms.internal.measurement.zzfs;
import com.google.android.gms.internal.measurement.zzgg;
import com.google.android.gms.internal.measurement.zzgh;
import com.google.android.gms.internal.measurement.zzgj;
import com.google.android.gms.internal.measurement.zzgl;
import com.google.android.gms.internal.measurement.zzoe;
import com.google.android.gms.measurement.internal.zzeh;
import com.google.android.gms.measurement.internal.zzeu;
import com.google.android.gms.measurement.internal.zzge;
import com.google.android.gms.measurement.internal.zzlf;
import com.google.android.gms.measurement.internal.zzlh;
import java.io.IOException;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import jeb.synthetic.TWR;
import p.h;
import p.k;

public final class b extends c0 {
    public String d;
    public HashSet e;
    public p.b f;
    public Long g;
    public Long h;

    @Override  // i1.c0
    public final void b() {
    }

    public final ArrayList c(String s, List list0, List list1, Long long0, Long long1) {
        boolean z6;
        l0 l02;
        Integer integer8;
        Map map8;
        List list7;
        Integer integer6;
        p.b b7;
        zzes zzes0;
        Cursor cursor6;
        Iterator iterator11;
        Cursor cursor5;
        Integer integer5;
        Map map6;
        g g3;
        Iterator iterator9;
        List list5;
        Integer integer3;
        zzej zzej1;
        Cursor cursor4;
        k0 k01;
        g g2;
        Cursor cursor3;
        g g1;
        Iterator iterator4;
        zzlf zzlf1;
        Map map4;
        Map map3;
        zzgh zzgh0;
        Map map2;
        Cursor cursor2;
        Map map1;
        List list2;
        Integer integer0;
        zzej zzej0;
        Cursor cursor1;
        boolean z2;
        Cursor cursor0;
        Preconditions.checkNotEmpty(s);
        Preconditions.checkNotNull(list0);
        Preconditions.checkNotNull(list1);
        this.d = s;
        this.e = new HashSet();
        this.f = new p.b();
        this.g = long0;
        this.h = long1;
        Iterator iterator0 = list0.iterator();
        while(iterator0.hasNext()) {
            iterator0.next();
        }
        zzoe.zzc();
        zzge zzge0 = this.a;
        boolean z = zzge0.zzf().zzs(this.d, zzeh.zzW);
        zzoe.zzc();
        boolean z1 = zzge0.zzf().zzs(this.d, zzeh.zzV);
        zzlf zzlf0 = this.b;
        Map map0 = Collections.emptyMap();
        if(!z1 || !z) {
            z2 = z;
        }
        else {
            e e0 = zzlf0.zzi();
            String s1 = this.d;
            Preconditions.checkNotEmpty(s1);
            p.b b0 = new p.b();
            SQLiteDatabase sQLiteDatabase0 = e0.r();
            zzge zzge1 = e0.a;
            try {
                cursor0 = sQLiteDatabase0.query("event_filters", new String[]{"audience_id", "data"}, "app_id=?", new String[]{s1}, null, null, null);
            }
            catch(SQLiteException sQLiteException0) {
                z2 = true;
                cursor0 = null;
                goto label_69;
            }
            catch(Throwable throwable0) {
                cursor1 = null;
                goto label_74;
            }
            try {
                try {
                    if(cursor0.moveToFirst()) {
                        while(true) {
                        label_36:
                            byte[] arr_b = cursor0.getBlob(1);
                            try {
                                zzej0 = (zzej)((zzei)zzlh.r(zzej.zzc(), arr_b)).zzaE();
                                goto label_43;
                            }
                            catch(IOException iOException0) {
                            }
                            goto label_40;
                        }
                    }
                    else {
                        goto label_63;
                    }
                    goto label_82;
                }
                catch(SQLiteException sQLiteException0) {
                    goto label_50;
                }
                try {
                label_40:
                    z2 = true;
                    zzge1.zzay().zzd().zzc("Failed to merge filter. appId", zzeu.d(s1), iOException0);
                    goto label_59;
                }
                catch(SQLiteException sQLiteException0) {
                    goto label_69;
                }
                try {
                label_43:
                    if(zzej0.zzo()) {
                        integer0 = cursor0.getInt(0);
                        list2 = (List)b0.get(integer0);
                        goto label_52;
                    }
                    else {
                        z2 = true;
                    }
                    goto label_59;
                }
                catch(SQLiteException sQLiteException0) {
                    try {
                    label_50:
                        z2 = true;
                    }
                    catch(SQLiteException sQLiteException0) {
                    }
                    goto label_69;
                }
            }
            catch(Throwable throwable0) {
                goto label_67;
            }
        label_52:
            if(list2 == null) {
                try {
                    List list3 = new ArrayList();
                    b0.put(integer0, list3);
                    goto label_58;
                label_56:
                    z2 = true;
                    list3 = list2;
                label_58:
                    list3.add(zzej0);
                label_59:
                    if(cursor0.moveToNext()) {
                        goto label_36;
                    }
                    goto label_60;
                }
                catch(SQLiteException sQLiteException0) {
                    goto label_69;
                }
                catch(Throwable throwable0) {
                    goto label_67;
                }
            }
            else {
                goto label_56;
            }
            goto label_58;
        label_60:
            cursor0.close();
            map1 = b0;
            goto label_82;
            try {
                try {
                label_63:
                    z2 = true;
                    map0 = Collections.emptyMap();
                    goto label_77;
                label_67:
                    goto label_73;
                }
                catch(SQLiteException sQLiteException0) {
                }
            label_69:
                zzge1.zzay().zzd().zzc("Database error querying filters. appId", zzeu.d(s1), sQLiteException0);
                map0 = Collections.emptyMap();
                if(cursor0 != null) {
                    goto label_72;
                }
                goto label_78;
            }
            catch(Throwable throwable0) {
                goto label_67;
            }
        label_72:
            goto label_77;
        label_73:
            cursor1 = cursor0;
        label_74:
            if(cursor1 != null) {
                cursor1.close();
            }
            throw throwable0;
        label_77:
            cursor0.close();
        }
    label_78:
        map1 = map0;
    label_82:
        e e1 = zzlf0.zzi();
        String s2 = this.d;
        e1.a();
        zzge zzge2 = e1.a;
        e1.zzg();
        Preconditions.checkNotEmpty(s2);
        SQLiteDatabase sQLiteDatabase1 = e1.r();
        try {
            cursor2 = null;
            cursor2 = sQLiteDatabase1.query("audience_filter_values", new String[]{"audience_id", "current_results"}, "app_id=?", new String[]{s2}, null, null, null);
            if(cursor2.moveToFirst()) {
                map2 = new p.b();
                while(true) {
                    int v = cursor2.getInt(0);
                    byte[] arr_b1 = cursor2.getBlob(1);
                    try {
                        zzgh0 = (zzgh)((zzgg)zzlh.r(zzgh.zzf(), arr_b1)).zzaE();
                    }
                    catch(IOException iOException1) {
                        zzge2.zzay().zzd().zzd("Failed to merge filter results. appId, audienceId, error", zzeu.d(s2), v, iOException1);
                        goto label_101;
                    }
                    ((k)map2).put(v, zzgh0);
                label_101:
                    if(cursor2.moveToNext()) {
                        continue;
                    }
                    goto label_102;
                }
            }
            else {
                goto label_104;
            }
            goto label_118;
        }
        catch(SQLiteException sQLiteException1) {
            goto label_107;
        }
        catch(Throwable throwable1) {
            goto label_114;
        }
    label_102:
        cursor2.close();
        goto label_118;
        try {
            try {
            label_104:
                map3 = Collections.emptyMap();
                goto label_116;
            }
            catch(SQLiteException sQLiteException1) {
            }
        label_107:
            zzge2.zzay().zzd().zzc("Database error querying filter results. appId", zzeu.d(s2), sQLiteException1);
            map4 = Collections.emptyMap();
            if(cursor2 != null) {
                goto label_110;
            }
            goto label_111;
        }
        catch(Throwable throwable1) {
            goto label_114;
        }
    label_110:
        cursor2.close();
    label_111:
        map2 = map4;
        goto label_118;
    label_114:
        TWR.safeClose$NT(cursor2, throwable1);
        throw throwable1;
    label_116:
        cursor2.close();
        map2 = map3;
    label_118:
        if(!map2.isEmpty()) {
            Iterator iterator1 = new HashSet(map2.keySet()).iterator();
            while(iterator1.hasNext()) {
                Object object0 = iterator1.next();
                Integer integer1 = (Integer)object0;
                integer1.getClass();
                zzgh zzgh1 = (zzgh)map2.get(integer1);
                BitSet bitSet0 = new BitSet();
                BitSet bitSet1 = new BitSet();
                p.b b1 = new p.b();
                if(zzgh1 != null && zzgh1.zza() != 0) {
                    for(Object object1: zzgh1.zzj()) {
                        zzfq zzfq0 = (zzfq)object1;
                        if(zzfq0.zzh()) {
                            b1.put(zzfq0.zza(), (zzfq0.zzg() ? zzfq0.zzb() : null));
                        }
                    }
                }
                p.b b2 = new p.b();
                if(zzgh1 != null && zzgh1.zzc() != 0) {
                    for(Object object2: zzgh1.zzm()) {
                        zzgj zzgj0 = (zzgj)object2;
                        if(zzgj0.zzi() && zzgj0.zza() > 0) {
                            b2.put(zzgj0.zzb(), zzgj0.zzc(zzgj0.zza() - 1));
                        }
                    }
                }
                if(zzgh1 != null) {
                    int v1 = 0;
                    while(v1 < zzgh1.zzd() * 0x40) {
                        if(zzlh.y(v1, zzgh1.zzn())) {
                            iterator4 = iterator1;
                            zzge0.zzay().zzj().zzc("Filter already evaluated. audience ID, filter ID", integer1, v1);
                            bitSet1.set(v1);
                            if(zzlh.y(v1, zzgh1.zzk())) {
                                bitSet0.set(v1);
                                goto label_159;
                            }
                        }
                        else {
                            iterator4 = iterator1;
                        }
                        b1.remove(v1);
                    label_159:
                        ++v1;
                        iterator1 = iterator4;
                    }
                }
                zzgh zzgh2 = (zzgh)map2.get(integer1);
                if(z1 && z2) {
                    List list4 = (List)map1.get(integer1);
                    if(list4 != null && this.h != null && this.g != null) {
                        for(Object object3: list4) {
                            int v2 = ((zzej)object3).zzb();
                            long v3 = ((long)this.h) / 1000L;
                            if(((zzej)object3).zzm()) {
                                v3 = ((long)this.g) / 1000L;
                            }
                            Integer integer2 = v2;
                            if(b1.containsKey(integer2)) {
                                b1.put(integer2, v3);
                            }
                            if(b2.containsKey(integer2)) {
                                b2.put(integer2, v3);
                            }
                        }
                    }
                }
                j0 j00 = new j0(this, this.d, zzgh2, bitSet0, bitSet1, b1, b2);
                this.f.put(integer1, j00);
            }
        }
        zzlf1 = zzlf0;
        if(!list0.isEmpty()) {
            k0 k00 = new k0(this);
            p.b b3 = new p.b();
            for(Object object4: list0) {
                zzfs zzfs0 = (zzfs)object4;
                zzfs zzfs1 = k00.a(zzfs0, this.d);
                if(zzfs1 != null) {
                    e e2 = zzlf1.zzi();
                    String s3 = this.d;
                    g g0 = e2.v(s3, "");
                    if(g0 == null) {
                        e2.a.zzay().zzk().zzc("Event aggregate wasn\'t created during raw event logging. appId, event", zzeu.d(s3), e2.a.zzj().d(""));
                        g1 = new g(s3, "", 1L, 1L, 1L, zzfs0.zzd(), 0L, null, null, null, null);
                    }
                    else {
                        g1 = new g(g0.a, g0.b, g0.c + 1L, g0.d + 1L, g0.e + 1L, g0.f, g0.g, g0.h, g0.i, g0.j, g0.k);
                    }
                    zzlf1.zzi().f(g1);
                    Map map5 = (Map)b3.get("");
                    if(map5 == null) {
                        e e3 = zzlf1.zzi();
                        String s4 = this.d;
                        e3.a();
                        zzge zzge3 = e3.a;
                        e3.zzg();
                        Preconditions.checkNotEmpty(s4);
                        Preconditions.checkNotEmpty("");
                        p.b b4 = new p.b();
                        SQLiteDatabase sQLiteDatabase2 = e3.r();
                        try {
                            cursor3 = sQLiteDatabase2.query("event_filters", new String[]{"audience_id", "data"}, "app_id=? AND event_name=?", new String[]{s4, ""}, null, null, null);
                        }
                        catch(SQLiteException sQLiteException2) {
                            g2 = g1;
                            k01 = k00;
                            cursor3 = null;
                            goto label_262;
                        }
                        catch(Throwable throwable2) {
                            cursor4 = null;
                            goto label_267;
                        }
                        try {
                            if(cursor3.moveToFirst()) {
                                goto label_227;
                            }
                            else {
                                goto label_255;
                            }
                            goto label_271;
                        }
                        catch(SQLiteException sQLiteException2) {
                        }
                        catch(Throwable throwable2) {
                            goto label_260;
                        }
                        g2 = g1;
                        goto label_239;
                    label_227:
                        g2 = g1;
                        while(true) {
                            try {
                                try {
                                    byte[] arr_b2 = cursor3.getBlob(1);
                                    try {
                                        zzej1 = (zzej)((zzei)zzlh.r(zzej.zzc(), arr_b2)).zzaE();
                                        goto label_235;
                                    }
                                    catch(IOException iOException2) {
                                    }
                                }
                                catch(SQLiteException sQLiteException2) {
                                    goto label_239;
                                }
                                try {
                                    k01 = k00;
                                    zzge3.zzay().zzd().zzc("Failed to merge filter. appId", zzeu.d(s4), iOException2);
                                    goto label_249;
                                }
                                catch(SQLiteException sQLiteException2) {
                                    goto label_262;
                                }
                                try {
                                label_235:
                                    integer3 = cursor3.getInt(0);
                                    list5 = (List)b4.get(integer3);
                                }
                                catch(SQLiteException sQLiteException2) {
                                    try {
                                    label_239:
                                        k01 = k00;
                                    }
                                    catch(SQLiteException sQLiteException2) {
                                    }
                                    goto label_262;
                                }
                            }
                            catch(Throwable throwable2) {
                                goto label_260;
                            }
                            if(list5 == null) {
                                try {
                                    k01 = k00;
                                    List list6 = new ArrayList();
                                    b4.put(integer3, list6);
                                    goto label_248;
                                label_246:
                                    k01 = k00;
                                    list6 = list5;
                                label_248:
                                    list6.add(zzej1);
                                label_249:
                                    if(!cursor3.moveToNext()) {
                                        goto label_250;
                                    }
                                    goto label_253;
                                }
                                catch(SQLiteException sQLiteException2) {
                                    goto label_262;
                                }
                                catch(Throwable throwable2) {
                                    goto label_260;
                                }
                            }
                            else {
                                goto label_246;
                            }
                            goto label_248;
                        label_250:
                            cursor3.close();
                            map5 = b4;
                            goto label_271;
                        label_253:
                            k00 = k01;
                        }
                        try {
                            try {
                            label_255:
                                g2 = g1;
                                k01 = k00;
                                map5 = Collections.emptyMap();
                                goto label_270;
                            label_260:
                                goto label_266;
                            }
                            catch(SQLiteException sQLiteException2) {
                            }
                        label_262:
                            zzge3.zzay().zzd().zzc("Database error querying filters. appId", zzeu.d(s4), sQLiteException2);
                            map5 = Collections.emptyMap();
                            if(cursor3 == null) {
                                goto label_265;
                            }
                            goto label_270;
                        }
                        catch(Throwable throwable2) {
                            goto label_260;
                        }
                    label_265:
                        goto label_271;
                    label_266:
                        cursor4 = cursor3;
                    label_267:
                        if(cursor4 != null) {
                            cursor4.close();
                        }
                        throw throwable2;
                    label_270:
                        cursor3.close();
                    label_271:
                        b3.put("", map5);
                    }
                    else {
                        g2 = g1;
                        k01 = k00;
                    }
                    Iterator iterator7 = map5.keySet().iterator();
                    while(iterator7.hasNext()) {
                        Object object5 = iterator7.next();
                        Integer integer4 = (Integer)object5;
                        int v4 = (int)integer4;
                        if(this.e.contains(integer4)) {
                            zzge0.zzay().zzj().zzb("Skipping failed audience ID", integer4);
                        }
                        else {
                            boolean z3 = true;
                            for(Object object6: ((List)map5.get(integer4))) {
                                iterator9 = iterator7;
                                g3 = g2;
                                map6 = map5;
                                integer5 = integer4;
                                l0 l00 = new l0(this, this.d, v4, ((zzej)object6), 0);
                                Long long2 = this.g;
                                Long long3 = this.h;
                                j0 j01 = (j0)this.f.getOrDefault(integer5, null);
                                boolean z4 = j01 == null ? false : j01.d.get(((zzej)object6).zzb());
                                z3 = l00.a(long2, long3, zzfs1, g3.c, g3, z4);
                                if(z3) {
                                    this.d(integer5).b(l00);
                                    integer4 = integer5;
                                    map5 = map6;
                                    g2 = g3;
                                    iterator7 = iterator9;
                                    continue;
                                }
                                this.e.add(integer5);
                                goto label_310;
                            }
                            iterator9 = iterator7;
                            g3 = g2;
                            map6 = map5;
                            integer5 = integer4;
                        label_310:
                            if(!z3) {
                                this.e.add(integer5);
                            }
                            map5 = map6;
                            g2 = g3;
                            iterator7 = iterator9;
                        }
                    }
                    k00 = k01;
                }
            }
        }
        if(!list1.isEmpty()) {
            p.b b5 = new p.b();
            Iterator iterator10 = list1.iterator();
            while(iterator10.hasNext()) {
                Object object7 = iterator10.next();
                zzgl zzgl0 = (zzgl)object7;
                Map map7 = (Map)b5.get("");
                if(map7 == null) {
                    e e4 = zzlf1.zzi();
                    String s5 = this.d;
                    e4.a();
                    zzge zzge4 = e4.a;
                    e4.zzg();
                    Preconditions.checkNotEmpty(s5);
                    Preconditions.checkNotEmpty("");
                    p.b b6 = new p.b();
                    SQLiteDatabase sQLiteDatabase3 = e4.r();
                    try {
                        cursor5 = sQLiteDatabase3.query("property_filters", new String[]{"audience_id", "data"}, "app_id=? AND property_name=?", new String[]{s5, ""}, null, null, null);
                    }
                    catch(SQLiteException sQLiteException3) {
                        iterator11 = iterator10;
                        cursor5 = null;
                        goto label_380;
                    }
                    catch(Throwable throwable3) {
                        cursor6 = null;
                        goto label_385;
                    }
                    try {
                        try {
                            if(cursor5.moveToFirst()) {
                                while(true) {
                                label_345:
                                    byte[] arr_b3 = cursor5.getBlob(1);
                                    try {
                                        zzes0 = (zzes)((zzer)zzlh.r(zzes.zzc(), arr_b3)).zzaE();
                                        goto label_353;
                                    }
                                    catch(IOException iOException3) {
                                    }
                                    goto label_349;
                                }
                            }
                            else {
                                goto label_374;
                            }
                            goto label_389;
                        }
                        catch(SQLiteException sQLiteException3) {
                            goto label_372;
                        }
                        try {
                        label_349:
                            iterator11 = iterator10;
                            b7 = b6;
                            zzge4.zzay().zzd().zzc("Failed to merge filter", zzeu.d(s5), iOException3);
                            goto label_364;
                        }
                        catch(SQLiteException sQLiteException3) {
                            goto label_380;
                        }
                        try {
                        label_353:
                            integer6 = cursor5.getInt(0);
                            list7 = (List)b6.get(integer6);
                            if(list7 == null) {
                                goto label_356;
                            }
                            else {
                                goto label_360;
                            }
                            goto label_362;
                        }
                        catch(SQLiteException sQLiteException3) {
                            goto label_372;
                        }
                        try {
                        label_356:
                            iterator11 = iterator10;
                            List list8 = new ArrayList();
                            b6.put(integer6, list8);
                            goto label_362;
                        label_360:
                            iterator11 = iterator10;
                            list8 = list7;
                        label_362:
                            list8.add(zzes0);
                            b7 = b6;
                        label_364:
                            if(!cursor5.moveToNext()) {
                                goto label_365;
                            }
                            goto label_368;
                        }
                        catch(SQLiteException sQLiteException3) {
                            goto label_380;
                        }
                    }
                    catch(Throwable throwable3) {
                        goto label_378;
                    }
                label_365:
                    cursor5.close();
                    map7 = b7;
                    goto label_389;
                    try {
                        try {
                        label_368:
                            iterator10 = iterator11;
                            b6 = b7;
                            goto label_345;
                        }
                        catch(SQLiteException sQLiteException3) {
                            try {
                            label_372:
                                iterator11 = iterator10;
                                goto label_380;
                            label_374:
                                iterator11 = iterator10;
                                map7 = Collections.emptyMap();
                                goto label_388;
                            label_378:
                                goto label_384;
                            }
                            catch(SQLiteException sQLiteException3) {
                            }
                        }
                    label_380:
                        zzge4.zzay().zzd().zzc("Database error querying filters. appId", zzeu.d(s5), sQLiteException3);
                        map7 = Collections.emptyMap();
                        if(cursor5 == null) {
                            goto label_383;
                        }
                        goto label_388;
                    }
                    catch(Throwable throwable3) {
                        goto label_378;
                    }
                label_383:
                    goto label_389;
                label_384:
                    cursor6 = cursor5;
                label_385:
                    if(cursor6 != null) {
                        cursor6.close();
                    }
                    throw throwable3;
                label_388:
                    cursor5.close();
                label_389:
                    b5.put("", map7);
                }
                else {
                    iterator11 = iterator10;
                }
                for(Object object8: map7.keySet()) {
                    Integer integer7 = (Integer)object8;
                    int v5 = (int)integer7;
                    if(this.e.contains(integer7)) {
                        zzge0.zzay().zzj().zzb("Skipping failed audience ID", integer7);
                        break;
                    }
                    boolean z5 = true;
                    for(Object object9: ((List)map7.get(integer7))) {
                        zzes zzes1 = (zzes)object9;
                        if(Log.isLoggable(zzge0.zzay().zzq(), 2)) {
                            zzge0.zzay().zzj().zzd("Evaluating filter. audience, filter, property", integer7, (zzes1.zzj() ? zzes1.zza() : null), zzge0.zzj().f(""));
                            zzge0.zzay().zzj().zzb("Filter definition", zzlf1.zzu().t(zzes1));
                        }
                        if(!zzes1.zzj() || zzes1.zza() > 0x100) {
                            map8 = map7;
                            zzge0.zzay().zzk().zzc("Invalid property filter ID. appId, id", zzeu.d(this.d), String.valueOf((zzes1.zzj() ? zzes1.zza() : null)));
                            this.e.add(integer7);
                            goto label_438;
                        }
                        map8 = map7;
                        integer8 = integer7;
                        l0 l01 = new l0(this, this.d, v5, zzes1, 1);
                        Long long4 = this.g;
                        Long long5 = this.h;
                        int v6 = zzes1.zza();
                        j0 j02 = (j0)this.f.getOrDefault(integer8, null);
                        if(j02 == null) {
                            l02 = l01;
                            z6 = false;
                        }
                        else {
                            z6 = j02.d.get(v6);
                            l02 = l01;
                        }
                        z5 = l02.b(long4, long5, zzgl0, z6);
                        if(z5) {
                            this.d(integer8).b(l02);
                            integer7 = integer8;
                            map7 = map8;
                            continue;
                        }
                        this.e.add(integer8);
                        goto label_436;
                    }
                    map8 = map7;
                    integer8 = integer7;
                label_436:
                    if(!z5) {
                        this.e.add(integer8);
                    }
                label_438:
                    map7 = map8;
                }
                iterator10 = iterator11;
            }
        }
        ArrayList arrayList0 = new ArrayList();
        Set set0 = this.f.keySet();
        ((h)set0).removeAll(this.e);
        for(Object object10: ((h)set0)) {
            j0 j03 = (j0)this.f.get(((Integer)object10));
            Preconditions.checkNotNull(j03);
            zzfo zzfo0 = j03.a(((int)(((Integer)object10))));
            arrayList0.add(zzfo0);
            e e5 = zzlf1.zzi();
            String s6 = this.d;
            zzgh zzgh3 = zzfo0.zzd();
            e5.a();
            zzge zzge5 = e5.a;
            e5.zzg();
            Preconditions.checkNotEmpty(s6);
            Preconditions.checkNotNull(zzgh3);
            byte[] arr_b4 = zzgh3.zzbv();
            ContentValues contentValues0 = new ContentValues();
            contentValues0.put("app_id", s6);
            contentValues0.put("audience_id", ((Integer)object10));
            contentValues0.put("current_results", arr_b4);
            try {
                if(e5.r().insertWithOnConflict("audience_filter_values", null, contentValues0, 5) != -1L) {
                    continue;
                }
                zzge5.zzay().zzd().zzb("Failed to insert filter results (got -1). appId", zzeu.d(s6));
            }
            catch(SQLiteException sQLiteException4) {
                zzge5.zzay().zzd().zzc("Error storing filter results. appId", zzeu.d(s6), sQLiteException4);
            }
        }
        return arrayList0;
    }

    public final j0 d(Integer integer0) {
        if(this.f.containsKey(integer0)) {
            return (j0)this.f.getOrDefault(integer0, null);
        }
        j0 j00 = new j0(this, this.d);
        this.f.put(integer0, j00);
        return j00;
    }
}

