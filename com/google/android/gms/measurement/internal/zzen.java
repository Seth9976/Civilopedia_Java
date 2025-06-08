package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.Parcel;
import android.os.SystemClock;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException;
import i1.d;
import i1.p;
import java.util.ArrayList;
import java.util.List;
import jeb.synthetic.TWR;

public final class zzen extends p {
    public final d c;
    public boolean d;

    public zzen(zzge zzge0) {
        super(zzge0);
        this.c = new d(this, this.a.zzau());
    }

    @Override  // i1.p
    public final boolean b() {
        return false;
    }

    public final SQLiteDatabase c() {
        if(this.d) {
            return null;
        }
        SQLiteDatabase sQLiteDatabase0 = this.c.getWritableDatabase();
        if(sQLiteDatabase0 == null) {
            this.d = true;
            return null;
        }
        return sQLiteDatabase0;
    }

    public final boolean d(int v, byte[] arr_b) {
        SQLiteDatabase sQLiteDatabase1;
        Cursor cursor1;
        Cursor cursor2;
        long v3;
        SQLiteDatabase sQLiteDatabase0;
        Cursor cursor0;
        this.zzg();
        if(this.d) {
            return false;
        }
        ContentValues contentValues0 = new ContentValues();
        contentValues0.put("type", v);
        contentValues0.put("entry", arr_b);
        zzge zzge0 = this.a;
        int v1 = 5;
        int v2 = 0;
        while(true) {
            try {
                cursor0 = null;
                sQLiteDatabase0 = null;
                sQLiteDatabase0 = this.c();
                goto label_21;
            }
            catch(SQLiteFullException sQLiteFullException0) {
            }
            catch(SQLiteDatabaseLockedException unused_ex) {
                goto label_63;
            }
            catch(SQLiteException sQLiteException0) {
                cursor1 = null;
                sQLiteDatabase1 = null;
                goto label_76;
            }
            catch(Throwable throwable0) {
                goto label_93;
            }
            cursor1 = null;
            sQLiteDatabase1 = null;
            goto label_55;
        label_21:
            if(sQLiteDatabase0 == null) {
                try {
                    this.d = true;
                    return false;
                label_24:
                    v3 = 0L;
                    sQLiteDatabase0.beginTransaction();
                    cursor2 = sQLiteDatabase0.rawQuery("select count(1) from messages", null);
                    goto label_40;
                }
                catch(SQLiteFullException sQLiteFullException0) {
                    cursor1 = null;
                    sQLiteDatabase1 = sQLiteDatabase0;
                    goto label_55;
                }
                catch(SQLiteDatabaseLockedException unused_ex) {
                    goto label_63;
                }
                catch(SQLiteException sQLiteException0) {
                    cursor1 = null;
                    sQLiteDatabase1 = sQLiteDatabase0;
                    goto label_76;
                }
                catch(Throwable throwable0) {
                    cursor1 = null;
                    cursor0 = cursor1;
                    goto label_93;
                }
            }
            goto label_24;
        label_40:
            if(cursor2 != null) {
                try {
                    if(cursor2.moveToFirst()) {
                        v3 = cursor2.getLong(0);
                    }
                label_43:
                    if(v3 >= 100000L) {
                        zzge0.zzay().zzd().zza("Data loss, local db full");
                        long v4 = (long)sQLiteDatabase0.delete("messages", "rowid in (select rowid from messages order by rowid asc limit ?)", new String[]{Long.toString(100001L - v3)});
                        if(v4 != 100001L - v3) {
                            zzge0.zzay().zzd().zzd("Different delete count than expected in local db. expected, received, difference", ((long)(100001L - v3)), v4, ((long)(100001L - v3 - v4)));
                        }
                    }
                    sQLiteDatabase0.insertOrThrow("messages", null, contentValues0);
                    sQLiteDatabase0.setTransactionSuccessful();
                    sQLiteDatabase0.endTransaction();
                    goto label_98;
                }
                catch(SQLiteFullException sQLiteFullException0) {
                    goto label_53;
                }
                catch(SQLiteDatabaseLockedException unused_ex) {
                    goto label_62;
                }
                catch(SQLiteException sQLiteException0) {
                    goto label_74;
                }
                catch(Throwable throwable0) {
                    break;
                }
            }
            goto label_43;
        label_53:
            sQLiteDatabase1 = sQLiteDatabase0;
            cursor1 = cursor2;
            try {
            label_55:
                zzge0.zzay().zzd().zzb("Error writing entry; local database full", sQLiteFullException0);
                this.d = true;
                if(cursor1 != null) {
                    goto label_58;
                }
                goto label_59;
            }
            catch(Throwable throwable0) {
                sQLiteDatabase0 = sQLiteDatabase1;
                cursor0 = cursor1;
                goto label_93;
            }
        label_58:
            cursor1.close();
        label_59:
            if(sQLiteDatabase1 != null) {
                sQLiteDatabase1.close();
                goto label_89;
            label_62:
                cursor0 = cursor2;
                try {
                label_63:
                    SystemClock.sleep(v1);
                    v1 += 20;
                }
                catch(Throwable throwable0) {
                    goto label_93;
                }
                if(cursor0 != null) {
                    cursor0.close();
                }
                if(sQLiteDatabase0 != null) {
                    sQLiteDatabase0.close();
                    goto label_89;
                label_74:
                    sQLiteDatabase1 = sQLiteDatabase0;
                    cursor1 = cursor2;
                    try {
                    label_76:
                        if(sQLiteDatabase1 != null && sQLiteDatabase1.inTransaction()) {
                            sQLiteDatabase1.endTransaction();
                        }
                        zzge0.zzay().zzd().zzb("Error writing entry to local database", sQLiteException0);
                        this.d = true;
                    }
                    catch(Throwable throwable0) {
                        sQLiteDatabase0 = sQLiteDatabase1;
                        cursor0 = cursor1;
                        goto label_93;
                    }
                    if(cursor1 != null) {
                        cursor1.close();
                    }
                    if(sQLiteDatabase1 != null) {
                        sQLiteDatabase1.close();
                    }
                }
            }
        label_89:
            ++v2;
        }
        cursor0 = cursor2;
    label_93:
        if(cursor0 != null) {
            cursor0.close();
        }
        if(sQLiteDatabase0 != null) {
            sQLiteDatabase0.close();
        }
        throw throwable0;
    label_98:
        if(cursor2 != null) {
            cursor2.close();
        }
        sQLiteDatabase0.close();
        return true;
    }

