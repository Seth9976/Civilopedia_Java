package com.google.android.gms.common;

import A.f;
import K0.a;
import K0.b;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.FragmentManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.util.Log;
import android.util.TypedValue;
import android.widget.ProgressBar;
import androidx.fragment.app.j;
import androidx.fragment.app.v;
import com.google.android.gms.base.R.drawable;
import com.google.android.gms.base.R.string;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.HasApiKey;
import com.google.android.gms.common.api.internal.GoogleApiManager;
import com.google.android.gms.common.api.internal.LifecycleFragment;
import com.google.android.gms.common.api.internal.zabw;
import com.google.android.gms.common.api.internal.zabx;
import com.google.android.gms.common.api.internal.zacc;
import com.google.android.gms.common.internal.HideFirstParty;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.zac;
import com.google.android.gms.common.internal.zag;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.wrappers.InstantApps;
import com.google.android.gms.internal.base.zad;
import com.google.android.gms.internal.base.zae;
import com.google.android.gms.internal.base.zao;
import com.google.android.gms.internal.base.zap;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.errorprone.annotations.RestrictedInheritance;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import g1.n;
import java.util.ArrayList;
import java.util.Arrays;
import u.g;
import u.h;

@RestrictedInheritance(allowedOnPath = ".*java.*/com/google/android/gms.*", allowlistAnnotations = {zad.class, zae.class}, explanation = "Sub classing of GMS Core\'s APIs are restricted to GMS Core client libs and testing fakes.", link = "go/gmscore-restrictedinheritance")
public class GoogleApiAvailability extends GoogleApiAvailabilityLight {
    public static final String GOOGLE_PLAY_SERVICES_PACKAGE = "com.google.android.gms";
    public static final int GOOGLE_PLAY_SERVICES_VERSION_CODE;
    public String b;
    public static final Object c;
    public static final GoogleApiAvailability d;

    static {
        GoogleApiAvailability.c = new Object();
        GoogleApiAvailability.d = new GoogleApiAvailability();
        GoogleApiAvailability.GOOGLE_PLAY_SERVICES_VERSION_CODE = GoogleApiAvailabilityLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;
    }

    public static AlertDialog a(Context context0, int v, zag zag0, DialogInterface.OnCancelListener dialogInterface$OnCancelListener0, a a0) {
        AlertDialog.Builder alertDialog$Builder0 = null;
        if(v == 0) {
            return null;
        }
        TypedValue typedValue0 = new TypedValue();
        context0.getTheme().resolveAttribute(0x1010309, typedValue0, true);
        if("Theme.Dialog.Alert".equals(context0.getResources().getResourceEntryName(typedValue0.resourceId))) {
            alertDialog$Builder0 = new AlertDialog.Builder(context0, 5);
        }
        if(alertDialog$Builder0 == null) {
            alertDialog$Builder0 = new AlertDialog.Builder(context0);
        }
        alertDialog$Builder0.setMessage(zac.zac(context0, v));
        if(dialogInterface$OnCancelListener0 != null) {
            alertDialog$Builder0.setOnCancelListener(dialogInterface$OnCancelListener0);
        }
        String s = zac.zab(context0, v);
        if(s != null) {
            if(zag0 == null) {
                zag0 = a0;
            }
            alertDialog$Builder0.setPositiveButton(s, zag0);
        }
        String s1 = zac.zaf(context0, v);
        if(s1 != null) {
            alertDialog$Builder0.setTitle(s1);
        }
        Log.w("GoogleApiAvailability", "Creating dialog for Google Play services availability issue. ConnectionResult=" + v, new IllegalArgumentException());
        return alertDialog$Builder0.create();
    }

    public static void b(Activity activity0, Dialog dialog0, String s, DialogInterface.OnCancelListener dialogInterface$OnCancelListener0) {
        if(activity0 instanceof j) {
            v v0 = ((j)activity0).g();
            SupportErrorDialogFragment.newInstance(dialog0, dialogInterface$OnCancelListener0).show(v0, s);
            return;
        }
        FragmentManager fragmentManager0 = activity0.getFragmentManager();
        ErrorDialogFragment.newInstance(dialog0, dialogInterface$OnCancelListener0).show(fragmentManager0, s);
    }

