package com.aaron.core.java;

public class SinglyLinkedList<E>  {

    private Node<E> head;

    private Node<E> tail;

    private int size;


    public SinglyLinkedList(){
        head = null;
        tail = null;
        size = 0;

    }


    private Node<E> search(int index) {

        Node<E> n = head;

        if(this.size > index ) {
            for (int i = 0; i < index; i++) {
                n = n.next;
            }
        }
        else{
            throw new ArrayIndexOutOfBoundsException("This index is out of array size! " );
        }

        return n;
    }

    public void add(int index, E value) {

        // 1. 인덱스가 0보다 작거나 size 보다 같거나 클 경우 에러
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }

        // 2. 추가하려는 index가 0이면 addFirst 호출
        if (index == 0) {
            addFirst(value);
            return;
        }

        // 3. 추가하려는 index가 size - 1와 같으면 addLast 호출
        if (index == size - 1) {
            addLast(value);
            return;
        }

        // 4. 추가하려는 위치의 이전 노드 얻기
        Node<E> prev_node = search(index - 1);

        // 5. 추가하려는 위치의 다음 노드 얻기
        Node<E> next_node = prev_node.next;

        // 6. 새 노드 생성 (바로 다음 노드와 연결)
        Node<E> newNode = new Node<>(value, next_node);

        // 7. size 증가
        size++;

        // 8. 이전 노드를 새 노드와 연결
        prev_node.next = newNode;
    }

    public void addFirst(E value) {

        // 1. 먼저 가장 앞의 요소를 가져옴
        Node<E> first = head;

        // 2. 새 노드 생성 (이때 데이터와 next 포인트를 준다)
        Node<E> newNode = new Node<>(value, first);

        // 3. 요소가 추가되었으니 size를 늘린다
        size++;

        // 4. 맨앞에 요소가 추가되었으니 head를 업데이트한다
        head = newNode;

        // 5. 만일 최초로 요소가 add 된 것이면 head와 tail이 가리키는 요소는 같게 된다.
        if (first == null) {
            tail = newNode;
        }
    }

    public void addLast(E value) {

        // 1. 먼저 가장 앞의 요소를 가져옴
        Node<E> previousLast = tail;

        // 2. 새 노드 생성 (이때 데이터와 next 포인트를 준다)
        Node<E> newNode = new Node<>(value, null);

        // 3. 요소가 추가되었으니 size를 늘린다
        size++;

        tail = newNode;

        if (previousLast == null) {
            // 5. 만일 최초로 요소가 add 된 것이면 head와 tail이 가리키는 요소는 같게 된다.
            head = newNode;
        } else {
            // 6. 최초 추가가 아니라면 last 변수(추가 되기 전 마지막이었던 요소)에서 추가된 새 노드를 가리키도록 업데이트
            previousLast.next = newNode;
        }

    }

    public boolean add(E value) {
        addLast(value);
        return true;
    }

    class Node<E>{

        private E i;

        private Node<E> next;


        public Node(E i, Node<E> next){
            this.i = i ;
            this.next = next;
        }



    }




}
