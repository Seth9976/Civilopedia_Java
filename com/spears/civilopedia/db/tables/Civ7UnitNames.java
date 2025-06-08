package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000E\n\u0002\b\f\n\u0002\u0010\u000B\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001D\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0005\u0012\u0006\u0010\u0006\u001A\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001A\u00020\u0003HÆ\u0003J\t\u0010\u000E\u001A\u00020\u0005HÆ\u0003J\t\u0010\u000F\u001A\u00020\u0005HÆ\u0003J\'\u0010\u0010\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00052\b\b\u0002\u0010\u0006\u001A\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001A\u00020\u00122\b\u0010\u0013\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001A\u00020\u0003HÖ\u0001J\t\u0010\u0015\u001A\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001A\u00020\u0005¢\u0006\b\n\u0000\u001A\u0004\b\n\u0010\u000BR\u0011\u0010\u0006\u001A\u00020\u0005¢\u0006\b\n\u0000\u001A\u0004\b\f\u0010\u000B¨\u0006\u0016"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ7UnitNames;", "", "ID", "", "nameType", "", "textKey", "(ILjava/lang/String;Ljava/lang/String;)V", "getID", "()I", "getNameType", "()Ljava/lang/String;", "getTextKey", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ7UnitNames {
    private final int ID;
    private final String nameType;
    private final String textKey;

    public Civ7UnitNames(int v, String s, String s1) {
        j.f(s, "nameType");
        j.f(s1, "textKey");
        super();
        this.ID = v;
        this.nameType = s;
        this.textKey = s1;
    }

    public final int component1() {
        return this.ID;
    }

    public final String component2() {
        return this.nameType;
    }

    public final String component3() {
        return this.textKey;
    }

    public final Civ7UnitNames copy(int v, String s, String s1) {
        j.f(s, "nameType");
        j.f(s1, "textKey");
        return new Civ7UnitNames(v, s, s1);
    }

    public static Civ7UnitNames copy$default(Civ7UnitNames civ7UnitNames0, int v, String s, String s1, int v1, Object object0) {
        if((v1 & 1) != 0) {
            v = civ7UnitNames0.ID;
        }
        if((v1 & 2) != 0) {
            s = civ7UnitNames0.nameType;
        }
        if((v1 & 4) != 0) {
            s1 = civ7UnitNames0.textKey;
        }
        return civ7UnitNames0.copy(v, s, s1);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ7UnitNames)) {
            return false;
        }
        if(this.ID != ((Civ7UnitNames)object0).ID) {
            return false;
        }
        return j.a(this.nameType, ((Civ7UnitNames)object0).nameType) ? j.a(this.textKey, ((Civ7UnitNames)object0).textKey) : false;
    }

    public final int getID() {
        return this.ID;
    }

    public final String getNameType() {
        return this.nameType;
    }

    public final String getTextKey() {
        return this.textKey;
    }

    @Override
    public int hashCode() {
        return this.textKey.hashCode() + f.b(this.ID * 0x1F, 0x1F, this.nameType);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("Civ7UnitNames(ID=");
        stringBuilder0.append(this.ID);
        stringBuilder0.append(", nameType=");
        stringBuilder0.append(this.nameType);
        stringBuilder0.append(", textKey=");
        return e.h(stringBuilder0, this.textKey, ")");
    }
}

