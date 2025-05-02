package com.demo.foregroundservices.core;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010!\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007J\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0013J\b\u0010\u0014\u001a\u00020\u0010H\u0002R\u000e\u0010\b\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\rX\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u000e\u00a8\u0006\u0015"}, d2 = {"Lcom/demo/foregroundservices/core/PermisosHelper;", "", "activity", "Landroid/app/Activity;", "launcher", "Landroidx/activity/result/ActivityResultLauncher;", "", "(Landroid/app/Activity;Landroidx/activity/result/ActivityResultLauncher;)V", "TAG", "currentPermission", "pendingPermissions", "", "requiredPermissions", "", "[Ljava/lang/String;", "checkPermissions", "", "handlePermissionResult", "isGranted", "", "requestNextPermission", "app_debug"})
public final class PermisosHelper {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String[] requiredPermissions = {"android.permission.POST_NOTIFICATIONS", "android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"};
    @org.jetbrains.annotations.NotNull()
    private final android.app.Activity activity = null;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String currentPermission;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.String> pendingPermissions = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.activity.result.ActivityResultLauncher<java.lang.String> launcher = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String TAG = "PermisosHelper";
    
    public PermisosHelper(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity, @org.jetbrains.annotations.NotNull()
    androidx.activity.result.ActivityResultLauncher<java.lang.String> launcher) {
        super();
    }
    
    public final void checkPermissions() {
    }
    
    private final void requestNextPermission() {
    }
    
    public final void handlePermissionResult(boolean isGranted) {
    }
}