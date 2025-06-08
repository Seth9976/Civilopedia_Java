package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import com.google.android.gms.internal.ads.u9;
import i3.e;
import kotlin.Metadata;
import o2.m;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000B\n\u0002\b(\n\u0002\u0010\u0000\n\u0002\b\u001D\b\u0086\b\u0018\u00002\u00020\u0001B\u00C5\u0001\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0002\u0012\b\u0010\u0006\u001A\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001A\u0004\u0018\u00010\u0002\u0012\u0006\u0010\t\u001A\u00020\b\u0012\u0006\u0010\n\u001A\u00020\u0002\u0012\u0006\u0010\u000B\u001A\u00020\b\u0012\b\u0010\f\u001A\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001A\u0004\u0018\u00010\u0002\u0012\b\u0010\u000E\u001A\u0004\u0018\u00010\u0002\u0012\b\u0010\u000F\u001A\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001A\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0012\u001A\u00020\u0011\u0012\u0006\u0010\u0013\u001A\u00020\u0011\u0012\b\u0010\u0014\u001A\u0004\u0018\u00010\b\u0012\b\u0010\u0015\u001A\u0004\u0018\u00010\b\u0012\b\u0010\u0016\u001A\u0004\u0018\u00010\u0002\u0012\b\u0010\u0017\u001A\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0018\u001A\u00020\u0011\u0012\u0006\u0010\u0019\u001A\u00020\u0011\u00A2\u0006\u0004\b\u001A\u0010\u001BJ\u000F\u0010\u001C\u001A\u00020\u0002H\u0016\u00A2\u0006\u0004\b\u001C\u0010\u001DJ\u0010\u0010\u001E\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u001E\u0010\u001DJ\u0010\u0010\u001F\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u001F\u0010\u001DJ\u0010\u0010 \u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b \u0010\u001DJ\u0012\u0010!\u001A\u0004\u0018\u00010\u0002H\u00C6\u0003\u00A2\u0006\u0004\b!\u0010\u001DJ\u0012\u0010\"\u001A\u0004\u0018\u00010\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\"\u0010\u001DJ\u0010\u0010#\u001A\u00020\bH\u00C6\u0003\u00A2\u0006\u0004\b#\u0010$J\u0010\u0010%\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b%\u0010\u001DJ\u0010\u0010&\u001A\u00020\bH\u00C6\u0003\u00A2\u0006\u0004\b&\u0010$J\u0012\u0010\'\u001A\u0004\u0018\u00010\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\'\u0010\u001DJ\u0012\u0010(\u001A\u0004\u0018\u00010\u0002H\u00C6\u0003\u00A2\u0006\u0004\b(\u0010\u001DJ\u0012\u0010)\u001A\u0004\u0018\u00010\u0002H\u00C6\u0003\u00A2\u0006\u0004\b)\u0010\u001DJ\u0012\u0010*\u001A\u0004\u0018\u00010\u0002H\u00C6\u0003\u00A2\u0006\u0004\b*\u0010\u001DJ\u0012\u0010+\u001A\u0004\u0018\u00010\u0002H\u00C6\u0003\u00A2\u0006\u0004\b+\u0010\u001DJ\u0010\u0010,\u001A\u00020\u0011H\u00C6\u0003\u00A2\u0006\u0004\b,\u0010-J\u0010\u0010.\u001A\u00020\u0011H\u00C6\u0003\u00A2\u0006\u0004\b.\u0010-J\u0012\u0010/\u001A\u0004\u0018\u00010\bH\u00C6\u0003\u00A2\u0006\u0004\b/\u00100J\u0012\u00101\u001A\u0004\u0018\u00010\bH\u00C6\u0003\u00A2\u0006\u0004\b1\u00100J\u0012\u00102\u001A\u0004\u0018\u00010\u0002H\u00C6\u0003\u00A2\u0006\u0004\b2\u0010\u001DJ\u0012\u00103\u001A\u0004\u0018\u00010\u0002H\u00C6\u0003\u00A2\u0006\u0004\b3\u0010\u001DJ\u0010\u00104\u001A\u00020\u0011H\u00C6\u0003\u00A2\u0006\u0004\b4\u0010-J\u0010\u00105\u001A\u00020\u0011H\u00C6\u0003\u00A2\u0006\u0004\b5\u0010-J\u00F8\u0001\u00106\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0004\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00022\n\b\u0002\u0010\u0006\u001A\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u00022\b\b\u0002\u0010\t\u001A\u00020\b2\b\b\u0002\u0010\n\u001A\u00020\u00022\b\b\u0002\u0010\u000B\u001A\u00020\b2\n\b\u0002\u0010\f\u001A\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001A\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000E\u001A\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000F\u001A\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0010\u001A\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0012\u001A\u00020\u00112\b\b\u0002\u0010\u0013\u001A\u00020\u00112\n\b\u0002\u0010\u0014\u001A\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0015\u001A\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0016\u001A\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0017\u001A\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0018\u001A\u00020\u00112\b\b\u0002\u0010\u0019\u001A\u00020\u0011H\u00C6\u0001\u00A2\u0006\u0004\b6\u00107J\u0010\u00108\u001A\u00020\u0002H\u00D6\u0001\u00A2\u0006\u0004\b8\u0010\u001DJ\u0010\u00109\u001A\u00020\bH\u00D6\u0001\u00A2\u0006\u0004\b9\u0010$J\u001A\u0010<\u001A\u00020\u00112\b\u0010;\u001A\u0004\u0018\u00010:H\u00D6\u0003\u00A2\u0006\u0004\b<\u0010=R\u0017\u0010\u0003\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b\u0003\u0010>\u001A\u0004\b?\u0010\u001DR\u0017\u0010\u0004\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b\u0004\u0010>\u001A\u0004\b@\u0010\u001DR\u0017\u0010\u0005\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b\u0005\u0010>\u001A\u0004\bA\u0010\u001DR\u0019\u0010\u0006\u001A\u0004\u0018\u00010\u00028\u0006\u00A2\u0006\f\n\u0004\b\u0006\u0010>\u001A\u0004\bB\u0010\u001DR\u0019\u0010\u0007\u001A\u0004\u0018\u00010\u00028\u0006\u00A2\u0006\f\n\u0004\b\u0007\u0010>\u001A\u0004\bC\u0010\u001DR\u0017\u0010\t\u001A\u00020\b8\u0006\u00A2\u0006\f\n\u0004\b\t\u0010D\u001A\u0004\bE\u0010$R\u0017\u0010\n\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b\n\u0010>\u001A\u0004\bF\u0010\u001DR\u0017\u0010\u000B\u001A\u00020\b8\u0006\u00A2\u0006\f\n\u0004\b\u000B\u0010D\u001A\u0004\bG\u0010$R\u0019\u0010\f\u001A\u0004\u0018\u00010\u00028\u0006\u00A2\u0006\f\n\u0004\b\f\u0010>\u001A\u0004\bH\u0010\u001DR\u0019\u0010\r\u001A\u0004\u0018\u00010\u00028\u0006\u00A2\u0006\f\n\u0004\b\r\u0010>\u001A\u0004\bI\u0010\u001DR\u0019\u0010\u000E\u001A\u0004\u0018\u00010\u00028\u0006\u00A2\u0006\f\n\u0004\b\u000E\u0010>\u001A\u0004\bJ\u0010\u001DR\u0019\u0010\u000F\u001A\u0004\u0018\u00010\u00028\u0006\u00A2\u0006\f\n\u0004\b\u000F\u0010>\u001A\u0004\bK\u0010\u001DR\u0019\u0010\u0010\u001A\u0004\u0018\u00010\u00028\u0006\u00A2\u0006\f\n\u0004\b\u0010\u0010>\u001A\u0004\bL\u0010\u001DR\u0017\u0010\u0012\u001A\u00020\u00118\u0006\u00A2\u0006\f\n\u0004\b\u0012\u0010M\u001A\u0004\bN\u0010-R\u0017\u0010\u0013\u001A\u00020\u00118\u0006\u00A2\u0006\f\n\u0004\b\u0013\u0010M\u001A\u0004\bO\u0010-R\u0019\u0010\u0014\u001A\u0004\u0018\u00010\b8\u0006\u00A2\u0006\f\n\u0004\b\u0014\u0010P\u001A\u0004\bQ\u00100R\u0019\u0010\u0015\u001A\u0004\u0018\u00010\b8\u0006\u00A2\u0006\f\n\u0004\b\u0015\u0010P\u001A\u0004\bR\u00100R\u0019\u0010\u0016\u001A\u0004\u0018\u00010\u00028\u0006\u00A2\u0006\f\n\u0004\b\u0016\u0010>\u001A\u0004\bS\u0010\u001DR\u0019\u0010\u0017\u001A\u0004\u0018\u00010\u00028\u0006\u00A2\u0006\f\n\u0004\b\u0017\u0010>\u001A\u0004\bT\u0010\u001DR\u0017\u0010\u0018\u001A\u00020\u00118\u0006\u00A2\u0006\f\n\u0004\b\u0018\u0010M\u001A\u0004\bU\u0010-R\u0017\u0010\u0019\u001A\u00020\u00118\u0006\u00A2\u0006\f\n\u0004\b\u0019\u0010M\u001A\u0004\bV\u0010-\u00A8\u0006W"}, d2 = {"Lcom/spears/civilopedia/db/tables/Projects;", "Lo2/m;", "", "projectType", "name", "shortName", "description", "popupText", "", "cost", "costProgressionModel", "costProgressionParam1", "prereqTech", "prereqCivic", "prereqDistrict", "requiredBuilding", "visualBuildingType", "", "spaceRace", "outerDefenseRepair", "maxPlayerInstances", "amenitiesWhileActive", "prereqResource", "advisorType", "wMD", "unlocksFromEffect", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;ZZ)V", "primaryKey", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "component6", "()I", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "()Z", "component15", "component16", "()Ljava/lang/Integer;", "component17", "component18", "component19", "component20", "component21", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;ZZ)Lcom/spears/civilopedia/db/tables/Projects;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getProjectType", "getName", "getShortName", "getDescription", "getPopupText", "I", "getCost", "getCostProgressionModel", "getCostProgressionParam1", "getPrereqTech", "getPrereqCivic", "getPrereqDistrict", "getRequiredBuilding", "getVisualBuildingType", "Z", "getSpaceRace", "getOuterDefenseRepair", "Ljava/lang/Integer;", "getMaxPlayerInstances", "getAmenitiesWhileActive", "getPrereqResource", "getAdvisorType", "getWMD", "getUnlocksFromEffect", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Projects implements m {
    private final String advisorType;
    private final Integer amenitiesWhileActive;
    private final int cost;
    private final String costProgressionModel;
    private final int costProgressionParam1;
    private final String description;
    private final Integer maxPlayerInstances;
    private final String name;
    private final boolean outerDefenseRepair;
    private final String popupText;
    private final String prereqCivic;
    private final String prereqDistrict;
    private final String prereqResource;
    private final String prereqTech;
    private final String projectType;
    private final String requiredBuilding;
    private final String shortName;
    private final boolean spaceRace;
    private final boolean unlocksFromEffect;
    private final String visualBuildingType;
    private final boolean wMD;

    public Projects(String s, String s1, String s2, String s3, String s4, int v, String s5, int v1, String s6, String s7, String s8, String s9, String s10, boolean z, boolean z1, Integer integer0, Integer integer1, String s11, String s12, boolean z2, boolean z3) {
        j.f(s, "projectType");
        j.f(s1, "name");
        j.f(s2, "shortName");
        j.f(s5, "costProgressionModel");
        super();
        this.projectType = s;
        this.name = s1;
        this.shortName = s2;
        this.description = s3;
        this.popupText = s4;
        this.cost = v;
        this.costProgressionModel = s5;
        this.costProgressionParam1 = v1;
        this.prereqTech = s6;
        this.prereqCivic = s7;
        this.prereqDistrict = s8;
        this.requiredBuilding = s9;
        this.visualBuildingType = s10;
        this.spaceRace = z;
        this.outerDefenseRepair = z1;
        this.maxPlayerInstances = integer0;
        this.amenitiesWhileActive = integer1;
        this.prereqResource = s11;
        this.advisorType = s12;
        this.wMD = z2;
        this.unlocksFromEffect = z3;
    }

    public final String component1() {
        return this.projectType;
    }

    public final String component10() {
        return this.prereqCivic;
    }

    public final String component11() {
        return this.prereqDistrict;
    }

    public final String component12() {
        return this.requiredBuilding;
    }

    public final String component13() {
        return this.visualBuildingType;
    }

    public final boolean component14() {
        return this.spaceRace;
    }

    public final boolean component15() {
        return this.outerDefenseRepair;
    }

    public final Integer component16() {
        return this.maxPlayerInstances;
    }

    public final Integer component17() {
        return this.amenitiesWhileActive;
    }

    public final String component18() {
        return this.prereqResource;
    }

    public final String component19() {
        return this.advisorType;
    }

    public final String component2() {
        return this.name;
    }

    public final boolean component20() {
        return this.wMD;
    }

    public final boolean component21() {
        return this.unlocksFromEffect;
    }

    public final String component3() {
        return this.shortName;
    }

    public final String component4() {
        return this.description;
    }

    public final String component5() {
        return this.popupText;
    }

    public final int component6() {
        return this.cost;
    }

    public final String component7() {
        return this.costProgressionModel;
    }

    public final int component8() {
        return this.costProgressionParam1;
    }

    public final String component9() {
        return this.prereqTech;
    }

    public final Projects copy(String s, String s1, String s2, String s3, String s4, int v, String s5, int v1, String s6, String s7, String s8, String s9, String s10, boolean z, boolean z1, Integer integer0, Integer integer1, String s11, String s12, boolean z2, boolean z3) {
        j.f(s, "projectType");
        j.f(s1, "name");
        j.f(s2, "shortName");
        j.f(s5, "costProgressionModel");
        return new Projects(s, s1, s2, s3, s4, v, s5, v1, s6, s7, s8, s9, s10, z, z1, integer0, integer1, s11, s12, z2, z3);
    }

    public static Projects copy$default(Projects projects0, String s, String s1, String s2, String s3, String s4, int v, String s5, int v1, String s6, String s7, String s8, String s9, String s10, boolean z, boolean z1, Integer integer0, Integer integer1, String s11, String s12, boolean z2, boolean z3, int v2, Object object0) {
        String s13 = (v2 & 1) == 0 ? s : projects0.projectType;
        String s14 = (v2 & 2) == 0 ? s1 : projects0.name;
        String s15 = (v2 & 4) == 0 ? s2 : projects0.shortName;
        String s16 = (v2 & 8) == 0 ? s3 : projects0.description;
        String s17 = (v2 & 16) == 0 ? s4 : projects0.popupText;
        int v3 = (v2 & 0x20) == 0 ? v : projects0.cost;
        String s18 = (v2 & 0x40) == 0 ? s5 : projects0.costProgressionModel;
        int v4 = (v2 & 0x80) == 0 ? v1 : projects0.costProgressionParam1;
        String s19 = (v2 & 0x100) == 0 ? s6 : projects0.prereqTech;
        String s20 = (v2 & 0x200) == 0 ? s7 : projects0.prereqCivic;
        String s21 = (v2 & 0x400) == 0 ? s8 : projects0.prereqDistrict;
        String s22 = (v2 & 0x800) == 0 ? s9 : projects0.requiredBuilding;
        String s23 = (v2 & 0x1000) == 0 ? s10 : projects0.visualBuildingType;
        boolean z4 = (v2 & 0x2000) == 0 ? z : projects0.spaceRace;
        boolean z5 = (v2 & 0x4000) == 0 ? z1 : projects0.outerDefenseRepair;
        Integer integer2 = (v2 & 0x8000) == 0 ? integer0 : projects0.maxPlayerInstances;
        Integer integer3 = (v2 & 0x10000) == 0 ? integer1 : projects0.amenitiesWhileActive;
        String s24 = (v2 & 0x20000) == 0 ? s11 : projects0.prereqResource;
        String s25 = (v2 & 0x40000) == 0 ? s12 : projects0.advisorType;
        boolean z6 = (v2 & 0x80000) == 0 ? z2 : projects0.wMD;
        return (v2 & 0x100000) == 0 ? projects0.copy(s13, s14, s15, s16, s17, v3, s18, v4, s19, s20, s21, s22, s23, z4, z5, integer2, integer3, s24, s25, z6, z3) : projects0.copy(s13, s14, s15, s16, s17, v3, s18, v4, s19, s20, s21, s22, s23, z4, z5, integer2, integer3, s24, s25, z6, projects0.unlocksFromEffect);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Projects)) {
            return false;
        }
        Projects projects0 = (Projects)object0;
        if(!j.a(this.projectType, projects0.projectType)) {
            return false;
        }
        if(!j.a(this.name, projects0.name)) {
            return false;
        }
        if(!j.a(this.shortName, projects0.shortName)) {
            return false;
        }
        if(!j.a(this.description, projects0.description)) {
            return false;
        }
        if(!j.a(this.popupText, projects0.popupText)) {
            return false;
        }
        if(this.cost != projects0.cost) {
            return false;
        }
        if(!j.a(this.costProgressionModel, projects0.costProgressionModel)) {
            return false;
        }
        if(this.costProgressionParam1 != projects0.costProgressionParam1) {
            return false;
        }
        if(!j.a(this.prereqTech, projects0.prereqTech)) {
            return false;
        }
        if(!j.a(this.prereqCivic, projects0.prereqCivic)) {
            return false;
        }
        if(!j.a(this.prereqDistrict, projects0.prereqDistrict)) {
            return false;
        }
        if(!j.a(this.requiredBuilding, projects0.requiredBuilding)) {
            return false;
        }
        if(!j.a(this.visualBuildingType, projects0.visualBuildingType)) {
            return false;
        }
        if(this.spaceRace != projects0.spaceRace) {
            return false;
        }
        if(this.outerDefenseRepair != projects0.outerDefenseRepair) {
            return false;
        }
        if(!j.a(this.maxPlayerInstances, projects0.maxPlayerInstances)) {
            return false;
        }
        if(!j.a(this.amenitiesWhileActive, projects0.amenitiesWhileActive)) {
            return false;
        }
        if(!j.a(this.prereqResource, projects0.prereqResource)) {
            return false;
        }
        if(!j.a(this.advisorType, projects0.advisorType)) {
            return false;
        }
        return this.wMD == projects0.wMD ? this.unlocksFromEffect == projects0.unlocksFromEffect : false;
    }

    public final String getAdvisorType() {
        return this.advisorType;
    }

    public final Integer getAmenitiesWhileActive() {
        return this.amenitiesWhileActive;
    }

    public final int getCost() {
        return this.cost;
    }

    public final String getCostProgressionModel() {
        return this.costProgressionModel;
    }

    public final int getCostProgressionParam1() {
        return this.costProgressionParam1;
    }

    public final String getDescription() {
        return this.description;
    }

    public final Integer getMaxPlayerInstances() {
        return this.maxPlayerInstances;
    }

    public final String getName() {
        return this.name;
    }

    public final boolean getOuterDefenseRepair() {
        return this.outerDefenseRepair;
    }

    public final String getPopupText() {
        return this.popupText;
    }

    public final String getPrereqCivic() {
        return this.prereqCivic;
    }

    public final String getPrereqDistrict() {
        return this.prereqDistrict;
    }

    public final String getPrereqResource() {
        return this.prereqResource;
    }

    public final String getPrereqTech() {
        return this.prereqTech;
    }

    public final String getProjectType() {
        return this.projectType;
    }

    public final String getRequiredBuilding() {
        return this.requiredBuilding;
    }

    public final String getShortName() {
        return this.shortName;
    }

    public final boolean getSpaceRace() {
        return this.spaceRace;
    }

    public final boolean getUnlocksFromEffect() {
        return this.unlocksFromEffect;
    }

    public final String getVisualBuildingType() {
        return this.visualBuildingType;
    }

    public final boolean getWMD() {
        return this.wMD;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = (f.b((((f.b(f.b(this.projectType.hashCode() * 0x1F, 0x1F, this.name), 0x1F, this.shortName) + (this.description == null ? 0 : this.description.hashCode())) * 0x1F + (this.popupText == null ? 0 : this.popupText.hashCode())) * 0x1F + this.cost) * 0x1F, 0x1F, this.costProgressionModel) + this.costProgressionParam1) * 0x1F;
        int v2 = this.prereqTech == null ? 0 : this.prereqTech.hashCode();
        int v3 = this.prereqCivic == null ? 0 : this.prereqCivic.hashCode();
        int v4 = this.prereqDistrict == null ? 0 : this.prereqDistrict.hashCode();
        int v5 = this.requiredBuilding == null ? 0 : this.requiredBuilding.hashCode();
        int v6 = this.visualBuildingType == null ? 0 : this.visualBuildingType.hashCode();
        int v7 = 0x4D5;
        int v8 = this.spaceRace ? 0x4CF : 0x4D5;
        int v9 = this.outerDefenseRepair ? 0x4CF : 0x4D5;
        int v10 = this.maxPlayerInstances == null ? 0 : this.maxPlayerInstances.hashCode();
        int v11 = this.amenitiesWhileActive == null ? 0 : this.amenitiesWhileActive.hashCode();
        int v12 = this.prereqResource == null ? 0 : this.prereqResource.hashCode();
        String s = this.advisorType;
        if(s != null) {
            v = s.hashCode();
        }
        int v13 = this.wMD ? 0x4CF : 0x4D5;
        if(this.unlocksFromEffect) {
            v7 = 0x4CF;
        }
        return ((((((((((((v1 + v2) * 0x1F + v3) * 0x1F + v4) * 0x1F + v5) * 0x1F + v6) * 0x1F + v8) * 0x1F + v9) * 0x1F + v10) * 0x1F + v11) * 0x1F + v12) * 0x1F + v) * 0x1F + v13) * 0x1F + v7;
    }

    @Override  // o2.m
    public String primaryKey() {
        return this.projectType;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = e.j("Projects(projectType=", this.projectType, ", name=", this.name, ", shortName=");
        f.t(stringBuilder0, this.shortName, ", description=", this.description, ", popupText=");
        f.s(stringBuilder0, this.popupText, ", cost=", this.cost, ", costProgressionModel=");
        f.s(stringBuilder0, this.costProgressionModel, ", costProgressionParam1=", this.costProgressionParam1, ", prereqTech=");
        f.t(stringBuilder0, this.prereqTech, ", prereqCivic=", this.prereqCivic, ", prereqDistrict=");
        f.t(stringBuilder0, this.prereqDistrict, ", requiredBuilding=", this.requiredBuilding, ", visualBuildingType=");
        u9.x(stringBuilder0, this.visualBuildingType, ", spaceRace=", this.spaceRace, ", outerDefenseRepair=");
        stringBuilder0.append(this.outerDefenseRepair);
        stringBuilder0.append(", maxPlayerInstances=");
        stringBuilder0.append(this.maxPlayerInstances);
        stringBuilder0.append(", amenitiesWhileActive=");
        e.l(this.amenitiesWhileActive, ", prereqResource=", this.prereqResource, ", advisorType=", stringBuilder0);
        u9.x(stringBuilder0, this.advisorType, ", wMD=", this.wMD, ", unlocksFromEffect=");
        return u9.g(stringBuilder0, this.unlocksFromEffect, ")");
    }
}

