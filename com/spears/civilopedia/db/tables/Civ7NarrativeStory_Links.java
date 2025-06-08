package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000B\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\u0005\u001A\u00020\u0003\u0012\b\u0010\u0006\u001A\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001A\u00020\u0003\u0012\u0006\u0010\b\u001A\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001A\u00020\u0003HÆ\u0003J\u000B\u0010\u0016\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0017\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001A\u00020\tHÆ\u0003JG\u0010\u0019\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00032\b\b\u0002\u0010\u0005\u001A\u00020\u00032\n\b\u0002\u0010\u0006\u001A\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001A\u00020\u00032\b\b\u0002\u0010\b\u001A\u00020\tHÆ\u0001J\u0013\u0010\u001A\u001A\u00020\u001B2\b\u0010\u001C\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001D\u001A\u00020\tHÖ\u0001J\t\u0010\u001E\u001A\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000B\u0010\fR\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\r\u0010\fR\u0013\u0010\u0006\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000E\u0010\fR\u0011\u0010\u0007\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000F\u0010\fR\u0011\u0010\b\u001A\u00020\t¢\u0006\b\n\u0000\u001A\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0012\u0010\f¨\u0006\u001F"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ7NarrativeStory_Links;", "", "fromNarrativeStoryType", "", "toNarrativeStoryType", "description", "imperative", "name", "priority", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "getDescription", "()Ljava/lang/String;", "getFromNarrativeStoryType", "getImperative", "getName", "getPriority", "()I", "getToNarrativeStoryType", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ7NarrativeStory_Links {
    private final String description;
    private final String fromNarrativeStoryType;
    private final String imperative;
    private final String name;
    private final int priority;
    private final String toNarrativeStoryType;

    public Civ7NarrativeStory_Links(String s, String s1, String s2, String s3, String s4, int v) {
        j.f(s, "fromNarrativeStoryType");
        j.f(s1, "toNarrativeStoryType");
        j.f(s2, "description");
        j.f(s4, "name");
        super();
        this.fromNarrativeStoryType = s;
        this.toNarrativeStoryType = s1;
        this.description = s2;
        this.imperative = s3;
        this.name = s4;
        this.priority = v;
    }

    public final String component1() {
        return this.fromNarrativeStoryType;
    }

    public final String component2() {
        return this.toNarrativeStoryType;
    }

    public final String component3() {
        return this.description;
    }

    public final String component4() {
        return this.imperative;
    }

    public final String component5() {
        return this.name;
    }

    public final int component6() {
        return this.priority;
    }

    public final Civ7NarrativeStory_Links copy(String s, String s1, String s2, String s3, String s4, int v) {
        j.f(s, "fromNarrativeStoryType");
        j.f(s1, "toNarrativeStoryType");
        j.f(s2, "description");
        j.f(s4, "name");
        return new Civ7NarrativeStory_Links(s, s1, s2, s3, s4, v);
    }

    public static Civ7NarrativeStory_Links copy$default(Civ7NarrativeStory_Links civ7NarrativeStory_Links0, String s, String s1, String s2, String s3, String s4, int v, int v1, Object object0) {
        if((v1 & 1) != 0) {
            s = civ7NarrativeStory_Links0.fromNarrativeStoryType;
        }
        if((v1 & 2) != 0) {
            s1 = civ7NarrativeStory_Links0.toNarrativeStoryType;
        }
        if((v1 & 4) != 0) {
            s2 = civ7NarrativeStory_Links0.description;
        }
        if((v1 & 8) != 0) {
            s3 = civ7NarrativeStory_Links0.imperative;
        }
        if((v1 & 16) != 0) {
            s4 = civ7NarrativeStory_Links0.name;
        }
        if((v1 & 0x20) != 0) {
            v = civ7NarrativeStory_Links0.priority;
        }
        return civ7NarrativeStory_Links0.copy(s, s1, s2, s3, s4, v);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ7NarrativeStory_Links)) {
            return false;
        }
        if(!j.a(this.fromNarrativeStoryType, ((Civ7NarrativeStory_Links)object0).fromNarrativeStoryType)) {
            return false;
        }
        if(!j.a(this.toNarrativeStoryType, ((Civ7NarrativeStory_Links)object0).toNarrativeStoryType)) {
            return false;
        }
        if(!j.a(this.description, ((Civ7NarrativeStory_Links)object0).description)) {
            return false;
        }
        if(!j.a(this.imperative, ((Civ7NarrativeStory_Links)object0).imperative)) {
            return false;
        }
        return j.a(this.name, ((Civ7NarrativeStory_Links)object0).name) ? this.priority == ((Civ7NarrativeStory_Links)object0).priority : false;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getFromNarrativeStoryType() {
        return this.fromNarrativeStoryType;
    }

    public final String getImperative() {
        return this.imperative;
    }

    public final String getName() {
        return this.name;
    }

    public final int getPriority() {
        return this.priority;
    }

    public final String getToNarrativeStoryType() {
        return this.toNarrativeStoryType;
    }

    @Override
    public int hashCode() {
        int v = f.b(f.b(this.fromNarrativeStoryType.hashCode() * 0x1F, 0x1F, this.toNarrativeStoryType), 0x1F, this.description);
        return this.imperative == null ? f.b(v * 0x1F, 0x1F, this.name) + this.priority : f.b((v + this.imperative.hashCode()) * 0x1F, 0x1F, this.name) + this.priority;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = e.j("Civ7NarrativeStory_Links(fromNarrativeStoryType=", this.fromNarrativeStoryType, ", toNarrativeStoryType=", this.toNarrativeStoryType, ", description=");
        f.t(stringBuilder0, this.description, ", imperative=", this.imperative, ", name=");
        return f.l(stringBuilder0, this.priority, this.name, ", priority=", ")");
    }
}

