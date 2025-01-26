class Main {
    public static void main(String[] args) {
        int i, min, temp, j, max; // параметр цикла, наименьшая сумма страховых взносов, вспомогательные переменные

        // страховая компания

        // создание массива ссылок на объекты класса ins company
        InsCompany[] CityCompany = new InsCompany[3];

        // создание и инициализация объектов
        CityCompany[0] = new InsCompany("Первая СК", 100, 1_000_000, 100, 500_000, 200_000);
        CityCompany[1] = new InsCompany("Вторая СК", 150, 1_500_000, 10, 100_000, 600_000);
        CityCompany[2] = new InsCompany("Третья СК", 1500, 156_500_000, 5340, 1_000_000_000, 600_000_000);

        // печатаем информацию о компаниях страховых
        for(i=0; i<3; i++){
            CityCompany[i].show();
        }
        //выяснить, какая страховая компания имеет
        //наименьшую сумму страховых взносов
        min = CityCompany[0].getSummaplus();
        j = 0;
        for(i=1; i<3; i++){
            temp = CityCompany[i].getSummaplus();
            if (temp<min) {
                min = temp;
                j = i;
            }
        }
        System.out.println("\nНаименьшая сумма взносов в компании: " + CityCompany[j].getName() + "\n");


        // автокомпания
        AvtoCompany[] AvtoCompany = new AvtoCompany[2];
        AvtoCompany[0] = new AvtoCompany("Первая АК", 10, 1000000, 50, 500);
        AvtoCompany[1] = new AvtoCompany("Вторая АК", 30, 500000000, 400, 10000);
        for(i=0; i<2; i++){
            AvtoCompany[i].show();
        }
        // выяснить какая компания автомобильная имеет наибольший средний объем грузоперевозок
        max = AvtoCompany[0].averageAvto();
        j = 0;
        for(i=1; i<2; i++){
            temp = AvtoCompany[i].averageAvto();
            if(temp>max){
                max = temp;
                j = i;
            }
        }
        System.out.println("\nНаибольший средний объем грузоперевозок в компании " + AvtoCompany[j].getName());
    }
}