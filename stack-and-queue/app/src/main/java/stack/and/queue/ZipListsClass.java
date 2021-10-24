package stack.and.queue;

public class ZipListsClass<T> {

    public LinkedList<T> zipLists(LinkedList<T> first,LinkedList<T> second){

   if(first.head == null){
       return second;
   } else if (second.head == null){
       return first;
   }
   else{
       Node<T> currentSecond = second.head;
       Node<T> currentFirst = first.head;
       Node<T> tempSecond = second.head;
       Node<T> temptFirst = first.head;
       while (currentFirst !=null ){
           if(currentSecond == null){
               return first;
           }else {
               tempSecond.setNext(temptFirst.getNext());
               temptFirst.setNext(tempSecond);
           }
           currentFirst=currentFirst.getNext().getNext();
           temptFirst = currentFirst;
           currentSecond=currentSecond.getNext().getNext();
           tempSecond = currentSecond;

       }
   }
   return  first;
    }
}
