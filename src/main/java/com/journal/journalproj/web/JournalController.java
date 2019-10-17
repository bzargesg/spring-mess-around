package com.journal.journalproj.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.journal.journalproj.repository.JournalRepository;

@Controller
public class JournalController {
  @Autowired;
  JournalRepository repo;

  @RequestMapping("/")
  public String index(Model model) {
    model.addAttribute("jornal", repo.findAll());
    return "index";
  }
}