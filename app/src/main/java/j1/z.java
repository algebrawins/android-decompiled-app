package j1;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class z extends Fragment implements f {

    /* renamed from: J  reason: collision with root package name */
    public final Map f3855J = Collections.synchronizedMap(new R.k());

    static {
        new WeakHashMap();
    }

    @Override // android.app.Fragment
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        for (LifecycleCallback lifecycleCallback : this.f3855J.values()) {
            lifecycleCallback.getClass();
        }
    }

    @Override // android.app.Fragment
    public final void onActivityResult(int r12, int r22, Intent intent) {
        super.onActivityResult(r12, r22, intent);
        for (LifecycleCallback lifecycleCallback : this.f3855J.values()) {
            lifecycleCallback.getClass();
        }
    }

    @Override // android.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        for (Map.Entry entry : this.f3855J.entrySet()) {
            LifecycleCallback lifecycleCallback = (LifecycleCallback) entry.getValue();
            if (bundle != null) {
                bundle.getBundle((String) entry.getKey());
            }
            lifecycleCallback.getClass();
        }
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        for (LifecycleCallback lifecycleCallback : this.f3855J.values()) {
            lifecycleCallback.getClass();
        }
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        for (LifecycleCallback lifecycleCallback : this.f3855J.values()) {
            lifecycleCallback.getClass();
        }
    }

    @Override // android.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle == null) {
            return;
        }
        for (Map.Entry entry : this.f3855J.entrySet()) {
            Bundle bundle2 = new Bundle();
            ((LifecycleCallback) entry.getValue()).getClass();
            bundle.putBundle((String) entry.getKey(), bundle2);
        }
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        for (LifecycleCallback lifecycleCallback : this.f3855J.values()) {
            lifecycleCallback.getClass();
        }
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        for (LifecycleCallback lifecycleCallback : this.f3855J.values()) {
            lifecycleCallback.getClass();
        }
    }
}
