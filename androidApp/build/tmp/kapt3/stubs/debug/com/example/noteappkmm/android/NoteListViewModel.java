package com.example.noteappkmm.android;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aJ\u0006\u0010\u001b\u001a\u00020\u0018J\u000e\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u0012J\u0006\u0010\u001e\u001a\u00020\u0018R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\nR\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\n\u00a8\u0006\u001f"}, d2 = {"Lcom/example/noteappkmm/android/NoteListViewModel;", "Landroidx/lifecycle/ViewModel;", "noteDataSource", "Lcom/example/noteappkmm/domain/note/NoteDataSource;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "(Lcom/example/noteappkmm/domain/note/NoteDataSource;Landroidx/lifecycle/SavedStateHandle;)V", "isSearchActive", "Lkotlinx/coroutines/flow/StateFlow;", "", "()Lkotlinx/coroutines/flow/StateFlow;", "notes", "", "Lcom/example/noteappkmm/domain/note/Note;", "getNotes", "searchNotes", "Lcom/example/noteappkmm/domain/note/SearchNote;", "searchText", "", "getSearchText", "state", "Lcom/example/noteappkmm/android/NoteListState;", "getState", "deleteNoteById", "", "id", "", "loadNotes", "onSearchTextChange", "text", "onToggleSearch", "androidApp_debug"})
public final class NoteListViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.noteappkmm.domain.note.NoteDataSource noteDataSource = null;
    private final androidx.lifecycle.SavedStateHandle savedStateHandle = null;
    private final com.example.noteappkmm.domain.note.SearchNote searchNotes = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<java.util.List<com.example.noteappkmm.domain.note.Note>> notes = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<java.lang.String> searchText = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> isSearchActive = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<com.example.noteappkmm.android.NoteListState> state = null;
    
    @javax.inject.Inject()
    public NoteListViewModel(@org.jetbrains.annotations.NotNull()
    com.example.noteappkmm.domain.note.NoteDataSource noteDataSource, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.SavedStateHandle savedStateHandle) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.util.List<com.example.noteappkmm.domain.note.Note>> getNotes() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.lang.String> getSearchText() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> isSearchActive() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.example.noteappkmm.android.NoteListState> getState() {
        return null;
    }
    
    public final void loadNotes() {
    }
    
    public final void onSearchTextChange(@org.jetbrains.annotations.NotNull()
    java.lang.String text) {
    }
    
    public final void onToggleSearch() {
    }
    
    public final void deleteNoteById(long id) {
    }
}