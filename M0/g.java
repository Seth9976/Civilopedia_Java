package m0;

import M1.f;
import com.google.android.gms.internal.play_billing.zzco;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

public final class g {
    public final String a;
    public final String b;
    public final f c;

    public g(JSONObject jSONObject0) {
        jSONObject0.optString("formattedPrice");
        jSONObject0.optLong("priceAmountMicros");
        jSONObject0.optString("priceCurrencyCode");
        String s = jSONObject0.optString("offerIdToken");
        f f0 = null;
        if(s.isEmpty()) {
            s = null;
        }
        this.a = s;
        jSONObject0.optString("offerId").getClass();
        jSONObject0.optString("purchaseOptionId").getClass();
        jSONObject0.optInt("offerType");
        JSONArray jSONArray0 = jSONObject0.optJSONArray("offerTags");
        ArrayList arrayList0 = new ArrayList();
        if(jSONArray0 != null) {
            for(int v1 = 0; v1 < jSONArray0.length(); ++v1) {
                arrayList0.add(jSONArray0.getString(v1));
            }
        }
        zzco.zzk(arrayList0);
        if(jSONObject0.has("fullPriceMicros")) {
            jSONObject0.optLong("fullPriceMicros");
        }
        JSONObject jSONObject1 = jSONObject0.optJSONObject("discountDisplayInfo");
        if(jSONObject1 != null) {
            jSONObject1.getInt("percentageDiscount");
        }
        JSONObject jSONObject2 = jSONObject0.optJSONObject("validTimeWindow");
        if(jSONObject2 != null) {
            jSONObject2.getLong("startTimeMillis");
            jSONObject2.getLong("endTimeMillis");
        }
        JSONObject jSONObject3 = jSONObject0.optJSONObject("limitedQuantityInfo");
        if(jSONObject3 != null) {
            jSONObject3.getInt("maximumQuantity");
            jSONObject3.getInt("remainingQuantity");
        }
        this.b = jSONObject0.optString("serializedDocid");
        JSONObject jSONObject4 = jSONObject0.optJSONObject("preorderDetails");
        if(jSONObject4 != null) {
            jSONObject4.getLong("preorderReleaseTimeMillis");
            jSONObject4.getLong("preorderPresaleEndTimeMillis");
        }
        JSONObject jSONObject5 = jSONObject0.optJSONObject("rentalDetails");
        if(jSONObject5 != null) {
            jSONObject5.getString("rentalPeriod");
            jSONObject5.optString("rentalExpirationPeriod").getClass();
        }
        JSONObject jSONObject6 = jSONObject0.optJSONObject("autoPayDetails");
        if(jSONObject6 != null) {
            f0 = new f(17);
            jSONObject6.getString("type");
            JSONArray jSONArray1 = jSONObject6.optJSONArray("balanceThresholds");
            ArrayList arrayList1 = new ArrayList();
            if(jSONArray1 != null) {
                for(int v2 = 0; v2 < jSONArray1.length(); ++v2) {
                    arrayList1.add(jSONArray1.getInt(v2));
                }
            }
            JSONArray jSONArray2 = jSONObject6.getJSONArray("pricingPhases");
            ArrayList arrayList2 = new ArrayList();
            if(jSONArray2 != null) {
                for(int v = 0; v < jSONArray2.length(); ++v) {
                    JSONObject jSONObject7 = jSONArray2.optJSONObject(v);
                    if(jSONObject7 != null) {
                        arrayList2.add(new f(jSONObject7));
                    }
                }
            }
        }
        this.c = f0;
    }
}

