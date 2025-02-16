class AvtoCompany extends Company { //автомобильная компания
    int count; // колво автомобилей
    int haul; //объем грузоперевозок

    public AvtoCompany(String name, int persons, int money, int count, int haul) { // конструктор
        super(name, persons, money);
        this.count = count;
        this.haul = haul;
    }

    //методы
    //определение среднего объема грузоперевозок
    public int averageAvto() {
        return haul / count;
    }
}
