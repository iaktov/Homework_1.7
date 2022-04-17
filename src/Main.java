public class Main {
    public static void main(String[] args) {

        //Задание 1
        String firstName = "Иванов" ;
        String middleName = "Семен";
        String lastName = "Семёнович";
        String fullName = firstName + ' ' + middleName + ' ' + lastName;
        System.out.println(fullName);

        //Задание 2
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName.toUpperCase());

        //Задание 3
        String correctFullName = fullName.replace('ё', 'е');
        System.out.println("Данные ФИО сотрудника — " + correctFullName);
    }
}