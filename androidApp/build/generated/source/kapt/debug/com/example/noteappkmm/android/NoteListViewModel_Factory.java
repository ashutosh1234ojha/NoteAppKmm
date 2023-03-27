// Generated by Dagger (https://dagger.dev).
package com.example.noteappkmm.android;

import androidx.lifecycle.SavedStateHandle;
import com.example.noteappkmm.domain.note.NoteDataSource;
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
    "rawtypes"
})
public final class NoteListViewModel_Factory implements Factory<NoteListViewModel> {
  private final Provider<NoteDataSource> noteDataSourceProvider;

  private final Provider<SavedStateHandle> savedStateHandleProvider;

  public NoteListViewModel_Factory(Provider<NoteDataSource> noteDataSourceProvider,
      Provider<SavedStateHandle> savedStateHandleProvider) {
    this.noteDataSourceProvider = noteDataSourceProvider;
    this.savedStateHandleProvider = savedStateHandleProvider;
  }

  @Override
  public NoteListViewModel get() {
    return newInstance(noteDataSourceProvider.get(), savedStateHandleProvider.get());
  }

  public static NoteListViewModel_Factory create(Provider<NoteDataSource> noteDataSourceProvider,
      Provider<SavedStateHandle> savedStateHandleProvider) {
    return new NoteListViewModel_Factory(noteDataSourceProvider, savedStateHandleProvider);
  }

  public static NoteListViewModel newInstance(NoteDataSource noteDataSource,
      SavedStateHandle savedStateHandle) {
    return new NoteListViewModel(noteDataSource, savedStateHandle);
  }
}
