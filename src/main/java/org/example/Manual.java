package org.example;

import java.util.ArrayList;
import java.util.List;

public class Manual extends Product {
  private List<String> sections;

  public Manual() {
    this.sections = new ArrayList<>();
  }

  public void addSection(String sectionText) {
    this.sections.add(sectionText);
  }

  public String[] getSections() {
    return this.sections.toArray(new String[this.sections.size()]);
  }
}