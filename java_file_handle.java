import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
class java_file_handle {
    public static void main(String[] args) throws IOException {
        int participants, i;
        System.out.println("Number of participants");
        Scanner input = new Scanner(System.in);
        participants = input.nextInt();
        input.nextLine();
        String[] names = new String[participants];
        System.out.println("Enter names of participants");
        for(i = 0; i < participants; i++) {
            names[i] = input.nextLine();
        }
        enterNames(names);
    }

    public static void enterNames(String[] names) throws IOException {
        FileWriter file = new FileWriter("names.txt");
        String target;
        for(int i = 0; i < names.length; i++) {
            target = names[i] + ",";
            file.write(target);
        }
        file.close();
    }

    public static void displayNames(String[] names) {
        for(int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}