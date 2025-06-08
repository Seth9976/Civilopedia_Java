package com.google.android.gms.measurement;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zzcl;
import com.google.android.gms.measurement.internal.zzge;
import com.google.android.gms.measurement.internal.zzha;
import com.google.android.gms.measurement.internal.zzhe;
import com.google.android.gms.measurement.internal.zzhf;
import com.google.android.gms.measurement.internal.zzik;
import com.google.android.gms.measurement.internal.zzip;
import com.google.firebase.analytics.FirebaseAnalytics;
import h1.a;
import h1.b;
import h1.c;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@KeepForSdk
@ShowFirstParty
@Deprecated
public class AppMeasurement {
    @KeepForSdk
    @ShowFirstParty
    public static class ConditionalUserProperty {
        @Keep
        @KeepForSdk
        @ShowFirstParty
        public boolean mActive;
        @Keep
        @KeepForSdk
        @ShowFirstParty
        public String mAppId;
        @Keep
        @KeepForSdk
        @ShowFirstParty
        public long mCreationTimestamp;
        @Keep
        public String mExpiredEventName;
        @Keep
        public Bundle mExpiredEventParams;
        @Keep
        @KeepForSdk
        @ShowFirstParty
        public String mName;
        @Keep
        @KeepForSdk
        @ShowFirstParty
        public String mOrigin;
        @Keep
        @KeepForSdk
        @ShowFirstParty
        public long mTimeToLive;
        @Keep
        public String mTimedOutEventName;
        @Keep
        public Bundle mTimedOutEventParams;
        @Keep
        @KeepForSdk
        @ShowFirstParty
        public String mTriggerEventName;
        @Keep
        @KeepForSdk
        @ShowFirstParty
        public long mTriggerTimeout;
        @Keep
        public String mTriggeredEventName;
        @Keep
        public Bundle mTriggeredEventParams;
        @Keep
        @KeepForSdk
        @ShowFirstParty
        public long mTriggeredTimestamp;
        @Keep
        @KeepForSdk
        @ShowFirstParty
        public Object mValue;

        @KeepForSdk
        public ConditionalUserProperty() {
        }

        @KeepForSdk
        public ConditionalUserProperty(ConditionalUserProperty appMeasurement$ConditionalUserProperty0) {
            Preconditions.checkNotNull(appMeasurement$ConditionalUserProperty0);
            this.mAppId = appMeasurement$ConditionalUserProperty0.mAppId;
            this.mOrigin = appMeasurement$ConditionalUserProperty0.mOrigin;
            this.mCreationTimestamp = appMeasurement$ConditionalUserProperty0.mCreationTimestamp;
            this.mName = appMeasurement$ConditionalUserProperty0.mName;
            Object object0 = appMeasurement$ConditionalUserProperty0.mValue;
            if(object0 != null) {
                Object object1 = zzip.zza(object0);
                this.mValue = object1;
                if(object1 == null) {
                    this.mValue = appMeasurement$ConditionalUserProperty0.mValue;
                }
            }
            this.mActive = appMeasurement$ConditionalUserProperty0.mActive;
            this.mTriggerEventName = appMeasurement$ConditionalUserProperty0.mTriggerEventName;
            this.mTriggerTimeout = appMeasurement$ConditionalUserProperty0.mTriggerTimeout;
            this.mTimedOutEventName = appMeasurement$ConditionalUserProperty0.mTimedOutEventName;
            Bundle bundle0 = appMeasurement$ConditionalUserProperty0.mTimedOutEventParams;
            if(bundle0 != null) {
                this.mTimedOutEventParams = new Bundle(bundle0);
            }
            this.mTriggeredEventName = appMeasurement$ConditionalUserProperty0.mTriggeredEventName;
            Bundle bundle1 = appMeasurement$ConditionalUserProperty0.mTriggeredEventParams;
            if(bundle1 != null) {
                this.mTriggeredEventParams = new Bundle(bundle1);
            }
            this.mTriggeredTimestamp = appMeasurement$ConditionalUserProperty0.mTriggeredTimestamp;
            this.mTimeToLive = appMeasurement$ConditionalUserProperty0.mTimeToLive;
            this.mExpiredEventName = appMeasurement$ConditionalUserProperty0.mExpiredEventName;
            Bundle bundle2 = appMeasurement$ConditionalUserProperty0.mExpiredEventParams;
            if(bundle2 != null) {
                this.mExpiredEventParams = new Bundle(bundle2);
            }
        }
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

    @KeepForSdk
    @ShowFirstParty
    public static final String CRASH_ORIGIN = "crash";
    @KeepForSdk
    @ShowFirstParty
    public static final String FCM_ORIGIN = "fcm";
    @KeepForSdk
    @ShowFirstParty
    public static final String FIAM_ORIGIN = "fiam";
    public final c a;
    public static volatile AppMeasurement b;

    public AppMeasurement(zzge zzge0) {
        this.a = new a(zzge0);
    }

