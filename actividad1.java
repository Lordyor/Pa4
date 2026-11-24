semana12/src/main/java/pe/edu/isil/CampusRouteCheck.java

package pe.edu.isil;

public class CampusRouteCheck {

    static class Node {
        int locationId;
        Node next;

        Node(int locationId) {
            this.locationId = locationId;
            this.next = null;
        }
    }

    static boolean containsLocation(Node current, int targetLocationId) {
        if (current == null) return false;
        if (current.locationId == targetLocationId) return true;
        return containsLocation(current.next, targetLocationId);
    }

    public static void main(String[] args) {
        Node head = new Node(101); // Main Entrance
        head.next = new Node(204); // Central Plaza
        head.next.next = new Node(309); // Library

        System.out.println("Has location 204: " + containsLocation(head, 204));
        System.out.println("Has location 999: " + containsLocation(head, 999));
    }
}
