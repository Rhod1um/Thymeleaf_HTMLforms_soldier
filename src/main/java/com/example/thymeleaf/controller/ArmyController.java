package com.example.thymeleaf.controller;

import com.example.thymeleaf.repository.ArmyRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ArmyController {
  //ting fra controllerens metoder skal sendes over i html igennem thymeleaf
  //hedder dependency injection
  ArmyRepository armyRepository = new ArmyRepository();


  @GetMapping("/")
  public String index(Model model){ //Model klasse er en del af spring framework. Model er som en
    //tupperware hvor vi kan smide ting ind

    //der laves arrayliste burde være i repo. her er bare eksmepel. skal loades fra database
    //fra database -> repo -> service -> controller -> view. Ikke gennem service her dog
    //List<String> soldiers = new ArrayList<>();
    //soldiers.add("Claus");
    //soldiers.add("Anna");
    //soldiers.add("Irse");

    //model.addAttribute("soldierslist", soldiers); //hel liste overføres

    //model.addAttribute("name", "Anna"); //variabelnavn, variabelværdi
    //her tilføjes name attribut som lægges over i html-filen
    //model.addAttribute("name2", "Irse");

    //når det hele er lagt i repo
    model.addAttribute("soldierslist", armyRepository.getAllSoldiers());


    return "soldier";
  }
}
