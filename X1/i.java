package x1;

import B.f;
import C1.d;
import E.l;
import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import android.util.JsonReader;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import f0.g;
import i3.e;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NavigableSet;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;
import l.L0;
import m0.A;
import q0.p;
import t1.a;
import u1.b;
import w3.k;
import y1.c;
import z1.B;
import z1.C;
import z1.F;
import z1.G;
import z1.H;
import z1.K;
import z1.Q;
import z1.S;
import z1.T;
import z1.U;
import z1.V;
import z1.r0;
import z1.v;
import z1.w;

public final class i {
    public final Context a;
    public final A b;
    public final k c;
    public final g d;
    public final q e;
    public final d f;
    public final L0 g;
    public final c h;
    public final b i;
    public final a j;
    public final f k;
    public n l;
    public final TaskCompletionSource m;
    public final TaskCompletionSource n;
    public final TaskCompletionSource o;
    public static final C1.b p;

    static {
        i.p = new C1.b(2);
    }

    public i(Context context0, g g0, q q0, A a0, d d0, k k0, L0 l00, c c0, f f0, b b0, a a1) {
        this.m = new TaskCompletionSource();
        this.n = new TaskCompletionSource();
        this.o = new TaskCompletionSource();
        new AtomicBoolean(false);
        this.a = context0;
        this.d = g0;
        this.e = q0;
        this.b = a0;
        this.f = d0;
        this.c = k0;
        this.g = l00;
        this.h = c0;
        this.i = b0;
        this.j = a1;
        this.k = f0;
    }

