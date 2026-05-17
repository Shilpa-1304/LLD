package com.sk.LLD.Generics;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Pair<S,R> {
    S val1;
    R val2;
}
