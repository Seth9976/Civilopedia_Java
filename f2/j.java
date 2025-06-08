package f2;

import N1.a;
import N1.b;
import android.app.Application;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Resources;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build.VERSION;
import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.internal.ads.zb;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.crashlytics.CrashlyticsRegistrar;
import com.google.firebase.encoders.EncodingException;
import f0.g;
import i1.y;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import jeb.synthetic.TWR;
import l.L0;
import m0.A;
import o1.f;
import o2.C;
import p0.m;
import q0.i;
import s1.d;
import s1.n;
import s1.p;
import w0.j;
import w0.k;
import x0.c;
import x0.e;
import x0.h;
import x1.l;
import x1.q;
import x1.r;
import x1.s;

public final class J implements a, Continuation, d, y0.a {
    public final int i;
    public final Object j;

    public J(Object object0, int v) {
        this.i = v;
        this.j = object0;
        super();
    }

    @Override  // y0.a
    public Object a() {
        Object object0 = this.j;
        switch(this.i) {
            case 6: {
                ((h)(((c)object0))).getClass();
                g g0 = new g(22);
                g0.j = null;
                g0.k = new ArrayList();
                g0.l = null;
                g0.m = "";
                HashMap hashMap0 = new HashMap();
                SQLiteDatabase sQLiteDatabase1 = ((h)(((c)object0))).a();
                sQLiteDatabase1.beginTransaction();
                try {
                    t0.a a1 = (t0.a)h.i(sQLiteDatabase1.rawQuery("SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new String[0]), new v0.a(((h)(((c)object0))), hashMap0, g0, 3));
                    sQLiteDatabase1.setTransactionSuccessful();
                    return a1;
                }
                finally {
                    sQLiteDatabase1.endTransaction();
                }
            }
            case 7: {
                Integer integer0 = (Integer)((h)(((x0.d)object0))).c(new e(((h)(((x0.d)object0))), ((h)(((x0.d)object0))).j.d() - ((h)(((x0.d)object0))).l.d));
                integer0.getClass();
                return integer0;
            }
            case 8: {
                SQLiteDatabase sQLiteDatabase2 = ((h)((j)object0).i).a();
                sQLiteDatabase2.beginTransaction();
                try {
                    sQLiteDatabase2.compileStatement("DELETE FROM log_event_dropped").execute();
                    sQLiteDatabase2.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + ((h)((j)object0).i).j.d()).execute();
                    sQLiteDatabase2.setTransactionSuccessful();
                    return null;
                }
                finally {
                    sQLiteDatabase2.endTransaction();
                }
            }
            default: {
                SQLiteDatabase sQLiteDatabase0 = ((h)((k)object0).b).a();
                sQLiteDatabase0.beginTransaction();
                try {
                    Cursor cursor0 = sQLiteDatabase0.rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]);
                    try {
                        ArrayList arrayList0 = new ArrayList();
                        while(cursor0.moveToNext()) {
                            B1.a a0 = i.a();
                            a0.E(cursor0.getString(1));
                            a0.l = A0.a.b(cursor0.getInt(2));
                            String s = cursor0.getString(3);
                            a0.k = s == null ? null : Base64.decode(s, 0);
                            arrayList0.add(a0.e());
                        }
                    }
                    catch(Throwable throwable0) {
                        cursor0.close();
                        throw throwable0;
                    }
                    cursor0.close();
                    sQLiteDatabase0.setTransactionSuccessful();
                }
                finally {
                    sQLiteDatabase0.endTransaction();
                }
                for(Object object1: arrayList0) {
                    ((k)object0).c.a(((i)object1), 1, false);
                }
                return null;
            }
        }
    }

    @Override  // N1.a
    public void b(b b0) {
        u1.b b1 = (u1.b)this.j;
        b1.getClass();
        if(Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Crashlytics native component now available.", null);
        }
        u1.b b2 = (u1.b)b0.get();
        b1.b.set(b2);
    }

    @Override  // s1.d
    public Object c(p p0) {
        Boolean boolean0;
        Task task1;
        ExecutorService executorService3;
        boolean z1;
        ExecutorService executorService2;
        Task task0;
        String s12;
        String s11;
        String s10;
        String s4;
        String s3;
        String s2;
        if(this.i != 3) {
            ((CrashlyticsRegistrar)this.j).getClass();
            f f0 = (f)p0.a(f.class);
            n n0 = p0.e(u1.b.class);
            n n1 = p0.e(q1.a.class);
            O1.d d0 = (O1.d)p0.a(O1.d.class);
            f0.a();
            Context context0 = f0.a;
            u1.c c0 = u1.c.a;
            if(c0.a(4)) {
                Log.i("FirebaseCrashlytics", "Initializing Firebase Crashlytics 18.2.12 for com.spears.civilopedia", null);
            }
            C1.d d1 = new C1.d();  // 初始化器: Ljava/lang/Object;-><init>()V
            File file0 = context0.getFilesDir();
            d1.i = file0;
            File file1 = new File(file0, (Build.VERSION.SDK_INT < 28 ? ".com.google.firebase.crashlytics.files.v1" : ".com.google.firebase.crashlytics.files.v2;" + Application.getProcessName().replaceAll("[^a-zA-Z0-9.]", "_")));
            C1.d.C(file1);
            d1.j = file1;
            File file2 = new File(file1, "open-sessions");
            C1.d.C(file2);
            d1.k = file2;
            File file3 = new File(file1, "reports");
            C1.d.C(file3);
            d1.l = file3;
            File file4 = new File(file1, "priority-reports");
            C1.d.C(file4);
            d1.m = file4;
            File file5 = new File(file1, "native-reports");
            C1.d.C(file5);
            d1.n = file5;
            A a0 = new A(f0);
            q q0 = new q(context0, "com.spears.civilopedia", d0, a0);
            u1.b b0 = new u1.b(n0);
            m0.a a1 = new m0.a(n1);
            ExecutorService executorService0 = x1.e.a("Crashlytics Exception Handler");
            l l0 = new l(f0, q0, b0, a0, new t1.a(a1), new t1.a(a1), d1, executorService0);
            f0.a();
            String s = f0.c.b;
            int v = x1.e.e(context0, "com.google.firebase.crashlytics.mapping_file_id", "string");
            if(v == 0) {
                v = x1.e.e(context0, "com.crashlytics.android.build_id", "string");
            }
            String s1 = v == 0 ? null : context0.getResources().getString(v);
            c0.b("Mapping file ID is: " + s1);
            g1.n n2 = new g1.n(context0, 28);
            try {
                s2 = q0.d();
                PackageInfo packageInfo0 = context0.getPackageManager().getPackageInfo("com.spears.civilopedia", 0);
                s3 = Integer.toString(packageInfo0.versionCode);
                s4 = packageInfo0.versionName == null ? "0.0" : packageInfo0.versionName;
                new L0(s, s1, s2, "com.spears.civilopedia", s3, s4, n2, 7);
            }
            catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException0) {
                Log.e("FirebaseCrashlytics", "Error retrieving app package info.", packageManager$NameNotFoundException0);
                return null;
            }
            c0.c("Installer package name is: " + s2);
            ExecutorService executorService1 = x1.e.a("com.google.firebase.crashlytics.startup");
            new J3.d(1);
            String s5 = q0.d();
            M1.f f1 = new M1.f(20);
            D3.b b1 = new D3.b(f1, 1);
            T1.c c1 = new T1.c(d1);
            String s6 = i3.e.f("https://firebase-settings.crashlytics.com/spi/v2/platforms/android/gmp/", s, "/settings");
            E1.a a2 = new E1.a();  // 初始化器: Ljava/lang/Object;-><init>()V
            if(s6 == null) {
                throw new IllegalArgumentException("url must not be null.");
            }
            a2.i = s6;
            String s7 = A.f.i(Build.MANUFACTURER.replaceAll("\\Q/\\E", ""), "/", Build.MODEL.replaceAll("\\Q/\\E", ""));
            String s8 = Build.VERSION.INCREMENTAL.replaceAll("\\Q/\\E", "");
            String s9 = Build.VERSION.RELEASE.replaceAll("\\Q/\\E", "");
            int v1 = x1.e.e(context0, "com.google.firebase.crashlytics.mapping_file_id", "string");
            if(v1 == 0) {
                v1 = x1.e.e(context0, "com.crashlytics.android.build_id", "string");
            }
            if(v1 == 0) {
                s11 = s3;
                s12 = s4;
                s10 = null;
            }
            else {
                s10 = context0.getResources().getString(v1);
                s11 = s3;
                s12 = s4;
            }
            String[] arr_s = {s10, s, s12, s11};
            ArrayList arrayList0 = new ArrayList();
            for(int v2 = 0; v2 < 4; ++v2) {
                String s13 = arr_s[v2];
                if(s13 != null) {
                    arrayList0.add(s13.replace("-", "").toLowerCase(Locale.US));
                }
            }
            Collections.sort(arrayList0);
            StringBuilder stringBuilder0 = new StringBuilder();
            for(Object object0: arrayList0) {
                stringBuilder0.append(((String)object0));
            }
            String s14 = stringBuilder0.toString();
            E1.f f2 = new E1.f(s, s7, s8, s9, q0, (s14.length() <= 0 ? null : x1.e.j(s14)), s12, s11, i3.e.a((s5 == null ? 1 : 4)));
            E1.d d2 = new E1.d();  // 初始化器: Ljava/lang/Object;-><init>()V
            AtomicReference atomicReference0 = new AtomicReference();
            d2.p = atomicReference0;
            d2.q = new AtomicReference(new TaskCompletionSource());
            d2.i = context0;
            d2.j = f2;
            d2.l = f1;
            d2.k = b1;
            d2.m = c1;
            d2.n = a2;
            d2.o = a0;
            atomicReference0.set(M1.f.b(f1));
            boolean z = ((Context)d2.i).getSharedPreferences("com.google.firebase.crashlytics", 0).getString("existing_instance_identifier", "").equals(((E1.f)d2.j).f);
            AtomicReference atomicReference1 = (AtomicReference)d2.q;
            AtomicReference atomicReference2 = (AtomicReference)d2.p;
            if(z) {
                E1.c c2 = d2.e(1);
                if(c2 != null) {
                    atomicReference2.set(c2);
                    ((TaskCompletionSource)atomicReference1.get()).trySetResult(c2);
                    task0 = Tasks.forResult(null);
                    executorService2 = executorService1;
                    goto label_134;
                }
                goto label_118;
            }
            else {
            label_118:
                E1.c c3 = d2.e(3);
                if(c3 != null) {
                    atomicReference2.set(c3);
                    ((TaskCompletionSource)atomicReference1.get()).trySetResult(c3);
                }
                A a3 = (A)d2.o;
                synchronized(a3.c) {
                }
                TaskCompletionSource taskCompletionSource0 = new TaskCompletionSource();
                r r0 = new r(0, taskCompletionSource0);
                executorService2 = executorService1;
                ((TaskCompletionSource)a3.f).getTask().continueWith(executorService2, r0);
                ((TaskCompletionSource)a3.d).getTask().continueWith(executorService2, r0);
                task0 = taskCompletionSource0.getTask().onSuccessTask(executorService2, new T1.c(d2, 3));
            }
        label_134:
            task0.continueWith(executorService2, new M1.f(18));
            g g0 = l0.m;
            C1.d d3 = l0.i;
            Context context1 = l0.a;
            if(context1 == null) {
                z1 = true;
            }
            else {
                Resources resources0 = context1.getResources();
                if(resources0 == null) {
                    z1 = true;
                }
                else {
                    int v4 = x1.e.e(context1, "com.crashlytics.RequireBuildId", "bool");
                    if(v4 > 0) {
                        z1 = resources0.getBoolean(v4);
                    }
                    else {
                        int v5 = x1.e.e(context1, "com.crashlytics.RequireBuildId", "string");
                        z1 = v5 > 0 ? Boolean.parseBoolean(context1.getString(v5)) : true;
                    }
                }
            }
            boolean z4 = false;
            if(!z1) {
                z4 = true;
                if(!Log.isLoggable("FirebaseCrashlytics", 2)) {
                    goto label_159;
                }
                Log.v("FirebaseCrashlytics", "Configured not to require a build ID.", null);
            }
            else if(!TextUtils.isEmpty(((String)0.k))) {
                z4 = true;
            }
            if(z4) {
            label_159:
                new x1.c(l0.h);
                String s15 = x1.c.b;
                try {
                    l0.f = new w3.k(5, "crash_marker", d3);
                    l0.e = new w3.k(5, "initialization_marker", d3);
                    q0.p p1 = new q0.p();
                    y1.c c4 = new y1.c(d3);
                    B.c c5 = new B.c(new F1.a[]{new M1.f(3)});
                    executorService3 = executorService2;
                    B.f f3 = B.f.g(l0.a, l0.h, l0.i, null, c4, p1, c5, d2, l0.c);
                    executorService3 = executorService2;
                    l0.g = new x1.i(l0.a, l0.m, l0.h, l0.b, l0.i, l0.f, null, c4, f3, l0.n, l0.k);
                    w3.k k0 = l0.e;
                    C1.d d4 = (C1.d)k0.k;
                    d4.getClass();
                    boolean z2 = new File(((File)d4.j), ((String)k0.j)).exists();
                    task1 = g0.q(new x1.k(l0, 1));
                }
                catch(Exception exception0) {
                    goto label_194;
                }
                try {
                    boolean0 = (Boolean)s.a(task1);
                }
                catch(Exception unused_ex) {
                    goto label_177;
                }
                try {
                    Boolean.TRUE.equals(boolean0);
                label_177:
                    x1.i i0 = l0.g;
                    Thread.UncaughtExceptionHandler thread$UncaughtExceptionHandler0 = Thread.getDefaultUncaughtExceptionHandler();
                    i0.getClass();
                    y y0 = new y(4, i0, s15);
                    i0.d.q(y0);
                    x1.n n3 = new x1.n(new k.d(i0, 15), d2, thread$UncaughtExceptionHandler0, i0.i);
                    i0.l = n3;
                    Thread.setDefaultUncaughtExceptionHandler(n3);
                    if(!z2) {
                        goto label_198;
                    }
                    else if(context1.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0) {
                        NetworkInfo networkInfo0 = ((ConnectivityManager)context1.getSystemService("connectivity")).getActiveNetworkInfo();
                        if(networkInfo0 == null || !networkInfo0.isConnectedOrConnecting()) {
                            goto label_198;
                        }
                        else {
                            goto label_189;
                        }
                    }
                    else {
                    label_189:
                        if(Log.isLoggable("FirebaseCrashlytics", 3)) {
                            Log.d("FirebaseCrashlytics", "Crashlytics did not finish previous background initialization. Initializing synchronously.", null);
                        }
                        l0.b(d2);
                        goto label_196;
                    }
                    goto label_201;
                }
                catch(Exception exception0) {
                label_194:
                    Log.e("FirebaseCrashlytics", "Crashlytics was not started due to an exception during initialization", exception0);
                    l0.g = null;
                }
            label_196:
                boolean z3 = false;
                goto label_201;
            label_198:
                if(Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "Successfully configured exception handler.", null);
                }
                z3 = true;
            label_201:
                Tasks.call(executorService3, new t1.b(z3, l0, d2));
                return new t1.c(0);
            }
            Log.e("FirebaseCrashlytics", ".");
            Log.e("FirebaseCrashlytics", ".     |  | ");
            Log.e("FirebaseCrashlytics", ".     |  |");
            Log.e("FirebaseCrashlytics", ".     |  |");
            Log.e("FirebaseCrashlytics", ".   \\ |  | /");
            Log.e("FirebaseCrashlytics", ".    \\    /");
            Log.e("FirebaseCrashlytics", ".     \\  /");
            Log.e("FirebaseCrashlytics", ".      \\/");
            Log.e("FirebaseCrashlytics", ".");
            Log.e("FirebaseCrashlytics", "The Crashlytics build ID is missing. This occurs when Crashlytics tooling is absent from your app\'s build configuration. Please review Crashlytics onboarding instructions and ensure you have a valid Crashlytics account.");
            Log.e("FirebaseCrashlytics", ".");
            Log.e("FirebaseCrashlytics", ".      /\\");
            Log.e("FirebaseCrashlytics", ".     /  \\");
            Log.e("FirebaseCrashlytics", ".    /    \\");
            Log.e("FirebaseCrashlytics", ".   / |  | \\");
            Log.e("FirebaseCrashlytics", ".     |  |");
            Log.e("FirebaseCrashlytics", ".     |  |");
            Log.e("FirebaseCrashlytics", ".     |  |");
            Log.e("FirebaseCrashlytics", ".");
            throw new IllegalStateException("The Crashlytics build ID is missing. This occurs when Crashlytics tooling is absent from your app\'s build configuration. Please review Crashlytics onboarding instructions and ensure you have a valid Crashlytics account.");
        }
        return this.j;
    }

    public zb d(B1.a a0) {
        zb zb0;
        o0.b b0 = (o0.b)this.j;
        boolean z = Log.isLoggable("TRuntime.CctTransportBackend", 4);
        URL uRL0 = (URL)a0.k;
        if(z) {
            Log.i("TRuntime.CctTransportBackend", String.format("Making request to: %s", uRL0));
        }
        HttpURLConnection httpURLConnection0 = (HttpURLConnection)uRL0.openConnection();
        httpURLConnection0.setConnectTimeout(30000);
        httpURLConnection0.setReadTimeout(b0.g);
        httpURLConnection0.setDoOutput(true);
        httpURLConnection0.setInstanceFollowRedirects(false);
        httpURLConnection0.setRequestMethod("POST");
        httpURLConnection0.setRequestProperty("User-Agent", "datatransport/3.1.8 android/");
        httpURLConnection0.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection0.setRequestProperty("Content-Type", "application/json");
        httpURLConnection0.setRequestProperty("Accept-Encoding", "gzip");
        String s = (String)a0.j;
        if(s != null) {
            httpURLConnection0.setRequestProperty("X-Goog-Api-Key", s);
        }
        try(OutputStream outputStream0 = httpURLConnection0.getOutputStream(); GZIPOutputStream gZIPOutputStream0 = new GZIPOutputStream(outputStream0)) {
            p0.i i0 = (p0.i)a0.l;
            J1.e e0 = new J1.e(new BufferedWriter(new OutputStreamWriter(gZIPOutputStream0)), ((J1.d)b0.a.j).a, ((J1.d)b0.a.j).b, ((J1.d)b0.a.j).c, ((J1.d)b0.a.j).d);
            e0.g(i0);
            e0.i();
            e0.b.flush();
        }
        catch(ConnectException | UnknownHostException connectException0) {
            C.i("CctTransportBackend", "Couldn\'t open connection, returning with 500", connectException0);
            return new zb(500, null, 0L);
        }
        catch(EncodingException | IOException encodingException0) {
            C.i("CctTransportBackend", "Couldn\'t encode request, returning with 400", encodingException0);
            return new zb(400, null, 0L);
        }
        int v = httpURLConnection0.getResponseCode();
        Integer integer0 = v;
        if(Log.isLoggable("TRuntime.CctTransportBackend", 4)) {
            Log.i("TRuntime.CctTransportBackend", String.format("Status Code: %d", integer0));
        }
        C.f("CctTransportBackend", "Content-Type: %s", httpURLConnection0.getHeaderField("Content-Type"));
        C.f("CctTransportBackend", "Content-Encoding: %s", httpURLConnection0.getHeaderField("Content-Encoding"));
        switch(v) {
            case 200: {
                InputStream inputStream0 = httpURLConnection0.getInputStream();
                try {
                    InputStream inputStream1 = "gzip".equals(httpURLConnection0.getHeaderField("Content-Encoding")) ? new GZIPInputStream(inputStream0) : inputStream0;
                    try {
                        zb0 = new zb(200, null, m.a(new BufferedReader(new InputStreamReader(inputStream1))).a);
                    }
                    catch(Throwable throwable1) {
                        TWR.safeClose$NT(inputStream1, throwable1);
                        throw throwable1;
                    }
                    if(inputStream1 != null) {
                        inputStream1.close();
                    }
                }
                catch(Throwable throwable0) {
                    TWR.safeClose$NT(inputStream0, throwable0);
                    throw throwable0;
                }
                if(inputStream0 != null) {
                    inputStream0.close();
                }
                return zb0;
            }
            case 301: 
            case 302: 
            case 307: {
                return new zb(v, new URL(httpURLConnection0.getHeaderField("Location")), 0L);
            }
            default: {
                return new zb(v, null, 0L);
            }
        }
    }

    public void e(m0.e e0, ArrayList arrayList0) {
        q2.e e1 = (q2.e)this.j;
        J2.j.f(e0, "billingResult");
        if(e0.a == 0) {
            e1.c = arrayList0;
            return;
        }
        Log.e("BillingRepository", e0.b);
    }

    @Override  // com.google.android.gms.tasks.Continuation
    public Object then(Task task0) {
        if(this.i != 10) {
            ((CountDownLatch)this.j).countDown();
            return null;
        }
        ((B.f)this.j).getClass();
        if(task0.isSuccessful()) {
            x1.a a0 = (x1.a)task0.getResult();
            u1.c c0 = u1.c.a;
            c0.b("Crashlytics report successfully enqueued to DataTransport: " + a0.b);
            File file0 = a0.c;
            if(file0.delete()) {
                c0.b("Deleted report file: " + file0.getPath());
                return true;
            }
            c0.d("Crashlytics could not delete report file: " + file0.getPath(), null);
            return true;
        }
        Log.w("FirebaseCrashlytics", "Crashlytics report could not be enqueued to DataTransport", task0.getException());
        return false;
    }
}

