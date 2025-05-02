package com.demo.foregroundservices.core;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0015\u001a\u00020\u0006H\u0002J\u0006\u0010\u0016\u001a\u00020\u0010J\u0010\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u0003H\u0002JW\u0010\u0019\u001a\u00020\u00102M\b\u0002\u0010\u001a\u001aG\u0012\u0013\u0012\u00110\t\u00a2\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00110\t\u00a2\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00110\u000e\u00a2\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00100\bH\u0007J\u0006\u0010\u001b\u001a\u00020\u0010R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000RS\u0010\u0007\u001aG\u0012\u0013\u0012\u00110\t\u00a2\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00110\t\u00a2\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00110\u000e\u00a2\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00100\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lcom/demo/foregroundservices/core/LocationHelper;", "", "activity", "Landroid/content/Context;", "(Landroid/content/Context;)V", "TAG", "", "_tarea", "Lkotlin/Function3;", "", "Lkotlin/ParameterName;", "name", "latitude", "longitude", "", "speed", "", "fusedLocationClient", "Lcom/google/android/gms/location/FusedLocationProviderClient;", "locationCallback", "Lcom/google/android/gms/location/LocationCallback;", "getCurrentDateTimeString", "isGPSEnabled", "openGPSSettings", "context", "startLocationUpdates", "Tarea", "stopLocationUpdates", "app_debug"})
public final class LocationHelper {
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context activity = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String TAG = "GPSHelper";
    @org.jetbrains.annotations.NotNull()
    private final com.google.android.gms.location.FusedLocationProviderClient fusedLocationClient = null;
    @org.jetbrains.annotations.NotNull()
    private kotlin.jvm.functions.Function3<? super java.lang.Double, ? super java.lang.Double, ? super java.lang.Float, kotlin.Unit> _tarea;
    @org.jetbrains.annotations.NotNull()
    private final com.google.android.gms.location.LocationCallback locationCallback = null;
    
    public LocationHelper(@org.jetbrains.annotations.NotNull()
    android.content.Context activity) {
        super();
    }
    
    @android.annotation.SuppressLint(value = {"MissingPermission"})
    public final void startLocationUpdates(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function3<? super java.lang.Double, ? super java.lang.Double, ? super java.lang.Float, kotlin.Unit> Tarea) {
    }
    
    private final java.lang.String getCurrentDateTimeString() {
        return null;
    }
    
    public final void stopLocationUpdates() {
    }
    
    public final void isGPSEnabled() {
    }
    
    private final void openGPSSettings(android.content.Context context) {
    }
}