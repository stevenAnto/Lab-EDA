public class Test{
  public static void main(String []a){
    LinkedList<Integer> listaNum = new LinkedList<>();
    System.out.println("lista sin nada : "+ listaNum);
    System.out.println("esta vacio "+listaNum.isEmpty());
    listaNum.addFirst(new Integer(5));
    System.out.println("esta vacio "+listaNum.isEmpty());
    System.out.println("este es el primero "+listaNum.getFirst());
    System.out.println("este es el tamni "+listaNum.size());
    System.out.println("lista total: "+ listaNum);
    System.out.println("este es el ultimo : "+ listaNum);
    System.out.println("lista : "+ listaNum);
    listaNum.addFirst(32);
    System.out.println("esta vacio "+listaNum.isEmpty());
    System.out.println("este es el primero "+listaNum.getFirst());
    System.out.println("este es el tamni "+listaNum.size());
    System.out.println("lista total: "+ listaNum);
    System.out.println("este es el ultimo : "+ listaNum.getLast());
    System.out.println("lista : "+ listaNum);
    listaNum.addFirst(20);
    System.out.println("esta vacio "+listaNum.isEmpty());
    System.out.println("este es el primero "+listaNum.getFirst());
    System.out.println("este es el tamni "+listaNum.size());
    System.out.println("lista total: "+ listaNum);
    System.out.println("este es el ultimo : "+ listaNum.getLast());
    System.out.println("lista : "+ listaNum);
    listaNum.addFirst(10);
    System.out.println("esta vacio "+listaNum.isEmpty());
    System.out.println("este es el primero "+listaNum.getFirst());
    System.out.println("este es el tamni "+listaNum.size());
    System.out.println("lista total: "+ listaNum);
    System.out.println("este es el ultimo : "+ listaNum.getLast());
    System.out.println("lista : "+ listaNum);
    listaNum.addLast(50);
    listaNum.addLast(70);
    System.out.println("lista total : "+listaNum);
    System.out.println("este es el ultimo : "+ listaNum.getLast());
  }
}
