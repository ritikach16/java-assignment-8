import java.util.*;

public class Student {
    List<Integer> stuList = new ArrayList<>();
    List<String> subList = new ArrayList<>();
    Map<Integer, String> map = new HashMap<>();
    void setDetails(){
        for (int i = 1; i<=100; i++){
            stuList.add(i);
        }
        for (int i = 1; i<=100; i++){
            subList.add("subId" + i);
        }
    }

    boolean findStu(int id){
        for(int i : stuList){
            if(i == id) return true;
        }

        return false;
    }


    boolean findSub(String subId){
        for(String i : subList){
            if(i.equals(subId)) return true;
        }

        return false;
    }

    boolean storeStudent(int stuId, String subId){
        if(stuId > 50 && subId != ""){
            map.put(stuId, subId);
            return true;
        }
        return false;
    }
}