package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import com.google.android.gms.internal.ads.u9;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0017\n\u0002\u0010\u000B\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\b\u0010\u0002\u001A\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0005\u0012\u0006\u0010\u0006\u001A\u00020\u0005\u0012\u0006\u0010\u0007\u001A\u00020\u0005\u0012\u0006\u0010\b\u001A\u00020\u0005\u0012\u0006\u0010\t\u001A\u00020\u0005¢\u0006\u0002\u0010\nJ\u0010\u0010\u0014\u001A\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\t\u0010\u0015\u001A\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001A\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001A\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001A\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001A\u00020\u0005HÆ\u0003JL\u0010\u001A\u001A\u00020\u00002\n\b\u0002\u0010\u0002\u001A\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00052\b\b\u0002\u0010\u0006\u001A\u00020\u00052\b\b\u0002\u0010\u0007\u001A\u00020\u00052\b\b\u0002\u0010\b\u001A\u00020\u00052\b\b\u0002\u0010\t\u001A\u00020\u0005HÆ\u0001¢\u0006\u0002\u0010\u001BJ\u0013\u0010\u001C\u001A\u00020\u001D2\b\u0010\u001E\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001F\u001A\u00020\u0003HÖ\u0001J\t\u0010 \u001A\u00020\u0005HÖ\u0001R\u0015\u0010\u0002\u001A\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\r\u001A\u0004\b\u000B\u0010\fR\u0011\u0010\t\u001A\u00020\u0005¢\u0006\b\n\u0000\u001A\u0004\b\u000E\u0010\u000FR\u0011\u0010\u0007\u001A\u00020\u0005¢\u0006\b\n\u0000\u001A\u0004\b\u0010\u0010\u000FR\u0011\u0010\b\u001A\u00020\u0005¢\u0006\b\n\u0000\u001A\u0004\b\u0011\u0010\u000FR\u0011\u0010\u0006\u001A\u00020\u0005¢\u0006\b\n\u0000\u001A\u0004\b\u0012\u0010\u000FR\u0011\u0010\u0004\u001A\u00020\u0005¢\u0006\b\n\u0000\u001A\u0004\b\u0013\u0010\u000F¨\u0006!"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ5GreatWorkSlots;", "", "ID", "", "type", "", "slotsToolTipText", "emptyToolTipText", "filledIcon", "emptyIcon", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getID", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getEmptyIcon", "()Ljava/lang/String;", "getEmptyToolTipText", "getFilledIcon", "getSlotsToolTipText", "getType", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/spears/civilopedia/db/tables/Civ5GreatWorkSlots;", "equals", "", "other", "hashCode", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ5GreatWorkSlots {
    private final Integer ID;
    private final String emptyIcon;
    private final String emptyToolTipText;
    private final String filledIcon;
    private final String slotsToolTipText;
    private final String type;

    public Civ5GreatWorkSlots(Integer integer0, String s, String s1, String s2, String s3, String s4) {
        j.f(s, "type");
        j.f(s1, "slotsToolTipText");
        j.f(s2, "emptyToolTipText");
        j.f(s3, "filledIcon");
        j.f(s4, "emptyIcon");
        super();
        this.ID = integer0;
        this.type = s;
        this.slotsToolTipText = s1;
        this.emptyToolTipText = s2;
        this.filledIcon = s3;
        this.emptyIcon = s4;
    }

    public final Integer component1() {
        return this.ID;
    }

    public final String component2() {
        return this.type;
    }

    public final String component3() {
        return this.slotsToolTipText;
    }

    public final String component4() {
        return this.emptyToolTipText;
    }

    public final String component5() {
        return this.filledIcon;
    }

    public final String component6() {
        return this.emptyIcon;
    }

    public final Civ5GreatWorkSlots copy(Integer integer0, String s, String s1, String s2, String s3, String s4) {
        j.f(s, "type");
        j.f(s1, "slotsToolTipText");
        j.f(s2, "emptyToolTipText");
        j.f(s3, "filledIcon");
        j.f(s4, "emptyIcon");
        return new Civ5GreatWorkSlots(integer0, s, s1, s2, s3, s4);
    }

    public static Civ5GreatWorkSlots copy$default(Civ5GreatWorkSlots civ5GreatWorkSlots0, Integer integer0, String s, String s1, String s2, String s3, String s4, int v, Object object0) {
        if((v & 1) != 0) {
            integer0 = civ5GreatWorkSlots0.ID;
        }
        if((v & 2) != 0) {
            s = civ5GreatWorkSlots0.type;
        }
        if((v & 4) != 0) {
            s1 = civ5GreatWorkSlots0.slotsToolTipText;
        }
        if((v & 8) != 0) {
            s2 = civ5GreatWorkSlots0.emptyToolTipText;
        }
        if((v & 16) != 0) {
            s3 = civ5GreatWorkSlots0.filledIcon;
        }
        if((v & 0x20) != 0) {
            s4 = civ5GreatWorkSlots0.emptyIcon;
        }
        return civ5GreatWorkSlots0.copy(integer0, s, s1, s2, s3, s4);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ5GreatWorkSlots)) {
            return false;
        }
        if(!j.a(this.ID, ((Civ5GreatWorkSlots)object0).ID)) {
            return false;
        }
        if(!j.a(this.type, ((Civ5GreatWorkSlots)object0).type)) {
            return false;
        }
        if(!j.a(this.slotsToolTipText, ((Civ5GreatWorkSlots)object0).slotsToolTipText)) {
            return false;
        }
        if(!j.a(this.emptyToolTipText, ((Civ5GreatWorkSlots)object0).emptyToolTipText)) {
            return false;
        }
        return j.a(this.filledIcon, ((Civ5GreatWorkSlots)object0).filledIcon) ? j.a(this.emptyIcon, ((Civ5GreatWorkSlots)object0).emptyIcon) : false;
    }

    public final String getEmptyIcon() {
        return this.emptyIcon;
    }

    public final String getEmptyToolTipText() {
        return this.emptyToolTipText;
    }

    public final String getFilledIcon() {
        return this.filledIcon;
    }

    public final Integer getID() {
        return this.ID;
    }

    public final String getSlotsToolTipText() {
        return this.slotsToolTipText;
    }

    public final String getType() {
        return this.type;
    }

    @Override
    public int hashCode() {
        return this.ID == null ? this.emptyIcon.hashCode() + f.b(f.b(f.b(f.b(0, 0x1F, this.type), 0x1F, this.slotsToolTipText), 0x1F, this.emptyToolTipText), 0x1F, this.filledIcon) : this.emptyIcon.hashCode() + f.b(f.b(f.b(f.b(this.ID.hashCode() * 0x1F, 0x1F, this.type), 0x1F, this.slotsToolTipText), 0x1F, this.emptyToolTipText), 0x1F, this.filledIcon);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = u9.h("Civ5GreatWorkSlots(ID=", this.ID, ", type=", this.type, ", slotsToolTipText=");
        f.t(stringBuilder0, this.slotsToolTipText, ", emptyToolTipText=", this.emptyToolTipText, ", filledIcon=");
        return e.i(stringBuilder0, this.filledIcon, ", emptyIcon=", this.emptyIcon, ")");
    }
}

