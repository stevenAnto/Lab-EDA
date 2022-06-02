public class LinkedList<T> {
  private Node<T> first; // Primeiro no da lista
  private int size; // Tamanho da lista
  public LinkedList() {
    first = null;
    size = 0;
  }
  public int size() {
    return size;
  }
  public boolean isEmpty() {
    return size == 0;
    //return first == null;
  }
  public void addFirst(T value) {
    System.out.println("se agrego al inicio "+value);
    Node <T> nuevo = new Node <T>(value, first);
    //Actualizo las propiedades de mi clase
    this.first = nuevo;
    size++;
    //System.out.println("salio");
  }
  public void addLast(T v) {
    System.out.println("se agrego al final "+ v);
    Node <T> nuevo = new Node <T>(v,null);
    //ubicar al ulitmo
    Node <T> temp =  first;
    //mediante nul
    if(isEmpty()){
      this.first = nuevo;
    }
    else {
      while (temp.getNext()!=null){
	temp = temp.getNext();
      }
      temp.setNext(nuevo);
    }
    /*for (int i = 0; i<size ;  i++){
      temp = temp.getNext();
      }*/
    size++;
  }
  public T getFirst() {
    if (isEmpty()){
      return null;
    }
    return first.getValue();
  }
  public T getLast() {
    if (isEmpty()){
      return null;
    }
    Node <T> temp =  first;
    while (temp.getNext()!=null){
      temp = temp.getNext();
    }
    return temp.getValue();

  }
  public void removeFirst() {
    //el firts apunte algieuite
    if(isEmpty()){
      return;
    }
    first = first.getNext();
    size--;
  }
  public void removeLast() {
    if(isEmpty()){
      return;
    }
    if(size()==1 ){
      first = null;
    }
    else{
      Node <T> temp =  first;
      for (int i = 0; i<size()-2 ;  i++){
	temp = temp.getNext();
      }
      temp.setNext(null);
    }
    size--;
  }

  public String toString() {
    String str = "{";
    Node <T> temp =  first;
    while (temp !=null){
      str += temp.getValue();
      temp = temp.getNext();
      if(temp!=null) str += ",";
    }
    str += "}";
    return str;
  }
}
