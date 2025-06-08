package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import com.google.android.gms.internal.ads.u9;
import kotlin.Metadata;
import o2.m;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b!\n\u0002\u0010\u0000\n\u0002\b\u001C\b\u0086\b\u0018\u00002\u00020\u0001B\u00A7\u0001\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0006\u001A\u00020\u0002\u0012\u0006\u0010\u0007\u001A\u00020\u0004\u0012\u0006\u0010\b\u001A\u00020\u0004\u0012\u0006\u0010\t\u001A\u00020\u0004\u0012\u0006\u0010\n\u001A\u00020\u0004\u0012\u0006\u0010\u000B\u001A\u00020\u0004\u0012\u0006\u0010\r\u001A\u00020\f\u0012\u0006\u0010\u000E\u001A\u00020\u0002\u0012\u0006\u0010\u000F\u001A\u00020\u0004\u0012\u0006\u0010\u0010\u001A\u00020\u0004\u0012\u0006\u0010\u0011\u001A\u00020\u0004\u0012\u0006\u0010\u0012\u001A\u00020\u0004\u0012\u0006\u0010\u0013\u001A\u00020\u0004\u0012\u0006\u0010\u0014\u001A\u00020\u0004\u0012\u0006\u0010\u0015\u001A\u00020\u0004\u0012\u0006\u0010\u0016\u001A\u00020\u0004\u0012\u0006\u0010\u0018\u001A\u00020\u0017\u0012\u0006\u0010\u0019\u001A\u00020\u0004\u00A2\u0006\u0004\b\u001A\u0010\u001BJ\u000F\u0010\u001C\u001A\u00020\u0002H\u0016\u00A2\u0006\u0004\b\u001C\u0010\u001DJ\u0010\u0010\u001E\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u001E\u0010\u001DJ\u0010\u0010\u001F\u001A\u00020\u0004H\u00C6\u0003\u00A2\u0006\u0004\b\u001F\u0010 J\u0010\u0010!\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b!\u0010\u001DJ\u0010\u0010\"\u001A\u00020\u0004H\u00C6\u0003\u00A2\u0006\u0004\b\"\u0010 J\u0010\u0010#\u001A\u00020\u0004H\u00C6\u0003\u00A2\u0006\u0004\b#\u0010 J\u0010\u0010$\u001A\u00020\u0004H\u00C6\u0003\u00A2\u0006\u0004\b$\u0010 J\u0010\u0010%\u001A\u00020\u0004H\u00C6\u0003\u00A2\u0006\u0004\b%\u0010 J\u0010\u0010&\u001A\u00020\u0004H\u00C6\u0003\u00A2\u0006\u0004\b&\u0010 J\u0010\u0010\'\u001A\u00020\fH\u00C6\u0003\u00A2\u0006\u0004\b\'\u0010(J\u0010\u0010)\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b)\u0010\u001DJ\u0010\u0010*\u001A\u00020\u0004H\u00C6\u0003\u00A2\u0006\u0004\b*\u0010 J\u0010\u0010+\u001A\u00020\u0004H\u00C6\u0003\u00A2\u0006\u0004\b+\u0010 J\u0010\u0010,\u001A\u00020\u0004H\u00C6\u0003\u00A2\u0006\u0004\b,\u0010 J\u0010\u0010-\u001A\u00020\u0004H\u00C6\u0003\u00A2\u0006\u0004\b-\u0010 J\u0010\u0010.\u001A\u00020\u0004H\u00C6\u0003\u00A2\u0006\u0004\b.\u0010 J\u0010\u0010/\u001A\u00020\u0004H\u00C6\u0003\u00A2\u0006\u0004\b/\u0010 J\u0010\u00100\u001A\u00020\u0004H\u00C6\u0003\u00A2\u0006\u0004\b0\u0010 J\u0010\u00101\u001A\u00020\u0004H\u00C6\u0003\u00A2\u0006\u0004\b1\u0010 J\u0010\u00102\u001A\u00020\u0017H\u00C6\u0003\u00A2\u0006\u0004\b2\u00103J\u0010\u00104\u001A\u00020\u0004H\u00C6\u0003\u00A2\u0006\u0004\b4\u0010 J\u00D8\u0001\u00105\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0006\u001A\u00020\u00022\b\b\u0002\u0010\u0007\u001A\u00020\u00042\b\b\u0002\u0010\b\u001A\u00020\u00042\b\b\u0002\u0010\t\u001A\u00020\u00042\b\b\u0002\u0010\n\u001A\u00020\u00042\b\b\u0002\u0010\u000B\u001A\u00020\u00042\b\b\u0002\u0010\r\u001A\u00020\f2\b\b\u0002\u0010\u000E\u001A\u00020\u00022\b\b\u0002\u0010\u000F\u001A\u00020\u00042\b\b\u0002\u0010\u0010\u001A\u00020\u00042\b\b\u0002\u0010\u0011\u001A\u00020\u00042\b\b\u0002\u0010\u0012\u001A\u00020\u00042\b\b\u0002\u0010\u0013\u001A\u00020\u00042\b\b\u0002\u0010\u0014\u001A\u00020\u00042\b\b\u0002\u0010\u0015\u001A\u00020\u00042\b\b\u0002\u0010\u0016\u001A\u00020\u00042\b\b\u0002\u0010\u0018\u001A\u00020\u00172\b\b\u0002\u0010\u0019\u001A\u00020\u0004H\u00C6\u0001\u00A2\u0006\u0004\b5\u00106J\u0010\u00107\u001A\u00020\u0002H\u00D6\u0001\u00A2\u0006\u0004\b7\u0010\u001DJ\u0010\u00108\u001A\u00020\u0017H\u00D6\u0001\u00A2\u0006\u0004\b8\u00103J\u001A\u0010;\u001A\u00020\u00042\b\u0010:\u001A\u0004\u0018\u000109H\u00D6\u0003\u00A2\u0006\u0004\b;\u0010<R\u0017\u0010\u0003\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b\u0003\u0010=\u001A\u0004\b>\u0010\u001DR\u0017\u0010\u0005\u001A\u00020\u00048\u0006\u00A2\u0006\f\n\u0004\b\u0005\u0010?\u001A\u0004\b@\u0010 R\u0017\u0010\u0006\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b\u0006\u0010=\u001A\u0004\bA\u0010\u001DR\u0017\u0010\u0007\u001A\u00020\u00048\u0006\u00A2\u0006\f\n\u0004\b\u0007\u0010?\u001A\u0004\bB\u0010 R\u0017\u0010\b\u001A\u00020\u00048\u0006\u00A2\u0006\f\n\u0004\b\b\u0010?\u001A\u0004\bC\u0010 R\u0017\u0010\t\u001A\u00020\u00048\u0006\u00A2\u0006\f\n\u0004\b\t\u0010?\u001A\u0004\bD\u0010 R\u0017\u0010\n\u001A\u00020\u00048\u0006\u00A2\u0006\f\n\u0004\b\n\u0010?\u001A\u0004\bE\u0010 R\u0017\u0010\u000B\u001A\u00020\u00048\u0006\u00A2\u0006\f\n\u0004\b\u000B\u0010?\u001A\u0004\bF\u0010 R\u0017\u0010\r\u001A\u00020\f8\u0006\u00A2\u0006\f\n\u0004\b\r\u0010G\u001A\u0004\bH\u0010(R\u0017\u0010\u000E\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b\u000E\u0010=\u001A\u0004\bI\u0010\u001DR\u0017\u0010\u000F\u001A\u00020\u00048\u0006\u00A2\u0006\f\n\u0004\b\u000F\u0010?\u001A\u0004\bJ\u0010 R\u0017\u0010\u0010\u001A\u00020\u00048\u0006\u00A2\u0006\f\n\u0004\b\u0010\u0010?\u001A\u0004\bK\u0010 R\u0017\u0010\u0011\u001A\u00020\u00048\u0006\u00A2\u0006\f\n\u0004\b\u0011\u0010?\u001A\u0004\bL\u0010 R\u0017\u0010\u0012\u001A\u00020\u00048\u0006\u00A2\u0006\f\n\u0004\b\u0012\u0010?\u001A\u0004\bM\u0010 R\u0017\u0010\u0013\u001A\u00020\u00048\u0006\u00A2\u0006\f\n\u0004\b\u0013\u0010?\u001A\u0004\bN\u0010 R\u0017\u0010\u0014\u001A\u00020\u00048\u0006\u00A2\u0006\f\n\u0004\b\u0014\u0010?\u001A\u0004\bO\u0010 R\u0017\u0010\u0015\u001A\u00020\u00048\u0006\u00A2\u0006\f\n\u0004\b\u0015\u0010?\u001A\u0004\bP\u0010 R\u0017\u0010\u0016\u001A\u00020\u00048\u0006\u00A2\u0006\f\n\u0004\b\u0016\u0010?\u001A\u0004\bQ\u0010 R\u0017\u0010\u0018\u001A\u00020\u00178\u0006\u00A2\u0006\f\n\u0004\b\u0018\u0010R\u001A\u0004\bS\u00103R\u0017\u0010\u0019\u001A\u00020\u00048\u0006\u00A2\u0006\f\n\u0004\b\u0019\u0010?\u001A\u0004\bT\u0010 \u00A8\u0006U"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ7ScoringLineItems;", "Lo2/m;", "", "lineItemType", "", "buildings", "category", "cities", "converted", "districts", "goldPerTurn", "greatPeople", "", "multiplier", "name", "pillage", "population", "religion", "scaleByCost", "scoringScenario1", "scoringScenario2", "scoringScenario3", "techs", "", "tieBreakerPriority", "wonders", "<init>", "(Ljava/lang/String;ZLjava/lang/String;ZZZZZDLjava/lang/String;ZZZZZZZZIZ)V", "primaryKey", "()Ljava/lang/String;", "component1", "component2", "()Z", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "()D", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "()I", "component20", "copy", "(Ljava/lang/String;ZLjava/lang/String;ZZZZZDLjava/lang/String;ZZZZZZZZIZ)Lcom/spears/civilopedia/db/tables/Civ7ScoringLineItems;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getLineItemType", "Z", "getBuildings", "getCategory", "getCities", "getConverted", "getDistricts", "getGoldPerTurn", "getGreatPeople", "D", "getMultiplier", "getName", "getPillage", "getPopulation", "getReligion", "getScaleByCost", "getScoringScenario1", "getScoringScenario2", "getScoringScenario3", "getTechs", "I", "getTieBreakerPriority", "getWonders", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ7ScoringLineItems implements m {
    private final boolean buildings;
    private final String category;
    private final boolean cities;
    private final boolean converted;
    private final boolean districts;
    private final boolean goldPerTurn;
    private final boolean greatPeople;
    private final String lineItemType;
    private final double multiplier;
    private final String name;
    private final boolean pillage;
    private final boolean population;
    private final boolean religion;
    private final boolean scaleByCost;
    private final boolean scoringScenario1;
    private final boolean scoringScenario2;
    private final boolean scoringScenario3;
    private final boolean techs;
    private final int tieBreakerPriority;
    private final boolean wonders;

    public Civ7ScoringLineItems(String s, boolean z, String s1, boolean z1, boolean z2, boolean z3, boolean z4, boolean z5, double f, String s2, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, int v, boolean z14) {
        j.f(s, "lineItemType");
        j.f(s1, "category");
        j.f(s2, "name");
        super();
        this.lineItemType = s;
        this.buildings = z;
        this.category = s1;
        this.cities = z1;
        this.converted = z2;
        this.districts = z3;
        this.goldPerTurn = z4;
        this.greatPeople = z5;
        this.multiplier = f;
        this.name = s2;
        this.pillage = z6;
        this.population = z7;
        this.religion = z8;
        this.scaleByCost = z9;
        this.scoringScenario1 = z10;
        this.scoringScenario2 = z11;
        this.scoringScenario3 = z12;
        this.techs = z13;
        this.tieBreakerPriority = v;
        this.wonders = z14;
    }

    public final String component1() {
        return this.lineItemType;
    }

    public final String component10() {
        return this.name;
    }

    public final boolean component11() {
        return this.pillage;
    }

    public final boolean component12() {
        return this.population;
    }

    public final boolean component13() {
        return this.religion;
    }

    public final boolean component14() {
        return this.scaleByCost;
    }

    public final boolean component15() {
        return this.scoringScenario1;
    }

    public final boolean component16() {
        return this.scoringScenario2;
    }

    public final boolean component17() {
        return this.scoringScenario3;
    }

    public final boolean component18() {
        return this.techs;
    }

    public final int component19() {
        return this.tieBreakerPriority;
    }

    public final boolean component2() {
        return this.buildings;
    }

    public final boolean component20() {
        return this.wonders;
    }

    public final String component3() {
        return this.category;
    }

    public final boolean component4() {
        return this.cities;
    }

    public final boolean component5() {
        return this.converted;
    }

    public final boolean component6() {
        return this.districts;
    }

    public final boolean component7() {
        return this.goldPerTurn;
    }

    public final boolean component8() {
        return this.greatPeople;
    }

    public final double component9() {
        return this.multiplier;
    }

    public final Civ7ScoringLineItems copy(String s, boolean z, String s1, boolean z1, boolean z2, boolean z3, boolean z4, boolean z5, double f, String s2, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, int v, boolean z14) {
        j.f(s, "lineItemType");
        j.f(s1, "category");
        j.f(s2, "name");
        return new Civ7ScoringLineItems(s, z, s1, z1, z2, z3, z4, z5, f, s2, z6, z7, z8, z9, z10, z11, z12, z13, v, z14);
    }

    public static Civ7ScoringLineItems copy$default(Civ7ScoringLineItems civ7ScoringLineItems0, String s, boolean z, String s1, boolean z1, boolean z2, boolean z3, boolean z4, boolean z5, double f, String s2, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, int v, boolean z14, int v1, Object object0) {
        String s3 = (v1 & 1) == 0 ? s : civ7ScoringLineItems0.lineItemType;
        boolean z15 = (v1 & 2) == 0 ? z : civ7ScoringLineItems0.buildings;
        String s4 = (v1 & 4) == 0 ? s1 : civ7ScoringLineItems0.category;
        boolean z16 = (v1 & 8) == 0 ? z1 : civ7ScoringLineItems0.cities;
        boolean z17 = (v1 & 16) == 0 ? z2 : civ7ScoringLineItems0.converted;
        boolean z18 = (v1 & 0x20) == 0 ? z3 : civ7ScoringLineItems0.districts;
        boolean z19 = (v1 & 0x40) == 0 ? z4 : civ7ScoringLineItems0.goldPerTurn;
        boolean z20 = (v1 & 0x80) == 0 ? z5 : civ7ScoringLineItems0.greatPeople;
        double f1 = (v1 & 0x100) == 0 ? f : civ7ScoringLineItems0.multiplier;
        String s5 = (v1 & 0x200) == 0 ? s2 : civ7ScoringLineItems0.name;
        boolean z21 = (v1 & 0x400) == 0 ? z6 : civ7ScoringLineItems0.pillage;
        boolean z22 = (v1 & 0x800) == 0 ? z7 : civ7ScoringLineItems0.population;
        boolean z23 = (v1 & 0x1000) == 0 ? z8 : civ7ScoringLineItems0.religion;
        boolean z24 = (v1 & 0x2000) == 0 ? z9 : civ7ScoringLineItems0.scaleByCost;
        boolean z25 = (v1 & 0x4000) == 0 ? z10 : civ7ScoringLineItems0.scoringScenario1;
        boolean z26 = (v1 & 0x8000) == 0 ? z11 : civ7ScoringLineItems0.scoringScenario2;
        boolean z27 = (v1 & 0x10000) == 0 ? z12 : civ7ScoringLineItems0.scoringScenario3;
        boolean z28 = (v1 & 0x20000) == 0 ? z13 : civ7ScoringLineItems0.techs;
        int v2 = (v1 & 0x40000) == 0 ? v : civ7ScoringLineItems0.tieBreakerPriority;
        return (v1 & 0x80000) == 0 ? civ7ScoringLineItems0.copy(s3, z15, s4, z16, z17, z18, z19, z20, f1, s5, z21, z22, z23, z24, z25, z26, z27, z28, v2, z14) : civ7ScoringLineItems0.copy(s3, z15, s4, z16, z17, z18, z19, z20, f1, s5, z21, z22, z23, z24, z25, z26, z27, z28, v2, civ7ScoringLineItems0.wonders);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ7ScoringLineItems)) {
            return false;
        }
        Civ7ScoringLineItems civ7ScoringLineItems0 = (Civ7ScoringLineItems)object0;
        if(!j.a(this.lineItemType, civ7ScoringLineItems0.lineItemType)) {
            return false;
        }
        if(this.buildings != civ7ScoringLineItems0.buildings) {
            return false;
        }
        if(!j.a(this.category, civ7ScoringLineItems0.category)) {
            return false;
        }
        if(this.cities != civ7ScoringLineItems0.cities) {
            return false;
        }
        if(this.converted != civ7ScoringLineItems0.converted) {
            return false;
        }
        if(this.districts != civ7ScoringLineItems0.districts) {
            return false;
        }
        if(this.goldPerTurn != civ7ScoringLineItems0.goldPerTurn) {
            return false;
        }
        if(this.greatPeople != civ7ScoringLineItems0.greatPeople) {
            return false;
        }
        if(Double.compare(this.multiplier, civ7ScoringLineItems0.multiplier) != 0) {
            return false;
        }
        if(!j.a(this.name, civ7ScoringLineItems0.name)) {
            return false;
        }
        if(this.pillage != civ7ScoringLineItems0.pillage) {
            return false;
        }
        if(this.population != civ7ScoringLineItems0.population) {
            return false;
        }
        if(this.religion != civ7ScoringLineItems0.religion) {
            return false;
        }
        if(this.scaleByCost != civ7ScoringLineItems0.scaleByCost) {
            return false;
        }
        if(this.scoringScenario1 != civ7ScoringLineItems0.scoringScenario1) {
            return false;
        }
        if(this.scoringScenario2 != civ7ScoringLineItems0.scoringScenario2) {
            return false;
        }
        if(this.scoringScenario3 != civ7ScoringLineItems0.scoringScenario3) {
            return false;
        }
        if(this.techs != civ7ScoringLineItems0.techs) {
            return false;
        }
        return this.tieBreakerPriority == civ7ScoringLineItems0.tieBreakerPriority ? this.wonders == civ7ScoringLineItems0.wonders : false;
    }

    public final boolean getBuildings() {
        return this.buildings;
    }

    public final String getCategory() {
        return this.category;
    }

    public final boolean getCities() {
        return this.cities;
    }

    public final boolean getConverted() {
        return this.converted;
    }

    public final boolean getDistricts() {
        return this.districts;
    }

    public final boolean getGoldPerTurn() {
        return this.goldPerTurn;
    }

    public final boolean getGreatPeople() {
        return this.greatPeople;
    }

    public final String getLineItemType() {
        return this.lineItemType;
    }

    public final double getMultiplier() {
        return this.multiplier;
    }

    public final String getName() {
        return this.name;
    }

    public final boolean getPillage() {
        return this.pillage;
    }

    public final boolean getPopulation() {
        return this.population;
    }

    public final boolean getReligion() {
        return this.religion;
    }

    public final boolean getScaleByCost() {
        return this.scaleByCost;
    }

    public final boolean getScoringScenario1() {
        return this.scoringScenario1;
    }

    public final boolean getScoringScenario2() {
        return this.scoringScenario2;
    }

    public final boolean getScoringScenario3() {
        return this.scoringScenario3;
    }

    public final boolean getTechs() {
        return this.techs;
    }

    public final int getTieBreakerPriority() {
        return this.tieBreakerPriority;
    }

    public final boolean getWonders() {
        return this.wonders;
    }

    // 去混淆评级： 低(48)
    @Override
    public int hashCode() {
        int v = 0x4D5;
        long v1 = Double.doubleToLongBits(this.multiplier);
        int v2 = (((((((((f.b(((((((f.b((this.lineItemType.hashCode() * 0x1F + (this.buildings ? 0x4CF : 0x4D5)) * 0x1F, 0x1F, this.category) + (this.cities ? 0x4CF : 0x4D5)) * 0x1F + (this.converted ? 0x4CF : 0x4D5)) * 0x1F + (this.districts ? 0x4CF : 0x4D5)) * 0x1F + (this.goldPerTurn ? 0x4CF : 0x4D5)) * 0x1F + (this.greatPeople ? 0x4CF : 0x4D5)) * 0x1F + ((int)(v1 ^ v1 >>> 0x20))) * 0x1F, 0x1F, this.name) + (this.pillage ? 0x4CF : 0x4D5)) * 0x1F + (this.population ? 0x4CF : 0x4D5)) * 0x1F + (this.religion ? 0x4CF : 0x4D5)) * 0x1F + (this.scaleByCost ? 0x4CF : 0x4D5)) * 0x1F + (this.scoringScenario1 ? 0x4CF : 0x4D5)) * 0x1F + (this.scoringScenario2 ? 0x4CF : 0x4D5)) * 0x1F + (this.scoringScenario3 ? 0x4CF : 0x4D5)) * 0x1F + (this.techs ? 0x4CF : 0x4D5)) * 0x1F + this.tieBreakerPriority) * 0x1F;
        if(this.wonders) {
            v = 0x4CF;
        }
        return v2 + v;
    }

    @Override  // o2.m
    public String primaryKey() {
        return this.lineItemType;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = u9.j("Civ7ScoringLineItems(lineItemType=", this.lineItemType, this.buildings, ", buildings=", ", category=");
        u9.x(stringBuilder0, this.category, ", cities=", this.cities, ", converted=");
        u9.A(stringBuilder0, this.converted, ", districts=", this.districts, ", goldPerTurn=");
        u9.A(stringBuilder0, this.goldPerTurn, ", greatPeople=", this.greatPeople, ", multiplier=");
        stringBuilder0.append(this.multiplier);
        stringBuilder0.append(", name=");
        stringBuilder0.append(this.name);
        stringBuilder0.append(", pillage=");
        stringBuilder0.append(this.pillage);
        stringBuilder0.append(", population=");
        stringBuilder0.append(this.population);
        stringBuilder0.append(", religion=");
        stringBuilder0.append(this.religion);
        stringBuilder0.append(", scaleByCost=");
        stringBuilder0.append(this.scaleByCost);
        stringBuilder0.append(", scoringScenario1=");
        stringBuilder0.append(this.scoringScenario1);
        stringBuilder0.append(", scoringScenario2=");
        stringBuilder0.append(this.scoringScenario2);
        stringBuilder0.append(", scoringScenario3=");
        stringBuilder0.append(this.scoringScenario3);
        stringBuilder0.append(", techs=");
        stringBuilder0.append(this.techs);
        stringBuilder0.append(", tieBreakerPriority=");
        stringBuilder0.append(this.tieBreakerPriority);
        stringBuilder0.append(", wonders=");
        stringBuilder0.append(this.wonders);
        stringBuilder0.append(")");
        return stringBuilder0.toString();
    }
}

