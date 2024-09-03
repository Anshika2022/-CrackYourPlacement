// User function Template for Java

class Solution {
    // Function to flatten a linked list
    Node flatten(Node root) {
        // code here
        ArrayList<Integer> a= new ArrayList<Integer>();
        Node p = root;
        while(p!=null)
        {
            Node q=p;
            while(q!=null){
                a.add(q.data);
                q=q.bottom;
            }
            p=p.next;
        }
        Collections.sort(a);
        root=null;
        Collections.reverse(a);
        int temp=0;
        while(temp<a.size()){
            Node ramu=new Node(a.get(temp++));
            ramu.bottom= root;
            root=ramu;
        }
        return root;
    }
}
