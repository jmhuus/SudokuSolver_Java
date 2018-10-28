package com.company;

import org.apache.commons.lang3.ArrayUtils;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // [row][column]
        Integer[][] boardNums_easy = {
                {5,0,0,9,0,0,0,2,7},
                {0,0,0,5,0,0,1,0,4},
                {0,0,7,1,2,3,0,0,8},
                {0,0,6,0,0,4,0,0,2},
                {4,8,0,0,0,0,0,1,6},
                {9,0,0,6,0,0,5,0,0},
                {7,0,0,3,9,5,2,0,0},
                {8,0,9,0,0,6,0,0,0},
                {1,5,0,0,0,2,0,0,9},
        };

        Integer[][] boardNums_medium = {
                {5,0,0,9,0,0,0,2,7},
                {0,0,0,5,0,0,1,0,4},
                {0,0,7,1,2,3,0,0,8},
                {0,0,6,0,0,4,0,0,2},
                {4,8,0,0,0,0,0,1,6},
                {9,0,0,6,0,0,5,0,0},
                {7,0,0,3,9,5,2,0,0},
                {8,0,9,0,0,6,0,0,0},
                {1,5,0,0,0,2,0,0,9},
        };

        Integer[][] boardNums_hard = {
                {5,0,0,9,0,0,0,2,7},
                {0,0,0,5,0,0,1,0,4},
                {0,0,7,1,2,3,0,0,8},
                {0,0,6,0,0,4,0,0,2},
                {4,8,0,0,0,0,0,1,6},
                {9,0,0,6,0,0,5,0,0},
                {7,0,0,3,9,5,2,0,0},
                {8,0,9,0,0,6,0,0,0},
                {1,5,0,0,0,2,0,0,9},
        };

        Integer[][] boardNums_expert = {
                {2,0,0,1,9,0,0,8,0},
                {0,4,0,0,3,0,0,0,6},
                {0,0,0,2,7,0,5,0,0},
                {0,0,9,0,0,0,0,6,0},
                {0,0,5,0,6,9,0,0,0},
                {4,0,0,0,1,0,0,9,0},
                {7,0,4,0,0,0,0,0,3},
                {1,2,0,0,0,0,8,0,0},
                {0,0,0,0,0,0,0,0,2},
        };

        Integer[][] boardNums_test1 = {
                {0,5,0,6,0,3,0,0,0},
                {0,8,0,0,0,0,9,4,0},
                {0,0,0,0,0,0,1,0,0},
                {0,0,8,0,0,0,4,7,0},
                {0,7,0,0,2,9,0,0,0},
                {0,0,5,3,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,4},
                {0,3,6,0,0,5,0,0,2},
                {8,0,0,1,9,0,0,0,0},
        };
        Board board = new Board(boardNums_expert);
        board.solve();
     }
}



















