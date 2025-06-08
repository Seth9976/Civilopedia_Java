package com.google.android.gms.auth.api.signin.internal;

import A.f;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;

@KeepForSdk
public class Storage {
    public final ReentrantLock a;
    public final SharedPreferences b;
    public static final ReentrantLock c;
    public static Storage d;

    static {
        Storage.c = new ReentrantLock();
    }

    public Storage(Context context0) {
        this.a = new ReentrantLock();
        this.b = context0.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    public final String a(String s) {
        this.a.lock();
        try {
            return this.b.getString(s, null);
        }
        finally {
            this.a.unlock();
        }
    }

    public final void b(String s) {
        this.a.lock();
        try {
            this.b.edit().remove(s).apply();
        }
        finally {
            this.a.unlock();
        }
    }

    public final void c(String s, String s1) {
        this.a.lock();
        try {
            this.b.edit().putString(s, s1).apply();
        }
        finally {
            this.a.unlock();
        }
    }

    @KeepForSdk
    public void clear() {
        this.a.lock();
        try {
            this.b.edit().clear().apply();
        }
        finally {
            this.a.unlock();
        }
    }

    public static final String d(String s, String s1) {
        return f.i(s, ":", s1);
    }

    @KeepForSdk
    public static Storage getInstance(Context context0) {
        Preconditions.checkNotNull(context0);
        ReentrantLock reentrantLock0 = Storage.c;
        reentrantLock0.lock();
        try {
            if(Storage.d == null) {
                Storage.d = new Storage(context0.getApplicationContext());
            }
            return Storage.d;
        }
        finally {
            reentrantLock0.unlock();
        }
    }

    @KeepForSdk
    public GoogleSignInAccount getSavedDefaultGoogleSignInAccount() {
        String s = this.a("defaultGoogleSignInAccount");
        if(!TextUtils.isEmpty(s)) {
            String s1 = this.a(Storage.d("googleSignInAccount", s));
            if(s1 != null) {
                try {
                    return GoogleSignInAccount.zab(s1);
                }
                catch(JSONException unused_ex) {
                }
            }
        }
        return null;
    }

    @KeepForSdk
    public GoogleSignInOptions getSavedDefaultGoogleSignInOptions() {
        String s = this.a("defaultGoogleSignInAccount");
        if(!TextUtils.isEmpty(s)) {
            String s1 = this.a(Storage.d("googleSignInOptions", s));
            if(s1 != null) {
                try {
                    return GoogleSignInOptions.zab(s1);
                }
                catch(JSONException unused_ex) {
                }
            }
        }
        return null;
    }

    @KeepForSdk
    public String getSavedRefreshToken() {
        return this.a("refreshToken");
    }

    @KeepForSdk
    public void saveDefaultGoogleSignInAccount(GoogleSignInAccount googleSignInAccount0, GoogleSignInOptions googleSignInOptions0) {
        Preconditions.checkNotNull(googleSignInAccount0);
        Preconditions.checkNotNull(googleSignInOptions0);
        this.c("defaultGoogleSignInAccount", googleSignInAccount0.zac());
        Preconditions.checkNotNull(googleSignInAccount0);
        Preconditions.checkNotNull(googleSignInOptions0);
        String s = googleSignInAccount0.zac();
        this.c(Storage.d("googleSignInAccount", s), googleSignInAccount0.zad());
        this.c(Storage.d("googleSignInOptions", s), googleSignInOptions0.zaf());
    }

    public final void zac() {
        String s = this.a("defaultGoogleSignInAccount");
        this.b("defaultGoogleSignInAccount");
        if(TextUtils.isEmpty(s)) {
            return;
        }
        this.b(Storage.d("googleSignInAccount", s));
        this.b(Storage.d("googleSignInOptions", s));
    }
}

