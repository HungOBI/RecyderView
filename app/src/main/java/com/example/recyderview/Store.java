package com.example.recyderview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Store {
    private int image;
    private long openTime;
    private long closeTime;
    private String name;
    private String address;
    private List<ServiceType> listServiceType;
    private String saleOff;
    private float distance;

    public Store(int image, long openTime, long closeTime, String name, String address, List<ServiceType> listServiceType, String saleOff, float distance) {
        this.image = image;
        this.openTime = openTime;
        this.closeTime = closeTime;
        this.name = name;
        this.address = address;
        this.listServiceType = listServiceType;
        this.saleOff = saleOff;
        this.distance = distance;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public long getOpenTime() {
        return openTime;
    }

    public void setOpenTime(long openTime) {
        this.openTime = openTime;
    }

    public long getCloseTime() {
        return closeTime;
    }

    public void setCloseTime(long closeTime) {
        this.closeTime = closeTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<ServiceType> getListServiceType() {
        return listServiceType;
    }

    public void setListServiceType(List<ServiceType> listServiceType) {
        this.listServiceType = listServiceType;
    }

    public String getSaleOff() {
        return saleOff;
    }

    public void setSaleOff(String saleOff) {
        this.saleOff = saleOff;
    }

    public float getDistance() {
        return distance;
    }

    public void setDistance(float distance) {
        this.distance = distance;
    }

    @Override
    public String toString() {
        return "Store{" +
                "image=" + image +
                ", openTime=" + openTime +
                ", closeTime=" + closeTime +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", listServiceType=" + listServiceType +
                ", saleOff='" + saleOff + '\'' +
                ", distance=" + distance +
                '}';
    }
    public static List<Store> getMock() {
        return new ArrayList<>(Arrays.asList(
                new Store(R.drawable.img_1, 21600000, 79200000, "B??n ?????u Ngh??a T??n", "s??? 4,ng?? 98 Duy T??n tp H?? N???i",new ArrayList<>(Arrays.asList(ServiceType.SHOP_ONLINE)), "", 0),
                new Store(R.drawable.ta_la, 0, 86400000, "T?? L??? - ??n V???t, M?? X??o, C??m Chi??n & Sinh T??? - Phan V??n Tr???", "667/1 Phan V??n Tr???, P. 7, G?? V???p, TP. HCM", new ArrayList<>(Arrays.asList(ServiceType.STREET_FOOD)), "C??? ng??y - Gi???m 15%", 10),
                new Store(R.drawable.royaltea, 29820000, 80520000, "Royaltea Vietnam By Hongkong - S??n K???", "35 S??n K???, P. S??n K???, T??n Ph??, TP. HCM", new ArrayList<>(Arrays.asList(ServiceType.STREET_FOOD)), "Bu???i tr??a - Gi???m 30%", 2),
                new Store(R.drawable.anh_thu_banh_mi, 21600000, 79200000, "Anh Th?? - B??nh M?? & B??n Th???t N?????ng", "115B T??n ?????n, P. 14, Qu???n 4, TP. HCM", new ArrayList<>(Arrays.asList(ServiceType.STREET_FOOD)), "C??? ng??y - Gi???m 24%", 4),
                new Store(R.drawable.banh_trang_ut_hanh, 43200000, 82800000, "B??nh Tr??ng ??t H???nh", "Kios 11 ???????ng s??? 32, P. 10, Qu???n 6, TP. HCM", new ArrayList<>(Arrays.asList(ServiceType.SHOP_ONLINE)), "Bu???i t???i - Gi???m 34%", 6),
                new Store(R.drawable.com_tam, 0, 86400000, "C??m T???m Huy???n - ??inh Ti??n Ho??ng", "H???m 95 ??inh Ti??n Ho??ng, P. 3, B??nh Th???nh, TP. HCM", new ArrayList<>(Arrays.asList(ServiceType.RESTAURANT)), "Bu???i t???i - Gi???m 12%", 19),
                new Store(R.drawable.vit_quay, 21600000, 79200000, "V??nh Phong - C???a H??ng V???t Quay", "523 - 525 - 527 Phan V??n Tr???, P. 7, Qu???n 5, TP. HCM", new ArrayList<>(Arrays.asList(ServiceType.RESTAURANT)), "Bu???i t???i - Gi???m 9%", 2),
                new Store(R.drawable.bm_huynh_hoa, 29820000, 80520000, "RB??nh M?? Huynh Hoa - B??nh M?? Pate", "26 L?? Th??? Ri??ng, P. B???n Th??nh, Qu???n 1, TP. HCM", new ArrayList<>(Arrays.asList(ServiceType.STREET_FOOD)), "Bu???i t???i - Gi???m 34%", 4),
                new Store(R.drawable.katinat, 21600000, 79200000, "Katinat - C???ng Ho??", "20 C???ng Ho??, P. 4, T??n B??nh, TP. HCM", new ArrayList<>(), "Bu???i t???i - Gi???m 7%", 0),
                new Store(R.drawable.banh_trang_cham, 21600000, 79200000, "B??nh Tr??ng Ch???m C?? G??nh - Chung C?? A4 Phan X??ch Long", "L?? D001 Chung C?? A4 Phan x??ch Long, P. 7, Ph?? Nhu???n, TP. HCM", new ArrayList<>(Arrays.asList(ServiceType.SHOP_ONLINE)), "Bu???i t???i - Gi???m 10%", 4))
        );
    }
}
