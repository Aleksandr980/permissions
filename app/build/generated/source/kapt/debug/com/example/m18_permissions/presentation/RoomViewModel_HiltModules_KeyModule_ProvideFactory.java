// Generated by Dagger (https://dagger.dev).
package com.example.m18_permissions.presentation;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@QualifierMetadata("dagger.hilt.android.internal.lifecycle.HiltViewModelMap.KeySet")
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava",
    "cast",
    "deprecation"
})
public final class RoomViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<Boolean> {
  @Override
  public Boolean get() {
    return provide();
  }

  public static RoomViewModel_HiltModules_KeyModule_ProvideFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static boolean provide() {
    return RoomViewModel_HiltModules.KeyModule.provide();
  }

  private static final class InstanceHolder {
    private static final RoomViewModel_HiltModules_KeyModule_ProvideFactory INSTANCE = new RoomViewModel_HiltModules_KeyModule_ProvideFactory();
  }
}
