package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.Principal;
import java.security.PublicKey;
import java.security.cert.X509Certificate;
import java.util.Date;
import java.util.Set;

public final class l0 extends X509Certificate {
    public final X509Certificate i;
    public final byte[] j;

    public l0(X509Certificate x509Certificate0, byte[] arr_b) {
        this.i = x509Certificate0;
        this.j = arr_b;
    }

    @Override
    public final void checkValidity() {
        this.i.checkValidity();
    }

    @Override
    public final void checkValidity(Date date0) {
        this.i.checkValidity(date0);
    }

    @Override
    public final int getBasicConstraints() {
        return this.i.getBasicConstraints();
    }

    @Override
    public final Set getCriticalExtensionOIDs() {
        return this.i.getCriticalExtensionOIDs();
    }

    @Override
    public final byte[] getEncoded() {
        return this.j;
    }

    @Override
    public final byte[] getExtensionValue(String s) {
        return this.i.getExtensionValue(s);
    }

    @Override
    public final Principal getIssuerDN() {
        return this.i.getIssuerDN();
    }

    @Override
    public final boolean[] getIssuerUniqueID() {
        return this.i.getIssuerUniqueID();
    }

    @Override
    public final boolean[] getKeyUsage() {
        return this.i.getKeyUsage();
    }

    @Override
    public final Set getNonCriticalExtensionOIDs() {
        return this.i.getNonCriticalExtensionOIDs();
    }

    @Override
    public final Date getNotAfter() {
        return this.i.getNotAfter();
    }

    @Override
    public final Date getNotBefore() {
        return this.i.getNotBefore();
    }

    @Override
    public final PublicKey getPublicKey() {
        return this.i.getPublicKey();
    }

    @Override
    public final BigInteger getSerialNumber() {
        return this.i.getSerialNumber();
    }

    @Override
    public final String getSigAlgName() {
        return this.i.getSigAlgName();
    }

    @Override
    public final String getSigAlgOID() {
        return this.i.getSigAlgOID();
    }

    @Override
    public final byte[] getSigAlgParams() {
        return this.i.getSigAlgParams();
    }

    @Override
    public final byte[] getSignature() {
        return this.i.getSignature();
    }

    @Override
    public final Principal getSubjectDN() {
        return this.i.getSubjectDN();
    }

    @Override
    public final boolean[] getSubjectUniqueID() {
        return this.i.getSubjectUniqueID();
    }

    @Override
    public final byte[] getTBSCertificate() {
        return this.i.getTBSCertificate();
    }

    @Override
    public final int getVersion() {
        return this.i.getVersion();
    }

    @Override
    public final boolean hasUnsupportedCriticalExtension() {
        return this.i.hasUnsupportedCriticalExtension();
    }

    @Override
    public final String toString() {
        return this.i.toString();
    }

    @Override
    public final void verify(PublicKey publicKey0) {
        this.i.verify(publicKey0);
    }

    @Override
    public final void verify(PublicKey publicKey0, String s) {
        this.i.verify(publicKey0, s);
    }
}

