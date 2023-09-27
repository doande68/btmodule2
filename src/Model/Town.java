package Model;

import java.util.ArrayList;

public class Town {
    private ArrayList<Family> listFamily = new ArrayList<>();
    public void add(Family family){
        listFamily.add(family);
    }
    public ArrayList<Family> getListFamily(){
        return listFamily;
    }
    public void setListFamily(ArrayList<Family> listFamily) {
        this.listFamily = listFamily;
    }
    public void delete(int houseNumber){
        int index = findIndex(houseNumber);
        listFamily.remove(index);

    }
    public void edit(int houseNumber, Family family) {
        int index = findIndex(houseNumber);
        listFamily.set(index, family);
    }

    public int findIndex(int houseNumber) {
        for (int i = 0; i < listFamily.size(); i++) {
            if (listFamily.get(i).getHouseNumber() == houseNumber) {
                return i;
            }
        }
        return -1;
    }

    public void showAll() {
        for (Family houseHold : listFamily) {
            houseHold.showAll();

        }
        System.out.println();
    }
}

