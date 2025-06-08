package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import com.google.android.gms.internal.ads.u9;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0014\n\u0002\u0010\u000B\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001A\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0005\u0012\u0006\u0010\u0006\u001A\u00020\u0005\u0012\u0006\u0010\u0007\u001A\u00020\u0005\u0012\u0006\u0010\b\u001A\u00020\u0005¢\u0006\u0002\u0010\tJ\u0010\u0010\u0012\u001A\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000BJ\t\u0010\u0013\u001A\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001A\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001A\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001A\u00020\u0005HÆ\u0003JB\u0010\u0017\u001A\u00020\u00002\n\b\u0002\u0010\u0002\u001A\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00052\b\b\u0002\u0010\u0006\u001A\u00020\u00052\b\b\u0002\u0010\u0007\u001A\u00020\u00052\b\b\u0002\u0010\b\u001A\u00020\u0005HÆ\u0001¢\u0006\u0002\u0010\u0018J\u0013\u0010\u0019\u001A\u00020\u001A2\b\u0010\u001B\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001C\u001A\u00020\u0003HÖ\u0001J\t\u0010\u001D\u001A\u00020\u0005HÖ\u0001R\u0015\u0010\u0002\u001A\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\f\u001A\u0004\b\n\u0010\u000BR\u0011\u0010\u0006\u001A\u00020\u0005¢\u0006\b\n\u0000\u001A\u0004\b\r\u0010\u000ER\u0011\u0010\u0007\u001A\u00020\u0005¢\u0006\b\n\u0000\u001A\u0004\b\u000F\u0010\u000ER\u0011\u0010\b\u001A\u00020\u0005¢\u0006\b\n\u0000\u001A\u0004\b\u0010\u0010\u000ER\u0011\u0010\u0004\u001A\u00020\u0005¢\u0006\b\n\u0000\u001A\u0004\b\u0011\u0010\u000E¨\u0006\u001E"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ5PlayerColors;", "", "ID", "", "type", "", "primaryColor", "secondaryColor", "textColor", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getID", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getPrimaryColor", "()Ljava/lang/String;", "getSecondaryColor", "getTextColor", "getType", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/spears/civilopedia/db/tables/Civ5PlayerColors;", "equals", "", "other", "hashCode", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ5PlayerColors {
    private final Integer ID;
    private final String primaryColor;
    private final String secondaryColor;
    private final String textColor;
    private final String type;

    public Civ5PlayerColors(Integer integer0, String s, String s1, String s2, String s3) {
        j.f(s, "type");
        j.f(s1, "primaryColor");
        j.f(s2, "secondaryColor");
        j.f(s3, "textColor");
        super();
        this.ID = integer0;
        this.type = s;
        this.primaryColor = s1;
        this.secondaryColor = s2;
        this.textColor = s3;
    }

    public final Integer component1() {
        return this.ID;
    }

    public final String component2() {
        return this.type;
    }

    public final String component3() {
        return this.primaryColor;
    }

    public final String component4() {
        return this.secondaryColor;
    }

    public final String component5() {
        return this.textColor;
    }

    public final Civ5PlayerColors copy(Integer integer0, String s, String s1, String s2, String s3) {
        j.f(s, "type");
        j.f(s1, "primaryColor");
        j.f(s2, "secondaryColor");
        j.f(s3, "textColor");
        return new Civ5PlayerColors(integer0, s, s1, s2, s3);
    }

    public static Civ5PlayerColors copy$default(Civ5PlayerColors civ5PlayerColors0, Integer integer0, String s, String s1, String s2, String s3, int v, Object object0) {
        if((v & 1) != 0) {
            integer0 = civ5PlayerColors0.ID;
        }
        if((v & 2) != 0) {
            s = civ5PlayerColors0.type;
        }
        if((v & 4) != 0) {
            s1 = civ5PlayerColors0.primaryColor;
        }
        if((v & 8) != 0) {
            s2 = civ5PlayerColors0.secondaryColor;
        }
        if((v & 16) != 0) {
            s3 = civ5PlayerColors0.textColor;
        }
        return civ5PlayerColors0.copy(integer0, s, s1, s2, s3);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ5PlayerColors)) {
            return false;
        }
        if(!j.a(this.ID, ((Civ5PlayerColors)object0).ID)) {
            return false;
        }
        if(!j.a(this.type, ((Civ5PlayerColors)object0).type)) {
            return false;
        }
        if(!j.a(this.primaryColor, ((Civ5PlayerColors)object0).primaryColor)) {
            return false;
        }
        return j.a(this.secondaryColor, ((Civ5PlayerColors)object0).secondaryColor) ? j.a(this.textColor, ((Civ5PlayerColors)object0).textColor) : false;
    }

    public final Integer getID() {
        return this.ID;
    }

    public final String getPrimaryColor() {
        return this.primaryColor;
    }

    public final String getSecondaryColor() {
        return this.secondaryColor;
    }

    public final String getTextColor() {
        return this.textColor;
    }

    public final String getType() {
        return this.type;
    }

    @Override
    public int hashCode() {
        return this.ID == null ? this.textColor.hashCode() + f.b(f.b(f.b(0, 0x1F, this.type), 0x1F, this.primaryColor), 0x1F, this.secondaryColor) : this.textColor.hashCode() + f.b(f.b(f.b(this.ID.hashCode() * 0x1F, 0x1F, this.type), 0x1F, this.primaryColor), 0x1F, this.secondaryColor);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = u9.h("Civ5PlayerColors(ID=", this.ID, ", type=", this.type, ", primaryColor=");
        f.t(stringBuilder0, this.primaryColor, ", secondaryColor=", this.secondaryColor, ", textColor=");
        return e.h(stringBuilder0, this.textColor, ")");
    }
}

