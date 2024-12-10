// Generated by Dagger (https://dagger.dev).
package com.example.m20_firebase.domain;

import com.example.m20_firebase.data.GalleryRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava",
    "cast",
    "deprecation"
})
public final class GetGalleryUseCase_Factory implements Factory<GetGalleryUseCase> {
  private final Provider<GalleryRepository> galleryRepositoryProvider;

  public GetGalleryUseCase_Factory(Provider<GalleryRepository> galleryRepositoryProvider) {
    this.galleryRepositoryProvider = galleryRepositoryProvider;
  }

  @Override
  public GetGalleryUseCase get() {
    return newInstance(galleryRepositoryProvider.get());
  }

  public static GetGalleryUseCase_Factory create(
      Provider<GalleryRepository> galleryRepositoryProvider) {
    return new GetGalleryUseCase_Factory(galleryRepositoryProvider);
  }

  public static GetGalleryUseCase newInstance(GalleryRepository galleryRepository) {
    return new GetGalleryUseCase(galleryRepository);
  }
}
