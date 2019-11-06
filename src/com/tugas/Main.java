package com.tugas;
import javax.swing.*;
import java.awt.*;

public class Main extends JFrame{
    private Login log = new Login();
    private SaldoPengaturan Sal = new SaldoPengaturan();

    // Main
    public static void main(String[] args){
        Main main = new Main();

        main.initSaldo();
        main.login();
    }

    // Saldo Awal
    private void initSaldo() {
        Sal.setSaldo(1000000);
    }

    // Login
    private void login() {
        // Frame
        JFrame frame = new JFrame ("LOGIN ");
        frame.setSize(400,500);
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.setVisible (true);
        // Deklarasi
        JButton jcomp1 = new JButton("Enter");
        JPasswordField jcomp2 = new JPasswordField (5);
        JButton jcomp3 = new JButton ("Cancel");
        JLabel jcomp4 = new JLabel ("Silahkan Masukkan PIN");
        JLabel jcomp5 = new JLabel ("SELAMAT DATANG DI BANK KRUT");
        JLabel jcomp6 = new JLabel ("");
        // Custom
        jcomp5.setFont(jcomp5.getFont().deriveFont(18.0f));
        jcomp4.setFont(jcomp5.getFont().deriveFont(14.0f));
        jcomp5.setForeground(Color.WHITE);
        jcomp4.setForeground(Color.WHITE);
        jcomp1.setForeground(Color.WHITE);
        jcomp3.setForeground(Color.WHITE);
        jcomp1.setBackground(Color.BLUE);
        jcomp3.setBackground(Color.RED);
        // Add frame
        frame.add (jcomp1);
        frame.add (jcomp2);
        frame.add (jcomp3);
        frame.add (jcomp4);
        frame.add (jcomp5);
        frame.add (jcomp6);
        // Setbounds
        jcomp1.setBounds (55, 255, 90, 30);
        jcomp2.setBounds (105, 185, 140, 25);
        jcomp3.setBounds (200, 255, 90, 30);
        jcomp4.setBounds (95, 150, 190, 25);
        jcomp5.setBounds (35, 75, 500, 25);
        jcomp6.setBounds (105, 45, 113, 25);
        // Set Background
        setLayout(new BorderLayout());
        JLabel background=new JLabel(new ImageIcon("C:\\Users\\WINDOWS 10\\Pictures\\TugasAkhirPBO\\background.PNG"));
        frame.add(background);
        background.setBounds (0, 0, 400, 500);
        // Fungsi button
        jcomp1.addActionListener(e -> {
            String pin;
            int pon;
            try {
                pin = jcomp2.getText();
                pon = Integer.parseInt(pin);
                if (pon == log.getPin()) {
                menu();
                frame.setVisible (false);
            } else {
                JOptionPane.showMessageDialog(null, "PIN Salah");
            }
            } catch (NumberFormatException nfe){
                JOptionPane.showMessageDialog(null, "Format PIN Salah");
            }
        });
        jcomp3.addActionListener(e -> frame.setVisible (false));
    }

    // Menu
    private void menu() {
        // Frame
        JFrame frame = new JFrame ("MENU ");
        frame.setSize(400,500);
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.setVisible (true);
        // Deklarasi
        JLabel kcomp1 = new JLabel("SELAMAT DATANG DI BANK KRUT");
        JLabel kcomp2 = new JLabel("Pilih Transaksi");
        JButton kcomp3 = new JButton("CEK SALDO");
        JButton kcomp4 = new JButton("TRANSFER");
        JButton kcomp5 = new JButton("PENARIKAN");
        JButton kcomp6 = new JButton("PEMBAYARAN");
        JButton kcomp7 = new JButton("KELUAR");
        JLabel kcomp8 = new JLabel("");
        // Custom
        kcomp1.setFont(kcomp1.getFont().deriveFont(18.0f));
        kcomp2.setFont(kcomp2.getFont().deriveFont(14.0f));
        kcomp1.setForeground(Color.WHITE);
        kcomp2.setForeground(Color.WHITE);
        kcomp3.setForeground(Color.WHITE);
        kcomp4.setForeground(Color.WHITE);
        kcomp5.setForeground(Color.WHITE);
        kcomp6.setForeground(Color.WHITE);
        kcomp7.setForeground(Color.WHITE);
        kcomp3.setBackground(Color.BLUE);
        kcomp4.setBackground(Color.BLUE);
        kcomp5.setBackground(Color.BLUE);
        kcomp6.setBackground(Color.BLUE);
        kcomp7.setBackground(Color.RED);
        // Add Frame
        frame.add (kcomp1);
        frame.add (kcomp2);
        frame.add (kcomp3);
        frame.add (kcomp4);
        frame.add (kcomp5);
        frame.add (kcomp6);
        frame.add (kcomp7);
        frame.add (kcomp8);
        // Setbounds
        kcomp1.setBounds (35, 35, 400, 25);
        kcomp2.setBounds (135, 105, 200, 25);
        kcomp3.setBounds (40, 160, 116, 25);
        kcomp4.setBounds (185, 160, 116, 25);
        kcomp5.setBounds (40, 205, 116, 25);
        kcomp6.setBounds (185, 205, 116, 25);
        kcomp7.setBounds (205, 295, 96, 25);
        kcomp8.setBounds (50, 270, 100, 25);
        // Set Background
        setLayout(new BorderLayout());
        JLabel background=new JLabel(new ImageIcon("C:\\Users\\WINDOWS 10\\Pictures\\TugasAkhirPBO\\background.PNG"));
        frame.add(background);
        background.setBounds (0, 0, 400, 500);
        // Fungsi button
        kcomp3.addActionListener(e -> {
            lihatSaldo();
            frame.setVisible (false);
        });
        kcomp4.addActionListener(e -> {
            transfer();
            frame.setVisible (false);
        });
        kcomp5.addActionListener(e -> {
            penarikan();
            frame.setVisible (false);
        });
        kcomp6.addActionListener(e -> {
            pembayaran();
            frame.setVisible (false);
        });
        kcomp7.addActionListener(e -> {
            login();
            frame.setVisible (false);
        });
    }

