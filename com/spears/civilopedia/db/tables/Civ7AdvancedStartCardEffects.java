package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import com.google.android.gms.internal.ads.u9;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0002\b \b\u0086\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\u0005\u001A\u00020\u0006\u0012\b\u0010\u0007\u001A\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001A\u0004\u0018\u00010\u0003\u0012\u0006\u0010\t\u001A\u00020\u0003\u0012\u0006\u0010\n\u001A\u00020\u000B\u0012\b\u0010\f\u001A\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001A\u0004\u0018\u00010\u0006\u00A2\u0006\u0002\u0010\u000EJ\t\u0010\u001C\u001A\u00020\u0003H\u00C6\u0003J\t\u0010\u001D\u001A\u00020\u0003H\u00C6\u0003J\t\u0010\u001E\u001A\u00020\u0006H\u00C6\u0003J\u000B\u0010\u001F\u001A\u0004\u0018\u00010\u0003H\u00C6\u0003J\u000B\u0010 \u001A\u0004\u0018\u00010\u0003H\u00C6\u0003J\t\u0010!\u001A\u00020\u0003H\u00C6\u0003J\t\u0010\"\u001A\u00020\u000BH\u00C6\u0003J\u000B\u0010#\u001A\u0004\u0018\u00010\u0003H\u00C6\u0003J\u0010\u0010$\u001A\u0004\u0018\u00010\u0006H\u00C6\u0003\u00A2\u0006\u0002\u0010\u001AJp\u0010%\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00032\b\b\u0002\u0010\u0005\u001A\u00020\u00062\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001A\u0004\u0018\u00010\u00032\b\b\u0002\u0010\t\u001A\u00020\u00032\b\b\u0002\u0010\n\u001A\u00020\u000B2\n\b\u0002\u0010\f\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001A\u0004\u0018\u00010\u0006H\u00C6\u0001\u00A2\u0006\u0002\u0010&J\u0013\u0010\'\u001A\u00020\u000B2\b\u0010(\u001A\u0004\u0018\u00010\u0001H\u00D6\u0003J\t\u0010)\u001A\u00020\u0006H\u00D6\u0001J\t\u0010*\u001A\u00020\u0003H\u00D6\u0001R\u0011\u0010\u0004\u001A\u00020\u0003\u00A2\u0006\b\n\u0000\u001A\u0004\b\u000F\u0010\u0010R\u0011\u0010\u0005\u001A\u00020\u0006\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0007\u001A\u0004\u0018\u00010\u0003\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0013\u0010\u0010R\u0013\u0010\b\u001A\u0004\u0018\u00010\u0003\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0014\u0010\u0010R\u0011\u0010\u0002\u001A\u00020\u0003\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0015\u0010\u0010R\u0011\u0010\t\u001A\u00020\u0003\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0016\u0010\u0010R\u0011\u0010\n\u001A\u00020\u000B\u00A2\u0006\b\n\u0000\u001A\u0004\b\n\u0010\u0017R\u0013\u0010\f\u001A\u0004\u0018\u00010\u0003\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0018\u0010\u0010R\u0015\u0010\r\u001A\u0004\u0018\u00010\u0006\u00A2\u0006\n\n\u0002\u0010\u001B\u001A\u0004\b\u0019\u0010\u001A\u00A8\u0006+"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ7AdvancedStartCardEffects;", "", "effectID", "", "age", "amount", "", "description", "didNotPlaceEffectType", "effectType", "isPlacementEffect", "", "name", "special", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/Integer;)V", "getAge", "()Ljava/lang/String;", "getAmount", "()I", "getDescription", "getDidNotPlaceEffectType", "getEffectID", "getEffectType", "()Z", "getName", "getSpecial", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/Integer;)Lcom/spears/civilopedia/db/tables/Civ7AdvancedStartCardEffects;", "equals", "other", "hashCode", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ7AdvancedStartCardEffects {
    private final String age;
    private final int amount;
    private final String description;
    private final String didNotPlaceEffectType;
    private final String effectID;
    private final String effectType;
    private final boolean isPlacementEffect;
    private final String name;
    private final Integer special;

    public Civ7AdvancedStartCardEffects(String s, String s1, int v, String s2, String s3, String s4, boolean z, String s5, Integer integer0) {
        j.f(s, "effectID");
        j.f(s1, "age");
        j.f(s4, "effectType");
        super();
        this.effectID = s;
        this.age = s1;
        this.amount = v;
        this.description = s2;
        this.didNotPlaceEffectType = s3;
        this.effectType = s4;
        this.isPlacementEffect = z;
        this.name = s5;
        this.special = integer0;
    }

    public final String component1() {
        return this.effectID;
    }

    public final String component2() {
        return this.age;
    }

    public final int component3() {
        return this.amount;
    }

    public final String component4() {
        return this.description;
    }

    public final String component5() {
        return this.didNotPlaceEffectType;
    }

    public final String component6() {
        return this.effectType;
    }

    public final boolean component7() {
        return this.isPlacementEffect;
    }

    public final String component8() {
        return this.name;
    }

    public final Integer component9() {
        return this.special;
    }

    public final Civ7AdvancedStartCardEffects copy(String s, String s1, int v, String s2, String s3, String s4, boolean z, String s5, Integer integer0) {
        j.f(s, "effectID");
        j.f(s1, "age");
        j.f(s4, "effectType");
        return new Civ7AdvancedStartCardEffects(s, s1, v, s2, s3, s4, z, s5, integer0);
    }

    public static Civ7AdvancedStartCardEffects copy$default(Civ7AdvancedStartCardEffects civ7AdvancedStartCardEffects0, String s, String s1, int v, String s2, String s3, String s4, boolean z, String s5, Integer integer0, int v1, Object object0) {
        String s6 = (v1 & 1) == 0 ? s : civ7AdvancedStartCardEffects0.effectID;
        String s7 = (v1 & 2) == 0 ? s1 : civ7AdvancedStartCardEffects0.age;
        int v2 = (v1 & 4) == 0 ? v : civ7AdvancedStartCardEffects0.amount;
        String s8 = (v1 & 8) == 0 ? s2 : civ7AdvancedStartCardEffects0.description;
        String s9 = (v1 & 16) == 0 ? s3 : civ7AdvancedStartCardEffects0.didNotPlaceEffectType;
        String s10 = (v1 & 0x20) == 0 ? s4 : civ7AdvancedStartCardEffects0.effectType;
        boolean z1 = (v1 & 0x40) == 0 ? z : civ7AdvancedStartCardEffects0.isPlacementEffect;
        String s11 = (v1 & 0x80) == 0 ? s5 : civ7AdvancedStartCardEffects0.name;
        return (v1 & 0x100) == 0 ? civ7AdvancedStartCardEffects0.copy(s6, s7, v2, s8, s9, s10, z1, s11, integer0) : civ7AdvancedStartCardEffects0.copy(s6, s7, v2, s8, s9, s10, z1, s11, civ7AdvancedStartCardEffects0.special);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ7AdvancedStartCardEffects)) {
            return false;
        }
        if(!j.a(this.effectID, ((Civ7AdvancedStartCardEffects)object0).effectID)) {
            return false;
        }
        if(!j.a(this.age, ((Civ7AdvancedStartCardEffects)object0).age)) {
            return false;
        }
        if(this.amount != ((Civ7AdvancedStartCardEffects)object0).amount) {
            return false;
        }
        if(!j.a(this.description, ((Civ7AdvancedStartCardEffects)object0).description)) {
            return false;
        }
        if(!j.a(this.didNotPlaceEffectType, ((Civ7AdvancedStartCardEffects)object0).didNotPlaceEffectType)) {
            return false;
        }
        if(!j.a(this.effectType, ((Civ7AdvancedStartCardEffects)object0).effectType)) {
            return false;
        }
        if(this.isPlacementEffect != ((Civ7AdvancedStartCardEffects)object0).isPlacementEffect) {
            return false;
        }
        return j.a(this.name, ((Civ7AdvancedStartCardEffects)object0).name) ? j.a(this.special, ((Civ7AdvancedStartCardEffects)object0).special) : false;
    }

    public final String getAge() {
        return this.age;
    }

    public final int getAmount() {
        return this.amount;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getDidNotPlaceEffectType() {
        return this.didNotPlaceEffectType;
    }

    public final String getEffectID() {
        return this.effectID;
    }

    public final String getEffectType() {
        return this.effectType;
    }

    public final String getName() {
        return this.name;
    }

    public final Integer getSpecial() {
        return this.special;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = f.b((((f.b(this.effectID.hashCode() * 0x1F, 0x1F, this.age) + this.amount) * 0x1F + (this.description == null ? 0 : this.description.hashCode())) * 0x1F + (this.didNotPlaceEffectType == null ? 0 : this.didNotPlaceEffectType.hashCode())) * 0x1F, 0x1F, this.effectType);
        int v2 = this.isPlacementEffect ? 0x4CF : 0x4D5;
        int v3 = this.name == null ? 0 : this.name.hashCode();
        Integer integer0 = this.special;
        if(integer0 != null) {
            v = integer0.hashCode();
        }
        return ((v1 + v2) * 0x1F + v3) * 0x1F + v;
    }

    public final boolean isPlacementEffect() {
        return this.isPlacementEffect;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = e.j("Civ7AdvancedStartCardEffects(effectID=", this.effectID, ", age=", this.age, ", amount=");
        f.r(stringBuilder0, this.amount, ", description=", this.description, ", didNotPlaceEffectType=");
        f.t(stringBuilder0, this.didNotPlaceEffectType, ", effectType=", this.effectType, ", isPlacementEffect=");
        u9.z(stringBuilder0, this.isPlacementEffect, ", name=", this.name, ", special=");
        return u9.f(stringBuilder0, this.special, ")");
    }
}

