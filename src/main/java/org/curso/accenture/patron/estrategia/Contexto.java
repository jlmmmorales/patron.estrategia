package org.curso.accenture.patron.estrategia;

public class Contexto {
  private Compresor estrategia;
  
  public Contexto(Compresor comp) {
    estrategia = comp;
  }
  
  public void setEstrategia(Compresor comp) {
    estrategia = comp;
  }
  
  public Data aplicar(Data f) {
    return estrategia.compress(f);
  }

}
