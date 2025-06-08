package f2;

import J2.j;
import J3.d;
import T1.c;
import Y3.a;
import android.content.SharedPreferences;
import android.content.res.Resources;
import com.spears.civilopedia.MyApplication;
import g1.n;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import o2.A;
import o2.H;
import o2.I;
import o2.f;
import o2.g;
import o2.h;
import o2.x;
import o2.y;
import o2.z;
import r2.i;
import z1.a0;

public final class m {
    public final MyApplication a;
    public final SharedPreferences b;
    public f c;
    public x d;
    public c e;
    public h f;
    public g g;
    public n h;
    public i i;
    public i j;
    public E k;

    public m(MyApplication myApplication0, SharedPreferences sharedPreferences0) {
        this.a = myApplication0;
        this.b = sharedPreferences0;
        this.e();
    }

    public final c a() {
        c c0 = this.e;
        if(c0 != null) {
            return c0;
        }
        j.l("db");
        throw null;
    }

    public final f b() {
        f f0 = this.c;
        if(f0 != null) {
            return f0;
        }
        j.l("info");
        throw null;
    }

    public final E c() {
        E e0 = this.k;
        if(e0 != null) {
            return e0;
        }
        j.l("ruleSet");
        throw null;
    }

    public final x d() {
        x x0 = this.d;
        if(x0 != null) {
            return x0;
        }
        j.l("support");
        throw null;
    }

    public final void e() {
        String s3;
        String s2;
        String s1;
        String s = this.b.getString("rule-set-key-text", null);
        E.i.getClass();
        this.k = M1.f.e(s);
        MyApplication.m = this.c();
        this.i = null;
        this.j = null;
        E e0 = this.c();
        MyApplication myApplication0 = this.a;
        p p0 = I.p(myApplication0);
        if(p0 == null) {
            p.i.getClass();
            p0 = d.b();
        }
        p p1 = I.j(p0);
        if(e0.c()) {
            s1 = "civ5";
        }
        else {
            s1 = e0.d() ? "civ6" : "civ7";
        }
        Resources resources0 = myApplication0.getResources();
        switch(p1.ordinal()) {
            case 0: {
                s2 = "en";
                break;
            }
            case 1: {
                s2 = "fr_fr";
                break;
            }
            case 2: {
                s2 = "de_de";
                break;
            }
            case 3: {
                s2 = "it_it";
                break;
            }
            case 4: {
                s2 = "es_es";
                break;
            }
            case 5: {
                s2 = "ja_jp";
                break;
            }
            case 6: {
                s2 = "ru_ru";
                break;
            }
            case 7: {
                s2 = "pl_pl";
                break;
            }
            case 8: {
                s2 = "ko_kr";
                break;
            }
            case 9: {
                s2 = "zh_hans_cn";
                break;
            }
            case 10: {
                s2 = "zh_hant_hk";
                break;
            }
            case 11: {
                s2 = "pt_br";
                break;
            }
            default: {
                throw new NoWhenBranchMatchedException();
            }
        }
        int v = resources0.getIdentifier(A.f.i(s1, "_l10n_", s2), "raw", "com.spears.civilopedia");
        InputStream inputStream0 = myApplication0.getResources().openRawResource(v);
        j.e(inputStream0, "openRawResource(...)");
        BufferedReader bufferedReader0 = new BufferedReader(new InputStreamReader(inputStream0, a.a), 0x2000);
        try {
            s3 = a0.H(bufferedReader0);
        }
        catch(Throwable throwable0) {
            o1.a.e(bufferedReader0, throwable0);
            throw throwable0;
        }
        bufferedReader0.close();
        H h0 = new H();
        Object object0 = new com.google.gson.h().b(s3, h0.b);
        j.e(object0, "fromJson(...)");
        MyApplication.n = (Map)object0;
        this.e = new c(myApplication0, this.c().a());
        if(this.c().c()) {
            g g0 = new g(this.a());
            this.g = g0;
            this.d = new y(g0, this.a());
            return;
        }
        if(this.c().d()) {
            this.c = new f(this.a());
            this.d = new z(this.b(), this.a());
            return;
        }
        this.f = new h(this.a());
        this.h = new n(new c(myApplication0, "Frontend"));
        h h1 = this.f;
        if(h1 != null) {
            this.d = new A(h1, this.a(), this.c());
            return;
        }
        j.l("infoCiv7");
        throw null;
    }
}

