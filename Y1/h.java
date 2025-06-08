package y1;

import L3.l;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class h implements Closeable {
    public final RandomAccessFile i;
    public int j;
    public int k;
    public e l;
    public e m;
    public final byte[] n;
    public static final Logger o;

    static {
        h.o = Logger.getLogger(h.class.getName());
    }

    public h(File file0) {
        byte[] arr_b = new byte[16];
        this.n = arr_b;
        if(!file0.exists()) {
            File file1 = new File(file0.getPath() + ".tmp");
            try(RandomAccessFile randomAccessFile0 = new RandomAccessFile(file1, "rwd")) {
                randomAccessFile0.setLength(0x1000L);
                randomAccessFile0.seek(0L);
                byte[] arr_b1 = new byte[16];
                int v = 0;
                for(int v1 = 0; true; ++v1) {
                    if(v1 >= 4) {
                        break;
                    }
                    h.o(arr_b1, v, new int[]{0x1000, 0, 0, 0}[v1]);
                    v += 4;
                }
                randomAccessFile0.write(arr_b1);
            }
            if(!file1.renameTo(file0)) {
                throw new IOException("Rename failed!");
            }
        }
        RandomAccessFile randomAccessFile1 = new RandomAccessFile(file0, "rwd");
        this.i = randomAccessFile1;
        randomAccessFile1.seek(0L);
        randomAccessFile1.readFully(arr_b);
        int v2 = h.g(0, arr_b);
        this.j = v2;
        if(((long)v2) > randomAccessFile1.length()) {
            throw new IOException("File is truncated. Expected length: " + this.j + ", Actual length: " + randomAccessFile1.length());
        }
        this.k = h.g(4, arr_b);
        int v3 = h.g(8, arr_b);
        int v4 = h.g(12, arr_b);
        this.l = this.f(v3);
        this.m = this.f(v4);
    }

    public final void a(byte[] arr_b) {
        synchronized(this) {
            if(arr_b.length >= 0 && arr_b.length <= arr_b.length) {
                this.c(arr_b.length);
                boolean z = this.e();
                int v1 = z ? 16 : this.m(this.m.a + 4 + this.m.b);
                e e0 = new e(v1, arr_b.length);
                h.o(this.n, 0, arr_b.length);
                this.k(this.n, v1, 4);
                this.k(arr_b, v1 + 4, arr_b.length);
                this.n(this.j, this.k + 1, (z ? v1 : this.l.a), v1);
                this.m = e0;
                ++this.k;
                if(z) {
                    this.l = e0;
                }
                return;
            }
        }
        throw new IndexOutOfBoundsException();
    }

    public final void b() {
        synchronized(this) {
            this.n(0x1000, 0, 0, 0);
            this.k = 0;
            this.l = e.c;
            this.m = e.c;
            if(this.j > 0x1000) {
                this.i.setLength(0x1000L);
                this.i.getChannel().force(true);
            }
            this.j = 0x1000;
        }
    }

    public final void c(int v) {
        int v1 = this.j - this.l();
        if(v1 >= v + 4) {
            return;
        }
        int v2 = this.j;
        do {
            v1 += v2;
            v2 <<= 1;
        }
        while(v1 < v + 4);
        RandomAccessFile randomAccessFile0 = this.i;
        randomAccessFile0.setLength(((long)v2));
        randomAccessFile0.getChannel().force(true);
        int v3 = this.m(this.m.a + 4 + this.m.b);
        if(v3 < this.l.a) {
            FileChannel fileChannel0 = randomAccessFile0.getChannel();
            fileChannel0.position(((long)this.j));
            if(fileChannel0.transferTo(16L, ((long)(v3 - 4)), fileChannel0) != ((long)(v3 - 4))) {
                throw new AssertionError("Copied insufficient number of bytes!");
            }
        }
        int v4 = this.m.a;
        int v5 = this.l.a;
        if(v4 < v5) {
            int v6 = this.j + v4 - 16;
            this.n(v2, this.k, v5, v6);
            this.m = new e(v6, this.m.b);
        }
        else {
            this.n(v2, this.k, v5, v4);
        }
        this.j = v2;
    }

    @Override
    public final void close() {
        synchronized(this) {
            this.i.close();
        }
    }

    public final void d(g g0) {
        synchronized(this) {
            int v1 = this.l.a;
            for(int v2 = 0; v2 < this.k; ++v2) {
                e e0 = this.f(v1);
                g0.a(new f(this, e0), e0.b);
                v1 = this.m(e0.a + 4 + e0.b);
            }
        }
    }

    public final boolean e() {
        synchronized(this) {
        }
        return this.k == 0;
    }

    public final e f(int v) {
        if(v == 0) {
            return e.c;
        }
        this.i.seek(((long)v));
        return new e(v, this.i.readInt());
    }

    public static int g(int v, byte[] arr_b) {
        return ((arr_b[v] & 0xFF) << 24) + ((arr_b[v + 1] & 0xFF) << 16) + ((arr_b[v + 2] & 0xFF) << 8) + (arr_b[v + 3] & 0xFF);
    }

    public final void i() {
        synchronized(this) {
            if(!this.e()) {
                if(this.k == 1) {
                    this.b();
                }
                else {
                    int v1 = this.m(this.l.a + 4 + this.l.b);
                    this.j(v1, 0, 4, this.n);
                    int v2 = h.g(0, this.n);
                    this.n(this.j, this.k - 1, v1, this.m.a);
                    --this.k;
                    this.l = new e(v1, v2);
                }
                return;
            }
        }
        throw new NoSuchElementException();
    }

    public final void j(int v, int v1, int v2, byte[] arr_b) {
        int v3 = this.m(v);
        int v4 = this.j;
        RandomAccessFile randomAccessFile0 = this.i;
        if(v3 + v2 <= v4) {
            randomAccessFile0.seek(((long)v3));
            randomAccessFile0.readFully(arr_b, v1, v2);
            return;
        }
        int v5 = v4 - v3;
        randomAccessFile0.seek(((long)v3));
        randomAccessFile0.readFully(arr_b, v1, v5);
        randomAccessFile0.seek(16L);
        randomAccessFile0.readFully(arr_b, v1 + v5, v2 - v5);
    }

    public final void k(byte[] arr_b, int v, int v1) {
        int v2 = this.m(v);
        int v3 = this.j;
        RandomAccessFile randomAccessFile0 = this.i;
        if(v2 + v1 <= v3) {
            randomAccessFile0.seek(((long)v2));
            randomAccessFile0.write(arr_b, 0, v1);
            return;
        }
        int v4 = v3 - v2;
        randomAccessFile0.seek(((long)v2));
        randomAccessFile0.write(arr_b, 0, v4);
        randomAccessFile0.seek(16L);
        randomAccessFile0.write(arr_b, v4, v1 - v4);
    }

    public final int l() {
        if(this.k == 0) {
            return 16;
        }
        int v = this.m.a;
        int v1 = this.l.a;
        return v < v1 ? v + 4 + this.m.b + this.j - v1 : v - v1 + 4 + this.m.b + 16;
    }

    public final int m(int v) {
        return v < this.j ? v : v + 16 - this.j;
    }

    public final void n(int v, int v1, int v2, int v3) {
        int[] arr_v = {v, v1, v2, v3};
        byte[] arr_b = this.n;
        int v4 = 0;
        for(int v5 = 0; v5 < 4; ++v5) {
            h.o(arr_b, v4, arr_v[v5]);
            v4 += 4;
        }
        this.i.seek(0L);
        this.i.write(arr_b);
    }

    public static void o(byte[] arr_b, int v, int v1) {
        arr_b[v] = (byte)(v1 >> 24);
        arr_b[v + 1] = (byte)(v1 >> 16);
        arr_b[v + 2] = (byte)(v1 >> 8);
        arr_b[v + 3] = (byte)v1;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append("h");
        stringBuilder0.append("[fileLength=");
        stringBuilder0.append(this.j);
        stringBuilder0.append(", size=");
        stringBuilder0.append(this.k);
        stringBuilder0.append(", first=");
        stringBuilder0.append(this.l);
        stringBuilder0.append(", last=");
        stringBuilder0.append(this.m);
        stringBuilder0.append(", element lengths=[");
        try {
            this.d(new l(stringBuilder0));
        }
        catch(IOException iOException0) {
            h.o.log(Level.WARNING, "read error", iOException0);
        }
        stringBuilder0.append("]]");
        return stringBuilder0.toString();
    }
}

