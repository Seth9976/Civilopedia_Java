package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import com.google.android.gms.internal.ads.u9;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000B\n\u0002\b\u001C\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0005\u0012\u0006\u0010\u0006\u001A\u00020\u0003\u0012\u0006\u0010\u0007\u001A\u00020\u0003\u0012\u0006\u0010\b\u001A\u00020\u0003\u0012\b\u0010\t\u001A\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001A\u0004\u0018\u00010\u000B¢\u0006\u0002\u0010\fJ\t\u0010\u001A\u001A\u00020\u0003HÆ\u0003J\t\u0010\u001B\u001A\u00020\u0005HÆ\u0003J\t\u0010\u001C\u001A\u00020\u0003HÆ\u0003J\t\u0010\u001D\u001A\u00020\u0003HÆ\u0003J\t\u0010\u001E\u001A\u00020\u0003HÆ\u0003J\u0010\u0010\u001F\u001A\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0015J\u0010\u0010 \u001A\u0004\u0018\u00010\u000BHÆ\u0003¢\u0006\u0002\u0010\u0018JX\u0010!\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00052\b\b\u0002\u0010\u0006\u001A\u00020\u00032\b\b\u0002\u0010\u0007\u001A\u00020\u00032\b\b\u0002\u0010\b\u001A\u00020\u00032\n\b\u0002\u0010\t\u001A\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001A\u0004\u0018\u00010\u000BHÆ\u0001¢\u0006\u0002\u0010\"J\u0013\u0010#\u001A\u00020\u000B2\b\u0010$\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001A\u00020\u0005HÖ\u0001J\t\u0010&\u001A\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\r\u0010\u000ER\u0011\u0010\u0004\u001A\u00020\u0005¢\u0006\b\n\u0000\u001A\u0004\b\u000F\u0010\u0010R\u0011\u0010\u0006\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0011\u0010\u000ER\u0011\u0010\u0007\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0012\u0010\u000ER\u0011\u0010\b\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0013\u0010\u000ER\u0015\u0010\t\u001A\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0016\u001A\u0004\b\u0014\u0010\u0015R\u0015\u0010\n\u001A\u0004\u0018\u00010\u000B¢\u0006\n\n\u0002\u0010\u0019\u001A\u0004\b\u0017\u0010\u0018¨\u0006\'"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ7UnhappinessEffects;", "", "ID", "", "amount", "", "categoryText", "condition", "description", "duration", "ongoing", "", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;)V", "getID", "()Ljava/lang/String;", "getAmount", "()I", "getCategoryText", "getCondition", "getDescription", "getDuration", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getOngoing", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;)Lcom/spears/civilopedia/db/tables/Civ7UnhappinessEffects;", "equals", "other", "hashCode", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ7UnhappinessEffects {
    private final String ID;
    private final int amount;
    private final String categoryText;
    private final String condition;
    private final String description;
    private final Integer duration;
    private final Boolean ongoing;

    public Civ7UnhappinessEffects(String s, int v, String s1, String s2, String s3, Integer integer0, Boolean boolean0) {
        j.f(s, "ID");
        j.f(s1, "categoryText");
        j.f(s2, "condition");
        j.f(s3, "description");
        super();
        this.ID = s;
        this.amount = v;
        this.categoryText = s1;
        this.condition = s2;
        this.description = s3;
        this.duration = integer0;
        this.ongoing = boolean0;
    }

    public final String component1() {
        return this.ID;
    }

    public final int component2() {
        return this.amount;
    }

    public final String component3() {
        return this.categoryText;
    }

    public final String component4() {
        return this.condition;
    }

    public final String component5() {
        return this.description;
    }

    public final Integer component6() {
        return this.duration;
    }

    public final Boolean component7() {
        return this.ongoing;
    }

    public final Civ7UnhappinessEffects copy(String s, int v, String s1, String s2, String s3, Integer integer0, Boolean boolean0) {
        j.f(s, "ID");
        j.f(s1, "categoryText");
        j.f(s2, "condition");
        j.f(s3, "description");
        return new Civ7UnhappinessEffects(s, v, s1, s2, s3, integer0, boolean0);
    }

    public static Civ7UnhappinessEffects copy$default(Civ7UnhappinessEffects civ7UnhappinessEffects0, String s, int v, String s1, String s2, String s3, Integer integer0, Boolean boolean0, int v1, Object object0) {
        if((v1 & 1) != 0) {
            s = civ7UnhappinessEffects0.ID;
        }
        if((v1 & 2) != 0) {
            v = civ7UnhappinessEffects0.amount;
        }
        if((v1 & 4) != 0) {
            s1 = civ7UnhappinessEffects0.categoryText;
        }
        if((v1 & 8) != 0) {
            s2 = civ7UnhappinessEffects0.condition;
        }
        if((v1 & 16) != 0) {
            s3 = civ7UnhappinessEffects0.description;
        }
        if((v1 & 0x20) != 0) {
            integer0 = civ7UnhappinessEffects0.duration;
        }
        if((v1 & 0x40) != 0) {
            boolean0 = civ7UnhappinessEffects0.ongoing;
        }
        return civ7UnhappinessEffects0.copy(s, v, s1, s2, s3, integer0, boolean0);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ7UnhappinessEffects)) {
            return false;
        }
        if(!j.a(this.ID, ((Civ7UnhappinessEffects)object0).ID)) {
            return false;
        }
        if(this.amount != ((Civ7UnhappinessEffects)object0).amount) {
            return false;
        }
        if(!j.a(this.categoryText, ((Civ7UnhappinessEffects)object0).categoryText)) {
            return false;
        }
        if(!j.a(this.condition, ((Civ7UnhappinessEffects)object0).condition)) {
            return false;
        }
        if(!j.a(this.description, ((Civ7UnhappinessEffects)object0).description)) {
            return false;
        }
        return j.a(this.duration, ((Civ7UnhappinessEffects)object0).duration) ? j.a(this.ongoing, ((Civ7UnhappinessEffects)object0).ongoing) : false;
    }

    public final int getAmount() {
        return this.amount;
    }

    public final String getCategoryText() {
        return this.categoryText;
    }

    public final String getCondition() {
        return this.condition;
    }

    public final String getDescription() {
        return this.description;
    }

    public final Integer getDuration() {
        return this.duration;
    }

    public final String getID() {
        return this.ID;
    }

    public final Boolean getOngoing() {
        return this.ongoing;
    }

    @Override
    public int hashCode() {
        int v = f.b(f.b(f.b((this.ID.hashCode() * 0x1F + this.amount) * 0x1F, 0x1F, this.categoryText), 0x1F, this.condition), 0x1F, this.description);
        int v1 = 0;
        int v2 = this.duration == null ? 0 : this.duration.hashCode();
        Boolean boolean0 = this.ongoing;
        if(boolean0 != null) {
            v1 = boolean0.hashCode();
        }
        return (v + v2) * 0x1F + v1;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = f.m(this.amount, "Civ7UnhappinessEffects(ID=", this.ID, ", amount=", ", categoryText=");
        f.t(stringBuilder0, this.categoryText, ", condition=", this.condition, ", description=");
        u9.p(this.duration, this.description, ", duration=", ", ongoing=", stringBuilder0);
        stringBuilder0.append(this.ongoing);
        stringBuilder0.append(")");
        return stringBuilder0.toString();
    }
}

