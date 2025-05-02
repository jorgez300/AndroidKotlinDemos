package com.demo.foregroundservices;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eR\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\rX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0012\u001a\u00020\u00138FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0018\u001a\u00020\u00138FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u0019\u0010\u0015\u00a8\u0006\u001f"}, d2 = {"Lcom/demo/foregroundservices/Graph;", "", "()V", "app2Database", "Lcom/demo/foregroundservices/database/AppDatabase;", "getApp2Database", "()Lcom/demo/foregroundservices/database/AppDatabase;", "setApp2Database", "(Lcom/demo/foregroundservices/database/AppDatabase;)V", "appDatabase", "getAppDatabase", "setAppDatabase", "locationHelper", "Lcom/demo/foregroundservices/core/LocationHelper;", "getLocationHelper", "()Lcom/demo/foregroundservices/core/LocationHelper;", "setLocationHelper", "(Lcom/demo/foregroundservices/core/LocationHelper;)V", "locationRepository", "Lcom/demo/foregroundservices/database/repository/LocationRepository;", "getLocationRepository", "()Lcom/demo/foregroundservices/database/repository/LocationRepository;", "locationRepository$delegate", "Lkotlin/Lazy;", "locationRepository2", "getLocationRepository2", "locationRepository2$delegate", "provide", "", "context", "Landroid/content/Context;", "app_debug"})
public final class Graph {
    public static com.demo.foregroundservices.core.LocationHelper locationHelper;
    public static com.demo.foregroundservices.database.AppDatabase appDatabase;
    public static com.demo.foregroundservices.database.AppDatabase app2Database;
    @org.jetbrains.annotations.NotNull()
    private static final kotlin.Lazy locationRepository$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private static final kotlin.Lazy locationRepository2$delegate = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.demo.foregroundservices.Graph INSTANCE = null;
    
    private Graph() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.demo.foregroundservices.core.LocationHelper getLocationHelper() {
        return null;
    }
    
    public final void setLocationHelper(@org.jetbrains.annotations.NotNull()
    com.demo.foregroundservices.core.LocationHelper p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.demo.foregroundservices.database.AppDatabase getAppDatabase() {
        return null;
    }
    
    public final void setAppDatabase(@org.jetbrains.annotations.NotNull()
    com.demo.foregroundservices.database.AppDatabase p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.demo.foregroundservices.database.AppDatabase getApp2Database() {
        return null;
    }
    
    public final void setApp2Database(@org.jetbrains.annotations.NotNull()
    com.demo.foregroundservices.database.AppDatabase p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.demo.foregroundservices.database.repository.LocationRepository getLocationRepository() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.demo.foregroundservices.database.repository.LocationRepository getLocationRepository2() {
        return null;
    }
    
    public final void provide(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
}