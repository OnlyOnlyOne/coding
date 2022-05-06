package 复习.网易;

import java.util.*;

public class Demo4 {
    static List<BTNode> list = new ArrayList<>();

    public static BTNode createTree(int[] array) {
        BTNode root = new BTNode();
        for (int i = 0; i < array.length; i++) {
            BTNode bTNode = new BTNode(array[i], null, null);
            if (i == 0) {
                root = bTNode;
            }
            list.add(bTNode);
        }
        if (list.size() > 0) {
            for (int i = 0; i < array.length / 2; i++) {
                if (2 * i + 1 < list.size()) {
                    list.get(i).setLchild(list.get(2*i + 1));
                }
                if (2 * i + 2 < list.size()) {
                    list.get(i).setLchild(list.get(2*i + 2));
                }
            }
        }
        return root;
    }

    public static int[] createArray(int n) {
        int[] array = new int[n];
        int temp = 1;
        for (int i = 0; i < n; i++) {
            if (2 * (i + 1) <= n) {
                array[i] = 2 * (i + 1);
                continue;
            } else {
                array[i] = temp;
            }
            temp = temp + 2;
        }
        return array;
    }

    public static int[] solu(int n) {
        int[] array = createArray(n);
        List<Integer> list;
        BTNode root = new Demo4().createTree(array);
        list = level(root);
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }

    public static List<Integer> level(BTNode node) {
        List<Integer> result = new ArrayList<Integer>();
        Queue<BTNode> queue = new LinkedList<BTNode>();

        queue.offer(node);
        while (!queue.isEmpty()) {
            node = queue.poll();
            result.add(node.getData());
            System.out.println(node.getData() + "");
            if (node.getLchild() != null) {
                queue.offer(node.getLchild());
            }
            if (node.getRchild() != null) {
                queue.offer(node.getRchild());
            }
        }
        return result;
    }



    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] array = createArray(n);
        int[] result = new int[n];

        BTNode root = createTree(array);

        level(root);

    }




}
class BTNode{
    private int data;
    private BTNode lchild;
    private BTNode rchild;

    public BTNode() {
    }

    public BTNode(int data, BTNode lchild, BTNode rchild) {
        this.data = data;
        this.lchild = lchild;
        this.rchild = rchild;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public BTNode getLchild() {
        return lchild;
    }

    public void setLchild(BTNode lchild) {
        this.lchild = lchild;
    }

    public BTNode getRchild() {
        return rchild;
    }

    public void setRchild(BTNode rchild) {
        this.rchild = rchild;
    }
}

