package com.example.numberrangesummarizer;

import java.util.ArrayList;
import java.util.Collection;

public class Summarize implements NumberRangeSummarizer{

    @Override
    public Collection<Integer> collect(String input) {
        ArrayList<Integer> Numbers = new ArrayList<>();
        String[] str_split = input.split(",");

        for(String numb:str_split){
            Integer conv = Integer.valueOf(numb);
            Numbers.add(conv);
        }

        return Numbers;
    }

    @Override
    public String summarizeCollection(Collection<Integer> input) {
        Integer[] Input = input.toArray(new Integer[input.size()]);
        StringBuilder Final_str = new StringBuilder();
        int Range = 0;
        for(int i = 0; i<Input.length; i++){
            if(i == Input.length-1){
                if(Range !=0){
                    String range_l =  String.valueOf(Input[i] - Range);
                    String range_r = String.valueOf(Input[i]);
                    Final_str.append(range_l).append("-").append(range_r);
                }
                else{
                    Final_str.append(Input[i]);
                }
            }
            else{
                boolean isSequential = Input[i+1] - Input[i] == 1;
                if(isSequential){
                    Range++;
                }
                else {
                    if(Range != 0){
                        String range_l =  String.valueOf(Input[i] - Range);
                        String range_r = String.valueOf(Input[i]);
                        Final_str.append(range_l).append("-").append(range_r).append(", ");
                        Range = 0;
                    }
                    else{
                        Final_str.append(Input[i]).append(", ");
                    }
                }
            }
        }
        return Final_str.toString();
    }
}
