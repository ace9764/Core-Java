package com.aaron.core.java;

public class DoublyLinkedList<E>  {

    private Node<E> head; // 노드의 첫 부분을 가리키는 레퍼런스
    private Node<E> tail; // 노드의 끝 부분을 가리키는 레퍼런스

    private int size; // 리스트 요소 갯수

    // 생성자
    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }
    private static class Node<E> {
        private E item; // Node에 담을 데이터
        private Node<E> next; // 다음 Node 객체를 가르키는 래퍼런스
        private Node<E> prev; // 이전 Node 객체를 가르키는 래퍼런스

        // 생성자 (이전 노드 포인트 | 데이터 | 다음 노드 포인트)
        Node(Node<E> prev, E item, Node<E> next) {
            this.item = item;
            this.next = next;
            this.prev = prev;
        }
    }








}
