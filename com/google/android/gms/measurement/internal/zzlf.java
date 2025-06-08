package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri.Builder;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.measurement.zzfe;
import com.google.android.gms.internal.measurement.zzfr;
import com.google.android.gms.internal.measurement.zzfs;
import com.google.android.gms.internal.measurement.zzfw;
import com.google.android.gms.internal.measurement.zzfz;
import com.google.android.gms.internal.measurement.zzga;
import com.google.android.gms.internal.measurement.zzgb;
import com.google.android.gms.internal.measurement.zzgc;
import com.google.android.gms.internal.measurement.zzgk;
import com.google.android.gms.internal.measurement.zzgl;
import com.google.android.gms.internal.measurement.zzny;
import com.google.android.gms.internal.measurement.zzpc;
import com.google.android.gms.internal.measurement.zzpf;
import com.google.android.gms.internal.measurement.zzpi;
import i1.C;
import i1.D;
import i1.N;
import i1.b;
import i1.c0;
import i1.d0;
import i1.e0;
import i1.e;
import i1.f0;
import i1.g0;
import i1.g;
import i1.m;
import i1.o;
import i1.q;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPInputStream;
import jeb.synthetic.TWR;

public final class zzlf implements C {
    public final HashMap A;
    public final HashMap B;
    public zziq C;
    public String D;
    public final d0 E;
    public static volatile zzlf F;
    public final zzfv a;
    public final zzfa b;
    public e c;
    public q d;
    public zzkr e;
    public b f;
    public final zzlh g;
    public N h;
    public zzka i;
    public final zzku j;
    public zzfm k;
    public final zzge l;
    public boolean m;
    public boolean n;
    public long o;
    public ArrayList p;
    public int q;
    public int r;
    public boolean s;
    public boolean t;
    public boolean u;
    public FileLock v;
    public FileChannel w;
    public ArrayList x;
    public ArrayList y;
    public long z;

    public zzlf(zzlg zzlg0) {
        this.m = false;
        this.E = new d0(this);
        Preconditions.checkNotNull(zzlg0);
        this.l = zzge.zzp(zzlg0.a, null, null);
        this.z = -1L;
        this.j = new zzku(this);  // 初始化器: Li1/b0;-><init>(Lcom/google/android/gms/measurement/internal/zzlf;)V
        zzlh zzlh0 = new zzlh(this);  // 初始化器: Li1/c0;-><init>(Lcom/google/android/gms/measurement/internal/zzlf;)V
        zzlh0.zzX();
        this.g = zzlh0;
        zzfa zzfa0 = new zzfa(this);
        zzfa0.zzX();
        this.b = zzfa0;
        zzfv zzfv0 = new zzfv(this);
        zzfv0.zzX();
        this.a = zzfv0;
        this.A = new HashMap();
        this.B = new HashMap();
        this.zzaz().zzp(new B.b(this, zzlg0));
    }

    public final boolean A() {
        this.zzaz().zzg();
        this.b();
        e e0 = this.c;
        zzlf.D(e0);
        if(e0.m("select count(1) > 0 from raw_events", null) == 0L) {
            e e1 = this.c;
            zzlf.D(e1);
            return !TextUtils.isEmpty(e1.zzr());
        }
        return true;
    }

    public final boolean B(zzfr zzfr0, zzfr zzfr1) {
        Preconditions.checkArgument("_e".equals(zzfr0.zzo()));
        zzlh zzlh0 = this.g;
        zzlf.D(zzlh0);
        String s = null;
        String s1 = zzlh.c(((zzfs)zzfr0.zzaE()), "_sc") == null ? null : "";
        zzlf.D(zzlh0);
        if(zzlh.c(((zzfs)zzfr1.zzaE()), "_pc") != null) {
            s = "";
        }
        if(s != null && s.equals(s1)) {
            Preconditions.checkArgument("_e".equals(zzfr0.zzo()));
            zzlf.D(zzlh0);
            zzfw zzfw0 = zzlh.c(((zzfs)zzfr0.zzaE()), "_et");
            if(zzfw0 != null && zzfw0.zzw() && zzfw0.zzd() > 0L) {
                long v = zzfw0.zzd();
                zzlf.D(zzlh0);
                zzfw zzfw1 = zzlh.c(((zzfs)zzfr1.zzaE()), "_et");
                if(zzfw1 != null && zzfw1.zzd() > 0L) {
                    v += zzfw1.zzd();
                }
                zzlf.D(zzlh0);
                zzlh.C(zzfr1, "_et", v);
                zzlf.D(zzlh0);
                zzlh.C(zzfr0, "_fr", 1L);
            }
            return true;
        }
        return false;
    }

    // 去混淆评级： 低(20)
    public static final boolean C(zzq zzq0) {
        return !TextUtils.isEmpty(zzq0.zzb) || !TextUtils.isEmpty(zzq0.zzq);
    }

    public static final void D(c0 c00) {
        if(c00 == null) {
            throw new IllegalStateException("Upload Component not created");
        }
        if(!c00.c) {
            throw new IllegalStateException("Component not initialized: " + c00.getClass());
        }
    }

    public final D E(zzq zzq0) {
        this.zzaz().zzg();
        this.b();
        Preconditions.checkNotNull(zzq0);
        Preconditions.checkNotEmpty(zzq0.zza);
        zzpc.zzc();
        if(this.zzg().zzs(zzq0.zza, zzeh.zzaA) && !zzq0.zzw.isEmpty()) {
            f0 f00 = new f0(this, zzq0.zzw);
            this.B.put(zzq0.zza, f00);
        }
        e e0 = this.c;
        zzlf.D(e0);
        D d0 = e0.s(zzq0.zza);
        zzai zzai0 = this.F(zzq0.zza).zzc(zzai.zzb(zzq0.zzv));
        zzah zzah0 = zzah.zza;
        String s = zzai0.zzi(zzah0) ? this.i.d(zzq0.zza, zzq0.zzo) : "";
        if(d0 == null) {
            d0 = new D(this.l, zzq0.zza);
            if(zzai0.zzi(zzah.zzb)) {
                d0.c(this.G(zzai0));
            }
            if(zzai0.zzi(zzah0)) {
                d0.r(s);
            }
        }
        else if(!zzai0.zzi(zzah0) || s == null) {
        label_42:
            if(TextUtils.isEmpty(d0.x()) && zzai0.zzi(zzah.zzb)) {
                d0.c(this.G(zzai0));
            }
        }
        else {
            d0.a.zzaz().zzg();
            if(s.equals(d0.e)) {
                goto label_42;
            }
            else {
                d0.r(s);
                if(!this.zzg().zzs(null, zzeh.zzaj) || zzq0.zzo) {
                    zzka zzka0 = this.i;
                    zzka0.getClass();
                    if(!"00000000-0000-0000-0000-000000000000".equals((zzai0.zzi(zzah0) ? zzka0.c(zzq0.zza) : new Pair("", Boolean.FALSE)).first)) {
                        d0.c(this.G(zzai0));
                        e e1 = this.c;
                        zzlf.D(e1);
                        if(e1.w(zzq0.zza, "_id") != null) {
                            e e2 = this.c;
                            zzlf.D(e2);
                            if(e2.w(zzq0.zza, "_lair") == null) {
                                long v = this.zzav().currentTimeMillis();
                                g0 g00 = new g0(zzq0.zza, "auto", "_lair", v, 1L);
                                e e3 = this.c;
                                zzlf.D(e3);
                                e3.j(g00);
                            }
                        }
                    }
                }
            }
        }
        d0.k(zzq0.zzb);
        d0.b(zzq0.zzq);
        if(!TextUtils.isEmpty(zzq0.zzk)) {
            d0.j(zzq0.zzk);
        }
        long v1 = zzq0.zze;
        if(v1 != 0L) {
            d0.l(v1);
        }
        if(!TextUtils.isEmpty(zzq0.zzc)) {
            d0.e(zzq0.zzc);
        }
        d0.f(zzq0.zzj);
        String s1 = zzq0.zzd;
        if(s1 != null) {
            d0.d(s1);
        }
        d0.h(zzq0.zzf);
        d0.q(zzq0.zzh);
        if(!TextUtils.isEmpty(zzq0.zzg)) {
            d0.m(zzq0.zzg);
        }
        zzge zzge0 = d0.a;
        zzge0.zzaz().zzg();
        d0.C |= d0.p != zzq0.zzo;
        d0.p = zzq0.zzo;
        zzge0.zzaz().zzg();
        d0.C |= !zzg.zza(d0.r, zzq0.zzr);
        d0.r = zzq0.zzr;
        d0.i(zzq0.zzs);
        zzpi.zzc();
        if(this.zzg().zzs(null, zzeh.zzay)) {
            zzge0.zzaz().zzg();
            d0.C |= !zzg.zza(d0.u, zzq0.zzx);
            d0.u = zzq0.zzx;
        }
        zzny.zzc();
        if(this.zzg().zzs(null, zzeh.zzaq)) {
            d0.s(zzq0.zzt);
        }
        else {
            zzny.zzc();
            if(this.zzg().zzs(null, zzeh.zzap)) {
                d0.s(null);
            }
        }
        zzge0.zzaz().zzg();
        if(d0.C) {
            e e4 = this.c;
            zzlf.D(e4);
            e4.e(d0);
        }
        return d0;
    }

    public final zzai F(String s) {
        String s1;
        this.zzaz().zzg();
        this.b();
        zzai zzai0 = (zzai)this.A.get(s);
        if(zzai0 == null) {
            e e0 = this.c;
            zzlf.D(e0);
            Preconditions.checkNotNull(s);
            e0.zzg();
            e0.a();
            SQLiteDatabase sQLiteDatabase0 = e0.r();
            Cursor cursor0 = null;
            try {
                try {
                    cursor0 = sQLiteDatabase0.rawQuery("select consent_state from consent_settings where app_id=? limit 1;", new String[]{s});
                    if(cursor0.moveToFirst()) {
                        s1 = cursor0.getString(0);
                        goto label_21;
                    }
                    else {
                        goto label_23;
                    }
                    goto label_25;
                }
                catch(SQLiteException sQLiteException0) {
                    e0.a.zzay().zzd().zzc("Database error", "select consent_state from consent_settings where app_id=? limit 1;", sQLiteException0);
                    throw sQLiteException0;
                }
            }
            catch(Throwable throwable0) {
                TWR.safeClose$NT(cursor0, throwable0);
                throw throwable0;
            }
        label_21:
            cursor0.close();
            goto label_25;
        label_23:
            cursor0.close();
            s1 = "G1";
        label_25:
            zzai0 = zzai.zzb(s1);
            this.n(s, zzai0);
            return zzai0;
        }
        return zzai0;
    }

    public final String G(zzai zzai0) {
        if(zzai0.zzi(zzah.zzb)) {
            byte[] arr_b = new byte[16];
            this.zzv().g().nextBytes(arr_b);
            return String.format(Locale.US, "%032x", new BigInteger(1, arr_b));
        }
        return null;
    }

    public final void a() {
        this.zzaz().zzg();
        this.b();
        if(!this.n) {
            this.n = true;
            this.zzaz().zzg();
            zzge zzge0 = this.l;
            if(this.v == null || !this.v.isValid()) {
                File file0 = new File(zzge0.zzau().getFilesDir(), "google_app_measurement.db");
                try {
                    FileChannel fileChannel0 = new RandomAccessFile(file0, "rw").getChannel();
                    this.w = fileChannel0;
                    FileLock fileLock0 = fileChannel0.tryLock();
                    this.v = fileLock0;
                    if(fileLock0 == null) {
                        this.zzay().zzd().zza("Storage concurrent data access panic");
                        return;
                    }
                    this.zzay().zzj().zza("Storage concurrent access okay");
                }
                catch(FileNotFoundException fileNotFoundException0) {
                    this.zzay().zzd().zzb("Failed to acquire storage lock", fileNotFoundException0);
                    return;
                }
                catch(IOException iOException0) {
                    this.zzay().zzd().zzb("Failed to access storage lock file", iOException0);
                    return;
                }
                catch(OverlappingFileLockException overlappingFileLockException0) {
                    this.zzay().zzk().zzb("Storage lock already acquired", overlappingFileLockException0);
                    return;
                }
            }
            else {
                this.zzay().zzj().zza("Storage concurrent access okay");
            }
            FileChannel fileChannel1 = this.w;
            this.zzaz().zzg();
            int v = 0;
            if(fileChannel1 == null || !fileChannel1.isOpen()) {
                this.zzay().zzd().zza("Bad channel to read from");
            }
            else {
                ByteBuffer byteBuffer0 = ByteBuffer.allocate(4);
                try {
                    fileChannel1.position(0L);
                    int v1 = fileChannel1.read(byteBuffer0);
                    if(v1 == 4) {
                        byteBuffer0.flip();
                        v = byteBuffer0.getInt();
                    }
                    else if(v1 != -1) {
                        this.zzay().zzk().zzb("Unexpected data length. Bytes read", v1);
                    }
                    goto label_46;
                }
                catch(IOException iOException1) {
                }
                this.zzay().zzd().zzb("Failed to read from channel", iOException1);
            }
        label_46:
            zzel zzel0 = zzge0.zzh();
            zzel0.zza();
            int v2 = zzel0.e;
            this.zzaz().zzg();
            if(v > v2) {
                this.zzay().zzd().zzc("Panic: can\'t downgrade version. Previous, current version", v, v2);
                return;
            }
            if(v < v2) {
                FileChannel fileChannel2 = this.w;
                this.zzaz().zzg();
                if(fileChannel2 != null && fileChannel2.isOpen()) {
                    ByteBuffer byteBuffer1 = ByteBuffer.allocate(4);
                    byteBuffer1.putInt(v2);
                    byteBuffer1.flip();
                    try {
                        fileChannel2.truncate(0L);
                        fileChannel2.write(byteBuffer1);
                        fileChannel2.force(true);
                        if(fileChannel2.size() != 4L) {
                            this.zzay().zzd().zzb("Error writing to channel. Bytes written", fileChannel2.size());
                        }
                    }
                    catch(IOException iOException2) {
                        this.zzay().zzd().zzb("Failed to write to channel", iOException2);
                        this.zzay().zzd().zzc("Storage version upgrade failed. Previous, current version", v, v2);
                        return;
                    }
                    this.zzay().zzj().zzc("Storage version upgraded. Previous, current version", v, v2);
                    return;
                }
                this.zzay().zzd().zza("Bad channel to read from");
                this.zzay().zzd().zzc("Storage version upgrade failed. Previous, current version", v, v2);
            }
        }
    }

    public final void b() {
        if(!this.m) {
            throw new IllegalStateException("UploadController is not initialized");
        }
    }

    public final void c(zzgb zzgb0, String s) {
        zzpc.zzc();
        boolean z = this.zzg().zzs(s, zzeh.zzat);
        zzfv zzfv0 = this.a;
        if(z) {
            zzlf.D(zzfv0);
            zzfv0.zzg();
            zzfv0.e(s);
            Set set0 = (Set)zzfv0.e.getOrDefault(s, null);
            if(set0 != null) {
                zzgb0.zzi(set0);
            }
        }
        if(this.zzg().zzs(s, zzeh.zzav)) {
            zzlf.D(zzfv0);
            zzfv0.zzg();
            zzfv0.e(s);
            p.b b0 = zzfv0.e;
            if(b0.getOrDefault(s, null) != null && (((Set)b0.getOrDefault(s, null)).contains("device_model") || ((Set)b0.getOrDefault(s, null)).contains("device_info"))) {
                zzgb0.zzp();
            }
            zzlf.D(zzfv0);
            zzfv0.zzg();
            zzfv0.e(s);
            if(b0.getOrDefault(s, null) != null && (((Set)b0.getOrDefault(s, null)).contains("os_version") || ((Set)b0.getOrDefault(s, null)).contains("device_info"))) {
                if(this.zzg().zzs(s, zzeh.zzaF)) {
                    String s1 = zzgb0.zzar();
                    if(!TextUtils.isEmpty(s1)) {
                        int v = s1.indexOf(".");
                        if(v != -1) {
                            zzgb0.zzY(s1.substring(0, v));
                        }
                    }
                }
                else {
                    zzgb0.zzu();
                }
            }
        }
        if(this.zzg().zzs(s, zzeh.zzaw)) {
            zzlf.D(zzfv0);
            zzfv0.zzg();
            zzfv0.e(s);
            if(zzfv0.e.getOrDefault(s, null) != null && ((Set)zzfv0.e.getOrDefault(s, null)).contains("user_id")) {
                int v1 = zzlh.l(zzgb0, "_id");
                if(v1 != -1) {
                    zzgb0.zzB(v1);
                }
            }
        }
        if(this.zzg().zzs(s, zzeh.zzax)) {
            zzlf.D(zzfv0);
            zzfv0.zzg();
            zzfv0.e(s);
            if(zzfv0.e.getOrDefault(s, null) != null && ((Set)zzfv0.e.getOrDefault(s, null)).contains("google_signals")) {
                zzgb0.zzq();
            }
        }
        if(this.zzg().zzs(s, zzeh.zzaA)) {
            zzlf.D(zzfv0);
            zzfv0.zzg();
            zzfv0.e(s);
            if(zzfv0.e.getOrDefault(s, null) != null && ((Set)zzfv0.e.getOrDefault(s, null)).contains("app_instance_id")) {
                zzgb0.zzn();
                if(this.zzg().zzs(s, zzeh.zzaB)) {
                    HashMap hashMap0 = this.B;
                    f0 f00 = (f0)hashMap0.get(s);
                    if(f00 == null) {
                    label_56:
                        zzln zzln0 = this.zzv();
                        byte[] arr_b = new byte[16];
                        zzln0.g().nextBytes(arr_b);
                        f00 = new f0(this, String.format(Locale.US, "%032x", new BigInteger(1, arr_b)));
                        hashMap0.put(s, f00);
                    }
                    else {
                        long v2 = this.zzg().zzi(s, zzeh.zzR);
                        long v3 = this.zzav().elapsedRealtime();
                        if(v2 + f00.b < v3) {
                            goto label_56;
                        }
                    }
                    zzgb0.zzR(f00.a);
                }
            }
        }
        if(this.zzg().zzs(s, zzeh.zzaC)) {
            zzlf.D(zzfv0);
            zzfv0.zzg();
            zzfv0.e(s);
            if(zzfv0.e.getOrDefault(s, null) != null && ((Set)zzfv0.e.getOrDefault(s, null)).contains("enhanced_user_id")) {
                zzgb0.zzy();
            }
        }
    }

