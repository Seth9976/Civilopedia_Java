package q2;

import J2.j;
import J3.d;
import X2.z;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.android.billingclient.api.Purchase;
import com.google.android.gms.internal.play_billing.zzbe;
import com.google.android.gms.internal.play_billing.zzco;
import com.google.android.gms.internal.play_billing.zze;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.spears.civilopedia.MyApplication;
import f2.J;
import g1.n;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import m0.b;
import m0.c;
import m0.t;
import m0.v;
import m0.y;
import o2.G;
import org.json.JSONArray;
import org.json.JSONObject;
import w2.h;
import x2.i;
import x2.k;
import x2.r;

public final class e {
    public final n a;
    public final h b;
    public Object c;
    public final b d;
    public final FirebaseAnalytics e;

    public e(MyApplication myApplication0, SharedPreferences sharedPreferences0) {
        j.e(myApplication0.getApplicationContext(), "getApplicationContext(...)");
        b b0;
        this.a = new n(sharedPreferences0);
        this.b = new h(new a(this, 0));
        this.c = r.i;
        m0.a a0 = new m0.a(myApplication0);
        a0.a = new d(16);
        a0.b = this;
        if(((e)a0.b) == null) {
            throw new IllegalArgumentException("Please provide a valid listener for purchases updates.");
        }
        if(((d)a0.a) == null) {
            throw new IllegalArgumentException("Pending purchases for one-time products must be supported.");
        }
        ((d)a0.a).getClass();
        if(((e)a0.b) == null) {
            d d1 = (d)a0.a;
            b0 = a0.a() ? new t(d1, myApplication0) : new b(d1, myApplication0);
        }
        else {
            d d0 = (d)a0.a;
            e e0 = (e)a0.b;
            b0 = a0.a() ? new t(d0, myApplication0, e0) : new b(d0, myApplication0, e0);
        }
        this.d = b0;
        FirebaseAnalytics firebaseAnalytics0 = FirebaseAnalytics.getInstance(myApplication0);
        j.e(firebaseAnalytics0, "getInstance(...)");
        this.e = firebaseAnalytics0;
    }

    public final void a(Purchase purchase0) {
        ArrayList arrayList0 = new ArrayList();
        JSONObject jSONObject0 = purchase0.c;
        if(jSONObject0.has("productIds")) {
            JSONArray jSONArray0 = jSONObject0.optJSONArray("productIds");
            if(jSONArray0 != null) {
                for(int v = 0; v < jSONArray0.length(); ++v) {
                    arrayList0.add(jSONArray0.optString(v));
                }
            }
        }
        else if(jSONObject0.has("productId")) {
            arrayList0.add(jSONObject0.optString("productId"));
        }
        boolean z = j.a(((String)i.U(arrayList0)), "premium_upgrade");
        n n0 = this.a;
        if(z) {
            f f0 = new f(true);
            n0.getClass();
            ((SharedPreferences)n0.j).edit().putBoolean("premium_enititled", true).apply();
            n0.n(f0);
            return;
        }
        n0.d();
    }

    public final androidx.lifecycle.t b() {
        return (androidx.lifecycle.t)this.b.getValue();
    }

    public final boolean c(f2.j j0) {
        boolean z = false;
        if(!((List)this.c).isEmpty()) {
            b b0 = this.d;
            if(b0.b()) {
                n n0 = new n(14);
                m0.h h0 = (m0.h)i.S(((List)this.c));
                n0.j = h0;
                if(h0.a() != null) {
                    h0.a().getClass();
                    String s = h0.a().a;
                    if(s != null) {
                        n0.k = s;
                    }
                }
                zzbe.zzc(((m0.h)n0.j), "ProductDetails is required for constructing ProductDetailsParams.");
                if(((m0.h)n0.j).h != null) {
                    zzbe.zzc(((String)n0.k), "offerToken is required for constructing ProductDetailsParams for subscriptions.");
                }
                ArrayList arrayList0 = new ArrayList(G.p(new c(n0)));
                if(arrayList0.isEmpty()) {
                    throw new IllegalArgumentException("Details of the products must be provided.");
                }
                arrayList0.forEach(new v());  // 初始化器: Ljava/lang/Object;-><init>()V
                m0.d d0 = new m0.d();  // 初始化器: Ljava/lang/Object;-><init>()V
                d0.a = !((c)arrayList0.get(0)).a.d().isEmpty();
                if(!TextUtils.isEmpty(null) || !TextUtils.isEmpty(null)) {
                    z = true;
                }
                if(z && !TextUtils.isEmpty(null)) {
                    throw new IllegalArgumentException("Please provide Old SKU purchase information(token/id) or original external transaction id, not both.");
                }
                d0.b = new t1.c(15);
                d0.d = new ArrayList();
                d0.c = zzco.zzk(arrayList0);
                b0.c(j0, d0);
                return true;
            }
        }
        return false;
    }

