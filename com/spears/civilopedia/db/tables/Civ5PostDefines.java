package com.spears.civilopedia.db.tables;

import J2.j;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\f\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001A\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001A\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001A\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\u000B\u0010\u000B\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\u000B\u0010\f\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\u000B\u0010\r\u001A\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000E\u001A\u00020\u00002\n\b\u0002\u0010\u0002\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000F\u001A\u00020\u00102\b\u0010\u0011\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001A\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001A\u00020\u0003HÖ\u0001R\u0013\u0010\u0004\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0007\u0010\bR\u0013\u0010\u0002\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\t\u0010\bR\u0013\u0010\u0005\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ5PostDefines;", "", "name", "", "key", "table", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getKey", "()Ljava/lang/String;", "getName", "getTable", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ5PostDefines {
    private final String key;
    private final String name;
    private final String table;

    public Civ5PostDefines(String s, String s1, String s2) {
        this.name = s;
        this.key = s1;
        this.table = s2;
    }

    public final String component1() {
        return this.name;
    }

    public final String component2() {
        return this.key;
    }

    public final String component3() {
        return this.table;
    }

    public final Civ5PostDefines copy(String s, String s1, String s2) {
        return new Civ5PostDefines(s, s1, s2);
    }

    public static Civ5PostDefines copy$default(Civ5PostDefines civ5PostDefines0, String s, String s1, String s2, int v, Object object0) {
        if((v & 1) != 0) {
            s = civ5PostDefines0.name;
        }
        if((v & 2) != 0) {
            s1 = civ5PostDefines0.key;
        }
        if((v & 4) != 0) {
            s2 = civ5PostDefines0.table;
        }
        return civ5PostDefines0.copy(s, s1, s2);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ5PostDefines)) {
            return false;
        }
        if(!j.a(this.name, ((Civ5PostDefines)object0).name)) {
            return false;
        }
        return j.a(this.key, ((Civ5PostDefines)object0).key) ? j.a(this.table, ((Civ5PostDefines)object0).table) : false;
    }

    public final String getKey() {
        return this.key;
    }

    public final String getName() {
        return this.name;
    }

    public final String getTable() {
        return this.table;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = this.name == null ? 0 : this.name.hashCode();
        int v2 = this.key == null ? 0 : this.key.hashCode();
        String s = this.table;
        if(s != null) {
            v = s.hashCode();
        }
        return (v1 * 0x1F + v2) * 0x1F + v;
    }

    @Override
    public String toString() {
        return e.h(e.j("Civ5PostDefines(name=", this.name, ", key=", this.key, ", table="), this.table, ")");
    }
}

