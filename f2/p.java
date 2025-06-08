package f2;

import C2.a;
import J3.d;
import kotlin.NoWhenBranchMatchedException;

public enum p {
    EN_US,
    FR,
    DE,
    IT,
    ES,
    JA,
    RU,
    PL,
    KO,
    ZH_HANS,
    ZH_HANT,
    PT_BR;

    public static final d i;

    static {
        p.v = arr_p;
        p.w = new a(arr_p);
        p.i = new d(14);
    }

    public final String a() {
        switch(this.ordinal()) {
            case 0: {
                return "English (United States)";
            }
            case 1: {
                return "Français (France)";
            }
            case 2: {
                return "Deutsche (Deutschland)";
            }
            case 3: {
                return "Italiano (Italia)";
            }
            case 4: {
                return "Español (España)";
            }
            case 5: {
                return "日本語(日本)";
            }
            case 6: {
                return "Русский (Россия)";
            }
            case 7: {
                return "Polski (Polska)";
            }
            case 8: {
                return "한국어(대한민국)";
            }
            case 9: {
                return "中文（简体）";
            }
            case 10: {
                return "中文（繁體）";
            }
            case 11: {
                return "Português (Brasil)";
            }
            default: {
                throw new NoWhenBranchMatchedException();
            }
        }
    }
}

