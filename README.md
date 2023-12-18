# Tugas Unit Testing WKPL menggunakan JUnit
Tugas WKPL kali ini adalah tentang melakukan unit testing menggunakan JUnit dengan studi kasus yang sederhana. pada tugas ini saya menggunakan studi kasus penggunaan kalkulator sederhana yaitu proses penjumlahan dan pengurangan.

## Kode program pada file Calculator.java
```java
public class Calculator {
    
    public int add(int a, int b) {
        return a + b;
    }

    public int substract(int a, int b) {
        return a - b;
    }
}
```

## Kode program pada file CalculatorTest.java
```java
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        int result = calculator.add(5, 5);
        assertEquals(10, result);
    }

    @Test
    public void testSubstract() {
        Calculator calculator = new Calculator();
        int result = calculator.substract(10, 5);
        assertEquals(5, result);
    }
}
```

Untuk outputnya sendiri nanti akan berupa pesan 'succes' atau 'fail' pada terminal testing, atau jika menggunakan JUnit pada VSCode maka akan keluar outputnya pada baris line code (jika ada kesalahan ekspektasi saat testing), namun jika berhasil maka akan keluar pada terminal testing dengan tanda centang hijau pada case yang diuji. contohnya seperti gamabar dibawah ini

### Gagal Unit Testing
![Screenshot 2023-11-03 142908](https://github.com/rayasya/unitTesting2_wkpl/assets/68797333/769ed89e-8d4d-45c6-8072-f68a027743d5)

### Sukses Unit Testing
![image](https://github.com/rayasya/unitTesting2_wkpl/assets/68797333/665c5e63-8e3c-48cf-98e8-6592a1339c72)

