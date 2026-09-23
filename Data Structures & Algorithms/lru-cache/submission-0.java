public class Node{

int key;
int value;
Node previous;
Node next;

public Node(int key,int value){

  this.key=key;
  this.value=value;
}

}

class LRUCache {

HashMap<Integer,Node>map;
Node left;
Node right;
int capacity;

    private void remove(Node node){

      node.previous.next=node.next;
      node.next.previous=node.previous;
    }

    private void insert(Node node){

      node.previous=right.previous;//backward
      node.previous.next=node;//forward
      node.next=right;//forward
      right.previous=node;//backward

    }

    public LRUCache(int capacity) {


      this.capacity=capacity;

      map=new HashMap<>();
      left=new Node(0,0);
      right=new Node(0,0);

      left.next=right;
      right.previous=left;
        
    }
    
    public int get(int key) {

      if(!map.containsKey(key)){
        return -1;
      }
      else{

        Node node=map.get(key);
        remove(node);
        insert(node);
        return node.value;
      }
        
    }
    
    public void put(int key, int value) {

      if(map.containsKey(key)){

        Node node=map.get(key);
        node.value=value;
        remove(node);
        insert(node);
        return;

      }
      else{

        Node node=new Node(key,value);
        map.put(key,node);
        insert(node);


        if(map.size()>capacity){
          Node lru=left.next;
          remove(lru);
          map.remove(lru.key);
        }
      }
        
    }
}