    public final void d(D d0) {
        p.b b1;
        p.b b0;
        zzfv zzfv0 = this.a;
        this.zzaz().zzg();
        if(TextUtils.isEmpty(d0.A()) && TextUtils.isEmpty(d0.u())) {
            this.h(((String)Preconditions.checkNotNull(d0.w())), 204, null, null, null);
            return;
        }
        Uri.Builder uri$Builder0 = new Uri.Builder();
        String s = d0.A();
        if(TextUtils.isEmpty(s)) {
            s = d0.u();
        }
        Uri.Builder uri$Builder1 = uri$Builder0.scheme("https").encodedAuthority("app-measurement.com").path("config/app/" + s).appendQueryParameter("platform", "android");
        this.j.a.zzf().zzh();
        uri$Builder1.appendQueryParameter("gmp_version", "68000").appendQueryParameter("runtime_version", "0");
        zzpc.zzc();
        String s1 = d0.w();
        if(!this.j.a.zzf().zzs(s1, zzeh.zzar)) {
            uri$Builder0.appendQueryParameter("app_instance_id", d0.x());
        }
        String s2 = uri$Builder0.build().toString();
        try {
            Object object0 = Preconditions.checkNotNull(d0.w());
            URL uRL0 = new URL(s2);
            this.zzay().zzj().zzb("Fetching remote configuration", ((String)object0));
            zzlf.D(zzfv0);
            zzfe zzfe0 = zzfv0.i(((String)object0));
            zzlf.D(zzfv0);
            zzfv0.zzg();
            String s3 = (String)zzfv0.m.getOrDefault(((String)object0), null);
            if(zzfe0 == null) {
                b1 = null;
            }
            else {
                if(TextUtils.isEmpty(s3)) {
                    b0 = null;
                }
                else {
                    b0 = new p.b();  // 初始化器: Lp/k;-><init>()V
                    b0.put("If-Modified-Since", s3);
                }
                zzpc.zzc();
                if(this.zzg().zzs(null, zzeh.zzaD)) {
                    zzlf.D(zzfv0);
                    zzfv0.zzg();
                    String s4 = (String)zzfv0.n.getOrDefault(((String)object0), null);
                    if(!TextUtils.isEmpty(s4)) {
                        if(b0 == null) {
                            b0 = new p.b();  // 初始化器: Lp/k;-><init>()V
                        }
                        b0.put("If-None-Match", s4);
                    }
                }
                b1 = b0;
            }
            this.s = true;
            zzlf.D(this.b);
            D3.b b2 = new D3.b(this, 23);
            this.b.zzg();
            this.b.a();
            Preconditions.checkNotNull(uRL0);
            Preconditions.checkNotNull(b2);
            this.b.a.zzaz().zzo(new o(this.b, ((String)object0), uRL0, null, b1, b2));
        }
        catch(MalformedURLException unused_ex) {
            this.zzay().zzd().zzc("Failed to parse config URL. Not fetching. appId", zzeu.d(d0.w()), s2);
        }
    }

    public final void e(zzaw zzaw0, zzq zzq0) {
        List list3;
        List list2;
        zzge zzge0;
        List list1;
        zzaw zzaw2;
        Preconditions.checkNotNull(zzq0);
        Preconditions.checkNotEmpty(zzq0.zza);
        this.zzaz().zzg();
        this.b();
        String s = zzq0.zza;
        zzaw zzaw1 = zzaw0;
        long v = zzaw1.zzd;
        zzpf.zzc();
        zziq zziq0 = null;
        if(this.zzg().zzs(null, zzeh.zzak)) {
            zzev zzev0 = zzev.zzb(zzaw0);
            this.zzaz().zzg();
            if(this.C != null && (this.D != null && this.D.equals(s))) {
                zziq0 = this.C;
            }
            zzln.zzK(zziq0, zzev0.zzd, false);
            zzaw1 = zzev0.zza();
        }
        zzlf.D(this.g);
        Preconditions.checkNotNull(zzaw1);
        Preconditions.checkNotNull(zzq0);
        if(TextUtils.isEmpty(zzq0.zzb) && TextUtils.isEmpty(zzq0.zzq)) {
            return;
        }
        if(!zzq0.zzh) {
            this.E(zzq0);
            return;
        }
        List list0 = zzq0.zzt;
        if(list0 == null) {
            zzaw2 = zzaw1;
        }
        else {
            if(list0.contains(zzaw1.zza)) {
                Bundle bundle0 = zzaw1.zzb.zzc();
                bundle0.putLong("ga_safelisted", 1L);
                zzau zzau0 = new zzau(bundle0);
                zzaw2 = new zzaw(zzaw1.zza, zzau0, zzaw1.zzc, zzaw1.zzd);
                goto label_35;
            }
            this.zzay().zzc().zzd("Dropping non-safelisted event. appId, event name, origin", s, zzaw1.zza, zzaw1.zzc);
            return;
        }
    label_35:
        e e0 = this.c;
        zzlf.D(e0);
        e0.zzw();
        try {
            e e1 = this.c;
            zzlf.D(e1);
            Preconditions.checkNotEmpty(s);
            e1.zzg();
            e1.a();
            int v2 = Long.compare(v, 0L);
            if(v2 < 0) {
                e1.a.zzay().zzk().zzc("Invalid time querying timed out conditional properties", zzeu.d(s), v);
                list1 = Collections.emptyList();
            }
            else {
                list1 = e1.z("active=0 and app_id=? and abs(? - creation_timestamp) > trigger_timeout", new String[]{s, String.valueOf(v)});
            }
            Iterator iterator0 = list1.iterator();
            while(true) {
                boolean z = iterator0.hasNext();
                zzge0 = this.l;
                if(!z) {
                    break;
                }
                Object object0 = iterator0.next();
                zzac zzac0 = (zzac)object0;
                if(zzac0 != null) {
                    this.zzay().zzj().zzd("User property timed out", zzac0.zza, zzge0.zzj().f(zzac0.zzc.zzb), zzac0.zzc.zza());
                    zzaw zzaw3 = zzac0.zzg;
                    if(zzaw3 != null) {
                        this.q(new zzaw(zzaw3, v), zzq0);
                    }
                    e e2 = this.c;
                    zzlf.D(e2);
                    e2.n(s, zzac0.zzc.zzb);
                }
            }
            e e3 = this.c;
            zzlf.D(e3);
            Preconditions.checkNotEmpty(s);
            e3.zzg();
            e3.a();
            if(v2 < 0) {
                e3.a.zzay().zzk().zzc("Invalid time querying expired conditional properties", zzeu.d(s), v);
                list2 = Collections.emptyList();
            }
            else {
                list2 = e3.z("active<>0 and app_id=? and abs(? - triggered_timestamp) > time_to_live", new String[]{s, String.valueOf(v)});
            }
            ArrayList arrayList0 = new ArrayList(list2.size());
            for(Object object1: list2) {
                zzac zzac1 = (zzac)object1;
                if(zzac1 != null) {
                    this.zzay().zzj().zzd("User property expired", zzac1.zza, zzge0.zzj().f(zzac1.zzc.zzb), zzac1.zzc.zza());
                    e e4 = this.c;
                    zzlf.D(e4);
                    e4.c(s, zzac1.zzc.zzb);
                    zzaw zzaw4 = zzac1.zzk;
                    if(zzaw4 != null) {
                        arrayList0.add(zzaw4);
                    }
                    e e5 = this.c;
                    zzlf.D(e5);
                    e5.n(s, zzac1.zzc.zzb);
                }
            }
            for(Object object2: arrayList0) {
                this.q(new zzaw(((zzaw)object2), v), zzq0);
            }
            e e6 = this.c;
            zzlf.D(e6);
            zzge zzge1 = e6.a;
            String s1 = zzaw2.zza;
            Preconditions.checkNotEmpty(s);
            Preconditions.checkNotEmpty(s1);
            e6.zzg();
            e6.a();
            if(v2 < 0) {
                zzge1.zzay().zzk().zzd("Invalid time querying triggered conditional properties", zzeu.d(s), zzge1.zzj().d(s1), v);
                list3 = Collections.emptyList();
            }
            else {
                list3 = e6.z("active=0 and app_id=? and trigger_event_name=? and abs(? - creation_timestamp) <= trigger_timeout", new String[]{s, s1, String.valueOf(v)});
            }
            ArrayList arrayList1 = new ArrayList(list3.size());
            for(Object object3: list3) {
                zzac zzac2 = (zzac)object3;
                if(zzac2 != null) {
                    zzli zzli0 = zzac2.zzc;
                    String s2 = (String)Preconditions.checkNotNull(zzac2.zza);
                    String s3 = zzac2.zzb;
                    Object object4 = Preconditions.checkNotNull(zzli0.zza());
                    g0 g00 = new g0(s2, s3, zzli0.zzb, v, object4);
                    Object object5 = g00.e;
                    String s4 = g00.c;
                    e e7 = this.c;
                    zzlf.D(e7);
                    if(e7.j(g00)) {
                        this.zzay().zzj().zzd("User property triggered", zzac2.zza, zzge0.zzj().f(s4), object5);
                    }
                    else {
                        this.zzay().zzd().zzd("Too many active user properties, ignoring", zzeu.d(zzac2.zza), zzge0.zzj().f(s4), object5);
                    }
                    zzaw zzaw5 = zzac2.zzi;
                    if(zzaw5 != null) {
                        arrayList1.add(zzaw5);
                    }
                    zzac2.zzc = new zzli(g00);
                    zzac2.zze = true;
                    e e8 = this.c;
                    zzlf.D(e8);
                    e8.i(zzac2);
                }
            }
            this.q(zzaw2, zzq0);
            for(Object object6: arrayList1) {
                this.q(new zzaw(((zzaw)object6), v), zzq0);
            }
            e e9 = this.c;
            zzlf.D(e9);
            e9.d();
        }
        finally {
            e e10 = this.c;
            zzlf.D(e10);
            e10.C();
        }
    }

    public final void f(zzaw zzaw0, String s) {
        e e0 = this.c;
        zzlf.D(e0);
        D d0 = e0.s(s);
        if(d0 != null && !TextUtils.isEmpty(d0.y())) {
            Boolean boolean0 = this.v(d0);
            if(boolean0 != null) {
                if(!boolean0.booleanValue()) {
                    this.zzay().zzd().zzb("App version does not match; dropping event. appId", zzeu.d(s));
                    return;
                }
            }
            else if(!"_ui".equals(zzaw0.zza)) {
                this.zzay().zzk().zzb("Could not find package. appId", zzeu.d(s));
            }
            String s1 = d0.A();
            String s2 = d0.y();
            long v = d0.t();
            d0.a.zzaz().zzg();
            String s3 = d0.l;
            d0.a.zzaz().zzg();
            long v1 = d0.m;
            d0.a.zzaz().zzg();
            long v2 = d0.n;
            d0.a.zzaz().zzg();
            boolean z = d0.o;
            String s4 = d0.z();
            d0.a.zzaz().zzg();
            d0.a.zzaz().zzg();
            boolean z1 = d0.p;
            String s5 = d0.u();
            d0.a.zzaz().zzg();
            Boolean boolean1 = d0.r;
            d0.a.zzaz().zzg();
            long v3 = d0.s;
            d0.a.zzaz().zzg();
            this.g(zzaw0, new zzq(s, s1, s2, v, s3, v1, v2, null, z, false, s4, 0L, 0, z1, false, s5, boolean1, v3, d0.t, this.F(s).zzh(), "", null));
            return;
        }
        this.zzay().zzc().zzb("No app data available; dropping event", s);
    }

    public final void g(zzaw zzaw0, zzq zzq0) {
        Bundle bundle1;
        zzfs zzfs0;
        Cursor cursor1;
        Preconditions.checkNotEmpty(zzq0.zza);
        zzev zzev0 = zzev.zzb(zzaw0);
        zzln zzln0 = this.zzv();
        Bundle bundle0 = zzev0.zzd;
        e e0 = this.c;
        zzlf.D(e0);
        String s = zzq0.zza;
        zzge zzge0 = e0.a;
        e0.zzg();
        e0.a();
        Cursor cursor0 = null;
        try {
            cursor1 = null;
            cursor1 = e0.r().rawQuery("select parameters from default_event_params where app_id=?", new String[]{s});
            goto label_17;
        }
        catch(SQLiteException sQLiteException0) {
            goto label_45;
        }
        catch(Throwable throwable0) {
        }
        TWR.safeClose$NT(null, throwable0);
        throw throwable0;
        try {
            try {
            label_17:
                if(cursor1.moveToFirst()) {
                    byte[] arr_b = cursor1.getBlob(0);
                    try {
                        zzfs0 = (zzfs)((zzfr)zzlh.r(zzfs.zze(), arr_b)).zzaE();
                    }
                    catch(IOException iOException0) {
                        zzge0.zzay().zzd().zzc("Failed to retrieve default event parameters. appId", zzeu.d(s), iOException0);
                        goto label_47;
                    }
                    e0.b.zzu();
                    bundle1 = new Bundle();
                    Iterator iterator0 = zzfs0.zzi().iterator();
                    while(true) {
                        if(!iterator0.hasNext()) {
                            goto label_52;
                        }
                        Object object0 = iterator0.next();
                        zzfw zzfw0 = (zzfw)object0;
                        if(zzfw0.zzu()) {
                            bundle1.putDouble("", zzfw0.zza());
                        }
                        else if(zzfw0.zzv()) {
                            bundle1.putFloat("", zzfw0.zzb());
                        }
                        else if(zzfw0.zzy()) {
                            bundle1.putString("", "");
                        }
                        else {
                            if(!zzfw0.zzw()) {
                                continue;
                            }
                            bundle1.putLong("", zzfw0.zzd());
                        }
                    }
                }
                else {
                    zzge0.zzay().zzj().zza("Default event parameters not found");
                    goto label_47;
                }
            }
            catch(SQLiteException sQLiteException0) {
            label_45:
                zzge0.zzay().zzd().zzb("Error selecting default event parameters", sQLiteException0);
                if(cursor1 != null) {
                    goto label_47;
                }
            }
            goto label_54;
        }
        catch(Throwable throwable0) {
            goto label_50;
        }
    label_47:
        cursor1.close();
        goto label_54;
    label_50:
        TWR.safeClose$NT(cursor1, throwable0);
        throw throwable0;
    label_52:
        cursor1.close();
        cursor0 = bundle1;
    label_54:
        zzln0.j(bundle0, ((Bundle)cursor0));
        this.zzv().k(zzev0, this.zzg().zzd(zzq0.zza));
        zzaw zzaw1 = zzev0.zza();
        if("_cmp".equals(zzaw1.zza) && "referrer API v2".equals(zzaw1.zzb.i.getString("_cis"))) {
            String s1 = zzaw1.zzb.i.getString("gclid");
            if(!TextUtils.isEmpty(s1)) {
                this.o(new zzli(zzaw1.zzd, s1, "_lgclid", "auto"), zzq0);
            }
        }
        this.e(zzaw1, zzq0);
    }

    public final void h(String s, int v, IOException iOException0, byte[] arr_b, Map map0) {
        e e3;
        String s2;
        zzfv zzfv0;
        boolean z1;
        D d0;
        Integer integer0;
        this.zzaz().zzg();
        this.b();
        Preconditions.checkNotEmpty(s);
        try {
            if(arr_b == null) {
                arr_b = new byte[0];
            }
            zzes zzes0 = this.zzay().zzj();
            integer0 = (int)arr_b.length;
            zzes0.zzb("onConfigFetched. Response size", integer0);
            e e0 = this.c;
            zzlf.D(e0);
            e0.zzw();
        }
        catch(Throwable throwable0) {
            this.s = false;
            this.w();
            throw throwable0;
        }
        try {
            e e1 = this.c;
            zzlf.D(e1);
            d0 = e1.s(s);
            boolean z = true;
            switch(v) {
                case 200: 
                case 204: {
                    z1 = iOException0 == null;
                    break;
                }
                case 304: {
                    v = 304;
                    z1 = iOException0 == null;
                    break;
                }
                default: {
                    z1 = false;
                }
            }
            if(d0 == null) {
                goto label_77;
            }
            else {
                zzfv0 = this.a;
                if(z1 || v == 404) {
                    List list0 = map0 == null ? null : ((List)map0.get("Last-Modified"));
                    String s1 = list0 == null || list0.isEmpty() ? null : ((String)list0.get(0));
                    zzpc.zzc();
                    if(this.zzg().zzs(null, zzeh.zzaD)) {
                        List list1 = map0 == null ? null : ((List)map0.get("ETag"));
                        s2 = list1 == null || list1.isEmpty() ? null : ((String)list1.get(0));
                    }
                    else {
                        s2 = null;
                    }
                    if(v != 304 && v != 404) {
                        goto label_61;
                    }
                    else {
                        zzlf.D(zzfv0);
                        if(zzfv0.i(s) == null) {
                            zzlf.D(zzfv0);
                            if(zzfv0.n(s, null, null, null)) {
                                goto label_63;
                            }
                            else {
                                goto label_58;
                            }
                        }
                        else {
                            goto label_63;
                        }
                    }
                }
                else {
                    long v1 = this.zzav().currentTimeMillis();
                    d0.a.zzaz().zzg();
                    boolean z2 = d0.C;
                    if(d0.E == v1) {
                        z = false;
                    }
                    d0.C = z2 | z;
                    d0.E = v1;
                    e e2 = this.c;
                    zzlf.D(e2);
                    e2.e(d0);
                    this.zzay().zzj().zzc("Fetching config failed. code, error", v, iOException0);
                    zzlf.D(zzfv0);
                    zzfv0.zzg();
                    zzfv0.m.put(s, null);
                    this.i.zzd.zzb(this.zzav().currentTimeMillis());
                    if(v == 429 || v == 503) {
                        this.i.zzb.zzb(this.zzav().currentTimeMillis());
                    }
                    this.y();
                    goto label_78;
                }
            }
            goto label_89;
        }
        catch(Throwable throwable1) {
            goto label_83;
        }
        try {
        label_58:
            e3 = this.c;
            zzlf.D(e3);
            goto label_89;
        }
        catch(Throwable throwable0) {
            this.s = false;
            this.w();
            throw throwable0;
        }
        try {
        label_61:
            zzlf.D(zzfv0);
            if(zzfv0.n(s, s1, s2, arr_b)) {
            label_63:
                d0.g(this.zzav().currentTimeMillis());
                e e4 = this.c;
                zzlf.D(e4);
                e4.e(d0);
                if(v == 404) {
                    this.zzay().zzl().zzb("Config not found. Using empty config. appId", s);
                }
                else {
                    this.zzay().zzj().zzc("Successfully fetched config. Got network response. code, size", v, integer0);
                }
                zzlf.D(this.b);
                if(!this.b.zza() || !this.A()) {
                    this.y();
                    goto label_78;
                label_77:
                    this.zzay().zzk().zzb("App does not exist in onConfigFetched. appId", zzeu.d(s));
                }
                else {
                    this.p();
                }
            label_78:
                e e5 = this.c;
                zzlf.D(e5);
                e5.d();
            }
            goto label_87;
        }
        catch(Throwable throwable1) {
            try {
            label_83:
                e e6 = this.c;
                zzlf.D(e6);
                e6.C();
                throw throwable1;
            label_87:
                e3 = this.c;
                zzlf.D(e3);
            label_89:
                e3.C();
                goto label_95;
            }
            catch(Throwable throwable0) {
            }
        }
        this.s = false;
        this.w();
        throw throwable0;
    label_95:
        this.s = false;
        this.w();
    }

