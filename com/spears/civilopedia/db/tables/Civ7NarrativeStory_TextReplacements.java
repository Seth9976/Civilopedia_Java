package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import com.google.android.gms.internal.ads.u9;
import i3.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000E\n\u0002\u0010\u000B\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\u0005\u001A\u00020\u0006\u0012\u0006\u0010\u0007\u001A\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000F\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001A\u00020\u0006HÆ\u0003J\t\u0010\u0012\u001A\u00020\u0003HÆ\u0003J1\u0010\u0013\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00032\b\b\u0002\u0010\u0005\u001A\u00020\u00062\b\b\u0002\u0010\u0007\u001A\u00020\u0003HÆ\u0001J\u0013\u0010\u0014\u001A\u00020\u00152\b\u0010\u0016\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001A\u00020\u0006HÖ\u0001J\t\u0010\u0018\u001A\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000B\u0010\nR\u0011\u0010\u0007\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\f\u0010\nR\u0011\u0010\u0005\u001A\u00020\u0006¢\u0006\b\n\u0000\u001A\u0004\b\r\u0010\u000E¨\u0006\u0019"}, d2 = {"Lcom/spears/civilopedia/db/tables/Civ7NarrativeStory_TextReplacements;", "", "narrativeStoryTextType", "", "narrativeStoryType", "priority", "", "narrativeTextReplacementType", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", "getNarrativeStoryTextType", "()Ljava/lang/String;", "getNarrativeStoryType", "getNarrativeTextReplacementType", "getPriority", "()I", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Civ7NarrativeStory_TextReplacements {
    private final String narrativeStoryTextType;
    private final String narrativeStoryType;
    private final String narrativeTextReplacementType;
    private final int priority;

    public Civ7NarrativeStory_TextReplacements(String s, String s1, int v, String s2) {
        j.f(s, "narrativeStoryTextType");
        j.f(s1, "narrativeStoryType");
        j.f(s2, "narrativeTextReplacementType");
        super();
        this.narrativeStoryTextType = s;
        this.narrativeStoryType = s1;
        this.priority = v;
        this.narrativeTextReplacementType = s2;
    }

    public final String component1() {
        return this.narrativeStoryTextType;
    }

    public final String component2() {
        return this.narrativeStoryType;
    }

    public final int component3() {
        return this.priority;
    }

    public final String component4() {
        return this.narrativeTextReplacementType;
    }

    public final Civ7NarrativeStory_TextReplacements copy(String s, String s1, int v, String s2) {
        j.f(s, "narrativeStoryTextType");
        j.f(s1, "narrativeStoryType");
        j.f(s2, "narrativeTextReplacementType");
        return new Civ7NarrativeStory_TextReplacements(s, s1, v, s2);
    }

    public static Civ7NarrativeStory_TextReplacements copy$default(Civ7NarrativeStory_TextReplacements civ7NarrativeStory_TextReplacements0, String s, String s1, int v, String s2, int v1, Object object0) {
        if((v1 & 1) != 0) {
            s = civ7NarrativeStory_TextReplacements0.narrativeStoryTextType;
        }
        if((v1 & 2) != 0) {
            s1 = civ7NarrativeStory_TextReplacements0.narrativeStoryType;
        }
        if((v1 & 4) != 0) {
            v = civ7NarrativeStory_TextReplacements0.priority;
        }
        if((v1 & 8) != 0) {
            s2 = civ7NarrativeStory_TextReplacements0.narrativeTextReplacementType;
        }
        return civ7NarrativeStory_TextReplacements0.copy(s, s1, v, s2);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Civ7NarrativeStory_TextReplacements)) {
            return false;
        }
        if(!j.a(this.narrativeStoryTextType, ((Civ7NarrativeStory_TextReplacements)object0).narrativeStoryTextType)) {
            return false;
        }
        if(!j.a(this.narrativeStoryType, ((Civ7NarrativeStory_TextReplacements)object0).narrativeStoryType)) {
            return false;
        }
        return this.priority == ((Civ7NarrativeStory_TextReplacements)object0).priority ? j.a(this.narrativeTextReplacementType, ((Civ7NarrativeStory_TextReplacements)object0).narrativeTextReplacementType) : false;
    }

    public final String getNarrativeStoryTextType() {
        return this.narrativeStoryTextType;
    }

    public final String getNarrativeStoryType() {
        return this.narrativeStoryType;
    }

    public final String getNarrativeTextReplacementType() {
        return this.narrativeTextReplacementType;
    }

    public final int getPriority() {
        return this.priority;
    }

    @Override
    public int hashCode() {
        return this.narrativeTextReplacementType.hashCode() + (f.b(this.narrativeStoryTextType.hashCode() * 0x1F, 0x1F, this.narrativeStoryType) + this.priority) * 0x1F;
    }

    @Override
    public String toString() {
        return u9.e(e.j("Civ7NarrativeStory_TextReplacements(narrativeStoryTextType=", this.narrativeStoryTextType, ", narrativeStoryType=", this.narrativeStoryType, ", priority="), this.priority, ", narrativeTextReplacementType=", this.narrativeTextReplacementType, ")");
    }
}

