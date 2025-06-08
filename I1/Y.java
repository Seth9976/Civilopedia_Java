package i1;

import B.k;
import C1.c;
import C1.d;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.text.TextUtils;
import android.util.Log;
import com.android.billingclient.api.Purchase;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.play_billing.zzan;
import com.google.android.gms.internal.play_billing.zzco;
import com.google.android.gms.internal.play_billing.zze;
import com.google.android.gms.measurement.internal.zzah;
import com.google.android.gms.measurement.internal.zzai;
import com.google.android.gms.measurement.internal.zzgw;
import com.google.android.gms.measurement.internal.zzlf;
import com.google.android.gms.measurement.internal.zzq;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import g1.n;
import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import m0.A;
import m0.b;
import m0.e;
import org.json.JSONException;
import x1.i;
import x1.l;

public final class y implements Callable {
    public final int a;
    public final Object b;
    public final Object c;

    public y(int v, Object object0, Object object1) {
        this.a = v;
        this.c = object0;
        this.b = object1;
        super();
    }

    @Override
    public final Object call() {
        zzan zzan0;
        Purchase purchase0;
        k k0;
        e e0;
        Bundle bundle1;
        n n0;
        switch(this.a) {
            case 0: {
                ((zzgw)this.c).i.a();
                return ((zzgw)this.c).i.zzi().A(((String)this.b));
            }
            case 1: {
                zzq zzq0 = (zzq)this.b;
                String s = (String)Preconditions.checkNotNull(zzq0.zza);
                zzlf zzlf0 = (zzlf)this.c;
                if(zzlf0.F(s).zzi(zzah.zzb) && zzai.zzb(zzq0.zzv).zzi(zzah.zzb)) {
                    return zzlf0.E(zzq0).x();
                }
                zzlf0.zzay().zzj().zza("Analytics storage consent denied. Returning null app instance id");
                return null;
            }
            case 2: {
                b b0 = (b)this.c;
                b0.getClass();
                zze.zzk("BillingClient", "Querying owned items, item type: inapp");
                ArrayList arrayList0 = new ArrayList();
                boolean z = b0.m;
                boolean z1 = b0.r;
                b0.u.getClass();
                b0.u.getClass();
                Bundle bundle0 = zze.zzd(z, z1, true, false, b0.c, ((long)b0.y));
                String s1 = null;
                while(true) {
                    try {
                    label_21:
                        synchronized(b0.a) {
                            zzan0 = b0.h;
                        }
                        if(zzan0 == null) {
                            n0 = b0.p(m0.y.k, 0x77, "Service has been reset to null", null);
                            break;
                        }
                        bundle1 = b0.m ? zzan0.zzj((b0.r ? 19 : 9), "com.spears.civilopedia", "inapp", s1, bundle0) : zzan0.zzi(3, "com.spears.civilopedia", "inapp", s1);
                        e0 = m0.y.i;
                        goto label_37;
                    }
                    catch(DeadObjectException deadObjectException0) {
                    }
                    catch(Exception exception0) {
                        n0 = b0.p(m0.y.i, 52, "Got exception trying to get purchases try to reconnect", exception0);
                        break;
                    }
                    n0 = b0.p(m0.y.k, 52, "Got exception trying to get purchases try to reconnect", deadObjectException0);
                    break;
                label_37:
                    if(bundle1 == null) {
                        zze.zzl("BillingClient", "getPurchase() got null owned items list");
                        k0 = new k(e0, 54);
                    }
                    else {
                        int v = zze.zzb(bundle1, "BillingClient");
                        String s2 = zze.zzh(bundle1, "BillingClient");
                        B1.b b1 = e.a();
                        b1.a = v;
                        b1.b = s2;
                        e e1 = b1.a();
                        if(v != 0) {
                            zze.zzl("BillingClient", "getPurchase() failed. Response code: " + v);
                            k0 = new k(e1, 23);
                        }
                        else if(!bundle1.containsKey("INAPP_PURCHASE_ITEM_LIST") || !bundle1.containsKey("INAPP_PURCHASE_DATA_LIST") || !bundle1.containsKey("INAPP_DATA_SIGNATURE_LIST")) {
                            zze.zzl("BillingClient", "Bundle returned from getPurchase() doesn\'t contain required fields.");
                            k0 = new k(e0, 55);
                        }
                        else {
                            ArrayList arrayList1 = bundle1.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                            ArrayList arrayList2 = bundle1.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                            ArrayList arrayList3 = bundle1.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                            if(arrayList1 == null) {
                                zze.zzl("BillingClient", "Bundle returned from getPurchase() contains null SKUs list.");
                                k0 = new k(e0, 56);
                            }
                            else if(arrayList2 == null) {
                                zze.zzl("BillingClient", "Bundle returned from getPurchase() contains null purchases list.");
                                k0 = new k(e0, 57);
                            }
                            else if(arrayList3 == null) {
                                zze.zzl("BillingClient", "Bundle returned from getPurchase() contains null signatures list.");
                                k0 = new k(e0, 58);
                            }
                            else {
                                k0 = new k(m0.y.j, 1);
                            }
                        }
                    }
                    e e2 = (e)k0.j;
                    if(e2 != m0.y.j) {
                        n0 = b0.p(e2, k0.i, "Purchase bundle invalid", null);
                        break;
                    }
                    ArrayList arrayList4 = bundle1.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                    ArrayList arrayList5 = bundle1.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                    ArrayList arrayList6 = bundle1.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                    int v1 = 0;
                    boolean z2 = false;
                label_80:
                    if(v1 < arrayList5.size()) {
                        String s3 = (String)arrayList5.get(v1);
                        String s4 = (String)arrayList6.get(v1);
                        zze.zzk("BillingClient", "Sku is owned: " + ((String)arrayList4.get(v1)));
                        try {
                            purchase0 = new Purchase(s3, s4);
                        }
                        catch(JSONException jSONException0) {
                            n0 = b0.p(m0.y.i, 51, "Got an exception trying to decode the purchase!", jSONException0);
                            break;
                        }
                        String s5 = purchase0.c.optString("purchaseToken");
                        if(TextUtils.isEmpty(purchase0.c.optString("token", s5))) {
                            zze.zzl("BillingClient", "BUG: empty/null token!");
                            z2 = true;
                        }
                        arrayList0.add(purchase0);
                        ++v1;
                        goto label_80;
                    }
                    if(z2) {
                        b0.u(26, 9, m0.y.i);
                    }
                    s1 = bundle1.getString("INAPP_CONTINUATION_TOKEN");
                    zze.zzk("BillingClient", "Continuation token: " + s1);
                    if(!TextUtils.isEmpty(s1)) {
                        goto label_21;
                    }
                    n0 = new n(16, m0.y.j, arrayList0);
                    if(true) {
                        break;
                    }
                    goto label_80;
                }
                ArrayList arrayList7 = (ArrayList)n0.j;
                if(arrayList7 != null) {
                    ((D1.b)this.b).f(((e)n0.k), arrayList7);
                    return null;
                }
                ((D1.b)this.b).f(((e)n0.k), zzco.zzl());
                return null;
            }
            case 3: {
                Boolean boolean0 = (Boolean)this.b;
                w3.k k1 = (w3.k)this.c;
                i i0 = (i)k1.k;
                if(!boolean0.booleanValue()) {
                    if(Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", "Deleting cached crash reports...", null);
                    }
                    for(Object object0: d.E(((File)i0.f.j).listFiles(i.p))) {
                        ((File)object0).delete();
                    }
                    d d0 = ((c)i0.k.k).b;
                    c.a(d.E(((File)d0.l).listFiles()));
                    c.a(d.E(((File)d0.m).listFiles()));
                    c.a(d.E(((File)d0.n).listFiles()));
                    i0.o.trySetResult(null);
                    return Tasks.forResult(null);
                }
                if(Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "Sending cached crash reports...", null);
                }
                A a0 = i0.b;
                if(boolean0.booleanValue()) {
                    ((TaskCompletionSource)a0.f).trySetResult(null);
                    ExecutorService executorService0 = (ExecutorService)i0.d.j;
                    w3.k k2 = new w3.k(this, executorService0, 3, false);
                    return ((Task)k1.j).onSuccessTask(executorService0, k2);
                }
                a0.getClass();
                throw new IllegalStateException("An invalid data collection token was used.");
            }
            case 4: {
                i.a(((i)this.c), ((String)this.b));
                return null;
            }
            default: {
                return l.a(((l)this.c), ((E1.d)this.b));
            }
        }
    }
}

