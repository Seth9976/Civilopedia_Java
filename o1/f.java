package o1;

import M1.e;
import N1.b;
import O2.A;
import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.api.internal.BackgroundDetector;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.common.util.ProcessUtils;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentDiscoveryService;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import s1.a;
import s1.c;
import s1.l;

public final class f {
    public final Context a;
    public final String b;
    public final g c;
    public final s1.g d;
    public final AtomicBoolean e;
    public final AtomicBoolean f;
    public final l g;
    public final b h;
    public final CopyOnWriteArrayList i;
    public static final Object j;
    public static final d k;
    public static final p.b l;

    static {
        f.j = new Object();
        f.k = new d();  // 初始化器: Ljava/lang/Object;-><init>()V
        f.l = new p.b();  // 初始化器: Lp/k;-><init>()V
    }

    public f(Context context0, String s, g g0) {
        List list0;
        this.e = new AtomicBoolean(false);
        this.f = new AtomicBoolean();
        this.i = new CopyOnWriteArrayList();
        new CopyOnWriteArrayList();
        this.a = (Context)Preconditions.checkNotNull(context0);
        this.b = Preconditions.checkNotEmpty(s);
        this.c = (g)Preconditions.checkNotNull(g0);
        Class class0 = ComponentDiscoveryService.class;
        ArrayList arrayList0 = new ArrayList();
        Bundle bundle0 = null;
        try {
            PackageManager packageManager0 = context0.getPackageManager();
            if(packageManager0 == null) {
                Log.w("ComponentDiscovery", "Context has no PackageManager.");
            }
            else {
                ServiceInfo serviceInfo0 = packageManager0.getServiceInfo(new ComponentName(context0, class0), 0x80);
                if(serviceInfo0 == null) {
                    Log.w("ComponentDiscovery", class0 + " has no service info.");
                }
                else {
                    bundle0 = serviceInfo0.metaData;
                }
            }
        }
        catch(PackageManager.NameNotFoundException unused_ex) {
            Log.w("ComponentDiscovery", "Application info not found.");
        }
        if(bundle0 == null) {
            Log.w("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
            list0 = Collections.emptyList();
        }
        else {
            list0 = new ArrayList();
            for(Object object0: bundle0.keySet()) {
                String s1 = (String)object0;
                if("com.google.firebase.components.ComponentRegistrar".equals(bundle0.get(s1)) && s1.startsWith("com.google.firebase.components:")) {
                    ((ArrayList)list0).add(s1.substring(0x1F));
                }
            }
        }
        for(Object object1: list0) {
            arrayList0.add(new c(((String)object1), 0));
        }
        ArrayList arrayList1 = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList1.addAll(arrayList0);
        arrayList1.add(new c(new FirebaseCommonRegistrar(), 1));
        arrayList2.add(a.a(context0, Context.class, new Class[0]));
        arrayList2.add(a.a(this, f.class, new Class[0]));
        arrayList2.add(a.a(g0, g.class, new Class[0]));
        s1.g g1 = new s1.g(f.k, arrayList1, arrayList2);
        this.d = g1;
        this.g = new l(new M1.c(this, context0));
        this.h = g1.c(e.class);
        o1.b b0 = new o1.b(this);
        this.a();
        if(this.e.get()) {
            BackgroundDetector.getInstance().isInBackground();
        }
        this.i.add(b0);
    }

    public final void a() {
        Preconditions.checkState(!this.f.get(), "FirebaseApp was deleted");
    }

    public static f b() {
        synchronized(f.j) {
            f f0 = (f)f.l.getOrDefault("[DEFAULT]", null);
            if(f0 != null) {
                return f0;
            }
        }
        throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + ProcessUtils.getMyProcessName() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
    }

    public final String c() {
        this.a();
        Charset charset0 = Charset.defaultCharset();
        this.a();
        Charset charset1 = Charset.defaultCharset();
        return Base64Utils.encodeUrlSafeNoPadding(this.b.getBytes(charset0)) + "+" + Base64Utils.encodeUrlSafeNoPadding(this.c.b.getBytes(charset1));
    }

    public final void d() {
        HashMap hashMap0;
        if(A.Q(this.a)) {
            this.a();
            Log.i("FirebaseApp", "Device unlocked: initializing all Firebase APIs for app " + this.b);
            s1.g g0 = this.d;
            this.a();
            boolean z = "[DEFAULT]".equals(this.b);
            AtomicReference atomicReference1 = g0.e;
            Boolean boolean0 = Boolean.valueOf(z);
            do {
                if(atomicReference1.compareAndSet(null, boolean0)) {
                    synchronized(g0) {
                        hashMap0 = new HashMap(g0.a);
                    }
                    g0.w(hashMap0, z);
                    break;
                }
            }
            while(atomicReference1.get() == null);
            ((e)this.h.get()).b();
        }
        else {
            this.a();
            Log.i("FirebaseApp", "Device in Direct Boot Mode: postponing initialization of Firebase APIs for app " + this.b);
            Context context0 = this.a;
            AtomicReference atomicReference0 = o1.e.b;
            if(atomicReference0.get() == null) {
                o1.e e0 = new o1.e(context0);
                do {
                    if(atomicReference0.compareAndSet(null, e0)) {
                        context0.registerReceiver(e0, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                        return;
                    }
                }
                while(atomicReference0.get() == null);
            }
        }
    }

    public static f e(Context context0, g g0) {
        f f0;
        if(context0.getApplicationContext() instanceof Application) {
            Application application0 = (Application)context0.getApplicationContext();
            AtomicReference atomicReference0 = o1.c.a;
            if(atomicReference0.get() == null) {
                o1.c c0 = new o1.c();  // 初始化器: Ljava/lang/Object;-><init>()V
                while(true) {
                    if(atomicReference0.compareAndSet(null, c0)) {
                        BackgroundDetector.initialize(application0);
                        BackgroundDetector.getInstance().addListener(c0);
                        break;
                    }
                    if(atomicReference0.get() != null) {
                        break;
                    }
                }
            }
        }
        if(context0.getApplicationContext() != null) {
            context0 = context0.getApplicationContext();
        }
        synchronized(f.j) {
            Preconditions.checkState(!f.l.containsKey("[DEFAULT]"), "FirebaseApp name [DEFAULT] already exists!");
            Preconditions.checkNotNull(context0, "Application context cannot be null.");
            f0 = new f(context0, "[DEFAULT]", g0);
            f.l.put("[DEFAULT]", f0);
        }
        f0.d();
        return f0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(!(object0 instanceof f)) {
            return false;
        }
        ((f)object0).a();
        return this.b.equals(((f)object0).b);
    }

    public final boolean f() {
        this.a();
        S1.a a0 = (S1.a)this.g.get();
        synchronized(a0) {
        }
        return a0.a;
    }

    @Override
    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override
    public final String toString() {
        return Objects.toStringHelper(this).add("name", this.b).add("options", this.c).toString();
    }
}