    public final void c(Context context0, int v, PendingIntent pendingIntent0) {
        String s2;
        int v1;
        Log.w("GoogleApiAvailability", f.e(v, "GMS core API Availability. ConnectionResult=", ", tag=null"), new IllegalArgumentException());
        if(v == 18) {
            new b(this, context0).sendEmptyMessageDelayed(1, 120000L);
            return;
        }
        if(pendingIntent0 == null) {
            if(v == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
            }
            return;
        }
        String s = zac.zae(context0, v);
        String s1 = zac.zad(context0, v);
        Resources resources0 = context0.getResources();
        NotificationManager notificationManager0 = (NotificationManager)Preconditions.checkNotNull(context0.getSystemService("notification"));
        h h0 = new h(context0, null);
        h0.k = true;
        h0.o.flags |= 16;
        h0.e = h.b(s);
        n n0 = new n(26);
        n0.k = h.b(s1);
        if(h0.j != n0) {
            h0.j = n0;
            n0.p(h0);
        }
        if(DeviceProperties.isWearable(context0)) {
            Preconditions.checkState(true);
            h0.o.icon = context0.getApplicationInfo().icon;
            h0.h = 2;
            if(DeviceProperties.isWearableWithoutPlayStore(context0)) {
                g g0 = new g(drawable.common_full_open_on_phone, resources0.getString(string.common_open_on_phone), pendingIntent0);
                h0.b.add(g0);
            }
            else {
                h0.g = pendingIntent0;
            }
        }
        else {
            h0.o.icon = 0x108008A;
            h0.o.tickerText = h.b(resources0.getString(string.common_google_play_services_notification_ticker));
            h0.o.when = System.currentTimeMillis();
            h0.g = pendingIntent0;
            h0.f = h.b(s1);
        }
        Preconditions.checkState(true);
        synchronized(GoogleApiAvailability.c) {
            s2 = this.b;
        }
        if(s2 == null) {
            s2 = "com.google.android.gms.availability";
            NotificationChannel notificationChannel0 = C.b.d(notificationManager0);
            String s3 = context0.getResources().getString(string.common_google_play_services_notification_channel_name);
            if(notificationChannel0 == null) {
                notificationManager0.createNotificationChannel(C.b.f(s3));
            }
            else if(!s3.contentEquals(notificationChannel0.getName())) {
                notificationChannel0.setName(s3);
                notificationManager0.createNotificationChannel(notificationChannel0);
            }
        }
        h0.m = s2;
        Notification notification0 = h0.a();
        if(v == 1 || v == 2 || v == 3) {
            GooglePlayServicesUtilLight.a.set(false);
            v1 = 10436;
        }
        else {
            v1 = 0x9B6D;
        }
        notificationManager0.notify(v1, notification0);
    }

    public Task checkApiAvailability(GoogleApi googleApi0, GoogleApi[] arr_googleApi) {
        return GoogleApiAvailability.zai(googleApi0, arr_googleApi).onSuccessTask(zab.zaa);
    }

    public Task checkApiAvailability(HasApiKey hasApiKey0, HasApiKey[] arr_hasApiKey) {
        return GoogleApiAvailability.zai(hasApiKey0, arr_hasApiKey).onSuccessTask(zaa.zaa);
    }

    @Override  // com.google.android.gms.common.GoogleApiAvailabilityLight
    @KeepForSdk
    @ShowFirstParty
    public int getClientVersion(Context context0) {
        return super.getClientVersion(context0);
    }

    public Dialog getErrorDialog(Activity activity0, int v, int v1) {
        return this.getErrorDialog(activity0, v, v1, null);
    }

    public Dialog getErrorDialog(Activity activity0, int v, int v1, DialogInterface.OnCancelListener dialogInterface$OnCancelListener0) {
        return GoogleApiAvailability.a(activity0, v, zag.zab(activity0, this.getErrorResolutionIntent(activity0, v, "d"), v1), dialogInterface$OnCancelListener0, null);
    }

