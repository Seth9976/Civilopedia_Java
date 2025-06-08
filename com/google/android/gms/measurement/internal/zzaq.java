package com.google.android.gms.measurement.internal;

import A.f;
import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import i1.B;
import java.io.IOException;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import v.j;

public final class zzaq extends B {
    public long c;
    public String d;
    public AccountManager e;
    public Boolean f;
    public long g;

    @Override  // i1.B
    public final boolean b() {
        Calendar calendar0 = Calendar.getInstance();
        TimeUnit timeUnit0 = TimeUnit.MINUTES;
        int v = calendar0.get(15);
        this.c = timeUnit0.convert(((long)(calendar0.get(16) + v)), TimeUnit.MILLISECONDS);
        Locale locale0 = Locale.getDefault();
        String s = locale0.getLanguage();
        Locale locale1 = Locale.ENGLISH;
        this.d = f.i(s.toLowerCase(locale1), "-", locale0.getCountry().toLowerCase(locale1));
        return false;
    }

    public final long d() {
        this.zzg();
        return this.g;
    }

    public final boolean e() {
        this.zzg();
        zzge zzge0 = this.a;
        long v = zzge0.zzav().currentTimeMillis();
        if(v - this.g > 86400000L) {
            this.f = null;
        }
        Boolean boolean0 = this.f;
        if(boolean0 == null) {
            if(j.checkSelfPermission(zzge0.zzau(), "android.permission.GET_ACCOUNTS") != 0) {
                zzge0.zzay().zzm().zza("Permission error checking for dasher/unicorn accounts");
                this.g = v;
                this.f = Boolean.FALSE;
                return false;
            }
            if(this.e == null) {
                this.e = AccountManager.get(zzge0.zzau());
            }
            try {
                Account[] arr_account = (Account[])this.e.getAccountsByTypeAndFeatures("com.google", new String[]{"service_HOSTED"}, null, null).getResult();
                if(arr_account != null && arr_account.length > 0) {
                    this.f = Boolean.TRUE;
                    this.g = v;
                    return true;
                }
                Account[] arr_account1 = (Account[])this.e.getAccountsByTypeAndFeatures("com.google", new String[]{"service_uca"}, null, null).getResult();
                if(arr_account1 != null && arr_account1.length > 0) {
                    this.f = Boolean.TRUE;
                    this.g = v;
                    return true;
                }
            }
            catch(AuthenticatorException | IOException | OperationCanceledException authenticatorException0) {
                zzge0.zzay().zzh().zzb("Exception checking account types", authenticatorException0);
            }
            this.g = v;
            this.f = Boolean.FALSE;
            return false;
        }
        return boolean0.booleanValue();
    }

    public final long zzb() {
        this.c();
        return this.c;
    }

    public final String zzc() {
        this.c();
        return this.d;
    }
}