    public final void i(zzq zzq0) {
        ApplicationInfo applicationInfo0;
        int v10;
        PackageInfo packageInfo0;
        long v7;
        boolean z;
        g g0;
        int v5;
        zzge zzge2;
        int v2;
        this.zzaz().zzg();
        this.b();
        Preconditions.checkNotNull(zzq0);
        Preconditions.checkNotEmpty(zzq0.zza);
        if(zzlf.C(zzq0)) {
            e e0 = this.c;
            zzlf.D(e0);
            D d0 = e0.s(zzq0.zza);
            if(d0 != null && TextUtils.isEmpty(d0.A()) && !TextUtils.isEmpty(zzq0.zzb)) {
                d0.g(0L);
                e e1 = this.c;
                zzlf.D(e1);
                e1.e(d0);
                zzlf.D(this.a);
                this.a.zzg();
                this.a.h.remove(zzq0.zza);
            }
            if(!zzq0.zzh) {
                this.E(zzq0);
                return;
            }
            long v = zzq0.zzm == 0L ? this.zzav().currentTimeMillis() : zzq0.zzm;
            zzge zzge0 = this.l;
            zzaq zzaq0 = zzge0.zzg();
            zzaq0.zzg();
            zzaq0.f = null;
            zzaq0.g = 0L;
            int v1 = zzq0.zzn;
            if(v1 == 0 || v1 == 1) {
                v2 = v1;
            }
            else {
                this.zzay().zzk().zzc("Incorrect app type, assuming installed app. appId, appType", zzeu.d(zzq0.zza), v1);
                v2 = 0;
            }
            e e2 = this.c;
            zzlf.D(e2);
            e2.zzw();
            try {
                e e3 = this.c;
                zzlf.D(e3);
                g0 g00 = e3.w(zzq0.zza, "_npa");
                if(g00 == null || "auto".equals(g00.b)) {
                    if(zzq0.zzr != null) {
                        new zzli(v, ((long)(zzq0.zzr.booleanValue() ? 1L : 0L)), "_npa", "auto");
                        if(g00 == null || !g00.e.equals(0.zzd)) {
                            this.o(null, zzq0);
                        }
                    }
                    else if(g00 != null) {
                        this.k(new zzli(v, null, "_npa", "auto"), zzq0);
                    }
                }
                e e4 = this.c;
                zzlf.D(e4);
                D d1 = e4.s(((String)Preconditions.checkNotNull(zzq0.zza)));
                if(d1 != null) {
                    zzln zzln0 = this.zzv();
                    String s = d1.A();
                    String s1 = d1.u();
                    zzln0.getClass();
                    if(zzln.C(zzq0.zzb, s, zzq0.zzq, s1)) {
                        this.zzay().zzk().zzb("New GMP App Id passed in. Removing cached database data. appId", zzeu.d(d1.w()));
                        e e5 = this.c;
                        zzlf.D(e5);
                        zzge zzge1 = e5.a;
                        String s2 = d1.w();
                        e5.a();
                        e5.zzg();
                        Preconditions.checkNotEmpty(s2);
                        try {
                            SQLiteDatabase sQLiteDatabase0 = e5.r();
                            String[] arr_s = {s2};
                            int v4 = sQLiteDatabase0.delete("events", "app_id=?", arr_s) + sQLiteDatabase0.delete("user_attributes", "app_id=?", arr_s) + sQLiteDatabase0.delete("conditional_properties", "app_id=?", arr_s) + sQLiteDatabase0.delete("apps", "app_id=?", arr_s) + sQLiteDatabase0.delete("raw_events", "app_id=?", arr_s) + sQLiteDatabase0.delete("raw_events_metadata", "app_id=?", arr_s) + sQLiteDatabase0.delete("event_filters", "app_id=?", arr_s) + sQLiteDatabase0.delete("property_filters", "app_id=?", arr_s) + sQLiteDatabase0.delete("audience_filter_values", "app_id=?", arr_s) + sQLiteDatabase0.delete("consent_settings", "app_id=?", arr_s);
                            if(v4 > 0) {
                                zzge1.zzay().zzj().zzc("Deleted application data. app, records", s2, v4);
                            }
                        }
                        catch(SQLiteException sQLiteException0) {
                            zzge1.zzay().zzd().zzc("Error deleting application data. appId, error", zzeu.d(s2), sQLiteException0);
                        }
                        d1 = null;
                    }
                }
                if(d1 == null) {
                    zzge2 = zzge0;
                }
                else {
                    if(d1.t() == 0xFFFFFFFF80000000L) {
                        zzge2 = zzge0;
                        v5 = 0;
                    }
                    else {
                        zzge2 = zzge0;
                        v5 = d1.t() == zzq0.zzj ? 0 : 1;
                    }
                    String s3 = d1.y();
                    if((v5 | (d1.t() != 0xFFFFFFFF80000000L || s3 == null || s3.equals(zzq0.zzc) ? 0 : 1)) != 0) {
                        Bundle bundle0 = new Bundle();
                        bundle0.putString("_pv", s3);
                        this.e(new zzaw("_au", new zzau(bundle0), "auto", v), zzq0);
                    }
                }
                this.E(zzq0);
                if(v2 == 0) {
                    e e6 = this.c;
                    zzlf.D(e6);
                    g0 = e6.v(zzq0.zza, "_f");
                    z = false;
                }
                else {
                    e e7 = this.c;
                    zzlf.D(e7);
                    g0 = e7.v(zzq0.zza, "_v");
                    z = true;
                }
                if(g0 == null) {
                    long v6 = (v / 3600000L + 1L) * 3600000L;
                    if(z) {
                        this.o(new zzli(v, v6, "_fvt", "auto"), zzq0);
                        this.zzaz().zzg();
                        this.b();
                        Bundle bundle2 = new Bundle();
                        bundle2.putLong("_c", 1L);
                        bundle2.putLong("_r", 1L);
                        bundle2.putLong("_et", 1L);
                        if(zzq0.zzp) {
                            bundle2.putLong("_dac", 1L);
                        }
                        this.g(new zzaw("_v", new zzau(bundle2), "auto", v), zzq0);
                    }
                    else {
                        this.o(new zzli(v, v6, "_fot", "auto"), zzq0);
                        this.zzaz().zzg();
                        zzfm zzfm0 = (zzfm)Preconditions.checkNotNull(this.k);
                        String s4 = zzq0.zza;
                        if(s4 != null && !s4.isEmpty()) {
                            zzfm0.a.zzaz().zzg();
                            boolean z1 = zzfm0.a();
                            zzge zzge3 = zzfm0.a;
                            if(z1) {
                                zzfl zzfl0 = new zzfl(zzfm0, s4);
                                zzge3.zzaz().zzg();
                                Intent intent0 = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
                                v7 = v;
                                intent0.setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
                                PackageManager packageManager0 = zzge3.zzau().getPackageManager();
                                if(packageManager0 == null) {
                                    zzge3.zzay().zzm().zza("Failed to obtain Package Manager to verify binding conditions for Install Referrer");
                                }
                                else {
                                    List list0 = packageManager0.queryIntentServices(intent0, 0);
                                    if(list0 == null || list0.isEmpty()) {
                                        zzge3.zzay().zzi().zza("Play Service for fetching Install Referrer is unavailable on device");
                                    }
                                    else {
                                        ServiceInfo serviceInfo0 = ((ResolveInfo)list0.get(0)).serviceInfo;
                                        if(serviceInfo0 != null) {
                                            if(serviceInfo0.name == null || !"com.android.vending".equals(serviceInfo0.packageName) || !zzfm0.a()) {
                                                zzge3.zzay().zzk().zza("Play Store version 8.3.73 or higher required for Install Referrer");
                                            }
                                            else {
                                                Intent intent1 = new Intent(intent0);
                                                try {
                                                    String s5 = "available";
                                                    boolean z2 = ConnectionTracker.getInstance().bindService(zzge3.zzau(), intent1, zzfl0, 1);
                                                    zzes zzes0 = zzge3.zzay().zzj();
                                                    if(!z2) {
                                                        s5 = "not available";
                                                    }
                                                    zzes0.zzb("Install Referrer Service is", s5);
                                                }
                                                catch(RuntimeException runtimeException0) {
                                                    zzge3.zzay().zzd().zzb("Exception occurred while binding to Install Referrer Service", runtimeException0.getMessage());
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            else {
                                zzge3.zzay().zzi().zza("Install Referrer Reporter is not available");
                                v7 = v;
                            }
                        }
                        else {
                            v7 = v;
                            zzfm0.a.zzay().zzm().zza("Install Referrer Reporter was called with invalid app package name");
                        }
                        this.zzaz().zzg();
                        this.b();
                        Bundle bundle1 = new Bundle();
                        bundle1.putLong("_c", 1L);
                        bundle1.putLong("_r", 1L);
                        bundle1.putLong("_uwa", 0L);
                        bundle1.putLong("_pfo", 0L);
                        bundle1.putLong("_sys", 0L);
                        bundle1.putLong("_sysu", 0L);
                        bundle1.putLong("_et", 1L);
                        if(zzq0.zzp) {
                            bundle1.putLong("_dac", 1L);
                        }
                        String s6 = (String)Preconditions.checkNotNull(zzq0.zza);
                        e e8 = this.c;
                        zzlf.D(e8);
                        Preconditions.checkNotEmpty(s6);
                        e8.zzg();
                        e8.a();
                        long v8 = e8.p(s6);
                        if(zzge2.zzau().getPackageManager() == null) {
                            this.zzay().zzd().zzb("PackageManager is null, first open report might be inaccurate. appId", zzeu.d(s6));
                        }
                        else {
                            try {
                                packageInfo0 = Wrappers.packageManager(zzge2.zzau()).getPackageInfo(s6, 0);
                            }
                            catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException0) {
                                this.zzay().zzd().zzc("Package info is null, first open report might be inaccurate. appId", zzeu.d(s6), packageManager$NameNotFoundException0);
                                packageInfo0 = null;
                            }
                            if(packageInfo0 != null) {
                                long v9 = packageInfo0.firstInstallTime;
                                if(v9 != 0L) {
                                    if(v9 == packageInfo0.lastUpdateTime) {
                                        v10 = 1;
                                    }
                                    else {
                                        if(!this.zzg().zzs(null, zzeh.zzab)) {
                                            bundle1.putLong("_uwa", 1L);
                                        }
                                        else if(v8 == 0L) {
                                            bundle1.putLong("_uwa", 1L);
                                            v8 = 0L;
                                        }
                                        v10 = 0;
                                    }
                                    this.o(new zzli(v7, ((long)(1 == v10 ? 1L : 0L)), "_fi", "auto"), zzq0);
                                }
                            }
                            try {
                                applicationInfo0 = Wrappers.packageManager(zzge2.zzau()).getApplicationInfo(s6, 0);
                            }
                            catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException1) {
                                this.zzay().zzd().zzc("Application info is null, first open report might be inaccurate. appId", zzeu.d(s6), packageManager$NameNotFoundException1);
                                applicationInfo0 = null;
                            }
                            if(applicationInfo0 != null) {
                                if((applicationInfo0.flags & 1) != 0) {
                                    bundle1.putLong("_sys", 1L);
                                }
                                if((applicationInfo0.flags & 0x80) != 0) {
                                    bundle1.putLong("_sysu", 1L);
                                }
                            }
                        }
                        if(v8 >= 0L) {
                            bundle1.putLong("_pfo", v8);
                        }
                        this.g(new zzaw("_f", new zzau(bundle1), "auto", v7), zzq0);
                    }
                }
                else if(zzq0.zzi) {
                    this.g(new zzaw("_cd", new zzau(new Bundle()), "auto", v), zzq0);
                }
                e e9 = this.c;
                zzlf.D(e9);
                e9.d();
            }
            finally {
                e e10 = this.c;
                zzlf.D(e10);
                e10.C();
            }
        }
    }

    public final void j(zzac zzac0, zzq zzq0) {
        Preconditions.checkNotNull(zzac0);
        Preconditions.checkNotEmpty(zzac0.zza);
        Preconditions.checkNotNull(zzac0.zzc);
        Preconditions.checkNotEmpty(zzac0.zzc.zzb);
        this.zzaz().zzg();
        this.b();
        if(!zzlf.C(zzq0)) {
            return;
        }
        if(zzq0.zzh) {
            e e0 = this.c;
            zzlf.D(e0);
            e0.zzw();
            try {
                this.E(zzq0);
                String s = (String)Preconditions.checkNotNull(zzac0.zza);
                e e1 = this.c;
                zzlf.D(e1);
                zzac zzac1 = e1.t(s, zzac0.zzc.zzb);
                zzge zzge0 = this.l;
                if(zzac1 == null) {
                    this.zzay().zzk().zzc("Conditional user property doesn\'t exist", zzeu.d(zzac0.zza), zzge0.zzj().f(zzac0.zzc.zzb));
                }
                else {
                    this.zzay().zzc().zzc("Removing conditional user property", zzac0.zza, zzge0.zzj().f(zzac0.zzc.zzb));
                    e e2 = this.c;
                    zzlf.D(e2);
                    e2.n(s, zzac0.zzc.zzb);
                    if(zzac1.zze) {
                        e e3 = this.c;
                        zzlf.D(e3);
                        e3.c(s, zzac0.zzc.zzb);
                    }
                    zzaw zzaw0 = zzac0.zzk;
                    if(zzaw0 != null) {
                        Bundle bundle0 = zzaw0.zzb == null ? null : zzaw0.zzb.zzc();
                        this.q(((zzaw)Preconditions.checkNotNull(this.zzv().R(((zzaw)Preconditions.checkNotNull(zzac0.zzk)).zza, bundle0, zzac1.zzb, zzac0.zzk.zzd, true))), zzq0);
                    }
                }
                e e4 = this.c;
                zzlf.D(e4);
                e4.d();
            }
            finally {
                e e5 = this.c;
                zzlf.D(e5);
                e5.C();
            }
            return;
        }
        this.E(zzq0);
    }

    public final void k(zzli zzli0, zzq zzq0) {
        this.zzaz().zzg();
        this.b();
        if(!zzlf.C(zzq0)) {
            return;
        }
        if(!zzq0.zzh) {
            this.E(zzq0);
            return;
        }
        if("_npa".equals(zzli0.zzb) && zzq0.zzr != null) {
            this.zzay().zzc().zza("Falling back to manifest metadata value for ad personalization");
            this.o(new zzli(this.zzav().currentTimeMillis(), ((long)(zzq0.zzr.booleanValue() ? 1L : 0L)), "_npa", "auto"), zzq0);
            return;
        }
        zzes zzes0 = this.zzay().zzc();
        zzge zzge0 = this.l;
        zzes0.zzb("Removing user property", zzge0.zzj().f(zzli0.zzb));
        e e0 = this.c;
        zzlf.D(e0);
        e0.zzw();
        try {
            this.E(zzq0);
            if("_id".equals(zzli0.zzb)) {
                e e1 = this.c;
                zzlf.D(e1);
                e1.c(((String)Preconditions.checkNotNull(zzq0.zza)), "_lair");
            }
            e e2 = this.c;
            zzlf.D(e2);
            e2.c(((String)Preconditions.checkNotNull(zzq0.zza)), zzli0.zzb);
            e e3 = this.c;
            zzlf.D(e3);
            e3.d();
            this.zzay().zzc().zzb("User property removed", zzge0.zzj().f(zzli0.zzb));
        }
        finally {
            e e4 = this.c;
            zzlf.D(e4);
            e4.C();
        }
    }

    public final void l(zzq zzq0) {
        if(this.x != null) {
            ArrayList arrayList0 = new ArrayList();
            this.y = arrayList0;
            arrayList0.addAll(this.x);
        }
        e e0 = this.c;
        zzlf.D(e0);
        zzge zzge0 = e0.a;
        String s = (String)Preconditions.checkNotNull(zzq0.zza);
        Preconditions.checkNotEmpty(s);
        e0.zzg();
        e0.a();
        try {
            SQLiteDatabase sQLiteDatabase0 = e0.r();
            String[] arr_s = {s};
            int v = sQLiteDatabase0.delete("apps", "app_id=?", arr_s) + sQLiteDatabase0.delete("events", "app_id=?", arr_s) + sQLiteDatabase0.delete("user_attributes", "app_id=?", arr_s) + sQLiteDatabase0.delete("conditional_properties", "app_id=?", arr_s) + sQLiteDatabase0.delete("raw_events", "app_id=?", arr_s) + sQLiteDatabase0.delete("raw_events_metadata", "app_id=?", arr_s) + sQLiteDatabase0.delete("queue", "app_id=?", arr_s) + sQLiteDatabase0.delete("audience_filter_values", "app_id=?", arr_s) + sQLiteDatabase0.delete("main_event_params", "app_id=?", arr_s) + sQLiteDatabase0.delete("default_event_params", "app_id=?", arr_s);
            if(v > 0) {
                zzge0.zzay().zzj().zzc("Reset analytics data. app, records", s, v);
            }
        }
        catch(SQLiteException sQLiteException0) {
            zzge0.zzay().zzd().zzc("Error resetting analytics data. appId, error", zzeu.d(s), sQLiteException0);
        }
        if(zzq0.zzh) {
            this.i(zzq0);
        }
    }

    public final void m(zzac zzac0, zzq zzq0) {
        Preconditions.checkNotNull(zzac0);
        Preconditions.checkNotEmpty(zzac0.zza);
        Preconditions.checkNotNull(zzac0.zzb);
        Preconditions.checkNotNull(zzac0.zzc);
        Preconditions.checkNotEmpty(zzac0.zzc.zzb);
        this.zzaz().zzg();
        this.b();
        if(!zzlf.C(zzq0)) {
            return;
        }
        if(!zzq0.zzh) {
            this.E(zzq0);
            return;
        }
        zzac zzac1 = new zzac(zzac0);
        boolean z = false;
        zzac1.zze = false;
        e e0 = this.c;
        zzlf.D(e0);
        e0.zzw();
        try {
            e e1 = this.c;
            zzlf.D(e1);
            zzac zzac2 = e1.t(((String)Preconditions.checkNotNull(zzac1.zza)), zzac1.zzc.zzb);
            zzge zzge0 = this.l;
            if(zzac2 != null && !zzac2.zzb.equals(zzac1.zzb)) {
                this.zzay().zzk().zzd("Updating a conditional user property with different origin. name, origin, origin (from DB)", zzge0.zzj().f(zzac1.zzc.zzb), zzac1.zzb, zzac2.zzb);
            }
            if(zzac2 != null && zzac2.zze) {
                zzac1.zzb = zzac2.zzb;
                zzac1.zzd = zzac2.zzd;
                zzac1.zzh = zzac2.zzh;
                zzac1.zzf = zzac2.zzf;
                zzac1.zzi = zzac2.zzi;
                zzac1.zze = true;
                zzac1.zzc = new zzli(zzac2.zzc.zzc, zzac1.zzc.zza(), zzac1.zzc.zzb, zzac2.zzc.zzf);
            }
            else if(TextUtils.isEmpty(zzac1.zzf)) {
                zzac1.zzc = new zzli(zzac1.zzd, zzac1.zzc.zza(), zzac1.zzc.zzb, zzac1.zzc.zzf);
                zzac1.zze = true;
                z = true;
            }
            if(zzac1.zze) {
                zzli zzli0 = zzac1.zzc;
                Object object0 = Preconditions.checkNotNull(zzac1.zza);
                String s = zzac1.zzb;
                Object object1 = Preconditions.checkNotNull(zzli0.zza());
                g0 g00 = new g0(((String)object0), s, zzli0.zzb, zzli0.zzc, object1);
                Object object2 = g00.e;
                String s1 = g00.c;
                e e2 = this.c;
                zzlf.D(e2);
                if(e2.j(g00)) {
                    this.zzay().zzc().zzd("User property updated immediately", zzac1.zza, zzge0.zzj().f(s1), object2);
                }
                else {
                    this.zzay().zzd().zzd("(2)Too many active user properties, ignoring", zzeu.d(zzac1.zza), zzge0.zzj().f(s1), object2);
                }
                if(z && zzac1.zzi != null) {
                    this.q(new zzaw(zzac1.zzi, zzac1.zzd), zzq0);
                }
            }
            e e3 = this.c;
            zzlf.D(e3);
            if(e3.i(zzac1)) {
                this.zzay().zzc().zzd("Conditional property added", zzac1.zza, zzge0.zzj().f(zzac1.zzc.zzb), zzac1.zzc.zza());
            }
            else {
                this.zzay().zzd().zzd("Too many conditional properties, ignoring", zzeu.d(zzac1.zza), zzge0.zzj().f(zzac1.zzc.zzb), zzac1.zzc.zza());
            }
            e e4 = this.c;
            zzlf.D(e4);
            e4.d();
        }
        finally {
            e e5 = this.c;
            zzlf.D(e5);
            e5.C();
        }
    }

    public final void n(String s, zzai zzai0) {
        this.zzaz().zzg();
        this.b();
        this.A.put(s, zzai0);
        e e0 = this.c;
        zzlf.D(e0);
        zzge zzge0 = e0.a;
        Preconditions.checkNotNull(s);
        Preconditions.checkNotNull(zzai0);
        e0.zzg();
        e0.a();
        ContentValues contentValues0 = new ContentValues();
        contentValues0.put("app_id", s);
        contentValues0.put("consent_state", zzai0.zzh());
        try {
            if(e0.r().insertWithOnConflict("consent_settings", null, contentValues0, 5) == -1L) {
                zzge0.zzay().zzd().zzb("Failed to insert/update consent setting (got -1). appId", zzeu.d(s));
            }
        }
        catch(SQLiteException sQLiteException0) {
            zzge0.zzay().zzd().zzc("Error storing consent setting. appId, error", zzeu.d(s), sQLiteException0);
        }
    }

    public final void o(zzli zzli0, zzq zzq0) {
        long v3;
        this.zzaz().zzg();
        this.b();
        if(!zzlf.C(zzq0)) {
            return;
        }
        if(!zzq0.zzh) {
            this.E(zzq0);
            return;
        }
        int v = this.zzv().M(zzli0.zzb);
        d0 d00 = this.E;
        if(v != 0) {
            zzln zzln0 = this.zzv();
            this.zzg();
            this.zzv().getClass();
            zzln.l(d00, zzq0.zza, v, "_ev", zzln0.zzD(zzli0.zzb, 24, true), (zzli0.zzb == null ? 0 : zzli0.zzb.length()));
            return;
        }
        int v1 = this.zzv().J(zzli0.zza(), zzli0.zzb);
        if(v1 != 0) {
            zzln zzln1 = this.zzv();
            this.zzg();
            Object object0 = zzli0.zza();
            this.zzv().getClass();
            zzln.l(d00, zzq0.zza, v1, "_ev", zzln1.zzD(zzli0.zzb, 24, true), (object0 != null && (object0 instanceof String || object0 instanceof CharSequence) ? object0.toString().length() : 0));
            return;
        }
        Object object1 = this.zzv().e(zzli0.zza(), zzli0.zzb);
        if(object1 == null) {
            return;
        }
        if("_sid".equals(zzli0.zzb)) {
            long v2 = zzli0.zzc;
            String s = zzli0.zzf;
            String s1 = (String)Preconditions.checkNotNull(zzq0.zza);
            e e0 = this.c;
            zzlf.D(e0);
            g0 g00 = e0.w(s1, "_sno");
            if(g00 == null) {
            label_38:
                if(g00 != null) {
                    this.zzay().zzk().zzb("Retrieved last session number from database does not contain a valid (long) value", g00.e);
                }
                e e1 = this.c;
                zzlf.D(e1);
                g g0 = e1.v(s1, "_s");
                if(g0 == null) {
                    v3 = 0L;
                }
                else {
                    this.zzay().zzj().zzb("Backfill the session number. Last used session number", g0.c);
                    v3 = g0.c;
                }
            }
            else {
                Object object2 = g00.e;
                if(object2 instanceof Long) {
                    v3 = (long)(((Long)object2));
                    goto label_48;
                }
                goto label_38;
            }
        label_48:
            this.o(new zzli(v2, ((long)(v3 + 1L)), "_sno", s), zzq0);
        }
        g0 g01 = new g0(((String)Preconditions.checkNotNull(zzq0.zza)), ((String)Preconditions.checkNotNull(zzli0.zzf)), zzli0.zzb, zzli0.zzc, object1);
        zzes zzes0 = this.zzay().zzj();
        zzge zzge0 = this.l;
        String s2 = g01.c;
        zzes0.zzc("Setting user property", zzge0.zzj().f(s2), object1);
        e e2 = this.c;
        zzlf.D(e2);
        e2.zzw();
        try {
            Object object3 = g01.e;
            if("_id".equals(s2)) {
                e e3 = this.c;
                zzlf.D(e3);
                g0 g02 = e3.w(zzq0.zza, "_id");
                if(g02 != null && !object3.equals(g02.e)) {
                    e e4 = this.c;
                    zzlf.D(e4);
                    e4.c(zzq0.zza, "_lair");
                }
            }
            this.E(zzq0);
            e e5 = this.c;
            zzlf.D(e5);
            boolean z = e5.j(g01);
            e e6 = this.c;
            zzlf.D(e6);
            e6.d();
            if(!z) {
                this.zzay().zzd().zzc("Too many unique user properties are set. Ignoring user property", zzge0.zzj().f(s2), object3);
                this.zzv().getClass();
                zzln.l(d00, zzq0.zza, 9, null, null, 0);
            }
        }
        finally {
            e e7 = this.c;
            zzlf.D(e7);
            e7.C();
        }
    }

    public final void p() {
        String s4;
        Cursor cursor3;
        zzgb zzgb0;
        List list0;
        long v13;
        zzge zzge1;
        e e4;
        String s3;
        String s1;
        zzlh zzlh1;
        byte[] arr_b2;
        ByteArrayOutputStream byteArrayOutputStream0;
        GZIPInputStream gZIPInputStream0;
        ByteArrayInputStream byteArrayInputStream0;
        zzlh zzlh0;
        byte[] arr_b;
        long v9;
        int v8;
        ArrayList arrayList0;
        Cursor cursor2;
        zzge zzge0;
        e e2;
        int v6;
        Cursor cursor1;
        e e1;
        long v5;
        String s;
        Cursor cursor0;
        long v;
        zzfa zzfa0 = this.b;
        this.zzaz().zzg();
        this.b();
        this.u = true;
        try {
            Boolean boolean0 = this.l.zzt().k();
            if(boolean0 == null) {
                goto label_260;
            }
            else if(boolean0.booleanValue()) {
                goto label_258;
            }
            else if(this.o <= 0L) {
                this.zzaz().zzg();
                if(this.x == null) {
                    zzlf.D(zzfa0);
                    if(zzfa0.zza()) {
                        v = this.zzav().currentTimeMillis();
                        cursor0 = null;
                        int v1 = this.zzg().zze(null, zzeh.zzP);
                        this.zzg();
                        long v2 = zzag.zzz();
                        for(int v3 = 0; v3 < v1 && this.z(v - v2); ++v3) {
                        }
                        long v4 = this.i.zzc.zza();
                        if(v4 != 0L) {
                            this.zzay().zzc().zzb("Uploading events. Elapsed time since last upload attempt (ms)", Math.abs(v - v4));
                        }
                        e e0 = this.c;
                        zzlf.D(e0);
                        s = e0.zzr();
                        v5 = -1L;
                        if(TextUtils.isEmpty(s)) {
                            goto label_213;
                        }
                        else {
                            if(this.z == -1L) {
                                e1 = this.c;
                                zzlf.D(e1);
                                cursor1 = null;
                                cursor1 = e1.r().rawQuery("select rowid from raw_events order by rowid desc limit 1;", null);
                                goto label_37;
                            }
                            goto label_53;
                        }
                    }
                    else {
                        goto label_251;
                    }
                }
                else {
                    goto label_254;
                }
            }
            else {
                goto label_256;
            }
            goto label_266;
        }
        catch(Throwable throwable0) {
            this.u = false;
            this.w();
            throw throwable0;
        }
        try {
            cursor1 = null;
            cursor1 = e1.r().rawQuery("select rowid from raw_events order by rowid desc limit 1;", null);
            goto label_37;
        }
        catch(SQLiteException sQLiteException0) {
            goto label_41;
        }
        catch(Throwable throwable1) {
        }
        goto label_46;
        try {
            try {
            label_37:
                if(cursor1.moveToFirst()) {
                    v5 = cursor1.getLong(0);
                    goto label_49;
                }
                else {
                    goto label_51;
                }
            }
            catch(SQLiteException sQLiteException0) {
            label_41:
                e1.a.zzay().zzd().zzb("Error querying raw events", sQLiteException0);
                if(cursor1 != null) {
                    goto label_49;
                }
            }
            goto label_52;
        }
        catch(Throwable throwable1) {
            cursor0 = cursor1;
        }
        try {
        label_46:
            if(cursor0 != null) {
                cursor0.close();
            }
            throw throwable1;
        label_49:
            cursor1.close();
            goto label_52;
        label_51:
            cursor1.close();
        label_52:
            this.z = v5;
        label_53:
            v6 = this.zzg().zze(s, zzeh.zzf);
            int v7 = Math.max(0, this.zzg().zze(s, zzeh.zzg));
            e2 = this.c;
            zzlf.D(e2);
            zzge0 = e2.a;
            e2.zzg();
            e2.a();
            Preconditions.checkArgument(v6 > 0);
            Preconditions.checkArgument(v7 > 0);
            Preconditions.checkNotEmpty(s);
        }
        catch(Throwable throwable0) {
            this.u = false;
            this.w();
            throw throwable0;
        }
        try {
            cursor2 = null;
            cursor2 = e2.r().query("queue", new String[]{"rowid", "data", "retry_count"}, "app_id=?", new String[]{s}, null, null, "rowid", String.valueOf(v6));
            if(cursor2.moveToFirst()) {
                arrayList0 = new ArrayList();
                v8 = 0;
                while(true) {
                label_68:
                    v9 = cursor2.getLong(0);
                    try {
                        arr_b = cursor2.getBlob(1);
                        zzlh0 = e2.b.g;
                        zzlf.D(zzlh0);
                        goto label_76;
                    }
                    catch(IOException iOException0) {
                    }
                    goto label_74;
                }
            }
            else {
                list0 = Collections.emptyList();
                goto label_130;
            }
            goto label_131;
        }
        catch(SQLiteException sQLiteException1) {
            goto label_123;
        }
        catch(Throwable throwable2) {
            goto label_127;
        }
    label_74:
        e e3 = e2;
        goto label_94;
        try {
            try {
            label_76:
                byteArrayInputStream0 = new ByteArrayInputStream(arr_b);
                e3 = e2;
                gZIPInputStream0 = new GZIPInputStream(byteArrayInputStream0);
                e3 = e2;
                byteArrayOutputStream0 = new ByteArrayOutputStream();
            }
            catch(IOException iOException1) {
                goto label_91;
            }
            catch(SQLiteException sQLiteException1) {
                goto label_123;
            }
            byte[] arr_b1 = new byte[0x400];
            try {
                try {
                    int v10;
                    while((v10 = gZIPInputStream0.read(arr_b1)) > 0) {
                        byteArrayOutputStream0.write(arr_b1, 0, v10);
                    }
                    gZIPInputStream0.close();
                    byteArrayInputStream0.close();
                    arr_b2 = byteArrayOutputStream0.toByteArray();
                    goto label_96;
                }
                catch(IOException iOException1) {
                }
                try {
                label_91:
                    zzlh0.a.zzay().zzd().zzb("Failed to ungzip content", iOException1);
                    throw iOException1;
                }
                catch(IOException iOException0) {
                }
            }
            catch(SQLiteException sQLiteException1) {
                goto label_123;
            }
        }
        catch(Throwable throwable2) {
            goto label_127;
        }
        try {
        label_94:
            zzge0.zzay().zzd().zzc("Failed to unzip queued bundle. appId", zzeu.d(s), iOException0);
            goto label_112;
        }
        catch(SQLiteException sQLiteException1) {
            goto label_123;
        }
        catch(Throwable throwable2) {
            goto label_127;
        }
    label_96:
        if(arrayList0.isEmpty()) {
            goto label_103;
            try {
            label_115:
                cursor2.close();
                list0 = arrayList0;
                goto label_131;
            }
            catch(Throwable throwable0) {
                this.u = false;
                this.w();
                throw throwable0;
            }
            try {
                try {
                    list0 = Collections.emptyList();
                    goto label_130;
                }
                catch(SQLiteException sQLiteException1) {
                }
            label_123:
                zzge0.zzay().zzd().zzc("Error querying bundles. appId", zzeu.d(s), sQLiteException1);
                list0 = Collections.emptyList();
                if(cursor2 != null) {
                    goto label_130;
                }
                goto label_131;
            }
            catch(Throwable throwable2) {
                goto label_127;
            }
            goto label_130;
            try {
            label_127:
                if(cursor2 != null) {
                    cursor2.close();
                }
                throw throwable2;
            label_130:
                cursor2.close();
            label_131:
                if(!list0.isEmpty()) {
                    if(this.F(s).zzi(zzah.zza)) {
                        for(Object object0: list0) {
                            zzgc zzgc0 = (zzgc)((Pair)object0).first;
                        }
                    }
                    zzfz zzfz0 = zzga.zza();
                    int v11 = list0.size();
                    ArrayList arrayList1 = new ArrayList(list0.size());
                    boolean z = this.zzg().zzt(s) && this.F(s).zzi(zzah.zza);
                    boolean z1 = this.F(s).zzi(zzah.zza);
                    boolean z2 = this.F(s).zzi(zzah.zzb);
                    zzpi.zzc();
                    boolean z3 = this.zzg().zzs(null, zzeh.zzay);
                    for(int v12 = 0; true; ++v12) {
                        zzlh1 = this.g;
                        if(v12 >= v11) {
                            break;
                        }
                        zzgb zzgb1 = (zzgb)((zzgc)((Pair)list0.get(v12)).first).zzby();
                        arrayList1.add(((Long)((Pair)list0.get(v12)).second));
                        this.zzg().zzh();
                        zzgb1.zzal(68000L);
                        zzgb1.zzak(v);
                        zzgb1.zzag(false);
                        if(!z) {
                            zzgb1.zzq();
                        }
                        if(!z1) {
                            zzgb1.zzx();
                            zzgb1.zzt();
                        }
                        if(!z2) {
                            zzgb1.zzn();
                        }
                        this.c(zzgb1, s);
                        if(!z3) {
                            zzgb1.zzy();
                        }
                        if(this.zzg().zzs(s, zzeh.zzT)) {
                            byte[] arr_b3 = ((zzgc)zzgb1.zzaE()).zzbv();
                            zzlf.D(zzlh1);
                            zzgb1.zzJ(zzlh1.m(arr_b3));
                        }
                        zzfz0.zza(zzgb1);
                    }
                    if(Log.isLoggable(this.zzay().zzq(), 2)) {
                        zzlf.D(zzlh1);
                        s1 = zzlh1.s(((zzga)zzfz0.zzaE()));
                    }
                    else {
                        s1 = null;
                    }
                    zzlf.D(zzlh1);
                    byte[] arr_b4 = ((zzga)zzfz0.zzaE()).zzbv();
                    zzku zzku0 = this.j;
                    zzpc.zzc();
                    if(zzku0.a.zzf().zzs(s, zzeh.zzau)) {
                        zzlf.D(zzku0.b.a);
                        String s2 = zzku0.b.a.j(s);
                        if(TextUtils.isEmpty(s2)) {
                            s3 = "https://app-measurement.com/a";
                        }
                        else {
                            Uri uri0 = Uri.parse("https://app-measurement.com/a");
                            Uri.Builder uri$Builder0 = uri0.buildUpon();
                            uri$Builder0.authority(s2 + "." + uri0.getAuthority());
                            s3 = uri$Builder0.build().toString();
                        }
                    }
                    else {
                        s3 = "https://app-measurement.com/a";
                    }
                    try {
                        URL uRL0 = new URL(s3);
                        Preconditions.checkArgument(!arrayList1.isEmpty());
                        if(this.x == null) {
                            this.x = new ArrayList(arrayList1);
                        }
                        else {
                            this.zzay().zzd().zza("Set uploading progress before finishing the previous upload");
                        }
                        this.i.zzd.zzb(v);
                        this.zzay().zzj().zzd("Uploading data. app, uncompressed size, data", (v11 <= 0 ? "?" : ""), ((int)arr_b4.length), s1);
                        this.t = true;
                        zzlf.D(zzfa0);
                        d0 d00 = new d0(this, s);
                        zzfa0.zzg();
                        zzfa0.a();
                        Preconditions.checkNotNull(uRL0);
                        Preconditions.checkNotNull(arr_b4);
                        Preconditions.checkNotNull(d00);
                        zzfa0.a.zzaz().zzo(new o(zzfa0, s, uRL0, arr_b4, null, d00));
                    }
                    catch(MalformedURLException unused_ex) {
                        this.zzay().zzd().zzc("Failed to parse upload URL. Not uploading. appId", zzeu.d(s), s3);
                    }
                    goto label_266;
                label_213:
                    this.z = -1L;
                    e4 = this.c;
                    zzlf.D(e4);
                    zzge1 = e4.a;
                    this.zzg();
                    v13 = zzag.zzz();
                    e4.zzg();
                    e4.a();
                    cursor3 = null;
                    cursor3 = e4.r().rawQuery("select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;", new String[]{String.valueOf(v - v13)});
                    goto label_227;
                }
                goto label_266;
            }
            catch(Throwable throwable0) {
                this.u = false;
                this.w();
                throw throwable0;
            }
        }
        else if(arr_b2.length + v8 > v7) {
            try {
                cursor2.close();
                list0 = arrayList0;
            }
            catch(Throwable throwable0) {
                this.u = false;
                this.w();
                throw throwable0;
            }
        }
        else {
            try {
                try {
                    zzgb0 = (zzgb)zzlh.r(zzgc.zzt(), arr_b2);
                    goto label_108;
                label_103:
                    zzgb0 = (zzgb)zzlh.r(zzgc.zzt(), arr_b2);
                }
                catch(IOException iOException2) {
                    zzge0.zzay().zzd().zzc("Failed to merge queued bundle. appId", zzeu.d(s), iOException2);
                    goto label_112;
                }
            label_108:
                if(!cursor2.isNull(2)) {
                    zzgb0.zzaf(cursor2.getInt(2));
                }
                v8 += arr_b2.length;
                arrayList0.add(Pair.create(((zzgc)zzgb0.zzaE()), v9));
            label_112:
                if(cursor2.moveToNext() && v8 <= v7) {
                    e2 = e3;
                    goto label_68;
                }
                goto label_115;
            }
            catch(SQLiteException sQLiteException1) {
                goto label_123;
            }
            catch(Throwable throwable2) {
                goto label_127;
            }
        }
        goto label_131;
        try {
            cursor3 = null;
            cursor3 = e4.r().rawQuery("select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;", new String[]{String.valueOf(v - v13)});
            goto label_227;
        }
        catch(SQLiteException sQLiteException2) {
            goto label_233;
        }
        catch(Throwable throwable3) {
        }
        Cursor cursor4 = null;
        goto label_240;
        try {
            try {
            label_227:
                if(cursor3.moveToFirst()) {
                    s4 = cursor3.getString(0);
                    goto label_243;
                }
                else {
                    zzge1.zzay().zzj().zza("No expired configs for apps with pending events");
                    goto label_235;
                }
            }
            catch(SQLiteException sQLiteException2) {
            label_233:
                zzge1.zzay().zzd().zzb("Error selecting expired configs", sQLiteException2);
                if(cursor3 != null) {
                    goto label_235;
                }
                s4 = null;
            }
            goto label_244;
        }
        catch(Throwable throwable3) {
            goto label_239;
        }
        try {
        label_235:
            cursor3.close();
            s4 = null;
            goto label_244;
        label_239:
            cursor4 = cursor3;
        label_240:
            if(cursor4 != null) {
                cursor4.close();
            }
            throw throwable3;
        label_243:
            cursor3.close();
        label_244:
            if(!TextUtils.isEmpty(s4)) {
                e e5 = this.c;
                zzlf.D(e5);
                D d0 = e5.s(s4);
                if(d0 != null) {
                    this.d(d0);
                    goto label_266;
                label_251:
                    this.zzay().zzj().zza("Network not connected, ignoring upload request");
                    this.y();
                    goto label_266;
                label_254:
                    this.zzay().zzj().zza("Uploading requested multiple times");
                    goto label_266;
                label_256:
                    this.y();
                    goto label_266;
                label_258:
                    this.zzay().zzd().zza("Upload called in the client side when service should be used");
                    goto label_266;
                label_260:
                    this.zzay().zzk().zza("Upload data called on the client side before use of service was decided");
                }
            }
        }
        catch(Throwable throwable0) {
            this.u = false;
            this.w();
            throw throwable0;
        }
    label_266:
        this.u = false;
        this.w();
    }

    public final void q(zzaw zzaw0, zzq zzq0) {
        int v22;
        long v21;
        ArrayList arrayList0;
        zzeg zzeg0;
        g g1;
        String s3;
        long v14;
        zzak zzak0;
        long v8;
        g0 g01;
        double f;
        long v4;
        zzfv zzfv2;
        d0 d01;
        zzlh zzlh1;
        zzfv zzfv1;
        Preconditions.checkNotNull(zzq0);
        Preconditions.checkNotEmpty(zzq0.zza);
        long v = System.nanoTime();
        this.zzaz().zzg();
        this.b();
        String s = zzq0.zza;
        zzlh zzlh0 = this.g;
        zzlf.D(zzlh0);
        Preconditions.checkNotNull(zzaw0);
        Preconditions.checkNotNull(zzq0);
        if(TextUtils.isEmpty(zzq0.zzb) && TextUtils.isEmpty(zzq0.zzq)) {
            return;
        }
        if(zzq0.zzh) {
            zzfv zzfv0 = this.a;
            zzlf.D(zzfv0);
            boolean z = zzfv0.m(s, zzaw0.zza);
            d0 d00 = this.E;
            zzge zzge0 = this.l;
            if(z) {
                this.zzay().zzk().zzc("Dropping blocked event. appId", zzeu.d(s), zzge0.zzj().d(zzaw0.zza));
                zzlf.D(zzfv0);
                if("1".equals(zzfv0.zza(s, "measurement.upload.blacklist_internal"))) {
                label_28:
                    e e0 = this.c;
                    zzlf.D(e0);
                    D d0 = e0.s(s);
                    if(d0 != null) {
                        d0.a.zzaz().zzg();
                        long v1 = d0.E;
                        d0.a.zzaz().zzg();
                        long v2 = Math.max(v1, d0.D);
                        long v3 = Math.abs(this.zzav().currentTimeMillis() - v2);
                        this.zzg();
                        if(v3 > ((long)(((Long)zzeh.zzy.zza(null))))) {
                            this.zzay().zzc().zza("Fetching config for blocked app");
                            this.d(d0);
                        }
                    }
                }
                else {
                    zzlf.D(zzfv0);
                    if("1".equals(zzfv0.zza(s, "measurement.upload.blacklist_public"))) {
                        goto label_28;
                    }
                    else if(!"_err".equals(zzaw0.zza)) {
                        this.zzv().getClass();
                        zzln.l(d00, s, 11, "_ev", zzaw0.zza, 0);
                        return;
                    }
                }
                return;
            }
            zzev zzev0 = zzev.zzb(zzaw0);
            this.zzv().k(zzev0, this.zzg().zzd(s));
            zzaw zzaw1 = zzev0.zza();
            if(Log.isLoggable(this.zzay().zzq(), 2)) {
                this.zzay().zzj().zzb("Logging event", zzge0.zzj().c(zzaw1));
            }
            e e1 = this.c;
            zzlf.D(e1);
            e1.zzw();
            try {
                this.E(zzq0);
                boolean z1 = "ecommerce_purchase".equals(zzaw1.zza) || ("purchase".equals(zzaw1.zza) || "refund".equals(zzaw1.zza));
                if(!"_iap".equals(zzaw1.zza)) {
                    if(z1) {
                        z1 = true;
                        goto label_60;
                    }
                    zzfv1 = zzfv0;
                    zzlh1 = zzlh0;
                    d01 = d00;
                    goto label_118;
                }
            label_60:
                String s1 = zzaw1.zzb.j();
                if(!z1) {
                    zzfv2 = zzfv0;
                    v4 = zzaw1.zzb.i.getLong("value");
                    goto label_75;
                }
                f = ((double)zzaw1.zzb.a()) * 1000000.0;
                if(f == 0.0) {
                    zzfv2 = zzfv0;
                    f = ((double)zzaw1.zzb.i.getLong("value")) * 1000000.0;
                }
                else {
                    zzfv2 = zzfv0;
                }
                if(f <= 9223372036854776000.0 && f >= -9223372036854776000.0) {
                    v4 = Math.round(f);
                    if("refund".equals(zzaw1.zza)) {
                        v4 = -v4;
                    }
                label_75:
                    if(TextUtils.isEmpty(s1)) {
                    label_115:
                        zzlh1 = zzlh0;
                        d01 = d00;
                        zzfv1 = zzfv2;
                    }
                    else {
                        String s2 = s1.toUpperCase(Locale.US);
                        if(s2.matches("[A-Z]{3}")) {
                            e e2 = this.c;
                            zzlf.D(e2);
                            g0 g00 = e2.w(s, "_ltv_" + s2);
                            if(g00 == null) {
                                d01 = d00;
                                zzfv1 = zzfv2;
                            label_95:
                                e e3 = this.c;
                                zzlf.D(e3);
                                int v6 = this.zzg().zze(s, zzeh.zzD);
                                Preconditions.checkNotEmpty(s);
                                e3.zzg();
                                e3.a();
                                try {
                                    e3.r().execSQL("delete from user_attributes where app_id=? and name in (select name from user_attributes where app_id=? and name like \'_ltv_%\' order by set_timestamp desc limit ?,10);", new String[]{s, s, String.valueOf(v6 - 1)});
                                }
                                catch(SQLiteException sQLiteException0) {
                                    e3.a.zzay().zzd().zzc("Error pruning currencies. appId", zzeu.d(s), sQLiteException0);
                                }
                                long v7 = this.zzav().currentTimeMillis();
                                zzlh1 = zzlh0;
                                g01 = new g0(s, zzaw1.zzc, "_ltv_" + s2, v7, v4);
                            }
                            else {
                                Object object0 = g00.e;
                                if(object0 instanceof Long) {
                                    long v5 = this.zzav().currentTimeMillis();
                                    d01 = d00;
                                    zzfv1 = zzfv2;
                                    g01 = new g0(s, zzaw1.zzc, "_ltv_" + s2, v5, ((long)(((long)(((Long)object0))) + v4)));
                                    zzlh1 = zzlh0;
                                }
                                else {
                                    d01 = d00;
                                    zzfv1 = zzfv2;
                                    goto label_95;
                                }
                            }
                            e e4 = this.c;
                            zzlf.D(e4);
                            if(!e4.j(g01)) {
                                this.zzay().zzd().zzd("Too many unique user properties are set. Ignoring user property. appId", zzeu.d(s), zzge0.zzj().f(g01.c), g01.e);
                                this.zzv().getClass();
                                zzln.l(d01, s, 9, null, null, 0);
                            }
                        }
                        else {
                            goto label_115;
                        }
                    }
                label_118:
                    boolean z2 = zzln.z(zzaw1.zza);
                    boolean z3 = "_err".equals(zzaw1.zza);
                    this.zzv();
                    zzau zzau0 = zzaw1.zzb;
                    if(zzau0 == null) {
                        v8 = 0L;
                    }
                    else {
                        v8 = 0L;
                        for(Object object1: zzau0.i.keySet()) {
                            Object object2 = zzau0.i(((String)object1));
                            if(object2 instanceof Parcelable[]) {
                                v8 += (long)((Parcelable[])object2).length;
                            }
                        }
                    }
                    e e5 = this.c;
                    zzlf.D(e5);
                    zzak0 = e5.u(this.r(), s, v8 + 1L, true, z2, false, z3, false);
                    long v9 = zzak0.b;
                    this.zzg();
                    long v10 = v9 - ((long)(((int)(((Integer)zzeh.zzj.zza(null))))));
                    if(v10 <= 0L) {
                        if(!z2) {
                            goto label_146;
                        }
                        long v11 = zzak0.a;
                        this.zzg();
                        long v12 = v11 - ((long)(((int)(((Integer)zzeh.zzl.zza(null))))));
                        if(v12 <= 0L) {
                        label_146:
                            if(z3) {
                                long v13 = zzak0.d - ((long)Math.max(0, Math.min(1000000, this.zzg().zze(zzq0.zza, zzeh.zzk))));
                                if(v13 > 0L) {
                                    if(v13 == 1L) {
                                        this.zzay().zzd().zzc("Too many error events logged. appId, count", zzeu.d(s), zzak0.d);
                                    }
                                    e e6 = this.c;
                                    zzlf.D(e6);
                                    e6.d();
                                    goto label_154;
                                }
                            }
                            goto label_158;
                        }
                        goto label_400;
                    }
                    goto label_411;
                }
                goto label_420;
            }
            catch(Throwable throwable0) {
                goto label_426;
            }
        label_154:
            e e7 = this.c;
            zzlf.D(e7);
            e7.C();
            return;
            try {
            label_158:
                Bundle bundle0 = zzaw1.zzb.zzc();
                this.zzv().m(bundle0, "_o", zzaw1.zzc);
                zzln zzln0 = this.zzv();
                zzln0.getClass();
                if((TextUtils.isEmpty(s) ? false : zzln0.a.zzf().zzl().equals(s))) {
                    this.zzv().m(bundle0, "_dbg", 1L);
                    this.zzv().m(bundle0, "_r", 1L);
                }
                if("_s".equals(zzaw1.zza)) {
                    e e8 = this.c;
                    zzlf.D(e8);
                    g0 g02 = e8.w(zzq0.zza, "_sno");
                    if(g02 != null && g02.e instanceof Long) {
                        this.zzv().m(bundle0, "_sno", g02.e);
                    }
                }
                e e9 = this.c;
                zzlf.D(e9);
                zzge zzge1 = e9.a;
                Preconditions.checkNotEmpty(s);
                e9.zzg();
                e9.a();
                try {
                    v14 = (long)e9.r().delete("raw_events", "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)", new String[]{s, String.valueOf(Math.max(0, Math.min(1000000, zzge1.zzf().zze(s, zzeh.zzo))))});
                }
                catch(SQLiteException sQLiteException1) {
                    zzge1.zzay().zzd().zzc("Error deleting over the limit events. appId", zzeu.d(s), sQLiteException1);
                    v14 = 0L;
                }
                if(v14 > 0L) {
                    this.zzay().zzk().zzc("Data lost. Too many events stored on disk, deleted. appId", zzeu.d(s), v14);
                }
                zzar zzar0 = new zzar(this.l, zzaw1.zzc, s, zzaw1.zza, zzaw1.zzd, bundle0);
                s3 = zzar0.b;
                e e10 = this.c;
                zzlf.D(e10);
                g g0 = e10.v(s, s3);
                if(g0 != null) {
                    zzar0 = zzar0.a(zzge0, g0.f);
                    g1 = g0.b(zzar0.d);
                    goto label_201;
                }
                e e11 = this.c;
                zzlf.D(e11);
                long v15 = e11.q(s);
                zzag zzag0 = this.zzg();
                zzag0.getClass();
                zzeg0 = zzeh.zzG;
                if(v15 < ((long)zzag0.zzf(s, zzeg0, 500, 2000)) || !z2) {
                    g1 = new g(s, zzar0.b, 0L, 0L, 0L, zzar0.d, 0L, null, null, null, null);
                label_201:
                    e e12 = this.c;
                    zzlf.D(e12);
                    e12.f(g1);
                    this.zzaz().zzg();
                    this.b();
                    Preconditions.checkNotNull(zzar0);
                    Preconditions.checkNotNull(zzq0);
                    Preconditions.checkNotEmpty(zzar0.a);
                    Preconditions.checkArgument(zzar0.a.equals(zzq0.zza));
                    zzgb zzgb0 = zzgc.zzt();
                    zzgb0.zzad(1);
                    zzgb0.zzZ("android");
                    if(!TextUtils.isEmpty(zzq0.zza)) {
                        zzgb0.zzD(zzq0.zza);
                    }
                    if(!TextUtils.isEmpty(zzq0.zzd)) {
                        zzgb0.zzF(zzq0.zzd);
                    }
                    if(!TextUtils.isEmpty(zzq0.zzc)) {
                        zzgb0.zzG(zzq0.zzc);
                    }
                    zzpi.zzc();
                    if(this.zzg().zzs(null, zzeh.zzay) && !TextUtils.isEmpty(zzq0.zzx)) {
                        zzgb0.zzah(zzq0.zzx);
                    }
                    long v16 = zzq0.zzj;
                    if(v16 != 0xFFFFFFFF80000000L) {
                        zzgb0.zzH(((int)v16));
                    }
                    zzgb0.zzV(zzq0.zze);
                    if(!TextUtils.isEmpty(zzq0.zzb)) {
                        zzgb0.zzU(zzq0.zzb);
                    }
                    zzgb0.zzL(this.F(((String)Preconditions.checkNotNull(zzq0.zza))).zzc(zzai.zzb(zzq0.zzv)).zzh());
                    if(zzgb0.zzaq().isEmpty() && !TextUtils.isEmpty(zzq0.zzq)) {
                        zzgb0.zzC(zzq0.zzq);
                    }
                    long v17 = zzq0.zzf;
                    if(v17 != 0L) {
                        zzgb0.zzM(v17);
                    }
                    zzgb0.zzP(zzq0.zzs);
                    zzlf.D(zzlh1);
                    zzge zzge2 = zzlh1.a;
                    Map map0 = zzeh.zzc(zzlh1.b.l.zzau());
                    if(map0 != null && !map0.isEmpty()) {
                        arrayList0 = new ArrayList();
                        int v18 = (int)(((Integer)zzeh.zzO.zza(null)));
                        for(Object object3: map0.entrySet()) {
                            Map.Entry map$Entry0 = (Map.Entry)object3;
                            if(((String)map$Entry0.getKey()).startsWith("measurement.id.")) {
                                try {
                                    int v19 = Integer.parseInt(((String)map$Entry0.getValue()));
                                    if(v19 == 0) {
                                        continue;
                                    }
                                    arrayList0.add(v19);
                                    if(arrayList0.size() < v18) {
                                        continue;
                                    }
                                    zzge2.zzay().zzk().zzb("Too many experiment IDs. Number of IDs", arrayList0.size());
                                    break;
                                }
                                catch(NumberFormatException numberFormatException0) {
                                    zzge2.zzay().zzk().zzb("Experiment ID NumberFormatException", numberFormatException0);
                                }
                            }
                        }
                        if(arrayList0.isEmpty()) {
                            arrayList0 = null;
                        }
                    }
                    else {
                        arrayList0 = null;
                    }
                    if(arrayList0 != null) {
                        zzgb0.zzh(arrayList0);
                    }
                    zzai zzai0 = this.F(((String)Preconditions.checkNotNull(zzq0.zza))).zzc(zzai.zzb(zzq0.zzv));
                    zzah zzah0 = zzah.zza;
                    if(zzai0.zzi(zzah0) && (!this.zzg().zzs(null, zzeh.zzaj) || zzq0.zzo)) {
                        zzka zzka0 = this.i;
                        zzka0.getClass();
                        Pair pair0 = zzai0.zzi(zzah0) ? zzka0.c(zzq0.zza) : new Pair("", Boolean.FALSE);
                        if(!TextUtils.isEmpty(((CharSequence)pair0.first)) && zzq0.zzo) {
                            zzgb0.zzae(((String)pair0.first));
                            Object object4 = pair0.second;
                            if(object4 != null) {
                                zzgb0.zzX(((Boolean)object4).booleanValue());
                            }
                        }
                    }
                    zzge0.zzg().c();
                    zzgb0.zzN(Build.MODEL);
                    zzge0.zzg().c();
                    zzgb0.zzY(Build.VERSION.RELEASE);
                    zzgb0.zzaj(((int)zzge0.zzg().zzb()));
                    zzgb0.zzan(zzge0.zzg().zzc());
                    if(zzge0.zzJ() && !TextUtils.isEmpty(null)) {
                        zzgb0.zzO(null);
                    }
                    e e13 = this.c;
                    zzlf.D(e13);
                    D d1 = e13.s(zzq0.zza);
                    if(d1 == null) {
                        d1 = new D(zzge0, zzq0.zza);
                        d1.c(this.G(zzai0));
                        d1.j(zzq0.zzk);
                        d1.k(zzq0.zzb);
                        if(zzai0.zzi(zzah0)) {
                            d1.r(this.i.d(zzq0.zza, zzq0.zzo));
                        }
                        d1.o(0L);
                        d1.p(0L);
                        d1.n(0L);
                        d1.e(zzq0.zzc);
                        d1.f(zzq0.zzj);
                        d1.d(zzq0.zzd);
                        d1.l(zzq0.zze);
                        d1.h(zzq0.zzf);
                        d1.q(zzq0.zzh);
                        d1.i(zzq0.zzs);
                        e e14 = this.c;
                        zzlf.D(e14);
                        e14.e(d1);
                    }
                    if(zzai0.zzi(zzah.zzb) && !TextUtils.isEmpty(d1.x())) {
                        zzgb0.zzE(((String)Preconditions.checkNotNull(d1.x())));
                    }
                    if(!TextUtils.isEmpty(d1.z())) {
                        zzgb0.zzT(((String)Preconditions.checkNotNull(d1.z())));
                    }
                    e e15 = this.c;
                    zzlf.D(e15);
                    List list0 = e15.A(zzq0.zza);
                    for(int v20 = 0; v20 < list0.size(); ++v20) {
                        zzgk zzgk0 = zzgl.zzd();
                        zzgk0.zzf(((g0)list0.get(v20)).c);
                        zzgk0.zzg(((g0)list0.get(v20)).d);
                        zzlf.D(zzlh1);
                        zzlh1.x(zzgk0, ((g0)list0.get(v20)).e);
                        zzgb0.zzl(zzgk0);
                    }
                    try {
                        e e16 = this.c;
                        zzlf.D(e16);
                        zzgc zzgc0 = (zzgc)zzgb0.zzaE();
                        e16.zzg();
                        e16.a();
                        Preconditions.checkNotNull(zzgc0);
                        Preconditions.checkNotEmpty("");
                        byte[] arr_b = zzgc0.zzbv();
                        zzlf.D(e16.b.g);
                        v21 = e16.b.g.m(arr_b);
                        ContentValues contentValues0 = new ContentValues();
                        contentValues0.put("app_id", "");
                        contentValues0.put("metadata_fingerprint", v21);
                        contentValues0.put("metadata", arr_b);
                        try {
                            e16.r().insertWithOnConflict("raw_events_metadata", null, contentValues0, 4);
                        }
                        catch(SQLiteException sQLiteException2) {
                            e16.a.zzay().zzd().zzc("Error storing raw event metadata. appId", zzeu.d(""), sQLiteException2);
                            throw sQLiteException2;
                        }
                    }
                    catch(IOException iOException0) {
                        this.zzay().zzd().zzc("Data loss. Failed to insert raw event metadata. appId", zzeu.d(zzgb0.zzap()), iOException0);
                        goto label_379;
                    }
                    e e17 = this.c;
                    zzlf.D(e17);
                    zzge zzge3 = e17.a;
                    Iterator iterator2 = zzar0.f.i.keySet().iterator();
                    while(true) {
                        if(iterator2.hasNext()) {
                            Object object5 = iterator2.next();
                            if("_r".equals(((String)object5))) {
                                v22 = 1;
                                break;
                            }
                            continue;
                        }
                        else {
                            zzlf.D(zzfv1);
                            boolean z4 = zzfv1.l(zzar0.a, zzar0.b);
                            e e18 = this.c;
                            zzlf.D(e18);
                            if(!z4 || e18.u(this.r(), zzar0.a, 1L, false, false, false, false, false).e >= ((long)this.zzg().zze(zzar0.a, zzeh.zzn))) {
                                v22 = 0;
                                break;
                            }
                        }
                        v22 = 1;
                        break;
                    }
                    e17.zzg();
                    e17.a();
                    Preconditions.checkNotNull(zzar0);
                    Preconditions.checkNotEmpty(zzar0.a);
                    zzlf.D(e17.b.g);
                    byte[] arr_b1 = e17.b.g.q(zzar0).zzbv();
                    ContentValues contentValues1 = new ContentValues();
                    contentValues1.put("app_id", zzar0.a);
                    contentValues1.put("name", zzar0.b);
                    contentValues1.put("timestamp", zzar0.d);
                    contentValues1.put("metadata_fingerprint", v21);
                    contentValues1.put("data", arr_b1);
                    contentValues1.put("realtime", v22);
                    try {
                        if(e17.r().insert("raw_events", null, contentValues1) == -1L) {
                            zzge3.zzay().zzd().zzb("Failed to insert raw event (got -1). appId", zzeu.d(zzar0.a));
                        }
                        else {
                            goto label_378;
                        }
                    }
                    catch(SQLiteException sQLiteException3) {
                        zzge3.zzay().zzd().zzc("Error storing raw event. appId", zzeu.d(zzar0.a), sQLiteException3);
                    }
                    goto label_379;
                label_378:
                    this.o = 0L;
                label_379:
                    e e19 = this.c;
                    zzlf.D(e19);
                    e19.d();
                    goto label_382;
                }
                goto label_388;
            }
            catch(Throwable throwable0) {
                goto label_426;
            }
        label_382:
            e e20 = this.c;
            zzlf.D(e20);
            e20.C();
            this.y();
            this.zzay().zzj().zzb("Background event processing time, ms", ((long)((System.nanoTime() - v + 500000L) / 1000000L)));
            return;
            try {
            label_388:
                zzes zzes0 = this.zzay().zzd();
                m m0 = zzeu.d(s);
                String s4 = zzge0.zzj().d(s3);
                zzag zzag1 = this.zzg();
                zzag1.getClass();
                zzes0.zzd("Too many event names used, ignoring event. appId, name, supported count", m0, s4, zzag1.zzf(s, zzeg0, 500, 2000));
                this.zzv().getClass();
                zzln.l(d01, s, 8, null, null, 0);
            }
            catch(Throwable throwable0) {
                goto label_426;
            }
            e e21 = this.c;
            zzlf.D(e21);
            e21.C();
            return;
            try {
            label_400:
                if(v12 % 1000L == 1L) {
                    this.zzay().zzd().zzc("Data loss. Too many public events logged. appId, count", zzeu.d(s), zzak0.a);
                }
                this.zzv().getClass();
                zzln.l(d01, s, 16, "_ev", zzaw1.zza, 0);
                e e22 = this.c;
                zzlf.D(e22);
                e22.d();
            }
            catch(Throwable throwable0) {
                goto label_426;
            }
            e e23 = this.c;
            zzlf.D(e23);
            e23.C();
            return;
            try {
            label_411:
                if(v10 % 1000L == 1L) {
                    this.zzay().zzd().zzc("Data loss. Too many events logged. appId, count", zzeu.d(s), zzak0.b);
                }
                e e24 = this.c;
                zzlf.D(e24);
                e24.d();
            }
            catch(Throwable throwable0) {
                goto label_426;
            }
            e e25 = this.c;
            zzlf.D(e25);
            e25.C();
            return;
            try {
            label_420:
                this.zzay().zzk().zzc("Data lost. Currency value is too big. appId", zzeu.d(s), f);
                e e26 = this.c;
                zzlf.D(e26);
                e26.d();
                goto label_430;
            }
            catch(Throwable throwable0) {
            }
        label_426:
            e e27 = this.c;
            zzlf.D(e27);
            e27.C();
            throw throwable0;
        label_430:
            e e28 = this.c;
            zzlf.D(e28);
            e28.C();
            return;
        }
        this.E(zzq0);
    }

    public final long r() {
        long v = this.zzav().currentTimeMillis();
        zzka zzka0 = this.i;
        zzka0.a();
        zzka0.zzg();
        long v1 = zzka0.zze.zza();
        if(v1 == 0L) {
            v1 = ((long)zzka0.a.zzv().g().nextInt(86400000)) + 1L;
            zzka0.zze.zzb(v1);
        }
        return (v + v1) / 1000L / 60L / 60L / 24L;
    }

    public static final void s(zzfr zzfr0, int v, String s) {
        List list0 = zzfr0.zzp();
        for(int v1 = 0; v1 < list0.size(); ++v1) {
        }
        com.google.android.gms.internal.measurement.zzfv zzfv0 = zzfw.zze();
        zzfv0.zzj("_err");
        zzfv0.zzi(((long)v));
        zzfw zzfw0 = (zzfw)zzfv0.zzaE();
        com.google.android.gms.internal.measurement.zzfv zzfv1 = zzfw.zze();
        zzfv1.zzj("_ev");
        zzfv1.zzk(s);
        zzfw zzfw1 = (zzfw)zzfv1.zzaE();
        zzfr0.zzf(zzfw0);
        zzfr0.zzf(zzfw1);
    }

    public static final void t(zzfr zzfr0, String s) {
        List list0 = zzfr0.zzp();
        for(int v = 0; v < list0.size(); ++v) {
            if(s.equals("")) {
                zzfr0.zzh(v);
                return;
            }
        }
    }

    public final zzq u(String s) {
        e e0 = this.c;
        zzlf.D(e0);
        D d0 = e0.s(s);
        if(d0 != null && !TextUtils.isEmpty(d0.y())) {
            Boolean boolean0 = this.v(d0);
            if(boolean0 != null && !boolean0.booleanValue()) {
                this.zzay().zzd().zzb("App version does not match; dropping. appId", zzeu.d(s));
                return null;
            }
            String s1 = d0.A();
            String s2 = d0.y();
            long v = d0.t();
            d0.a.zzaz().zzg();
            String s3 = d0.l;
            d0.a.zzaz().zzg();
            long v1 = d0.m;
            d0.a.zzaz().zzg();
            long v2 = d0.n;
            d0.a.zzaz().zzg();
            boolean z = d0.o;
            String s4 = d0.z();
            d0.a.zzaz().zzg();
            d0.a.zzaz().zzg();
            boolean z1 = d0.p;
            String s5 = d0.u();
            d0.a.zzaz().zzg();
            Boolean boolean1 = d0.r;
            d0.a.zzaz().zzg();
            long v3 = d0.s;
            d0.a.zzaz().zzg();
            return new zzq(s, s1, s2, v, s3, v1, v2, null, z, false, s4, 0L, 0, z1, false, s5, boolean1, v3, d0.t, this.F(s).zzh(), "", null);
        }
        this.zzay().zzc().zzb("No app data available; dropping", s);
        return null;
    }

    public final Boolean v(D d0) {
        try {
            long v = d0.t();
            zzge zzge0 = this.l;
            if(v != 0xFFFFFFFF80000000L) {
                int v1 = Wrappers.packageManager(zzge0.zzau()).getPackageInfo(d0.w(), 0).versionCode;
                return d0.t() == ((long)v1);
            }
            String s = Wrappers.packageManager(zzge0.zzau()).getPackageInfo(d0.w(), 0).versionName;
            String s1 = d0.y();
            return s1 == null || !s1.equals(s) ? false : true;
        }
        catch(PackageManager.NameNotFoundException unused_ex) {
            return null;
        }
    }

    public final void w() {
        this.zzaz().zzg();
        if(!this.s && !this.t && !this.u) {
            this.zzay().zzj().zza("Stopping uploading service(s)");
            ArrayList arrayList0 = this.p;
            if(arrayList0 == null) {
                return;
            }
            for(Object object0: arrayList0) {
                ((Runnable)object0).run();
            }
            ((List)Preconditions.checkNotNull(this.p)).clear();
            return;
        }
        this.zzay().zzj().zzd("Not stopping services. fetch, network, upload", Boolean.valueOf(this.s), Boolean.valueOf(this.t), Boolean.valueOf(this.u));
    }

    public final void x(zzgb zzgb0, long v, boolean z) {
        g0 g01;
        e e0 = this.c;
        zzlf.D(e0);
        g0 g00 = e0.w(zzgb0.zzap(), (z ? "_se" : "_lte"));
        if(g00 == null) {
            g01 = new g0(zzgb0.zzap(), "auto", (z ? "_se" : "_lte"), this.zzav().currentTimeMillis(), v);
        }
        else {
            Object object0 = g00.e;
            g01 = object0 == null ? new g0(zzgb0.zzap(), "auto", (z ? "_se" : "_lte"), this.zzav().currentTimeMillis(), v) : new g0(zzgb0.zzap(), "auto", (z ? "_se" : "_lte"), this.zzav().currentTimeMillis(), ((long)(((long)(((Long)object0))) + v)));
        }
        zzgk zzgk0 = zzgl.zzd();
        zzgk0.zzf((z ? "_se" : "_lte"));
        zzgk0.zzg(this.zzav().currentTimeMillis());
        Object object1 = g01.e;
        zzgk0.zze(((long)(((Long)object1))));
        zzgl zzgl0 = (zzgl)zzgk0.zzaE();
        int v1 = zzlh.l(zzgb0, (z ? "_se" : "_lte"));
        if(v1 >= 0) {
            zzgb0.zzam(v1, zzgl0);
        }
        else {
            zzgb0.zzm(zzgl0);
        }
        if(v > 0L) {
            e e1 = this.c;
            zzlf.D(e1);
            e1.j(g01);
            this.zzay().zzj().zzc("Updated engagement user property. scope, value", (z ? "session-scoped" : "lifetime"), object1);
        }
    }

    public final void y() {
        long v11;
        long v3;
        boolean z;
        this.zzaz().zzg();
        this.b();
        if(this.o > 0L) {
            long v = Math.abs(this.zzav().elapsedRealtime() - this.o);
            if(3600000L - v > 0L) {
                this.zzay().zzj().zzb("Upload has been suspended. Will update scheduling later in approximately ms", ((long)(3600000L - v)));
                this.zzm().a();
                zzkr zzkr0 = this.e;
                zzlf.D(zzkr0);
                zzkr0.zza();
                return;
            }
            this.o = 0L;
        }
        if(this.l.a() && this.A()) {
            long v1 = this.zzav().currentTimeMillis();
            this.zzg();
            long v2 = Math.max(0L, ((long)(((Long)zzeh.zzz.zza(null)))));
            e e0 = this.c;
            zzlf.D(e0);
            if(e0.m("select count(1) > 0 from raw_events where realtime = 1", null) == 0L) {
                e e1 = this.c;
                zzlf.D(e1);
                z = e1.m("select count(1) > 0 from queue where has_realtime = 1", null) == 0L ? false : true;
            }
            else {
                z = true;
            }
            if(z) {
                String s = this.zzg().zzl();
                if(TextUtils.isEmpty(s) || ".none.".equals(s)) {
                    this.zzg();
                    v3 = Math.max(0L, ((long)(((Long)zzeh.zzt.zza(null)))));
                }
                else {
                    this.zzg();
                    v3 = Math.max(0L, ((long)(((Long)zzeh.zzu.zza(null)))));
                }
            }
            else {
                this.zzg();
                v3 = Math.max(0L, ((long)(((Long)zzeh.zzs.zza(null)))));
            }
            long v4 = this.i.zzc.zza();
            long v5 = this.i.zzd.zza();
            e e2 = this.c;
            zzlf.D(e2);
            long v6 = e2.o("select max(bundle_end_timestamp) from queue", null, 0L);
            e e3 = this.c;
            zzlf.D(e3);
            long v7 = Math.max(v6, e3.o("select max(timestamp) from raw_events", null, 0L));
            zzlh zzlh0 = this.g;
            if(v7 == 0L) {
                v11 = 0L;
            }
            else {
                long v8 = v1 - Math.abs(v7 - v1);
                long v9 = v1 - Math.abs(v5 - v1);
                long v10 = Math.max(v1 - Math.abs(v4 - v1), v9);
                v11 = !z || v10 <= 0L ? v2 + v8 : Math.min(v8, v10) + v3;
                zzlf.D(zzlh0);
                if(!zzlh0.z(v10, v3)) {
                    v11 = v10 + v3;
                }
                if(v9 != 0L && v9 >= v8) {
                    int v12 = 0;
                    while(true) {
                        this.zzg();
                        if(v12 >= Math.min(20, Math.max(0, ((int)(((Integer)zzeh.zzB.zza(null))))))) {
                            break;
                        }
                        this.zzg();
                        v11 += Math.max(0L, ((long)(((Long)zzeh.zzA.zza(null))))) * (1L << v12);
                        if(v11 > v9) {
                            goto label_67;
                        }
                        ++v12;
                    }
                    v11 = 0L;
                }
            }
        label_67:
            if(v11 != 0L) {
                zzlf.D(this.b);
                if(this.b.zza()) {
                    long v13 = this.i.zzb.zza();
                    this.zzg();
                    long v14 = Math.max(0L, ((long)(((Long)zzeh.zzq.zza(null)))));
                    zzlf.D(zzlh0);
                    if(!zzlh0.z(v13, v14)) {
                        v11 = Math.max(v11, v13 + v14);
                    }
                    this.zzm().a();
                    long v15 = v11 - this.zzav().currentTimeMillis();
                    if(v15 <= 0L) {
                        this.zzg();
                        v15 = Math.max(0L, ((long)(((Long)zzeh.zzv.zza(null)))));
                        this.i.zzc.zzb(this.zzav().currentTimeMillis());
                    }
                    this.zzay().zzj().zzb("Upload scheduled in approximately ms", v15);
                    zzkr zzkr1 = this.e;
                    zzlf.D(zzkr1);
                    zzkr1.zzd(v15);
                    return;
                }
                this.zzay().zzj().zza("No network");
                q q0 = this.zzm();
                zzlf zzlf0 = q0.a;
                zzlf0.b();
                zzlf0.zzaz().zzg();
                if(!q0.b) {
                    zzlf0.zzau().registerReceiver(q0, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                    q0.c = zzlf0.zzl().zza();
                    zzlf0.zzay().zzj().zzb("Registering connectivity change receiver. Network connected", Boolean.valueOf(q0.c));
                    q0.b = true;
                }
                zzkr zzkr2 = this.e;
                zzlf.D(zzkr2);
                zzkr2.zza();
                return;
            }
            this.zzay().zzj().zza("Next upload time is 0");
            this.zzm().a();
            zzkr zzkr3 = this.e;
            zzlf.D(zzkr3);
            zzkr3.zza();
            return;
        }
        this.zzay().zzj().zza("Nothing to upload or uploading impossible");
        this.zzm().a();
        zzkr zzkr4 = this.e;
        zzlf.D(zzkr4);
        zzkr4.zza();
    }

    public final boolean z(long v) {
        byte[] arr_b1;
        long v30;
        long v29;
        D d1;
        Throwable throwable5;
        g g3;
        long v28;
        String s5;
        Long long3;
        Throwable throwable3;
        g g2;
        long v27;
        String s4;
        zzgb zzgb5;
        zzfr zzfr8;
        int v26;
        zzgb zzgb4;
        int v25;
        zzlh zzlh1;
        e0 e02;
        HashMap hashMap1;
        Long long1;
        zzfv zzfv4;
        g g0;
        int v24;
        long v23;
        long v22;
        String s3;
        zzge zzge2;
        SecureRandom secureRandom1;
        zzfr zzfr7;
        e0 e01;
        zzfv zzfv3;
        zzgb zzgb3;
        int v21;
        SecureRandom secureRandom0;
        ArrayList arrayList1;
        HashMap hashMap0;
        int v20;
        zzge zzge1;
        zzlf zzlf0;
        int v18;
        Iterator iterator0;
        long v17;
        zzgb zzgb2;
        int v15;
        int v14;
        int v13;
        int v12;
        zzgb zzgb1;
        zzfr zzfr4;
        int v8;
        int v7;
        zzfr zzfr3;
        zzlh zzlh0;
        zzfv zzfv0;
        zzge zzge0;
        int v5;
        int v4;
        zzfr zzfr1;
        int v3;
        zzfr zzfr0;
        int v2;
        int v1;
        zzgb zzgb0;
        e0 e00;
        e e0 = this.c;
        zzlf.D(e0);
        e0.zzw();
        try {
            e00 = new e0(this);
            e e1 = this.c;
            zzlf.D(e1);
            e1.k(v, this.z, e00);
            if(e00.c != null && !e00.c.isEmpty()) {
                zzgb0 = (zzgb)e00.a.zzby();
                zzgb0.zzr();
                v1 = 0;
                v2 = 0;
                zzfr0 = null;
                v3 = -1;
                zzfr1 = null;
                v4 = -1;
                v5 = 0;
                while(true) {
                label_17:
                    zzge0 = this.l;
                    zzfv0 = this.a;
                    zzlh0 = this.g;
                    if(v1 < e00.c.size()) {
                        goto label_21;
                    }
                    goto label_167;
                }
            }
            goto label_515;
        }
        catch(Throwable throwable0) {
            goto label_520;
        }
        try {
        label_21:
            zzfr zzfr2 = (zzfr)((zzfs)e00.c.get(v1)).zzby();
            zzlf.D(zzfv0);
            if(zzfv0.m("", zzfr2.zzo())) {
                this.zzay().zzk().zzc("Dropping blocked raw event. appId", zzeu.d(""), zzge0.zzj().d(zzfr2.zzo()));
                zzlf.D(zzfv0);
                if(!"1".equals(zzfv0.zza("", "measurement.upload.blacklist_internal"))) {
                    zzlf.D(zzfv0);
                    if(!"1".equals(zzfv0.zza("", "measurement.upload.blacklist_public")) && !"_err".equals(zzfr2.zzo())) {
                        zzln zzln0 = this.zzv();
                        String s1 = zzfr2.zzo();
                        zzln0.getClass();
                        zzln.l(this.E, "", 11, "_ev", s1, 0);
                    }
                }
                zzgb1 = zzgb0;
                v15 = v1;
            }
            else {
                if(zzfr2.zzo().equals("ad_impression")) {
                    zzfr2.zzi("_ai");
                    this.zzay().zzj().zza("Renaming ad_impression to _ai");
                    if(Log.isLoggable(this.zzay().zzq(), 5)) {
                        for(int v6 = 0; v6 < zzfr2.zza(); ++v6) {
                        }
                    }
                }
                zzlf.D(zzfv0);
                boolean z = zzfv0.l("", zzfr2.zzo());
                if(z) {
                    zzfr3 = zzfr0;
                    v7 = v4;
                }
                else {
                    zzlf.D(zzlh0);
                    String s = zzfr2.zzo();
                    Preconditions.checkNotEmpty(s);
                    zzfr3 = zzfr0;
                    v7 = v4;
                    switch(s) {
                        case "_in": {
                            v8 = 0;
                            break;
                        }
                        case "_ug": {
                            v8 = 2;
                            break;
                        }
                        case "_ui": {
                            v8 = 1;
                            break;
                        }
                        default: {
                            v8 = -1;
                        }
                    }
                    if(v8 != 0 && v8 != 1 && v8 != 2) {
                        zzfr4 = zzfr1;
                        z = false;
                        goto label_88;
                    }
                }
                int v9 = 0;
                while(true) {
                    zzfr4 = zzfr1;
                    if(v9 >= zzfr2.zza()) {
                        break;
                    }
                    ++v9;
                    zzfr1 = zzfr4;
                }
                if(z) {
                    this.zzay().zzj().zzb("Marking event as conversion", zzge0.zzj().d(zzfr2.zzo()));
                    com.google.android.gms.internal.measurement.zzfv zzfv1 = zzfw.zze();
                    zzfv1.zzj("_c");
                    zzfv1.zzi(1L);
                    zzfr2.zze(zzfv1);
                }
                this.zzay().zzj().zzb("Marking event as real-time", zzge0.zzj().d(zzfr2.zzo()));
                com.google.android.gms.internal.measurement.zzfv zzfv2 = zzfw.zze();
                zzfv2.zzj("_r");
                zzfv2.zzi(1L);
                zzfr2.zze(zzfv2);
                e e2 = this.c;
                zzlf.D(e2);
                if(e2.u(this.r(), "", 1L, false, false, false, false, true).e > ((long)this.zzg().zze("", zzeh.zzn))) {
                    zzlf.t(zzfr2, "_r");
                }
                else {
                    v5 = 1;
                }
                if(zzln.z(zzfr2.zzo()) && z) {
                    e e3 = this.c;
                    zzlf.D(e3);
                    if(e3.u(this.r(), "", 1L, false, false, true, false, false).c > ((long)this.zzg().zze("", zzeh.zzm))) {
                        this.zzay().zzk().zzb("Too many conversions. Not logging as conversion. appId", zzeu.d(""));
                        for(int v10 = 0; v10 < zzfr2.zza(); ++v10) {
                            zzfr2.zzn(v10);
                        }
                        this.zzay().zzd().zzb("Did not find conversion parameter. appId", zzeu.d(""));
                    }
                }
            label_88:
                if(z) {
                    ArrayList arrayList0 = new ArrayList(zzfr2.zzp());
                    for(int v11 = 0; v11 < arrayList0.size(); ++v11) {
                    }
                }
                if("_e".equals(zzfr2.zzo())) {
                    zzlf.D(zzlh0);
                    if(zzlh.c(((zzfs)zzfr2.zzaE()), "_fr") != null) {
                    }
                    else if(zzfr4 == null || Math.abs(zzfr4.zzc() - zzfr2.zzc()) > 1000L) {
                        zzgb1 = zzgb0;
                        zzfr0 = zzfr2;
                        v4 = v7;
                        v3 = v2;
                        goto label_147;
                    }
                    else {
                        zzfr zzfr5 = (zzfr)zzfr4.zzaB();
                        if(this.B(zzfr2, zzfr5)) {
                            zzgb1 = zzgb0;
                            v12 = v7;
                            zzgb1.zzS(v12, zzfr5);
                            zzfr0 = null;
                            zzfr1 = null;
                        }
                        else {
                            zzgb1 = zzgb0;
                            v12 = v7;
                            zzfr0 = zzfr2;
                            v3 = v2;
                            zzfr1 = zzfr4;
                        }
                        v4 = v12;
                        goto label_148;
                    }
                    zzgb1 = zzgb0;
                    v13 = v7;
                }
                else {
                    zzgb1 = zzgb0;
                    v13 = v7;
                    if("_vs".equals(zzfr2.zzo())) {
                        zzlf.D(zzlh0);
                        if(zzlh.c(((zzfs)zzfr2.zzaE()), "_et") == null) {
                            if(zzfr3 == null || Math.abs(zzfr3.zzc() - zzfr2.zzc()) > 1000L) {
                                zzfr1 = zzfr2;
                                v4 = v2;
                                zzfr0 = zzfr3;
                            }
                            else {
                                zzfr zzfr6 = (zzfr)zzfr3.zzaB();
                                if(this.B(zzfr6, zzfr2)) {
                                    v14 = v3;
                                    zzgb1.zzS(v14, zzfr6);
                                    v4 = v13;
                                    zzfr0 = null;
                                    zzfr1 = null;
                                }
                                else {
                                    v14 = v3;
                                    zzfr1 = zzfr2;
                                    v4 = v2;
                                    zzfr0 = zzfr3;
                                }
                                v3 = v14;
                            }
                            goto label_148;
                        }
                    }
                }
                v4 = v13;
                zzfr0 = zzfr3;
            label_147:
                zzfr1 = zzfr4;
            label_148:
                v15 = v1;
                e00.c.set(v15, ((zzfs)zzfr2.zzaE()));
                ++v2;
                zzgb1.zzk(zzfr2);
            }
            zzgb0 = zzgb1;
            v1 = v15 + 1;
            goto label_17;
        label_167:
            zzgb2 = zzgb0;
            v17 = 0L;
            for(int v16 = 0; v16 < v2; ++v16) {
                zzfs zzfs0 = zzgb2.zze(v16);
                zzlf.D(zzlh0);
                zzfw zzfw0 = zzlh.c(zzfs0, "_et");
                if(zzfw0 != null) {
                    Long long0 = zzfw0.zzw() ? zzfw0.zzd() : null;
                    if(long0 != null && ((long)long0) > 0L) {
                        v17 += (long)long0;
                    }
                }
            }
        }
        catch(Throwable throwable1) {
            throwable5 = throwable1;
            goto label_521;
        }
        try {
            this.x(zzgb2, v17, false);
            iterator0 = zzgb2.zzas().iterator();
            while(true) {
            label_182:
                if(!iterator0.hasNext()) {
                    if(zzlh.l(zzgb2, "_sid") < 0) {
                        v18 = zzlh.l(zzgb2, "_se");
                        if(v18 >= 0) {
                            break;
                        }
                    }
                    else {
                        goto label_189;
                    }
                    goto label_190;
                }
                goto label_510;
            }
        }
        catch(Throwable throwable0) {
            goto label_520;
        }
        try {
            zzgb2.zzB(v18);
            this.zzay().zzd().zzb("Session engagement user property is in the bundle without session ID. appId", zzeu.d(""));
            goto label_190;
        label_189:
            this.x(zzgb2, v17, true);
        }
        catch(Throwable throwable1) {
            throwable5 = throwable1;
            goto label_521;
        }
        try {
        label_190:
            zzlf.D(zzlh0);
            zzlf0 = zzlh0.b;
            zzge1 = zzlh0.a;
            zzge1.zzay().zzj().zza("Checking account type status for ad personalization signals");
            zzlf.D(zzlf0.a);
            String s2 = zzgb2.zzap();
            if(zzlf0.a.k(s2)) {
                goto label_197;
            }
            goto label_214;
        }
        catch(Throwable throwable0) {
            goto label_520;
        }
        try {
        label_197:
            e e4 = zzlf0.c;
            zzlf.D(e4);
            D d0 = e4.s(zzgb2.zzap());
            if(d0 != null) {
                d0.a.zzaz().zzg();
                if(d0.p && zzge1.zzg().e()) {
                    zzge1.zzay().zzc().zza("Turning off ad personalization due to account type");
                    zzgk zzgk0 = zzgl.zzd();
                    zzgk0.zzf("_npa");
                    zzgk0.zzg(zzge1.zzg().d());
                    zzgk0.zze(1L);
                    zzgl zzgl0 = (zzgl)zzgk0.zzaE();
                    for(int v19 = 0; v19 < zzgb2.zzb(); ++v19) {
                    }
                    zzgb2.zzm(zzgl0);
                }
            }
        }
        catch(Throwable throwable1) {
            throwable5 = throwable1;
            goto label_521;
        }
        try {
        label_214:
            zzgb2.zzai(0x7FFFFFFFFFFFFFFFL);
            zzgb2.zzQ(0x8000000000000000L);
            v20 = 0;
        alab1:
            while(true) {
            label_217:
                if(v20 >= zzgb2.zza()) {
                    zzgb2.zzz();
                    zzgb2.zzo();
                    b b0 = this.f;
                    zzlf.D(b0);
                    zzgb2.zzf(b0.c(zzgb2.zzap(), zzgb2.zzas(), zzgb2.zzat(), zzgb2.zzd(), zzgb2.zzc()));
                    if(this.zzg().zzw("")) {
                        hashMap0 = new HashMap();
                        arrayList1 = new ArrayList();
                        secureRandom0 = this.zzv().g();
                        v21 = 0;
                        while(true) {
                        label_228:
                            if(v21 >= zzgb2.zza()) {
                                zzgb3 = zzgb2;
                                zzfv3 = zzfv0;
                                if(arrayList1.size() < zzgb3.zza()) {
                                    zzgb3.zzr();
                                    zzgb3.zzg(arrayList1);
                                }
                                for(Object object0: hashMap0.entrySet()) {
                                    e e5 = this.c;
                                    zzlf.D(e5);
                                    e5.f(((g)((Map.Entry)object0).getValue()));
                                }
                                e01 = e00;
                                break;
                            }
                            zzfr7 = (zzfr)zzgb2.zze(v21).zzby();
                            if(zzfr7.zzo().equals("_ep")) {
                                goto label_352;
                            }
                            else {
                                secureRandom1 = secureRandom0;
                                zzge2 = zzge0;
                                zzlf.D(zzfv0);
                                s3 = zzfv0.zza("", "measurement.account.time_zone_offset_minutes");
                                if(TextUtils.isEmpty(s3)) {
                                    goto label_254;
                                }
                                else {
                                    break alab1;
                                }
                                goto label_255;
                            }
                            goto label_375;
                        }
                    }
                    else {
                        goto label_390;
                    }
                    goto label_393;
                }
                goto label_503;
            }
        }
        catch(Throwable throwable0) {
            goto label_520;
        }
        try {
            try {
                v22 = Long.parseLong(s3);
                goto label_255;
            }
            catch(NumberFormatException numberFormatException0) {
                zzfv0.a.zzay().zzk().zzc("Unable to parse timezone offset. appId", zzeu.d(""), numberFormatException0);
            }
        }
        catch(Throwable throwable1) {
            throwable5 = throwable1;
            goto label_521;
        }
    label_254:
        v22 = 0L;
        try {
        label_255:
            v23 = this.zzv().zzr(zzfr7.zzc(), v22);
            zzfs zzfs1 = (zzfs)zzfr7.zzaE();
            if(!TextUtils.isEmpty("_dbg")) {
                goto label_258;
            }
            goto label_263;
        }
        catch(Throwable throwable0) {
            goto label_520;
        }
        try {
        label_258:
            for(Object object1: zzfs1.zzi()) {
                zzfw zzfw1 = (zzfw)object1;
            }
        }
        catch(Throwable throwable1) {
            throwable5 = throwable1;
            goto label_521;
        }
        try {
        label_263:
            zzlf.D(zzfv0);
            v24 = zzfv0.h("", zzfr7.zzo());
            if(v24 > 0) {
                g0 = (g)hashMap0.get(zzfr7.zzo());
                if(g0 == null) {
                    goto label_268;
                }
                goto label_277;
            }
            else {
                goto label_348;
            }
            goto label_352;
        }
        catch(Throwable throwable0) {
            goto label_520;
        }
        try {
        label_268:
            e e6 = this.c;
            zzlf.D(e6);
            g g1 = e6.v("", zzfr7.zzo());
            if(g1 == null) {
                zzfv4 = zzfv0;
                this.zzay().zzk().zzc("Event being bundled has no eventAggregate. appId, eventName", "", zzfr7.zzo());
                g0 = new g("", zzfr7.zzo(), 1L, 1L, 1L, zzfr7.zzc(), 0L, null, null, null, null);
                goto label_278;
            }
            else {
                g0 = g1;
            }
        }
        catch(Throwable throwable1) {
            throwable5 = throwable1;
            goto label_521;
        }
    label_277:
        zzfv4 = zzfv0;
        try {
        label_278:
            zzlf.D(zzlh0);
            long1 = (Long)zzlh.d(((zzfs)zzfr7.zzaE()), "_eid");
            if(long1 == null) {
                goto label_283;
            }
            else {
                goto label_281;
            }
            goto label_284;
        }
        catch(Throwable throwable0) {
            goto label_520;
        }
    label_281:
        boolean z1 = true;
        goto label_284;
    label_283:
        z1 = false;
    label_284:
        if(v24 == 1) {
            try {
                arrayList1.add(((zzfs)zzfr7.zzaE()));
                if(z1 && (g0.i != null || g0.j != null || g0.k != null)) {
                    hashMap0.put(zzfr7.zzo(), g0.a(null, null, null));
                }
                zzgb2.zzS(v21, zzfr7);
                hashMap1 = hashMap0;
                e02 = e00;
                zzlh1 = zzlh0;
                v25 = v21;
                zzgb4 = zzgb2;
                goto label_381;
            }
            catch(Throwable throwable1) {
                throwable5 = throwable1;
                goto label_521;
            }
        }
        else {
            try {
                if(secureRandom1.nextInt(v24) == 0) {
                    goto label_323;
                }
                else {
                    hashMap1 = hashMap0;
                    zzlh1 = zzlh0;
                    v26 = v21;
                    zzfr8 = zzfr7;
                    zzgb5 = zzgb2;
                    e02 = e00;
                    if((g0.h == null ? this.zzv().zzr(zzfr8.zzb(), v22) : ((long)g0.h)) != v23) {
                        zzlf.D(zzlh1);
                        zzlh.C(zzfr8, "_efs", 1L);
                        zzlf.D(zzlh1);
                        Long long2 = (long)v24;
                        zzlh.C(zzfr8, "_sr", long2);
                        arrayList1.add(((zzfs)zzfr8.zzaE()));
                        if(z1) {
                            g0 = g0.a(null, long2, Boolean.TRUE);
                        }
                        s4 = zzfr8.zzo();
                        v27 = zzfr8.zzc();
                        g2 = new g(g0.a, g0.b, g0.c, g0.d, g0.e, g0.f, v27, v23, g0.i, g0.j, g0.k);
                        goto label_321;
                    }
                    else if(z1) {
                        hashMap1.put(zzfr8.zzo(), g0.a(long1, null, null));
                    }
                }
                goto label_344;
            }
            catch(Throwable throwable0) {
                goto label_520;
            }
            try {
                g2 = new g(g0.a, g0.b, g0.c, g0.d, g0.e, g0.f, v27, v23, g0.i, g0.j, g0.k);
                goto label_321;
            }
            catch(Throwable throwable2) {
                try {
                    throwable3 = throwable2;
                    throwable5 = throwable3;
                    goto label_521;
                label_321:
                    hashMap1.put(s4, g2);
                    goto label_344;
                label_323:
                    zzlf.D(zzlh0);
                    long3 = (long)v24;
                    zzlh.C(zzfr7, "_sr", long3);
                    arrayList1.add(((zzfs)zzfr7.zzaE()));
                    if(z1) {
                        goto label_328;
                    }
                    goto label_329;
                }
                catch(Throwable throwable0) {
                    goto label_520;
                }
            }
            try {
            label_328:
                g0 = g0.a(null, long3, null);
            }
            catch(Throwable throwable1) {
                throwable5 = throwable1;
                goto label_521;
            }
            try {
            label_329:
                s5 = zzfr7.zzo();
                v28 = zzfr7.zzc();
            }
            catch(Throwable throwable0) {
                goto label_520;
            }
            try {
                e02 = e00;
                zzlh1 = zzlh0;
                v26 = v21;
                zzfr8 = zzfr7;
                zzgb5 = zzgb2;
                g3 = new g(g0.a, g0.b, g0.c, g0.d, g0.e, g0.f, v28, v23, g0.i, g0.j, g0.k);
                hashMap1 = hashMap0;
                goto label_343;
            }
            catch(Throwable throwable4) {
                try {
                    throwable3 = throwable4;
                    throwable5 = throwable3;
                    goto label_521;
                label_343:
                    hashMap1.put(s5, g3);
                label_344:
                    v25 = v26;
                    zzgb4 = zzgb5;
                    zzgb4.zzS(v25, zzfr8);
                    goto label_381;
                }
                catch(Throwable throwable0) {
                    goto label_520;
                }
            }
        }
        try {
        label_348:
            this.zzay().zzk().zzc("Sample rate must be positive. event, rate", zzfr7.zzo(), v24);
            arrayList1.add(((zzfs)zzfr7.zzaE()));
            zzgb2.zzS(v21, zzfr7);
            goto label_375;
        label_352:
            zzlf.D(zzlh0);
            String s6 = (String)zzlh.d(((zzfs)zzfr7.zzaE()), "_en");
            g g4 = (g)hashMap0.get(s6);
            if(g4 == null) {
                e e7 = this.c;
                zzlf.D(e7);
                zzge2 = zzge0;
                secureRandom1 = secureRandom0;
                g4 = e7.v("", ((String)Preconditions.checkNotNull(s6)));
                if(g4 != null) {
                    hashMap0.put(s6, g4);
                }
            }
            else {
                secureRandom1 = secureRandom0;
                zzge2 = zzge0;
            }
            if(g4 != null && g4.i == null) {
                if(g4.j != null && ((long)g4.j) > 1L) {
                    zzlf.D(zzlh0);
                    zzlh.C(zzfr7, "_sr", g4.j);
                }
                if(g4.k != null && g4.k.booleanValue()) {
                    zzlf.D(zzlh0);
                    zzlh.C(zzfr7, "_efs", 1L);
                }
                arrayList1.add(((zzfs)zzfr7.zzaE()));
            }
            zzgb2.zzS(v21, zzfr7);
        }
        catch(Throwable throwable1) {
            throwable5 = throwable1;
            goto label_521;
        }
    label_375:
        hashMap1 = hashMap0;
        e02 = e00;
        zzlh1 = zzlh0;
        v25 = v21;
        zzgb4 = zzgb2;
        zzfv4 = zzfv0;
        try {
        label_381:
            v21 = v25 + 1;
            hashMap0 = hashMap1;
            zzgb2 = zzgb4;
            zzge0 = zzge2;
            e00 = e02;
            secureRandom0 = secureRandom1;
            zzfv0 = zzfv4;
            zzlh0 = zzlh1;
            goto label_228;
        label_390:
            zzgb3 = zzgb2;
            zzfv3 = zzfv0;
            e01 = e00;
        label_393:
            e e8 = this.c;
            zzlf.D(e8);
            d1 = e8.s("");
            if(d1 == null) {
                this.zzay().zzd().zzb("Bundling raw events w/o app info. appId", zzeu.d(""));
            }
            else if(zzgb3.zza() > 0) {
                goto label_400;
            }
            goto label_431;
        }
        catch(Throwable throwable0) {
            goto label_520;
        }
        try {
        label_400:
            d1.a.zzaz().zzg();
            v29 = d1.i;
            if(v29 == 0L) {
                goto label_405;
            }
            else {
                goto label_403;
            }
            goto label_406;
        }
        catch(Throwable throwable6) {
            throwable5 = throwable6;
            goto label_521;
        }
        try {
        label_403:
            zzgb3.zzab(v29);
            goto label_406;
        label_405:
            zzgb3.zzv();
        }
        catch(Throwable throwable0) {
            goto label_520;
        }
        try {
        label_406:
            d1.a.zzaz().zzg();
            v30 = d1.h;
            if(v30 != 0L) {
                goto label_409;
            }
            goto label_410;
        }
        catch(Throwable throwable6) {
            throwable5 = throwable6;
            goto label_521;
        }
    label_409:
        v29 = v30;
        try {
        label_410:
            if(v29 == 0L) {
                zzgb3.zzw();
            }
            else {
                zzgb3.zzac(v29);
            }
            d1.a();
        }
        catch(Throwable throwable0) {
            goto label_520;
        }
        try {
            d1.a.zzaz().zzg();
            goto label_420;
        }
        catch(Throwable throwable6) {
            try {
                throwable5 = throwable6;
                goto label_521;
            label_420:
                zzgb3.zzI(((int)d1.g));
                d1.p(zzgb3.zzd());
                d1.n(zzgb3.zzc());
                String s7 = d1.v();
                if(s7 == null) {
                    zzgb3.zzs();
                }
                else {
                    zzgb3.zzW(s7);
                }
                e e9 = this.c;
                zzlf.D(e9);
                e9.e(d1);
            label_431:
                if(zzgb3.zza() > 0) {
                    zzlf.D(zzfv3);
                    zzfe zzfe0 = zzfv3.i("");
                    if(zzfe0 == null || !zzfe0.zzs()) {
                        zzgb3.zzK(-1L);
                    }
                    else {
                        zzgb3.zzK(zzfe0.zzc());
                    }
                    e e10 = this.c;
                    zzlf.D(e10);
                    zzge zzge3 = e10.a;
                    zzgc zzgc0 = (zzgc)zzgb3.zzaE();
                    e10.zzg();
                    e10.a();
                    Preconditions.checkNotNull(zzgc0);
                    Preconditions.checkNotEmpty("");
                    Preconditions.checkState(zzgc0.zzbe());
                    e10.zzz();
                    long v31 = zzge3.zzav().currentTimeMillis();
                    if(zzgc0.zzk() < v31 - zzag.zzA() || zzgc0.zzk() > zzag.zzA() + v31) {
                        zzge3.zzay().zzk().zzd("Storing bundle outside of the max uploading time span. appId, now, timestamp", zzeu.d(""), v31, zzgc0.zzk());
                    }
                    byte[] arr_b = zzgc0.zzbv();
                    try {
                        zzlf.D(e10.b.g);
                        arr_b1 = e10.b.g.B(arr_b);
                    }
                    catch(IOException iOException0) {
                        zzge3.zzay().zzd().zzc("Data loss. Failed to serialize bundle. appId", zzeu.d(""), iOException0);
                        goto label_471;
                    }
                    zzge3.zzay().zzj().zzb("Saving bundle, size", ((int)arr_b1.length));
                    ContentValues contentValues0 = new ContentValues();
                    contentValues0.put("app_id", "");
                    contentValues0.put("bundle_end_timestamp", zzgc0.zzk());
                    contentValues0.put("data", arr_b1);
                    contentValues0.put("has_realtime", v5);
                    if(zzgc0.zzbk()) {
                        contentValues0.put("retry_count", zzgc0.zze());
                    }
                    try {
                        if(e10.r().insert("queue", null, contentValues0) == -1L) {
                            zzge3.zzay().zzd().zzb("Failed to insert bundle (got -1). appId", zzeu.d(""));
                        }
                    }
                    catch(SQLiteException sQLiteException0) {
                        zzge3.zzay().zzd().zzc("Error storing bundle. appId", zzeu.d(""), sQLiteException0);
                    }
                }
            label_471:
                e e11 = this.c;
                zzlf.D(e11);
                ArrayList arrayList2 = e01.b;
                Preconditions.checkNotNull(arrayList2);
                e11.zzg();
                e11.a();
                StringBuilder stringBuilder0 = new StringBuilder("rowid in (");
                for(int v32 = 0; v32 < arrayList2.size(); ++v32) {
                    if(v32 != 0) {
                        stringBuilder0.append(",");
                    }
                    stringBuilder0.append(((long)(((Long)arrayList2.get(v32)))));
                }
                stringBuilder0.append(")");
                int v33 = e11.r().delete("raw_events", stringBuilder0.toString(), null);
                if(v33 != arrayList2.size()) {
                    e11.a.zzay().zzd().zzc("Deleted fewer rows from raw events table than expected", v33, arrayList2.size());
                }
                e e12 = this.c;
                zzlf.D(e12);
                SQLiteDatabase sQLiteDatabase0 = e12.r();
                try {
                    sQLiteDatabase0.execSQL("delete from raw_events_metadata where app_id=? and metadata_fingerprint not in (select distinct metadata_fingerprint from raw_events where app_id=?)", new String[]{"", ""});
                }
                catch(SQLiteException sQLiteException1) {
                    e12.a.zzay().zzd().zzc("Failed to remove unused event metadata. appId", zzeu.d(""), sQLiteException1);
                }
                e e13 = this.c;
                zzlf.D(e13);
                e13.d();
            }
            catch(Throwable throwable0) {
                goto label_520;
            }
        }
        e e14 = this.c;
        zzlf.D(e14);
        e14.C();
        return true;
        try {
        label_503:
            zzfs zzfs2 = zzgb2.zze(v20);
            if(zzfs2.zzd() < zzgb2.zzd()) {
                zzgb2.zzai(zzfs2.zzd());
            }
            if(zzfs2.zzd() > zzgb2.zzc()) {
                zzgb2.zzQ(zzfs2.zzd());
            }
            ++v20;
            goto label_217;
        label_510:
            iterator0.next();
            goto label_182;
        }
        catch(Throwable throwable1) {
            throwable5 = throwable1;
            goto label_521;
        }
        try {
        label_515:
            e e15 = this.c;
            zzlf.D(e15);
            e15.d();
            goto label_525;
        }
        catch(Throwable throwable0) {
        label_520:
            throwable5 = throwable0;
        }
    label_521:
        e e16 = this.c;
        zzlf.D(e16);
        e16.C();
        throw throwable5;
    label_525:
        e e17 = this.c;
        zzlf.D(e17);
        e17.C();
        return false;
    }

    public final void zzR(String s, zziq zziq0) {
        this.zzaz().zzg();
        if(this.D != null && !this.D.equals(s) && zziq0 == null) {
            return;
        }
        this.D = s;
        this.C = zziq0;
    }

    @Override  // i1.C
    public final Context zzau() {
        return this.l.zzau();
    }

    @Override  // i1.C
    public final Clock zzav() {
        return ((zzge)Preconditions.checkNotNull(this.l)).zzav();
    }

    @Override  // i1.C
    public final zzab zzaw() {
        throw null;
    }

    @Override  // i1.C
    public final zzeu zzay() {
        return ((zzge)Preconditions.checkNotNull(this.l)).zzay();
    }

    @Override  // i1.C
    public final com.google.android.gms.measurement.internal.zzgb zzaz() {
        return ((zzge)Preconditions.checkNotNull(this.l)).zzaz();
    }

    public final b zzf() {
        b b0 = this.f;
        zzlf.D(b0);
        return b0;
    }

    public final zzag zzg() {
        return ((zzge)Preconditions.checkNotNull(this.l)).zzf();
    }

    public final e zzi() {
        e e0 = this.c;
        zzlf.D(e0);
        return e0;
    }

    public final zzep zzj() {
        return this.l.zzj();
    }

    public final zzfa zzl() {
        zzlf.D(this.b);
        return this.b;
    }

    public final q zzm() {
        q q0 = this.d;
        if(q0 == null) {
            throw new IllegalStateException("Network broadcast receiver not created");
        }
        return q0;
    }

    public final zzfv zzo() {
        zzlf.D(this.a);
        return this.a;
    }

    public final N zzr() {
        N n0 = this.h;
        zzlf.D(n0);
        return n0;
    }

    public final zzka zzs() {
        return this.i;
    }

    public static zzlf zzt(Context context0) {
        Preconditions.checkNotNull(context0);
        Preconditions.checkNotNull(context0.getApplicationContext());
        if(zzlf.F == null) {
            synchronized(zzlf.class) {
                if(zzlf.F == null) {
                    zzlf.F = new zzlf(((zzlg)Preconditions.checkNotNull(new zzlg(context0))));
                }
            }
        }
        return zzlf.F;
    }

    public final zzlh zzu() {
        zzlf.D(this.g);
        return this.g;
    }

    public final zzln zzv() {
        return ((zzge)Preconditions.checkNotNull(this.l)).zzv();
    }
}

