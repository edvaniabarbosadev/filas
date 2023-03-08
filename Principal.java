public class Principal{
  public static void main(String args[]){
    int aux=1;
    Fila f = new Fila(5); // construtor substitui initialize
    while(!f.isFull()){
      f.push(aux);
      aux++;
    }
    while(!f.isEmpty()){
      System.out.println(f.pop());
    }
  }
}
