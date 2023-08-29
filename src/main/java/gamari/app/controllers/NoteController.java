package gamari.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import gamari.app.models.Note;
import gamari.app.services.NoteService;

@Controller
public class NoteController {
    @Autowired
    private NoteService noteService;

    @GetMapping("/notes")
    public String getNotes(Model model) {
        List<Note> notes = noteService.findAll();
        model.addAttribute("notes", notes);
        return "notes";
    }
}
