package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Driver> driver= new ArrayList<>();
    static ArrayList<Customer> customer= new ArrayList<>();
    static Scanner altaf = new Scanner(System.in);

    public static void main ( String[] args ) {
        int menu;
        do{
            System.out.println("MENU");
            System.out.println("1.Input Driver");
            System.out.println("2.Input Customer");
            System.out.println("3.Info Driver");
            System.out.println("4.Info Customer");
            System.out.println("5.Top up ");
            System.out.println("6.Transaksi");
            System.out.println("7.Keluar");
            menu = altaf.nextInt();

            switch (menu) {
                case 1 :
                    inputDriver();
                    break;
                case 2 :
                    inputCustomer();
                    break;
                case 3 :
                    infoUserDriver();
                    break;
                case 4 :
                    infoUserCustomer();
                    break;
                case 5 :
                    topUpSaldoCustomer();
                    break;
                case 6 :
                    bayarDriver();
                    break;
                case 7 :
                    break;
                default:
                    break;
            }
        }while (menu !=7);
    }
    static void inputDriver() {
        String nik;
        String nama;
        String noTelp;
        String platNo;
        String jenis;
        double saldo;

        System.out.println("NIK :");
        nik = altaf.next();
        System.out.println("Nama :");
        nama = altaf.next();
        System.out.println("No Telepon :");
        noTelp = altaf.next();
        System.out.println("Saldo :");
        saldo = altaf.nextDouble();
        System.out.println("Plat No :");
        platNo = altaf.next();
        System.out.println("Jenis Kendaraan :");
        jenis = altaf.next();

        driver.add(new Driver(nik, nama, noTelp, saldo, platNo, jenis));
        System.out.println();
    }

    static void inputCustomer() {
        String nik;
        String nama;
        String noTelp;
        double saldo;

        System.out.println("NIK :");
        nik = altaf.next();
        System.out.println("Nama :");
        nama = altaf.next();
        System.out.println("Nomor Telepon :");
        noTelp = altaf.next();
        System.out.println("Saldo :");
        saldo = altaf.nextDouble();
        customer.add(new Customer(nik, nama, noTelp, saldo));
        System.out.println();
    }
    private static void
    infoUserDriver (){
        for(Driver driver : driver){
            System.out.println("NIK :" + driver.getNik()
                    +"\nNama : " + driver.getNama()
                    +"\nNomor Telepon :" + driver.getNoTelp()
                    +"\nSaldo :" + driver.getSaldo()
                    +"\nNomor Plat Kendaraan:" + driver.getPlatNo()
                    +"\nJenis Kendaraan :" + driver.getJenis());
        }
        System.out.println();
    }

    static
    void infoUserCustomer (){
        for(Customer customer : customer){
            System.out.println("NIK :" +customer.getNik()
                    +"\nNama :" + customer.getNama()
                    +"\nNomor Telepon :" + customer.getNoTelp()
                    +"\nSaldo :" + customer.getSaldo() + "\n");
        }
        System.out.println();
    }

    static
    void topUpSaldoCustomer (){
        int indesxCustomer, indexDriver;
        double topUp;

        System.out.println("Masukkan index customer :");
        indesxCustomer = altaf.nextInt();
        System.out.println("Masukkan index driver :");
        indexDriver=altaf.nextInt();
        System.out.println("Total saldo yang akan ditop up :");
        topUp=altaf.nextDouble();

        driver.get(indexDriver).saldo-= topUp;
        customer.get(indesxCustomer).saldo += topUp;

        System.out.println("Transaksi berhasil. \n");
    }

    static
    void bayarDriver (){
        int indesxCustomer, indexDriver;
        double bayar;

        System.out.println("Masukkan index driver :");
        indexDriver = altaf.nextInt();
        System.out.println("Masukkan index customer :");
        indesxCustomer=altaf.nextInt();
        System.out.println("Total saldo yang akan ditop up :");
        bayar=altaf.nextDouble();

        customer.get(indexDriver).saldo -= bayar();
        driver.get(indesxCustomer).saldo += bayar();

        System.out.println("Transaksi berhasil. \n");
    }

    private static
    double bayar () {
        return bayar();
    }
}