    public AppMeasurement(zzik zzik0) {
        this.a = new b(zzik0);
    }

    @Keep
    public void beginAdUnitExposure(String s) {
        this.a.zzp(s);
    }

    @Keep
    @KeepForSdk
    @ShowFirstParty
    public void clearConditionalUserProperty(String s, String s1, Bundle bundle0) {
        this.a.zzq(s, s1, bundle0);
    }

    @Keep
    public void endAdUnitExposure(String s) {
        this.a.zzr(s);
    }

    @Keep
    public long generateEventId() {
        return this.a.zzb();
    }

    @Keep
    public String getAppInstanceId() {
        return this.a.zzh();
    }

    @KeepForSdk
    public Boolean getBoolean() {
        return this.a.a();
    }

    @Keep
    @KeepForSdk
    @ShowFirstParty
    public List getConditionalUserProperties(String s, String s1) {
        List list0 = this.a.zzm(s, s1);
        List list1 = new ArrayList((list0 == null ? 0 : list0.size()));
        for(Object object0: list0) {
            ConditionalUserProperty appMeasurement$ConditionalUserProperty0 = new ConditionalUserProperty();  // 初始化器: Ljava/lang/Object;-><init>()V
            Preconditions.checkNotNull(((Bundle)object0));
            appMeasurement$ConditionalUserProperty0.mAppId = (String)zzha.zza(((Bundle)object0), "app_id", String.class, null);
            appMeasurement$ConditionalUserProperty0.mOrigin = (String)zzha.zza(((Bundle)object0), "origin", String.class, null);
            appMeasurement$ConditionalUserProperty0.mName = (String)zzha.zza(((Bundle)object0), "name", String.class, null);
            appMeasurement$ConditionalUserProperty0.mValue = zzha.zza(((Bundle)object0), "value", Object.class, null);
            appMeasurement$ConditionalUserProperty0.mTriggerEventName = (String)zzha.zza(((Bundle)object0), "trigger_event_name", String.class, null);
            appMeasurement$ConditionalUserProperty0.mTriggerTimeout = (long)(((Long)zzha.zza(((Bundle)object0), "trigger_timeout", Long.class, 0L)));
            appMeasurement$ConditionalUserProperty0.mTimedOutEventName = (String)zzha.zza(((Bundle)object0), "timed_out_event_name", String.class, null);
            appMeasurement$ConditionalUserProperty0.mTimedOutEventParams = (Bundle)zzha.zza(((Bundle)object0), "timed_out_event_params", Bundle.class, null);
            appMeasurement$ConditionalUserProperty0.mTriggeredEventName = (String)zzha.zza(((Bundle)object0), "triggered_event_name", String.class, null);
            appMeasurement$ConditionalUserProperty0.mTriggeredEventParams = (Bundle)zzha.zza(((Bundle)object0), "triggered_event_params", Bundle.class, null);
            appMeasurement$ConditionalUserProperty0.mTimeToLive = (long)(((Long)zzha.zza(((Bundle)object0), "time_to_live", Long.class, 0L)));
            appMeasurement$ConditionalUserProperty0.mExpiredEventName = (String)zzha.zza(((Bundle)object0), "expired_event_name", String.class, null);
            appMeasurement$ConditionalUserProperty0.mExpiredEventParams = (Bundle)zzha.zza(((Bundle)object0), "expired_event_params", Bundle.class, null);
            appMeasurement$ConditionalUserProperty0.mActive = ((Boolean)zzha.zza(((Bundle)object0), "active", Boolean.class, Boolean.FALSE)).booleanValue();
            appMeasurement$ConditionalUserProperty0.mCreationTimestamp = (long)(((Long)zzha.zza(((Bundle)object0), "creation_timestamp", Long.class, 0L)));
            appMeasurement$ConditionalUserProperty0.mTriggeredTimestamp = (long)(((Long)zzha.zza(((Bundle)object0), "triggered_timestamp", Long.class, 0L)));
            ((ArrayList)list1).add(appMeasurement$ConditionalUserProperty0);
        }
        return list1;
    }

    @Keep
    public String getCurrentScreenClass() {
        return this.a.zzi();
    }

    @Keep
    public String getCurrentScreenName() {
        return this.a.zzj();
    }

    @KeepForSdk
    public Double getDouble() {
        return this.a.b();
    }

    @Keep
    public String getGmpAppId() {
        return this.a.zzk();
    }

    @Keep
    @KeepForSdk
    @ShowFirstParty
    @Deprecated
    public static AppMeasurement getInstance(Context context0) {
        zzik zzik0;
        if(AppMeasurement.b == null) {
            Class class0 = AppMeasurement.class;
            __monitor_enter(class0);
            if(AppMeasurement.b == null) {
                try {
                    zzik0 = null;
                    zzik0 = FirebaseAnalytics.getScionFrontendApiImplementation(context0, null);
                }
                catch(Exception unused_ex) {
                }
                AppMeasurement.b = zzik0 == null ? new AppMeasurement(zzge.zzp(context0, new zzcl(0L, 0L, true, null, null, null, null, null), null)) : new AppMeasurement(zzik0);
            }
            __monitor_exit(class0);
        }
        return AppMeasurement.b;
    }

