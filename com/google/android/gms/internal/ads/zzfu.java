package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;

public final class zzfu extends zzek {
    public final byte[] e;
    public final DatagramPacket f;
    public Uri g;
    public DatagramSocket h;
    public MulticastSocket i;
    public InetAddress j;
    public boolean k;
    public int l;

    public zzfu() {
        this(2000);
    }

    public zzfu(int v) {
        super(true);
        byte[] arr_b = new byte[2000];
        this.e = arr_b;
        this.f = new DatagramPacket(arr_b, 0, 2000);
    }

    @Override  // com.google.android.gms.internal.ads.zzp
    public final int zza(byte[] arr_b, int v, int v1) throws zzft {
        if(v1 == 0) {
            return 0;
        }
        DatagramPacket datagramPacket0 = this.f;
        if(this.l == 0) {
            try {
                DatagramSocket datagramSocket0 = this.h;
                if(datagramSocket0 == null) {
                    throw null;
                }
                datagramSocket0.receive(datagramPacket0);
            }
            catch(SocketTimeoutException socketTimeoutException0) {
                throw new zzft(socketTimeoutException0, 2002);
            }
            catch(IOException iOException0) {
                throw new zzft(iOException0, 2001);
            }
            int v2 = datagramPacket0.getLength();
            this.l = v2;
            this.zzg(v2);
        }
        int v3 = datagramPacket0.getLength();
        int v4 = Math.min(this.l, v1);
        System.arraycopy(this.e, v3 - this.l, arr_b, v, v4);
        this.l -= v4;
        return v4;
    }

    @Override  // com.google.android.gms.internal.ads.zzeq
    public final long zzb(zzev zzev0) throws zzft {
        this.g = zzev0.zza;
        String s = zzev0.zza.getHost();
        s.getClass();
        int v = this.g.getPort();
        this.b(zzev0);
        try {
            this.j = InetAddress.getByName(s);
            InetSocketAddress inetSocketAddress0 = new InetSocketAddress(this.j, v);
            if(this.j.isMulticastAddress()) {
                MulticastSocket multicastSocket0 = new MulticastSocket(inetSocketAddress0);
                this.i = multicastSocket0;
                multicastSocket0.joinGroup(this.j);
                this.h = this.i;
            }
            else {
                this.h = new DatagramSocket(inetSocketAddress0);
            }
            this.h.setSoTimeout(8000);
            goto label_21;
        }
        catch(SecurityException securityException0) {
        }
        catch(IOException iOException0) {
            throw new zzft(iOException0, 2001);
        }
        throw new zzft(securityException0, 2006);
    label_21:
        this.k = true;
        this.c(zzev0);
        return -1L;
    }

    @Override  // com.google.android.gms.internal.ads.zzeq
    public final Uri zzc() {
        return this.g;
    }

    @Override  // com.google.android.gms.internal.ads.zzeq
    public final void zzd() {
        this.g = null;
        MulticastSocket multicastSocket0 = this.i;
        if(multicastSocket0 != null) {
            try {
                InetAddress inetAddress0 = this.j;
                if(inetAddress0 == null) {
                    throw null;
                }
                multicastSocket0.leaveGroup(inetAddress0);
            }
            catch(IOException unused_ex) {
            }
            this.i = null;
        }
        DatagramSocket datagramSocket0 = this.h;
        if(datagramSocket0 != null) {
            datagramSocket0.close();
            this.h = null;
        }
        this.j = null;
        this.l = 0;
        if(this.k) {
            this.k = false;
            this.a();
        }
    }
}

