package com.google.android.gms.auth.api.signin;

import B.d;
import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable;
import com.google.android.gms.auth.api.signin.internal.HashAccumulator;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api.ApiOptions.Optional;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Class(creator = "GoogleSignInOptionsCreator")
@Deprecated
public class GoogleSignInOptions extends AbstractSafeParcelable implements Optional, ReflectedParcelable {
    public static final class Builder {
        public final HashSet a;
        public boolean b;
        public boolean c;
        public boolean d;
        public String e;
        public Account f;
        public String g;
        public final HashMap h;
        public String i;

        public Builder() {
            this.a = new HashSet();
            this.h = new HashMap();
        }

        public Builder(GoogleSignInOptions googleSignInOptions0) {
            this.a = new HashSet();
            this.h = new HashMap();
            Preconditions.checkNotNull(googleSignInOptions0);
            this.a = new HashSet(googleSignInOptions0.j);
            this.b = googleSignInOptions0.m;
            this.c = googleSignInOptions0.n;
            this.d = googleSignInOptions0.l;
            this.e = googleSignInOptions0.o;
            this.f = googleSignInOptions0.k;
            this.g = googleSignInOptions0.p;
            this.h = GoogleSignInOptions.a(googleSignInOptions0.q);
            this.i = googleSignInOptions0.r;
        }

        @CanIgnoreReturnValue
        public Builder addExtension(GoogleSignInOptionsExtension googleSignInOptionsExtension0) {
            Integer integer0 = googleSignInOptionsExtension0.getExtensionType();
            HashMap hashMap0 = this.h;
            if(hashMap0.containsKey(integer0)) {
                throw new IllegalStateException("Only one extension per type may be added");
            }
            List list0 = googleSignInOptionsExtension0.getImpliedScopes();
            if(list0 != null) {
                this.a.addAll(list0);
            }
            hashMap0.put(googleSignInOptionsExtension0.getExtensionType(), new GoogleSignInOptionsExtensionParcelable(googleSignInOptionsExtension0));
            return this;
        }

        public GoogleSignInOptions build() {
            HashSet hashSet0 = this.a;
            if(hashSet0.contains(GoogleSignInOptions.zae)) {
                Scope scope0 = GoogleSignInOptions.zad;
                if(hashSet0.contains(scope0)) {
                    hashSet0.remove(scope0);
                }
            }
            if(this.d && (this.f == null || !hashSet0.isEmpty())) {
                this.requestId();
            }
            return new GoogleSignInOptions(3, new ArrayList(hashSet0), this.f, this.d, this.b, this.c, this.e, this.g, this.h, this.i);
        }

        @CanIgnoreReturnValue
        public Builder requestEmail() {
            this.a.add(GoogleSignInOptions.zab);
            return this;
        }

        @CanIgnoreReturnValue
        public Builder requestId() {
            this.a.add(GoogleSignInOptions.zac);
            return this;
        }

