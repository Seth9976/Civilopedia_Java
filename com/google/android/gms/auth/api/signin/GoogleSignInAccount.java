package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p.c;

@Class(creator = "GoogleSignInAccountCreator")
@Deprecated
public class GoogleSignInAccount extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR;
    public final int i;
    public final String j;
    public final String k;
    public final String l;
    public final String m;
    public final Uri n;
    public String o;
    public final long p;
    public final String q;
    public final ArrayList r;
    public final String s;
    public final String t;
    public final HashSet u;
    public static final Clock zaa;

    static {
        GoogleSignInAccount.CREATOR = new zab();
        GoogleSignInAccount.zaa = DefaultClock.getInstance();
    }

    public GoogleSignInAccount(int v, String s, String s1, String s2, String s3, Uri uri0, String s4, long v1, String s5, ArrayList arrayList0, String s6, String s7) {
        this.u = new HashSet();
        this.i = v;
        this.j = s;
        this.k = s1;
        this.l = s2;
        this.m = s3;
        this.n = uri0;
        this.o = s4;
        this.p = v1;
        this.q = s5;
        this.r = arrayList0;
        this.s = s6;
        this.t = s7;
    }

    public static GoogleSignInAccount a(Account account0, Set set0) {
        return GoogleSignInAccount.zaa(null, null, account0.name, null, null, null, null, 0L, account0.name, set0);
    }

    @KeepForSdk
    public static GoogleSignInAccount createDefault() {
        return GoogleSignInAccount.a(new Account("<<default account>>", "com.google"), new HashSet());
    }

    @Override
    public boolean equals(Object object0) {
        if(object0 == null) {
            return false;
        }
        if(object0 == this) {
            return true;
        }
        return object0 instanceof GoogleSignInAccount ? ((GoogleSignInAccount)object0).q.equals(this.q) && ((GoogleSignInAccount)object0).getRequestedScopes().equals(this.getRequestedScopes()) : false;
    }

    @KeepForSdk
    public static GoogleSignInAccount fromAccount(Account account0) {
        return GoogleSignInAccount.a(account0, new c(0));
    }

    @KeepForSdk
    @ShowFirstParty
    public static GoogleSignInAccount fromAccountAndScopes(Account account0, Scope scope0, Scope[] arr_scope) {
        Preconditions.checkNotNull(account0);
        Preconditions.checkNotNull(scope0);
        HashSet hashSet0 = new HashSet();
        hashSet0.add(scope0);
        hashSet0.addAll(Arrays.asList(arr_scope));
        return GoogleSignInAccount.a(account0, hashSet0);
    }

    public Account getAccount() {
        return this.l == null ? null : new Account(this.l, "com.google");
    }

    public String getDisplayName() {
        return this.m;
    }

    public String getEmail() {
        return this.l;
    }

    public String getFamilyName() {
        return this.t;
    }

    public String getGivenName() {
        return this.s;
    }

    public Set getGrantedScopes() {
        return new HashSet(this.r);
    }

    public String getId() {
        return this.j;
    }

    public String getIdToken() {
        return this.k;
    }

    public Uri getPhotoUrl() {
        return this.n;
    }

    @KeepForSdk
    public Set getRequestedScopes() {
        Set set0 = new HashSet(this.r);
        set0.addAll(this.u);
        return set0;
    }

    public String getServerAuthCode() {
        return this.o;
    }

    @Override
    public int hashCode() {
        int v = this.getRequestedScopes().hashCode();
        return (this.q.hashCode() + 0x20F) * 0x1F + v;
    }

    @KeepForSdk
    public boolean isExpired() {
        return GoogleSignInAccount.zaa.currentTimeMillis() / 1000L >= this.p - 300L;
    }

    @KeepForSdk
    @CanIgnoreReturnValue
    public GoogleSignInAccount requestExtraScopes(Scope[] arr_scope) {
        if(arr_scope != null) {
            Collections.addAll(this.u, arr_scope);
        }
        return this;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel parcel0, int v) {
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeInt(parcel0, 1, this.i);
        SafeParcelWriter.writeString(parcel0, 2, this.getId(), false);
        SafeParcelWriter.writeString(parcel0, 3, this.getIdToken(), false);
        SafeParcelWriter.writeString(parcel0, 4, this.getEmail(), false);
        SafeParcelWriter.writeString(parcel0, 5, this.getDisplayName(), false);
        SafeParcelWriter.writeParcelable(parcel0, 6, this.getPhotoUrl(), v, false);
        SafeParcelWriter.writeString(parcel0, 7, this.getServerAuthCode(), false);
        SafeParcelWriter.writeLong(parcel0, 8, this.p);
        SafeParcelWriter.writeString(parcel0, 9, this.q, false);
        SafeParcelWriter.writeTypedList(parcel0, 10, this.r, false);
        SafeParcelWriter.writeString(parcel0, 11, this.getGivenName(), false);
        SafeParcelWriter.writeString(parcel0, 12, this.getFamilyName(), false);
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }

    public static GoogleSignInAccount zaa(String s, String s1, String s2, String s3, String s4, String s5, Uri uri0, Long long0, String s6, Set set0) {
        return new GoogleSignInAccount(3, s, s1, s2, s3, uri0, null, ((long)long0), Preconditions.checkNotEmpty(s6), new ArrayList(((Collection)Preconditions.checkNotNull(set0))), s4, s5);
    }

    public static GoogleSignInAccount zab(String s) throws JSONException {
        String s1 = null;
        if(TextUtils.isEmpty(s)) {
            return null;
        }
        JSONObject jSONObject0 = new JSONObject(s);
        String s2 = jSONObject0.optString("photoUrl");
        Uri uri0 = TextUtils.isEmpty(s2) ? null : Uri.parse(s2);
        long v = Long.parseLong(jSONObject0.getString("expirationTime"));
        HashSet hashSet0 = new HashSet();
        JSONArray jSONArray0 = jSONObject0.getJSONArray("grantedScopes");
        int v1 = jSONArray0.length();
        for(int v2 = 0; v2 < v1; ++v2) {
            hashSet0.add(new Scope(jSONArray0.getString(v2)));
        }
        GoogleSignInAccount googleSignInAccount0 = GoogleSignInAccount.zaa(jSONObject0.optString("id"), (jSONObject0.has("tokenId") ? jSONObject0.optString("tokenId") : null), (jSONObject0.has("email") ? jSONObject0.optString("email") : null), (jSONObject0.has("displayName") ? jSONObject0.optString("displayName") : null), (jSONObject0.has("givenName") ? jSONObject0.optString("givenName") : null), (jSONObject0.has("familyName") ? jSONObject0.optString("familyName") : null), uri0, v, jSONObject0.getString("obfuscatedIdentifier"), hashSet0);
        if(jSONObject0.has("serverAuthCode")) {
            s1 = jSONObject0.optString("serverAuthCode");
        }
        googleSignInAccount0.o = s1;
        return googleSignInAccount0;
    }

    public final String zac() {
        return this.q;
    }

    public final String zad() {
        JSONObject jSONObject0 = new JSONObject();
        try {
            if(this.getId() != null) {
                jSONObject0.put("id", this.getId());
            }
            if(this.getIdToken() != null) {
                jSONObject0.put("tokenId", this.getIdToken());
            }
            if(this.getEmail() != null) {
                jSONObject0.put("email", this.getEmail());
            }
            if(this.getDisplayName() != null) {
                jSONObject0.put("displayName", this.getDisplayName());
            }
            if(this.getGivenName() != null) {
                jSONObject0.put("givenName", this.getGivenName());
            }
            if(this.getFamilyName() != null) {
                jSONObject0.put("familyName", this.getFamilyName());
            }
            Uri uri0 = this.getPhotoUrl();
            if(uri0 != null) {
                jSONObject0.put("photoUrl", uri0.toString());
            }
            if(this.getServerAuthCode() != null) {
                jSONObject0.put("serverAuthCode", this.getServerAuthCode());
            }
            jSONObject0.put("expirationTime", this.p);
            jSONObject0.put("obfuscatedIdentifier", this.q);
            JSONArray jSONArray0 = new JSONArray();
            Scope[] arr_scope = (Scope[])this.r.toArray(new Scope[this.r.size()]);
            Arrays.sort(arr_scope, zaa.zaa);
            for(int v = 0; v < arr_scope.length; ++v) {
                jSONArray0.put(arr_scope[v].getScopeUri());
            }
            jSONObject0.put("grantedScopes", jSONArray0);
        }
        catch(JSONException jSONException0) {
            throw new RuntimeException(jSONException0);
        }
        jSONObject0.remove("serverAuthCode");
        return jSONObject0.toString();
    }
}

