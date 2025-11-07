package y0;

import android.content.res.AssetManager;
import android.os.Build;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.concurrent.Executor;
import x.RunnableC0554i;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final Executor f6194a;

    /* renamed from: b  reason: collision with root package name */
    public final e f6195b;

    /* renamed from: c  reason: collision with root package name */
    public final byte[] f6196c;

    /* renamed from: d  reason: collision with root package name */
    public final File f6197d;

    /* renamed from: e  reason: collision with root package name */
    public final String f6198e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f6199f = false;
    public b[] g;

    /* renamed from: h  reason: collision with root package name */
    public byte[] f6200h;

    public a(AssetManager assetManager, Executor executor, e eVar, String str, File file) {
        this.f6194a = executor;
        this.f6195b = eVar;
        this.f6198e = str;
        this.f6197d = file;
        int r12 = Build.VERSION.SDK_INT;
        byte[] bArr = null;
        if (r12 >= 24 && r12 <= 34) {
            switch (r12) {
                case 24:
                case 25:
                    bArr = f.f6215h;
                    break;
                case 26:
                    bArr = f.g;
                    break;
                case 27:
                    bArr = f.f6214f;
                    break;
                case 28:
                case 29:
                case 30:
                    bArr = f.f6213e;
                    break;
                case 31:
                case 32:
                case 33:
                case 34:
                    bArr = f.f6212d;
                    break;
            }
        }
        this.f6196c = bArr;
    }

    public final FileInputStream a(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e4) {
            String message = e4.getMessage();
            if (message != null && message.contains("compressed")) {
                this.f6195b.g();
            }
            return null;
        }
    }

    public final void b(int r22, Serializable serializable) {
        this.f6194a.execute(new RunnableC0554i(this, r22, serializable));
    }
}