    // Lihat Saldo
    private void lihatSaldo() {
        // Frame
        JFrame frame = new JFrame ("LIHAT SALDO ");
        frame.setSize(400,500);
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.setVisible (true);
        // Deklarasi
        JLabel lcomp1 = new JLabel("SALDO");
        JLabel lcomp2 = new JLabel("Sisa Saldo yang Anda Miliki adalah");
        JLabel lcomp3 = new JLabel("Sebesar :");
        JTextField lcomp4 = new JTextField(5);
        JLabel lcomp5 = new JLabel("Rp");
        JButton lcomp6 = new JButton("KEMBALI");
        JLabel lcomp7 = new JLabel("");
        lcomp4.setEditable(false);
        // Custom
        lcomp1.setFont(lcomp1.getFont().deriveFont(18.0f));
        lcomp2.setFont(lcomp2.getFont().deriveFont(14.0f));
        lcomp3.setFont(lcomp3.getFont().deriveFont(14.0f));
        lcomp5.setFont(lcomp5.getFont().deriveFont(14.0f));
        lcomp1.setForeground(Color.WHITE);
        lcomp2.setForeground(Color.WHITE);
        lcomp3.setForeground(Color.WHITE);
        lcomp5.setForeground(Color.WHITE);
        lcomp6.setForeground(Color.WHITE);
        lcomp6.setBackground(Color.RED);
        // Add Frame
        frame.add (lcomp1);
        frame.add (lcomp2);
        frame.add (lcomp3);
        frame.add (lcomp4);
        frame.add (lcomp5);
        frame.add (lcomp6);
        frame.add (lcomp7);
        // Setbounds
        lcomp1.setBounds (120, 50, 150, 25);
        lcomp2.setBounds (40, 105, 300, 25);
        lcomp3.setBounds (40, 130, 100, 25);
        lcomp4.setBounds (135, 160, 145, 25);
        lcomp5.setBounds (110, 160, 21, 25);
        lcomp6.setBounds (190, 230, 90, 25);
        lcomp7.setBounds (0, 0, 90, 25);
        // Set Background
        setLayout(new BorderLayout());
        JLabel background=new JLabel(new ImageIcon("C:\\Users\\WINDOWS 10\\Pictures\\TugasAkhirPBO\\background.PNG"));
        frame.add(background);
        background.setBounds (0, 0, 400, 500);
        // Menampilkan saldo
        double b = Sal.getSaldo();
        String a = String.valueOf(b);
        lcomp4.setText(a);
        // Fungsi Button
        lcomp6.addActionListener(e -> {
            menu();
            frame.setVisible (false);
        });
    }

    // Menu Transfer
    private void transfer() {
        // Frame
        JFrame frame = new JFrame ("TRANSFER ");
        frame.setSize(400,500);
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.setVisible (true);
        // Deklarasi
        JLabel acomp1 = new JLabel("TRANSFER");
        JLabel acomp2 = new JLabel("No Rekening          :");
        JLabel acomp3 = new JLabel("Nominal Transfer   :");
        JTextField acomp4 = new JTextField (5);
        JTextField acomp5 = new JTextField (5);
        JButton acomp6 = new JButton("TRANSFER");
        JButton acomp7 = new JButton("KEMBALI");
        JLabel acomp8 = new JLabel("");
        // Custom
        acomp1.setFont(acomp1.getFont().deriveFont(18.0f));
        acomp2.setFont(acomp2.getFont().deriveFont(14.0f));
        acomp3.setFont(acomp3.getFont().deriveFont(14.0f));
        acomp1.setForeground(Color.WHITE);
        acomp2.setForeground(Color.WHITE);
        acomp3.setForeground(Color.WHITE);
        acomp6.setForeground(Color.WHITE);
        acomp7.setForeground(Color.WHITE);
        acomp6.setBackground(Color.BLUE);
        acomp7.setBackground(Color.RED);
        // Add Frame
        frame.add (acomp1);
        frame.add (acomp2);
        frame.add (acomp3);
        frame.add (acomp4);
        frame.add (acomp5);
        frame.add (acomp6);
        frame.add (acomp7);
        frame.add (acomp8);
        // Setbounds
        acomp1.setBounds (120, 50, 120, 25);
        acomp2.setBounds (35, 115, 150, 25);
        acomp3.setBounds (35, 150, 150, 25);
        acomp4.setBounds (180, 150, 135, 25);
        acomp5.setBounds (180, 115, 135, 25);
        acomp6.setBounds (60, 235, 100, 25);
        acomp7.setBounds (205, 235, 100, 25);
        acomp8.setBounds (100, 220, 100, 25);
        // Set Background
        setLayout(new BorderLayout());
        JLabel background=new JLabel(new ImageIcon("C:\\Users\\WINDOWS 10\\Pictures\\TugasAkhirPBO\\background.PNG"));
        frame.add(background);
        background.setBounds (0, 0, 400, 500);
        // fungsi Button
        acomp6.addActionListener(e -> {
            try{
                String nom = acomp4.getText();
                String tra = acomp5.getText();
                double nomi = Double.parseDouble(nom);
                int trans = Integer.parseInt(tra);

                transaksiDetail(nomi,trans);
                frame.setVisible (false);
            } catch (NumberFormatException nfe){
                JOptionPane.showMessageDialog(null, "Format Transfer Salah");
            }
        });
        acomp7.addActionListener(e -> {
            menu();
            frame.setVisible (false);
        });
    }