    public final List zzi(int v) {
        zzac zzac0;
        Parcel parcel2;
        zzli zzli0;
        Parcel parcel1;
        zzaw zzaw0;
        Parcel parcel0;
        byte[] arr_b;
        String[] arr_s;
        String s;
        long v4;
        Cursor cursor2;
        long v3;
        SQLiteDatabase sQLiteDatabase1;
        Cursor cursor1;
        SQLiteDatabase sQLiteDatabase0;
        this.zzg();
        Cursor cursor0 = null;
        if(this.d) {
            return null;
        }
        List list0 = new ArrayList();
        zzge zzge0 = this.a;
        if(zzge0.zzau().getDatabasePath("google_app_measurement_local.db").exists()) {
            int v1 = 5;
            int v2 = 0;
            while(true) {
                try {
                    sQLiteDatabase0 = null;
                    sQLiteDatabase0 = this.c();
                    goto label_20;
                }
                catch(SQLiteFullException sQLiteFullException0) {
                }
                catch(SQLiteDatabaseLockedException unused_ex) {
                    cursor1 = null;
                    goto label_138;
                }
                catch(SQLiteException sQLiteException0) {
                    cursor1 = null;
                    goto label_146;
                }
                catch(Throwable throwable0) {
                    goto label_158;
                }
                cursor1 = null;
                goto label_131;
            label_20:
                if(sQLiteDatabase0 == null) {
                    try {
                        this.d = true;
                        return null;
                    label_23:
                        sQLiteDatabase0.beginTransaction();
                        sQLiteDatabase1 = sQLiteDatabase0;
                        goto label_25;
                    }
                    catch(SQLiteFullException sQLiteFullException0) {
                        cursor1 = null;
                        goto label_131;
                    }
                    catch(SQLiteDatabaseLockedException unused_ex) {
                        cursor1 = null;
                        goto label_138;
                    }
                    catch(SQLiteException sQLiteException0) {
                        cursor1 = null;
                        goto label_146;
                    }
                    catch(Throwable throwable0) {
                        goto label_158;
                    }
                }
                goto label_23;
                try {
                label_25:
                    v3 = -1L;
                    cursor2 = null;
                    cursor2 = sQLiteDatabase0.query("messages", new String[]{"rowid"}, "type=?", new String[]{"3"}, null, null, "rowid desc", "1");
                    if(cursor2.moveToFirst()) {
                        v4 = cursor2.getLong(0);
                        goto label_41;
                    }
                    else {
                        goto label_43;
                    }
                    goto label_45;
                }
                catch(Throwable throwable1) {
                    try {
                        if(cursor2 != null) {
                            cursor2.close();
                        }
                        throw throwable1;
                    }
                    catch(SQLiteFullException sQLiteFullException0) {
                        cursor1 = null;
                        goto label_131;
                    }
                    catch(SQLiteDatabaseLockedException unused_ex) {
                        cursor1 = null;
                        goto label_138;
                    }
                    catch(SQLiteException sQLiteException0) {
                        cursor1 = null;
                        goto label_146;
                    }
                    catch(Throwable throwable0) {
                        goto label_158;
                    }
                }
                try {
                label_41:
                    cursor2.close();
                    goto label_45;
                label_43:
                    cursor2.close();
                    v4 = -1L;
                label_45:
                    if(v4 == -1L) {
                        s = null;
                        arr_s = null;
                    }
                    else {
                        s = "rowid<?";
                        arr_s = new String[]{String.valueOf(v4)};
                    }
                    cursor1 = sQLiteDatabase0.query("messages", new String[]{"rowid", "type", "entry"}, s, arr_s, null, null, "rowid asc", "100");
                    goto label_69;
                }
                catch(SQLiteFullException sQLiteFullException0) {
                    sQLiteDatabase0 = sQLiteDatabase1;
                    cursor1 = null;
                    goto label_131;
                }
                catch(SQLiteDatabaseLockedException unused_ex) {
                    sQLiteDatabase0 = sQLiteDatabase1;
                    cursor1 = null;
                    goto label_138;
                }
                catch(SQLiteException sQLiteException0) {
                    sQLiteDatabase0 = sQLiteDatabase1;
                    cursor1 = null;
                    goto label_146;
                }
                catch(Throwable throwable0) {
                    sQLiteDatabase0 = sQLiteDatabase1;
                    goto label_158;
                }
                cursor1 = null;
                goto label_131;
                try {
                alab1:
                    while(true) {
                    label_69:
                        if(!cursor1.moveToNext()) {
                            goto label_125;
                        }
                        v3 = cursor1.getLong(0);
                        int v5 = cursor1.getInt(1);
                        arr_b = cursor1.getBlob(2);
                        switch(v5) {
                            case 0: {
                                parcel0 = Parcel.obtain();
                                break alab1;
                            }
                            case 1: {
                                goto label_91;
                            }
                            case 2: {
                                goto label_107;
                            }
                            case 3: {
                                goto label_123;
                            }
                            default: {
                                zzge0.zzay().zzd().zza("Unknown record type in local database");
                            }
                        }
                    }
                }
                catch(SQLiteFullException sQLiteFullException0) {
                    goto label_131;
                }
                catch(SQLiteDatabaseLockedException unused_ex) {
                    goto label_138;
                }
                catch(SQLiteException sQLiteException0) {
                    goto label_146;
                }
                catch(Throwable throwable0) {
                    break;
                }
                try {
                    try {
                        parcel0.unmarshall(arr_b, 0, arr_b.length);
                        parcel0.setDataPosition(0);
                        zzaw0 = (zzaw)zzaw.CREATOR.createFromParcel(parcel0);
                        goto label_87;
                    }
                    catch(ParseException unused_ex) {
                    }
                    zzge0.zzay().zzd().zza("Failed to load event from local database");
                }
                catch(Throwable throwable2) {
                    goto label_85;
                }
                try {
                    parcel0.recycle();
                    goto label_69;
                label_85:
                    parcel0.recycle();
                    throw throwable2;
                label_87:
                    parcel0.recycle();
                    if(zzaw0 == null) {
                        goto label_69;
                    }
                    ((ArrayList)list0).add(zzaw0);
                    goto label_69;
                label_91:
                    parcel1 = Parcel.obtain();
                }
                catch(SQLiteFullException sQLiteFullException0) {
                    goto label_131;
                }
                catch(SQLiteDatabaseLockedException unused_ex) {
                    goto label_138;
                }
                catch(SQLiteException sQLiteException0) {
                    goto label_146;
                }
                catch(Throwable throwable0) {
                    break;
                }
                try {
                    try {
                        parcel1.unmarshall(arr_b, 0, arr_b.length);
                        parcel1.setDataPosition(0);
                        zzli0 = (zzli)zzli.CREATOR.createFromParcel(parcel1);
                        goto label_103;
                    }
                    catch(ParseException unused_ex) {
                    }
                    zzge0.zzay().zzd().zza("Failed to load user property from local database");
                }
                catch(Throwable throwable3) {
                    goto label_101;
                }
                try {
                    parcel1.recycle();
                    zzli0 = null;
                    goto label_104;
                label_101:
                    parcel1.recycle();
                    throw throwable3;
                label_103:
                    parcel1.recycle();
                label_104:
                    if(zzli0 == null) {
                        goto label_69;
                    }
                    ((ArrayList)list0).add(zzli0);
                    goto label_69;
                label_107:
                    parcel2 = Parcel.obtain();
                }
                catch(SQLiteFullException sQLiteFullException0) {
                    goto label_131;
                }
                catch(SQLiteDatabaseLockedException unused_ex) {
                    goto label_138;
                }
                catch(SQLiteException sQLiteException0) {
                    goto label_146;
                }
                catch(Throwable throwable0) {
                    break;
                }
                try {
                    try {
                        parcel2.unmarshall(arr_b, 0, arr_b.length);
                        parcel2.setDataPosition(0);
                        zzac0 = (zzac)zzac.CREATOR.createFromParcel(parcel2);
                        goto label_119;
                    }
                    catch(ParseException unused_ex) {
                    }
                    zzge0.zzay().zzd().zza("Failed to load conditional user property from local database");
                }
                catch(Throwable throwable4) {
                    goto label_117;
                }
                try {
                    parcel2.recycle();
                    zzac0 = null;
                    goto label_120;
                label_117:
                    parcel2.recycle();
                    throw throwable4;
                label_119:
                    parcel2.recycle();
                label_120:
                    if(zzac0 == null) {
                        goto label_69;
                    }
                    ((ArrayList)list0).add(zzac0);
                    goto label_69;
                label_123:
                    zzge0.zzay().zzk().zza("Skipping app launch break");
                    goto label_69;
                label_125:
                    if(sQLiteDatabase0.delete("messages", "rowid <= ?", new String[]{Long.toString(v3)}) < ((ArrayList)list0).size()) {
                        zzge0.zzay().zzd().zza("Fewer entries removed from local database than expected");
                    }
                    sQLiteDatabase0.setTransactionSuccessful();
                    sQLiteDatabase0.endTransaction();
                    goto label_163;
                }
                catch(SQLiteFullException sQLiteFullException0) {
                }
                catch(SQLiteDatabaseLockedException unused_ex) {
                    goto label_138;
                }
                catch(SQLiteException sQLiteException0) {
                    goto label_146;
                }
                catch(Throwable throwable0) {
                    break;
                }
                try {
                label_131:
                    zzge0.zzay().zzd().zzb("Error reading entries from local database", sQLiteFullException0);
                    this.d = true;
                    if(cursor1 != null) {
                        goto label_134;
                    }
                    goto label_135;
                }
                catch(Throwable throwable0) {
                    break;
                }
            label_134:
                cursor1.close();
            label_135:
                if(sQLiteDatabase0 != null) {
                    sQLiteDatabase0.close();
                    goto label_154;
                    try {
                    label_138:
                        SystemClock.sleep(v1);
                        v1 += 20;
                        if(cursor1 != null) {
                            goto label_141;
                        }
                        goto label_142;
                    }
                    catch(Throwable throwable0) {
                        break;
                    }
                label_141:
                    cursor1.close();
                label_142:
                    if(sQLiteDatabase0 != null) {
                        sQLiteDatabase0.close();
                        goto label_154;
                        try {
                        label_146:
                            if(sQLiteDatabase0 != null && sQLiteDatabase0.inTransaction()) {
                                sQLiteDatabase0.endTransaction();
                            }
                            zzge0.zzay().zzd().zzb("Error reading entries from local database", sQLiteException0);
                            this.d = true;
                            if(cursor1 != null) {
                                goto label_151;
                            }
                            goto label_152;
                        }
                        catch(Throwable throwable0) {
                            break;
                        }
                    label_151:
                        cursor1.close();
                    label_152:
                        if(sQLiteDatabase0 != null) {
                            sQLiteDatabase0.close();
                        }
                    }
                }
            label_154:
                ++v2;
            }
            cursor0 = cursor1;
        label_158:
            if(cursor0 != null) {
                cursor0.close();
            }
            if(sQLiteDatabase0 != null) {
                sQLiteDatabase0.close();
            }
            throw throwable0;
        label_163:
            cursor1.close();
            sQLiteDatabase0.close();
            return list0;
        }
        return list0;
    }

