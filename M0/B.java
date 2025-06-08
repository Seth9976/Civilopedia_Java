package m0;

import B.a;
import J3.d;
import X2.z;
import android.app.Application;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.android.billingclient.api.ProxyBillingActivity;
import com.google.android.gms.internal.play_billing.zza;
import com.google.android.gms.internal.play_billing.zzan;
import com.google.android.gms.internal.play_billing.zzb;
import com.google.android.gms.internal.play_billing.zzc;
import com.google.android.gms.internal.play_billing.zzco;
import com.google.android.gms.internal.play_billing.zzcx;
import com.google.android.gms.internal.play_billing.zze;
import com.google.android.gms.internal.play_billing.zzev;
import com.google.android.gms.internal.play_billing.zzfb;
import com.google.android.gms.internal.play_billing.zzfm;
import com.google.android.gms.internal.play_billing.zzfn;
import com.google.android.gms.internal.play_billing.zzjz;
import com.google.android.gms.internal.play_billing.zzkb;
import com.google.android.gms.internal.play_billing.zzkd;
import com.google.android.gms.internal.play_billing.zzkg;
import com.google.android.gms.internal.play_billing.zzks;
import com.google.android.gms.internal.play_billing.zzku;
import com.google.android.gms.internal.play_billing.zzlv;
import com.google.android.gms.internal.play_billing.zzlx;
import f2.J;
import f2.j;
import g1.n;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import jeb.synthetic.FIN;
import q2.e;

public class b {
    public final Object a;
    public volatile int b;
    public final String c;
    public final Handler d;
    public volatile A e;
    public final Context f;
    public final n g;
    public volatile zzan h;
    public volatile m0.n i;
    public boolean j;
    public int k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public final d u;
    public final boolean v;
    public ExecutorService w;
    public volatile zzev x;
    public final Long y;

    public b(d d0, Application application0) {
        this.a = new Object();
        this.b = 0;
        this.d = new Handler(Looper.getMainLooper());
        this.k = 0;
        long v = new Random().nextLong();
        this.y = v;
        this.c = "7.1.1";
        this.f = application0.getApplicationContext();
        zzks zzks0 = zzku.zzc();
        zzks0.zzo("7.1.1");
        zzks0.zzn("com.spears.civilopedia");
        zzks0.zzm(v);
        zzku zzku0 = (zzku)zzks0.zzf();
        this.g = new n(this.f, zzku0);
        zze.zzl("BillingClient", "Billing client should have a valid listener but the provided is null.");
        this.e = new A(this.f, null, this.g);
        this.u = d0;
        this.f.getPackageName();
    }

    public b(d d0, Application application0, e e0) {
        this.a = new Object();
        this.b = 0;
        this.d = new Handler(Looper.getMainLooper());
        this.k = 0;
        long v = new Random().nextLong();
        this.y = v;
        this.c = "7.1.1";
        this.f = application0.getApplicationContext();
        zzks zzks0 = zzku.zzc();
        zzks0.zzo("7.1.1");
        zzks0.zzn("com.spears.civilopedia");
        zzks0.zzm(v);
        zzku zzku0 = (zzku)zzks0.zzf();
        this.g = new n(this.f, zzku0);
        if(e0 == null) {
            zze.zzl("BillingClient", "Billing client should have a valid listener but the provided is null.");
        }
        this.e = new A(this.f, e0, this.g);
        this.u = d0;
        this.v = false;
        this.f.getPackageName();
    }

    public void a(z z0, D1.b b0) {
        if(!this.b()) {
            this.u(2, 3, y.k);
            b0.e(y.k);
            return;
        }
        if(TextUtils.isEmpty(z0.b)) {
            zze.zzl("BillingClient", "Please provide a valid purchase token.");
            this.u(26, 3, y.h);
            b0.e(y.h);
            return;
        }
        if(!this.m) {
            this.u(27, 3, y.b);
            b0.e(y.b);
            return;
        }
        if(b.f(new k(this, b0, z0, 2), 30000L, new B(0, this, b0), this.s(), this.j()) == null) {
            m0.e e0 = this.g();
            this.u(25, 3, e0);
            b0.e(e0);
        }
    }

