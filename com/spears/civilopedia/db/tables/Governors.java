package com.spears.civilopedia.db.tables;

import A.f;
import J2.j;
import com.google.android.gms.internal.ads.u9;
import i3.e;
import kotlin.Metadata;
import o2.m;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0002\b\u001B\n\u0002\u0010\u0000\n\u0002\b\u0013\b\u0086\b\u0018\u00002\u00020\u0001Bi\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0002\u0012\u0006\u0010\u0007\u001A\u00020\u0006\u0012\u0006\u0010\b\u001A\u00020\u0002\u0012\u0006\u0010\t\u001A\u00020\u0002\u0012\u0006\u0010\n\u001A\u00020\u0006\u0012\u0006\u0010\f\u001A\u00020\u000B\u0012\u0006\u0010\r\u001A\u00020\u0002\u0012\u0006\u0010\u000E\u001A\u00020\u0002\u0012\u0006\u0010\u000F\u001A\u00020\u0002\u0012\b\u0010\u0010\u001A\u0004\u0018\u00010\u0002\u00A2\u0006\u0004\b\u0011\u0010\u0012J\u000F\u0010\u0013\u001A\u00020\u0002H\u0016\u00A2\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u0015\u0010\u0014J\u0010\u0010\u0016\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u0016\u0010\u0014J\u0010\u0010\u0017\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u0017\u0010\u0014J\u0010\u0010\u0018\u001A\u00020\u0006H\u00C6\u0003\u00A2\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001A\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u001A\u0010\u0014J\u0010\u0010\u001B\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u001B\u0010\u0014J\u0010\u0010\u001C\u001A\u00020\u0006H\u00C6\u0003\u00A2\u0006\u0004\b\u001C\u0010\u0019J\u0010\u0010\u001D\u001A\u00020\u000BH\u00C6\u0003\u00A2\u0006\u0004\b\u001D\u0010\u001EJ\u0010\u0010\u001F\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u001F\u0010\u0014J\u0010\u0010 \u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b \u0010\u0014J\u0010\u0010!\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b!\u0010\u0014J\u0012\u0010\"\u001A\u0004\u0018\u00010\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\"\u0010\u0014J\u008A\u0001\u0010#\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0004\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00022\b\b\u0002\u0010\u0007\u001A\u00020\u00062\b\b\u0002\u0010\b\u001A\u00020\u00022\b\b\u0002\u0010\t\u001A\u00020\u00022\b\b\u0002\u0010\n\u001A\u00020\u00062\b\b\u0002\u0010\f\u001A\u00020\u000B2\b\b\u0002\u0010\r\u001A\u00020\u00022\b\b\u0002\u0010\u000E\u001A\u00020\u00022\b\b\u0002\u0010\u000F\u001A\u00020\u00022\n\b\u0002\u0010\u0010\u001A\u0004\u0018\u00010\u0002H\u00C6\u0001\u00A2\u0006\u0004\b#\u0010$J\u0010\u0010%\u001A\u00020\u0002H\u00D6\u0001\u00A2\u0006\u0004\b%\u0010\u0014J\u0010\u0010&\u001A\u00020\u0006H\u00D6\u0001\u00A2\u0006\u0004\b&\u0010\u0019J\u001A\u0010)\u001A\u00020\u000B2\b\u0010(\u001A\u0004\u0018\u00010\'H\u00D6\u0003\u00A2\u0006\u0004\b)\u0010*R\u0017\u0010\u0003\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b\u0003\u0010+\u001A\u0004\b,\u0010\u0014R\u0017\u0010\u0004\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b\u0004\u0010+\u001A\u0004\b-\u0010\u0014R\u0017\u0010\u0005\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b\u0005\u0010+\u001A\u0004\b.\u0010\u0014R\u0017\u0010\u0007\u001A\u00020\u00068\u0006\u00A2\u0006\f\n\u0004\b\u0007\u0010/\u001A\u0004\b0\u0010\u0019R\u0017\u0010\b\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b\b\u0010+\u001A\u0004\b1\u0010\u0014R\u0017\u0010\t\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b\t\u0010+\u001A\u0004\b2\u0010\u0014R\u0017\u0010\n\u001A\u00020\u00068\u0006\u00A2\u0006\f\n\u0004\b\n\u0010/\u001A\u0004\b3\u0010\u0019R\u0017\u0010\f\u001A\u00020\u000B8\u0006\u00A2\u0006\f\n\u0004\b\f\u00104\u001A\u0004\b5\u0010\u001ER\u0017\u0010\r\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b\r\u0010+\u001A\u0004\b6\u0010\u0014R\u0017\u0010\u000E\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b\u000E\u0010+\u001A\u0004\b7\u0010\u0014R\u0017\u0010\u000F\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b\u000F\u0010+\u001A\u0004\b8\u0010\u0014R\u0019\u0010\u0010\u001A\u0004\u0018\u00010\u00028\u0006\u00A2\u0006\f\n\u0004\b\u0010\u0010+\u001A\u0004\b9\u0010\u0014\u00A8\u0006:"}, d2 = {"Lcom/spears/civilopedia/db/tables/Governors;", "Lo2/m;", "", "governorType", "name", "description", "", "identityPressure", "title", "shortTitle", "transitionStrength", "", "assignCityState", "image", "portraitImage", "portraitImageSelected", "traitType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;IZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "primaryKey", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "()I", "component5", "component6", "component7", "component8", "()Z", "component9", "component10", "component11", "component12", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;IZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/spears/civilopedia/db/tables/Governors;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getGovernorType", "getName", "getDescription", "I", "getIdentityPressure", "getTitle", "getShortTitle", "getTransitionStrength", "Z", "getAssignCityState", "getImage", "getPortraitImage", "getPortraitImageSelected", "getTraitType", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Governors implements m {
    private final boolean assignCityState;
    private final String description;
    private final String governorType;
    private final int identityPressure;
    private final String image;
    private final String name;
    private final String portraitImage;
    private final String portraitImageSelected;
    private final String shortTitle;
    private final String title;
    private final String traitType;
    private final int transitionStrength;

    public Governors(String s, String s1, String s2, int v, String s3, String s4, int v1, boolean z, String s5, String s6, String s7, String s8) {
        j.f(s, "governorType");
        j.f(s1, "name");
        j.f(s2, "description");
        j.f(s3, "title");
        j.f(s4, "shortTitle");
        j.f(s5, "image");
        j.f(s6, "portraitImage");
        j.f(s7, "portraitImageSelected");
        super();
        this.governorType = s;
        this.name = s1;
        this.description = s2;
        this.identityPressure = v;
        this.title = s3;
        this.shortTitle = s4;
        this.transitionStrength = v1;
        this.assignCityState = z;
        this.image = s5;
        this.portraitImage = s6;
        this.portraitImageSelected = s7;
        this.traitType = s8;
    }

    public final String component1() {
        return this.governorType;
    }

    public final String component10() {
        return this.portraitImage;
    }

    public final String component11() {
        return this.portraitImageSelected;
    }

    public final String component12() {
        return this.traitType;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.description;
    }

    public final int component4() {
        return this.identityPressure;
    }

    public final String component5() {
        return this.title;
    }

    public final String component6() {
        return this.shortTitle;
    }

    public final int component7() {
        return this.transitionStrength;
    }

    public final boolean component8() {
        return this.assignCityState;
    }

    public final String component9() {
        return this.image;
    }

    public final Governors copy(String s, String s1, String s2, int v, String s3, String s4, int v1, boolean z, String s5, String s6, String s7, String s8) {
        j.f(s, "governorType");
        j.f(s1, "name");
        j.f(s2, "description");
        j.f(s3, "title");
        j.f(s4, "shortTitle");
        j.f(s5, "image");
        j.f(s6, "portraitImage");
        j.f(s7, "portraitImageSelected");
        return new Governors(s, s1, s2, v, s3, s4, v1, z, s5, s6, s7, s8);
    }

    public static Governors copy$default(Governors governors0, String s, String s1, String s2, int v, String s3, String s4, int v1, boolean z, String s5, String s6, String s7, String s8, int v2, Object object0) {
        String s9 = (v2 & 1) == 0 ? s : governors0.governorType;
        String s10 = (v2 & 2) == 0 ? s1 : governors0.name;
        String s11 = (v2 & 4) == 0 ? s2 : governors0.description;
        int v3 = (v2 & 8) == 0 ? v : governors0.identityPressure;
        String s12 = (v2 & 16) == 0 ? s3 : governors0.title;
        String s13 = (v2 & 0x20) == 0 ? s4 : governors0.shortTitle;
        int v4 = (v2 & 0x40) == 0 ? v1 : governors0.transitionStrength;
        boolean z1 = (v2 & 0x80) == 0 ? z : governors0.assignCityState;
        String s14 = (v2 & 0x100) == 0 ? s5 : governors0.image;
        String s15 = (v2 & 0x200) == 0 ? s6 : governors0.portraitImage;
        String s16 = (v2 & 0x400) == 0 ? s7 : governors0.portraitImageSelected;
        return (v2 & 0x800) == 0 ? governors0.copy(s9, s10, s11, v3, s12, s13, v4, z1, s14, s15, s16, s8) : governors0.copy(s9, s10, s11, v3, s12, s13, v4, z1, s14, s15, s16, governors0.traitType);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Governors)) {
            return false;
        }
        if(!j.a(this.governorType, ((Governors)object0).governorType)) {
            return false;
        }
        if(!j.a(this.name, ((Governors)object0).name)) {
            return false;
        }
        if(!j.a(this.description, ((Governors)object0).description)) {
            return false;
        }
        if(this.identityPressure != ((Governors)object0).identityPressure) {
            return false;
        }
        if(!j.a(this.title, ((Governors)object0).title)) {
            return false;
        }
        if(!j.a(this.shortTitle, ((Governors)object0).shortTitle)) {
            return false;
        }
        if(this.transitionStrength != ((Governors)object0).transitionStrength) {
            return false;
        }
        if(this.assignCityState != ((Governors)object0).assignCityState) {
            return false;
        }
        if(!j.a(this.image, ((Governors)object0).image)) {
            return false;
        }
        if(!j.a(this.portraitImage, ((Governors)object0).portraitImage)) {
            return false;
        }
        return j.a(this.portraitImageSelected, ((Governors)object0).portraitImageSelected) ? j.a(this.traitType, ((Governors)object0).traitType) : false;
    }

    public final boolean getAssignCityState() {
        return this.assignCityState;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getGovernorType() {
        return this.governorType;
    }

    public final int getIdentityPressure() {
        return this.identityPressure;
    }

    public final String getImage() {
        return this.image;
    }

    public final String getName() {
        return this.name;
    }

    public final String getPortraitImage() {
        return this.portraitImage;
    }

    public final String getPortraitImageSelected() {
        return this.portraitImageSelected;
    }

    public final String getShortTitle() {
        return this.shortTitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getTraitType() {
        return this.traitType;
    }

    public final int getTransitionStrength() {
        return this.transitionStrength;
    }

    @Override
    public int hashCode() {
        int v = f.b(f.b(f.b(((f.b(f.b((f.b(f.b(this.governorType.hashCode() * 0x1F, 0x1F, this.name), 0x1F, this.description) + this.identityPressure) * 0x1F, 0x1F, this.title), 0x1F, this.shortTitle) + this.transitionStrength) * 0x1F + (this.assignCityState ? 0x4CF : 0x4D5)) * 0x1F, 0x1F, this.image), 0x1F, this.portraitImage), 0x1F, this.portraitImageSelected);
        return this.traitType == null ? v : v + this.traitType.hashCode();
    }

    @Override  // o2.m
    public String primaryKey() {
        return this.governorType;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = e.j("Governors(governorType=", this.governorType, ", name=", this.name, ", description=");
        f.s(stringBuilder0, this.description, ", identityPressure=", this.identityPressure, ", title=");
        f.t(stringBuilder0, this.title, ", shortTitle=", this.shortTitle, ", transitionStrength=");
        u9.r(stringBuilder0, this.transitionStrength, ", assignCityState=", this.assignCityState, ", image=");
        f.t(stringBuilder0, this.image, ", portraitImage=", this.portraitImage, ", portraitImageSelected=");
        return e.i(stringBuilder0, this.portraitImageSelected, ", traitType=", this.traitType, ")");
    }
}

