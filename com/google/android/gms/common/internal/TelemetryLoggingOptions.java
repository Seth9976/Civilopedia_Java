package com.google.android.gms.common.internal;

import android.os.Bundle;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api.ApiOptions.Optional;
import com.google.errorprone.annotations.CanIgnoreReturnValue;

@KeepForSdk
public class TelemetryLoggingOptions implements Optional {
    @KeepForSdk
    public static class Builder {
        public String a;

        @KeepForSdk
        public TelemetryLoggingOptions build() {
            return new TelemetryLoggingOptions(this.a);
        }

        @KeepForSdk
        @CanIgnoreReturnValue
        public Builder setApi(String s) {
            this.a = s;
            return this;
        }
    }

    public final String i;
    public static final TelemetryLoggingOptions zaa;

    static {
        TelemetryLoggingOptions.zaa = TelemetryLoggingOptions.builder().build();
    }

    public TelemetryLoggingOptions(String s) {
        this.i = s;
    }

    @KeepForSdk
    public static Builder builder() {
        return new Builder();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        return object0 instanceof TelemetryLoggingOptions ? Objects.equal(this.i, ((TelemetryLoggingOptions)object0).i) : false;
    }

    @Override
    public final int hashCode() {
        return Objects.hashCode(new Object[]{this.i});
    }

    public final Bundle zaa() {
        Bundle bundle0 = new Bundle();
        String s = this.i;
        if(s != null) {
            bundle0.putString("api", s);
        }
        return bundle0;
    }
}

