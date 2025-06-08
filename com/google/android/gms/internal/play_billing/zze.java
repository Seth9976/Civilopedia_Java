package com.google.android.gms.internal.play_billing;

import B1.b;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.android.billingclient.api.Purchase;
import java.util.ArrayList;
import java.util.List;
import m0.e;
import m0.f;
import org.json.JSONException;

public final class zze {
    public static final int zza;

    static {
        zze.zza = Runtime.getRuntime().availableProcessors();
    }

    public static Purchase a(String s, String s1) {
        if(s != null && s1 != null) {
            try {
                return new Purchase(s, s1);
            }
            catch(JSONException jSONException0) {
                zze.zzl("BillingHelper", "Got JSONException while parsing purchase data: " + jSONException0.toString());
                return null;
            }
        }
        zze.zzk("BillingHelper", "Received a null purchase data.");
        return null;
    }

    public static int zza(Intent intent0, String s) {
        if(intent0 == null) {
            zze.zzl("ProxyBillingActivity", "Got null intent!");
            return 0;
        }
        Bundle bundle0 = intent0.getExtras();
        if(bundle0 == null) {
            zze.zzl("ProxyBillingActivity", "Unexpected null bundle received!");
            return 0;
        }
        return bundle0.getInt("IN_APP_MESSAGE_RESPONSE_CODE", 0);
    }

    public static int zzb(Bundle bundle0, String s) {
        if(bundle0 == null) {
            zze.zzl(s, "Unexpected null bundle received!");
            return 6;
        }
        Object object0 = bundle0.get("RESPONSE_CODE");
        if(object0 == null) {
            zze.zzk(s, "getResponseCodeFromBundle() got null response code, assuming OK");
            return 0;
        }
        if(object0 instanceof Integer) {
            return (int)(((Integer)object0));
        }
        zze.zzl(s, "Unexpected type for bundle response code: " + object0.getClass().getName());
        return 6;
    }

    public static Bundle zzc(Bundle bundle0, String s, long v) {
        bundle0.putString("playBillingLibraryVersion", s);
        bundle0.putLong("billingClientSessionId", v);
        return bundle0;
    }

    public static Bundle zzd(boolean z, boolean z1, boolean z2, boolean z3, String s, long v) {
        Bundle bundle0 = new Bundle();
        zze.zzc(bundle0, s, v);
        if(z && z2) {
            bundle0.putBoolean("enablePendingPurchases", true);
        }
        if(z1 && z3) {
            bundle0.putBoolean("enablePendingPurchaseForSubscriptions", true);
        }
        return bundle0;
    }

    public static Bundle zze(String s, long v) {
        Bundle bundle0 = new Bundle();
        zze.zzc(bundle0, s, v);
        return bundle0;
    }

    public static e zzf(Intent intent0, String s) {
        if(intent0 == null) {
            zze.zzl("BillingHelper", "Got null intent!");
            b b0 = e.a();
            b0.a = 6;
            b0.b = "An internal error occurred.";
            return b0.a();
        }
        b b1 = e.a();
        b1.a = zze.zzb(intent0.getExtras(), s);
        b1.b = zze.zzh(intent0.getExtras(), s);
        return b1.a();
    }

    public static f zzg(Bundle bundle0, String s) {
        if(bundle0 == null) {
            return new f();  // 初始化器: Ljava/lang/Object;-><init>()V
        }
        bundle0.getInt("IN_APP_MESSAGE_RESPONSE_CODE", 0);
        bundle0.getString("IN_APP_MESSAGE_PURCHASE_TOKEN");
        return new f();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    public static String zzh(Bundle bundle0, String s) {
        if(bundle0 == null) {
            zze.zzl(s, "Unexpected null bundle received!");
            return "";
        }
        Object object0 = bundle0.get("DEBUG_MESSAGE");
        if(object0 == null) {
            zze.zzk(s, "getDebugMessageFromBundle() got null response code, assuming OK");
            return "";
        }
        if(object0 instanceof String) {
            return (String)object0;
        }
        zze.zzl(s, "Unexpected type for debug message: " + object0.getClass().getName());
        return "";
    }

    public static String zzi(int v) {
        Integer integer0 = v;
        return n.k.containsKey(integer0) ? ((n)n.k.get(integer0)).toString() : "RESPONSE_CODE_UNSPECIFIED";
    }

    public static List zzj(Bundle bundle0) {
        ArrayList arrayList0 = bundle0.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
        ArrayList arrayList1 = bundle0.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
        List list0 = new ArrayList();
        if(arrayList0 != null && arrayList1 != null) {
            zze.zzk("BillingHelper", "Found purchase list of " + arrayList0.size() + " items");
            for(int v = 0; v < arrayList0.size() && v < arrayList1.size(); ++v) {
                Purchase purchase0 = zze.a(((String)arrayList0.get(v)), ((String)arrayList1.get(v)));
                if(purchase0 != null) {
                    ((ArrayList)list0).add(purchase0);
                }
            }
            return list0;
        }
        Purchase purchase1 = zze.a(bundle0.getString("INAPP_PURCHASE_DATA"), bundle0.getString("INAPP_DATA_SIGNATURE"));
        if(purchase1 == null) {
            zze.zzk("BillingHelper", "Couldn\'t find single purchase data as well.");
            return null;
        }
        ((ArrayList)list0).add(purchase1);
        return list0;
    }

    public static void zzk(String s, String s1) {
        if(Log.isLoggable(s, 2)) {
            if(!s1.isEmpty()) {
                for(int v = 40000; !s1.isEmpty() && v > 0; v -= v1) {
                    int v1 = Math.min(s1.length(), Math.min(4000, v));
                    Log.v(s, s1.substring(0, v1));
                    s1 = s1.substring(v1);
                }
                return;
            }
            Log.v(s, s1);
        }
    }

    public static void zzl(String s, String s1) {
        if(Log.isLoggable(s, 5)) {
            Log.w(s, s1);
        }
    }

    public static void zzm(String s, String s1, Throwable throwable0) {
        try {
            if(!Log.isLoggable(s, 5)) {
                return;
            }
            if(throwable0 == null) {
                Log.w(s, s1);
                return;
            }
            Log.w(s, s1, throwable0);
        }
        catch(Throwable unused_ex) {
        }
    }

    public static Bundle zzn(e e0, int v) {
        Bundle bundle0 = new Bundle();
        bundle0.putInt("RESPONSE_CODE", e0.a);
        bundle0.putString("DEBUG_MESSAGE", e0.b);
        bundle0.putInt("LOG_REASON", v - 1);
        return bundle0;
    }

    public static Bundle zzo(e e0, int v, String s) {
        Bundle bundle0 = zze.zzn(e0, 5);
        if(s != null) {
            bundle0.putString("ADDITIONAL_LOG_DETAILS", s);
        }
        return bundle0;
    }
}

