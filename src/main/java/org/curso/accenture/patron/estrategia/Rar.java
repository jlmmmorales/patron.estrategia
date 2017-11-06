package org.curso.accenture.patron.estrategia;

public class Rar implements Compresor {
  public Data compress(Data data) {
    return new Data("RAR - "+data.getData());
  }

}
