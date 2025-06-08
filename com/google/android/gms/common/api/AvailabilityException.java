package com.google.android.gms.common.api;

import android.text.TextUtils;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.ApiKey;
import com.google.android.gms.common.internal.Preconditions;
import i3.e;
import java.util.ArrayList;
import p.b;
import p.h;

public class AvailabilityException extends Exception {
    public final b i;

    public AvailabilityException(b b0) {
        this.i = b0;
    }

    public ConnectionResult getConnectionResult(GoogleApi googleApi0) {
        ApiKey apiKey0 = googleApi0.getApiKey();
        Preconditions.checkArgument(this.i.getOrDefault(apiKey0, null) != null, e.f("The given API (", apiKey0.zaa(), ") was not part of the availability request."));
        return (ConnectionResult)Preconditions.checkNotNull(((ConnectionResult)this.i.getOrDefault(apiKey0, null)));
    }

    public ConnectionResult getConnectionResult(HasApiKey hasApiKey0) {
        ApiKey apiKey0 = hasApiKey0.getApiKey();
        Preconditions.checkArgument(this.i.getOrDefault(apiKey0, null) != null, e.f("The given API (", apiKey0.zaa(), ") was not part of the availability request."));
        return (ConnectionResult)Preconditions.checkNotNull(((ConnectionResult)this.i.getOrDefault(apiKey0, null)));
    }

    @Override
    public String getMessage() {
        ArrayList arrayList0 = new ArrayList();
        b b0 = this.i;
        int v = 1;
        for(Object object0: ((h)b0.keySet())) {
            ConnectionResult connectionResult0 = (ConnectionResult)Preconditions.checkNotNull(((ConnectionResult)b0.getOrDefault(((ApiKey)object0), null)));
            v &= !connectionResult0.isSuccess();
            arrayList0.add(((ApiKey)object0).zaa() + ": " + connectionResult0);
        }
        StringBuilder stringBuilder0 = new StringBuilder();
        if(v == 0) {
            stringBuilder0.append("Some of the queried APIs are unavailable. ");
        }
        else {
            stringBuilder0.append("None of the queried APIs are available. ");
        }
        stringBuilder0.append(TextUtils.join("; ", arrayList0));
        return stringBuilder0.toString();
    }
}

