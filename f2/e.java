package f2;

import J2.j;
import M1.f;
import android.content.Context;
import kotlin.NoWhenBranchMatchedException;

public enum E {
    Civ5,
    Civ6StandardRules,
    Civ6RiseAndFall,
    Civ6GatheringStorm,
    Civ7Antiquity,
    Civ7Exploration,
    Civ7Modern;

    public static final f i;
    public static final E[] j;

    static {
        E.i = new f(14);
        E.j = new E[]{E.k, E.l, E.m, E.n, E.o, E.p, E.q};
    }

    public final String a() {
        switch(this.ordinal()) {
            case 0: {
                return "Civ5";
            }
            case 1: {
                return "Civ6StandardRules";
            }
            case 2: {
                return "Civ6RiseAndFall";
            }
            case 3: {
                return "Civ6GatheringStorm";
            }
            case 4: {
                return "Civ7Antiquity";
            }
            case 5: {
                return "Civ7Exploration";
            }
            case 6: {
                return "Civ7Modern";
            }
            default: {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    public final String b(Context context0) {
        j.f(context0, "context");
        switch(this.ordinal()) {
            case 0: {
                j.e("Civilization V", "getString(...)");
                return "Civilization V";
            }
            case 1: {
                j.e("Civilization VI (%s)", "getString(...)");
                return "Civilization VI (Standard Rules)";
            }
            case 2: {
                j.e("Civilization VI (%s)", "getString(...)");
                return "Civilization VI (Rise and Fall)";
            }
            case 3: {
                j.e("Civilization VI (%s)", "getString(...)");
                return "Civilization VI (Gathering Storm)";
            }
            case 4: {
                j.e("Civilization VII (%s)", "getString(...)");
                return "Civilization VII (Antiquity)";
            }
            case 5: {
                j.e("Civilization VII (%s)", "getString(...)");
                return "Civilization VII (Exploration)";
            }
            case 6: {
                j.e("Civilization VII (%s)", "getString(...)");
                return "Civilization VII (Modern)";
            }
            default: {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    public final boolean c() {
        return this == E.k;
    }

    public final boolean d() {
        return this == E.l || this == E.m || this == E.n;
    }

    public final String e() {
        switch(this.ordinal()) {
            case 0: {
                return "civ5";
            }
            case 1: {
                return "civ6_1";
            }
            case 2: {
                return "civ6_2";
            }
            case 3: {
                return "civ6_3";
            }
            case 4: {
                return "civ7_1";
            }
            case 5: {
                return "civ7_2";
            }
            case 6: {
                return "civ7_3";
            }
            default: {
                throw new NoWhenBranchMatchedException();
            }
        }
    }
}