    public final boolean b() {
        boolean z = false;
        synchronized(this.a) {
            if(this.b == 2 && this.h != null && this.i != null) {
                z = true;
            }
        }
        return z;
    }

    public m0.e c(j j0, m0.d d0) {
        String s9;
        int v6;
        m0.e e1;
        Bundle bundle1;
        Future future0;
        int v4;
        boolean z2;
        c c4;
        String s3;
        String s2;
        m0.e e0;
        if(this.e != null && ((e)this.e.c) != null) {
            if(!this.b()) {
                this.u(2, 2, y.k);
                this.w(y.k);
                return y.k;
            }
            ArrayList arrayList0 = new ArrayList();
            arrayList0.addAll(d0.d);
            zzco zzco0 = d0.c;
            if(zzcx.zza(arrayList0, null) != null) {
                throw new ClassCastException();
            }
            c c0 = (c)zzcx.zza(zzco0, null);
            String s = c0.a.c;
            String s1 = c0.a.d;
            if(s1.equals("subs") && !this.j) {
                zze.zzl("BillingClient", "Current client doesn\'t support subscriptions.");
                this.u(9, 2, y.m);
                this.w(y.m);
                return y.m;
            }
            if(d0.a() && !this.l) {
                zze.zzl("BillingClient", "Current client doesn\'t support extra params for buy intent.");
                this.u(18, 2, y.g);
                this.w(y.g);
                return y.g;
            }
            if(arrayList0.size() > 1 && !this.p) {
                zze.zzl("BillingClient", "Current client doesn\'t support multi-item purchases.");
                this.u(19, 2, y.n);
                this.w(y.n);
                return y.n;
            }
            if(!zzco0.isEmpty() && !this.q) {
                zze.zzl("BillingClient", "Current client doesn\'t support purchases with ProductDetails.");
                this.u(20, 2, y.p);
                this.w(y.p);
                return y.p;
            }
            if(d0.c.isEmpty()) {
                e0 = y.j;
                s2 = s1;
                s3 = s;
            }
            else {
                c c1 = (c)d0.c.get(0);
                int v = 1;
            alab1:
                while(true) {
                    if(v >= d0.c.size()) {
                        String s4 = c1.a().d();
                        HashSet hashSet0 = new HashSet();
                        HashSet hashSet1 = new HashSet();
                        zzco zzco1 = d0.c;
                        int v1 = zzco1.size();
                        s2 = s1;
                        s3 = s;
                        for(int v2 = 0; v2 < v1; ++v2) {
                            c c3 = (c)zzco1.get(v2);
                            c3.a().c().equals("subs");
                            if(hashSet0.contains(c3.a().b())) {
                                e0 = y.a(5, "ProductId can not be duplicated. Invalid product id: " + c3.a().b() + ".");
                                break alab1;
                            }
                            hashSet0.add(c3.a().b());
                            if(!c1.a().c().equals("play_pass_subs") && !c3.a().c().equals("play_pass_subs") && !s4.equals(c3.a().d())) {
                                e0 = y.a(5, "All products must have the same package name.");
                                break alab1;
                            }
                        }
                        for(Object object0: hashSet1) {
                            String s5 = (String)object0;
                            if(!hashSet0.contains(s5)) {
                                continue;
                            }
                            e0 = y.a(5, "OldProductId must not be one of the products to be purchased. Invalid old product id: " + s5 + ".");
                            break alab1;
                        }
                        g g0 = c1.a().a();
                        e0 = g0 == null || g0.c == null ? y.j : y.a(5, "Both autoPayDetails and autoPayBalanceThreshold is required for constructing ProductDetailsParams for autopay.");
                        break;
                    }
                    c c2 = (c)d0.c.get(v);
                    if(!c2.a().c().equals(c1.a().c()) && !c2.a().c().equals("play_pass_subs")) {
                        e0 = y.a(5, "All products should have same ProductType.");
                        s2 = s1;
                        s3 = s;
                        break;
                    }
                    ++v;
                }
            }
            if(e0 != y.j) {
                this.u(120, 2, e0);
                this.w(e0);
                return e0;
            }
            if(this.l) {
                boolean z = this.m;
                this.u.getClass();
                this.u.getClass();
                boolean z1 = this.v;
                Bundle bundle0 = new Bundle();
                zze.zzc(bundle0, this.c, ((long)this.y));
                d0.b.getClass();
                if(!TextUtils.isEmpty(null)) {
                    bundle0.putString("accountId", null);
                }
                if(!TextUtils.isEmpty(null)) {
                    bundle0.putString("obfuscatedProfileId", null);
                }
                if(!TextUtils.isEmpty(null)) {
                    bundle0.putStringArrayList("skusToReplace", new ArrayList(Arrays.asList(new String[]{0})));
                }
                d0.b.getClass();
                if(!TextUtils.isEmpty(null)) {
                    d0.b.getClass();
                    bundle0.putString("oldSkuPurchaseToken", null);
                }
                if(!TextUtils.isEmpty(null)) {
                    bundle0.putString("oldSkuPurchaseId", null);
                }
                d0.b.getClass();
                if(!TextUtils.isEmpty(null)) {
                    d0.b.getClass();
                    bundle0.putString("originalExternalTransactionId", null);
                }
                if(!TextUtils.isEmpty(null)) {
                    bundle0.putString("paymentsPurchaseParams", null);
                }
                if(z) {
                    bundle0.putBoolean("enablePendingPurchases", true);
                }
                if(z1) {
                    bundle0.putBoolean("enableAlternativeBilling", true);
                }
                if(d0.c.stream().anyMatch(new zza())) {
                    zzfm zzfm0 = zzfn.zza();
                    zzfm0.zza(((Iterable)d0.c.stream().filter(new zzb()).map(new zzc("com.spears.civilopedia")).collect(zzco.zzo())));
                    bundle0.putByteArray("subscriptionProductReplacementParamsList", ((zzfn)zzfm0.zzf()).zzh());
                }
                if(arrayList0.isEmpty()) {
                    ArrayList arrayList4 = new ArrayList(zzco0.size() - 1);
                    ArrayList arrayList5 = new ArrayList(zzco0.size() - 1);
                    ArrayList arrayList6 = new ArrayList();
                    ArrayList arrayList7 = new ArrayList();
                    ArrayList arrayList8 = new ArrayList();
                    ArrayList arrayList9 = new ArrayList();
                    for(int v3 = 0; v3 < zzco0.size(); ++v3) {
                        c c5 = (c)zzco0.get(v3);
                        h h0 = c5.a;
                        if(!h0.f.isEmpty()) {
                            arrayList6.add(h0.f);
                        }
                        arrayList7.add(c5.b);
                        String s6 = h0.g;
                        if(h0.i != null && !h0.i.isEmpty()) {
                            for(Object object2: h0.i) {
                                g g1 = (g)object2;
                                if(!TextUtils.isEmpty(g1.b)) {
                                    s6 = g1.b;
                                    break;
                                }
                                if(false) {
                                    break;
                                }
                            }
                        }
                        if(!TextUtils.isEmpty(s6)) {
                            arrayList8.add(s6);
                        }
                        if(v3 > 0) {
                            arrayList4.add(((c)zzco0.get(v3)).a.c);
                            arrayList5.add(((c)zzco0.get(v3)).a.d);
                        }
                    }
                    c4 = c0;
                    bundle0.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList7);
                    bundle0.putIntegerArrayList("AUTO_PAY_BALANCE_THRESHOLD_LIST", arrayList9);
                    if(!arrayList6.isEmpty()) {
                        bundle0.putStringArrayList("skuDetailsTokens", arrayList6);
                    }
                    if(!arrayList8.isEmpty()) {
                        bundle0.putStringArrayList("SKU_SERIALIZED_DOCID_LIST", arrayList8);
                    }
                    if(!arrayList4.isEmpty()) {
                        bundle0.putStringArrayList("additionalSkus", arrayList4);
                        bundle0.putStringArrayList("additionalSkuTypes", arrayList5);
                    }
                }
                else {
                    ArrayList arrayList1 = new ArrayList();
                    new ArrayList();
                    new ArrayList();
                    new ArrayList();
                    new ArrayList();
                    Iterator iterator1 = arrayList0.iterator();
                    if(!iterator1.hasNext()) {
                        if(!arrayList1.isEmpty()) {
                            bundle0.putStringArrayList("skuDetailsTokens", arrayList1);
                        }
                        if(arrayList0.size() > 1) {
                            ArrayList arrayList2 = new ArrayList(arrayList0.size() - 1);
                            ArrayList arrayList3 = new ArrayList(arrayList0.size() - 1);
                            if(1 >= arrayList0.size()) {
                                bundle0.putStringArrayList("additionalSkus", arrayList2);
                                bundle0.putStringArrayList("additionalSkuTypes", arrayList3);
                                c4 = c0;
                                goto label_180;
                            }
                            arrayList0.get(1).getClass();
                            throw new ClassCastException();
                        }
                        c4 = c0;
                        goto label_180;
                    }
                    Object object1 = iterator1.next();
                    object1.getClass();
                    throw new ClassCastException();
                }
            label_180:
                if(bundle0.containsKey("SKU_OFFER_ID_TOKEN_LIST") && !this.n) {
                    this.u(21, 2, y.o);
                    this.w(y.o);
                    return y.o;
                }
                if(TextUtils.isEmpty(c4.a.d())) {
                    z2 = false;
                }
                else {
                    bundle0.putString("skuPackageName", c4.a.d());
                    z2 = true;
                }
                if(!TextUtils.isEmpty(null)) {
                    bundle0.putString("accountName", null);
                }
                Intent intent0 = j0.getIntent();
                if(intent0 == null) {
                    zze.zzl("BillingClient", "Activity\'s intent is null.");
                }
                else if(!TextUtils.isEmpty(intent0.getStringExtra("PROXY_PACKAGE"))) {
                    String s7 = intent0.getStringExtra("PROXY_PACKAGE");
                    bundle0.putString("proxyPackage", s7);
                    try {
                        bundle0.putString("proxyPackageVersion", this.f.getPackageManager().getPackageInfo(s7, 0).versionName);
                    }
                    catch(PackageManager.NameNotFoundException unused_ex) {
                        bundle0.putString("proxyPackageVersion", "package not found");
                    }
                }
                if(this.q && !zzco0.isEmpty()) {
                    v4 = 17;
                }
                else if(!this.o || !z2) {
                    v4 = this.m ? 9 : 6;
                }
                else {
                    v4 = 15;
                }
                l l0 = new l(this, v4, s3, s2, d0, bundle0);
                ExecutorService executorService0 = this.j();
                future0 = b.f(l0, 5000L, null, this.d, executorService0);
            }
            else {
                k k0 = new k(this, s3, s2, 1);
                ExecutorService executorService1 = this.j();
                future0 = b.f(k0, 5000L, null, this.d, executorService1);
            }
            try {
                if(future0 == null) {
                    this.u(25, 2, y.d);
                    this.w(y.d);
                    return y.d;
                }
                bundle1 = (Bundle)future0.get(5000L, TimeUnit.MILLISECONDS);
                int v5 = zze.zzb(bundle1, "BillingClient");
                String s8 = zze.zzh(bundle1, "BillingClient");
                if(v5 == 0) {
                    Intent intent1 = new Intent(j0, ProxyBillingActivity.class);
                    intent1.putExtra("BUY_INTENT", ((PendingIntent)bundle1.getParcelable("BUY_INTENT")));
                    j0.startActivity(intent1);
                    return y.j;
                }
                zze.zzl("BillingClient", "Unable to buy item, Error response code: " + v5);
                e1 = y.a(v5, s8);
                if(bundle1 == null) {
                    goto label_241;
                }
                else {
                    goto label_230;
                }
                goto label_242;
            }
            catch(TimeoutException | CancellationException timeoutException0) {
                goto label_256;
            }
            catch(Exception exception0) {
                goto label_261;
            }
            try {
            label_230:
                Object object3 = bundle1.get("LOG_REASON");
                if(object3 == null) {
                    v6 = 1;
                }
                else if(object3 instanceof Integer) {
                    v6 = zzkg.zza(((int)(((Integer)object3))));
                }
                else {
                    zze.zzl("BillingClient", "Unexpected type for bundle log reason: " + object3.getClass().getName());
                    v6 = 1;
                }
                goto label_242;
            }
            catch(Throwable throwable0) {
            }
            try {
                zze.zzl("BillingClient", "Failed to get log reason from bundle: " + throwable0.getMessage());
            }
            catch(TimeoutException | CancellationException timeoutException0) {
                goto label_256;
            }
            catch(Exception exception0) {
                goto label_261;
            }
            v6 = 1;
            goto label_242;
        label_241:
            v6 = 1;
        label_242:
            if(v6 == 1) {
                v6 = 23;
            }
            if(bundle1 == null) {
                goto label_249;
            }
            else {
                try {
                    s9 = bundle1.getString("ADDITIONAL_LOG_DETAILS");
                }
                catch(Throwable throwable1) {
                    try {
                        zze.zzl("BillingClient", "Failed to get additional log details from bundle: " + throwable1.getMessage());
                    label_249:
                        s9 = null;
                    label_250:
                        this.v(v6, 2, e1, s9);
                        this.w(e1);
                        return e1;
                    }
                    catch(TimeoutException | CancellationException timeoutException0) {
                        goto label_256;
                    }
                    catch(Exception exception0) {
                        goto label_261;
                    }
                }
            }
            goto label_250;
        label_256:
            zze.zzm("BillingClient", "Time out while launching billing flow. Try to reconnect", timeoutException0);
            String s10 = w.a(timeoutException0);
            this.v(4, 2, y.l, s10);
            this.w(y.l);
            return y.l;
        label_261:
            zze.zzm("BillingClient", "Exception while launching billing flow. Try to reconnect", exception0);
            String s11 = w.a(exception0);
            this.v(5, 2, y.k, s11);
            this.w(y.k);
            return y.k;
        }
        this.u(12, 2, y.r);
        return y.r;
    }

    public void d(i i0, J j0) {
        if(!this.b()) {
            this.u(2, 7, y.k);
            ArrayList arrayList0 = new ArrayList();
            j0.e(y.k, arrayList0);
            return;
        }
        if(!this.q) {
            zze.zzl("BillingClient", "Querying product details is not supported.");
            this.u(20, 7, y.p);
            ArrayList arrayList1 = new ArrayList();
            j0.e(y.p, arrayList1);
            return;
        }
        if(b.f(new k(this, i0, j0, 0), 30000L, new a(28, this, j0), this.s(), this.j()) == null) {
            m0.e e0 = this.g();
            this.u(25, 7, e0);
            j0.e(e0, new ArrayList());
        }
    }

    public void e(e e0) {
        m0.e e1;
        Object object0 = this.a;
        __monitor_enter(object0);
        int v = FIN.finallyOpen$NT();
        if(this.b()) {
            e1 = this.t();
            FIN.finallyExec$NT(v);
        }
        else {
            switch(this.b) {
                case 1: {
                    zze.zzl("BillingClient", "Client is already in the process of connecting to billing service.");
                    e1 = y.e;
                    this.u(37, 6, e1);
                    FIN.finallyExec$NT(v);
                    break;
                }
                case 3: {
                    zze.zzl("BillingClient", "Client was already closed and can\'t be reused. Please create another instance.");
                    e1 = y.k;
                    this.u(38, 6, e1);
                    FIN.finallyExec$NT(v);
                    break;
                }
                default: {
                    this.m(1);
                    this.n();
                    zze.zzk("BillingClient", "Starting in-app billing setup.");
                    this.i = new m0.n(this, e0);
                    FIN.finallyCodeBegin$NT(v);
                    __monitor_exit(object0);
                    FIN.finallyCodeEnd$NT(v);
                    Intent intent0 = new Intent("com.android.vending.billing.InAppBillingService.BIND");
                    intent0.setPackage("com.android.vending");
                    List list0 = this.f.getPackageManager().queryIntentServices(intent0, 0);
                    int v1 = 41;
                    if(list0 == null || list0.isEmpty()) {
                    label_55:
                        this.m(0);
                        zze.zzk("BillingClient", "Billing service unavailable on device.");
                        e1 = y.c;
                        this.u(v1, 6, e1);
                    }
                    else {
                        ServiceInfo serviceInfo0 = ((ResolveInfo)list0.get(0)).serviceInfo;
                        v1 = 40;
                        if(serviceInfo0 == null) {
                            zze.zzl("BillingClient", "The device doesn\'t have valid Play Store.");
                            goto label_55;
                        }
                        else {
                            String s = serviceInfo0.packageName;
                            String s1 = serviceInfo0.name;
                            if(!Objects.equals(s, "com.android.vending") || s1 == null) {
                                zze.zzl("BillingClient", "The device doesn\'t have valid Play Store.");
                                goto label_55;
                            }
                            else {
                                ComponentName componentName0 = new ComponentName(s, s1);
                                Intent intent1 = new Intent(intent0);
                                intent1.setComponent(componentName0);
                                intent1.putExtra("playBillingLibraryVersion", this.c);
                                Object object1 = this.a;
                                __monitor_enter(object1);
                                int v2 = FIN.finallyOpen$NT();
                                switch(this.b) {
                                    case 1: {
                                        FIN.finallyCodeBegin$NT(v2);
                                        __monitor_exit(object1);
                                        FIN.finallyCodeEnd$NT(v2);
                                        if(this.f.bindService(intent1, this.i, 1)) {
                                            zze.zzk("BillingClient", "Service was bonded successfully.");
                                            e1 = null;
                                        }
                                        else {
                                            zze.zzl("BillingClient", "Connection to Billing service is blocked.");
                                            v1 = 39;
                                            goto label_55;
                                        }
                                        break;
                                    }
                                    case 2: {
                                        e1 = this.t();
                                        FIN.finallyExec$NT(v2);
                                        break;
                                    }
                                    default: {
                                        zze.zzl("BillingClient", "Client state no longer CONNECTING, returning service disconnected.");
                                        e1 = y.k;
                                        this.u(0x75, 6, e1);
                                        FIN.finallyExec$NT(v2);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if(e1 != null) {
            e0.e(e1);
        }
    }

    public static Future f(Callable callable0, long v, Runnable runnable0, Handler handler0, ExecutorService executorService0) {
        Future future0;
        try {
            future0 = executorService0.submit(callable0);
        }
        catch(Exception exception0) {
            zze.zzm("BillingClient", "Async task throws exception!", exception0);
            return null;
        }
        handler0.postDelayed(new a(27, future0, runnable0), ((long)(((double)v) * 0.95)));
        return future0;
    }

    public final m0.e g() {
        synchronized(this.a) {
            for(int v1 = 0; v1 < 2; ++v1) {
                if(this.b == new int[]{0, 3}[v1]) {
                    return y.k;
                }
            }
            return y.i;
        }
    }

    public final void h() {
        if(!TextUtils.isEmpty(null)) {
            return;
        }
        this.f.getPackageName();
    }

    public static String i() [...] // Potential decryptor

    public final ExecutorService j() {
        synchronized(this) {
            if(this.w == null) {
                m m0 = new m();
                this.w = Executors.newFixedThreadPool(zze.zza, m0);
            }
            return this.w;
        }
    }

    public final void k(zzjz zzjz0) {
        try {
            int v = this.k;
            this.g.getClass();
            try {
                zzks zzks0 = (zzks)((zzku)this.g.j).zzn();
                zzks0.zza(v);
                this.g.j = (zzku)zzks0.zzf();
                this.g.s(zzjz0);
            }
            catch(Throwable throwable1) {
                zze.zzm("BillingLogger", "Unable to log.", throwable1);
            }
        }
        catch(Throwable throwable0) {
            zze.zzm("BillingClient", "Unable to log.", throwable0);
        }
    }

    public final void l(zzkd zzkd0) {
        try {
            int v = this.k;
            this.g.getClass();
            try {
                zzks zzks0 = (zzks)((zzku)this.g.j).zzn();
                zzks0.zza(v);
                this.g.j = (zzku)zzks0.zzf();
                this.g.t(zzkd0);
            }
            catch(Throwable throwable1) {
                zze.zzm("BillingLogger", "Unable to log.", throwable1);
            }
        }
        catch(Throwable throwable0) {
            zze.zzm("BillingClient", "Unable to log.", throwable0);
        }
    }

    public final void m(int v) {
        String s1;
        String s;
        synchronized(this.a) {
            if(this.b == 3) {
                return;
            }
            switch(this.b) {
                case 0: {
                    s = "DISCONNECTED";
                    break;
                }
                case 1: {
                    s = "CONNECTING";
                    break;
                }
                case 2: {
                    s = "CONNECTED";
                    break;
                }
                default: {
                    s = "CLOSED";
                }
            }
            switch(v) {
                case 0: {
                    s1 = "DISCONNECTED";
                    break;
                }
                case 1: {
                    s1 = "CONNECTING";
                    break;
                }
                case 2: {
                    s1 = "CONNECTED";
                    break;
                }
                default: {
                    s1 = "CLOSED";
                }
            }
            zze.zzk("BillingClient", "Setting clientState from " + s + " to " + s1);
            this.b = v;
        }
    }

    public final void n() {
        Object object0 = this.a;
        __monitor_enter(object0);
        try {
            if(this.i != null) {
                this.f.unbindService(this.i);
                this.h = null;
                this.i = null;
            }
        }
        catch(Throwable throwable0) {
            try {
                zze.zzm("BillingClient", "There was an exception while unbinding service!", throwable0);
                this.h = null;
                this.i = null;
                goto label_18;
            }
            catch(Throwable throwable1) {
                try {
                    this.h = null;
                    this.i = null;
                    throw throwable1;
                }
                catch(Throwable throwable2) {
                }
            }
            __monitor_exit(object0);
            throw throwable2;
        }
    label_18:
        __monitor_exit(object0);
    }

    public final Q1.b o(m0.e e0, int v, String s, Exception exception0) {
        zze.zzm("BillingClient", s, exception0);
        this.v(v, 7, e0, w.a(exception0));
        return new Q1.b(e0.a, e0.b, new ArrayList());
    }

    public final n p(m0.e e0, int v, String s, Exception exception0) {
        this.v(v, 9, e0, w.a(exception0));
        zze.zzm("BillingClient", s, exception0);
        return new n(16, e0, null);
    }

    public final void q(D1.b b0, m0.e e0, int v, Exception exception0) {
        zze.zzm("BillingClient", "Error in acknowledge purchase!", exception0);
        this.v(v, 3, e0, w.a(exception0));
        b0.e(e0);
    }

    public static boolean r(b b0) {
        boolean z = true;
        synchronized(b0.a) {
            if(b0.b != 1) {
                z = false;
            }
        }
        return z;
    }

    public final Handler s() {
        return Looper.myLooper() == null ? this.d : new Handler(Looper.myLooper());
    }

    public final m0.e t() {
        zze.zzk("BillingClient", "Service connection is valid. No need to re-initialize.");
        zzkb zzkb0 = zzkd.zzc();
        zzkb0.zzn(6);
        zzlv zzlv0 = zzlx.zzc();
        zzlv0.zza(true);
        zzkb0.zzm(zzlv0);
        this.l(((zzkd)zzkb0.zzf()));
        return y.j;
    }

    public final void u(int v, int v1, m0.e e0) {
        try {
            this.k(w.b(v, v1, e0));
        }
        catch(Throwable throwable0) {
            zze.zzm("BillingClient", "Unable to log.", throwable0);
        }
    }

    public final void v(int v, int v1, m0.e e0, String s) {
        try {
            this.k(w.c(v, v1, e0, s));
        }
        catch(Throwable throwable0) {
            zze.zzm("BillingClient", "Unable to log.", throwable0);
        }
    }

    public final void w(m0.e e0) {
        if(Thread.interrupted()) {
            return;
        }
        a a0 = new a(29, this, e0);
        this.d.post(a0);
    }

    public final zzev x() {
        synchronized(this) {
            if(this.x == null) {
                this.x = zzfb.zza(this.j());
            }
            return this.x;
        }
    }
}