    public Dialog getErrorDialog(androidx.fragment.app.h h0, int v, int v1) {
        return this.getErrorDialog(h0, v, v1, null);
    }

    public Dialog getErrorDialog(androidx.fragment.app.h h0, int v, int v1, DialogInterface.OnCancelListener dialogInterface$OnCancelListener0) {
        Intent intent0 = this.getErrorResolutionIntent(h0.requireContext(), v, "d");
        return GoogleApiAvailability.a(h0.requireContext(), v, zag.zac(h0, intent0, v1), dialogInterface$OnCancelListener0, null);
    }

    @Override  // com.google.android.gms.common.GoogleApiAvailabilityLight
    @KeepForSdk
    @ShowFirstParty
    public Intent getErrorResolutionIntent(Context context0, int v, String s) {
        return super.getErrorResolutionIntent(context0, v, s);
    }

    @Override  // com.google.android.gms.common.GoogleApiAvailabilityLight
    public PendingIntent getErrorResolutionPendingIntent(Context context0, int v, int v1) {
        return super.getErrorResolutionPendingIntent(context0, v, v1);
    }

    // 去混淆评级： 低(20)
    public PendingIntent getErrorResolutionPendingIntent(Context context0, ConnectionResult connectionResult0) {
        return connectionResult0.hasResolution() ? connectionResult0.getResolution() : this.getErrorResolutionPendingIntent(context0, connectionResult0.getErrorCode(), 0);
    }

    @Override  // com.google.android.gms.common.GoogleApiAvailabilityLight
    public final String getErrorString(int v) {
        return super.getErrorString(v);
    }

    public static GoogleApiAvailability getInstance() {
        return GoogleApiAvailability.d;
    }

    @Override  // com.google.android.gms.common.GoogleApiAvailabilityLight
    @HideFirstParty
    @ResultIgnorabilityUnspecified
    public int isGooglePlayServicesAvailable(Context context0) {
        return super.isGooglePlayServicesAvailable(context0);
    }

    @Override  // com.google.android.gms.common.GoogleApiAvailabilityLight
    @KeepForSdk
    @ShowFirstParty
    public int isGooglePlayServicesAvailable(Context context0, int v) {
        return super.isGooglePlayServicesAvailable(context0, v);
    }

    @Override  // com.google.android.gms.common.GoogleApiAvailabilityLight
    public final boolean isUserResolvableError(int v) {
        return super.isUserResolvableError(v);
    }

    public Task makeGooglePlayServicesAvailable(Activity activity0) {
        Preconditions.checkMainThread("makeGooglePlayServicesAvailable must be called from the main thread");
        int v = this.isGooglePlayServicesAvailable(activity0, GoogleApiAvailability.GOOGLE_PLAY_SERVICES_VERSION_CODE);
        if(v == 0) {
            return Tasks.forResult(null);
        }
        zacc zacc0 = zacc.zaa(activity0);
        zacc0.zah(new ConnectionResult(v, null), 0);
        return zacc0.zad();
    }

    @TargetApi(26)
    public void setDefaultNotificationChannelId(Context context0, String s) {
        Preconditions.checkNotNull(((NotificationManager)Preconditions.checkNotNull(context0.getSystemService("notification"))).getNotificationChannel(s));
        synchronized(GoogleApiAvailability.c) {
            this.b = s;
        }
    }

    @ResultIgnorabilityUnspecified
    public boolean showErrorDialogFragment(Activity activity0, int v, int v1) {
        return this.showErrorDialogFragment(activity0, v, v1, null);
    }

    @ResultIgnorabilityUnspecified
    public boolean showErrorDialogFragment(Activity activity0, int v, int v1, DialogInterface.OnCancelListener dialogInterface$OnCancelListener0) {
        Dialog dialog0 = this.getErrorDialog(activity0, v, v1, dialogInterface$OnCancelListener0);
        if(dialog0 == null) {
            return false;
        }
        GoogleApiAvailability.b(activity0, dialog0, "GooglePlayServicesErrorDialog", dialogInterface$OnCancelListener0);
        return true;
    }

