public class Employee {
    String name;        // Çalışanın Adı
    int salary;         // Çalışanın Maaşı
    int workHours;      // Haftalık Çalışma Saati
    int hireYear;       // İşe Başlangıç Yılı
    double tax = 0.0;
    int bonus = 0;
    double raise = 0;

    Employee(String name,int salary,int workHours,int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    double tax(){

        if(this.salary < 1000) {
            this.tax = 0;
        } else {
            this.tax = this.salary*(0.03);
        }
        return tax;
    }

    public double bonus(){

        if(this.workHours > 40) {
            bonus = (this.workHours-40)*30;
        }
        return bonus;
    }

    public double raiseSalary() {

        int workYear = 2021 - this.hireYear;

        if(workYear < 10) {
            raise = this.salary*0.05;
        }
        if(workYear > 9 && workYear < 20) {
            raise = this.salary*0.1;
        }
        if(workYear > 19) {
            raise = this.salary*0.15;
        }
        return raise;
    }

    public String toString(){
        System.out.println("Adı : " + this.name);
        System.out.println("Maaşı : " + this.salary);
        System.out.println("Çalışma Saati : " + this.workHours);
        System.out.println("Başlangıç Yılı : " + this.hireYear);
        System.out.println("Vergi : " + tax());
        System.out.println("Bonus : " + bonus());
        System.out.println("Maaş artışı : " + raiseSalary());
        System.out.println("Vergi ve Bonslar ile birlikte maaş : " + (this.salary-tax()+bonus()));
        System.out.println("Toplam Maaş : " + (this.salary+raiseSalary()));
        return null;
    }

}


