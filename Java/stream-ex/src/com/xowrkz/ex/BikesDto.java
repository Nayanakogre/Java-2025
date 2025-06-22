package com.xowrkz.ex;

public class BikesDto {
    private String bikeName;
    private int modelNo;

    public BikesDto(String bikeName, int modelNo) {
        this.bikeName = bikeName;
        this.modelNo = modelNo;
    }

    public String getBikeName() {
        return bikeName;
    }

    public int getModelNo() {
        return modelNo;
    }

    @Override
    public String toString() {
        return "BikesDto{" +
                "bikeName='" + bikeName + '\'' +
                ", modelNo=" + modelNo +
                '}';
    }
}
