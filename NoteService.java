package com.example.notes.service;
import java.util.List;

import com.example.notes.model.Note;

public interface NoteService {
	Note createNoteForUser(String ownerusername, String content);

	Note updateNoteForUser(Long noteId, String content, String ownerusername);

	void deleteNoteForUser(Long noteId, String ownerusername);

	List<Note> getNotesForUser(String ownerusername);

}
