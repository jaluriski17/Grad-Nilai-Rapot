import java.util.Scanner;

// Kelas utama yang berisi metode main untuk menjalankan program
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai Anda: ");
        double nilai = scanner.nextDouble();

        // Membuat objek dari kelas GradeConverter
        GradeConverter gradeConverter = new GradeConverter();

        // Menggunakan objek untuk mengonversi nilai menjadi grade
        char grade = gradeConverter.konversiKeGrade(nilai);

        // Menampilkan hasil ke layar
        System.out.println("Nilai Anda: " + nilai);
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}

// Kelas yang digunakan untuk mengonversi nilai menjadi grade
class GradeConverter {
    // Metode untuk mengonversi nilai menjadi grade
    public char konversiKeGrade(double nilai) {
        if (nilai >= 90) {
            return 'A';
        } else if (nilai >= 80) {
            return 'B';
        } else if (nilai >= 70) {
            return 'C';
        } else if (nilai >= 60) {
            return 'D';
        } else {
            return 'E';
        }
    }
}
// Penjelasan singkat:
// 1. Program ini memiliki dua kelas utama: `Main` dan `GradeConverter`.
// 2. `Main` berfungsi sebagai kelas utama yang berisi metode `main` untuk menjalankan program.
// 3. `GradeConverter` berisi metode `konversiKeGrade` untuk mengubah nilai numerik menjadi nilai huruf.
// 4. Objek dari kelas `GradeConverter` dibuat dalam metode `main` dan digunakan untuk mengkonversi nilai yang dimasukkan oleh pengguna.
