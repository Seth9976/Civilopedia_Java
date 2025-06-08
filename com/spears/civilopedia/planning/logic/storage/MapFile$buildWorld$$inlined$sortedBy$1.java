package com.spears.civilopedia.planning.logic.storage;

import J2.j;
import com.spears.civilopedia.db.tables.CityNames;
import java.util.Comparator;
import kotlin.Metadata;
import o2.C;

@Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0007\u001A\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000E\u0010\u0002\u001A\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000E\u0010\u0003\u001A\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "<anonymous>"}, k = 3, mv = {1, 9, 0})
public final class MapFile.buildWorld..inlined.sortedBy.1 implements Comparator {
    @Override
    public final int compare(Object object0, Object object1) {
        Integer integer0 = ((CityNames)object0).getID();
        j.c(integer0);
        Integer integer1 = ((CityNames)object1).getID();
        j.c(integer1);
        return C.c(integer0, integer1);
    }
}

