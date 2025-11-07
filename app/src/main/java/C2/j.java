package C2;

import android.os.Looper;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a  reason: collision with root package name */
    public static volatile ClassLoader f269a;

    /* renamed from: b  reason: collision with root package name */
    public static volatile Thread f270b;

    public static int a(List list) {
        N2.g.e(list, "<this>");
        return list.size() - 1;
    }

    public static List b(Object obj) {
        List singletonList = Collections.singletonList(obj);
        N2.g.d(singletonList, "singletonList(...)");
        return singletonList;
    }

    public static List c(Object... objArr) {
        N2.g.e(objArr, "elements");
        if (objArr.length > 0) {
            List asList = Arrays.asList(objArr);
            N2.g.d(asList, "asList(...)");
            return asList;
        }
        return q.f272J;
    }

    public static synchronized ClassLoader d() {
        ClassLoader classLoader;
        synchronized (j.class) {
            try {
                if (f269a == null) {
                    f269a = e();
                }
                classLoader = f269a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return classLoader;
    }

    public static synchronized ClassLoader e() {
        synchronized (j.class) {
            ClassLoader classLoader = null;
            if (f270b == null) {
                f270b = f();
                if (f270b == null) {
                    return null;
                }
            }
            synchronized (f270b) {
                try {
                    classLoader = f270b.getContextClassLoader();
                } catch (SecurityException e4) {
                    String message = e4.getMessage();
                    Log.w("DynamiteLoaderV2CL", "Failed to get thread context classloader " + message);
                }
            }
            return classLoader;
        }
    }

    public static synchronized Thread f() {
        SecurityException e4;
        Thread thread;
        Thread thread2;
        ThreadGroup threadGroup;
        synchronized (j.class) {
            ThreadGroup threadGroup2 = Looper.getMainLooper().getThread().getThreadGroup();
            if (threadGroup2 == null) {
                return null;
            }
            synchronized (Void.class) {
                try {
                    int activeGroupCount = threadGroup2.activeGroupCount();
                    ThreadGroup[] threadGroupArr = new ThreadGroup[activeGroupCount];
                    threadGroup2.enumerate(threadGroupArr);
                    int r6 = 0;
                    int r7 = 0;
                    while (true) {
                        if (r7 < activeGroupCount) {
                            threadGroup = threadGroupArr[r7];
                            if ("dynamiteLoader".equals(threadGroup.getName())) {
                                break;
                            }
                            r7++;
                        } else {
                            threadGroup = null;
                            break;
                        }
                    }
                    if (threadGroup == null) {
                        threadGroup = new ThreadGroup(threadGroup2, "dynamiteLoader");
                    }
                    int activeCount = threadGroup.activeCount();
                    Thread[] threadArr = new Thread[activeCount];
                    threadGroup.enumerate(threadArr);
                    while (true) {
                        if (r6 < activeCount) {
                            thread2 = threadArr[r6];
                            if ("GmsDynamite".equals(thread2.getName())) {
                                break;
                            }
                            r6++;
                        } else {
                            thread2 = null;
                            break;
                        }
                    }
                } catch (SecurityException e5) {
                    e4 = e5;
                    thread = null;
                }
                if (thread2 == null) {
                    try {
                        thread = new Thread(threadGroup, "GmsDynamite");
                    } catch (SecurityException e6) {
                        e4 = e6;
                        thread = thread2;
                    }
                    try {
                        thread.setContextClassLoader(null);
                        thread.start();
                    } catch (SecurityException e7) {
                        e4 = e7;
                        Log.w("DynamiteLoaderV2CL", "Failed to enumerate thread/threadgroup " + e4.getMessage());
                        thread2 = thread;
                        return thread2;
                    }
                    thread2 = thread;
                }
            }
            return thread2;
        }
    }
}
