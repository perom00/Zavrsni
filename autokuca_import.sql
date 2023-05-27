-- c:\xampp\mysql\bin\mysql -uroot --default_character_set=utf8 < C:\Users\Petar\Desktop\zavrsni\autokuca_import.sql

drop database if EXISTS autokuca_import;
CREATE database autokuca_import;
use autokuca_import;

CREATE table kupac(
    sifra int not null PRIMARY key auto_increment,
    budzet decimal(7.2),
    ime varchar(50),
    prezime varchar(50)
);

CREATE table prodajno_mjesto(
    sifra int not null primary key auto_increment,
    naziv varchar(50) not null,
    adresa varchar(50) not null,
    prodavac int 
);

CREATE table prodavac(
    sifra int not null primary key auto_increment,
    ime VARCHAR(50) not null,
    prezime varchar(50) not null
);

CREATE table racun(
    kupac int,
    vozilo INT,
    prodavac INT
);

CREATE table vozilo(
    sifra int not null PRIMARY key auto_increment,
    cijena decimal(7.2) not null,
    prodajno_mjesto int
);

alter table prodajno_mjesto add FOREIGN key(prodavac) REFERENCES prodavac(sifra);
alter table racun add FOREIGN key(kupac) REFERENCES kupac(sifra);
alter table racun add foreign key(vozilo) REFERENCES vozilo(sifra);
alter table racun add FOREIGN key(prodavac) REFERENCES prodavac(sifra);
alter table vozilo add FOREIGN key(prodajno_mjesto) REFERENCES prodajno_mjesto(sifra);

insert into kupac(budzet,ime,prezime) values('10000','Marko','Horvat');
INSERT into prodavac(ime,prezime) values('Stjepan','Martinov');
INSERT into prodajno_mjesto(naziv,adresa,prodavac) values('Autokuća Import','Industrijska zona 35 Osijek',1);
insert into vozilo(cijena,prodajno_mjesto) values('9800',1);
INSERT into racun(kupac,vozilo,prodavac) values(1,1,1);