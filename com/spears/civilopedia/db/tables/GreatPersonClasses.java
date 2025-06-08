package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import i3.e;
import kotlin.Metadata;
import o2.m;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0002\b\u0017\n\u0002\u0010\u0000\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0002\u0012\u0006\u0010\u0006\u001A\u00020\u0002\u0012\b\u0010\b\u001A\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001A\u0004\u0018\u00010\u0002\u0012\u0006\u0010\n\u001A\u00020\u0002\u0012\u0006\u0010\u000B\u001A\u00020\u0002\u0012\u0006\u0010\r\u001A\u00020\f\u0012\u0006\u0010\u000E\u001A\u00020\f\u00A2\u0006\u0004\b\u000F\u0010\u0010J\u000F\u0010\u0011\u001A\u00020\u0002H\u0016\u00A2\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u0013\u0010\u0012J\u0010\u0010\u0014\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u0014\u0010\u0012J\u0010\u0010\u0015\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u0015\u0010\u0012J\u0010\u0010\u0016\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u0016\u0010\u0012J\u0012\u0010\u0017\u001A\u0004\u0018\u00010\u0007H\u00C6\u0003\u00A2\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001A\u0004\u0018\u00010\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u0019\u0010\u0012J\u0010\u0010\u001A\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u001A\u0010\u0012J\u0010\u0010\u001B\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u001B\u0010\u0012J\u0010\u0010\u001C\u001A\u00020\fH\u00C6\u0003\u00A2\u0006\u0004\b\u001C\u0010\u001DJ\u0010\u0010\u001E\u001A\u00020\fH\u00C6\u0003\u00A2\u0006\u0004\b\u001E\u0010\u001DJx\u0010\u001F\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0004\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00022\b\b\u0002\u0010\u0006\u001A\u00020\u00022\n\b\u0002\u0010\b\u001A\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001A\u0004\u0018\u00010\u00022\b\b\u0002\u0010\n\u001A\u00020\u00022\b\b\u0002\u0010\u000B\u001A\u00020\u00022\b\b\u0002\u0010\r\u001A\u00020\f2\b\b\u0002\u0010\u000E\u001A\u00020\fH\u00C6\u0001\u00A2\u0006\u0004\b\u001F\u0010 J\u0010\u0010!\u001A\u00020\u0002H\u00D6\u0001\u00A2\u0006\u0004\b!\u0010\u0012J\u0010\u0010\"\u001A\u00020\u0007H\u00D6\u0001\u00A2\u0006\u0004\b\"\u0010#J\u001A\u0010&\u001A\u00020\f2\b\u0010%\u001A\u0004\u0018\u00010$H\u00D6\u0003\u00A2\u0006\u0004\b&\u0010\'R\u0017\u0010\u0003\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b\u0003\u0010(\u001A\u0004\b)\u0010\u0012R\u0017\u0010\u0004\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b\u0004\u0010(\u001A\u0004\b*\u0010\u0012R\u0017\u0010\u0005\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b\u0005\u0010(\u001A\u0004\b+\u0010\u0012R\u0017\u0010\u0006\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b\u0006\u0010(\u001A\u0004\b,\u0010\u0012R\u0019\u0010\b\u001A\u0004\u0018\u00010\u00078\u0006\u00A2\u0006\f\n\u0004\b\b\u0010-\u001A\u0004\b.\u0010\u0018R\u0019\u0010\t\u001A\u0004\u0018\u00010\u00028\u0006\u00A2\u0006\f\n\u0004\b\t\u0010(\u001A\u0004\b/\u0010\u0012R\u0017\u0010\n\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b\n\u0010(\u001A\u0004\b0\u0010\u0012R\u0017\u0010\u000B\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b\u000B\u0010(\u001A\u0004\b1\u0010\u0012R\u0017\u0010\r\u001A\u00020\f8\u0006\u00A2\u0006\f\n\u0004\b\r\u00102\u001A\u0004\b3\u0010\u001DR\u0017\u0010\u000E\u001A\u00020\f8\u0006\u00A2\u0006\f\n\u0004\b\u000E\u00102\u001A\u0004\b4\u0010\u001D\u00A8\u00065"}, d2 = {"Lcom/spears/civilopedia/db/tables/GreatPersonClasses;", "Lo2/m;", "", "greatPersonClassType", "name", "unitType", "districtType", "", "maxPlayerInstances", "pseudoYieldType", "iconString", "actionIcon", "", "availableInTimeline", "generateDuplicateIndividuals", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)V", "primaryKey", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "()Ljava/lang/Integer;", "component6", "component7", "component8", "component9", "()Z", "component10", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)Lcom/spears/civilopedia/db/tables/GreatPersonClasses;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getGreatPersonClassType", "getName", "getUnitType", "getDistrictType", "Ljava/lang/Integer;", "getMaxPlayerInstances", "getPseudoYieldType", "getIconString", "getActionIcon", "Z", "getAvailableInTimeline", "getGenerateDuplicateIndividuals", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class GreatPersonClasses implements m {
    private final String actionIcon;
    private final boolean availableInTimeline;
    private final String districtType;
    private final boolean generateDuplicateIndividuals;
    private final String greatPersonClassType;
    private final String iconString;
    private final Integer maxPlayerInstances;
    private final String name;
    private final String pseudoYieldType;
    private final String unitType;

    public GreatPersonClasses(String s, String s1, String s2, String s3, Integer integer0, String s4, String s5, String s6, boolean z, boolean z1) {
        j.f(s, "greatPersonClassType");
        j.f(s1, "name");
        j.f(s2, "unitType");
        j.f(s3, "districtType");
        j.f(s5, "iconString");
        j.f(s6, "actionIcon");
        super();
        this.greatPersonClassType = s;
        this.name = s1;
        this.unitType = s2;
        this.districtType = s3;
        this.maxPlayerInstances = integer0;
        this.pseudoYieldType = s4;
        this.iconString = s5;
        this.actionIcon = s6;
        this.availableInTimeline = z;
        this.generateDuplicateIndividuals = z1;
    }

    public final String component1() {
        return this.greatPersonClassType;
    }

    public final boolean component10() {
        return this.generateDuplicateIndividuals;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.unitType;
    }

    public final String component4() {
        return this.districtType;
    }

    public final Integer component5() {
        return this.maxPlayerInstances;
    }

    public final String component6() {
        return this.pseudoYieldType;
    }

    public final String component7() {
        return this.iconString;
    }

    public final String component8() {
        return this.actionIcon;
    }

    public final boolean component9() {
        return this.availableInTimeline;
    }

    public final GreatPersonClasses copy(String s, String s1, String s2, String s3, Integer integer0, String s4, String s5, String s6, boolean z, boolean z1) {
        j.f(s, "greatPersonClassType");
        j.f(s1, "name");
        j.f(s2, "unitType");
        j.f(s3, "districtType");
        j.f(s5, "iconString");
        j.f(s6, "actionIcon");
        return new GreatPersonClasses(s, s1, s2, s3, integer0, s4, s5, s6, z, z1);
    }

    public static GreatPersonClasses copy$default(GreatPersonClasses greatPersonClasses0, String s, String s1, String s2, String s3, Integer integer0, String s4, String s5, String s6, boolean z, boolean z1, int v, Object object0) {
        String s7 = (v & 1) == 0 ? s : greatPersonClasses0.greatPersonClassType;
        String s8 = (v & 2) == 0 ? s1 : greatPersonClasses0.name;
        String s9 = (v & 4) == 0 ? s2 : greatPersonClasses0.unitType;
        String s10 = (v & 8) == 0 ? s3 : greatPersonClasses0.districtType;
        Integer integer1 = (v & 16) == 0 ? integer0 : greatPersonClasses0.maxPlayerInstances;
        String s11 = (v & 0x20) == 0 ? s4 : greatPersonClasses0.pseudoYieldType;
        String s12 = (v & 0x40) == 0 ? s5 : greatPersonClasses0.iconString;
        String s13 = (v & 0x80) == 0 ? s6 : greatPersonClasses0.actionIcon;
        boolean z2 = (v & 0x100) == 0 ? z : greatPersonClasses0.availableInTimeline;
        return (v & 0x200) == 0 ? greatPersonClasses0.copy(s7, s8, s9, s10, integer1, s11, s12, s13, z2, z1) : greatPersonClasses0.copy(s7, s8, s9, s10, integer1, s11, s12, s13, z2, greatPersonClasses0.generateDuplicateIndividuals);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof GreatPersonClasses)) {
            return false;
        }
        if(!j.a(this.greatPersonClassType, ((GreatPersonClasses)object0).greatPersonClassType)) {
            return false;
        }
        if(!j.a(this.name, ((GreatPersonClasses)object0).name)) {
            return false;
        }
        if(!j.a(this.unitType, ((GreatPersonClasses)object0).unitType)) {
            return false;
        }
        if(!j.a(this.districtType, ((GreatPersonClasses)object0).districtType)) {
            return false;
        }
        if(!j.a(this.maxPlayerInstances, ((GreatPersonClasses)object0).maxPlayerInstances)) {
            return false;
        }
        if(!j.a(this.pseudoYieldType, ((GreatPersonClasses)object0).pseudoYieldType)) {
            return false;
        }
        if(!j.a(this.iconString, ((GreatPersonClasses)object0).iconString)) {
            return false;
        }
        if(!j.a(this.actionIcon, ((GreatPersonClasses)object0).actionIcon)) {
            return false;
        }
        return this.availableInTimeline == ((GreatPersonClasses)object0).availableInTimeline ? this.generateDuplicateIndividuals == ((GreatPersonClasses)object0).generateDuplicateIndividuals : false;
    }

    public final String getActionIcon() {
        return this.actionIcon;
    }

    public final boolean getAvailableInTimeline() {
        return this.availableInTimeline;
    }

    public final String getDistrictType() {
        return this.districtType;
    }

    public final boolean getGenerateDuplicateIndividuals() {
        return this.generateDuplicateIndividuals;
    }

    public final String getGreatPersonClassType() {
        return this.greatPersonClassType;
    }

    public final String getIconString() {
        return this.iconString;
    }

    public final Integer getMaxPlayerInstances() {
        return this.maxPlayerInstances;
    }

    public final String getName() {
        return this.name;
    }

    public final String getPseudoYieldType() {
        return this.pseudoYieldType;
    }

    public final String getUnitType() {
        return this.unitType;
    }

    @Override
    public int hashCode() {
        int v = f.b(f.b(f.b(this.greatPersonClassType.hashCode() * 0x1F, 0x1F, this.name), 0x1F, this.unitType), 0x1F, this.districtType);
        int v1 = 0;
        int v2 = this.maxPlayerInstances == null ? 0 : this.maxPlayerInstances.hashCode();
        String s = this.pseudoYieldType;
        if(s != null) {
            v1 = s.hashCode();
        }
        int v3 = f.b(f.b(((v + v2) * 0x1F + v1) * 0x1F, 0x1F, this.iconString), 0x1F, this.actionIcon);
        int v4 = 0x4D5;
        int v5 = this.availableInTimeline ? 0x4CF : 0x4D5;
        if(this.generateDuplicateIndividuals) {
            v4 = 0x4CF;
        }
        return (v3 + v5) * 0x1F + v4;
    }

    @Override  // o2.m
    public String primaryKey() {
        return this.greatPersonClassType;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = e.j("GreatPersonClasses(greatPersonClassType=", this.greatPersonClassType, ", name=", this.name, ", unitType=");
        f.t(stringBuilder0, this.unitType, ", districtType=", this.districtType, ", maxPlayerInstances=");
        e.l(this.maxPlayerInstances, ", pseudoYieldType=", this.pseudoYieldType, ", iconString=", stringBuilder0);
        f.t(stringBuilder0, this.iconString, ", actionIcon=", this.actionIcon, ", availableInTimeline=");
        stringBuilder0.append(this.availableInTimeline);
        stringBuilder0.append(", generateDuplicateIndividuals=");
        stringBuilder0.append(this.generateDuplicateIndividuals);
        stringBuilder0.append(")");
        return stringBuilder0.toString();
    }
}

