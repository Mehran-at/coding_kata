package com.kingcode;

public class Bio {
    public String dnaToRna(String dna) {
        if (dna.isEmpty()) return dna;
        return dna.replace('T', 'U');  // Do your magic!
    }
}
