package dsa;

class linkedList{
    class Node{
        int value;
        Node next;

        public Node(int value){
            this.value = value;
            this.next = null;
        }

    }

    private Node head;

    public linkedList(){
        head = null;
    }

    public void addLast(int val) {
        Node nc = new Node(val);

        if (head == null) {
            head = nc;

        } else {
            Node trav = head;
            while (trav.next != null) {
                trav = trav.next;
            }
            trav.next = nc;

        }
    }
}