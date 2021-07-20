package com.company;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class MaterialManager<E>   {
    List<E> materialList = new ArrayList<>();
    String managerName;

    public MaterialManager() {
    }

    public MaterialManager(List<E> materialList, String managerName) {
        this.materialList = materialList;
        this.managerName = managerName;

    }

    public List<E> getMaterialList() {
        return materialList;
    }

    public void setMaterialList(List<E> materialList) {
        this.materialList = materialList;
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    public void showALl(){
        for (int i = 0; i < materialList.size(); i++) {
            System.out.println(materialList.get(i));
        }
    }
    //Add:
    public void addElements (E e ){
        materialList.add(e);
    }
    //Remove:
    public void removeELements (E e){ materialList.remove(e); }
    //Edit:
    public void editElements (E e, int index){
            materialList.set(index, e);
    }
    // tong tien

    public double expectedTotalAmount (){
        double sum =0;
        for (int i = 0; i < materialList.size(); i++) {
           sum += ( ( Material) materialList.get(i)).getAmount();
        }
        return sum;
    }
    public double realTotalAmount () {
        double sum = 0;
        for (int i = 0; i < materialList.size() ; i++) {
            sum += ((Material) materialList.get(i)).getRealMoney();

        }


//    @Override
//    public double getRealMoney(Material material) {
//        double newCost=0.0;
//        double costGap=0.0;
//        if(material instanceof CrispyFlour ){
//            if(material.getExpiryDate().compareTo(LocalDate.now().plusMonths(2))==1){
//                newCost = material.getCost()*0.6;
//            }
//            if (material.getExpiryDate().compareTo(LocalDate.now().plusMonths(4))==1){
//                newCost =material.getCost()*0.8;
//            }
//            else { newCost = material.getCost()*0.95;
//        }
//    } else {
//            if (material.getExpiryDate().compareTo((LocalDate.now().plusDays(3)))==1){
//                newCost =material.getCost()*0.6;
//            }
//            if (material.getExpiryDate().compareTo(LocalDate.now().plusDays(5))==1){
//                newCost = material.getCost()*0.7;
//            }
//            else { newCost = material.getCost()*0.9;
//        }
//}
//        return costGap = material.getCost() - newCost;

}