    public final void d(String s, Bundle bundle0) {
        Bundle bundle1 = new Bundle();
        if(bundle0 != null) {
            bundle1.putAll(bundle0);
        }
        bundle1.putString("source", "google");
        this.e.a(s, bundle1);
    }

    public final void e(m0.e e0) {
        j.f(e0, "billingResult");
        Bundle bundle0 = new Bundle();
        bundle0.putInt("value", e0.a);
        this.d("billing_setup_finished", bundle0);
        if(e0.a == 0) {
            ArrayList arrayList0 = new ArrayList(k.E(q2.d.a));
            for(Object object0: q2.d.a) {
                z z0 = new z(2);
                z0.b = (String)object0;
                if(((String)object0) == null) {
                    throw new IllegalArgumentException("Product id must be provided.");
                }
                arrayList0.add(new m0.j(z0));
            }
            m0.i i0 = new m0.i();  // 初始化器: Ljava/lang/Object;-><init>()V
            if(arrayList0.isEmpty()) {
                throw new IllegalArgumentException("Product list cannot be empty.");
            }
            HashSet hashSet0 = new HashSet();
            for(Object object1: arrayList0) {
                ((m0.j)object1).getClass();
                hashSet0.add("inapp");
            }
            if(hashSet0.size() > 1) {
                throw new IllegalArgumentException("All products should be of the same product type.");
            }
            zzco zzco0 = zzco.zzk(arrayList0);
            i0.a = zzco0;
            if(zzco0 == null) {
                throw new IllegalArgumentException("Product list must be set to a non empty list.");
            }
            m0.i i1 = new m0.i();  // 初始化器: Ljava/lang/Object;-><init>()V
            i1.a = i0.a;
            Log.d("BillingRepository", "querySkuDetailsAsync for inapp");
            J j0 = new J(this, 2);
            this.d.d(i1, j0);
            this.h();
            return;
        }
        Log.d("BillingRepository", e0.b);
    }

    public final void f(m0.e e0, List list0) {
        j.f(e0, "billingResult");
        Bundle bundle0 = new Bundle();
        bundle0.putInt("value", e0.a);
        this.d("billing_purchase_updated", bundle0);
        int v = e0.a;
        switch(v) {
            case -1: {
                b b0 = this.d;
                if(!b0.b()) {
                    b0.e(this);
                    return;
                }
                break;
            }
            case 0: {
                if(list0 != null) {
                    this.g(i.s0(list0));
                    return;
                }
                break;
            }
            default: {
                if(v != 7) {
                    Log.i("BillingRepository", e0.b);
                    return;
                }
                Log.d("BillingRepository", e0.b);
                this.h();
            }
        }
    }

