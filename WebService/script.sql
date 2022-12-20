create database sync;
alter database sync owner to dev;

sync

dev
123


create table Personne(
    idPersonne serial primary key,
    nom varchar(60),
    prenom varchar(60),
    age smallint
);
insert into Personne(nom,prenom,age) values
('Jean','William',34),
('Kikoo','Benet',32),
('John','Friedrich',31);