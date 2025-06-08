package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import com.google.android.gms.internal.ads.u9;
import i3.e;
import kotlin.Metadata;
import o2.m;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b/\n\u0002\u0010\u0000\n\u0002\b\u001C\b\u0086\b\u0018\u00002\u00020\u0001B\u00BF\u0001\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0002\u0012\u0006\u0010\u0007\u001A\u00020\u0006\u0012\u0006\u0010\b\u001A\u00020\u0006\u0012\u0006\u0010\n\u001A\u00020\t\u0012\u0006\u0010\u000B\u001A\u00020\t\u0012\b\u0010\f\u001A\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001A\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000E\u001A\u00020\t\u0012\u0006\u0010\u000F\u001A\u00020\t\u0012\u0006\u0010\u0010\u001A\u00020\t\u0012\b\u0010\u0011\u001A\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001A\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001A\u0004\u0018\u00010\u0002\u0012\b\u0010\u0014\u001A\u0004\u0018\u00010\u0002\u0012\b\u0010\u0015\u001A\u0004\u0018\u00010\u0002\u0012\b\u0010\u0016\u001A\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0017\u001A\u00020\t\u0012\u0006\u0010\u0018\u001A\u00020\u0002\u0012\u0006\u0010\u0019\u001A\u00020\t\u00A2\u0006\u0004\b\u001A\u0010\u001BJ\u000F\u0010\u001C\u001A\u00020\u0002H\u0016\u00A2\u0006\u0004\b\u001C\u0010\u001DJ\u0010\u0010\u001E\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u001E\u0010\u001DJ\u0010\u0010\u001F\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u001F\u0010\u001DJ\u0010\u0010 \u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b \u0010\u001DJ\u0010\u0010!\u001A\u00020\u0006H\u00C6\u0003\u00A2\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001A\u00020\u0006H\u00C6\u0003\u00A2\u0006\u0004\b#\u0010\"J\u0010\u0010$\u001A\u00020\tH\u00C6\u0003\u00A2\u0006\u0004\b$\u0010%J\u0010\u0010&\u001A\u00020\tH\u00C6\u0003\u00A2\u0006\u0004\b&\u0010%J\u0012\u0010\'\u001A\u0004\u0018\u00010\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\'\u0010\u001DJ\u0012\u0010(\u001A\u0004\u0018\u00010\u0002H\u00C6\u0003\u00A2\u0006\u0004\b(\u0010\u001DJ\u0010\u0010)\u001A\u00020\tH\u00C6\u0003\u00A2\u0006\u0004\b)\u0010%J\u0010\u0010*\u001A\u00020\tH\u00C6\u0003\u00A2\u0006\u0004\b*\u0010%J\u0010\u0010+\u001A\u00020\tH\u00C6\u0003\u00A2\u0006\u0004\b+\u0010%J\u0012\u0010,\u001A\u0004\u0018\u00010\u0002H\u00C6\u0003\u00A2\u0006\u0004\b,\u0010\u001DJ\u0012\u0010-\u001A\u0004\u0018\u00010\u0002H\u00C6\u0003\u00A2\u0006\u0004\b-\u0010\u001DJ\u0012\u0010.\u001A\u0004\u0018\u00010\u0002H\u00C6\u0003\u00A2\u0006\u0004\b.\u0010\u001DJ\u0012\u0010/\u001A\u0004\u0018\u00010\u0002H\u00C6\u0003\u00A2\u0006\u0004\b/\u0010\u001DJ\u0012\u00100\u001A\u0004\u0018\u00010\u0002H\u00C6\u0003\u00A2\u0006\u0004\b0\u0010\u001DJ\u0012\u00101\u001A\u0004\u0018\u00010\u0002H\u00C6\u0003\u00A2\u0006\u0004\b1\u0010\u001DJ\u0010\u00102\u001A\u00020\tH\u00C6\u0003\u00A2\u0006\u0004\b2\u0010%J\u0010\u00103\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b3\u0010\u001DJ\u0010\u00104\u001A\u00020\tH\u00C6\u0003\u00A2\u0006\u0004\b4\u0010%J\u00F2\u0001\u00105\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0004\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00022\b\b\u0002\u0010\u0007\u001A\u00020\u00062\b\b\u0002\u0010\b\u001A\u00020\u00062\b\b\u0002\u0010\n\u001A\u00020\t2\b\b\u0002\u0010\u000B\u001A\u00020\t2\n\b\u0002\u0010\f\u001A\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001A\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u000E\u001A\u00020\t2\b\b\u0002\u0010\u000F\u001A\u00020\t2\b\b\u0002\u0010\u0010\u001A\u00020\t2\n\b\u0002\u0010\u0011\u001A\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0012\u001A\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0013\u001A\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0014\u001A\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0015\u001A\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0016\u001A\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0017\u001A\u00020\t2\b\b\u0002\u0010\u0018\u001A\u00020\u00022\b\b\u0002\u0010\u0019\u001A\u00020\tH\u00C6\u0001\u00A2\u0006\u0004\b5\u00106J\u0010\u00107\u001A\u00020\u0002H\u00D6\u0001\u00A2\u0006\u0004\b7\u0010\u001DJ\u0010\u00108\u001A\u00020\u0006H\u00D6\u0001\u00A2\u0006\u0004\b8\u0010\"J\u001A\u0010;\u001A\u00020\t2\b\u0010:\u001A\u0004\u0018\u000109H\u00D6\u0003\u00A2\u0006\u0004\b;\u0010<R\u0017\u0010\u0003\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b\u0003\u0010=\u001A\u0004\b>\u0010\u001DR\u0017\u0010\u0004\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b\u0004\u0010=\u001A\u0004\b?\u0010\u001DR\u0017\u0010\u0005\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b\u0005\u0010=\u001A\u0004\b@\u0010\u001DR\u0017\u0010\u0007\u001A\u00020\u00068\u0006\u00A2\u0006\f\n\u0004\b\u0007\u0010A\u001A\u0004\bB\u0010\"R\u0017\u0010\b\u001A\u00020\u00068\u0006\u00A2\u0006\f\n\u0004\b\b\u0010A\u001A\u0004\bC\u0010\"R\u0017\u0010\n\u001A\u00020\t8\u0006\u00A2\u0006\f\n\u0004\b\n\u0010D\u001A\u0004\bE\u0010%R\u0017\u0010\u000B\u001A\u00020\t8\u0006\u00A2\u0006\f\n\u0004\b\u000B\u0010D\u001A\u0004\bF\u0010%R\u0019\u0010\f\u001A\u0004\u0018\u00010\u00028\u0006\u00A2\u0006\f\n\u0004\b\f\u0010=\u001A\u0004\bG\u0010\u001DR\u0019\u0010\r\u001A\u0004\u0018\u00010\u00028\u0006\u00A2\u0006\f\n\u0004\b\r\u0010=\u001A\u0004\bH\u0010\u001DR\u0017\u0010\u000E\u001A\u00020\t8\u0006\u00A2\u0006\f\n\u0004\b\u000E\u0010D\u001A\u0004\bI\u0010%R\u0017\u0010\u000F\u001A\u00020\t8\u0006\u00A2\u0006\f\n\u0004\b\u000F\u0010D\u001A\u0004\bJ\u0010%R\u0017\u0010\u0010\u001A\u00020\t8\u0006\u00A2\u0006\f\n\u0004\b\u0010\u0010D\u001A\u0004\bK\u0010%R\u0019\u0010\u0011\u001A\u0004\u0018\u00010\u00028\u0006\u00A2\u0006\f\n\u0004\b\u0011\u0010=\u001A\u0004\bL\u0010\u001DR\u0019\u0010\u0012\u001A\u0004\u0018\u00010\u00028\u0006\u00A2\u0006\f\n\u0004\b\u0012\u0010=\u001A\u0004\bM\u0010\u001DR\u0019\u0010\u0013\u001A\u0004\u0018\u00010\u00028\u0006\u00A2\u0006\f\n\u0004\b\u0013\u0010=\u001A\u0004\bN\u0010\u001DR\u0019\u0010\u0014\u001A\u0004\u0018\u00010\u00028\u0006\u00A2\u0006\f\n\u0004\b\u0014\u0010=\u001A\u0004\bO\u0010\u001DR\u0019\u0010\u0015\u001A\u0004\u0018\u00010\u00028\u0006\u00A2\u0006\f\n\u0004\b\u0015\u0010=\u001A\u0004\bP\u0010\u001DR\u0019\u0010\u0016\u001A\u0004\u0018\u00010\u00028\u0006\u00A2\u0006\f\n\u0004\b\u0016\u0010=\u001A\u0004\bQ\u0010\u001DR\u0017\u0010\u0017\u001A\u00020\t8\u0006\u00A2\u0006\f\n\u0004\b\u0017\u0010D\u001A\u0004\bR\u0010%R\u0017\u0010\u0018\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b\u0018\u0010=\u001A\u0004\bS\u0010\u001DR\u0017\u0010\u0019\u001A\u00020\t8\u0006\u00A2\u0006\f\n\u0004\b\u0019\u0010D\u001A\u0004\bT\u0010%\u00A8\u0006U"}, d2 = {"Lcom/spears/civilopedia/db/tables/Adjacency_YieldChanges;", "Lo2/m;", "", "ID", "description", "yieldType", "", "yieldChange", "tilesRequired", "", "otherDistrictAdjacent", "adjacentSeaResource", "adjacentTerrain", "adjacentFeature", "adjacentRiver", "adjacentWonder", "adjacentNaturalWonder", "adjacentImprovement", "adjacentDistrict", "prereqCivic", "prereqTech", "obsoleteCivic", "obsoleteTech", "adjacentResource", "adjacentResourceClass", "self", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIZZLjava/lang/String;Ljava/lang/String;ZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Z)V", "primaryKey", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "()I", "component5", "component6", "()Z", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIZZLjava/lang/String;Ljava/lang/String;ZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Z)Lcom/spears/civilopedia/db/tables/Adjacency_YieldChanges;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getID", "getDescription", "getYieldType", "I", "getYieldChange", "getTilesRequired", "Z", "getOtherDistrictAdjacent", "getAdjacentSeaResource", "getAdjacentTerrain", "getAdjacentFeature", "getAdjacentRiver", "getAdjacentWonder", "getAdjacentNaturalWonder", "getAdjacentImprovement", "getAdjacentDistrict", "getPrereqCivic", "getPrereqTech", "getObsoleteCivic", "getObsoleteTech", "getAdjacentResource", "getAdjacentResourceClass", "getSelf", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Adjacency_YieldChanges implements m {
    private final String ID;
    private final String adjacentDistrict;
    private final String adjacentFeature;
    private final String adjacentImprovement;
    private final boolean adjacentNaturalWonder;
    private final boolean adjacentResource;
    private final String adjacentResourceClass;
    private final boolean adjacentRiver;
    private final boolean adjacentSeaResource;
    private final String adjacentTerrain;
    private final boolean adjacentWonder;
    private final String description;
    private final String obsoleteCivic;
    private final String obsoleteTech;
    private final boolean otherDistrictAdjacent;
    private final String prereqCivic;
    private final String prereqTech;
    private final boolean self;
    private final int tilesRequired;
    private final int yieldChange;
    private final String yieldType;

    public Adjacency_YieldChanges(String s, String s1, String s2, int v, int v1, boolean z, boolean z1, String s3, String s4, boolean z2, boolean z3, boolean z4, String s5, String s6, String s7, String s8, String s9, String s10, boolean z5, String s11, boolean z6) {
        j.f(s, "ID");
        j.f(s1, "description");
        j.f(s2, "yieldType");
        j.f(s11, "adjacentResourceClass");
        super();
        this.ID = s;
        this.description = s1;
        this.yieldType = s2;
        this.yieldChange = v;
        this.tilesRequired = v1;
        this.otherDistrictAdjacent = z;
        this.adjacentSeaResource = z1;
        this.adjacentTerrain = s3;
        this.adjacentFeature = s4;
        this.adjacentRiver = z2;
        this.adjacentWonder = z3;
        this.adjacentNaturalWonder = z4;
        this.adjacentImprovement = s5;
        this.adjacentDistrict = s6;
        this.prereqCivic = s7;
        this.prereqTech = s8;
        this.obsoleteCivic = s9;
        this.obsoleteTech = s10;
        this.adjacentResource = z5;
        this.adjacentResourceClass = s11;
        this.self = z6;
    }

    public final String component1() {
        return this.ID;
    }

    public final boolean component10() {
        return this.adjacentRiver;
    }

    public final boolean component11() {
        return this.adjacentWonder;
    }

    public final boolean component12() {
        return this.adjacentNaturalWonder;
    }

    public final String component13() {
        return this.adjacentImprovement;
    }

    public final String component14() {
        return this.adjacentDistrict;
    }

    public final String component15() {
        return this.prereqCivic;
    }

    public final String component16() {
        return this.prereqTech;
    }

    public final String component17() {
        return this.obsoleteCivic;
    }

    public final String component18() {
        return this.obsoleteTech;
    }

    public final boolean component19() {
        return this.adjacentResource;
    }

    public final String component2() {
        return this.description;
    }

    public final String component20() {
        return this.adjacentResourceClass;
    }

    public final boolean component21() {
        return this.self;
    }

    public final String component3() {
        return this.yieldType;
    }

    public final int component4() {
        return this.yieldChange;
    }

    public final int component5() {
        return this.tilesRequired;
    }

    public final boolean component6() {
        return this.otherDistrictAdjacent;
    }

    public final boolean component7() {
        return this.adjacentSeaResource;
    }

    public final String component8() {
        return this.adjacentTerrain;
    }

    public final String component9() {
        return this.adjacentFeature;
    }

    public final Adjacency_YieldChanges copy(String s, String s1, String s2, int v, int v1, boolean z, boolean z1, String s3, String s4, boolean z2, boolean z3, boolean z4, String s5, String s6, String s7, String s8, String s9, String s10, boolean z5, String s11, boolean z6) {
        j.f(s, "ID");
        j.f(s1, "description");
        j.f(s2, "yieldType");
        j.f(s11, "adjacentResourceClass");
        return new Adjacency_YieldChanges(s, s1, s2, v, v1, z, z1, s3, s4, z2, z3, z4, s5, s6, s7, s8, s9, s10, z5, s11, z6);
    }

    public static Adjacency_YieldChanges copy$default(Adjacency_YieldChanges adjacency_YieldChanges0, String s, String s1, String s2, int v, int v1, boolean z, boolean z1, String s3, String s4, boolean z2, boolean z3, boolean z4, String s5, String s6, String s7, String s8, String s9, String s10, boolean z5, String s11, boolean z6, int v2, Object object0) {
        String s12 = (v2 & 1) == 0 ? s : adjacency_YieldChanges0.ID;
        String s13 = (v2 & 2) == 0 ? s1 : adjacency_YieldChanges0.description;
        String s14 = (v2 & 4) == 0 ? s2 : adjacency_YieldChanges0.yieldType;
        int v3 = (v2 & 8) == 0 ? v : adjacency_YieldChanges0.yieldChange;
        int v4 = (v2 & 16) == 0 ? v1 : adjacency_YieldChanges0.tilesRequired;
        boolean z7 = (v2 & 0x20) == 0 ? z : adjacency_YieldChanges0.otherDistrictAdjacent;
        boolean z8 = (v2 & 0x40) == 0 ? z1 : adjacency_YieldChanges0.adjacentSeaResource;
        String s15 = (v2 & 0x80) == 0 ? s3 : adjacency_YieldChanges0.adjacentTerrain;
        String s16 = (v2 & 0x100) == 0 ? s4 : adjacency_YieldChanges0.adjacentFeature;
        boolean z9 = (v2 & 0x200) == 0 ? z2 : adjacency_YieldChanges0.adjacentRiver;
        boolean z10 = (v2 & 0x400) == 0 ? z3 : adjacency_YieldChanges0.adjacentWonder;
        boolean z11 = (v2 & 0x800) == 0 ? z4 : adjacency_YieldChanges0.adjacentNaturalWonder;
        String s17 = (v2 & 0x1000) == 0 ? s5 : adjacency_YieldChanges0.adjacentImprovement;
        String s18 = (v2 & 0x2000) == 0 ? s6 : adjacency_YieldChanges0.adjacentDistrict;
        String s19 = (v2 & 0x4000) == 0 ? s7 : adjacency_YieldChanges0.prereqCivic;
        String s20 = (v2 & 0x8000) == 0 ? s8 : adjacency_YieldChanges0.prereqTech;
        String s21 = (v2 & 0x10000) == 0 ? s9 : adjacency_YieldChanges0.obsoleteCivic;
        String s22 = (v2 & 0x20000) == 0 ? s10 : adjacency_YieldChanges0.obsoleteTech;
        boolean z12 = (v2 & 0x40000) == 0 ? z5 : adjacency_YieldChanges0.adjacentResource;
        String s23 = (v2 & 0x80000) == 0 ? s11 : adjacency_YieldChanges0.adjacentResourceClass;
        return (v2 & 0x100000) == 0 ? adjacency_YieldChanges0.copy(s12, s13, s14, v3, v4, z7, z8, s15, s16, z9, z10, z11, s17, s18, s19, s20, s21, s22, z12, s23, z6) : adjacency_YieldChanges0.copy(s12, s13, s14, v3, v4, z7, z8, s15, s16, z9, z10, z11, s17, s18, s19, s20, s21, s22, z12, s23, adjacency_YieldChanges0.self);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Adjacency_YieldChanges)) {
            return false;
        }
        Adjacency_YieldChanges adjacency_YieldChanges0 = (Adjacency_YieldChanges)object0;
        if(!j.a(this.ID, adjacency_YieldChanges0.ID)) {
            return false;
        }
        if(!j.a(this.description, adjacency_YieldChanges0.description)) {
            return false;
        }
        if(!j.a(this.yieldType, adjacency_YieldChanges0.yieldType)) {
            return false;
        }
        if(this.yieldChange != adjacency_YieldChanges0.yieldChange) {
            return false;
        }
        if(this.tilesRequired != adjacency_YieldChanges0.tilesRequired) {
            return false;
        }
        if(this.otherDistrictAdjacent != adjacency_YieldChanges0.otherDistrictAdjacent) {
            return false;
        }
        if(this.adjacentSeaResource != adjacency_YieldChanges0.adjacentSeaResource) {
            return false;
        }
        if(!j.a(this.adjacentTerrain, adjacency_YieldChanges0.adjacentTerrain)) {
            return false;
        }
        if(!j.a(this.adjacentFeature, adjacency_YieldChanges0.adjacentFeature)) {
            return false;
        }
        if(this.adjacentRiver != adjacency_YieldChanges0.adjacentRiver) {
            return false;
        }
        if(this.adjacentWonder != adjacency_YieldChanges0.adjacentWonder) {
            return false;
        }
        if(this.adjacentNaturalWonder != adjacency_YieldChanges0.adjacentNaturalWonder) {
            return false;
        }
        if(!j.a(this.adjacentImprovement, adjacency_YieldChanges0.adjacentImprovement)) {
            return false;
        }
        if(!j.a(this.adjacentDistrict, adjacency_YieldChanges0.adjacentDistrict)) {
            return false;
        }
        if(!j.a(this.prereqCivic, adjacency_YieldChanges0.prereqCivic)) {
            return false;
        }
        if(!j.a(this.prereqTech, adjacency_YieldChanges0.prereqTech)) {
            return false;
        }
        if(!j.a(this.obsoleteCivic, adjacency_YieldChanges0.obsoleteCivic)) {
            return false;
        }
        if(!j.a(this.obsoleteTech, adjacency_YieldChanges0.obsoleteTech)) {
            return false;
        }
        if(this.adjacentResource != adjacency_YieldChanges0.adjacentResource) {
            return false;
        }
        return j.a(this.adjacentResourceClass, adjacency_YieldChanges0.adjacentResourceClass) ? this.self == adjacency_YieldChanges0.self : false;
    }

    public final String getAdjacentDistrict() {
        return this.adjacentDistrict;
    }

    public final String getAdjacentFeature() {
        return this.adjacentFeature;
    }

    public final String getAdjacentImprovement() {
        return this.adjacentImprovement;
    }

    public final boolean getAdjacentNaturalWonder() {
        return this.adjacentNaturalWonder;
    }

    public final boolean getAdjacentResource() {
        return this.adjacentResource;
    }

    public final String getAdjacentResourceClass() {
        return this.adjacentResourceClass;
    }

    public final boolean getAdjacentRiver() {
        return this.adjacentRiver;
    }

    public final boolean getAdjacentSeaResource() {
        return this.adjacentSeaResource;
    }

    public final String getAdjacentTerrain() {
        return this.adjacentTerrain;
    }

    public final boolean getAdjacentWonder() {
        return this.adjacentWonder;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getID() {
        return this.ID;
    }

    public final String getObsoleteCivic() {
        return this.obsoleteCivic;
    }

    public final String getObsoleteTech() {
        return this.obsoleteTech;
    }

    public final boolean getOtherDistrictAdjacent() {
        return this.otherDistrictAdjacent;
    }

    public final String getPrereqCivic() {
        return this.prereqCivic;
    }

    public final String getPrereqTech() {
        return this.prereqTech;
    }

    public final boolean getSelf() {
        return this.self;
    }

    public final int getTilesRequired() {
        return this.tilesRequired;
    }

    public final int getYieldChange() {
        return this.yieldChange;
    }

    public final String getYieldType() {
        return this.yieldType;
    }

    @Override
    public int hashCode() {
        int v = ((f.b(f.b(this.ID.hashCode() * 0x1F, 0x1F, this.description), 0x1F, this.yieldType) + this.yieldChange) * 0x1F + this.tilesRequired) * 0x1F;
        int v1 = 0x4D5;
        int v2 = this.otherDistrictAdjacent ? 0x4CF : 0x4D5;
        int v3 = this.adjacentSeaResource ? 0x4CF : 0x4D5;
        int v4 = 0;
        int v5 = this.adjacentTerrain == null ? 0 : this.adjacentTerrain.hashCode();
        int v6 = this.adjacentFeature == null ? 0 : this.adjacentFeature.hashCode();
        int v7 = this.adjacentRiver ? 0x4CF : 0x4D5;
        int v8 = this.adjacentWonder ? 0x4CF : 0x4D5;
        int v9 = this.adjacentNaturalWonder ? 0x4CF : 0x4D5;
        int v10 = this.adjacentImprovement == null ? 0 : this.adjacentImprovement.hashCode();
        int v11 = this.adjacentDistrict == null ? 0 : this.adjacentDistrict.hashCode();
        int v12 = this.prereqCivic == null ? 0 : this.prereqCivic.hashCode();
        int v13 = this.prereqTech == null ? 0 : this.prereqTech.hashCode();
        int v14 = this.obsoleteCivic == null ? 0 : this.obsoleteCivic.hashCode();
        String s = this.obsoleteTech;
        if(s != null) {
            v4 = s.hashCode();
        }
        int v15 = f.b(((((((((((((((v + v2) * 0x1F + v3) * 0x1F + v5) * 0x1F + v6) * 0x1F + v7) * 0x1F + v8) * 0x1F + v9) * 0x1F + v10) * 0x1F + v11) * 0x1F + v12) * 0x1F + v13) * 0x1F + v14) * 0x1F + v4) * 0x1F + (this.adjacentResource ? 0x4CF : 0x4D5)) * 0x1F, 0x1F, this.adjacentResourceClass);
        if(this.self) {
            v1 = 0x4CF;
        }
        return v15 + v1;
    }

    @Override  // o2.m
    public String primaryKey() {
        return this.ID;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = e.j("Adjacency_YieldChanges(ID=", this.ID, ", description=", this.description, ", yieldType=");
        f.s(stringBuilder0, this.yieldType, ", yieldChange=", this.yieldChange, ", tilesRequired=");
        u9.r(stringBuilder0, this.tilesRequired, ", otherDistrictAdjacent=", this.otherDistrictAdjacent, ", adjacentSeaResource=");
        u9.z(stringBuilder0, this.adjacentSeaResource, ", adjacentTerrain=", this.adjacentTerrain, ", adjacentFeature=");
        u9.x(stringBuilder0, this.adjacentFeature, ", adjacentRiver=", this.adjacentRiver, ", adjacentWonder=");
        u9.A(stringBuilder0, this.adjacentWonder, ", adjacentNaturalWonder=", this.adjacentNaturalWonder, ", adjacentImprovement=");
        f.t(stringBuilder0, this.adjacentImprovement, ", adjacentDistrict=", this.adjacentDistrict, ", prereqCivic=");
        f.t(stringBuilder0, this.prereqCivic, ", prereqTech=", this.prereqTech, ", obsoleteCivic=");
        f.t(stringBuilder0, this.obsoleteCivic, ", obsoleteTech=", this.obsoleteTech, ", adjacentResource=");
        u9.z(stringBuilder0, this.adjacentResource, ", adjacentResourceClass=", this.adjacentResourceClass, ", self=");
        return u9.g(stringBuilder0, this.self, ")");
    }
}

