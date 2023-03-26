package com.example.noteappkmm.domain.note

interface NoteDataSource {
    suspend fun insertNote(note: Note)
    suspend fun getNoteById(id: Long):Note?
    suspend fun getAllNotes(id: Long):List<Note>
    suspend fun deleteNoteById(id: Long)

}