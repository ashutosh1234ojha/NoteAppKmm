package com.example.noteappkmm.android.note_details



data class NoteDetailState(
    val noteTitle: String = "",
    val noteTileIsFocused: Boolean = false,
    val noteContent: String = "",
    val isNoteContentFocused: Boolean = false,
    val noteColor: Long = 0xffffff

)
