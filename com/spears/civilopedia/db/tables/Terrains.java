package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import com.google.android.gms.internal.ads.u9;
import i3.e;
import kotlin.Metadata;
import o2.m;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b!\n\u0002\u0010\u0000\n\u0002\b\u0015\b\u0086\b\u0018\u00002\u00020\u0001Bw\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002\u0012\u0006\u0010\u0006\u001A\u00020\u0005\u0012\u0006\u0010\u0007\u001A\u00020\u0005\u0012\u0006\u0010\b\u001A\u00020\u0005\u0012\u0006\u0010\n\u001A\u00020\t\u0012\u0006\u0010\u000B\u001A\u00020\t\u0012\u0006\u0010\f\u001A\u00020\u0005\u0012\u0006\u0010\r\u001A\u00020\t\u0012\u0006\u0010\u000E\u001A\u00020\t\u0012\u0006\u0010\u000F\u001A\u00020\u0005\u0012\u0006\u0010\u0010\u001A\u00020\t\u0012\u0006\u0010\u0011\u001A\u00020\t\u0012\u0006\u0010\u0012\u001A\u00020\t\u00A2\u0006\u0004\b\u0013\u0010\u0014J\u000F\u0010\u0015\u001A\u00020\u0002H\u0016\u00A2\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u0017\u0010\u0016J\u0010\u0010\u0018\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u0018\u0010\u0016J\u0010\u0010\u0019\u001A\u00020\u0005H\u00C6\u0003\u00A2\u0006\u0004\b\u0019\u0010\u001AJ\u0010\u0010\u001B\u001A\u00020\u0005H\u00C6\u0003\u00A2\u0006\u0004\b\u001B\u0010\u001AJ\u0010\u0010\u001C\u001A\u00020\u0005H\u00C6\u0003\u00A2\u0006\u0004\b\u001C\u0010\u001AJ\u0010\u0010\u001D\u001A\u00020\tH\u00C6\u0003\u00A2\u0006\u0004\b\u001D\u0010\u001EJ\u0010\u0010\u001F\u001A\u00020\tH\u00C6\u0003\u00A2\u0006\u0004\b\u001F\u0010\u001EJ\u0010\u0010 \u001A\u00020\u0005H\u00C6\u0003\u00A2\u0006\u0004\b \u0010\u001AJ\u0010\u0010!\u001A\u00020\tH\u00C6\u0003\u00A2\u0006\u0004\b!\u0010\u001EJ\u0010\u0010\"\u001A\u00020\tH\u00C6\u0003\u00A2\u0006\u0004\b\"\u0010\u001EJ\u0010\u0010#\u001A\u00020\u0005H\u00C6\u0003\u00A2\u0006\u0004\b#\u0010\u001AJ\u0010\u0010$\u001A\u00020\tH\u00C6\u0003\u00A2\u0006\u0004\b$\u0010\u001EJ\u0010\u0010%\u001A\u00020\tH\u00C6\u0003\u00A2\u0006\u0004\b%\u0010\u001EJ\u0010\u0010&\u001A\u00020\tH\u00C6\u0003\u00A2\u0006\u0004\b&\u0010\u001EJ\u009C\u0001\u0010\'\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0004\u001A\u00020\u00022\b\b\u0002\u0010\u0006\u001A\u00020\u00052\b\b\u0002\u0010\u0007\u001A\u00020\u00052\b\b\u0002\u0010\b\u001A\u00020\u00052\b\b\u0002\u0010\n\u001A\u00020\t2\b\b\u0002\u0010\u000B\u001A\u00020\t2\b\b\u0002\u0010\f\u001A\u00020\u00052\b\b\u0002\u0010\r\u001A\u00020\t2\b\b\u0002\u0010\u000E\u001A\u00020\t2\b\b\u0002\u0010\u000F\u001A\u00020\u00052\b\b\u0002\u0010\u0010\u001A\u00020\t2\b\b\u0002\u0010\u0011\u001A\u00020\t2\b\b\u0002\u0010\u0012\u001A\u00020\tH\u00C6\u0001\u00A2\u0006\u0004\b\'\u0010(J\u0010\u0010)\u001A\u00020\u0002H\u00D6\u0001\u00A2\u0006\u0004\b)\u0010\u0016J\u0010\u0010*\u001A\u00020\tH\u00D6\u0001\u00A2\u0006\u0004\b*\u0010\u001EJ\u001A\u0010-\u001A\u00020\u00052\b\u0010,\u001A\u0004\u0018\u00010+H\u00D6\u0003\u00A2\u0006\u0004\b-\u0010.R\u0017\u0010\u0003\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b\u0003\u0010/\u001A\u0004\b0\u0010\u0016R\u0017\u0010\u0004\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b\u0004\u0010/\u001A\u0004\b1\u0010\u0016R\u0017\u0010\u0006\u001A\u00020\u00058\u0006\u00A2\u0006\f\n\u0004\b\u0006\u00102\u001A\u0004\b3\u0010\u001AR\u0017\u0010\u0007\u001A\u00020\u00058\u0006\u00A2\u0006\f\n\u0004\b\u0007\u00102\u001A\u0004\b4\u0010\u001AR\u0017\u0010\b\u001A\u00020\u00058\u0006\u00A2\u0006\f\n\u0004\b\b\u00102\u001A\u0004\b5\u0010\u001AR\u0017\u0010\n\u001A\u00020\t8\u0006\u00A2\u0006\f\n\u0004\b\n\u00106\u001A\u0004\b7\u0010\u001ER\u0017\u0010\u000B\u001A\u00020\t8\u0006\u00A2\u0006\f\n\u0004\b\u000B\u00106\u001A\u0004\b8\u0010\u001ER\u0017\u0010\f\u001A\u00020\u00058\u0006\u00A2\u0006\f\n\u0004\b\f\u00102\u001A\u0004\b9\u0010\u001AR\u0017\u0010\r\u001A\u00020\t8\u0006\u00A2\u0006\f\n\u0004\b\r\u00106\u001A\u0004\b:\u0010\u001ER\u0017\u0010\u000E\u001A\u00020\t8\u0006\u00A2\u0006\f\n\u0004\b\u000E\u00106\u001A\u0004\b;\u0010\u001ER\u0017\u0010\u000F\u001A\u00020\u00058\u0006\u00A2\u0006\f\n\u0004\b\u000F\u00102\u001A\u0004\b<\u0010\u001AR\u0017\u0010\u0010\u001A\u00020\t8\u0006\u00A2\u0006\f\n\u0004\b\u0010\u00106\u001A\u0004\b=\u0010\u001ER\u0017\u0010\u0011\u001A\u00020\t8\u0006\u00A2\u0006\f\n\u0004\b\u0011\u00106\u001A\u0004\b>\u0010\u001ER\u0017\u0010\u0012\u001A\u00020\t8\u0006\u00A2\u0006\f\n\u0004\b\u0012\u00106\u001A\u0004\b?\u0010\u001E\u00A8\u0006@"}, d2 = {"Lcom/spears/civilopedia/db/tables/Terrains;", "Lo2/m;", "", "terrainType", "name", "", "mountain", "hills", "water", "", "influenceCost", "movementCost", "shallowWater", "sightModifier", "sightThroughModifier", "impassable", "defenseModifier", "appeal", "antiquityPriority", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZZZIIZIIZIII)V", "primaryKey", "()Ljava/lang/String;", "component1", "component2", "component3", "()Z", "component4", "component5", "component6", "()I", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "copy", "(Ljava/lang/String;Ljava/lang/String;ZZZIIZIIZIII)Lcom/spears/civilopedia/db/tables/Terrains;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTerrainType", "getName", "Z", "getMountain", "getHills", "getWater", "I", "getInfluenceCost", "getMovementCost", "getShallowWater", "getSightModifier", "getSightThroughModifier", "getImpassable", "getDefenseModifier", "getAppeal", "getAntiquityPriority", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Terrains implements m {
    private final int antiquityPriority;
    private final int appeal;
    private final int defenseModifier;
    private final boolean hills;
    private final boolean impassable;
    private final int influenceCost;
    private final boolean mountain;
    private final int movementCost;
    private final String name;
    private final boolean shallowWater;
    private final int sightModifier;
    private final int sightThroughModifier;
    private final String terrainType;
    private final boolean water;

    public Terrains(String s, String s1, boolean z, boolean z1, boolean z2, int v, int v1, boolean z3, int v2, int v3, boolean z4, int v4, int v5, int v6) {
        j.f(s, "terrainType");
        j.f(s1, "name");
        super();
        this.terrainType = s;
        this.name = s1;
        this.mountain = z;
        this.hills = z1;
        this.water = z2;
        this.influenceCost = v;
        this.movementCost = v1;
        this.shallowWater = z3;
        this.sightModifier = v2;
        this.sightThroughModifier = v3;
        this.impassable = z4;
        this.defenseModifier = v4;
        this.appeal = v5;
        this.antiquityPriority = v6;
    }

    public final String component1() {
        return this.terrainType;
    }

    public final int component10() {
        return this.sightThroughModifier;
    }

    public final boolean component11() {
        return this.impassable;
    }

    public final int component12() {
        return this.defenseModifier;
    }

    public final int component13() {
        return this.appeal;
    }

    public final int component14() {
        return this.antiquityPriority;
    }

    public final String component2() {
        return this.name;
    }

    public final boolean component3() {
        return this.mountain;
    }

    public final boolean component4() {
        return this.hills;
    }

    public final boolean component5() {
        return this.water;
    }

    public final int component6() {
        return this.influenceCost;
    }

    public final int component7() {
        return this.movementCost;
    }

    public final boolean component8() {
        return this.shallowWater;
    }

    public final int component9() {
        return this.sightModifier;
    }

    public final Terrains copy(String s, String s1, boolean z, boolean z1, boolean z2, int v, int v1, boolean z3, int v2, int v3, boolean z4, int v4, int v5, int v6) {
        j.f(s, "terrainType");
        j.f(s1, "name");
        return new Terrains(s, s1, z, z1, z2, v, v1, z3, v2, v3, z4, v4, v5, v6);
    }

    public static Terrains copy$default(Terrains terrains0, String s, String s1, boolean z, boolean z1, boolean z2, int v, int v1, boolean z3, int v2, int v3, boolean z4, int v4, int v5, int v6, int v7, Object object0) {
        String s2 = (v7 & 1) == 0 ? s : terrains0.terrainType;
        String s3 = (v7 & 2) == 0 ? s1 : terrains0.name;
        boolean z5 = (v7 & 4) == 0 ? z : terrains0.mountain;
        boolean z6 = (v7 & 8) == 0 ? z1 : terrains0.hills;
        boolean z7 = (v7 & 16) == 0 ? z2 : terrains0.water;
        int v8 = (v7 & 0x20) == 0 ? v : terrains0.influenceCost;
        int v9 = (v7 & 0x40) == 0 ? v1 : terrains0.movementCost;
        boolean z8 = (v7 & 0x80) == 0 ? z3 : terrains0.shallowWater;
        int v10 = (v7 & 0x100) == 0 ? v2 : terrains0.sightModifier;
        int v11 = (v7 & 0x200) == 0 ? v3 : terrains0.sightThroughModifier;
        boolean z9 = (v7 & 0x400) == 0 ? z4 : terrains0.impassable;
        int v12 = (v7 & 0x800) == 0 ? v4 : terrains0.defenseModifier;
        int v13 = (v7 & 0x1000) == 0 ? v5 : terrains0.appeal;
        return (v7 & 0x2000) == 0 ? terrains0.copy(s2, s3, z5, z6, z7, v8, v9, z8, v10, v11, z9, v12, v13, v6) : terrains0.copy(s2, s3, z5, z6, z7, v8, v9, z8, v10, v11, z9, v12, v13, terrains0.antiquityPriority);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Terrains)) {
            return false;
        }
        if(!j.a(this.terrainType, ((Terrains)object0).terrainType)) {
            return false;
        }
        if(!j.a(this.name, ((Terrains)object0).name)) {
            return false;
        }
        if(this.mountain != ((Terrains)object0).mountain) {
            return false;
        }
        if(this.hills != ((Terrains)object0).hills) {
            return false;
        }
        if(this.water != ((Terrains)object0).water) {
            return false;
        }
        if(this.influenceCost != ((Terrains)object0).influenceCost) {
            return false;
        }
        if(this.movementCost != ((Terrains)object0).movementCost) {
            return false;
        }
        if(this.shallowWater != ((Terrains)object0).shallowWater) {
            return false;
        }
        if(this.sightModifier != ((Terrains)object0).sightModifier) {
            return false;
        }
        if(this.sightThroughModifier != ((Terrains)object0).sightThroughModifier) {
            return false;
        }
        if(this.impassable != ((Terrains)object0).impassable) {
            return false;
        }
        if(this.defenseModifier != ((Terrains)object0).defenseModifier) {
            return false;
        }
        return this.appeal == ((Terrains)object0).appeal ? this.antiquityPriority == ((Terrains)object0).antiquityPriority : false;
    }

    public final int getAntiquityPriority() {
        return this.antiquityPriority;
    }

    public final int getAppeal() {
        return this.appeal;
    }

    public final int getDefenseModifier() {
        return this.defenseModifier;
    }

    public final boolean getHills() {
        return this.hills;
    }

    public final boolean getImpassable() {
        return this.impassable;
    }

    public final int getInfluenceCost() {
        return this.influenceCost;
    }

    public final boolean getMountain() {
        return this.mountain;
    }

    public final int getMovementCost() {
        return this.movementCost;
    }

    public final String getName() {
        return this.name;
    }

    public final boolean getShallowWater() {
        return this.shallowWater;
    }

    public final int getSightModifier() {
        return this.sightModifier;
    }

    public final int getSightThroughModifier() {
        return this.sightThroughModifier;
    }

    public final String getTerrainType() {
        return this.terrainType;
    }

    public final boolean getWater() {
        return this.water;
    }

    @Override
    public int hashCode() {
        int v = 0x4D5;
        int v1 = ((((((((f.b(this.terrainType.hashCode() * 0x1F, 0x1F, this.name) + (this.mountain ? 0x4CF : 0x4D5)) * 0x1F + (this.hills ? 0x4CF : 0x4D5)) * 0x1F + (this.water ? 0x4CF : 0x4D5)) * 0x1F + this.influenceCost) * 0x1F + this.movementCost) * 0x1F + (this.shallowWater ? 0x4CF : 0x4D5)) * 0x1F + this.sightModifier) * 0x1F + this.sightThroughModifier) * 0x1F;
        if(this.impassable) {
            v = 0x4CF;
        }
        return (((v1 + v) * 0x1F + this.defenseModifier) * 0x1F + this.appeal) * 0x1F + this.antiquityPriority;
    }

    @Override  // o2.m
    public String primaryKey() {
        return this.terrainType;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = e.j("Terrains(terrainType=", this.terrainType, ", name=", this.name, ", mountain=");
        u9.A(stringBuilder0, this.mountain, ", hills=", this.hills, ", water=");
        u9.y(stringBuilder0, this.water, ", influenceCost=", this.influenceCost, ", movementCost=");
        u9.r(stringBuilder0, this.movementCost, ", shallowWater=", this.shallowWater, ", sightModifier=");
        f.q(stringBuilder0, this.sightModifier, ", sightThroughModifier=", this.sightThroughModifier, ", impassable=");
        u9.y(stringBuilder0, this.impassable, ", defenseModifier=", this.defenseModifier, ", appeal=");
        stringBuilder0.append(this.appeal);
        stringBuilder0.append(", antiquityPriority=");
        stringBuilder0.append(this.antiquityPriority);
        stringBuilder0.append(")");
        return stringBuilder0.toString();
    }
}

