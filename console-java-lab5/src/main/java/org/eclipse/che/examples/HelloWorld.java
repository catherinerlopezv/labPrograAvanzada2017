package org.eclipse.che.examples;

public class HelloWorld {
    public static void main(String... argvs) {
        /*Node a=new Node();
        a.setPropiedad("Gua");
        Node b=new Node();
        b.setPropiedad("Mex");
        a.setNext(b);
        
        Node c= new Node();
        c.setPropiedad("Usa");
        a.getNext().setNext(c);
        
        Node d= new Node();
        d.setPropiedad("Esp");
        a.getNext().getNext().setNext(d);
        
        System.out.println(a.getPropiedad());
        System.out.println(a.getNext().getPropiedad());
        System.out.println(a.getNext().getNext().getPropiedad());
        System.out.println(a.getNext().getNext().getNext().getPropiedad());
                
        
    }
    private static  class Node{
        private String propiedad;
        private Node next;
        
        private String getPropiedad(){
            return this.propiedad;
        }
        
        private void setPropiedad(String a){
            this.propiedad= a;
        }
        
        private Node getNext(){
            return this.next;
        }
        private void setNext(Node next){
            this.next=next;
        }
    }*/
   SinglyLinkedList lista=new SinglyLinkedList();
   lista.addFirst("GUate");
   lista.addLast("GUate");
   lista.addLast("GUate");
   lista.addLastdd("GUate");
   
   String valor=lista.removeFirst();
   while(valor !=null){
       System.out.println(valor);
       valor=lista.removeFirst();
   }
   

}
}