    // Kondisi Transfer
    private void transaksiDetail(double nominal, int norek) {
        // Frame
        JFrame frame = new JFrame();
        frame.setTitle("INFO TRANSFER");
        frame.setSize(400,500);
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.setVisible (true);
        // Kondisi transfer
        double saldo;
        if (Sal.getSaldo() < Sal.minSaldoku) {
            System.out.println("\tMaaf Saldo Anda tidak mencukupi");
        } else {
            saldo = Sal.konSaldo(nominal);
            if (saldo < Sal.minSaldo()) {
                // Deklarasi
                JLabel bcomp1 = new JLabel("TRANSFER GAGAL");
                JLabel bcomp2 = new JLabel("Jumlah Transfer terlalu besar");
                JLabel bcomp3 = new JLabel("Sisa saldo tidak mencukupi");
                JButton bcomp4 = new JButton("KEMBALI");
                JLabel bcomp5 = new JLabel("");
                // Custom
                bcomp1.setFont(bcomp1.getFont().deriveFont(18.0f));
                bcomp2.setFont(bcomp2.getFont().deriveFont(14.0f));
                bcomp3.setFont(bcomp3.getFont().deriveFont(14.0f));
                bcomp1.setForeground(Color.WHITE);
                bcomp2.setForeground(Color.WHITE);
                bcomp3.setForeground(Color.WHITE);
                bcomp4.setForeground(Color.WHITE);
                bcomp4.setBackground(Color.RED);
                // Add frame
                frame.add (bcomp1);
                frame.add (bcomp2);
                frame.add (bcomp3);
                frame.add (bcomp4);
                frame.add (bcomp5);
                // Setbounds
                bcomp1.setBounds (95, 50, 220, 25);
                bcomp2.setBounds (75, 135, 250, 25);
                bcomp3.setBounds (85, 165, 250, 25);
                bcomp4.setBounds (125, 240, 100, 25);
                bcomp5.setBounds (30, 190, 100, 25);
                // Set Background
                setLayout(new BorderLayout());
                JLabel background=new JLabel(new ImageIcon("C:\\Users\\WINDOWS 10\\Pictures\\TugasAkhirPBO\\background.PNG"));
                frame.add(background);
                background.setBounds (0, 0, 400, 500);
                // Fungsi Button
                bcomp4.addActionListener(e -> {
                    menu();
                    frame.setVisible (false);
                });
            } else {
                Sal.setSaldo(saldo);
                // Deklarasi
                JLabel ccomp1 = new JLabel("TRANSFER BERHASIL");
                JLabel ccomp2 = new JLabel("Anda telah berhasil melakukan transfer");
                JLabel ccomp3 = new JLabel("sebesar :     Rp  ");
                JTextField ccomp4 = new JTextField(5);
                JLabel ccomp5 = new JLabel("Nomor Rekening tujuan :");
                JTextField ccomp6 = new JTextField(5);
                JButton ccomp9 = new JButton("KEMBALI");
                JLabel ccomp10 = new JLabel("");
                ccomp4.setEditable(false);
                ccomp6.setEditable(false);
                // Custom
                ccomp1.setFont(ccomp1.getFont().deriveFont(18.0f));
                ccomp2.setFont(ccomp2.getFont().deriveFont(14.0f));
                ccomp3.setFont(ccomp3.getFont().deriveFont(14.0f));
                ccomp5.setFont(ccomp5.getFont().deriveFont(14.0f));
                ccomp1.setForeground(Color.WHITE);
                ccomp2.setForeground(Color.WHITE);
                ccomp3.setForeground(Color.WHITE);
                ccomp5.setForeground(Color.WHITE);
                ccomp9.setForeground(Color.WHITE);
                ccomp9.setBackground(Color.RED);
                // Mengambil inputan
                String no,trans;
                no = String.valueOf(nominal);
                trans = String.valueOf(norek);
                ccomp4.setText(no);
                ccomp6.setText(trans);
                // Add Frame
                frame.add (ccomp1);
                frame.add (ccomp2);
                frame.add (ccomp3);
                frame.add (ccomp4);
                frame.add (ccomp5);
                frame.add (ccomp6);
                frame.add (ccomp9);
                frame.add (ccomp10);
                // Setbounds
                ccomp1.setBounds (95, 50, 200, 25);
                ccomp2.setBounds (35, 115, 300, 25);
                ccomp3.setBounds (35, 145, 120, 25);
                ccomp4.setBounds (145, 145, 165, 25);
                ccomp5.setBounds (35, 200, 200, 25);
                ccomp6.setBounds (35, 230, 280, 25);
                ccomp9.setBounds (210, 285, 100, 25);
                ccomp10.setBounds (120, 280, 100, 25);
                // Set Background
                setLayout(new BorderLayout());
                JLabel background=new JLabel(new ImageIcon("C:\\Users\\WINDOWS 10\\Pictures\\TugasAkhirPBO\\background.PNG"));
                frame.add(background);
                background.setBounds (0, 0, 400, 500);
                // Fungsi Button
                ccomp9.addActionListener(e -> {
                    menu();
                    frame.setVisible (false);
                });
            }
        }
    }

