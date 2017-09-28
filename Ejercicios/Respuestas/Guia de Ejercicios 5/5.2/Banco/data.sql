Windows PowerShell
Copyright (C) 2015 Microsoft Corporation. Todos los derechos reservados.

PS C:\Users\alumno> cd c:\xampp\mysql\bin
PS C:\xampp\mysql\bin> .\mysql.exe -u admin01 -p
Enter password: *****
Welcome to the MariaDB monitor.  Commands end with ; or \g.
Your MariaDB connection id is 23
Server version: 10.1.24-MariaDB mariadb.org binary distribution

Copyright (c) 2000, 2017, Oracle, MariaDB Corporation Ab and others.

Type 'help;' or '\h' for help. Type '\c' to clear the current input statement.

MariaDB [(none)]> USE Customers;
Database changed
MariaDB [Customers]> DESCRIBE customers;
+------------+--------------+------+-----+---------+-------+
| Field      | Type         | Null | Key | Default | Extra |
+------------+--------------+------+-----+---------+-------+
| first_name | varchar(128) | YES  |     | NULL    |       |
+------------+--------------+------+-----+---------+-------+
1 row in set (0.01 sec)

MariaDB [Customers]> ALTER TABLE Customers ADD acc_pesos DECIMAL(12,1);
Query OK, 0 rows affected (3.10 sec)
Records: 0  Duplicates: 0  Warnings: 0

MariaDB [Customers]> ALTER TABLE Customers ADD acc_dolar DECIMAL(12,1);
Query OK, 0 rows affected (0.56 sec)
Records: 0  Duplicates: 0  Warnings: 0

MariaDB [Customers]> ALTER TABLE Customers ADD user_key VARCHAR(128);
Query OK, 0 rows affected (1.52 sec)
Records: 0  Duplicates: 0  Warnings: 0

MariaDB [Customers]> ALTER TABLE Customers ADD old_keys VARCHAR(128);
Query OK, 0 rows affected (0.48 sec)
Records: 0  Duplicates: 0  Warnings: 0

MariaDB [Customers]> DESCRIBE Customers;
+------------+---------------+------+-----+---------+-------+
| Field      | Type          | Null | Key | Default | Extra |
+------------+---------------+------+-----+---------+-------+
| first_name | varchar(128)  | YES  |     | NULL    |       |
| acc_pesos  | decimal(12,1) | YES  |     | NULL    |       |
| acc_dolar  | decimal(12,1) | YES  |     | NULL    |       |
| user_key   | varchar(128)  | YES  |     | NULL    |       |
| old_keys   | varchar(128)  | YES  |     | NULL    |       |
+------------+---------------+------+-----+---------+-------+
5 rows in set (0.01 sec)

MariaDB [Customers]> DELETE FROM Customers WHERE first_name = 'Esteban';
Query OK, 1 row affected (0.48 sec)

MariaDB [Customers]> INSERT INTO Customers(first_name, acc_pesos, acc_dolar, user_key, old_keys)
    -> VALUES('Esteban Borai', 10.000, 200, 'E092MMmme0', '78275,32JDKjwwhv');
Query OK, 1 row affected (0.42 sec)

MariaDB [Customers]> INSERT INTO Customers(first_name, acc_pesos, acc_dolar, user_key, old_keys)
    -> VALUES('Miguel Magnante', 10000, 200, 'E092MMmme0', '78275,32JDKjwwhv');
Query OK, 1 row affected (0.67 sec)

MariaDB [Customers]> SELECT * FROM Customers;
+-----------------+-----------+-----------+------------------------------+------------------+
| first_name      | acc_pesos | acc_dolar | user_key                     | old_keys         |
+-----------------+-----------+-----------+------------------------------+------------------+
| Esteban Borai   |      10.0 |     200.0 | E092MMmme0                   | 78275,32JDKjwwhv |
| Miguel Magnante |   10000.0 |     200.0 | E092MMmme0                   | 78275,32JDKjwwhv |
| Mau             |   20029.0 |      29.0 | [Ljava.lang.String;@27fa135a | NULL             |
| Mau             |   20029.0 |      29.0 | [Ljava.lang.String;@27fa135a | NULL             |
+-----------------+-----------+-----------+------------------------------+------------------+
4 rows in set (0.00 sec)

MariaDB [Customers]> VALUES('Miguel Magnante', 10000, 200, 'E092MMmme0', '78275,32JDKjwwhv');
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MariaDB server version for the right syntax to use near 'VALUES('Miguel Magnante', 10000, 200, 'E092MMmme0', '78275,32JDKjwwhv')' at line 1
MariaDB [Customers]> SELECT * FROM Customers;
+-----------------+-----------+-----------+------------------------------+------------------+
| first_name      | acc_pesos | acc_dolar | user_key                     | old_keys         |
+-----------------+-----------+-----------+------------------------------+------------------+
| Esteban Borai   |      10.0 |     200.0 | E092MMmme0                   | 78275,32JDKjwwhv |
| Miguel Magnante |   10000.0 |     200.0 | E092MMmme0                   | 78275,32JDKjwwhv |
| Mau             |   20029.0 |      29.0 | [Ljava.lang.String;@27fa135a | NULL             |
| Mau             |   20029.0 |      29.0 | [Ljava.lang.String;@27fa135a | NULL             |
| Mau             |   20029.0 |      29.0 | 12345                        | NULL             |
+-----------------+-----------+-----------+------------------------------+------------------+
5 rows in set (0.00 sec)

MariaDB [Customers]> ALTER TABLE Customers ADD user_id INT UNSIGNED NOT NULL AUTO_INCREMENT KEY;
Query OK, 0 rows affected (0.75 sec)
Records: 0  Duplicates: 0  Warnings: 0

MariaDB [Customers]> SELECT * FROM Customers;
+-----------------+-----------+-----------+------------------------------+------------------+---------+
| first_name      | acc_pesos | acc_dolar | user_key                     | old_keys         | user_id |
+-----------------+-----------+-----------+------------------------------+------------------+---------+
| Esteban Borai   |      10.0 |     200.0 | E092MMmme0                   | 78275,32JDKjwwhv |       1 |
| Miguel Magnante |   10000.0 |     200.0 | E092MMmme0                   | 78275,32JDKjwwhv |       2 |
| Mau             |   20029.0 |      29.0 | [Ljava.lang.String;@27fa135a | NULL             |       3 |
| Mau             |   20029.0 |      29.0 | [Ljava.lang.String;@27fa135a | NULL             |       4 |
| Mau             |   20029.0 |      29.0 | 12345                        | NULL             |       5 |
| Mau             |   20029.0 |      29.0 | 12345                        | NULL             |       6 |
| Mau             |   20029.0 |      29.0 | 12345                        | NULL             |       7 |
| Mau             |   20029.0 |      29.0 | 12345                        | NULL             |       8 |
| Qwerty1         |   20029.0 |      29.0 | 12345                        | NULL             |       9 |
| Qwerty1         |   20029.0 |      29.0 | 12345                        | NULL             |      10 |
| Qwerty2         |   20029.0 |      29.0 | 12345                        | NULL             |      11 |
| Qwerty3         |   20029.0 |      29.0 | 12345                        | NULL             |      12 |
| Qwerty4         |   20029.0 |      29.0 | 12345                        | NULL             |      13 |
| Qwerty5         |   20029.0 |      29.0 | 12345                        | NULL             |      14 |
+-----------------+-----------+-----------+------------------------------+------------------+---------+
14 rows in set (0.00 sec)

MariaDB [Customers]>
