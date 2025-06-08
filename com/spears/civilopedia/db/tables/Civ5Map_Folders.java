package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0010\u000B\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\b\u0010\u0004\u001A\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001A\u00020\u0003\u0012\u0006\u0010\u0006\u001A\u00020\u0003\u0012\b\u0010\u0007\u001A\u0004\u0018\u00010\b\u0012\b\u0010\t\u001A\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\nJ\t\u0010\u0014\u001A\u00020\u0003HÆ\u0003J\u000B\u0010\u0015\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0016\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001A\u00020\u0003HÆ\u0003J\u0010\u0010\u0018\u001A\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u000FJ\u000B\u0010\u0019\u001A\u0004\u0018\u00010\u0003HÆ\u0003JP\u0010\u001A\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001A\u00020\u00032\b\b\u0002\u0010\u0006\u001A\u00020\u00032\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001A\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u001BJ\u0013\u0010\u001C\u001A\u00020\u001D2\b\u0010\u001E\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001F\u001A\u00020\bHÖ\u0001J\t\u0010 \u001A\u00020\u0003HÖ\u0001R\u0011\u0010\u0006\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000B\u0010\fR\u0013\u0010\t\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\r\u0010\fR\u0015\u0010\u0007\u001A\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0010\u001A\u0004\b\u000E\u0010\u000FR\u0013\u0010\u0004\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0011\u0010\fR\u0011\u0010\u0005\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0012\u0010\fR\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0013\u0010\f¨\u0006!"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ5Map_Folders;", "", "type", "", "parentType", "title", "description", "iconIndex", "", "iconAtlas", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "getIconAtlas", "getIconIndex", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getParentType", "getTitle", "getType", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)Lcom/spears/civilopedia/db/tables/Civ5Map_Folders;", "equals", "", "other", "hashCode", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ5Map_Folders {
    private final String description;
    private final String iconAtlas;
    private final Integer iconIndex;
    private final String parentType;
    private final String title;
    private final String type;

    public Civ5Map_Folders(String s, String s1, String s2, String s3, Integer integer0, String s4) {
        j.f(s, "type");
        j.f(s2, "title");
        j.f(s3, "description");
        super();
        this.type = s;
        this.parentType = s1;
        this.title = s2;
        this.description = s3;
        this.iconIndex = integer0;
        this.iconAtlas = s4;
    }

    public final String component1() {
        return this.type;
    }

    public final String component2() {
        return this.parentType;
    }

    public final String component3() {
        return this.title;
    }

    public final String component4() {
        return this.description;
    }

    public final Integer component5() {
        return this.iconIndex;
    }

    public final String component6() {
        return this.iconAtlas;
    }

    public final Civ5Map_Folders copy(String s, String s1, String s2, String s3, Integer integer0, String s4) {
        j.f(s, "type");
        j.f(s2, "title");
        j.f(s3, "description");
        return new Civ5Map_Folders(s, s1, s2, s3, integer0, s4);
    }

    public static Civ5Map_Folders copy$default(Civ5Map_Folders civ5Map_Folders0, String s, String s1, String s2, String s3, Integer integer0, String s4, int v, Object object0) {
        if((v & 1) != 0) {
            s = civ5Map_Folders0.type;
        }
        if((v & 2) != 0) {
            s1 = civ5Map_Folders0.parentType;
        }
        if((v & 4) != 0) {
            s2 = civ5Map_Folders0.title;
        }
        if((v & 8) != 0) {
            s3 = civ5Map_Folders0.description;
        }
        if((v & 16) != 0) {
            integer0 = civ5Map_Folders0.iconIndex;
        }
        if((v & 0x20) != 0) {
            s4 = civ5Map_Folders0.iconAtlas;
        }
        return civ5Map_Folders0.copy(s, s1, s2, s3, integer0, s4);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ5Map_Folders)) {
            return false;
        }
        if(!j.a(this.type, ((Civ5Map_Folders)object0).type)) {
            return false;
        }
        if(!j.a(this.parentType, ((Civ5Map_Folders)object0).parentType)) {
            return false;
        }
        if(!j.a(this.title, ((Civ5Map_Folders)object0).title)) {
            return false;
        }
        if(!j.a(this.description, ((Civ5Map_Folders)object0).description)) {
            return false;
        }
        return j.a(this.iconIndex, ((Civ5Map_Folders)object0).iconIndex) ? j.a(this.iconAtlas, ((Civ5Map_Folders)object0).iconAtlas) : false;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getIconAtlas() {
        return this.iconAtlas;
    }

    public final Integer getIconIndex() {
        return this.iconIndex;
    }

    public final String getParentType() {
        return this.parentType;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getType() {
        return this.type;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = f.b(f.b((this.type.hashCode() * 0x1F + (this.parentType == null ? 0 : this.parentType.hashCode())) * 0x1F, 0x1F, this.title), 0x1F, this.description);
        int v2 = this.iconIndex == null ? 0 : this.iconIndex.hashCode();
        String s = this.iconAtlas;
        if(s != null) {
            v = s.hashCode();
        }
        return (v1 + v2) * 0x1F + v;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = e.j("Civ5Map_Folders(type=", this.type, ", parentType=", this.parentType, ", title=");
        f.t(stringBuilder0, this.title, ", description=", this.description, ", iconIndex=");
        stringBuilder0.append(this.iconIndex);
        stringBuilder0.append(", iconAtlas=");
        stringBuilder0.append(this.iconAtlas);
        stringBuilder0.append(")");
        return stringBuilder0.toString();
    }
}

