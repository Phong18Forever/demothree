package com.example.demothree;

public class ItemMenu {
    private String itemName;
    private int itemIcon;

    public ItemMenu(String itemName) {
        this.itemName = itemName;
    }

    public ItemMenu(String itemName, int itemIcon) {
        this.itemName = itemName;
        this.itemIcon = itemIcon;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getItemIcon() {
        return itemIcon;
    }

    public void setItemIcon(int itemIcon) {
        this.itemIcon = itemIcon;
    }
}

