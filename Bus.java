

class BusStop {
    String name;
    BusStop next;

    BusStop(String name) {
        this.name = name;
        this.next = null;
    }
}

public class Bus {

    public static void main(String[] args) {

        BusStop head = null;
        BusStop temp = null;

        
        String[] stops = {"Stop A", "Stop B", "Stop C", "Stop D"};

        
        for (int i = 0; i < stops.length; i++) {
            BusStop newNode = new BusStop(stops[i]);

            if (head == null) {
                head = newNode;
                temp = head;
            } else {
                temp.next = newNode;
                temp = newNode;
            }
        }

       
        System.out.print("Bus Route: ");
        temp = head;
        while (temp != null) {
            System.out.print(temp.name + " -> ");
            temp = temp.next;
        }
        System.out.print("END");
    }
}

