package com.demo.foregroundservices.core;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007\b\u0016\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0013\u001a\u00020\u0004H\u0002J\u000e\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0016J\u0010\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J_\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u00162M\b\u0002\u0010\u0019\u001aG\u0012\u0013\u0012\u00110\u0007\u00a2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00110\u0007\u00a2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00110\f\u00a2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000e0\u0006H\u0007J\u0006\u0010\u001a\u001a\u00020\u000eR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000RS\u0010\u0005\u001aG\u0012\u0013\u0012\u00110\u0007\u00a2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00110\u0007\u00a2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00110\f\u00a2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000e0\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lcom/demo/foregroundservices/core/LocationHelper;", "", "()V", "TAG", "", "_tarea", "Lkotlin/Function3;", "", "Lkotlin/ParameterName;", "name", "latitude", "longitude", "", "speed", "", "fusedLocationClient", "Lcom/google/android/gms/location/FusedLocationProviderClient;", "locationCallback", "Lcom/google/android/gms/location/LocationCallback;", "getCurrentDateTimeString", "isGPSEnabled", "context", "Landroid/content/Context;", "openGPSSettings", "startLocationUpdates", "tarea", "stopLocationUpdates", "app_debug"})
public final class LocationHelper {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String TAG = "GPSHelper";
    private com.google.android.gms.location.FusedLocationProviderClient fusedLocationClient;
    @org.jetbrains.annotations.NotNull()
    private kotlin.jvm.functions.Function3<? super java.lang.Double, ? super java.lang.Double, ? super java.lang.Float, kotlin.Unit> _tarea;
    @org.jetbrains.annotations.NotNull()
    private final com.google.android.gms.location.LocationCallback locationCallback = null;
    
    public LocationHelper() {
        super();
    }
    
    @android.annotation.SuppressLint(value = {"MissingPermission"})
    public final void startLocationUpdates(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function3<? super java.lang.Double, ? super java.lang.Double, ? super java.lang.Float, kotlin.Unit> tarea) {
    }
    
    private final java.lang.String getCurrentDateTimeString() {
        return null;
    }
    
    public final void stopLocationUpdates() {
    }
    
    public final void isGPSEnabled(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    private final void openGPSSettings(android.content.Context context) {
    }
}