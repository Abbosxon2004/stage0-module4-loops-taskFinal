package school.mjc.stage0.loops.finalTask;

import java.util.Collections;

public class HalfPyramid {
    public void printHalfPyramid(int cathetusLength) {
        if (cathetusLength == 0) {
            return;
        }
        String[] pyramid = new String[cathetusLength];

        for (int i = 0; i < cathetusLength; i++) {
            pyramid[i] = String.join("", Collections.nCopies(cathetusLength-i-1, " "))
                    +String.join("", Collections.nCopies(i+1, "*"));
        }
        for (String s : pyramid) {
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }
}