    public final void zzj() {
        zzge zzge0 = this.a;
        this.zzg();
        try {
            SQLiteDatabase sQLiteDatabase0 = this.c();
            if(sQLiteDatabase0 != null) {
                int v = sQLiteDatabase0.delete("messages", null, null);
                if(v > 0) {
                    zzge0.zzay().zzj().zzb("Reset local analytics data. records", v);
                }
            }
        }
        catch(SQLiteException sQLiteException0) {
            zzge0.zzay().zzd().zzb("Error resetting local analytics data. error", sQLiteException0);
        }
    }

    public final boolean zzk() {
        return this.d(3, new byte[0]);
    }

    public final boolean zzm() {
        SQLiteDatabase sQLiteDatabase0;
        this.zzg();
        if(this.d) {
            return false;
        }
        zzge zzge0 = this.a;
        if(zzge0.zzau().getDatabasePath("google_app_measurement_local.db").exists()) {
            int v = 5;
            int v1 = 0;
            while(true) {
                try {
                    try {
                    label_7:
                        sQLiteDatabase0 = null;
                        sQLiteDatabase0 = this.c();
                        if(sQLiteDatabase0 == null) {
                            this.d = true;
                            return false;
                        }
                        sQLiteDatabase0.beginTransaction();
                        sQLiteDatabase0.delete("messages", "type == ?", new String[]{"3"});
                        sQLiteDatabase0.setTransactionSuccessful();
                        sQLiteDatabase0.endTransaction();
                        break;
                    label_18:
                        goto label_30;
                    }
                    catch(SQLiteFullException sQLiteFullException0) {
                    }
                    catch(SQLiteDatabaseLockedException unused_ex) {
                        goto label_25;
                    }
                    catch(SQLiteException sQLiteException0) {
                        goto label_18;
                    }
                    zzge0.zzay().zzd().zzb("Error deleting app launch break from local database", sQLiteFullException0);
                    this.d = true;
                    if(sQLiteDatabase0 != null) {
                        goto label_23;
                    }
                    goto label_36;
                }
                catch(Throwable throwable0) {
                    goto label_39;
                }
            label_23:
                sQLiteDatabase0.close();
                goto label_36;
                try {
                label_25:
                    SystemClock.sleep(v);
                    v += 20;
                    if(sQLiteDatabase0 != null) {
                        goto label_28;
                    }
                    goto label_36;
                }
                catch(Throwable throwable0) {
                    goto label_39;
                }
            label_28:
                sQLiteDatabase0.close();
                goto label_36;
                try {
                label_30:
                    if(sQLiteDatabase0 != null && sQLiteDatabase0.inTransaction()) {
                        sQLiteDatabase0.endTransaction();
                    }
                    zzge0.zzay().zzd().zzb("Error deleting app launch break from local database", sQLiteException0);
                    this.d = true;
                    if(sQLiteDatabase0 != null) {
                        goto label_35;
                    }
                    goto label_36;
                }
                catch(Throwable throwable0) {
                    goto label_39;
                }
            label_35:
                sQLiteDatabase0.close();
            label_36:
                ++v1;
                goto label_7;
            label_39:
                TWR.safeClose$NT(sQLiteDatabase0, throwable0);
                throw throwable0;
            }
            sQLiteDatabase0.close();
            return true;
        }
        return false;
    }

    public final boolean zzn(zzac zzac0) {
        zzge zzge0 = this.a;
        zzge0.zzv().getClass();
        byte[] arr_b = zzln.D(zzac0);
        if(arr_b.length > 0x20000) {
            zzge0.zzay().zzh().zza("Conditional user property too long for local database. Sending directly to service");
            return false;
        }
        return this.d(2, arr_b);
    }

    public final boolean zzo(zzaw zzaw0) {
        Parcel parcel0 = Parcel.obtain();
        zzax.a(zzaw0, parcel0, 0);
        byte[] arr_b = parcel0.marshall();
        parcel0.recycle();
        if(arr_b.length > 0x20000) {
            this.a.zzay().zzh().zza("Event is too long for local database. Sending event directly to service");
            return false;
        }
        return this.d(0, arr_b);
    }

    public final boolean zzp(zzli zzli0) {
        Parcel parcel0 = Parcel.obtain();
        zzlj.a(zzli0, parcel0);
        byte[] arr_b = parcel0.marshall();
        parcel0.recycle();
        if(arr_b.length > 0x20000) {
            this.a.zzay().zzh().zza("User property too long for local database. Sending directly to service");
            return false;
        }
        return this.d(1, arr_b);
    }
}

