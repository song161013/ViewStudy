package com.ipc.aidl;

import com.ipc.aidl.Book;

interface IBookManager{
List<Book> getBookList();
void addBook(in Book book);
}