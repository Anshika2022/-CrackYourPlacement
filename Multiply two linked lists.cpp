class solution {
  public:
    long long multiplyTwoLists(Node *first, Node *second) {
        // code here
       long long n1 =0;
         long long n2 =0;
         long long n3 = 0;
         while(first != NULL){
             n1 = (n1*10+ first->data)%1000000007;
             first = first->next;
         }
         while(second != NULL){
             n2 = (n2*10+ second->data)%1000000007;
             second = second->next;
         }
         n3 =(n1*n2)%1000000007;
         return n3;
    }
};
