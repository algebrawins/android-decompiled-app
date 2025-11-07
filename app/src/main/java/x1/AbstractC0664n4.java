package x1;

import java.nio.ByteBuffer;

/* renamed from: x1.n4  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0664n4 {
    public static ByteBuffer a(int r02, ByteBuffer byteBuffer, int r22) {
        ByteBuffer duplicate = byteBuffer.duplicate();
        duplicate.position(r02);
        duplicate.limit(r02 + r22);
        ByteBuffer slice = duplicate.slice();
        N2.g.d(slice, "slice(...)");
        return slice;
    }
}
