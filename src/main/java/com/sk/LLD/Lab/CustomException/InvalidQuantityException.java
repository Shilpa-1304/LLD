package com.sk.LLD.Lab.CustomException;

public class InvalidQuantityException extends RuntimeException{
    public InvalidQuantityException(String msg){
        super(msg);
    }
}