    public static void a(i i0, String s) {
        String s17;
        i0.getClass();
        long v = System.currentTimeMillis();
        if(Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Opening a new session with ID " + s, null);
        }
        Locale locale0 = Locale.US;
        String s1 = (String)i0.g.n;
        String s2 = i0.e.c();
        int v1 = ((String)i0.g.l) == null ? 1 : 4;
        g1.n n0 = (g1.n)i0.g.p;
        T t0 = new T(i0.e.c, s1, ((String)i0.g.o), s2, e.a(v1), n0);
        String s3 = Build.VERSION.RELEASE;
        String s4 = Build.VERSION.CODENAME;
        V v2 = new V(s3, s4, x1.e.i());
        StatFs statFs0 = new StatFs(Environment.getDataDirectory().getPath());
        long v3 = ((long)statFs0.getBlockCount()) * ((long)statFs0.getBlockSize());
        String s5 = Build.CPU_ABI;
        boolean z = TextUtils.isEmpty(s5);
        x1.d d0 = x1.d.i;
        if(!z) {
            x1.d d1 = (x1.d)x1.d.j.get(s5.toLowerCase(locale0));
            if(d1 != null) {
                d0 = d1;
            }
        }
        else if(Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "Architecture#getValue()::Build.CPU_ABI returned null or empty", null);
        }
        String s6 = Build.MODEL;
        long v4 = x1.e.f();
        boolean z1 = x1.e.h();
        int v5 = x1.e.d();
        String s7 = Build.MANUFACTURER;
        String s8 = Build.PRODUCT;
        S s9 = new S(t0, v2, new U(d0.ordinal(), s6, Runtime.getRuntime().availableProcessors(), v4, v3, z1, v5, s7, s8));
        i0.i.d(s, v / 1000L, s9);
        c c0 = i0.h;
        ((y1.a)c0.b).a();
        c0.b = c.c;
        if(s != null) {
            c0.b = new y1.i(((d)c0.a).v(s, "userlog"));
        }
        f f0 = i0.k;
        m m0 = (m)f0.j;
        n2.A a0 = new n2.A();  // 初始化器: Ljava/lang/Object;-><init>()V
        a0.a = "18.2.12";
        L0 l00 = m0.c;
        String s10 = (String)l00.j;
        if(s10 == null) {
            throw new NullPointerException("Null gmpAppId");
        }
        a0.b = s10;
        q q0 = m0.b;
        String s11 = q0.c();
        if(s11 == null) {
            throw new NullPointerException("Null installationUuid");
        }
        a0.d = s11;
        String s12 = (String)l00.n;
        if(s12 == null) {
            throw new NullPointerException("Null buildVersion");
        }
        a0.e = s12;
        String s13 = (String)l00.o;
        if(s13 == null) {
            throw new NullPointerException("Null displayVersion");
        }
        a0.f = s13;
        a0.c = 4;
        z1.A a1 = new z1.A();  // 初始化器: Ljava/lang/Object;-><init>()V
        a1.e = Boolean.FALSE;
        a1.c = (long)(v / 1000L);
        if(s == null) {
            throw new NullPointerException("Null identifier");
        }
        a1.b = s;
        a1.a = "Crashlytics Android SDK/18.2.12";
        String s14 = q0.c;
        if(s14 == null) {
            throw new NullPointerException("Null identifier");
        }
        String s15 = q0.c();
        g1.n n1 = (g1.n)l00.p;
        if(((g1.n)n1.k) == null) {
            n1.k = new g1.n(n1);
        }
        g1.n n2 = (g1.n)n1.k;
        String s16 = (String)n2.j;
        if(n2 == null) {
            n1.k = new g1.n(n1);
        }
        a1.f = new C(s14, s12, s13, s15, s16, ((String)((g1.n)n1.k).k));
        g g0 = new g(26);
        g0.j = 3;
        g0.k = s3;
        g0.l = s4;
        g0.m = Boolean.valueOf(x1.e.i());
        a1.h = g0.a();
        StatFs statFs1 = new StatFs(Environment.getDataDirectory().getPath());
        int v6 = 7;
        if(!TextUtils.isEmpty(s5)) {
            Integer integer0 = (Integer)m.e.get(s5.toLowerCase(locale0));
            if(integer0 != null) {
                v6 = (int)integer0;
            }
        }
        long v7 = x1.e.f();
        long v8 = ((long)statFs1.getBlockCount()) * ((long)statFs1.getBlockSize());
        boolean z2 = x1.e.h();
        int v9 = x1.e.d();
        E1.d d2 = new E1.d();  // 初始化器: Ljava/lang/Object;-><init>()V
        d2.i = v6;
        d2.j = s6;
        d2.k = Runtime.getRuntime().availableProcessors();
        d2.l = v7;
        d2.m = v8;
        d2.n = Boolean.valueOf(z2);
        d2.o = v9;
        d2.p = s7;
        d2.q = s8;
        a1.i = d2.a();
        a1.k = 3;
        a0.g = a1.a();
        v v10 = a0.b();
        d d3 = ((C1.c)f0.k).b;
        B b0 = v10.h;
        if(b0 != null) {
            goto label_110;
        }
        if(Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Could not get session for report", null);
            return;
            try {
            label_110:
                s17 = b0.b;
                C1.c.f.getClass();
                String s18 = A1.b.a.O(v10);
                C1.c.f(d3.v(s17, "report"), s18);
                File file0 = d3.v(s17, "start-time");
                try(OutputStreamWriter outputStreamWriter0 = new OutputStreamWriter(new FileOutputStream(file0), C1.c.d)) {
                    outputStreamWriter0.write("");
                    file0.setLastModified(b0.c * 1000L);
                }
            }
            catch(IOException iOException0) {
                if(Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "Could not persist report for session " + s17, iOException0);
                }
            }
        }
    }

    public static Task b(i i0) {
        Task task0;
        i0.getClass();
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: d.E(((File)i0.f.j).listFiles(i.p))) {
            File file0 = (File)object0;
            try {
                long v = Long.parseLong(file0.getName().substring(3));
                try {
                    Class.forName("com.google.firebase.crash.FirebaseCrash");
                }
                catch(ClassNotFoundException unused_ex) {
                    if(Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", "Logging app exception event to Firebase Analytics", null);
                    }
                    task0 = Tasks.call(new ScheduledThreadPoolExecutor(1), new h(i0, v));
                    goto label_15;
                }
                Log.w("FirebaseCrashlytics", "Skipping logging Crashlytics event to Firebase, FirebaseCrash exists", null);
                task0 = Tasks.forResult(null);
            label_15:
                arrayList0.add(task0);
            }
            catch(NumberFormatException unused_ex) {
                Log.w("FirebaseCrashlytics", "Could not parse app exception timestamp from file " + file0.getName(), null);
            }
            file0.delete();
        }
        return Tasks.whenAll(arrayList0);
    }

    public final void c(boolean z, E1.d d0) {
        Throwable throwable2;
        F f3;
        JsonReader jsonReader0;
        A1.b b2;
        String s2;
        ApplicationExitInfo applicationExitInfo0;
        f f0 = this.k;
        ArrayList arrayList0 = new ArrayList(((C1.c)f0.k).c());
        if(arrayList0.size() <= z) {
            if(Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "No open sessions to be closed.", null);
            }
            return;
        }
        Object object0 = arrayList0.get(((int)z));
        E1.b b0 = ((E1.c)((AtomicReference)d0.p).get()).b;
        C1.c c0 = (C1.c)f0.k;
        if(b0.b) {
            int v = Build.VERSION.SDK_INT;
            if(v >= 30) {
                List list0 = l.l(((ActivityManager)this.a.getSystemService("activity")));
                if(list0.size() == 0) {
                    String s5 = A.f.h("No ApplicationExitInfo available. Session: ", ((String)object0));
                    if(Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", s5, null);
                    }
                }
                else {
                    d d1 = this.f;
                    c c1 = new c(d1);
                    c1.b = c.c;
                    if(((String)object0) != null) {
                        c1.b = new y1.i(d1.v(((String)object0), "userlog"));
                    }
                    y1.d d2 = new y1.d(d1);
                    p p0 = new p();
                    ((y1.b)((AtomicMarkableReference)((k.d)p0.j).j).getReference()).a(d2.b(((String)object0), false));
                    ((y1.b)((AtomicMarkableReference)((k.d)p0.k).j).getReference()).a(d2.b(((String)object0), true));
                    String s = d2.c(((String)object0));
                    ((AtomicMarkableReference)p0.l).set(s, false);
                    long v1 = c0.b.v(((String)object0), "start-time").lastModified();
                    for(Object object1: list0) {
                        applicationExitInfo0 = (ApplicationExitInfo)object1;
                        if(applicationExitInfo0.getTimestamp() < v1) {
                            break;
                        }
                        if(applicationExitInfo0.getReason() != 6) {
                            continue;
                        }
                        goto label_34;
                    }
                    applicationExitInfo0 = null;
                label_34:
                    if(applicationExitInfo0 == null) {
                        String s1 = A.f.h("No relevant ApplicationExitInfo occurred during session: ", ((String)object0));
                        if(Log.isLoggable("FirebaseCrashlytics", 2)) {
                            Log.v("FirebaseCrashlytics", s1, null);
                        }
                    }
                    else {
                        try {
                            InputStream inputStream0 = applicationExitInfo0.getTraceInputStream();
                            if(inputStream0 == null) {
                                goto label_53;
                            }
                            else {
                                ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
                                byte[] arr_b = new byte[0x2000];
                                int v2;
                                while((v2 = inputStream0.read(arr_b)) != -1) {
                                    byteArrayOutputStream0.write(arr_b, 0, v2);
                                }
                                s2 = byteArrayOutputStream0.toString("UTF-8");
                            }
                        }
                        catch(IOException iOException0) {
                            Log.w("FirebaseCrashlytics", "Could not get input trace in application exit info: " + applicationExitInfo0.toString() + " Error: " + iOException0, null);
                            s2 = null;
                        }
                        goto label_54;
                    label_53:
                        s2 = null;
                    label_54:
                        n2.A a0 = new n2.A();  // 初始化器: Ljava/lang/Object;-><init>()V
                        a0.d = applicationExitInfo0.getImportance();
                        String s3 = applicationExitInfo0.getProcessName();
                        if(s3 == null) {
                            throw new NullPointerException("Null processName");
                        }
                        a0.a = s3;
                        a0.c = applicationExitInfo0.getReason();
                        a0.g = applicationExitInfo0.getTimestamp();
                        a0.b = applicationExitInfo0.getPid();
                        a0.e = applicationExitInfo0.getPss();
                        a0.f = applicationExitInfo0.getRss();
                        a0.h = s2;
                        w w0 = a0.c();
                        m m0 = (m)f0.j;
                        int v3 = m0.a.getResources().getConfiguration().orientation;
                        f f1 = new f(12);
                        f1.j = "anr";
                        f1.k = w0.g;
                        f1.l = new G(new H(null, null, w0, new K("0", "0", 0L), m0.a()), null, null, Boolean.valueOf(w0.d != 100), v3);
                        f1.m = m0.b(v3);
                        F f2 = f1.c();
                        String s4 = A.f.h("Persisting anr for session ", ((String)object0));
                        if(Log.isLoggable("FirebaseCrashlytics", 3)) {
                            Log.d("FirebaseCrashlytics", s4, null);
                        }
                        c0.d(f.a(f2, c1, p0), ((String)object0), true);
                    }
                }
            }
            else if(Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "ANR feature enabled, but device is API " + v, null);
            }
        }
        else if(Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "ANR feature disabled.", null);
        }
        b b1 = this.i;
        if(b1.c(((String)object0))) {
            String s6 = A.f.h("Finalizing native report for session ", ((String)object0));
            if(Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", s6, null);
            }
            b1.a(((String)object0)).getClass();
            Log.w("FirebaseCrashlytics", "No minidump data found for session " + ((String)object0), null);
        }
        String s7 = z ? ((String)arrayList0.get(0)) : null;
        long v4 = System.currentTimeMillis();
        d d3 = c0.b;
        d3.getClass();
        File file0 = (File)d3.i;
        d.q(new File(file0, ".com.google.firebase.crashlytics"));
        d.q(new File(file0, ".com.google.firebase.crashlytics-ndk"));
        if(Build.VERSION.SDK_INT >= 28) {
            d.q(new File(file0, ".com.google.firebase.crashlytics.files.v1"));
        }
        NavigableSet navigableSet0 = c0.c();
        if(s7 != null) {
            navigableSet0.remove(s7);
        }
        File file1 = (File)d3.k;
        if(navigableSet0.size() > 8) {
            while(navigableSet0.size() > 8) {
                String s8 = (String)navigableSet0.last();
                String s9 = "Removing session over cap: " + s8;
                if(Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", s9, null);
                }
                d.D(new File(file1, s8));
                navigableSet0.remove(s8);
            }
        }
        for(Object object2: navigableSet0) {
            String s10 = (String)object2;
            String s11 = "Finalizing report for session " + s10;
            if(Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", s11, null);
            }
            File file2 = new File(file1, s10);
            file2.mkdirs();
            List list1 = d.E(file2.listFiles(C1.c.h));
            if(list1.isEmpty()) {
                String s12 = e.f("Session ", s10, " has no events.");
                if(Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", s12, null);
                }
            }
            else {
                Collections.sort(list1);
                ArrayList arrayList1 = new ArrayList();
                Iterator iterator2 = list1.iterator();
                boolean z1 = false;
                while(true) {
                    boolean z2 = iterator2.hasNext();
                    b2 = C1.c.f;
                    if(!z2) {
                        break;
                    }
                    Object object3 = iterator2.next();
                    File file3 = (File)object3;
                    try {
                        String s13 = C1.c.e(file3);
                        b2.getClass();
                        try {
                            jsonReader0 = new JsonReader(new StringReader(s13));
                        }
                        catch(IllegalStateException illegalStateException0) {
                            throw new IOException(illegalStateException0);
                        }
                    }
                    catch(IOException iOException1) {
                        Log.w("FirebaseCrashlytics", "Could not add event to report for " + file3, iOException1);
                        continue;
                    }
                    try {
                        f3 = A1.b.d(jsonReader0);
                        goto label_154;
                    }
                    catch(Throwable throwable0) {
                        try {
                            throwable2 = throwable0;
                            jsonReader0.close();
                            throw throwable2;
                        }
                        catch(Throwable throwable1) {
                            try {
                                try {
                                    throwable2.addSuppressed(throwable1);
                                    throw throwable2;
                                label_154:
                                    jsonReader0.close();
                                }
                                catch(IllegalStateException illegalStateException0) {
                                    throw new IOException(illegalStateException0);
                                }
                                arrayList1.add(f3);
                                if(!z1) {
                                    String s14 = file3.getName();
                                    if(s14.startsWith("event")) {
                                        goto label_166;
                                    }
                                    else {
                                        goto label_169;
                                    }
                                }
                                goto label_171;
                            }
                            catch(IOException iOException1) {
                            }
                        }
                    }
                    Log.w("FirebaseCrashlytics", "Could not add event to report for " + file3, iOException1);
                    continue;
                label_166:
                    if(s14.endsWith("_")) {
                    label_171:
                        z1 = true;
                    }
                    else {
                        z1 = false;
                        continue;
                    label_169:
                        z1 = false;
                    }
                }
                if(arrayList1.isEmpty()) {
                    Log.w("FirebaseCrashlytics", "Could not parse event files for session " + s10, null);
                }
                else {
                    String s15 = new y1.d(d3).c(s10);
                    File file4 = d3.v(s10, "report");
                    try {
                        String s16 = C1.c.e(file4);
                        b2.getClass();
                        v v5 = A1.b.g(s16);
                        n2.A a1 = v5.a();
                        B b3 = v5.h;
                        if(b3 != null) {
                            z1.A a2 = b3.a();
                            a2.d = (long)(v4 / 1000L);
                            a2.e = Boolean.valueOf(z1);
                            if(s15 != null) {
                                a2.g = new Q(s15);
                            }
                            a1.g = a2.a();
                        }
                        v v6 = a1.b();
                        r0 r00 = new r0(arrayList1);
                        B b4 = v6.h;
                        if(b4 == null) {
                            throw new IllegalStateException("Reports without sessions cannot have events added to them.");
                        }
                        n2.A a3 = v6.a();
                        z1.A a4 = b4.a();
                        a4.j = r00;
                        a3.g = a4.a();
                        v v7 = a3.b();
                        B b5 = v7.h;
                        if(b5 != null) {
                            C1.c.f((z1 ? new File(((File)d3.m), b5.b) : new File(((File)d3.l), b5.b)), A1.b.a.O(v7));
                        }
                        goto label_206;
                    }
                    catch(IOException iOException2) {
                    }
                    Log.w("FirebaseCrashlytics", "Could not synthesize final report file for " + file4, iOException2);
                }
            }
        label_206:
            d.D(new File(file1, s10));
        }
        E1.c c2 = (E1.c)((AtomicReference)c0.c.p).get();
        ArrayList arrayList2 = c0.b();
        int v8 = arrayList2.size();
        if(v8 > 4) {
            for(Object object4: arrayList2.subList(4, v8)) {
                ((File)object4).delete();
            }
        }
    }

    public final boolean d(E1.d d0) {
        Object object0 = ((ThreadLocal)this.d.m).get();
        if(!Boolean.TRUE.equals(object0)) {
            throw new IllegalStateException("Not running on background worker thread as intended.");
        }
        if(this.l != null && this.l.e.get()) {
            Log.w("FirebaseCrashlytics", "Skipping session finalization because a crash has already occurred.", null);
            return false;
        }
        if(Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "Finalizing previously open sessions.", null);
        }
        try {
            this.c(true, d0);
        }
        catch(Exception exception0) {
            Log.e("FirebaseCrashlytics", "Unable to finalize previously open sessions.", exception0);
            return false;
        }
        if(Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "Closed all previously open sessions.", null);
        }
        return true;
    }

    public final Task e(Task task0) {
        d d0 = ((C1.c)this.k.k).b;
        boolean z = d.E(((File)d0.l).listFiles()).isEmpty();
        TaskCompletionSource taskCompletionSource0 = this.m;
        if(z && d.E(((File)d0.m).listFiles()).isEmpty() && d.E(((File)d0.n).listFiles()).isEmpty()) {
            if(Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "No crash reports are available to be sent.", null);
            }
            taskCompletionSource0.trySetResult(Boolean.FALSE);
            return Tasks.forResult(null);
        }
        u1.c c0 = u1.c.a;
        c0.c("Crash reports are available to be sent.");
        A a0 = this.b;
        if(a0.a()) {
            if(Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Automatic data collection is enabled. Allowing upload.", null);
            }
            taskCompletionSource0.trySetResult(Boolean.FALSE);
            return Tasks.forResult(Boolean.TRUE).onSuccessTask(new k(this, task0, 4, false));
        }
        c0.b("Automatic data collection is disabled.");
        c0.c("Notifying that unsent reports are available.");
        taskCompletionSource0.trySetResult(Boolean.TRUE);
        synchronized(a0.c) {
        }
        Task task1 = ((TaskCompletionSource)a0.d).getTask().onSuccessTask(new J3.d(20));
        c0.b("Waiting for send/deleteUnsentReports to be called.");
        TaskCompletionSource taskCompletionSource1 = new TaskCompletionSource();
        r r0 = new r(1, taskCompletionSource1);
        task1.continueWith(r0);
        this.n.getTask().continueWith(r0);
        return taskCompletionSource1.getTask().onSuccessTask(new k(this, task0, 4, false));
    }
}

