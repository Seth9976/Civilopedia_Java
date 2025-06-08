package com.google.android.gms.measurement.api;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.internal.measurement.zzee;
import com.google.android.gms.measurement.internal.zzhe;
import com.google.android.gms.measurement.internal.zzhf;
import java.util.List;
import java.util.Map;

@KeepForSdk
@ShowFirstParty
public class AppMeasurementSdk {
    @KeepForSdk
    public static final class ConditionalUserProperty {
        @KeepForSdk
        public static final String ACTIVE = "active";
        @KeepForSdk
        public static final String CREATION_TIMESTAMP = "creation_timestamp";
        @KeepForSdk
        public static final String EXPIRED_EVENT_NAME = "expired_event_name";
        @KeepForSdk
        public static final String EXPIRED_EVENT_PARAMS = "expired_event_params";
        @KeepForSdk
        public static final String NAME = "name";
        @KeepForSdk
        public static final String ORIGIN = "origin";
        @KeepForSdk
        public static final String TIMED_OUT_EVENT_NAME = "timed_out_event_name";
        @KeepForSdk
        public static final String TIMED_OUT_EVENT_PARAMS = "timed_out_event_params";
        @KeepForSdk
        public static final String TIME_TO_LIVE = "time_to_live";
        @KeepForSdk
        public static final String TRIGGERED_EVENT_NAME = "triggered_event_name";
        @KeepForSdk
        public static final String TRIGGERED_EVENT_PARAMS = "triggered_event_params";
        @KeepForSdk
        public static final String TRIGGERED_TIMESTAMP = "triggered_timestamp";
        @KeepForSdk
        public static final String TRIGGER_EVENT_NAME = "trigger_event_name";
        @KeepForSdk
        public static final String TRIGGER_TIMEOUT = "trigger_timeout";
        @KeepForSdk
        public static final String VALUE = "value";

    }

    @KeepForSdk
    @ShowFirstParty
    public interface EventInterceptor extends zzhe {
        @Override  // com.google.android.gms.measurement.internal.zzhe
        @KeepForSdk
        @ShowFirstParty
        void interceptEvent(String arg1, String arg2, Bundle arg3, long arg4);
    }

    @KeepForSdk
    @ShowFirstParty
    public interface OnEventListener extends zzhf {
        @Override  // com.google.android.gms.measurement.internal.zzhf
        @KeepForSdk
        @ShowFirstParty
        void onEvent(String arg1, String arg2, Bundle arg3, long arg4);
    }

    public final zzee a;

    public AppMeasurementSdk(zzee zzee0) {
        this.a = zzee0;
    }

    @KeepForSdk
    public void beginAdUnitExposure(String s) {
        this.a.zzu(s);
    }

    @KeepForSdk
    public void clearConditionalUserProperty(String s, String s1, Bundle bundle0) {
        this.a.zzv(s, s1, bundle0);
    }

    @KeepForSdk
    public void endAdUnitExposure(String s) {
        this.a.zzw(s);
    }

    @KeepForSdk
    public long generateEventId() {
        return this.a.zzb();
    }

    @KeepForSdk
    public String getAppIdOrigin() {
        return this.a.zzj();
    }

    @KeepForSdk
    public String getAppInstanceId() {
        return this.a.zzl();
    }

    @KeepForSdk
    public List getConditionalUserProperties(String s, String s1) {
        return this.a.zzp(s, s1);
    }

    @KeepForSdk
    public String getCurrentScreenClass() {
        return this.a.zzm();
    }

    @KeepForSdk
    public String getCurrentScreenName() {
        return this.a.zzn();
    }

    @KeepForSdk
    public String getGmpAppId() {
        return this.a.zzo();
    }

    @KeepForSdk
    @ShowFirstParty
    public static AppMeasurementSdk getInstance(Context context0) {
        return zzee.zzg(context0, null, null, null, null).zzd();
    }

    @KeepForSdk
    public static AppMeasurementSdk getInstance(Context context0, String s, String s1, String s2, Bundle bundle0) {
        return zzee.zzg(context0, s, s1, s2, bundle0).zzd();
    }

    @KeepForSdk
    public int getMaxUserProperties(String s) {
        return this.a.zza(s);
    }

    @KeepForSdk
    public Map getUserProperties(String s, String s1, boolean z) {
        return this.a.zzq(s, s1, z);
    }

    @KeepForSdk
    public void logEvent(String s, String s1, Bundle bundle0) {
        this.a.zzy(s, s1, bundle0);
    }

    @KeepForSdk
    public void logEventNoInterceptor(String s, String s1, Bundle bundle0, long v) {
        this.a.zzz(s, s1, bundle0, v);
    }

    @KeepForSdk
    public void performAction(Bundle bundle0) {
        this.a.zzc(bundle0, false);
    }

    @KeepForSdk
    public Bundle performActionWithResponse(Bundle bundle0) {
        return this.a.zzc(bundle0, true);
    }

    @KeepForSdk
    @ShowFirstParty
    public void registerOnMeasurementEventListener(OnEventListener appMeasurementSdk$OnEventListener0) {
        this.a.zzB(appMeasurementSdk$OnEventListener0);
    }

    @KeepForSdk
    public void setConditionalUserProperty(Bundle bundle0) {
        this.a.zzD(bundle0);
    }

    @KeepForSdk
    public void setConsent(Bundle bundle0) {
        this.a.zzE(bundle0);
    }

    @KeepForSdk
    public void setCurrentScreen(Activity activity0, String s, String s1) {
        this.a.zzG(activity0, s, s1);
    }

    @KeepForSdk
    @ShowFirstParty
    public void setEventInterceptor(EventInterceptor appMeasurementSdk$EventInterceptor0) {
        this.a.zzJ(appMeasurementSdk$EventInterceptor0);
    }

    @KeepForSdk
    public void setMeasurementEnabled(Boolean boolean0) {
        this.a.zzK(boolean0);
    }

    @KeepForSdk
    public void setMeasurementEnabled(boolean z) {
        this.a.zzK(Boolean.valueOf(z));
    }

    @KeepForSdk
    public void setUserProperty(String s, String s1, Object object0) {
        this.a.zzN(s, s1, object0, true);
    }

    @KeepForSdk
    @ShowFirstParty
    public void unregisterOnMeasurementEventListener(OnEventListener appMeasurementSdk$OnEventListener0) {
        this.a.zzO(appMeasurementSdk$OnEventListener0);
    }

    public final void zza(boolean z) {
        this.a.zzH(z);
    }
}

