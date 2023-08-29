package gamari.app.mappers;

import gamari.app.models.Note;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.boot.test.autoconfigure.AutoConfigureMybatis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@AutoConfigureMybatis
public class NoteMapperTest {

    @Autowired
    private NoteMapper noteMapper;

    @Test
    public void testFindAll() {
        List<Note> notes = noteMapper.findAll();
        assertThat(notes).isNotNull();
    }

    @Test
    public void testCreate() {
        Note note = new Note();
        note.setTitle("Sample Title");
        note.setContent("Sample Content");

        noteMapper.create(note);

        List<Note> notes = noteMapper.findAll();
        assertThat(notes.size()).isEqualTo(1);
    }
}
