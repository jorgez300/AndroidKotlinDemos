package com.demo.foregroundservices.backgroundservice;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \'2\u00020\u0001:\u0001\'B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0016\u001a\u00020\u0011H\u0002J\b\u0010\u0017\u001a\u00020\u0004H\u0002J\u0014\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u000fH\u0016J\b\u0010\u001d\u001a\u00020\u000fH\u0016J\"\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u001b2\u0006\u0010!\u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020\u001fH\u0016J\u0012\u0010#\u001a\u00020\u000f2\b\b\u0002\u0010$\u001a\u00020%H\u0002J\u0012\u0010&\u001a\u00020\u000f2\b\b\u0002\u0010$\u001a\u00020%H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000RS\u0010\u0006\u001aG\u0012\u0013\u0012\u00110\b\u00a2\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00110\b\u00a2\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00110\r\u00a2\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u000f0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006("}, d2 = {"Lcom/demo/foregroundservices/backgroundservice/BackService;", "Landroid/app/Service;", "()V", "CHANNEL_ID", "", "TAG", "_tarea", "Lkotlin/Function3;", "", "Lkotlin/ParameterName;", "name", "latitude", "longitude", "", "speed", "", "notification", "Landroidx/core/app/NotificationCompat$Builder;", "notificationManager", "Landroid/app/NotificationManager;", "serviceScope", "Lkotlinx/coroutines/CoroutineScope;", "createNotification", "getCurrentDateTimeString", "onBind", "Landroid/os/IBinder;", "p0", "Landroid/content/Intent;", "onCreate", "onDestroy", "onStartCommand", "", "intent", "flags", "startId", "start", "_locationHelper", "Lcom/demo/foregroundservices/core/LocationHelper;", "stop", "Companion", "app_debug"})
public final class BackService extends android.app.Service {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String TAG = "BackService";
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.CoroutineScope serviceScope = null;
    private android.app.NotificationManager notificationManager;
    private androidx.core.app.NotificationCompat.Builder notification;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function3<java.lang.Double, java.lang.Double, java.lang.Float, kotlin.Unit> _tarea = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String CHANNEL_ID = "BackService - ForegroundServiceChannel";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MONITOREO_START = "MONITOREO_START";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MONITOREO_STOP = "MONITOREO_STOP";
    @org.jetbrains.annotations.NotNull()
    public static final com.demo.foregroundservices.backgroundservice.BackService.Companion Companion = null;
    
    public BackService() {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public android.os.IBinder onBind(@org.jetbrains.annotations.Nullable()
    android.content.Intent p0) {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    @java.lang.Override()
    public int onStartCommand(@org.jetbrains.annotations.Nullable()
    android.content.Intent intent, int flags, int startId) {
        return 0;
    }
    
    private final void start(com.demo.foregroundservices.core.LocationHelper _locationHelper) {
    }
    
    private final java.lang.String getCurrentDateTimeString() {
        return null;
    }
    
    private final void stop(com.demo.foregroundservices.core.LocationHelper _locationHelper) {
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    private final androidx.core.app.NotificationCompat.Builder createNotification() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/demo/foregroundservices/backgroundservice/BackService$Companion;", "", "()V", "MONITOREO_START", "", "MONITOREO_STOP", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}