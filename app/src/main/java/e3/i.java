package e3;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.RandomAccessFile;

/* loaded from: classes.dex */
public class i extends f {
    @Override // e3.f
    public e b(l lVar) {
        N2.g.e(lVar, "path");
        File e4 = lVar.e();
        boolean isFile = e4.isFile();
        boolean isDirectory = e4.isDirectory();
        long lastModified = e4.lastModified();
        long length = e4.length();
        if (!isFile && !isDirectory && lastModified == 0 && length == 0 && !e4.exists()) {
            return null;
        }
        return new e(isFile, isDirectory, Long.valueOf(length), null, Long.valueOf(lastModified), null);
    }

    public void c(l lVar, l lVar2) {
        N2.g.e(lVar2, "target");
        if (lVar.e().renameTo(lVar2.e())) {
            return;
        }
        throw new IOException("failed to move " + lVar + " to " + lVar2);
    }

    public final void d(l lVar) {
        if (!Thread.interrupted()) {
            File e4 = lVar.e();
            if (!e4.delete() && e4.exists()) {
                throw new IOException("failed to delete " + lVar);
            }
            return;
        }
        throw new InterruptedIOException("interrupted");
    }

    public final h e(l lVar) {
        return new h(false, new RandomAccessFile(lVar.e(), "r"));
    }

    public final t f(l lVar) {
        N2.g.e(lVar, "file");
        File e4 = lVar.e();
        int r02 = k.f3122a;
        return new g(new FileInputStream(e4));
    }

    public String toString() {
        return "JvmSystemFileSystem";
    }
}
