package com.dalvikmx.adapterpattern;

public class CustomerLocation implements OldLocation {

    String building;
    int floor;
    String office;
    int desk;

    @Override
    public String getBuilding() {
        return this.building;
    }

    @Override
    public void setBuilding(String building) {
        this.building = building;

    }

    @Override
    public int getFloor() {
        return this.floor;
    }

    @Override
    public void setFloor(int floor) {
        this.floor = floor;

    }

    @Override
    public String getOffice() {
        return this.office;
    }

    @Override
    public void setOffice(String office) {
        this.office = office;

    }

    @Override
    public int getDesk() {
        return this.desk;
    }

    @Override
    public void setDesk(int desk) {
        this.desk = desk;

    }
}
