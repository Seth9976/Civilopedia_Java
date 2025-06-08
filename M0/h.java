package m0;

import M1.f;
import android.text.TextUtils;
import i3.e;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
import t1.c;

public final class h {
    public final String a;
    public final JSONObject b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final ArrayList h;
    public final ArrayList i;

    public h(String s) {
        this.a = s;
        JSONObject jSONObject0 = new JSONObject(s);
        this.b = jSONObject0;
        String s1 = jSONObject0.optString("productId");
        this.c = s1;
        String s2 = jSONObject0.optString("type");
        this.d = s2;
        if(TextUtils.isEmpty(s1)) {
            throw new IllegalArgumentException("Product id cannot be empty.");
        }
        if(TextUtils.isEmpty(s2)) {
            throw new IllegalArgumentException("Product type cannot be empty.");
        }
        this.e = jSONObject0.optString("title");
        jSONObject0.optString("name");
        jSONObject0.optString("description");
        jSONObject0.optString("packageDisplayName");
        jSONObject0.optString("iconUrl");
        this.f = jSONObject0.optString("skuDetailsToken");
        this.g = jSONObject0.optString("serializedDocid");
        JSONArray jSONArray0 = jSONObject0.optJSONArray("subscriptionOfferDetails");
        if(jSONArray0 == null) {
            this.h = s2.equals("subs") || s2.equals("play_pass_subs") ? new ArrayList() : null;
        }
        else {
            ArrayList arrayList0 = new ArrayList();
            for(int v = 0; v < jSONArray0.length(); ++v) {
                JSONObject jSONObject1 = jSONArray0.getJSONObject(v);
                c c0 = new c(16);
                jSONObject1.optString("basePlanId");
                jSONObject1.optString("offerId").getClass();
                jSONObject1.getString("offerIdToken");
                JSONArray jSONArray1 = jSONObject1.getJSONArray("pricingPhases");
                ArrayList arrayList1 = new ArrayList();
                if(jSONArray1 != null) {
                    for(int v1 = 0; v1 < jSONArray1.length(); ++v1) {
                        JSONObject jSONObject2 = jSONArray1.optJSONObject(v1);
                        if(jSONObject2 != null) {
                            arrayList1.add(new f(jSONObject2));
                        }
                    }
                }
                JSONObject jSONObject3 = jSONObject1.optJSONObject("installmentPlanDetails");
                if(jSONObject3 != null) {
                    jSONObject3.getInt("commitmentPaymentsCount");
                    jSONObject3.optInt("subsequentCommitmentPaymentsCount");
                }
                JSONObject jSONObject4 = jSONObject1.optJSONObject("transitionPlanDetails");
                if(jSONObject4 != null) {
                    jSONObject4.getString("productId");
                    jSONObject4.optString("title");
                    jSONObject4.optString("name");
                    jSONObject4.optString("description");
                    jSONObject4.optString("basePlanId");
                    JSONObject jSONObject5 = jSONObject4.optJSONObject("pricingPhase");
                    if(jSONObject5 != null) {
                        jSONObject5.optString("billingPeriod");
                        jSONObject5.optString("priceCurrencyCode");
                        jSONObject5.optString("formattedPrice");
                        jSONObject5.optLong("priceAmountMicros");
                        jSONObject5.optInt("recurrenceMode");
                        jSONObject5.optInt("billingCycleCount");
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                JSONArray jSONArray2 = jSONObject1.optJSONArray("offerTags");
                if(jSONArray2 != null) {
                    for(int v2 = 0; v2 < jSONArray2.length(); ++v2) {
                        arrayList2.add(jSONArray2.getString(v2));
                    }
                }
                arrayList0.add(c0);
            }
            this.h = arrayList0;
        }
        JSONObject jSONObject6 = this.b.optJSONObject("oneTimePurchaseOfferDetails");
        JSONArray jSONArray3 = this.b.optJSONArray("oneTimePurchaseOfferDetailsList");
        ArrayList arrayList3 = new ArrayList();
        if(jSONArray3 != null) {
            for(int v3 = 0; v3 < jSONArray3.length(); ++v3) {
                arrayList3.add(new g(jSONArray3.getJSONObject(v3)));
            }
            this.i = arrayList3;
            return;
        }
        if(jSONObject6 != null) {
            arrayList3.add(new g(jSONObject6));
            this.i = arrayList3;
            return;
        }
        this.i = null;
    }

    public final g a() {
        return this.i == null || this.i.isEmpty() ? null : ((g)this.i.get(0));
    }

    public final String b() {
        return this.c;
    }

    public final String c() {
        return this.d;
    }

    public final String d() {
        return this.b.optString("packageName");
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof h ? TextUtils.equals(this.a, ((h)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("ProductDetails{jsonString=\'");
        A.f.t(stringBuilder0, this.a, "\', parsedJson=", this.b.toString(), ", productId=\'");
        stringBuilder0.append(this.c);
        stringBuilder0.append("\', productType=\'");
        stringBuilder0.append(this.d);
        stringBuilder0.append("\', title=\'");
        stringBuilder0.append(this.e);
        stringBuilder0.append("\', productDetailsToken=\'");
        return e.i(stringBuilder0, this.f, "\', subscriptionOfferDetails=", String.valueOf(this.h), "}");
    }
}

