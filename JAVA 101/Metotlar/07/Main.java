public class Main {
    public static void main(String[] args) {

        Teacher t1 = new Teacher("Osman","MAT","12345");
        Teacher t2 = new Teacher("Bülent","FZK","2154");
        Teacher t3 = new Teacher("Esmeray","TRH","5454");

        Course matematik = new Course("Matematik","101","MAT");
        Course fizik = new Course("Fizik","102","FZK");
        Course tarih = new Course("Tarih","103","TRH");

        matematik.addTeacher(t1);
        fizik.addTeacher(t2);
        tarih.addTeacher(t3);

        Student s1 = new Student("ENES","123","2",matematik,fizik,tarih);
        s1.addBulkExamNote(100,78,50);
        s1.isPass();

        Student s2 = new Student("ARİF","453","9",matematik,fizik,tarih);
        s2.addBulkExamNote(89,34,23);
        s2.isPass();










    }
}
