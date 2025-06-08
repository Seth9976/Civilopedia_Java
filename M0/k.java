package m0;

import X2.z;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.text.TextUtils;
import com.google.android.gms.internal.play_billing.zzan;
import com.google.android.gms.internal.play_billing.zzco;
import com.google.android.gms.internal.play_billing.zze;
import f2.J;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import org.json.JSONException;

public final class k implements Callable {
    public final int a;
    public final b b;
    public final Object c;
    public final Object d;

    public k(b b0, Object object0, Object object1, int v) {
        this.a = v;
        this.b = b0;
        this.c = object0;
        this.d = object1;
        super();
    }

    private final Object a() {
        zzan zzan0;
        h h0;
        Q1.b b1;
        Bundle bundle2;
        b b0 = this.b;
        ArrayList arrayList0 = new ArrayList();
        ((j)((i)this.c).a.get(0)).getClass();
        zzco zzco0 = ((i)this.c).a;
        int v = zzco0.size();
        int v1 = 0;
        while(v1 < v) {
            ArrayList arrayList1 = new ArrayList(zzco0.subList(v1, (v1 + 20 <= v ? v1 + 20 : v)));
            ArrayList arrayList2 = new ArrayList();
            int v2 = arrayList1.size();
            for(int v3 = 0; v3 < v2; ++v3) {
                arrayList2.add(((j)arrayList1.get(v3)).a);
            }
            Bundle bundle0 = new Bundle();
            bundle0.putStringArrayList("ITEM_ID_LIST", arrayList2);
            bundle0.putString("playBillingLibraryVersion", b0.c);
            try {
                synchronized(b0.a) {
                    zzan0 = b0.h;
                }
                if(zzan0 == null) {
                    b1 = b0.o(y.k, 0x77, "Service has been reset to null.", null);
                }
                else {
                    int v4 = b0.s ? 20 : 17;
                    if(b0.r) {
                        b0.u.getClass();
                    }
                    b0.h();
                    b0.h();
                    b0.h();
                    b0.h();
                    Bundle bundle1 = new Bundle();
                    zze.zzc(bundle1, b0.c, ((long)b0.y));
                    bundle1.putBoolean("enablePendingPurchases", true);
                    bundle1.putString("SKU_DETAILS_RESPONSE_FORMAT", "PRODUCT_DETAILS");
                    ArrayList arrayList3 = new ArrayList();
                    ArrayList arrayList4 = new ArrayList();
                    int v5 = arrayList1.size();
                    int v7 = 0;
                    for(int v6 = 0; v6 < v5; ++v6) {
                        j j0 = (j)arrayList1.get(v6);
                        arrayList3.add(null);
                        v7 |= !TextUtils.isEmpty(null);
                        j0.getClass();
                    }
                    if(v7 != 0) {
                        bundle1.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList3);
                    }
                    if(!arrayList4.isEmpty()) {
                        bundle1.putStringArrayList("SKU_SERIALIZED_DOCID_LIST", arrayList4);
                    }
                    bundle2 = zzan0.zzl(v4, "com.spears.civilopedia", "inapp", bundle0, bundle1);
                    if(bundle2 == null) {
                        b1 = b0.o(y.q, 44, "queryProductDetailsAsync got empty product details response.", null);
                    }
                    else {
                        goto label_53;
                    }
                }
            }
            catch(DeadObjectException deadObjectException0) {
                b1 = b0.o(y.k, 43, "queryProductDetailsAsync got a remote exception (try to reconnect).", deadObjectException0);
            }
            catch(Exception exception0) {
                b1 = b0.o(y.i, 43, "queryProductDetailsAsync got a remote exception (try to reconnect).", exception0);
            }
            goto label_89;
        label_53:
            if(bundle2.containsKey("DETAILS_LIST")) {
                ArrayList arrayList5 = bundle2.getStringArrayList("DETAILS_LIST");
                if(arrayList5 == null) {
                    b1 = b0.o(y.q, 46, "queryProductDetailsAsync got null response list", null);
                }
                else {
                    int v9 = 0;
                    while(v9 < arrayList5.size()) {
                        String s1 = (String)arrayList5.get(v9);
                        try {
                            h0 = new h(s1);
                        }
                        catch(JSONException jSONException0) {
                            b1 = b0.o(y.a(6, "Error trying to decode SkuDetails."), 0x2F, "Got a JSON exception trying to decode ProductDetails. \n Exception: ", jSONException0);
                            goto label_89;
                        }
                        zze.zzk("BillingClient", "Got product details: " + h0.toString());
                        arrayList0.add(h0);
                        ++v9;
                    }
                    v1 += 20;
                    continue;
                }
            }
            else {
                int v8 = zze.zzb(bundle2, "BillingClient");
                String s = zze.zzh(bundle2, "BillingClient");
                b1 = v8 == 0 ? b0.o(y.a(6, s), 45, "getSkuDetails() returned a bundle with neither an error nor a product detail list for queryProductDetailsAsync.", null) : b0.o(y.a(v8, s), 23, "getSkuDetails() failed for queryProductDetailsAsync. Response code: " + v8, null);
            }
            goto label_89;
        }
        b1 = new Q1.b(0, "", arrayList0);
    label_89:
        e e0 = y.a(b1.j, ((String)b1.k));
        ((J)this.d).e(e0, ((ArrayList)b1.l));
        return null;
    }

    private final Object b() {
        zzan zzan0;
        String s = (String)this.c;
        String s1 = (String)this.d;
        try {
            synchronized(this.b.a) {
                zzan0 = this.b.h;
            }
            return zzan0 == null ? zze.zzn(y.k, 0x77) : zzan0.zzf(3, "com.spears.civilopedia", s, s1, null);
        }
        catch(DeadObjectException deadObjectException0) {
        }
        catch(Exception exception0) {
            goto label_11;
        }
        String s2 = w.a(deadObjectException0);
        return zze.zzo(y.k, 5, s2);
    label_11:
        String s3 = w.a(exception0);
        return zze.zzo(y.i, 5, s3);
    }

    @Override
    public final Object call() {
        zzan zzan0;
        Bundle bundle1;
        switch(this.a) {
            case 0: {
                return this.a();
            }
            case 1: {
                return this.b();
            }
            default: {
                b b0 = this.b;
                D1.b b1 = (D1.b)this.c;
                z z0 = (z)this.d;
                b0.getClass();
                try {
                    synchronized(b0.a) {
                        zzan0 = b0.h;
                    }
                    if(zzan0 == null) {
                        b0.q(b1, y.k, 0x77, null);
                        return null;
                    }
                    String s = z0.b;
                    Bundle bundle0 = new Bundle();
                    zze.zzc(bundle0, b0.c, ((long)b0.y));
                    bundle1 = zzan0.zzd(9, "com.spears.civilopedia", s, bundle0);
                    goto label_23;
                }
                catch(DeadObjectException deadObjectException0) {
                }
                catch(Exception exception0) {
                    b0.q(b1, y.i, 28, exception0);
                    return null;
                }
                b0.q(b1, y.k, 28, deadObjectException0);
                return null;
            label_23:
                b1.e(y.a(zze.zzb(bundle1, "BillingClient"), zze.zzh(bundle1, "BillingClient")));
                return null;
            }
        }
    }
}