    public boolean showErrorDialogFragment(Activity activity0, int v, androidx.activity.result.b b0, DialogInterface.OnCancelListener dialogInterface$OnCancelListener0) {
        AlertDialog alertDialog0 = GoogleApiAvailability.a(activity0, v, null, dialogInterface$OnCancelListener0, new a(this, activity0, v, b0));
        if(alertDialog0 == null) {
            return false;
        }
        GoogleApiAvailability.b(activity0, alertDialog0, "GooglePlayServicesErrorDialog", dialogInterface$OnCancelListener0);
        return true;
    }

    public void showErrorNotification(Context context0, int v) {
        this.c(context0, v, this.getErrorResolutionPendingIntent(context0, v, 0, "n"));
    }

    public void showErrorNotification(Context context0, ConnectionResult connectionResult0) {
        this.c(context0, connectionResult0.getErrorCode(), this.getErrorResolutionPendingIntent(context0, connectionResult0));
    }

    public final Dialog zab(Activity activity0, DialogInterface.OnCancelListener dialogInterface$OnCancelListener0) {
        ProgressBar progressBar0 = new ProgressBar(activity0, null, 0x101007A);
        progressBar0.setIndeterminate(true);
        progressBar0.setVisibility(0);
        AlertDialog.Builder alertDialog$Builder0 = new AlertDialog.Builder(activity0);
        alertDialog$Builder0.setView(progressBar0);
        alertDialog$Builder0.setMessage(zac.zac(activity0, 18));
        alertDialog$Builder0.setPositiveButton("", null);
        Dialog dialog0 = alertDialog$Builder0.create();
        GoogleApiAvailability.b(activity0, dialog0, "GooglePlayServicesUpdatingDialog", dialogInterface$OnCancelListener0);
        return dialog0;
    }

    @ResultIgnorabilityUnspecified
    public final zabx zac(Context context0, zabw zabw0) {
        IntentFilter intentFilter0 = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter0.addDataScheme("package");
        zabx zabx0 = new zabx(zabw0);
        zao.zaa(context0, zabx0, intentFilter0);
        zabx0.zaa(context0);
        if(!this.isUninstalledAppPossiblyUpdating(context0, "com.google.android.gms")) {
            zabw0.zaa();
            zabx0.zab();
            return null;
        }
        return zabx0;
    }

    @ResultIgnorabilityUnspecified
    public final boolean zag(Activity activity0, LifecycleFragment lifecycleFragment0, int v, int v1, DialogInterface.OnCancelListener dialogInterface$OnCancelListener0) {
        AlertDialog alertDialog0 = GoogleApiAvailability.a(activity0, v, zag.zad(lifecycleFragment0, this.getErrorResolutionIntent(activity0, v, "d"), 2), dialogInterface$OnCancelListener0, null);
        if(alertDialog0 == null) {
            return false;
        }
        GoogleApiAvailability.b(activity0, alertDialog0, "GooglePlayServicesErrorDialog", dialogInterface$OnCancelListener0);
        return true;
    }

    public final boolean zah(Context context0, ConnectionResult connectionResult0, int v) {
        if(!InstantApps.isInstantApp(context0)) {
            PendingIntent pendingIntent0 = this.getErrorResolutionPendingIntent(context0, connectionResult0);
            if(pendingIntent0 != null) {
                this.c(context0, connectionResult0.getErrorCode(), PendingIntent.getActivity(context0, 0, GoogleApiActivity.zaa(context0, pendingIntent0, v, true), zap.zaa | 0x8000000));
                return true;
            }
        }
        return false;
    }

    public static final Task zai(HasApiKey hasApiKey0, HasApiKey[] arr_hasApiKey) {
        Preconditions.checkNotNull(hasApiKey0, "Requested API must not be null.");
        for(int v = 0; v < arr_hasApiKey.length; ++v) {
            Preconditions.checkNotNull(arr_hasApiKey[v], "Requested API must not be null.");
        }
        ArrayList arrayList0 = new ArrayList(arr_hasApiKey.length + 1);
        arrayList0.add(hasApiKey0);
        arrayList0.addAll(Arrays.asList(arr_hasApiKey));
        return GoogleApiManager.zaj().zam(arrayList0);
    }
}

