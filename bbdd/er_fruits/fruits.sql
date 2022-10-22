create table fruit (
    id int not null auto_increment primary key,
    name varchar(255) not null
);

create table tree (
    id int not null auto_increment primary key,
    name varchar(255) not null,
    fruit_id int not null,
    foreign key (fruit_id) references fruit(id)
);

create table variety (
    id int not null auto_increment primary key,
    name varchar(255) not null,
    fruit_id int not null,
    foreign key (fruit_id) references fruit(id)
);

create table parcel (
    id int not null auto_increment primary key,
    name varchar(255) not null,
    surface int not null,
    number_of_trees int not null
);

create table comb_fruit_variety (
    id int not null auto_increment primary key,
    fruit_id int not null,
    variety_id int not null,
    foreign key (fruit_id) references fruit(id),
    foreign key (variety_id) references variety(id)
);

create table parcel_has_comb (
    parcel_id int not null,
    comb_id int not null,
    foreign key (parcel_id) references parcel(id),
    foreign key (comb_id) references comb_fruit_variety(id)
);

create table employee (
    id int not null auto_increment primary key,
    name varchar(255) not null,
    birth_date date not null
);

create table harvest (
    parcel_id int not null,
    employee_id int not null,
    quantity int not null,
    date date not null,
    foreign key (parcel_id) references parcel(id),
    foreign key (employee_id) references employee(id)
);

insert into fruit (name) values ('apple');
insert into fruit (name) values ('pear');
insert into fruit (name) values ('cherry');

insert into tree (name, fruit_id) values ('apple tree', 1);
insert into tree (name, fruit_id) values ('pear tree', 2);
insert into tree (name, fruit_id) values ('cherry tree', 3);

insert into variety (name, fruit_id) values ('golden apple', 1);
insert into variety (name, fruit_id) values ('red apple', 1);
insert into variety (name, fruit_id) values ('green apple', 1);
insert into variety (name, fruit_id) values ('yellow pear', 2);
insert into variety (name, fruit_id) values ('ercoline pear', 2);
insert into variety (name, fruit_id) values ('black cherry', 3);
insert into variety (name, fruit_id) values ('red cherry', 3);

insert into parcel (name, surface, number_of_trees) values ('parcel 1', 100, 100);
insert into parcel (name, surface, number_of_trees) values ('parcel 2', 250, 250);
insert into parcel (name, surface, number_of_trees) values ('parcel 3', 300, 300);
insert into parcel (name, surface, number_of_trees) values ('parcel 4', 400, 400);
insert into parcel (name, surface, number_of_trees) values ('parcel 5', 400, 400);
insert into parcel (name, surface, number_of_trees) values ('parcel 6', 400, 400);
insert into parcel (name, surface, number_of_trees) values ('parcel 7', 400, 400);

insert into comb_fruit_variety (fruit_id, variety_id) values (1, 1);
insert into comb_fruit_variety (fruit_id, variety_id) values (1, 2);
insert into comb_fruit_variety (fruit_id, variety_id) values (1, 3);
insert into comb_fruit_variety (fruit_id, variety_id) values (2, 4);
insert into comb_fruit_variety (fruit_id, variety_id) values (2, 5);
insert into comb_fruit_variety (fruit_id, variety_id) values (3, 6);
insert into comb_fruit_variety (fruit_id, variety_id) values (3, 7);

insert into parcel_has_comb (parcel_id, comb_id) values (1, 1);
insert into parcel_has_comb (parcel_id, comb_id) values (2, 2);
insert into parcel_has_comb (parcel_id, comb_id) values (3, 3);
insert into parcel_has_comb (parcel_id, comb_id) values (4, 4);
insert into parcel_has_comb (parcel_id, comb_id) values (5, 5);
insert into parcel_has_comb (parcel_id, comb_id) values (6, 6);
insert into parcel_has_comb (parcel_id, comb_id) values (7, 7);

insert into employee (name, birth_date) values ('employee 1', '1980-01-01');
insert into employee (name, birth_date) values ('employee 2', '1980-01-01');
insert into employee (name, birth_date) values ('employee 3', '1980-01-01');

insert into harvest (parcel_id, employee_id, quantity, date) values (1, 1, 100, '2022-10-22');
insert into harvest (parcel_id, employee_id, quantity, date) values (2, 1, 100, '2022-10-22');
insert into harvest (parcel_id, employee_id, quantity, date) values (1, 2, 100, '2022-10-22');
insert into harvest (parcel_id, employee_id, quantity, date) values (2, 2, 100, '2022-10-22');
insert into harvest (parcel_id, employee_id, quantity, date) values (3, 3, 100, '2022-10-22');
insert into harvest (parcel_id, employee_id, quantity, date) values (4, 1, 100, '2022-10-22');
insert into harvest (parcel_id, employee_id, quantity, date) values (5, 3, 100, '2022-10-22');
insert into harvest (parcel_id, employee_id, quantity, date) values (6, 2, 100, '2022-10-22');
insert into harvest (parcel_id, employee_id, quantity, date) values (7, 3, 100, '2022-10-22');
