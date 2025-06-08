package com.google.android.gms.common.internal;

import A.e;
import A.g;
import A.i;
import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.R.string;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.wrappers.Wrappers;
import java.util.Locale;
import p.k;

public final class zac {
    public static final k a;
    public static Locale b;

    static {
        zac.a = new k();
    }

    public static String a(Context context0, String s, String s1) {
        Resources resources0 = context0.getResources();
        String s2 = zac.b(context0, s);
        if(s2 == null) {
            s2 = resources0.getString(string.common_google_play_services_unknown_issue);
        }
        return String.format(resources0.getConfiguration().locale, s2, s1);
    }

    public static String b(Context context0, String s) {
        k k0 = zac.a;
        synchronized(k0) {
            Configuration configuration0 = context0.getResources().getConfiguration();
            Locale locale0 = (Build.VERSION.SDK_INT < 24 ? new e(new g(new Locale[]{configuration0.locale})) : new e(new i(configuration0.getLocales()))).a.get();
            if(!locale0.equals(zac.b)) {
                k0.clear();
                zac.b = locale0;
            }
            String s1 = (String)k0.getOrDefault(s, null);
            if(s1 != null) {
                return s1;
            }
            Resources resources0 = GooglePlayServicesUtil.getRemoteResource(context0);
            if(resources0 == null) {
                return null;
            }
            int v1 = resources0.getIdentifier(s, "string", "com.google.android.gms");
            if(v1 == 0) {
                Log.w("GoogleApiAvailability", "Missing resource: " + s);
                return null;
            }
            String s2 = resources0.getString(v1);
            if(TextUtils.isEmpty(s2)) {
                Log.w("GoogleApiAvailability", "Got empty resource: " + s);
                return null;
            }
            k0.put(s, s2);
            return s2;
        }
    }

    public static String zaa(Context context0) {
        try {
            return Wrappers.packageManager(context0).getApplicationLabel("com.spears.civilopedia").toString();
        }
        catch(PackageManager.NameNotFoundException | NullPointerException unused_ex) {
            String s = context0.getApplicationInfo().name;
            return TextUtils.isEmpty(s) ? "com.spears.civilopedia" : s;
        }
    }

    public static String zab(Context context0, int v) {
        Resources resources0 = context0.getResources();
        switch(v) {
            case 1: {
                return resources0.getString(com.google.android.gms.base.R.string.common_google_play_services_install_button);
            }
            case 2: {
                return resources0.getString(com.google.android.gms.base.R.string.common_google_play_services_update_button);
            }
            case 3: {
                return resources0.getString(com.google.android.gms.base.R.string.common_google_play_services_enable_button);
            }
            default: {
                return resources0.getString(0x104000A);
            }
        }
    }

    public static String zac(Context context0, int v) {
        Resources resources0 = context0.getResources();
        String s = zac.zaa(context0);
        switch(v) {
            case 1: {
                return resources0.getString(com.google.android.gms.base.R.string.common_google_play_services_install_text, new Object[]{s});
            }
            case 2: {
                return DeviceProperties.isWearableWithoutPlayStore(context0) ? resources0.getString(com.google.android.gms.base.R.string.common_google_play_services_wear_update_text) : resources0.getString(com.google.android.gms.base.R.string.common_google_play_services_update_text, new Object[]{s});
            }
            case 3: {
                return resources0.getString(com.google.android.gms.base.R.string.common_google_play_services_enable_text, new Object[]{s});
            }
            case 5: {
                return zac.a(context0, "common_google_play_services_invalid_account_text", s);
            }
            case 7: {
                return zac.a(context0, "common_google_play_services_network_error_text", s);
            }
            case 9: {
                return resources0.getString(com.google.android.gms.base.R.string.common_google_play_services_unsupported_text, new Object[]{s});
            }
            case 16: {
                return zac.a(context0, "common_google_play_services_api_unavailable_text", s);
            }
            case 17: {
                return zac.a(context0, "common_google_play_services_sign_in_failed_text", s);
            }
            case 18: {
                return resources0.getString(com.google.android.gms.base.R.string.common_google_play_services_updating_text, new Object[]{s});
            }
            case 20: {
                return zac.a(context0, "common_google_play_services_restricted_profile_text", s);
            }
            default: {
                return resources0.getString(string.common_google_play_services_unknown_issue, new Object[]{s});
            }
        }
    }

    public static String zad(Context context0, int v) {
        return v == 6 || v == 19 ? zac.a(context0, "common_google_play_services_resolution_required_text", zac.zaa(context0)) : zac.zac(context0, v);
    }

    public static String zae(Context context0, int v) {
        String s = v == 6 ? zac.b(context0, "common_google_play_services_resolution_required_title") : zac.zaf(context0, v);
        return s == null ? context0.getResources().getString(com.google.android.gms.base.R.string.common_google_play_services_notification_ticker) : s;
    }

    public static String zaf(Context context0, int v) {
        Resources resources0 = context0.getResources();
        switch(v) {
            case 1: {
                return resources0.getString(com.google.android.gms.base.R.string.common_google_play_services_install_title);
            }
            case 2: {
                return resources0.getString(com.google.android.gms.base.R.string.common_google_play_services_update_title);
            }
            case 3: {
                return resources0.getString(com.google.android.gms.base.R.string.common_google_play_services_enable_title);
            }
            case 5: {
                Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
                return zac.b(context0, "common_google_play_services_invalid_account_title");
            }
            case 7: {
                Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                return zac.b(context0, "common_google_play_services_network_error_title");
            }
            case 8: {
                Log.e("GoogleApiAvailability", "Internal error occurred. Please see logs for detailed information");
                return null;
            }
            case 9: {
                Log.e("GoogleApiAvailability", "Google Play services is invalid. Cannot recover.");
                return null;
            }
            case 10: {
                Log.e("GoogleApiAvailability", "Developer error occurred. Please see logs for detailed information");
                return null;
            }
            case 11: {
                Log.e("GoogleApiAvailability", "The application is not licensed to the user.");
                return null;
            }
            case 16: {
                Log.e("GoogleApiAvailability", "One of the API components you attempted to connect to is not available.");
                return null;
            }
            case 17: {
                Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
                return zac.b(context0, "common_google_play_services_sign_in_failed_title");
            }
            case 4: 
            case 6: 
            case 18: {
                return null;
            }
            case 20: {
                Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
                return zac.b(context0, "common_google_play_services_restricted_profile_title");
            }
            default: {
                Log.e("GoogleApiAvailability", "Unexpected error code " + v);
                return null;
            }
        }
    }
}

