package gamari.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gamari.app.mappers.NoteMapper;
import gamari.app.models.Note;

@Service
public class NoteService {
    @Autowired
    private NoteMapper noteMapper;

    public List<Note> findAll() {
        return noteMapper.findAll();
    }
}