    public final void g(Set set0) {
        PublicKey publicKey0;
        HashSet hashSet0 = new HashSet(set0.size());
        for(Object object0: set0) {
            Purchase purchase0 = (Purchase)object0;
            if(purchase0.c.optInt("purchaseState", 1) != 4) {
                String s = purchase0.a;
                j.e(s, "getOriginalJson(...)");
                String s1 = purchase0.b;
                j.e(s1, "getSignature(...)");
                if(TextUtils.isEmpty(s) || TextUtils.isEmpty("MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEApBaWfWh7W4ZcE4lQOQv8C+eIOZ5hgHH2Hc6on/I97Q/2fKDl5RQoknwGiFOuzJyK8h8d8dvgKu37+UwSzqXmGMFymJlkM3FIY6vo2eB9yXbYhMylQASyms15dyGAKxzBfaiAFI9vVILbzZGTcvXXRJwdtuexO+FdIQeKmtbzWEX/ulQzQ6cPf25nKUfD2yUgWEo+h8zwmacKv1NV1DV3CYeckm4LWhgj90WkJA0ONnW3pjZCyEHSGRcHTJu4FxUckKCLmBOfgsP4i74OxR/SnTbaEqqubdsV06RNIXvIo+HcmvprZjSopyfe7YlEdV2JdYFyLboL15m/4N7cTb/ELwIDAQAB") || TextUtils.isEmpty(s1)) {
                label_41:
                    Log.w("IABUtil/Security", "Purchase verification failed: missing data.");
                }
                else {
                    try {
                        byte[] arr_b = Base64.decode("MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEApBaWfWh7W4ZcE4lQOQv8C+eIOZ5hgHH2Hc6on/I97Q/2fKDl5RQoknwGiFOuzJyK8h8d8dvgKu37+UwSzqXmGMFymJlkM3FIY6vo2eB9yXbYhMylQASyms15dyGAKxzBfaiAFI9vVILbzZGTcvXXRJwdtuexO+FdIQeKmtbzWEX/ulQzQ6cPf25nKUfD2yUgWEo+h8zwmacKv1NV1DV3CYeckm4LWhgj90WkJA0ONnW3pjZCyEHSGRcHTJu4FxUckKCLmBOfgsP4i74OxR/SnTbaEqqubdsV06RNIXvIo+HcmvprZjSopyfe7YlEdV2JdYFyLboL15m/4N7cTb/ELwIDAQAB", 0);
                        publicKey0 = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(arr_b));
                        j.e(publicKey0, "generatePublic(...)");
                    }
                    catch(NoSuchAlgorithmException noSuchAlgorithmException0) {
                        throw new RuntimeException(noSuchAlgorithmException0);
                    }
                    catch(InvalidKeySpecException invalidKeySpecException0) {
                        Log.w("IABUtil/Security", "Invalid key specification: " + invalidKeySpecException0);
                        throw new IOException("Invalid key specification: " + invalidKeySpecException0);
                    }
                    try {
                        byte[] arr_b1 = Base64.decode(s1, 0);
                        j.e(arr_b1, "decode(...)");
                    }
                    catch(IllegalArgumentException unused_ex) {
                        Log.w("IABUtil/Security", "Base64 decoding failed.");
                        goto label_42;
                    }
                    try {
                        Signature signature0 = Signature.getInstance("SHA1withRSA");
                        signature0.initVerify(publicKey0);
                        byte[] arr_b2 = s.getBytes(Y3.a.a);
                        j.e(arr_b2, "getBytes(...)");
                        signature0.update(arr_b2);
                        if(signature0.verify(arr_b1)) {
                            goto label_39;
                        }
                        else {
                            Log.w("IABUtil/Security", "Signature verification failed...");
                            goto label_42;
                        }
                        goto label_41;
                    }
                    catch(NoSuchAlgorithmException noSuchAlgorithmException1) {
                        throw new RuntimeException(noSuchAlgorithmException1);
                    }
                    catch(InvalidKeyException unused_ex) {
                        Log.w("IABUtil/Security", "Invalid key specification.");
                        goto label_42;
                    }
                    catch(SignatureException unused_ex) {
                        Log.w("IABUtil/Security", "Signature exception.");
                        goto label_42;
                    }
                label_39:
                    hashSet0.add(purchase0);
                    continue;
                }
            label_42:
                this.d("billing_purchase_validation_failed", null);
            }
            else if(purchase0.c.optInt("purchaseState", 1) == 4) {
                this.d("billing_purchase_pending", null);
            }
        }
        for(Object object1: i.o0(hashSet0)) {
            Purchase purchase1 = (Purchase)object1;
            String s2 = purchase1.c.optString("purchaseToken");
            String s3 = purchase1.c.optString("token", s2);
            if(s3 == null) {
                throw new IllegalArgumentException("Purchase token must be set");
            }
            z z0 = new z(1);
            z0.b = s3;
            if(purchase1.c.optBoolean("acknowledged", true)) {
                new Handler(Looper.getMainLooper()).post(new q2.b(0, this, purchase1));
                return;
            }
            D1.b b0 = new D1.b(3, this, purchase1);
            this.d.a(z0, b0);
        }
    }

    public final void h() {
        D1.b b0 = new D1.b(2, new HashSet(), this);
        b b1 = this.d;
        b1.getClass();
        if(!b1.b()) {
            b1.u(2, 9, y.k);
            b0.f(y.k, zzco.zzl());
            return;
        }
        if(TextUtils.isEmpty("inapp")) {
            zze.zzl("BillingClient", "Please provide a valid product type.");
            b1.u(50, 9, y.f);
            b0.f(y.f, zzco.zzl());
            return;
        }
        if(b.f(new i1.y(2, b1, b0), 30000L, new B.a(26, b1, b0), b1.s(), b1.j()) == null) {
            m0.e e0 = b1.g();
            b1.u(25, 9, e0);
            b0.f(e0, zzco.zzl());
        }
    }
}