    // Pembayaran
    private void pembayaran() {
        // Frame
        JFrame frame = new JFrame ("PEMBAYARAN ");
        frame.setSize(400,500);
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.setVisible (true);
        // Deklarasi
        JLabel dcomp1 = new JLabel("PEMBAYARAN");
        JButton dcomp2 = new JButton("TAGIHAN LISTRIK");
        JButton dcomp3 = new JButton("TAGIHAN TELEPON");
        JButton dcomp4 = new JButton("KEMBALI");
        JLabel dcomp5 = new JLabel("");
        // Custom
        dcomp1.setFont(dcomp1.getFont().deriveFont(18.0f));
        dcomp1.setForeground(Color.WHITE);
        dcomp2.setForeground(Color.WHITE);
        dcomp3.setForeground(Color.WHITE);
        dcomp4.setForeground(Color.WHITE);
        dcomp2.setBackground(Color.BLUE);
        dcomp3.setBackground(Color.BLUE);
        dcomp4.setBackground(Color.RED);
        // Add Frame
        frame.add (dcomp1);
        frame.add (dcomp2);
        frame.add (dcomp3);
        frame.add (dcomp4);
        frame.add (dcomp5);
        // Setbounds
        dcomp1.setBounds (115, 35, 200, 25);
        dcomp2.setBounds (105, 105, 145, 25);
        dcomp3.setBounds (105, 150, 145, 25);
        dcomp4.setBounds (155, 215, 100, 25);
        dcomp5.setBounds (50, 250, 100, 25);
        // Set Background
        setLayout(new BorderLayout());
        JLabel background=new JLabel(new ImageIcon("C:\\Users\\WINDOWS 10\\Pictures\\TugasAkhirPBO\\background.PNG"));
        frame.add(background);
        background.setBounds (0, 0, 400, 500);
        // Fungsi Button
        dcomp2.addActionListener(e -> {
            Listrik();
            frame.setVisible (false);
        });
        dcomp3.addActionListener(e -> {
            Telepon();
            frame.setVisible (false);
        });
        dcomp4.addActionListener(e -> {
            menu();
            frame.setVisible (false);
        });
    }

    // Menu penarikan
    private void penarikan() {
        // Frame
        JFrame frame = new JFrame ("PENARIKAN");
        frame.setSize(400,500);
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.setVisible (true);
        // Deklarasi
        JLabel ecomp1 = new JLabel ("PENARIKAN TUNAI");
        JLabel ecomp2 = new JLabel ("Pilih nominal :");
        JButton ecomp3 = new JButton ("Rp. 100.000");
        JButton ecomp4 = new JButton ("Rp. 200.000");
        JButton ecomp5 = new JButton ("Rp. 500.000");
        JButton ecomp6 = new JButton ("Rp.1.000.000");
        JButton ecomp7 = new JButton ("Rp. 2.000.000");
        JButton ecomp8 = new JButton ("Penarikan jumlah Lainnya");
        JButton ecomp9 = new JButton ("Rp. 300.000");
        JButton ecomp10 = new JButton ("KEMBALI");
        JLabel ecomp11 = new JLabel ("");
        // Custom
        ecomp1.setFont(ecomp1.getFont().deriveFont(18.0f));
        ecomp2.setFont(ecomp2.getFont().deriveFont(14.0f));
        ecomp1.setForeground(Color.WHITE);
        ecomp2.setForeground(Color.WHITE);
        ecomp3.setForeground(Color.WHITE);
        ecomp4.setForeground(Color.WHITE);
        ecomp5.setForeground(Color.WHITE);
        ecomp6.setForeground(Color.WHITE);
        ecomp7.setForeground(Color.WHITE);
        ecomp8.setForeground(Color.WHITE);
        ecomp9.setForeground(Color.WHITE);
        ecomp10.setForeground(Color.WHITE);
        ecomp3.setBackground(Color.BLUE);
        ecomp4.setBackground(Color.BLUE);
        ecomp5.setBackground(Color.BLUE);
        ecomp6.setBackground(Color.BLUE);
        ecomp7.setBackground(Color.BLUE);
        ecomp8.setBackground(Color.BLUE);
        ecomp9.setBackground(Color.BLUE);
        ecomp10.setBackground(Color.RED);
        // Add Frame
        frame.add (ecomp1);
        frame.add (ecomp2);
        frame.add (ecomp3);
        frame.add (ecomp4);
        frame.add (ecomp5);
        frame.add (ecomp6);
        frame.add (ecomp7);
        frame.add (ecomp8);
        frame.add (ecomp9);
        frame.add (ecomp10);
        frame.add (ecomp11);
        // Setbounds
        ecomp1.setBounds (95, 30, 200, 25);
        ecomp2.setBounds (135, 75, 100, 25);
        ecomp3.setBounds (65, 125, 110, 25);
        ecomp4.setBounds (185, 125, 110, 25);
        ecomp5.setBounds (185, 165, 110, 25);
        ecomp6.setBounds (65, 210, 110, 25);
        ecomp7.setBounds (185, 210, 110, 25);
        ecomp8.setBounds (85, 250, 188, 25);
        ecomp9.setBounds (65, 165, 110, 25);
        ecomp10.setBounds (200, 310, 100, 25);
        ecomp11.setBounds (15, 310, 100, 25);
        // Set Background
        setLayout(new BorderLayout());
        JLabel background=new JLabel(new ImageIcon("C:\\Users\\WINDOWS 10\\Pictures\\TugasAkhirPBO\\background.PNG"));
        frame.add(background);
        background.setBounds (0, 0, 400, 500);
        // Fungsi Button
        ecomp3.addActionListener(e -> {
            tarikNominal(100000);
            frame.setVisible (false);
        });
        ecomp4.addActionListener(e -> {
            tarikNominal(200000);
            frame.setVisible (false);
        });
        ecomp5.addActionListener(e -> {
            tarikNominal(500000);
            frame.setVisible (false);
        });
        ecomp6.addActionListener(e -> {
            tarikNominal(1000000);
            frame.setVisible (false);
        });
        ecomp7.addActionListener(e -> {
            tarikNominal(2000000);
            frame.setVisible (false);
        });
        ecomp8.addActionListener(e -> {
            tarikManual();
            frame.setVisible(false);
        });
        ecomp9.addActionListener(e -> {
            tarikNominal(300000);
            frame.setVisible (false);
        });
        ecomp10.addActionListener(e -> {
            menu();
            frame.setVisible (false);
        });
    }

