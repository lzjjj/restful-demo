package com.oocl.employee.util;

import com.oocl.employee.model.Employee;

import java.util.List;

public class CompareList {
    public static boolean isEqual(List listA, List listB){
        if(listA.size()!=listB.size()){
            return false;
        }
        for(int i=0;i<listA.size();i++){
           if(!listA.get( i ).equals( listB.get( i ) )){
               return false;
           }
        }
        return true;
    }
}
