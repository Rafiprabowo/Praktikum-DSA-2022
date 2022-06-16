package array;

public class BinaryTreeArrayMain {
    public static void main(String[] args) {
        BinaryTreeArray bta = new BinaryTreeArray();
        int[] data = {6, 4, 8, 3, 5, 7, 9, 0, 0, 0};
        int idxLast = 6;
        bta.populateData(data, idxLast);
        bta.add(25);
        bta.add(6);
        bta.add(4);
        bta.traverseInOrder(0);
        System.out.println(" ");
        bta.traversePreOrder(0);
        System.out.println(" ");
        bta.traversePostOreder(0);
        System.out.println(" ");
    }
}
