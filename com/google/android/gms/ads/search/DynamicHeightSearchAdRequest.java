package com.google.android.gms.ads.search;

import android.content.Context;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.NetworkExtras;

public final class DynamicHeightSearchAdRequest {
    public static final class Builder {
        public final zzb a;
        public final Bundle b;

        public Builder() {
            this.a = new zzb();
            this.b = new Bundle();
        }

        public Builder addCustomEventExtrasBundle(Class class0, Bundle bundle0) {
            this.a.zzb(class0, bundle0);
            return this;
        }

        public Builder addNetworkExtras(NetworkExtras networkExtras0) {
            this.a.zzc(networkExtras0);
            return this;
        }

        public Builder addNetworkExtrasBundle(Class class0, Bundle bundle0) {
            this.a.zzd(class0, bundle0);
            return this;
        }

        public DynamicHeightSearchAdRequest build() {
            this.a.zzd(AdMobAdapter.class, this.b);
            return new DynamicHeightSearchAdRequest(this);
        }

        public Builder setAdBorderSelectors(String s) {
            this.b.putString("csa_adBorderSelectors", s);
            return this;
        }

        public Builder setAdTest(boolean z) {
            this.b.putString("csa_adtest", (z ? "on" : "off"));
            return this;
        }

        public Builder setAdjustableLineHeight(int v) {
            this.b.putString("csa_adjustableLineHeight", Integer.toString(v));
            return this;
        }

        public Builder setAdvancedOptionValue(String s, String s1) {
            this.b.putString(s, s1);
            return this;
        }

        public Builder setAttributionSpacingBelow(int v) {
            this.b.putString("csa_attributionSpacingBelow", Integer.toString(v));
            return this;
        }

        public Builder setBorderSelections(String s) {
            this.b.putString("csa_borderSelections", s);
            return this;
        }

        public Builder setChannel(String s) {
            this.b.putString("csa_channel", s);
            return this;
        }

        public Builder setColorAdBorder(String s) {
            this.b.putString("csa_colorAdBorder", s);
            return this;
        }

        public Builder setColorAdSeparator(String s) {
            this.b.putString("csa_colorAdSeparator", s);
            return this;
        }

        public Builder setColorAnnotation(String s) {
            this.b.putString("csa_colorAnnotation", s);
            return this;
        }

        public Builder setColorAttribution(String s) {
            this.b.putString("csa_colorAttribution", s);
            return this;
        }

        public Builder setColorBackground(String s) {
            this.b.putString("csa_colorBackground", s);
            return this;
        }

        public Builder setColorBorder(String s) {
            this.b.putString("csa_colorBorder", s);
            return this;
        }

        public Builder setColorDomainLink(String s) {
            this.b.putString("csa_colorDomainLink", s);
            return this;
        }

        public Builder setColorText(String s) {
            this.b.putString("csa_colorText", s);
            return this;
        }

        public Builder setColorTitleLink(String s) {
            this.b.putString("csa_colorTitleLink", s);
            return this;
        }

        public Builder setCssWidth(int v) {
            this.b.putString("csa_width", Integer.toString(v));
            return this;
        }

        public Builder setDetailedAttribution(boolean z) {
            this.b.putString("csa_detailedAttribution", Boolean.toString(z));
            return this;
        }

        public Builder setFontFamily(String s) {
            this.b.putString("csa_fontFamily", s);
            return this;
        }

        public Builder setFontFamilyAttribution(String s) {
            this.b.putString("csa_fontFamilyAttribution", s);
            return this;
        }

        public Builder setFontSizeAnnotation(int v) {
            this.b.putString("csa_fontSizeAnnotation", Integer.toString(v));
            return this;
        }

        public Builder setFontSizeAttribution(int v) {
            this.b.putString("csa_fontSizeAttribution", Integer.toString(v));
            return this;
        }

        public Builder setFontSizeDescription(int v) {
            this.b.putString("csa_fontSizeDescription", Integer.toString(v));
            return this;
        }

        public Builder setFontSizeDomainLink(int v) {
            this.b.putString("csa_fontSizeDomainLink", Integer.toString(v));
            return this;
        }

        public Builder setFontSizeTitle(int v) {
            this.b.putString("csa_fontSizeTitle", Integer.toString(v));
            return this;
        }

        public Builder setHostLanguage(String s) {
            this.b.putString("csa_hl", s);
            return this;
        }

        public Builder setIsClickToCallEnabled(boolean z) {
            this.b.putString("csa_clickToCall", Boolean.toString(z));
            return this;
        }

        public Builder setIsLocationEnabled(boolean z) {
            this.b.putString("csa_location", Boolean.toString(z));
            return this;
        }

        public Builder setIsPlusOnesEnabled(boolean z) {
            this.b.putString("csa_plusOnes", Boolean.toString(z));
            return this;
        }

        public Builder setIsSellerRatingsEnabled(boolean z) {
            this.b.putString("csa_sellerRatings", Boolean.toString(z));
            return this;
        }

        public Builder setIsSiteLinksEnabled(boolean z) {
            this.b.putString("csa_siteLinks", Boolean.toString(z));
            return this;
        }

        public Builder setIsTitleBold(boolean z) {
            this.b.putString("csa_titleBold", Boolean.toString(z));
            return this;
        }

        public Builder setIsTitleUnderlined(boolean z) {
            this.b.putString("csa_noTitleUnderline", Boolean.toString(!z));
            return this;
        }

        public Builder setLocationColor(String s) {
            this.b.putString("csa_colorLocation", s);
            return this;
        }

        public Builder setLocationFontSize(int v) {
            this.b.putString("csa_fontSizeLocation", Integer.toString(v));
            return this;
        }

        public Builder setLongerHeadlines(boolean z) {
            this.b.putString("csa_longerHeadlines", Boolean.toString(z));
            return this;
        }

        public Builder setNumber(int v) {
            this.b.putString("csa_number", Integer.toString(v));
            return this;
        }

        public Builder setPage(int v) {
            this.b.putString("csa_adPage", Integer.toString(v));
            return this;
        }

        public Builder setQuery(String s) {
            this.a.zze(s);
            return this;
        }

        public Builder setStyleId(String s) {
            this.b.putString("csa_styleId", s);
            return this;
        }

        public Builder setVerticalSpacing(int v) {
            this.b.putString("csa_verticalSpacing", Integer.toString(v));
            return this;
        }
    }

    public final SearchAdRequest a;

    public DynamicHeightSearchAdRequest(Builder dynamicHeightSearchAdRequest$Builder0) {
        this.a = new SearchAdRequest(dynamicHeightSearchAdRequest$Builder0.a);
    }

    public Bundle getCustomEventExtrasBundle(Class class0) {
        return this.a.getCustomEventExtrasBundle(class0);
    }

    public Bundle getNetworkExtrasBundle(Class class0) {
        return this.a.getNetworkExtrasBundle(class0);
    }

    public String getQuery() {
        return this.a.getQuery();
    }

    public boolean isTestDevice(Context context0) {
        return this.a.isTestDevice(context0);
    }
}

