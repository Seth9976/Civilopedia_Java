package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import com.google.android.gms.internal.ads.u9;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0017\n\u0002\u0010\u000B\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\b\u0010\u0002\u001A\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0005\u0012\b\u0010\u0006\u001A\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001A\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001A\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001A\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\nJ\u0010\u0010\u0014\u001A\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\t\u0010\u0015\u001A\u00020\u0005HÆ\u0003J\u000B\u0010\u0016\u001A\u0004\u0018\u00010\u0005HÆ\u0003J\u000B\u0010\u0017\u001A\u0004\u0018\u00010\u0005HÆ\u0003J\u000B\u0010\u0018\u001A\u0004\u0018\u00010\u0005HÆ\u0003J\u000B\u0010\u0019\u001A\u0004\u0018\u00010\u0005HÆ\u0003JT\u0010\u001A\u001A\u00020\u00002\n\b\u0002\u0010\u0002\u001A\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00052\n\b\u0002\u0010\u0006\u001A\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001A\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001A\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u001BJ\u0013\u0010\u001C\u001A\u00020\u001D2\b\u0010\u001E\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001F\u001A\u00020\u0003HÖ\u0001J\t\u0010 \u001A\u00020\u0005HÖ\u0001R\u0015\u0010\u0002\u001A\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\r\u001A\u0004\b\u000B\u0010\fR\u0013\u0010\t\u001A\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001A\u0004\b\u000E\u0010\u000FR\u0013\u0010\u0006\u001A\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001A\u0004\b\u0010\u0010\u000FR\u0013\u0010\u0007\u001A\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001A\u0004\b\u0011\u0010\u000FR\u0013\u0010\b\u001A\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001A\u0004\b\u0012\u0010\u000FR\u0011\u0010\u0004\u001A\u00020\u0005¢\u0006\b\n\u0000\u001A\u0004\b\u0013\u0010\u000F¨\u0006!"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ5MinorCivTraits;", "", "ID", "", "type", "", "description", "traitIcon", "traitTitleIcon", "backgroundImage", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getID", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getBackgroundImage", "()Ljava/lang/String;", "getDescription", "getTraitIcon", "getTraitTitleIcon", "getType", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/spears/civilopedia/db/tables/Civ5MinorCivTraits;", "equals", "", "other", "hashCode", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ5MinorCivTraits {
    private final Integer ID;
    private final String backgroundImage;
    private final String description;
    private final String traitIcon;
    private final String traitTitleIcon;
    private final String type;

    public Civ5MinorCivTraits(Integer integer0, String s, String s1, String s2, String s3, String s4) {
        j.f(s, "type");
        super();
        this.ID = integer0;
        this.type = s;
        this.description = s1;
        this.traitIcon = s2;
        this.traitTitleIcon = s3;
        this.backgroundImage = s4;
    }

    public final Integer component1() {
        return this.ID;
    }

    public final String component2() {
        return this.type;
    }

    public final String component3() {
        return this.description;
    }

    public final String component4() {
        return this.traitIcon;
    }

    public final String component5() {
        return this.traitTitleIcon;
    }

    public final String component6() {
        return this.backgroundImage;
    }

    public final Civ5MinorCivTraits copy(Integer integer0, String s, String s1, String s2, String s3, String s4) {
        j.f(s, "type");
        return new Civ5MinorCivTraits(integer0, s, s1, s2, s3, s4);
    }

    public static Civ5MinorCivTraits copy$default(Civ5MinorCivTraits civ5MinorCivTraits0, Integer integer0, String s, String s1, String s2, String s3, String s4, int v, Object object0) {
        if((v & 1) != 0) {
            integer0 = civ5MinorCivTraits0.ID;
        }
        if((v & 2) != 0) {
            s = civ5MinorCivTraits0.type;
        }
        if((v & 4) != 0) {
            s1 = civ5MinorCivTraits0.description;
        }
        if((v & 8) != 0) {
            s2 = civ5MinorCivTraits0.traitIcon;
        }
        if((v & 16) != 0) {
            s3 = civ5MinorCivTraits0.traitTitleIcon;
        }
        if((v & 0x20) != 0) {
            s4 = civ5MinorCivTraits0.backgroundImage;
        }
        return civ5MinorCivTraits0.copy(integer0, s, s1, s2, s3, s4);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ5MinorCivTraits)) {
            return false;
        }
        if(!j.a(this.ID, ((Civ5MinorCivTraits)object0).ID)) {
            return false;
        }
        if(!j.a(this.type, ((Civ5MinorCivTraits)object0).type)) {
            return false;
        }
        if(!j.a(this.description, ((Civ5MinorCivTraits)object0).description)) {
            return false;
        }
        if(!j.a(this.traitIcon, ((Civ5MinorCivTraits)object0).traitIcon)) {
            return false;
        }
        return j.a(this.traitTitleIcon, ((Civ5MinorCivTraits)object0).traitTitleIcon) ? j.a(this.backgroundImage, ((Civ5MinorCivTraits)object0).backgroundImage) : false;
    }

    public final String getBackgroundImage() {
        return this.backgroundImage;
    }

    public final String getDescription() {
        return this.description;
    }

    public final Integer getID() {
        return this.ID;
    }

    public final String getTraitIcon() {
        return this.traitIcon;
    }

    public final String getTraitTitleIcon() {
        return this.traitTitleIcon;
    }

    public final String getType() {
        return this.type;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = f.b((this.ID == null ? 0 : this.ID.hashCode()) * 0x1F, 0x1F, this.type);
        int v2 = this.description == null ? 0 : this.description.hashCode();
        int v3 = this.traitIcon == null ? 0 : this.traitIcon.hashCode();
        int v4 = this.traitTitleIcon == null ? 0 : this.traitTitleIcon.hashCode();
        String s = this.backgroundImage;
        if(s != null) {
            v = s.hashCode();
        }
        return (((v1 + v2) * 0x1F + v3) * 0x1F + v4) * 0x1F + v;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = u9.h("Civ5MinorCivTraits(ID=", this.ID, ", type=", this.type, ", description=");
        f.t(stringBuilder0, this.description, ", traitIcon=", this.traitIcon, ", traitTitleIcon=");
        return e.i(stringBuilder0, this.traitTitleIcon, ", backgroundImage=", this.backgroundImage, ")");
    }
}

