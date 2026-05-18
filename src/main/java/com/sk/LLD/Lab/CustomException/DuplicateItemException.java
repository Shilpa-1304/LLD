package com.sk.LLD.Lab.CustomException;

public class DuplicateItemException extends RuntimeException{
    public DuplicateItemException(String msg){
        super(msg);
    }
}
