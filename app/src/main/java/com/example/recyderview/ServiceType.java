package com.example.recyderview;

public enum ServiceType {
    RESTAURANT("Nhà hàng"),
    BIRTH_DAY("Sinh nhật"),
    FAMILY("Gia đình"),
    GROUP("Hội nhóm"),
    SHOP_ONLINE("Bán online"),
    STREET_FOOD("Đồ ăn đường phố"),
    BUFFET("Buffer");

    private final String name;

    ServiceType(String s){
        name =s;
    }

    public String toString(){
        return name;
    }
}

