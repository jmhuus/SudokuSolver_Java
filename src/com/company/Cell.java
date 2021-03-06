package com.company;

public class Cell {

    private Integer[] options;
    private int row, col;

    public Cell(Integer[] options, int row, int col) {
        this.options = options;
        this.row = row;
        this.col = col;
    }


    // Returns whether the square has a known answer
    public boolean isSolved(){
        if(options.length == 1){
            return true;
        }

        return false;
    }

    public Integer[] getOptions() {
        if(options.length==0){
            return new Integer[]{};
        }else{
            return options;
        }
    }

    public String getAddress(){
        return ""+row+""+col;
    }


    // TODO: include functionality to add a number option
//    public void appendNumOption(int newOption){
//
//    }
}
