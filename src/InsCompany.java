class InsCompany extends Company{ // страховая компания
    int counts; //колво застрахованных лиц
    int summaplus; // сумма страховых взносов
    int summaminus; //сумма страховых выплат

    //конструктор
    public InsCompany(String name, int persons, int money, int counts, int summaminus, int summaplus){
        super(name, persons, money); // вызывает конструктор родительского класса
        this.counts = counts;
        this.summaplus = summaplus;
        this.summaminus = summaminus;
    }

    //свойства
    public int getSummaplus() { // выводим сумма страховых взносов
        return summaplus;
    }
    // методы
    public int averageInsSumma(){ //вычисление среднего размера страховых взносов
        return summaplus/counts;
    }
    public void show(){
        super.show();
        System.out.println("Застрахованных лиц: " + counts + ". Взносы: " + summaplus + ". Выплаты: " + summaminus);

    }

}