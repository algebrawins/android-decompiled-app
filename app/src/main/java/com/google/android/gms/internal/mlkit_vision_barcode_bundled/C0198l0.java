package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.l0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0198l0 extends IOException {

    /* renamed from: J  reason: collision with root package name */
    public static final /* synthetic */ int f2941J = 0;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.mlkit_vision_barcode_bundled.l0, java.io.IOException] */
    public static C0198l0 a() {
        return new IOException("Protocol message had invalid UTF-8.");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.mlkit_vision_barcode_bundled.l0, java.io.IOException] */
    public static C0198l0 b() {
        return new IOException("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.mlkit_vision_barcode_bundled.l0, java.io.IOException] */
    public static C0198l0 c() {
        return new IOException("Failed to parse the message.");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.mlkit_vision_barcode_bundled.l0, java.io.IOException] */
    public static C0198l0 d() {
        return new IOException("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