    // Penarikan Nominal Manual
    private void tarikManual(){
        // Frame
        JFrame frame = new JFrame ("PENARIKAN");
        frame.setSize(400,500);
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.setVisible (true);
        // Deklarasi
        JLabel gcomp1 = new JLabel ("PENARIKAN TUNAI");
        JLabel gcomp2 = new JLabel ("Masukkan Nominal :   Rp");
        JTextField gcomp3 = new JTextField (5);
        JButton gcomp4 = new JButton ("TARIK TUNAI");
        JButton gcomp5 = new JButton ("KEMBALI");
        JLabel gcomp6 = new JLabel ("");
        // Custom
        gcomp1.setFont(gcomp1.getFont().deriveFont(18.0f));
        gcomp2.setFont(gcomp2.getFont().deriveFont(14.0f));
        gcomp1.setForeground(Color.WHITE);
        gcomp2.setForeground(Color.WHITE);
        gcomp4.setForeground(Color.WHITE);
        gcomp5.setForeground(Color.WHITE);
        gcomp4.setBackground(Color.BLUE);
        gcomp5.setBackground(Color.RED);
        // Add Frame
        frame.add (gcomp1);
        frame.add (gcomp2);
        frame.add (gcomp3);
        frame.add (gcomp4);
        frame.add (gcomp5);
        frame.add (gcomp6);
        // Setbounds
        gcomp1.setBounds (110, 40, 200, 25);
        gcomp2.setBounds (20, 120, 250, 25);
        gcomp3.setBounds (205, 120, 140, 25);
        gcomp4.setBounds (45, 195, 108, 25);
        gcomp5.setBounds (195, 195, 108, 25);
        gcomp6.setBounds (80, 200, 100, 25);
        // Set Background
        setLayout(new BorderLayout());
        JLabel background=new JLabel(new ImageIcon("C:\\Users\\WINDOWS 10\\Pictures\\TugasAkhirPBO\\background.PNG"));
        frame.add(background);
        background.setBounds (0, 0, 400, 500);
        // Fungsi Button
        gcomp4.addActionListener(e -> {
            try{
                String penarikan = gcomp3.getText();
                double pen = Double.parseDouble(penarikan);
                tarikNominal(pen);
                frame.setVisible(false);
            }catch(NumberFormatException nfe){
                JOptionPane.showMessageDialog(null, "Format Nominal Salah");
            }
        });
        gcomp5.addActionListener(e -> {
            menu();
            frame.setVisible(false);
        });
    }

