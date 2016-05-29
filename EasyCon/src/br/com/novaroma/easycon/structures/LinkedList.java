package br.com.novaroma.easycon.structures;

import br.com.novaroma.easycon.entities.Entity;
import br.com.novaroma.easycon.entities.Person;
import br.com.novaroma.easycon.entities.Resident;

public class LinkedList { //90% TESTADO
    
    private Link first;
    private Link last;
    private int count;
    
    public void addFirst(Entity entity) {

        Link newLink = new Link(first, null, entity);
       
        if (!isFirst()) {
            first.setPrevious(newLink);
        }
        
        first = newLink;

        if (isFirst()) 
            last = first;
        
        count++;
    }
    
    public void addLast(Entity entity) {
        
        if (isFirst()) {
            addFirst(entity);
        } else {
            Link newLink = new Link(null, last, entity);
            last.setNext(newLink);
            last = newLink;
            
            count++;
        }
    }
    
    public void addBetween(Entity entity, int position) {
        
        if (position == 1) {
            addFirst(entity);
        } else if (position == count + 1) {
            addLast(entity);
        } else {
            Link previous = returnLink(position - 1);
            Link next = previous.getNext();
            Link newLink = new Link(next, previous, entity);
            
            next.setPrevious(newLink);
            previous.setNext(newLink);
            count++;
        }
    }
    
    public void removeFirst() {

        if (isFirst()) 
            throw new IllegalArgumentException("Nao ha itens para serem excluidos!");
        

        if (count == 1) {
            first = last = null;
        }
        else {
        first = first.getNext();
        first.setPrevious(null);
        }
        
        count--;
    }
    
    public void removeLast() {
        
        if (isFirst()) {
            throw new IllegalArgumentException("Nao ha itens para serem excluidos!");
        }
        
        if (count == 1) {
            removeFirst();
        } else {
            last = last.getPrevious();
            last.setNext(null);
            count--;
        }
    }
    
    public void removeBetween(int position) {
        
        if (position == 0) {
            System.out.println("Entidade nao existente!");
        } else if (position == 1) {
            removeFirst();
        } else if (position == count) {
            removeLast();
        } else {
            Link previous = returnLink(position - 1);
            Link next = returnLink(position + 1);
            
            previous.setNext(next);
            next.setPrevious(previous);
            count--;
        }
    }
    
    public String showList() {

        Link temp = first;
        String names = "";

        while (temp != null) {
            
            if (temp.getEntity() instanceof Person) {
                Person person = (Person)temp.getEntity();
                
                names += person.getName() + " ";
            }
            else{
            names += temp.getEntity().getId() + " ";
            }
            
            temp = temp.getNext();
        }

        return names;
    }
    
    public String showReverseList() {

        Link temp = last;
        String names = "";
        
        while (temp != null) {
            if (temp.getEntity() instanceof Person) {
                Person person = (Person)temp.getEntity();
                
                names += person.getName() + " ";
            }
            else{
            names += temp.getEntity().getId() + " ";
            }
            
            temp = temp.getPrevious();
        }

        return names;
    }
    
    public int showQuantity() {
        return count;
    }
    
    private boolean isFirst() {
        return count == 0;
    }
    
    private boolean verifyPosition(int position) {
        return position > 0 && position <= count + 1;
    }
    
    public Link returnLink(int position) {
        
        if (!verifyPosition(position)) {
            throw new IllegalArgumentException("Posicao invalida!");
        }
        
        Link temp = first;
        
        for (int i = 0; i < position - 1; i++) {
            temp = temp.getNext();
        }
        return temp;
    }
    
    public boolean contains(String id) {
        
        Link temp = first;
        boolean boo = false;
        
        while (temp != null) {            
            if (temp.getEntity().getId().equalsIgnoreCase(id)) {
                boo = true;
            }
        }
        
        return boo;
    }
    
    public int searchPosition(String id) { //SE RETORNAR 0, NAO EXISTE NA LISTA!
        
        Link temp = first;
        int position = 0;
        int cont = 0;
        
        if (contains(id)) {
            while (temp != null) {                
                if (temp.getEntity().getId().equalsIgnoreCase(id)) {
                    position = cont + 1;
                }
                cont++;
            }
        }
        
        return position;
    }
    
    public void update(Entity entity) {
        
        Link temp = first;
        
        while (temp != null) {
            if (entity.getId().equalsIgnoreCase(temp.getEntity().getId())) {
                temp.setEntity(entity);
            }
           
            temp = temp.getNext();
        }
    }
    
    public static void main(String[] args) {
        
        LinkedList list = new LinkedList();
        
        Resident a = new Resident(null, null, null, null, null, "Felipe", null, null, "1", true);
        Resident b = new Resident(null, null, null, null, null, "Catarina", null, null, "2", true);
        Resident c = new Resident(null, null, null, null, null, "Lucas", null, null, "3", true);
        Resident d = new Resident(null, null, null, null, null, "Marina", null, null, "4", true);
       
        list.addFirst(a);
        list.addFirst(b);
        list.addLast(c);
        list.addBetween(d, 2);
        System.out.println(list.showList());
        System.out.println(list.showReverseList());
        System.out.println(list.showQuantity());
       
        
        Resident x = new Resident(null, null, null, null, null, "Tiao Bocapreta", null, null, "1", true);
        list.update(x);
        System.out.println(list.showList());
        
    }
}
