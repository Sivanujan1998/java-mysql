import javax.swing.*;
import java.sql.*;
import java.util.Scanner;
public class UMS {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        while (2 > 1) {
            System.out.println("select , [1] sign up, [2] sing in");
            int x;
            x = in.nextInt();
            if (x == 2) {
                System.out.println("plese select your registration role [1] lecturer, [2] Student");
                int bb = in.nextInt();
                if (bb == 2) {
                    System.out.println("**** student login form****\n\n");
                    String na, un;
                    int p, a, y;
                    System.out.println("User name:");
                    un = in.next();
                    System.out.println("Password :");
                    p = in.nextInt();
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/siva", "root", "@Sivanu1998");
                        Statement stmt = con.createStatement();
                        ResultSet rs = stmt.executeQuery("select *from studetail");

                        while (rs.next()) {
                            String usernamedata=rs.getString("username");
                            int pasworddata=rs.getInt("password");
if(un.equals(usernamedata)    &&   p ==(pasworddata))
{ System.out.println("name:" + rs.getString(1) + " " + "\n" + "user name:" + rs.getString(2) + " " + "\n" + "password:" + rs.getInt(3) + "\n" + "age:" + rs.getInt(4) + "\n" + "course:" + rs.getString(5) + " " + "\n");}
                     else {System.out.println("not matching !!! username and password");} }
                        con.close();
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                } else {
                    System.out.println("**** lecturer login form****\n\n");
                    String na, un;
                    int p, a, y;
                    System.out.println("User name:");
                    un = in.next();
                    System.out.println("Password :");
                    p = in.nextInt();


                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/siva", "root", "12345678");
                        Statement stmt = con.createStatement();
                        ResultSet rs = stmt.executeQuery("select *from lecdetail");

                        while (rs.next()) {
                            String usernamedata=rs.getString("username");
                            int pasworddata=rs.getInt("password");
                            if(un.equals(usernamedata)    &&   p ==(pasworddata))
                            { System.out.println("name:" + rs.getString(1) + " " + "\n" + "user name:" + rs.getString(2) + " " + "\n" + "password:" + rs.getInt(3) + "\n" + "age:" + rs.getInt(4) + "\n" + "course:" + rs.getString(5) + " " + "\n");}
                            else {System.out.println("not matching !!! username and password");} }
                        con.close();
                    } catch (Exception e) {
                        System.out.println(e);
                    }


                }
            } else if (x == 1) {
                System.out.println("please select your registration role [1] lecturer, [2] Student");
                int aa;
                aa = in.nextInt();
                if (aa == 2) {
                    System.out.println("**** student registration form****\n\n");
                    String na, un;
                    int p, a, y;
                    System.out.println("Name:");
                    na = input.nextLine();
                    System.out.println("User name:");
                    un = in.next();
                    System.out.println("Password :");
                    p = in.nextInt();
                    System.out.println("age:");
                    a = in.nextInt();

                    System.out.println("[1] SENG 11111 - object oriented programming");
                    System.out.println("[2] SENG 11111 - Introduction to databases");
                    System.out.println("[3] SENG 11111 - Project Management");
                    int z;
                    z = in.nextInt();
                    System.out.println("you have Successfully registered the following courses :");
                    String ss = null;
                    switch (z) {
                        case 1:
                            System.out.println("SENG 11111 - object oriented programming");
                            ss = "SENG 11111 - object oriented programming";
                            break;

                        case 2:
                            System.out.println("SENG 11111 - Introduction to databases");
                            ss = "SENG 11112 - Introduction to databases";
                            break;

                        case 3:
                            System.out.println("SENG 11111 - Project Management");
                            ss = "SENG 11123 - Project Management";
                            break;

                        default:
                            System.out.println("incorrect input !!!!!!!!!!!");
                            break;

                    }
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/siva", "root", "12345678");
                        Statement stmt = con.createStatement();

                        int rs = stmt.executeUpdate("insert into studetail(name,username,password,age,course) values('" + na + "','" + un + "','" + p + "'," + a + ",'" + ss + "')");
                        con.close();
                    } catch (Exception e) {
                        System.out.println(e);
                    }


                    System.out.println("thank you!!!");
                } else {
                    System.out.println("**** lecturer registration form****\n\n");
                    String na, un;
                    int p, a, y;
                    System.out.println("Name:");
                    na = input.nextLine();
                    System.out.println("User name:");
                    un = in.next();
                    System.out.println("Password :");
                    p = in.nextInt();
                    System.out.println("age:");
                    a = in.nextInt();

                    System.out.println("[1] SENG 11111 - object oriented programming");
                    System.out.println("[2] SENG 11111 - Introduction to databases");
                    System.out.println("[3] SENG 11111 - Project Management");
                    int z;
                    z = in.nextInt();
                    System.out.println("you have Successfully registered the following courses :");
                    String ss = null;
                    switch (z) {
                        case 1:
                            System.out.println("SENG 11111 - object oriented programming");
                            ss = "SENG 11111 - object oriented programming";
                            break;

                        case 2:
                            System.out.println("SENG 11111 - Introduction to databases");
                            ss = "SENG 11112 - Introduction to databases";
                            break;

                        case 3:
                            System.out.println("SENG 11111 - Project Management");
                            ss = "SENG 11123 - Project Management";
                            break;

                        default:
                            System.out.println("incorrect input !!!!!!!!!!!");
                            break;

                    }

                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/siva", "root", "@Sivanu1998");
                        Statement stmt = con.createStatement();
                        int rs = stmt.executeUpdate("insert into lecdetail(name,username,password,age,course) values('" + na + "','" + un + "','" + p + "','" + a + "','" + ss + "')");
                        con.close();
                    } catch (Exception e) {
                        System.out.println(e);
                    }

                    System.out.println("thank you!!!");
                }


            } else {
                System.out.println("incorrect input !!!!!!!!!!!");

            }

            System.out.println("please  select a option,");
            System.out.println("[1] exit");
            System.out.println("[2]  **MENU**");
            int q = in.nextInt();
            if (q == 1) {
                break;

            } else {
                continue;
            }
        }
    }
}