    @KeepForSdk
    public Integer getInteger() {
        return this.a.c();
    }

    @KeepForSdk
    public Long getLong() {
        return this.a.d();
    }

    @Keep
    @KeepForSdk
    @ShowFirstParty
    public int getMaxUserProperties(String s) {
        return this.a.zza(s);
    }

    @KeepForSdk
    public String getString() {
        return this.a.e();
    }

    @Keep
    @VisibleForTesting
    public Map getUserProperties(String s, String s1, boolean z) {
        return this.a.zzo(s, s1, z);
    }

    @KeepForSdk
    @ShowFirstParty
    public Map getUserProperties(boolean z) {
        return this.a.f(z);
    }

    @Keep
    @ShowFirstParty
    public void logEventInternal(String s, String s1, Bundle bundle0) {
        this.a.zzs(s, s1, bundle0);
    }

    @KeepForSdk
    @ShowFirstParty
    public void logEventInternalNoInterceptor(String s, String s1, Bundle bundle0, long v) {
        this.a.zzt(s, s1, bundle0, v);
    }

    @KeepForSdk
    @ShowFirstParty
    public void registerOnMeasurementEventListener(OnEventListener appMeasurement$OnEventListener0) {
        this.a.zzu(appMeasurement$OnEventListener0);
    }

    @Keep
    @KeepForSdk
    @ShowFirstParty
    public void setConditionalUserProperty(ConditionalUserProperty appMeasurement$ConditionalUserProperty0) {
        Preconditions.checkNotNull(appMeasurement$ConditionalUserProperty0);
        Bundle bundle0 = new Bundle();
        String s = appMeasurement$ConditionalUserProperty0.mAppId;
        if(s != null) {
            bundle0.putString("app_id", s);
        }
        String s1 = appMeasurement$ConditionalUserProperty0.mOrigin;
        if(s1 != null) {
            bundle0.putString("origin", s1);
        }
        String s2 = appMeasurement$ConditionalUserProperty0.mName;
        if(s2 != null) {
            bundle0.putString("name", s2);
        }
        Object object0 = appMeasurement$ConditionalUserProperty0.mValue;
        if(object0 != null) {
            zzha.zzb(bundle0, object0);
        }
        String s3 = appMeasurement$ConditionalUserProperty0.mTriggerEventName;
        if(s3 != null) {
            bundle0.putString("trigger_event_name", s3);
        }
        bundle0.putLong("trigger_timeout", appMeasurement$ConditionalUserProperty0.mTriggerTimeout);
        String s4 = appMeasurement$ConditionalUserProperty0.mTimedOutEventName;
        if(s4 != null) {
            bundle0.putString("timed_out_event_name", s4);
        }
        Bundle bundle1 = appMeasurement$ConditionalUserProperty0.mTimedOutEventParams;
        if(bundle1 != null) {
            bundle0.putBundle("timed_out_event_params", bundle1);
        }
        String s5 = appMeasurement$ConditionalUserProperty0.mTriggeredEventName;
        if(s5 != null) {
            bundle0.putString("triggered_event_name", s5);
        }
        Bundle bundle2 = appMeasurement$ConditionalUserProperty0.mTriggeredEventParams;
        if(bundle2 != null) {
            bundle0.putBundle("triggered_event_params", bundle2);
        }
        bundle0.putLong("time_to_live", appMeasurement$ConditionalUserProperty0.mTimeToLive);
        String s6 = appMeasurement$ConditionalUserProperty0.mExpiredEventName;
        if(s6 != null) {
            bundle0.putString("expired_event_name", s6);
        }
        Bundle bundle3 = appMeasurement$ConditionalUserProperty0.mExpiredEventParams;
        if(bundle3 != null) {
            bundle0.putBundle("expired_event_params", bundle3);
        }
        bundle0.putLong("creation_timestamp", appMeasurement$ConditionalUserProperty0.mCreationTimestamp);
        bundle0.putBoolean("active", appMeasurement$ConditionalUserProperty0.mActive);
        bundle0.putLong("triggered_timestamp", appMeasurement$ConditionalUserProperty0.mTriggeredTimestamp);
        this.a.zzv(bundle0);
    }

    @KeepForSdk
    @ShowFirstParty
    public void setEventInterceptor(EventInterceptor appMeasurement$EventInterceptor0) {
        this.a.zzw(appMeasurement$EventInterceptor0);
    }

    @KeepForSdk
    @ShowFirstParty
    public void unregisterOnMeasurementEventListener(OnEventListener appMeasurement$OnEventListener0) {
        this.a.zzx(appMeasurement$OnEventListener0);
    }
}

