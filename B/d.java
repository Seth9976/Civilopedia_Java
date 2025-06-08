package B;

import J2.j;
import N.o;
import O2.l;
import R2.X;
import R2.v;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.api.Scope;
import com.spears.civilopedia.db.tables.AppealHousingChanges;
import com.spears.civilopedia.db.tables.CityNames;
import com.spears.civilopedia.db.tables.FrontendCivilizationItems;
import java.io.File;
import java.lang.reflect.Method;
import java.util.Comparator;
import o2.C;

public final class d implements Comparator {
    public final int i;

    public d(int v) {
        this.i = v;
        super();
    }

    @Override
    public final int compare(Object object0, Object object1) {
        switch(this.i) {
            case 0: {
                if(((byte[])object0).length != ((byte[])object1).length) {
                    return ((byte[])object0).length - ((byte[])object1).length;
                }
                for(int v = 0; v < ((byte[])object0).length; ++v) {
                    int v1 = ((byte[])object0)[v];
                    int v2 = ((byte[])object1)[v];
                    if(v1 != v2) {
                        return v1 - v2;
                    }
                }
                return 0;
            }
            case 1: {
                return ((Scope)object0).getScopeUri().compareTo(((Scope)object1).getScopeUri());
            }
            case 2: {
                RecyclerView recyclerView0 = ((o)object0).d;
                if((recyclerView0 == null ? 1 : 0) != (((o)object1).d == null ? 1 : 0)) {
                    return recyclerView0 == null ? 1 : -1;
                }
                boolean z = ((o)object0).a;
                if(z != ((o)object1).a) {
                    return z ? -1 : 1;
                }
                int v3 = ((o)object1).b - ((o)object0).b;
                if(v3 != 0) {
                    return v3;
                }
                int v4 = ((o)object0).c - ((o)object1).c;
                return v4 == 0 ? 0 : v4;
            }
            case 3: {
                return C.c(((Method)object0).getName(), ((Method)object1).getName());
            }
            case 4: {
                return C.c(((X)(((l)object0))).c(), ((X)(((l)object1))).c());
            }
            case 5: {
                return ((Number)v.j.a(object0, object1)).intValue();
            }
            case 6: {
                return ((Comparable)object0).compareTo(((Comparable)object1));
            }
            case 7: {
                return C.c(((FrontendCivilizationItems)object0).getSortIndex(), ((FrontendCivilizationItems)object1).getSortIndex());
            }
            case 8: {
                return C.c(((FrontendCivilizationItems)object0).getSortIndex(), ((FrontendCivilizationItems)object1).getSortIndex());
            }
            case 9: {
                return C.c(((FrontendCivilizationItems)object0).getSortIndex(), ((FrontendCivilizationItems)object1).getSortIndex());
            }
            case 10: {
                return C.c(((AppealHousingChanges)object0).getMinimumValue(), ((AppealHousingChanges)object1).getMinimumValue());
            }
            case 11: {
                return C.c(((File)object1).lastModified(), ((File)object0).lastModified());
            }
            default: {
                Integer integer0 = ((CityNames)object0).getID();
                j.c(integer0);
                Integer integer1 = ((CityNames)object1).getID();
                j.c(integer1);
                return C.c(integer0, integer1);
            }
        }
    }
}

