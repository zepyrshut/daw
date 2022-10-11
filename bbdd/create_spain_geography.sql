create table aut_region (
    id int(2) primary key auto_increment,
    name varchar(50)
);

create table province (
    id int(2) primary key  auto_increment,
    name varchar(20),
    capital varchar(40),
    population int(7),
    coast boolean,
    surface int(4),
    aut_region_id int(2),
    foreign key (aut_region_id) references aut_region (id)
);

create table river (
    id int(2) primary key auto_increment,
    name varchar(15),
    length int(4),
    sea varchar(12)
);

create table province_has_river (
    province_id int(2),
    river_id int(2),
    river_order int(2),
    foreign key (province_id) references province (id),
    foreign key (river_id) references river (id)
);

create table mountain (
    id int(2) primary key auto_increment,
    name varchar(40),
    mountain_height int(4)
);

create table province_has_mountain (
    province_id int(2),
    mountain_id int(2),
    foreign key (province_id) references province(id),
    foreign key (mountain_id) references mountain(id)
)