        @CanIgnoreReturnValue
        public Builder requestIdToken(String s) {
            boolean z = true;
            this.d = true;
            Preconditions.checkNotEmpty(s);
            if(this.e != null && !this.e.equals(s)) {
                z = false;
            }
            Preconditions.checkArgument(z, "two different server client ids provided");
            this.e = s;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder requestProfile() {
            this.a.add(GoogleSignInOptions.zaa);
            return this;
        }

        @CanIgnoreReturnValue
        public Builder requestScopes(Scope scope0, Scope[] arr_scope) {
            this.a.add(scope0);
            List list0 = Arrays.asList(arr_scope);
            this.a.addAll(list0);
            return this;
        }

        @CanIgnoreReturnValue
        public Builder requestServerAuthCode(String s) {
            this.requestServerAuthCode(s, false);
            return this;
        }

        @CanIgnoreReturnValue
        public Builder requestServerAuthCode(String s, boolean z) {
            boolean z1 = true;
            this.b = true;
            Preconditions.checkNotEmpty(s);
            if(this.e != null && !this.e.equals(s)) {
                z1 = false;
            }
            Preconditions.checkArgument(z1, "two different server client ids provided");
            this.e = s;
            this.c = z;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setAccountName(String s) {
            this.f = new Account(Preconditions.checkNotEmpty(s), "com.google");
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setHostedDomain(String s) {
            this.g = Preconditions.checkNotEmpty(s);
            return this;
        }

        @KeepForSdk
        @CanIgnoreReturnValue
        public Builder setLogSessionId(String s) {
            this.i = s;
            return this;
        }
    }

    public static final Parcelable.Creator CREATOR;
    public static final GoogleSignInOptions DEFAULT_GAMES_SIGN_IN;
    public static final GoogleSignInOptions DEFAULT_SIGN_IN;
    public final int i;
    public final ArrayList j;
    public final Account k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final String o;
    public final String p;
    public final ArrayList q;
    public final String r;
    public static final d s;
    public static final Scope zaa;
    public static final Scope zab;
    public static final Scope zac;
    public static final Scope zad;
    public static final Scope zae;

    static {
        GoogleSignInOptions.zaa = new Scope("profile");
        GoogleSignInOptions.zab = new Scope("email");
        GoogleSignInOptions.zac = new Scope("openid");
        Scope scope0 = new Scope("https://www.googleapis.com/auth/games_lite");
        GoogleSignInOptions.zad = scope0;
        GoogleSignInOptions.zae = new Scope("https://www.googleapis.com/auth/games");
        Builder googleSignInOptions$Builder0 = new Builder();
        googleSignInOptions$Builder0.requestId();
        googleSignInOptions$Builder0.requestProfile();
        GoogleSignInOptions.DEFAULT_SIGN_IN = googleSignInOptions$Builder0.build();
        Builder googleSignInOptions$Builder1 = new Builder();
        googleSignInOptions$Builder1.requestScopes(scope0, new Scope[0]);
        GoogleSignInOptions.DEFAULT_GAMES_SIGN_IN = googleSignInOptions$Builder1.build();
        GoogleSignInOptions.CREATOR = new zae();
        GoogleSignInOptions.s = new d(1);
    }

    public GoogleSignInOptions(int v, ArrayList arrayList0, Account account0, boolean z, boolean z1, boolean z2, String s, String s1, HashMap hashMap0, String s2) {
        this.i = v;
        this.j = arrayList0;
        this.k = account0;
        this.l = z;
        this.m = z1;
        this.n = z2;
        this.o = s;
        this.p = s1;
        this.q = new ArrayList(hashMap0.values());
        this.r = s2;
    }

    public static HashMap a(ArrayList arrayList0) {
        HashMap hashMap0 = new HashMap();
        if(arrayList0 != null) {
            for(Object object0: arrayList0) {
                hashMap0.put(((GoogleSignInOptionsExtensionParcelable)object0).getType(), ((GoogleSignInOptionsExtensionParcelable)object0));
            }
        }
        return hashMap0;
    }

    @Override
    public boolean equals(Object object0) {
        String s = this.o;
        ArrayList arrayList0 = this.j;
        if(object0 == null) {
            return false;
        }
        try {
            if(this.q.isEmpty() && ((GoogleSignInOptions)object0).q.isEmpty() && arrayList0.size() == ((GoogleSignInOptions)object0).getScopes().size() && arrayList0.containsAll(((GoogleSignInOptions)object0).getScopes())) {
                Account account0 = this.k;
                if(account0 != null) {
                    if(account0.equals(((GoogleSignInOptions)object0).getAccount())) {
                    label_10:
                        if(!TextUtils.isEmpty(s)) {
                            if(s.equals(((GoogleSignInOptions)object0).getServerClientId())) {
                            label_14:
                                boolean z = ((GoogleSignInOptions)object0).isForceCodeForRefreshToken();
                                if(this.n == z) {
                                    boolean z1 = ((GoogleSignInOptions)object0).isIdTokenRequested();
                                    if(this.l == z1) {
                                        boolean z2 = ((GoogleSignInOptions)object0).isServerAuthCodeRequested();
                                        if(this.m == z2) {
                                            String s1 = ((GoogleSignInOptions)object0).getLogSessionId();
                                            return TextUtils.equals(this.r, s1);
                                        }
                                    }
                                }
                            }
                        }
                        else if(TextUtils.isEmpty(((GoogleSignInOptions)object0).getServerClientId())) {
                            goto label_14;
                        }
                    }
                }
                else if(((GoogleSignInOptions)object0).getAccount() == null) {
                    goto label_10;
                }
            }
        }
        catch(ClassCastException unused_ex) {
        }
        return false;
    }

    @KeepForSdk
    public Account getAccount() {
        return this.k;
    }

    @KeepForSdk
    public ArrayList getExtensions() {
        return this.q;
    }

    @KeepForSdk
    public String getLogSessionId() {
        return this.r;
    }

    public Scope[] getScopeArray() {
        return (Scope[])this.j.toArray(new Scope[this.j.size()]);
    }

    @KeepForSdk
    public ArrayList getScopes() {
        return new ArrayList(this.j);
    }

    @KeepForSdk
    public String getServerClientId() {
        return this.o;
    }

    @Override
    public int hashCode() {
        ArrayList arrayList0 = new ArrayList();
        ArrayList arrayList1 = this.j;
        int v = arrayList1.size();
        for(int v1 = 0; v1 < v; ++v1) {
            arrayList0.add(((Scope)arrayList1.get(v1)).getScopeUri());
        }
        Collections.sort(arrayList0);
        HashAccumulator hashAccumulator0 = new HashAccumulator();
        hashAccumulator0.addObject(arrayList0);
        hashAccumulator0.addObject(this.k);
        hashAccumulator0.addObject(this.o);
        hashAccumulator0.zaa(this.n);
        hashAccumulator0.zaa(this.l);
        hashAccumulator0.zaa(this.m);
        hashAccumulator0.addObject(this.r);
        return hashAccumulator0.hash();
    }

    @KeepForSdk
    public boolean isForceCodeForRefreshToken() {
        return this.n;
    }

    @KeepForSdk
    public boolean isIdTokenRequested() {
        return this.l;
    }

    @KeepForSdk
    public boolean isServerAuthCodeRequested() {
        return this.m;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel parcel0, int v) {
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeInt(parcel0, 1, this.i);
        SafeParcelWriter.writeTypedList(parcel0, 2, this.getScopes(), false);
        SafeParcelWriter.writeParcelable(parcel0, 3, this.getAccount(), v, false);
        SafeParcelWriter.writeBoolean(parcel0, 4, this.isIdTokenRequested());
        SafeParcelWriter.writeBoolean(parcel0, 5, this.isServerAuthCodeRequested());
        SafeParcelWriter.writeBoolean(parcel0, 6, this.isForceCodeForRefreshToken());
        SafeParcelWriter.writeString(parcel0, 7, this.getServerClientId(), false);
        SafeParcelWriter.writeString(parcel0, 8, this.p, false);
        SafeParcelWriter.writeTypedList(parcel0, 9, this.getExtensions(), false);
        SafeParcelWriter.writeString(parcel0, 10, this.getLogSessionId(), false);
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }

    public static GoogleSignInOptions zab(String s) throws JSONException {
        String s1 = null;
        if(TextUtils.isEmpty(s)) {
            return null;
        }
        JSONObject jSONObject0 = new JSONObject(s);
        HashSet hashSet0 = new HashSet();
        JSONArray jSONArray0 = jSONObject0.getJSONArray("scopes");
        int v = jSONArray0.length();
        for(int v1 = 0; v1 < v; ++v1) {
            hashSet0.add(new Scope(jSONArray0.getString(v1)));
        }
        String s2 = jSONObject0.has("accountName") ? jSONObject0.optString("accountName") : null;
        Account account0 = TextUtils.isEmpty(s2) ? null : new Account(s2, "com.google");
        ArrayList arrayList0 = new ArrayList(hashSet0);
        boolean z = jSONObject0.getBoolean("idTokenRequested");
        boolean z1 = jSONObject0.getBoolean("serverAuthRequested");
        boolean z2 = jSONObject0.getBoolean("forceCodeForRefreshToken");
        String s3 = jSONObject0.has("serverClientId") ? jSONObject0.optString("serverClientId") : null;
        if(jSONObject0.has("hostedDomain")) {
            s1 = jSONObject0.optString("hostedDomain");
        }
        return new GoogleSignInOptions(3, arrayList0, account0, z, z1, z2, s3, s1, new HashMap(), null);
    }

    public final String zaf() {
        String s = this.p;
        String s1 = this.o;
        JSONObject jSONObject0 = new JSONObject();
        try {
            JSONArray jSONArray0 = new JSONArray();
            Collections.sort(this.j, GoogleSignInOptions.s);
            for(Object object0: this.j) {
                jSONArray0.put(((Scope)object0).getScopeUri());
            }
            jSONObject0.put("scopes", jSONArray0);
            Account account0 = this.k;
            if(account0 != null) {
                jSONObject0.put("accountName", account0.name);
            }
            jSONObject0.put("idTokenRequested", this.l);
            jSONObject0.put("forceCodeForRefreshToken", this.n);
            jSONObject0.put("serverAuthRequested", this.m);
            if(!TextUtils.isEmpty(s1)) {
                jSONObject0.put("serverClientId", s1);
            }
            if(!TextUtils.isEmpty(s)) {
                jSONObject0.put("hostedDomain", s);
            }
            return jSONObject0.toString();
        }
        catch(JSONException jSONException0) {
        }
        throw new RuntimeException(jSONException0);
    }
}

