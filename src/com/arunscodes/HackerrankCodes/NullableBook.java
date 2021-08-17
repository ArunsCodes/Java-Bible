package com.arunscodes.HackerrankCodes;

import java.util.Optional;

public class NullableBook {
    Optional<String> bookName;
    public NullableBook(Optional<String> name){
        bookName = name;
    }
    public Optional<String> getName(){
        return bookName;
    }

    public static void main(String[] args) {
        NullableBook nullableBook = new NullableBook(Optional.ofNullable(null));
        Optional<String> name = nullableBook.getName();
//        name.ifPresent(System.out::println).("Empty");
    }
}
