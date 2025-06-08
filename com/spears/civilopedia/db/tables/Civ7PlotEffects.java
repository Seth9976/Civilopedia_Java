package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import com.google.android.gms.internal.ads.u9;
import kotlin.Metadata;
import o2.m;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\b\n\u0002\b\u001E\n\u0002\u0010\u0000\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0006\u0012\u0006\u0010\b\u001A\u00020\u0006\u0012\u0006\u0010\t\u001A\u00020\u0002\u0012\u0006\u0010\n\u001A\u00020\u0004\u0012\u0006\u0010\u000B\u001A\u00020\u0004\u0012\u0006\u0010\f\u001A\u00020\u0004\u0012\u0006\u0010\r\u001A\u00020\u0006\u0012\u0006\u0010\u000E\u001A\u00020\u0004\u0012\u0006\u0010\u000F\u001A\u00020\u0004\u00A2\u0006\u0004\b\u0010\u0010\u0011J\u000F\u0010\u0012\u001A\u00020\u0002H\u0016\u00A2\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u0014\u0010\u0013J\u0010\u0010\u0015\u001A\u00020\u0004H\u00C6\u0003\u00A2\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001A\u00020\u0006H\u00C6\u0003\u00A2\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001A\u00020\u0006H\u00C6\u0003\u00A2\u0006\u0004\b\u0019\u0010\u0018J\u0010\u0010\u001A\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u001A\u0010\u0013J\u0010\u0010\u001B\u001A\u00020\u0004H\u00C6\u0003\u00A2\u0006\u0004\b\u001B\u0010\u0016J\u0010\u0010\u001C\u001A\u00020\u0004H\u00C6\u0003\u00A2\u0006\u0004\b\u001C\u0010\u0016J\u0010\u0010\u001D\u001A\u00020\u0004H\u00C6\u0003\u00A2\u0006\u0004\b\u001D\u0010\u0016J\u0010\u0010\u001E\u001A\u00020\u0006H\u00C6\u0003\u00A2\u0006\u0004\b\u001E\u0010\u0018J\u0010\u0010\u001F\u001A\u00020\u0004H\u00C6\u0003\u00A2\u0006\u0004\b\u001F\u0010\u0016J\u0010\u0010 \u001A\u00020\u0004H\u00C6\u0003\u00A2\u0006\u0004\b \u0010\u0016J~\u0010!\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0007\u001A\u00020\u00062\b\b\u0002\u0010\b\u001A\u00020\u00062\b\b\u0002\u0010\t\u001A\u00020\u00022\b\b\u0002\u0010\n\u001A\u00020\u00042\b\b\u0002\u0010\u000B\u001A\u00020\u00042\b\b\u0002\u0010\f\u001A\u00020\u00042\b\b\u0002\u0010\r\u001A\u00020\u00062\b\b\u0002\u0010\u000E\u001A\u00020\u00042\b\b\u0002\u0010\u000F\u001A\u00020\u0004H\u00C6\u0001\u00A2\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001A\u00020\u0002H\u00D6\u0001\u00A2\u0006\u0004\b#\u0010\u0013J\u0010\u0010$\u001A\u00020\u0006H\u00D6\u0001\u00A2\u0006\u0004\b$\u0010\u0018J\u001A\u0010\'\u001A\u00020\u00042\b\u0010&\u001A\u0004\u0018\u00010%H\u00D6\u0003\u00A2\u0006\u0004\b\'\u0010(R\u0017\u0010\u0003\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b\u0003\u0010)\u001A\u0004\b*\u0010\u0013R\u0017\u0010\u0005\u001A\u00020\u00048\u0006\u00A2\u0006\f\n\u0004\b\u0005\u0010+\u001A\u0004\b,\u0010\u0016R\u0017\u0010\u0007\u001A\u00020\u00068\u0006\u00A2\u0006\f\n\u0004\b\u0007\u0010-\u001A\u0004\b.\u0010\u0018R\u0017\u0010\b\u001A\u00020\u00068\u0006\u00A2\u0006\f\n\u0004\b\b\u0010-\u001A\u0004\b/\u0010\u0018R\u0017\u0010\t\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b\t\u0010)\u001A\u0004\b0\u0010\u0013R\u0017\u0010\n\u001A\u00020\u00048\u0006\u00A2\u0006\f\n\u0004\b\n\u0010+\u001A\u0004\b1\u0010\u0016R\u0017\u0010\u000B\u001A\u00020\u00048\u0006\u00A2\u0006\f\n\u0004\b\u000B\u0010+\u001A\u0004\b2\u0010\u0016R\u0017\u0010\f\u001A\u00020\u00048\u0006\u00A2\u0006\f\n\u0004\b\f\u0010+\u001A\u0004\b3\u0010\u0016R\u0017\u0010\r\u001A\u00020\u00068\u0006\u00A2\u0006\f\n\u0004\b\r\u0010-\u001A\u0004\b4\u0010\u0018R\u0017\u0010\u000E\u001A\u00020\u00048\u0006\u00A2\u0006\f\n\u0004\b\u000E\u0010+\u001A\u0004\b5\u0010\u0016R\u0017\u0010\u000F\u001A\u00020\u00048\u0006\u00A2\u0006\f\n\u0004\b\u000F\u0010+\u001A\u0004\b6\u0010\u0016\u00A8\u00067"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ7PlotEffects;", "Lo2/m;", "", "plotEffectType", "", "allowOnWater", "", "damage", "defense", "name", "onlyVisibleToOwner", "removeOnEnter", "timeDecay", "timeValue", "triggerOnEnter", "unoccupiedDecay", "<init>", "(Ljava/lang/String;ZIILjava/lang/String;ZZZIZZ)V", "primaryKey", "()Ljava/lang/String;", "component1", "component2", "()Z", "component3", "()I", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "(Ljava/lang/String;ZIILjava/lang/String;ZZZIZZ)Lcom/spears/civilopedia/db/tables/Civ7PlotEffects;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPlotEffectType", "Z", "getAllowOnWater", "I", "getDamage", "getDefense", "getName", "getOnlyVisibleToOwner", "getRemoveOnEnter", "getTimeDecay", "getTimeValue", "getTriggerOnEnter", "getUnoccupiedDecay", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ7PlotEffects implements m {
    private final boolean allowOnWater;
    private final int damage;
    private final int defense;
    private final String name;
    private final boolean onlyVisibleToOwner;
    private final String plotEffectType;
    private final boolean removeOnEnter;
    private final boolean timeDecay;
    private final int timeValue;
    private final boolean triggerOnEnter;
    private final boolean unoccupiedDecay;

    public Civ7PlotEffects(String s, boolean z, int v, int v1, String s1, boolean z1, boolean z2, boolean z3, int v2, boolean z4, boolean z5) {
        j.f(s, "plotEffectType");
        j.f(s1, "name");
        super();
        this.plotEffectType = s;
        this.allowOnWater = z;
        this.damage = v;
        this.defense = v1;
        this.name = s1;
        this.onlyVisibleToOwner = z1;
        this.removeOnEnter = z2;
        this.timeDecay = z3;
        this.timeValue = v2;
        this.triggerOnEnter = z4;
        this.unoccupiedDecay = z5;
    }

    public final String component1() {
        return this.plotEffectType;
    }

    public final boolean component10() {
        return this.triggerOnEnter;
    }

    public final boolean component11() {
        return this.unoccupiedDecay;
    }

    public final boolean component2() {
        return this.allowOnWater;
    }

    public final int component3() {
        return this.damage;
    }

    public final int component4() {
        return this.defense;
    }

    public final String component5() {
        return this.name;
    }

    public final boolean component6() {
        return this.onlyVisibleToOwner;
    }

    public final boolean component7() {
        return this.removeOnEnter;
    }

    public final boolean component8() {
        return this.timeDecay;
    }

    public final int component9() {
        return this.timeValue;
    }

    public final Civ7PlotEffects copy(String s, boolean z, int v, int v1, String s1, boolean z1, boolean z2, boolean z3, int v2, boolean z4, boolean z5) {
        j.f(s, "plotEffectType");
        j.f(s1, "name");
        return new Civ7PlotEffects(s, z, v, v1, s1, z1, z2, z3, v2, z4, z5);
    }

    public static Civ7PlotEffects copy$default(Civ7PlotEffects civ7PlotEffects0, String s, boolean z, int v, int v1, String s1, boolean z1, boolean z2, boolean z3, int v2, boolean z4, boolean z5, int v3, Object object0) {
        String s2 = (v3 & 1) == 0 ? s : civ7PlotEffects0.plotEffectType;
        boolean z6 = (v3 & 2) == 0 ? z : civ7PlotEffects0.allowOnWater;
        int v4 = (v3 & 4) == 0 ? v : civ7PlotEffects0.damage;
        int v5 = (v3 & 8) == 0 ? v1 : civ7PlotEffects0.defense;
        String s3 = (v3 & 16) == 0 ? s1 : civ7PlotEffects0.name;
        boolean z7 = (v3 & 0x20) == 0 ? z1 : civ7PlotEffects0.onlyVisibleToOwner;
        boolean z8 = (v3 & 0x40) == 0 ? z2 : civ7PlotEffects0.removeOnEnter;
        boolean z9 = (v3 & 0x80) == 0 ? z3 : civ7PlotEffects0.timeDecay;
        int v6 = (v3 & 0x100) == 0 ? v2 : civ7PlotEffects0.timeValue;
        boolean z10 = (v3 & 0x200) == 0 ? z4 : civ7PlotEffects0.triggerOnEnter;
        return (v3 & 0x400) == 0 ? civ7PlotEffects0.copy(s2, z6, v4, v5, s3, z7, z8, z9, v6, z10, z5) : civ7PlotEffects0.copy(s2, z6, v4, v5, s3, z7, z8, z9, v6, z10, civ7PlotEffects0.unoccupiedDecay);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ7PlotEffects)) {
            return false;
        }
        if(!j.a(this.plotEffectType, ((Civ7PlotEffects)object0).plotEffectType)) {
            return false;
        }
        if(this.allowOnWater != ((Civ7PlotEffects)object0).allowOnWater) {
            return false;
        }
        if(this.damage != ((Civ7PlotEffects)object0).damage) {
            return false;
        }
        if(this.defense != ((Civ7PlotEffects)object0).defense) {
            return false;
        }
        if(!j.a(this.name, ((Civ7PlotEffects)object0).name)) {
            return false;
        }
        if(this.onlyVisibleToOwner != ((Civ7PlotEffects)object0).onlyVisibleToOwner) {
            return false;
        }
        if(this.removeOnEnter != ((Civ7PlotEffects)object0).removeOnEnter) {
            return false;
        }
        if(this.timeDecay != ((Civ7PlotEffects)object0).timeDecay) {
            return false;
        }
        if(this.timeValue != ((Civ7PlotEffects)object0).timeValue) {
            return false;
        }
        return this.triggerOnEnter == ((Civ7PlotEffects)object0).triggerOnEnter ? this.unoccupiedDecay == ((Civ7PlotEffects)object0).unoccupiedDecay : false;
    }

    public final boolean getAllowOnWater() {
        return this.allowOnWater;
    }

    public final int getDamage() {
        return this.damage;
    }

    public final int getDefense() {
        return this.defense;
    }

    public final String getName() {
        return this.name;
    }

    public final boolean getOnlyVisibleToOwner() {
        return this.onlyVisibleToOwner;
    }

    public final String getPlotEffectType() {
        return this.plotEffectType;
    }

    public final boolean getRemoveOnEnter() {
        return this.removeOnEnter;
    }

    public final boolean getTimeDecay() {
        return this.timeDecay;
    }

    public final int getTimeValue() {
        return this.timeValue;
    }

    public final boolean getTriggerOnEnter() {
        return this.triggerOnEnter;
    }

    public final boolean getUnoccupiedDecay() {
        return this.unoccupiedDecay;
    }

    @Override
    public int hashCode() {
        int v = 0x4D5;
        int v1 = ((((f.b((((this.plotEffectType.hashCode() * 0x1F + (this.allowOnWater ? 0x4CF : 0x4D5)) * 0x1F + this.damage) * 0x1F + this.defense) * 0x1F, 0x1F, this.name) + (this.onlyVisibleToOwner ? 0x4CF : 0x4D5)) * 0x1F + (this.removeOnEnter ? 0x4CF : 0x4D5)) * 0x1F + (this.timeDecay ? 0x4CF : 0x4D5)) * 0x1F + this.timeValue) * 0x1F;
        int v2 = this.triggerOnEnter ? 0x4CF : 0x4D5;
        if(this.unoccupiedDecay) {
            v = 0x4CF;
        }
        return (v1 + v2) * 0x1F + v;
    }

    @Override  // o2.m
    public String primaryKey() {
        return this.plotEffectType;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = u9.j("Civ7PlotEffects(plotEffectType=", this.plotEffectType, this.allowOnWater, ", allowOnWater=", ", damage=");
        f.q(stringBuilder0, this.damage, ", defense=", this.defense, ", name=");
        u9.x(stringBuilder0, this.name, ", onlyVisibleToOwner=", this.onlyVisibleToOwner, ", removeOnEnter=");
        u9.A(stringBuilder0, this.removeOnEnter, ", timeDecay=", this.timeDecay, ", timeValue=");
        u9.r(stringBuilder0, this.timeValue, ", triggerOnEnter=", this.triggerOnEnter, ", unoccupiedDecay=");
        return u9.g(stringBuilder0, this.unoccupiedDecay, ")");
    }
}

