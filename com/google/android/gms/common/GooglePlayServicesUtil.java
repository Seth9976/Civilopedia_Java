package com.google.android.gms.common;

import K0.b;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.content.res.Resources;
import androidx.fragment.app.h;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.HideFirstParty;
import com.google.android.gms.common.internal.zag;
import com.google.errorprone.annotations.InlineMe;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;

public final class GooglePlayServicesUtil extends GooglePlayServicesUtilLight {
    public static final String GMS_ERROR_DIALOG = "GooglePlayServicesErrorDialog";
    @Deprecated
    public static final String GOOGLE_PLAY_SERVICES_PACKAGE = "com.google.android.gms";
    @Deprecated
    public static final int GOOGLE_PLAY_SERVICES_VERSION_CODE = 0;
    public static final String GOOGLE_PLAY_STORE_PACKAGE = "com.android.vending";

    static {
        GooglePlayServicesUtil.GOOGLE_PLAY_SERVICES_VERSION_CODE = GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;
    }

    @Deprecated
    public static Dialog getErrorDialog(int v, Activity activity0, int v1) {
        return GooglePlayServicesUtil.getErrorDialog(v, activity0, v1, null);
    }

    @Deprecated
    public static Dialog getErrorDialog(int v, Activity activity0, int v1, DialogInterface.OnCancelListener dialogInterface$OnCancelListener0) {
        if(GooglePlayServicesUtilLight.isPlayServicesPossiblyUpdating(activity0, v)) {
            v = 18;
        }
        return GoogleApiAvailability.getInstance().getErrorDialog(activity0, v, v1, dialogInterface$OnCancelListener0);
    }

    @Override  // com.google.android.gms.common.GooglePlayServicesUtilLight
    @Deprecated
    public static PendingIntent getErrorPendingIntent(int v, Context context0, int v1) {
        return GoogleApiAvailabilityLight.getInstance().getErrorResolutionPendingIntent(context0, v, v1);
    }

    @Override  // com.google.android.gms.common.GooglePlayServicesUtilLight
    @Deprecated
    public static String getErrorString(int v) {
        return GooglePlayServicesUtilLight.getErrorString(v);
    }

    @Override  // com.google.android.gms.common.GooglePlayServicesUtilLight
    public static Context getRemoteContext(Context context0) {
        return GooglePlayServicesUtilLight.getRemoteContext(context0);
    }

    @Override  // com.google.android.gms.common.GooglePlayServicesUtilLight
    public static Resources getRemoteResource(Context context0) {
        return GooglePlayServicesUtilLight.getRemoteResource(context0);
    }

    @Override  // com.google.android.gms.common.GooglePlayServicesUtilLight
    @HideFirstParty
    @ResultIgnorabilityUnspecified
    @Deprecated
    public static int isGooglePlayServicesAvailable(Context context0) {
        return GooglePlayServicesUtilLight.isGooglePlayServicesAvailable(context0);
    }

    @Override  // com.google.android.gms.common.GooglePlayServicesUtilLight
    @KeepForSdk
    @Deprecated
    public static int isGooglePlayServicesAvailable(Context context0, int v) {
        return GooglePlayServicesUtilLight.isGooglePlayServicesAvailable(context0, v);
    }

    @Override  // com.google.android.gms.common.GooglePlayServicesUtilLight
    @Deprecated
    public static boolean isUserRecoverableError(int v) {
        return GooglePlayServicesUtilLight.isUserRecoverableError(v);
    }

    @ResultIgnorabilityUnspecified
    @Deprecated
    public static boolean showErrorDialogFragment(int v, Activity activity0, int v1) {
        return GooglePlayServicesUtil.showErrorDialogFragment(v, activity0, v1, null);
    }

    @InlineMe(imports = {"androidx.fragment.app.Fragment", "com.google.android.gms.common.GooglePlayServicesUtil"}, replacement = "GooglePlayServicesUtil.showErrorDialogFragment(errorCode, activity, (Fragment) null, requestCode, cancelListener)")
    @ResultIgnorabilityUnspecified
    @Deprecated
    public static boolean showErrorDialogFragment(int v, Activity activity0, int v1, DialogInterface.OnCancelListener dialogInterface$OnCancelListener0) {
        return GooglePlayServicesUtil.showErrorDialogFragment(v, activity0, null, v1, dialogInterface$OnCancelListener0);
    }

    @ResultIgnorabilityUnspecified
    public static boolean showErrorDialogFragment(int v, Activity activity0, h h0, int v1, DialogInterface.OnCancelListener dialogInterface$OnCancelListener0) {
        if(GooglePlayServicesUtilLight.isPlayServicesPossiblyUpdating(activity0, v)) {
            v = 18;
        }
        GoogleApiAvailability googleApiAvailability0 = GoogleApiAvailability.getInstance();
        if(h0 == null) {
            return googleApiAvailability0.showErrorDialogFragment(activity0, v, v1, dialogInterface$OnCancelListener0);
        }
        zag zag0 = zag.zac(h0, GoogleApiAvailability.getInstance().getErrorResolutionIntent(activity0, v, "d"), v1);
        googleApiAvailability0.getClass();
        AlertDialog alertDialog0 = GoogleApiAvailability.a(activity0, v, zag0, dialogInterface$OnCancelListener0, null);
        if(alertDialog0 == null) {
            return false;
        }
        GoogleApiAvailability.b(activity0, alertDialog0, "GooglePlayServicesErrorDialog", dialogInterface$OnCancelListener0);
        return true;
    }

    @Deprecated
    public static void showErrorNotification(int v, Context context0) {
        GoogleApiAvailability googleApiAvailability0 = GoogleApiAvailability.getInstance();
        if(!GooglePlayServicesUtilLight.isPlayServicesPossiblyUpdating(context0, v) && !GooglePlayServicesUtilLight.isPlayStorePossiblyUpdating(context0, v)) {
            googleApiAvailability0.showErrorNotification(context0, v);
            return;
        }
        googleApiAvailability0.getClass();
        new b(googleApiAvailability0, context0).sendEmptyMessageDelayed(1, 120000L);
    }
}

