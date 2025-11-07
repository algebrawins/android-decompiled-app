package io.flutter.embedding.engine.plugins.lifecycle;

import androidx.annotation.Keep;
import androidx.lifecycle.m;

@Keep
/* loaded from: classes.dex */
public class HiddenLifecycleReference {
    private final m lifecycle;

    public HiddenLifecycleReference(m mVar) {
        this.lifecycle = mVar;
    }

    public m getLifecycle() {
        return this.lifecycle;
    }
}
