package com.google.android.gms.ads.internal.client;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.ads.zzbtt;
import com.google.android.gms.internal.ads.zzcfi;

public final class zzee extends ContentProvider {
    @Override  // android.content.ContentProvider
    public final void attachInfo(Context context0, ProviderInfo providerInfo0) {
        String s1;
        String s;
        Bundle bundle0 = null;
        try {
            bundle0 = Wrappers.packageManager(context0).getApplicationInfo("com.spears.civilopedia", 0x80).metaData;
        }
        catch(NullPointerException nullPointerException0) {
            zzcfi.zzh("Failed to load metadata: Null pointer exception.", nullPointerException0);
        }
        catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException0) {
            zzcfi.zzh("Failed to load metadata: Package name not found.", packageManager$NameNotFoundException0);
        }
        zzbtt zzbtt0 = zzbtt.zza();
        if(bundle0 == null) {
            zzcfi.zzg("Metadata was null.");
        }
        else {
            try {
                s = (String)bundle0.get("com.google.android.gms.ads.APPLICATION_ID");
            }
            catch(ClassCastException classCastException0) {
                throw new IllegalStateException("The com.google.android.gms.ads.APPLICATION_ID metadata must have a String value.", classCastException0);
            }
            try {
                Boolean boolean0 = (Boolean)bundle0.get("com.google.android.gms.ads.AD_MANAGER_APP");
            }
            catch(ClassCastException classCastException1) {
                throw new IllegalStateException("The com.google.android.gms.ads.AD_MANAGER_APP metadata must have a boolean value.", classCastException1);
            }
            try {
                Boolean boolean1 = (Boolean)bundle0.get("com.google.android.gms.ads.DELAY_APP_MEASUREMENT_INIT");
            }
            catch(ClassCastException classCastException2) {
                throw new IllegalStateException("The com.google.android.gms.ads.DELAY_APP_MEASUREMENT_INIT metadata must have a boolean value.", classCastException2);
            }
            try {
                s1 = (String)bundle0.get("com.google.android.gms.ads.INTEGRATION_MANAGER");
            }
            catch(ClassCastException classCastException3) {
                throw new IllegalStateException("The com.google.android.gms.ads.INTEGRATION_MANAGER metadata must have a String value.", classCastException3);
            }
            if(s != null && !s.matches("^/\\d+~.+$")) {
                if(!s.matches("^ca-app-pub-[0-9]{16}~[0-9]{10}$")) {
                    throw new IllegalStateException("\n\n******************************************************************************\n* Invalid application ID. Follow instructions here:                          *\n* https://googlemobileadssdk.page.link/admob-android-update-manifest         *\n* to find your app ID.                                                       *\n******************************************************************************\n\n");
                }
                zzcfi.zze(("Publisher provided Google AdMob App ID in manifest: " + s));
                if(boolean1 == null || !boolean1.booleanValue()) {
                    zzbtt0.zzb(context0, s);
                }
            }
            else if(boolean0 == null || !boolean0.booleanValue()) {
                if(TextUtils.isEmpty(s1)) {
                    throw new IllegalStateException("\n\n******************************************************************************\n* The Google Mobile Ads SDK was initialized incorrectly. AdMob publishers    *\n* should follow the instructions here:                                       *\n* https://googlemobileadssdk.page.link/admob-android-update-manifest         *\n* to add a valid App ID inside the AndroidManifest.                          *\n* Google Ad Manager publishers should follow instructions here:              *\n* https://googlemobileadssdk.page.link/ad-manager-android-update-manifest.   *\n******************************************************************************\n\n");
                }
                zzcfi.zze(("The Google Mobile Ads SDK is integrated by " + s1));
            }
        }
        super.attachInfo(context0, providerInfo0);
    }

    @Override  // android.content.ContentProvider
    public final int delete(Uri uri0, String s, String[] arr_s) {
        return 0;
    }

    @Override  // android.content.ContentProvider
    public final String getType(Uri uri0) {
        return null;
    }

    @Override  // android.content.ContentProvider
    public final Uri insert(Uri uri0, ContentValues contentValues0) {
        return null;
    }

    @Override  // android.content.ContentProvider
    public final boolean onCreate() {
        return false;
    }

    @Override  // android.content.ContentProvider
    public final Cursor query(Uri uri0, String[] arr_s, String s, String[] arr_s1, String s1) {
        return null;
    }

    @Override  // android.content.ContentProvider
    public final int update(Uri uri0, ContentValues contentValues0, String s, String[] arr_s) {
        return 0;
    }
}

