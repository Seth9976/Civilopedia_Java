package f2;

import I2.a;
import J2.j;
import J2.l;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.c;
import androidx.lifecycle.t;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.spears.civilopedia.MyApplication;
import com.spears.civilopedia.SettingsActivity;
import o2.I;
import q2.f;

public final class b implements DialogInterface.OnClickListener {
    public final int i;
    public final Object j;

    public b(a a0) {
        this.i = 2;
        super();
        this.j = (l)a0;
    }

    public b(c c0, int v) {
        this.i = v;
        this.j = c0;
        super();
    }

    @Override  // android.content.DialogInterface$OnClickListener
    public final void onClick(DialogInterface dialogInterface0, int v) {
        switch(this.i) {
            case 0: {
                d d0 = (d)this.j;
                j.f(d0, "this$0");
                e e0 = d0.t0;
                if(e0 != null) {
                    int v1 = d0.r0;
                    if(v1 != -1) {
                        String s = d0.getTag();
                        if(s != null) {
                            switch(s.hashCode()) {
                                case -2088601585: {
                                    if(s.equals("LANGUAGE_DIALOG")) {
                                        p p0 = (p)p.w.get(v1);
                                        f2.l l0 = ((SettingsActivity)e0).l();
                                        p0.getClass();
                                        l0.a.edit().putString("language-name", p0.toString()).apply();
                                        ((SettingsActivity)e0).recreate();
                                        d0.dismiss();
                                        I.v(((SettingsActivity)e0));
                                        ((SettingsActivity)e0).l().b.e();
                                        ((SettingsActivity)e0).n();
                                        return;
                                    }
                                    break;
                                }
                                case 0x51FFBFC3: {
                                    if(s.equals("RULE_SET_DIALOG_TAG")) {
                                        E.i.getClass();
                                        E e1 = E.j[v1];
                                        Object object0 = ((SettingsActivity)e0).l().c.b().e;
                                        if(object0 == t.k) {
                                            object0 = null;
                                        }
                                        if(!(((f)object0) == null ? false : ((f)object0).a)) {
                                            e1.getClass();
                                            if(e1 == E.o || e1 == E.p || e1 == E.q || e1.c()) {
                                                z z0 = new z(0);
                                                Bundle bundle0 = new Bundle();
                                                bundle0.putBoolean("PURCHASED", false);
                                                z0.setArguments(bundle0);
                                                z0.show(((SettingsActivity)e0).g(), "PREMIUM_DIALOG_TAG");
                                                return;
                                            }
                                        }
                                        Bundle bundle1 = new Bundle();
                                        bundle1.putString("item_name", e1.a());
                                        FirebaseAnalytics firebaseAnalytics0 = ((SettingsActivity)e0).B;
                                        if(firebaseAnalytics0 != null) {
                                            firebaseAnalytics0.a("ruleset_selected", bundle1);
                                            ((SettingsActivity)e0).l().a.edit().putString("rule-set-key-text", e1.e()).apply();
                                            MyApplication.m = e1;
                                            I.v(((SettingsActivity)e0));
                                            ((SettingsActivity)e0).l().b.e();
                                            ((SettingsActivity)e0).n();
                                            return;
                                        }
                                        j.l("mFirebaseAnalytics");
                                        throw null;
                                    }
                                    break;
                                }
                                default: {
                                    return;
                                }
                            }
                        }
                    }
                }
                return;
            }
            case 1: {
                j.f(((z)this.j), "this$0");
                A a0 = (A)((z)this.j).r0;
                if(a0 != null) {
                    a0.b();
                }
                return;
            }
            default: {
                ((a)(((l)this.j))).invoke();
            }
        }
    }
}

