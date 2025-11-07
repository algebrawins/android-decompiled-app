package y0;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Objects;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    public final int f6221a;

    /* renamed from: b  reason: collision with root package name */
    public final int f6222b;

    /* renamed from: c  reason: collision with root package name */
    public final long f6223c;

    /* renamed from: d  reason: collision with root package name */
    public final long f6224d;

    public l(int r12, int r22, long j3, long j4) {
        this.f6221a = r12;
        this.f6222b = r22;
        this.f6223c = j3;
        this.f6224d = j4;
    }

    public static l a(File file) {
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
        try {
            l lVar = new l(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
            dataInputStream.close();
            return lVar;
        } catch (Throwable th) {
            try {
                dataInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void b(File file) {
        file.delete();
        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
        try {
            dataOutputStream.writeInt(this.f6221a);
            dataOutputStream.writeInt(this.f6222b);
            dataOutputStream.writeLong(this.f6223c);
            dataOutputStream.writeLong(this.f6224d);
            dataOutputStream.close();
        } catch (Throwable th) {
            try {
                dataOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (this.f6222b == lVar.f6222b && this.f6223c == lVar.f6223c && this.f6221a == lVar.f6221a && this.f6224d == lVar.f6224d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f6222b), Long.valueOf(this.f6223c), Integer.valueOf(this.f6221a), Long.valueOf(this.f6224d));
    }
}
