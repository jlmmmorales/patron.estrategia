package org.curso.accenture.patron.estrategia;

public class Zip implements Compresor {
  public Data compress(Data data) {
    return new Data("ZIP - "+data.getData());
  }

}
