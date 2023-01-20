package kelompok2.notesapp.notes.listeners;

import kelompok2.notesapp.notes.entities.Note;

public interface NotesListener {
    void onNoteClicked(Note note, int position);
}