    // Tarik Nominal
    private void tarikNominal(double nominal) {
        // Frame
        JFrame frame = new JFrame ("INFO PENARIKAN ");
        frame.setSize(400,500);
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.setVisible (true);
        // Kondisi Penarikan
        double saldo;
        if (Sal.getSaldo() < 50000) {
            System.out.println("\tMaaf Saldo Anda tidak mencukupi.");
        } else {
            saldo = Sal.konSaldo(nominal);
            if (saldo < Sal.minSaldo()) {
                // Deklarasi
                JLabel bcomp1 = new JLabel("PENARIKAN GAGAL");
                JLabel bcomp2 = new JLabel("Jumlah Penarikan terlalu besar");
                JLabel bcomp3 = new JLabel("Sisa saldo tidak mencukupi");
                JButton bcomp4 = new JButton("KEMBALI");
                JLabel bcomp5 = new JLabel("");
                // Custom
                bcomp1.setFont(bcomp1.getFont().deriveFont(18.0f));
                bcomp2.setFont(bcomp2.getFont().deriveFont(14.0f));
                bcomp3.setFont(bcomp3.getFont().deriveFont(14.0f));
                bcomp1.setForeground(Color.WHITE);
                bcomp2.setForeground(Color.WHITE);
                bcomp3.setForeground(Color.WHITE);
                bcomp4.setForeground(Color.WHITE);
                bcomp4.setBackground(Color.RED);
                // Add Frame
                frame.add (bcomp1);
                frame.add (bcomp2);
                frame.add (bcomp3);
                frame.add (bcomp4);
                frame.add (bcomp5);
                // Setbounds
                bcomp1.setBounds (95, 50, 220, 25);
                bcomp2.setBounds (75, 135, 250, 25);
                bcomp3.setBounds (85, 165, 250, 25);
                bcomp4.setBounds (125, 240, 100, 25);
                bcomp5.setBounds (30, 190, 100, 25);
                // Set Background
                setLayout(new BorderLayout());
                JLabel background=new JLabel(new ImageIcon("C:\\Users\\WINDOWS 10\\Pictures\\TugasAkhirPBO\\background.PNG"));
                frame.add(background);
                background.setBounds (0, 0, 400, 500);
                // Fungsi Button
                bcomp4.addActionListener(e -> {
                    menu();
                    frame.setVisible (false);
                });
            } else {
                Sal.setSaldo(saldo);
                // Deklarasi
                JLabel  fcomp1 = new JLabel ("PENARIKAN BERHASIL");
                JLabel  fcomp2 = new JLabel ("Anda telah berhasil melakukan penarikan");
                JLabel  fcomp3 = new JLabel ("sebesar    :   Rp");
                JTextField fcomp4 = new JTextField (5);
                JLabel  fcomp5 = new JLabel ("Sisa saldo :   Rp");
                JTextField fcomp6 = new JTextField (5);
                JButton fcomp7 = new JButton ("KEMBALI");
                JLabel  fcomp8 = new JLabel ("");
                fcomp4.setEditable(false);
                fcomp6.setEditable(false);
                //Custom
                fcomp1.setFont(fcomp1.getFont().deriveFont(18.0f));
                fcomp2.setFont(fcomp2.getFont().deriveFont(14.0f));
                fcomp3.setFont(fcomp3.getFont().deriveFont(14.0f));
                fcomp5.setFont(fcomp5.getFont().deriveFont(14.0f));
                fcomp1.setForeground(Color.WHITE);
                fcomp2.setForeground(Color.WHITE);
                fcomp3.setForeground(Color.WHITE);
                fcomp5.setForeground(Color.WHITE);
                fcomp7.setForeground(Color.WHITE);
                fcomp7.setBackground(Color.RED);
                // Mengambil inputan
                String no,sal;
                no = String.valueOf(nominal);
                sal = String.valueOf(saldo);
                fcomp4.setText(no);
                fcomp6.setText(sal);
                // Add Frame
                frame.add (fcomp1);
                frame.add (fcomp2);
                frame.add (fcomp3);
                frame.add (fcomp4);
                frame.add (fcomp5);
                frame.add (fcomp6);
                frame.add (fcomp7);
                frame.add (fcomp8);
                // Setbounds
                fcomp1.setBounds (80, 35, 300, 25);
                fcomp2.setBounds (40, 85, 350, 25);
                fcomp3.setBounds (40, 130, 130, 25);
                fcomp4.setBounds (155, 130, 140, 25);
                fcomp5.setBounds (35, 185, 120, 25);
                fcomp6.setBounds (155, 185, 140, 25);
                fcomp7.setBounds (195, 250, 100, 25);
                fcomp8.setBounds (45, 235, 100, 25);
                // Set Background
                setLayout(new BorderLayout());
                JLabel background=new JLabel(new ImageIcon("C:\\Users\\WINDOWS 10\\Pictures\\TugasAkhirPBO\\background.PNG"));
                frame.add(background);
                background.setBounds (0, 0, 400, 500);
                // Fungsi Button
                fcomp7.addActionListener(e -> {
                    menu();
                    frame.setVisible (false);
                });
            }
        }
    }

