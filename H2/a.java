package h2;

import A.f;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import com.readystatesoftware.sqliteasset.SQLiteAssetHelper.SQLiteAssetException;
import com.spears.civilopedia.MyApplication;
import e2.b;
import i3.e;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public final class a extends SQLiteOpenHelper {
    public final MyApplication i;
    public final String j;
    public final int k;
    public SQLiteDatabase l;
    public boolean m;
    public final String n;
    public final String o;
    public final String p;
    public int q;

    public a(MyApplication myApplication0, String s) {
        super(myApplication0, s, null, 22);
        this.l = null;
        this.m = false;
        this.q = 0;
        this.i = myApplication0;
        this.j = s;
        this.k = 22;
        this.o = "databases/" + s;
        this.n = e.h(new StringBuilder(), myApplication0.getApplicationInfo().dataDir, "/databases");
        this.p = e.f("databases/", s, "_upgrade_%s-%s.sql");
    }

    public final void a() {
        boolean z;
        InputStream inputStream0;
        MyApplication myApplication0 = this.i;
        Log.w("a", "copying database from assets...");
        String s = this.o;
        String s1 = this.d();
        try {
            inputStream0 = myApplication0.getAssets().open(s);
        }
        catch(IOException unused_ex) {
            try {
                inputStream0 = myApplication0.getAssets().open(s + ".zip");
                z = true;
                goto label_16;
            }
            catch(IOException unused_ex) {
                try {
                    inputStream0 = myApplication0.getAssets().open(s + ".gz");
                }
                catch(IOException iOException0) {
                    SQLiteAssetHelper.SQLiteAssetException sQLiteAssetHelper$SQLiteAssetException0 = new SQLiteAssetHelper.SQLiteAssetException(e.f("Missing ", s, " file (or .zip, .gz archive) in assets, or target folder not writable"));  // 初始化器: Landroid/database/sqlite/SQLiteException;-><init>(Ljava/lang/String;)V
                    sQLiteAssetHelper$SQLiteAssetException0.setStackTrace(iOException0.getStackTrace());
                    throw sQLiteAssetHelper$SQLiteAssetException0;
                }
            }
        }
        z = false;
        try {
        label_16:
            File file0 = new File(this.n + "/");
            if(!file0.exists()) {
                file0.mkdir();
            }
            if(z) {
                ZipInputStream zipInputStream0 = new ZipInputStream(inputStream0);
                ZipEntry zipEntry0 = zipInputStream0.getNextEntry();
                if(zipEntry0 == null) {
                    zipInputStream0 = null;
                }
                else {
                    Log.w("a", "extracting file: \'" + zipEntry0.getName() + "\'...");
                }
                if(zipInputStream0 == null) {
                    throw new SQLiteAssetHelper.SQLiteAssetException("Archive is missing a SQLite database file");  // 初始化器: Landroid/database/sqlite/SQLiteException;-><init>(Ljava/lang/String;)V
                }
                if(s.endsWith(".sql") || s.endsWith(".SQL")) {
                    this.b(zipInputStream0, s1);
                }
                else {
                    FileOutputStream fileOutputStream0 = new FileOutputStream(s1);
                    byte[] arr_b = new byte[0x400];
                    int v;
                    while((v = zipInputStream0.read(arr_b)) > 0) {
                        fileOutputStream0.write(arr_b, 0, v);
                    }
                    fileOutputStream0.flush();
                    fileOutputStream0.close();
                    zipInputStream0.close();
                }
            }
            else if(!s.endsWith(".sql") && !s.endsWith(".SQL")) {
                FileOutputStream fileOutputStream1 = new FileOutputStream(s1);
                byte[] arr_b1 = new byte[0x400];
                int v1;
                while((v1 = inputStream0.read(arr_b1)) > 0) {
                    fileOutputStream1.write(arr_b1, 0, v1);
                }
                fileOutputStream1.flush();
                fileOutputStream1.close();
                inputStream0.close();
            }
            else {
                this.b(inputStream0, s1);
            }
            Log.w("a", "database copy complete");
        }
        catch(IOException iOException1) {
            SQLiteAssetHelper.SQLiteAssetException sQLiteAssetHelper$SQLiteAssetException1 = new SQLiteAssetHelper.SQLiteAssetException(e.f("Unable to write ", s1, " to data directory"));  // 初始化器: Landroid/database/sqlite/SQLiteException;-><init>(Ljava/lang/String;)V
            sQLiteAssetHelper$SQLiteAssetException1.setStackTrace(iOException1.getStackTrace());
            throw sQLiteAssetHelper$SQLiteAssetException1;
        }
    }

    public final void b(InputStream inputStream0, String s) {
        SQLiteDatabase sQLiteDatabase0 = null;
        try {
            sQLiteDatabase0 = SQLiteDatabase.openOrCreateDatabase(s, null);
            sQLiteDatabase0.beginTransaction();
            BufferedReader bufferedReader0 = new BufferedReader(new InputStreamReader(inputStream0));
            String s1 = bufferedReader0.readLine();
            while(s1 != null) {
                s1 = s1.trim();
                if(!s1.startsWith("--") && s1.length() != 0) {
                    if(s1.charAt(s1.length() - 1) == 59) {
                        s1 = s1.substring(0, s1.length() - 1);
                    }
                    sQLiteDatabase0.execSQL(s1);
                    s1 = bufferedReader0.readLine();
                }
            }
            sQLiteDatabase0.setTransactionSuccessful();
            goto label_20;
        label_16:
            if(sQLiteDatabase0 == null) {
                throw throwable0;
            }
        }
        catch(Throwable throwable0) {
            goto label_16;
        }
        sQLiteDatabase0.endTransaction();
        sQLiteDatabase0.close();
        throw throwable0;
    label_20:
        sQLiteDatabase0.endTransaction();
        sQLiteDatabase0.close();
    }

    public final SQLiteDatabase c(boolean z) {
        SQLiteDatabase sQLiteDatabase0 = this.f();
        if(sQLiteDatabase0 != null) {
            if(z) {
                Log.w("a", "forcing database upgrade!");
                sQLiteDatabase0.close();
                this.a();
                return this.f();
            }
            return sQLiteDatabase0;
        }
        this.a();
        return this.f();
    }

    @Override  // android.database.sqlite.SQLiteOpenHelper
    public final void close() {
        synchronized(this) {
            if(!this.m) {
                if(this.l != null && this.l.isOpen()) {
                    this.l.close();
                    this.l = null;
                }
                super.close();
                return;
            }
        }
        throw new IllegalStateException("Closed during initialization");
    }

    public final String d() {
        return this.n + "/" + this.j;
    }

    public final void e(int v, int v1, int v2, ArrayList arrayList0) {
        int v3;
        InputStream inputStream0;
        String s1;
        String s;
        try {
            s = this.p;
            s1 = String.format(s, v1, v2);
            inputStream0 = this.i.getAssets().open(s1);
        }
        catch(IOException unused_ex) {
            Log.w("a", "missing database upgrade script: " + s1);
            inputStream0 = null;
        }
        if(inputStream0 == null) {
            v3 = v1 - 1;
            v1 = v2;
        }
        else {
            arrayList0.add(String.format(s, v1, v2));
            v3 = v1 - 1;
        }
        if(v3 >= v) {
            this.e(v, v3, v1, arrayList0);
        }
    }

    public final SQLiteDatabase f() {
        if(new File(this.d()).exists()) {
            Log.i("a", "successfully opened database " + this.j);
            return SQLiteDatabase.openDatabase(this.d(), null, 0);
        }
        return null;
    }

    @Override  // android.database.sqlite.SQLiteOpenHelper
    public final SQLiteDatabase getReadableDatabase() {
        SQLiteDatabase sQLiteDatabase1;
        synchronized(this) {
            if(this.l != null && this.l.isOpen()) {
                return this.l;
            }
            goto label_4;
        }
        return this.l;
    label_4:
        if(this.m) {
            throw new IllegalStateException("getReadableDatabase called recursively");
        }
        try {
            return this.getWritableDatabase();
        }
        catch(SQLiteException sQLiteException0) {
        }
        if(this.j == null) {
            throw sQLiteException0;
        }
        Log.e("a", "Couldn\'t open " + this.j + " for writing (will try read-only):", sQLiteException0);
        sQLiteDatabase1 = null;
        try {
            this.m = true;
            String s = this.i.getDatabasePath(this.j).getPath();
            sQLiteDatabase1 = SQLiteDatabase.openDatabase(s, null, 1);
            if(sQLiteDatabase1.getVersion() != this.k) {
                throw new SQLiteException("Can\'t upgrade read-only database from version " + sQLiteDatabase1.getVersion() + " to " + this.k + ": " + s);
            }
            this.onOpen(sQLiteDatabase1);
            Log.w("a", "Opened " + this.j + " in read-only mode");
            this.l = sQLiteDatabase1;
            this.m = false;
            return sQLiteDatabase1;
        }
        catch(Throwable throwable1) {
            this.m = false;
            if(sQLiteDatabase1 != null && sQLiteDatabase1 != this.l) {
                sQLiteDatabase1.close();
            }
            throw throwable1;
        }
    }

    @Override  // android.database.sqlite.SQLiteOpenHelper
    public final SQLiteDatabase getWritableDatabase() {
        int v;
        SQLiteDatabase sQLiteDatabase0;
        synchronized(this) {
            if(this.l != null && this.l.isOpen() && !this.l.isReadOnly()) {
                return this.l;
            }
            goto label_4;
        }
        return this.l;
    label_4:
        if(this.m) {
            throw new IllegalStateException("getWritableDatabase called recursively");
        }
        try {
            sQLiteDatabase0 = null;
            this.m = true;
            sQLiteDatabase0 = this.c(false);
            v = sQLiteDatabase0.getVersion();
            if(v != 0 && v < this.q) {
                sQLiteDatabase0.close();
                sQLiteDatabase0 = this.c(true);
                v = sQLiteDatabase0.getVersion();
                if(v != this.k) {
                    Log.w("a", "Forced Upgrade got " + v + ", now an upgrade to " + this.k + " is required");
                }
            }
            if(v != this.k) {
                sQLiteDatabase0.beginTransaction();
                if(v != 0) {
                    goto label_18;
                }
                goto label_21;
            }
            goto label_28;
        }
        catch(Throwable throwable1) {
            goto label_31;
        }
        try {
        label_18:
            if(v > this.k) {
                Log.w("a", "Can\'t downgrade read-only database from version " + v + " to " + this.k + ": " + sQLiteDatabase0.getPath());
            }
            this.onUpgrade(sQLiteDatabase0, v, this.k);
        label_21:
            sQLiteDatabase0.setVersion(this.k);
            sQLiteDatabase0.setTransactionSuccessful();
            goto label_27;
        }
        catch(Throwable throwable2) {
        }
        try {
            sQLiteDatabase0.endTransaction();
            throw throwable2;
        label_27:
            sQLiteDatabase0.endTransaction();
        label_28:
            this.onOpen(sQLiteDatabase0);
            goto label_35;
        }
        catch(Throwable throwable1) {
        }
    label_31:
        this.m = false;
        if(sQLiteDatabase0 != null) {
            sQLiteDatabase0.close();
        }
        throw throwable1;
    label_35:
        this.m = false;
        SQLiteDatabase sQLiteDatabase1 = this.l;
        if(sQLiteDatabase1 != null) {
            try {
                sQLiteDatabase1.close();
            }
            catch(Exception unused_ex) {
            }
        }
        this.l = sQLiteDatabase0;
        return sQLiteDatabase0;
    }

    @Override  // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase0) {
    }

    @Override  // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase0) {
    }

    @Override  // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase0, int v, int v1) {
    }

    @Override  // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase0, int v, int v1) {
        StringBuilder stringBuilder0 = new StringBuilder("Upgrading database ");
        String s = this.j;
        f.s(stringBuilder0, s, " from version ", v, " to ");
        stringBuilder0.append(v1);
        stringBuilder0.append("...");
        Log.w("a", stringBuilder0.toString());
        ArrayList arrayList0 = new ArrayList();
        this.e(v, v1 - 1, v1, arrayList0);
        if(!arrayList0.isEmpty()) {
            b b0 = new b();  // 初始化器: Ljava/lang/Object;-><init>()V
            b0.i = Pattern.compile(".*_upgrade_([0-9]+)-([0-9]+).*");
            Collections.sort(arrayList0, b0);
            for(Object object0: arrayList0) {
                String s1 = (String)object0;
                try {
                    Log.w("a", "processing upgrade: " + s1);
                    try(Scanner scanner0 = new Scanner(this.i.getAssets().open(s1))) {
                        String s2 = scanner0.useDelimiter("\\A").next();
                        if(s2 == null) {
                            continue;
                        }
                        for(Object object1: e2.a.a(s2)) {
                            String s3 = (String)object1;
                            if(s3.trim().length() > 0) {
                                sQLiteDatabase0.execSQL(s3);
                            }
                        }
                    }
                }
                catch(IOException iOException0) {
                    iOException0.printStackTrace();
                }
            }
            StringBuilder stringBuilder1 = f.m(v, "Successfully upgraded database ", s, " from version ", " to ");
            stringBuilder1.append(v1);
            Log.w("a", stringBuilder1.toString());
            return;
        }
        Log.e("a", "no upgrade script path from " + v + " to " + v1);
        throw new SQLiteAssetHelper.SQLiteAssetException(f.d(v, v1, "no upgrade script path from ", " to "));  // 初始化器: Landroid/database/sqlite/SQLiteException;-><init>(Ljava/lang/String;)V
    }
}

