public class Strings {
    public static void main(String[] args) {
        // Task 1
        String firstName = "Ivan";
        String middleName = "Ivan";
        String lastName = "Ivanovich";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("Ф. И. О. сотрудника — " + fullName);

// Task 2
        String upperCaseFullName = fullName.toUpperCase();
        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — " + upperCaseFullName);

// Task 3
        String correctedFullName = fullName.replace("ё", "е");
        System.out.println("Данные Ф. И. О. сотрудника — " + correctedFullName);

    }
    }

