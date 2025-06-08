package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000B\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\u0005\u001A\u00020\u0003\u0012\b\u0010\u0006\u001A\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001A\u00020\b\u0012\u0006\u0010\t\u001A\u00020\b¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001A\u00020\u0003HÆ\u0003J\u000B\u0010\u0016\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0017\u001A\u00020\bHÆ\u0003J\t\u0010\u0018\u001A\u00020\bHÆ\u0003JG\u0010\u0019\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00032\b\b\u0002\u0010\u0005\u001A\u00020\u00032\n\b\u0002\u0010\u0006\u001A\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001A\u00020\b2\b\b\u0002\u0010\t\u001A\u00020\bHÆ\u0001J\u0013\u0010\u001A\u001A\u00020\u001B2\b\u0010\u001C\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001D\u001A\u00020\bHÖ\u0001J\t\u0010\u001E\u001A\u00020\u0003HÖ\u0001R\u0013\u0010\u0006\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000B\u0010\fR\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000E\u0010\fR\u0011\u0010\u0004\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000F\u0010\fR\u0011\u0010\t\u001A\u00020\b¢\u0006\b\n\u0000\u001A\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0007\u001A\u00020\b¢\u0006\b\n\u0000\u001A\u0004\b\u0012\u0010\u0011¨\u0006\u001F"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ5MapScriptOptionPossibleValues;", "", "fileName", "", "optionID", "name", "description", "value", "", "sortIndex", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;II)V", "getDescription", "()Ljava/lang/String;", "getFileName", "getName", "getOptionID", "getSortIndex", "()I", "getValue", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ5MapScriptOptionPossibleValues {
    private final String description;
    private final String fileName;
    private final String name;
    private final String optionID;
    private final int sortIndex;
    private final int value;

    public Civ5MapScriptOptionPossibleValues(String s, String s1, String s2, String s3, int v, int v1) {
        j.f(s, "fileName");
        j.f(s1, "optionID");
        j.f(s2, "name");
        super();
        this.fileName = s;
        this.optionID = s1;
        this.name = s2;
        this.description = s3;
        this.value = v;
        this.sortIndex = v1;
    }

    public final String component1() {
        return this.fileName;
    }

    public final String component2() {
        return this.optionID;
    }

    public final String component3() {
        return this.name;
    }

    public final String component4() {
        return this.description;
    }

    public final int component5() {
        return this.value;
    }

    public final int component6() {
        return this.sortIndex;
    }

    public final Civ5MapScriptOptionPossibleValues copy(String s, String s1, String s2, String s3, int v, int v1) {
        j.f(s, "fileName");
        j.f(s1, "optionID");
        j.f(s2, "name");
        return new Civ5MapScriptOptionPossibleValues(s, s1, s2, s3, v, v1);
    }

    public static Civ5MapScriptOptionPossibleValues copy$default(Civ5MapScriptOptionPossibleValues civ5MapScriptOptionPossibleValues0, String s, String s1, String s2, String s3, int v, int v1, int v2, Object object0) {
        if((v2 & 1) != 0) {
            s = civ5MapScriptOptionPossibleValues0.fileName;
        }
        if((v2 & 2) != 0) {
            s1 = civ5MapScriptOptionPossibleValues0.optionID;
        }
        if((v2 & 4) != 0) {
            s2 = civ5MapScriptOptionPossibleValues0.name;
        }
        if((v2 & 8) != 0) {
            s3 = civ5MapScriptOptionPossibleValues0.description;
        }
        if((v2 & 16) != 0) {
            v = civ5MapScriptOptionPossibleValues0.value;
        }
        if((v2 & 0x20) != 0) {
            v1 = civ5MapScriptOptionPossibleValues0.sortIndex;
        }
        return civ5MapScriptOptionPossibleValues0.copy(s, s1, s2, s3, v, v1);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ5MapScriptOptionPossibleValues)) {
            return false;
        }
        if(!j.a(this.fileName, ((Civ5MapScriptOptionPossibleValues)object0).fileName)) {
            return false;
        }
        if(!j.a(this.optionID, ((Civ5MapScriptOptionPossibleValues)object0).optionID)) {
            return false;
        }
        if(!j.a(this.name, ((Civ5MapScriptOptionPossibleValues)object0).name)) {
            return false;
        }
        if(!j.a(this.description, ((Civ5MapScriptOptionPossibleValues)object0).description)) {
            return false;
        }
        return this.value == ((Civ5MapScriptOptionPossibleValues)object0).value ? this.sortIndex == ((Civ5MapScriptOptionPossibleValues)object0).sortIndex : false;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getFileName() {
        return this.fileName;
    }

    public final String getName() {
        return this.name;
    }

    public final String getOptionID() {
        return this.optionID;
    }

    public final int getSortIndex() {
        return this.sortIndex;
    }

    public final int getValue() {
        return this.value;
    }

    @Override
    public int hashCode() {
        int v = f.b(f.b(this.fileName.hashCode() * 0x1F, 0x1F, this.optionID), 0x1F, this.name);
        return this.description == null ? (v * 0x1F + this.value) * 0x1F + this.sortIndex : ((v + this.description.hashCode()) * 0x1F + this.value) * 0x1F + this.sortIndex;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = e.j("Civ5MapScriptOptionPossibleValues(fileName=", this.fileName, ", optionID=", this.optionID, ", name=");
        f.t(stringBuilder0, this.name, ", description=", this.description, ", value=");
        stringBuilder0.append(this.value);
        stringBuilder0.append(", sortIndex=");
        stringBuilder0.append(this.sortIndex);
        stringBuilder0.append(")");
        return stringBuilder0.toString();
    }
}

