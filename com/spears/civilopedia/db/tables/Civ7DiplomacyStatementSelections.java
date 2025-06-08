package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u000F\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0005\u0012\u0006\u0010\u0006\u001A\u00020\u0005\u0012\u0006\u0010\u0007\u001A\u00020\u0005¢\u0006\u0002\u0010\bJ\t\u0010\u000F\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001A\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001A\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001A\u00020\u0005HÆ\u0003J1\u0010\u0013\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00052\b\b\u0002\u0010\u0006\u001A\u00020\u00052\b\b\u0002\u0010\u0007\u001A\u00020\u0005HÆ\u0001J\u0013\u0010\u0014\u001A\u00020\u00152\b\u0010\u0016\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001A\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001A\u00020\u0005HÖ\u0001R\u0011\u0010\u0006\u001A\u00020\u0005¢\u0006\b\n\u0000\u001A\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000B\u0010\fR\u0011\u0010\u0007\u001A\u00020\u0005¢\u0006\b\n\u0000\u001A\u0004\b\r\u0010\nR\u0011\u0010\u0004\u001A\u00020\u0005¢\u0006\b\n\u0000\u001A\u0004\b\u000E\u0010\n¨\u0006\u001A"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ7DiplomacyStatementSelections;", "", "sort", "", "type", "", "key", "text", "(DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getKey", "()Ljava/lang/String;", "getSort", "()D", "getText", "getType", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ7DiplomacyStatementSelections {
    private final String key;
    private final double sort;
    private final String text;
    private final String type;

    public Civ7DiplomacyStatementSelections(double f, String s, String s1, String s2) {
        j.f(s, "type");
        j.f(s1, "key");
        j.f(s2, "text");
        super();
        this.sort = f;
        this.type = s;
        this.key = s1;
        this.text = s2;
    }

    public final double component1() {
        return this.sort;
    }

    public final String component2() {
        return this.type;
    }

    public final String component3() {
        return this.key;
    }

    public final String component4() {
        return this.text;
    }

    public final Civ7DiplomacyStatementSelections copy(double f, String s, String s1, String s2) {
        j.f(s, "type");
        j.f(s1, "key");
        j.f(s2, "text");
        return new Civ7DiplomacyStatementSelections(f, s, s1, s2);
    }

    public static Civ7DiplomacyStatementSelections copy$default(Civ7DiplomacyStatementSelections civ7DiplomacyStatementSelections0, double f, String s, String s1, String s2, int v, Object object0) {
        if((v & 1) != 0) {
            f = civ7DiplomacyStatementSelections0.sort;
        }
        if((v & 2) != 0) {
            s = civ7DiplomacyStatementSelections0.type;
        }
        if((v & 4) != 0) {
            s1 = civ7DiplomacyStatementSelections0.key;
        }
        if((v & 8) != 0) {
            s2 = civ7DiplomacyStatementSelections0.text;
        }
        return civ7DiplomacyStatementSelections0.copy(f, s, s1, s2);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ7DiplomacyStatementSelections)) {
            return false;
        }
        if(Double.compare(this.sort, ((Civ7DiplomacyStatementSelections)object0).sort) != 0) {
            return false;
        }
        if(!j.a(this.type, ((Civ7DiplomacyStatementSelections)object0).type)) {
            return false;
        }
        return j.a(this.key, ((Civ7DiplomacyStatementSelections)object0).key) ? j.a(this.text, ((Civ7DiplomacyStatementSelections)object0).text) : false;
    }

    public final String getKey() {
        return this.key;
    }

    public final double getSort() {
        return this.sort;
    }

    public final String getText() {
        return this.text;
    }

    public final String getType() {
        return this.type;
    }

    @Override
    public int hashCode() {
        long v = Double.doubleToLongBits(this.sort);
        return this.text.hashCode() + f.b(f.b(((int)(v ^ v >>> 0x20)) * 0x1F, 0x1F, this.type), 0x1F, this.key);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("Civ7DiplomacyStatementSelections(sort=");
        stringBuilder0.append(this.sort);
        stringBuilder0.append(", type=");
        stringBuilder0.append(this.type);
        f.t(stringBuilder0, ", key=", this.key, ", text=", this.text);
        stringBuilder0.append(")");
        return stringBuilder0.toString();
    }
}

