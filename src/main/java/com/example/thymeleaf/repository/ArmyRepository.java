package com.example.thymeleaf.repository;

import java.util.ArrayList;
import java.util.List;

public class ArmyRepository {
  List<String> soldiers;

  public ArmyRepository(){
    soldiers = new ArrayList<>();
    soldiers.add("Claus");
    soldiers.add("Anna");
    soldiers.add("Irse"); //gøres bare en enkelt gang i konstruktøren
  }

  public List<String> getAllSoldiers(){
    return soldiers;
  }
}
