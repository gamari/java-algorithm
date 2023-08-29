package gamari.app.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import gamari.app.models.Note;

@Mapper
public interface NoteMapper {
    void create(Note note);

    List<Note> findAll();
}