    private void Listrik(){
        // Frame
        JFrame frame = new JFrame ("INFO PEMBAYARAN LISTRIK ");
        frame.setSize(400,500);
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.setVisible (true);
        // Deklarasi
        JLabel jcomp1 = new JLabel ("TAGIHAN LISTRIK");
        JLabel jcomp2 = new JLabel ("No Pembayaran  ");
        JTextField jcomp3 = new JTextField (5);
        JLabel jcomp4 = new JLabel ("Tanggal Pembayaran ");
        JTextField jcomp5 = new JTextField (5);
        JLabel jcomp6 = new JLabel ("Total Tagihan           Rp");
        JTextField jcomp7 = new JTextField (5);
        JButton jcomp8 = new JButton ("Bayar");
        JButton jcomp9 = new JButton ("Kembali");
        JLabel jcomp10 = new JLabel ("");
        jcomp3.setEditable(false);
        jcomp5.setEditable(false);
        jcomp7.setEditable(false);
        jcomp3.setText("AB123-C456");
        jcomp5.setText("15-12-2019");
        jcomp7.setText("180.000,0");
        // Custtom
        jcomp1.setFont(jcomp1.getFont().deriveFont(18.0f));
        jcomp2.setFont(jcomp2.getFont().deriveFont(14.0f));
        jcomp4.setFont(jcomp4.getFont().deriveFont(14.0f));
        jcomp6.setFont(jcomp6.getFont().deriveFont(14.0f));
        jcomp1.setForeground(Color.WHITE);
        jcomp2.setForeground(Color.WHITE);
        jcomp4.setForeground(Color.WHITE);
        jcomp6.setForeground(Color.WHITE);
        jcomp8.setForeground(Color.WHITE);
        jcomp9.setForeground(Color.WHITE);
        jcomp8.setBackground(Color.BLUE);
        jcomp9.setBackground(Color.RED);
        // Add Frame
        frame.add (jcomp1);
        frame.add (jcomp2);
        frame.add (jcomp3);
        frame.add (jcomp4);
        frame.add (jcomp5);
        frame.add (jcomp6);
        frame.add (jcomp7);
        frame.add (jcomp8);
        frame.add (jcomp9);
        frame.add (jcomp10);
        // Setbounds
        jcomp1.setBounds (115, 40, 200, 25);
        jcomp2.setBounds (20, 100, 124, 25);
        jcomp3.setBounds (195, 100, 125, 25);
        jcomp4.setBounds (20, 130, 200, 25);
        jcomp5.setBounds (195, 130, 125, 25);
        jcomp6.setBounds (20, 175, 200, 25);
        jcomp7.setBounds (195, 175, 125, 25);
        jcomp8.setBounds (35, 260, 100, 25);
        jcomp9.setBounds (185, 260, 100, 25);
        jcomp10.setBounds (105, 260, 100, 25);
        // Set Background
        setLayout(new BorderLayout());
        JLabel background=new JLabel(new ImageIcon("C:\\Users\\WINDOWS 10\\Pictures\\TugasAkhirPBO\\background.PNG"));
        frame.add(background);
        background.setBounds (0, 0, 400, 500);
        // Fungsi Button
        jcomp8.addActionListener(e -> {
            transaksiDetail(180000);
            frame.setVisible(false);
        });
        jcomp9.addActionListener(e -> {
            menu();
            frame.setVisible(false);
        });
    }

    private void Telepon(){
        // Frame
        JFrame frame = new JFrame ("INFO PEMBAYARAN TELEPON ");
        frame.setSize(400,500);
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.setVisible (true);
        // Deklarasi
        JLabel jcomp1 = new JLabel ("TAGIHAN TELEPON");
        JLabel jcomp2 = new JLabel ("No Pembayaran  ");
        JTextField jcomp3 = new JTextField (5);
        JLabel jcomp4 = new JLabel ("Tanggal Pembayaran ");
        JTextField jcomp5 = new JTextField (5);
        JLabel jcomp6 = new JLabel ("Total Tagihan           Rp");
        JTextField jcomp7 = new JTextField (5);
        JButton jcomp8 = new JButton ("Bayar");
        JButton jcomp9 = new JButton ("Kembali");
        JLabel jcomp10 = new JLabel ("");
        jcomp3.setEditable(false);
        jcomp5.setEditable(false);
        jcomp7.setEditable(false);
        jcomp3.setText("0855356324");
        jcomp5.setText("15-12-2019");
        jcomp7.setText("250.000,0");
        // Custtom
        jcomp1.setFont(jcomp1.getFont().deriveFont(18.0f));
        jcomp2.setFont(jcomp2.getFont().deriveFont(14.0f));
        jcomp4.setFont(jcomp4.getFont().deriveFont(14.0f));
        jcomp6.setFont(jcomp6.getFont().deriveFont(14.0f));
        jcomp1.setForeground(Color.WHITE);
        jcomp2.setForeground(Color.WHITE);
        jcomp4.setForeground(Color.WHITE);
        jcomp6.setForeground(Color.WHITE);
        jcomp8.setForeground(Color.WHITE);
        jcomp9.setForeground(Color.WHITE);
        jcomp8.setBackground(Color.BLUE);
        jcomp9.setBackground(Color.RED);
        // Add Frame
        frame.add (jcomp1);
        frame.add (jcomp2);
        frame.add (jcomp3);
        frame.add (jcomp4);
        frame.add (jcomp5);
        frame.add (jcomp6);
        frame.add (jcomp7);
        frame.add (jcomp8);
        frame.add (jcomp9);
        frame.add (jcomp10);
        // Setbounds
        jcomp1.setBounds (115, 40, 200, 25);
        jcomp2.setBounds (20, 100, 124, 25);
        jcomp3.setBounds (195, 100, 125, 25);
        jcomp4.setBounds (20, 130, 200, 25);
        jcomp5.setBounds (195, 130, 125, 25);
        jcomp6.setBounds (20, 175, 200, 25);
        jcomp7.setBounds (195, 175, 125, 25);
        jcomp8.setBounds (35, 260, 100, 25);
        jcomp9.setBounds (185, 260, 100, 25);
        jcomp10.setBounds (105, 260, 100, 25);
        // Set Background
        setLayout(new BorderLayout());
        JLabel background=new JLabel(new ImageIcon("C:\\Users\\WINDOWS 10\\Pictures\\TugasAkhirPBO\\background.PNG"));
        frame.add(background);
        background.setBounds (0, 0, 400, 500);
        // Fungsi Button
        jcomp8.addActionListener(e -> {
            transaksiDetail(250000);
            frame.setVisible(false);
        });
        jcomp9.addActionListener(e -> {
            menu();
            frame.setVisible(false);
        });
    }

    private void transaksiDetail(double tagihan){
        // Frame
        JFrame frame = new JFrame ("INFO PEMBAYARAN ");
        frame.setSize(400,500);
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.setVisible (true);
        // Kondisi Penarikan
        double saldo;
        if (Sal.getSaldo() < 50000) {
            System.out.println("\tMaaf Saldo Anda tidak mencukupi.");
        } else {
            saldo = Sal.konSaldo(tagihan);
            if (saldo < Sal.minSaldo()) {
                // Deklarasi
                JLabel bcomp1 = new JLabel("PEMBAYARAN GAGAL");
                JLabel bcomp2 = new JLabel("Jumlah pembayaran terlalu besar");
                JLabel bcomp3 = new JLabel("Sisa saldo tidak mencukupi");
                JButton bcomp4 = new JButton("KEMBALI");
                JLabel bcomp5 = new JLabel("");
                // Custom
                bcomp1.setFont(bcomp1.getFont().deriveFont(18.0f));
                bcomp2.setFont(bcomp2.getFont().deriveFont(14.0f));
                bcomp3.setFont(bcomp3.getFont().deriveFont(14.0f));
                bcomp1.setForeground(Color.WHITE);
                bcomp2.setForeground(Color.WHITE);
                bcomp3.setForeground(Color.WHITE);
                bcomp4.setForeground(Color.WHITE);
                bcomp4.setBackground(Color.RED);
                // Add Frame
                frame.add (bcomp1);
                frame.add (bcomp2);
                frame.add (bcomp3);
                frame.add (bcomp4);
                frame.add (bcomp5);
                // Setbounds
                bcomp1.setBounds (95, 50, 220, 25);
                bcomp2.setBounds (75, 135, 250, 25);
                bcomp3.setBounds (85, 165, 250, 25);
                bcomp4.setBounds (125, 240, 100, 25);
                bcomp5.setBounds (30, 190, 100, 25);
                // Set Background
                setLayout(new BorderLayout());
                JLabel background=new JLabel(new ImageIcon("C:\\Users\\WINDOWS 10\\Pictures\\TugasAkhirPBO\\background.PNG"));
                frame.add(background);
                background.setBounds (0, 0, 400, 500);
                // Fungsi Button
                bcomp4.addActionListener(e -> {
                    menu();
                    frame.setVisible (false);
                });
            } else {
                Sal.setSaldo(saldo);
                // Deklarasi
                JLabel  fcomp1 = new JLabel ("PEMBAYARAN BERHASIL");
                JLabel  fcomp2 = new JLabel ("Anda telah berhasil melakukan pembayaran");
                JLabel  fcomp3 = new JLabel ("sebesar    :   Rp");
                JTextField fcomp4 = new JTextField (5);
                JLabel  fcomp5 = new JLabel ("Sisa saldo :   Rp");
                JTextField fcomp6 = new JTextField (5);
                JButton fcomp7 = new JButton ("KEMBALI");
                JLabel  fcomp8 = new JLabel ("");
                fcomp4.setEditable(false);
                fcomp6.setEditable(false);
                //Custom
                fcomp1.setFont(fcomp1.getFont().deriveFont(18.0f));
                fcomp2.setFont(fcomp2.getFont().deriveFont(14.0f));
                fcomp3.setFont(fcomp3.getFont().deriveFont(14.0f));
                fcomp5.setFont(fcomp5.getFont().deriveFont(14.0f));
                fcomp1.setForeground(Color.WHITE);
                fcomp2.setForeground(Color.WHITE);
                fcomp3.setForeground(Color.WHITE);
                fcomp5.setForeground(Color.WHITE);
                fcomp7.setForeground(Color.WHITE);
                fcomp7.setBackground(Color.RED);
                // Mengambil inputan
                String no,sal;
                no = String.valueOf(tagihan);
                sal = String.valueOf(saldo);
                fcomp4.setText(no);
                fcomp6.setText(sal);
                // Add Frame
                frame.add (fcomp1);
                frame.add (fcomp2);
                frame.add (fcomp3);
                frame.add (fcomp4);
                frame.add (fcomp5);
                frame.add (fcomp6);
                frame.add (fcomp7);
                frame.add (fcomp8);
                // Setbounds
                fcomp1.setBounds (80, 35, 300, 25);
                fcomp2.setBounds (40, 85, 350, 25);
                fcomp3.setBounds (40, 130, 130, 25);
                fcomp4.setBounds (155, 130, 140, 25);
                fcomp5.setBounds (35, 185, 120, 25);
                fcomp6.setBounds (155, 185, 140, 25);
                fcomp7.setBounds (195, 250, 100, 25);
                fcomp8.setBounds (45, 235, 100, 25);
                // Set Background
                setLayout(new BorderLayout());
                JLabel background=new JLabel(new ImageIcon("C:\\Users\\WINDOWS 10\\Pictures\\TugasAkhirPBO\\background.PNG"));
                frame.add(background);
                background.setBounds (0, 0, 400, 500);
                // Fungsi Button
                fcomp7.addActionListener(e -> {
                    menu();
                    frame.setVisible (false);
                });
            }
        }
    }
}